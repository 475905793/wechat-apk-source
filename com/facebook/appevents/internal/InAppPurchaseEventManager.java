package com.facebook.appevents.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class InAppPurchaseEventManager
{
  private static final String AS_INTERFACE = "asInterface";
  private static final int CACHE_CLEAR_TIME_LIMIT_SEC = 604800;
  private static final String DETAILS_LIST = "DETAILS_LIST";
  private static final String GET_PURCHASES = "getPurchases";
  private static final String GET_PURCHASE_HISTORY = "getPurchaseHistory";
  private static final String GET_SKU_DETAILS = "getSkuDetails";
  private static final String INAPP = "inapp";
  private static final String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
  private static final String INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
  private static final String IN_APP_BILLING_SERVICE = "com.android.vending.billing.IInAppBillingService";
  private static final String IN_APP_BILLING_SERVICE_STUB = "com.android.vending.billing.IInAppBillingService$Stub";
  private static final String IS_BILLING_SUPPORTED = "isBillingSupported";
  private static final String ITEM_ID_LIST = "ITEM_ID_LIST";
  private static final String LAST_CLEARED_TIME = "LAST_CLEARED_TIME";
  private static final String LAST_LOGGED_TIME_SEC = "LAST_LOGGED_TIME_SEC";
  private static final int MAX_QUERY_PURCHASE_NUM = 30;
  private static final String PACKAGE_NAME;
  private static final int PURCHASE_EXPIRE_TIME_SEC = 43200;
  private static final String PURCHASE_INAPP_STORE = "com.facebook.internal.PURCHASE";
  private static final int PURCHASE_STOP_QUERY_TIME_SEC = 1200;
  private static final String PURCHASE_SUBS_STORE = "com.facebook.internal.PURCHASE_SUBS";
  private static final String RESPONSE_CODE = "RESPONSE_CODE";
  private static final String SKU_DETAILS_STORE = "com.facebook.internal.SKU_DETAILS";
  private static final int SKU_DETAIL_EXPIRE_TIME_SEC = 43200;
  private static final String SUBSCRIPTION = "subs";
  private static final long SUBSCRIPTION_HARTBEAT_INTERVAL = 86400L;
  private static final String TAG;
  private static final HashMap<String, Class<?>> classMap;
  private static final HashMap<String, Method> methodMap;
  private static final SharedPreferences purchaseInappSharedPrefs;
  private static final SharedPreferences purchaseSubsSharedPrefs;
  private static final SharedPreferences skuDetailSharedPrefs;

  static
  {
    AppMethodBeat.i(72210);
    TAG = InAppPurchaseEventManager.class.getCanonicalName();
    methodMap = new HashMap();
    classMap = new HashMap();
    PACKAGE_NAME = FacebookSdk.getApplicationContext().getPackageName();
    skuDetailSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    purchaseInappSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
    purchaseSubsSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE_SUBS", 0);
    AppMethodBeat.o(72210);
  }

  public static Object asInterface(Context paramContext, IBinder paramIBinder)
  {
    AppMethodBeat.i(72192);
    paramContext = invokeMethod(paramContext, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[] { paramIBinder });
    AppMethodBeat.o(72192);
    return paramContext;
  }

  public static void clearSkuDetailsCache()
  {
    AppMethodBeat.i(72209);
    long l1 = System.currentTimeMillis() / 1000L;
    long l2 = skuDetailSharedPrefs.getLong("LAST_CLEARED_TIME", 0L);
    if (l2 == 0L)
    {
      skuDetailSharedPrefs.edit().putLong("LAST_CLEARED_TIME", l1).apply();
      AppMethodBeat.o(72209);
    }
    while (true)
    {
      return;
      if (l1 - l2 > 604800L)
        skuDetailSharedPrefs.edit().clear().putLong("LAST_CLEARED_TIME", l1).apply();
      AppMethodBeat.o(72209);
    }
  }

  private static ArrayList<String> filterPurchasesInapp(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(72205);
    ArrayList localArrayList = new ArrayList();
    SharedPreferences.Editor localEditor = purchaseInappSharedPrefs.edit();
    long l1 = System.currentTimeMillis() / 1000L;
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str1 = (String)paramArrayList.next();
      try
      {
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(str1);
        String str2 = ((JSONObject)localObject).getString("productId");
        long l2 = ((JSONObject)localObject).getLong("purchaseTime");
        localObject = ((JSONObject)localObject).getString("purchaseToken");
        if ((l1 - l2 / 1000L <= 43200L) && (!purchaseInappSharedPrefs.getString(str2, "").equals(localObject)))
        {
          localEditor.putString(str2, (String)localObject);
          localArrayList.add(str1);
        }
      }
      catch (JSONException localJSONException)
      {
      }
    }
    localEditor.apply();
    AppMethodBeat.o(72205);
    return localArrayList;
  }

  private static Class<?> getClass(Context paramContext, String paramString)
  {
    AppMethodBeat.i(72207);
    Object localObject = (Class)classMap.get(paramString);
    if (localObject != null)
      AppMethodBeat.o(72207);
    while (true)
    {
      return localObject;
      try
      {
        paramContext = paramContext.getClassLoader().loadClass(paramString);
        localObject = paramContext;
        classMap.put(paramString, paramContext);
        localObject = paramContext;
        AppMethodBeat.o(72207);
      }
      catch (ClassNotFoundException paramContext)
      {
        while (true)
          new StringBuilder().append(paramString).append(" is not available, please add ").append(paramString).append(" to the project.");
      }
    }
  }

  private static Method getMethod(Class<?> paramClass, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(72206);
    Method localMethod = (Method)methodMap.get(paramString);
    Object localObject1;
    if (localMethod != null)
    {
      AppMethodBeat.o(72206);
      localObject1 = localMethod;
    }
    while (true)
    {
      return localObject1;
      Object localObject2 = null;
      localObject1 = localMethod;
      try
      {
        switch (paramString.hashCode())
        {
        default:
          label96: i = -1;
          label98: switch (i)
          {
          default:
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          }
          break;
        case -1123215065:
        case -573310373:
        case -1450694211:
        case -1801122596:
        case -594356707:
        }
        while (true)
        {
          localObject1 = localMethod;
          localObject2 = paramClass.getDeclaredMethod(paramString, (Class[])localObject2);
          localObject1 = localObject2;
          methodMap.put(paramString, localObject2);
          localObject1 = localObject2;
          AppMethodBeat.o(72206);
          break;
          localObject1 = localMethod;
          if (!paramString.equals("asInterface"))
            break label96;
          break label98;
          localObject1 = localMethod;
          if (!paramString.equals("getSkuDetails"))
            break label96;
          i = 1;
          break label98;
          localObject1 = localMethod;
          if (!paramString.equals("isBillingSupported"))
            break label96;
          i = 2;
          break label98;
          localObject1 = localMethod;
          if (!paramString.equals("getPurchases"))
            break label96;
          i = 3;
          break label98;
          localObject1 = localMethod;
          if (!paramString.equals("getPurchaseHistory"))
            break label96;
          i = 4;
          break label98;
          localObject1 = localMethod;
          localObject2 = new Class[1];
          localObject2[0] = IBinder.class;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        while (true)
        {
          new StringBuilder().append(paramClass.getName()).append(".").append(paramString).append(" method not found");
          continue;
          localObject1 = localMethod;
          Class[] arrayOfClass = new Class[4];
          localObject1 = localMethod;
          arrayOfClass[0] = Integer.TYPE;
          arrayOfClass[1] = String.class;
          arrayOfClass[2] = String.class;
          arrayOfClass[3] = Bundle.class;
          continue;
          localObject1 = localMethod;
          arrayOfClass = new Class[3];
          localObject1 = localMethod;
          arrayOfClass[0] = Integer.TYPE;
          arrayOfClass[1] = String.class;
          arrayOfClass[2] = String.class;
          continue;
          localObject1 = localMethod;
          arrayOfClass = new Class[4];
          localObject1 = localMethod;
          arrayOfClass[0] = Integer.TYPE;
          arrayOfClass[1] = String.class;
          arrayOfClass[2] = String.class;
          arrayOfClass[3] = String.class;
          continue;
          localObject1 = localMethod;
          arrayOfClass = new Class[5];
          localObject1 = localMethod;
          arrayOfClass[0] = Integer.TYPE;
          arrayOfClass[1] = String.class;
          arrayOfClass[2] = String.class;
          arrayOfClass[3] = String.class;
          arrayOfClass[4] = Bundle.class;
        }
      }
    }
  }

  private static ArrayList<String> getPurchaseHistory(Context paramContext, Object paramObject, String paramString)
  {
    AppMethodBeat.i(72204);
    ArrayList localArrayList = new ArrayList();
    int i;
    Object localObject1;
    Object localObject2;
    Object localObject4;
    Object localObject5;
    Iterator localIterator;
    long l;
    if (isBillingSupported(paramContext, paramObject, paramString).booleanValue())
    {
      i = 0;
      localObject1 = Boolean.FALSE;
      localObject2 = null;
      localObject4 = PACKAGE_NAME;
      localObject5 = new Bundle();
      localIterator = null;
      localObject2 = invokeMethod(paramContext, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", paramObject, new Object[] { Integer.valueOf(6), localObject4, paramString, localObject2, localObject5 });
      if (localObject2 == null)
        break label280;
      l = System.currentTimeMillis() / 1000L;
      localObject4 = (Bundle)localObject2;
      if (((Bundle)localObject4).getInt("RESPONSE_CODE") != 0)
        break label280;
      localIterator = ((Bundle)localObject4).getStringArrayList("INAPP_PURCHASE_DATA_LIST").iterator();
      label139: if (!localIterator.hasNext())
        break label277;
      localObject2 = (String)localIterator.next();
    }
    while (true)
    {
      try
      {
        localObject5 = new org/json/JSONObject;
        ((JSONObject)localObject5).<init>((String)localObject2);
        if (l - ((JSONObject)localObject5).getLong("purchaseTime") / 1000L > 1200L)
        {
          localObject2 = Boolean.TRUE;
          localObject1 = localObject2;
          localObject2 = ((Bundle)localObject4).getString("INAPP_CONTINUATION_TOKEN");
          localObject4 = localObject1;
          localObject1 = localObject2;
          if ((i < 30) && (localObject1 != null) && (!((Boolean)localObject4).booleanValue()))
            break label266;
          AppMethodBeat.o(72204);
          return localArrayList;
        }
        localArrayList.add(localObject2);
        i++;
      }
      catch (JSONException localJSONException)
      {
      }
      break label139;
      label266: Object localObject3 = localObject1;
      localObject1 = localObject4;
      break;
      label277: continue;
      label280: localObject4 = localObject1;
      localObject1 = localIterator;
    }
  }

  public static ArrayList<String> getPurchaseHistoryInapp(Context paramContext, Object paramObject)
  {
    AppMethodBeat.i(72203);
    ArrayList localArrayList = new ArrayList();
    if (paramObject == null)
    {
      AppMethodBeat.o(72203);
      paramContext = localArrayList;
    }
    while (true)
    {
      return paramContext;
      Class localClass = getClass(paramContext, "com.android.vending.billing.IInAppBillingService");
      if (localClass == null)
      {
        AppMethodBeat.o(72203);
        paramContext = localArrayList;
      }
      else if (getMethod(localClass, "getPurchaseHistory") == null)
      {
        AppMethodBeat.o(72203);
        paramContext = localArrayList;
      }
      else
      {
        paramContext = filterPurchasesInapp(getPurchaseHistory(paramContext, paramObject, "inapp"));
        AppMethodBeat.o(72203);
      }
    }
  }

  private static ArrayList<String> getPurchases(Context paramContext, Object paramObject, String paramString)
  {
    AppMethodBeat.i(72202);
    ArrayList localArrayList1 = new ArrayList();
    if (paramObject == null)
    {
      AppMethodBeat.o(72202);
      return localArrayList1;
    }
    int i;
    Object localObject;
    if (isBillingSupported(paramContext, paramObject, paramString).booleanValue())
    {
      i = 0;
      localObject = null;
      label44: localObject = invokeMethod(paramContext, "com.android.vending.billing.IInAppBillingService", "getPurchases", paramObject, new Object[] { Integer.valueOf(3), PACKAGE_NAME, paramString, localObject });
      if (localObject == null)
        break label171;
      localObject = (Bundle)localObject;
      if (((Bundle)localObject).getInt("RESPONSE_CODE") != 0)
        break label171;
      ArrayList localArrayList2 = ((Bundle)localObject).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
      if (localArrayList2 != null)
      {
        int j = localArrayList2.size();
        localArrayList1.addAll(localArrayList2);
        localObject = ((Bundle)localObject).getString("INAPP_CONTINUATION_TOKEN");
        i += j;
      }
    }
    while (true)
    {
      if ((i >= 30) || (localObject == null))
      {
        AppMethodBeat.o(72202);
        break;
      }
      break label44;
      label171: localObject = null;
    }
  }

  public static ArrayList<String> getPurchasesInapp(Context paramContext, Object paramObject)
  {
    AppMethodBeat.i(72198);
    paramContext = filterPurchasesInapp(getPurchases(paramContext, paramObject, "inapp"));
    AppMethodBeat.o(72198);
    return paramContext;
  }

  public static Map<String, SubscriptionType> getPurchasesSubs(Context paramContext, Object paramObject)
  {
    AppMethodBeat.i(72200);
    HashMap localHashMap = new HashMap();
    paramObject = getPurchases(paramContext, paramObject, "subs").iterator();
    while (paramObject.hasNext())
    {
      paramContext = (String)paramObject.next();
      SubscriptionType localSubscriptionType = getSubsType(paramContext);
      if ((localSubscriptionType != SubscriptionType.DUPLICATED) && (localSubscriptionType != SubscriptionType.UNKNOWN))
        localHashMap.put(paramContext, localSubscriptionType);
    }
    AppMethodBeat.o(72200);
    return localHashMap;
  }

  public static ArrayList<String> getPurchasesSubsExpire(Context paramContext, Object paramObject)
  {
    AppMethodBeat.i(72199);
    ArrayList localArrayList = new ArrayList();
    Object localObject = purchaseSubsSharedPrefs.getAll();
    if (((Map)localObject).isEmpty())
      AppMethodBeat.o(72199);
    while (true)
    {
      return localArrayList;
      paramObject = getPurchases(paramContext, paramObject, "subs");
      paramContext = new HashSet();
      paramObject = paramObject.iterator();
      while (paramObject.hasNext())
      {
        String str1 = (String)paramObject.next();
        try
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(str1);
          paramContext.add(localJSONObject.getString("productId"));
        }
        catch (JSONException localJSONException)
        {
        }
      }
      paramObject = new HashSet();
      localObject = ((Map)localObject).entrySet().iterator();
      String str2;
      while (((Iterator)localObject).hasNext())
      {
        str2 = (String)((Map.Entry)((Iterator)localObject).next()).getKey();
        if (!paramContext.contains(str2))
          paramObject.add(str2);
      }
      paramContext = purchaseSubsSharedPrefs.edit();
      localObject = paramObject.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramObject = (String)((Iterator)localObject).next();
        str2 = purchaseSubsSharedPrefs.getString(paramObject, "");
        paramContext.remove(paramObject);
        if (!str2.isEmpty())
          localArrayList.add(purchaseSubsSharedPrefs.getString(paramObject, ""));
      }
      paramContext.apply();
      AppMethodBeat.o(72199);
    }
  }

  public static Map<String, String> getSkuDetails(Context paramContext, ArrayList<String> paramArrayList, Object paramObject, boolean paramBoolean)
  {
    AppMethodBeat.i(72193);
    Map localMap = readSkuDetailsFromCache(paramArrayList);
    ArrayList localArrayList = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str = (String)paramArrayList.next();
      if (!localMap.containsKey(str))
        localArrayList.add(str);
    }
    localMap.putAll(getSkuDetailsFromGoogle(paramContext, localArrayList, paramObject, paramBoolean));
    AppMethodBeat.o(72193);
    return localMap;
  }

  private static Map<String, String> getSkuDetailsFromGoogle(Context paramContext, ArrayList<String> paramArrayList, Object paramObject, boolean paramBoolean)
  {
    AppMethodBeat.i(72194);
    HashMap localHashMap = new HashMap();
    if ((paramObject == null) || (paramArrayList.isEmpty()))
      AppMethodBeat.o(72194);
    while (true)
    {
      return localHashMap;
      Bundle localBundle = new Bundle();
      localBundle.putStringArrayList("ITEM_ID_LIST", paramArrayList);
      String str1 = PACKAGE_NAME;
      if (paramBoolean);
      for (String str2 = "subs"; ; str2 = "inapp")
      {
        paramContext = invokeMethod(paramContext, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", paramObject, new Object[] { Integer.valueOf(3), str1, str2, localBundle });
        if (paramContext == null)
          break label191;
        paramContext = (Bundle)paramContext;
        if (paramContext.getInt("RESPONSE_CODE") != 0)
          break label191;
        paramContext = paramContext.getStringArrayList("DETAILS_LIST");
        if ((paramContext == null) || (paramArrayList.size() != paramContext.size()))
          break;
        for (int i = 0; i < paramArrayList.size(); i++)
          localHashMap.put(paramArrayList.get(i), paramContext.get(i));
      }
      writeSkuDetailsToCache(localHashMap);
      label191: AppMethodBeat.o(72194);
    }
  }

  private static SubscriptionType getSubsType(String paramString)
  {
    AppMethodBeat.i(72201);
    Object localObject = null;
    try
    {
      long l = System.currentTimeMillis() / 1000L;
      JSONObject localJSONObject1 = new org/json/JSONObject;
      localJSONObject1.<init>(paramString);
      String str1 = localJSONObject1.getString("productId");
      String str2 = purchaseSubsSharedPrefs.getString(str1, "");
      JSONObject localJSONObject2;
      if (str2.isEmpty())
      {
        localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
      }
      while (true)
      {
        if (!localJSONObject2.optString("purchaseToken").equals(localJSONObject1.get("purchaseToken")))
        {
          if (l - localJSONObject1.getLong("purchaseTime") / 1000L >= 43200L)
            break;
          localObject = SubscriptionType.NEW;
        }
        paramString = (String)localObject;
        if (localObject == null)
        {
          paramString = (String)localObject;
          if (!str2.isEmpty())
          {
            bool1 = localJSONObject2.getBoolean("autoRenewing");
            bool2 = localJSONObject1.getBoolean("autoRenewing");
            if ((bool2) || (!bool1))
              break label282;
            paramString = SubscriptionType.CANCEL;
          }
        }
        localObject = paramString;
        if (paramString == null)
        {
          localObject = paramString;
          if (!str2.isEmpty())
          {
            if (l - localJSONObject2.getLong("LAST_LOGGED_TIME_SEC") <= 86400L)
              break label303;
            localObject = SubscriptionType.HEARTBEAT;
          }
        }
        if (localObject != SubscriptionType.DUPLICATED)
        {
          localJSONObject1.put("LAST_LOGGED_TIME_SEC", l);
          purchaseSubsSharedPrefs.edit().putString(str1, localJSONObject1.toString()).apply();
        }
        AppMethodBeat.o(72201);
        return localObject;
        localJSONObject2 = new JSONObject(str2);
      }
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        boolean bool1;
        boolean bool2;
        localObject = SubscriptionType.UNKNOWN;
        AppMethodBeat.o(72201);
        continue;
        localObject = SubscriptionType.HEARTBEAT;
        continue;
        label282: paramString = (String)localObject;
        if (!bool1)
        {
          paramString = (String)localObject;
          if (bool2)
          {
            paramString = SubscriptionType.RESTORE;
            continue;
            label303: localObject = SubscriptionType.DUPLICATED;
          }
        }
      }
    }
  }

  private static Object invokeMethod(Context paramContext, String paramString1, String paramString2, Object paramObject, Object[] paramArrayOfObject)
  {
    Object localObject = null;
    AppMethodBeat.i(72208);
    paramString1 = getClass(paramContext, paramString1);
    if (paramString1 == null)
    {
      AppMethodBeat.o(72208);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      paramString2 = getMethod(paramString1, paramString2);
      if (paramString2 == null)
      {
        AppMethodBeat.o(72208);
        paramContext = localObject;
        continue;
      }
      paramContext = paramObject;
      if (paramObject != null)
        paramContext = paramString1.cast(paramObject);
      try
      {
        paramContext = paramString2.invoke(paramContext, paramArrayOfObject);
        AppMethodBeat.o(72208);
      }
      catch (IllegalAccessException paramContext)
      {
        new StringBuilder("Illegal access to method ").append(paramString1.getName()).append(".").append(paramString2.getName());
        AppMethodBeat.o(72208);
        paramContext = localObject;
      }
      catch (InvocationTargetException paramContext)
      {
        while (true)
          new StringBuilder("Invocation target exception in ").append(paramString1.getName()).append(".").append(paramString2.getName());
      }
    }
  }

  private static Boolean isBillingSupported(Context paramContext, Object paramObject, String paramString)
  {
    AppMethodBeat.i(72197);
    if (paramObject == null)
    {
      paramContext = Boolean.FALSE;
      AppMethodBeat.o(72197);
      return paramContext;
    }
    paramContext = invokeMethod(paramContext, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", paramObject, new Object[] { Integer.valueOf(3), PACKAGE_NAME, paramString });
    if ((paramContext != null) && (((Integer)paramContext).intValue() == 0));
    for (boolean bool = true; ; bool = false)
    {
      paramContext = Boolean.valueOf(bool);
      AppMethodBeat.o(72197);
      break;
    }
  }

  private static Map<String, String> readSkuDetailsFromCache(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(72195);
    HashMap localHashMap = new HashMap();
    long l = System.currentTimeMillis() / 1000L;
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str = (String)paramArrayList.next();
      Object localObject = skuDetailSharedPrefs.getString(str, null);
      if (localObject != null)
      {
        localObject = ((String)localObject).split(";", 2);
        if (l - Long.parseLong(localObject[0]) < 43200L)
          localHashMap.put(str, localObject[1]);
      }
    }
    AppMethodBeat.o(72195);
    return localHashMap;
  }

  private static void writeSkuDetailsToCache(Map<String, String> paramMap)
  {
    AppMethodBeat.i(72196);
    long l = System.currentTimeMillis() / 1000L;
    SharedPreferences.Editor localEditor = skuDetailSharedPrefs.edit();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      localEditor.putString((String)paramMap.getKey(), l + ";" + (String)paramMap.getValue());
    }
    localEditor.apply();
    AppMethodBeat.o(72196);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.InAppPurchaseEventManager
 * JD-Core Version:    0.6.2
 */