package com.facebook.internal;

import com.facebook.FacebookRequestError.Category;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class FacebookRequestErrorClassification
{
  public static final int EC_APP_NOT_INSTALLED = 412;
  public static final int EC_APP_TOO_MANY_CALLS = 4;
  public static final int EC_INVALID_SESSION = 102;
  public static final int EC_INVALID_TOKEN = 190;
  public static final int EC_RATE = 9;
  public static final int EC_SERVICE_UNAVAILABLE = 2;
  public static final int EC_TOO_MANY_USER_ACTION_CALLS = 341;
  public static final int EC_USER_TOO_MANY_CALLS = 17;
  public static final int ESC_APP_INACTIVE = 493;
  public static final int ESC_APP_NOT_INSTALLED = 458;
  public static final String KEY_LOGIN_RECOVERABLE = "login_recoverable";
  public static final String KEY_NAME = "name";
  public static final String KEY_OTHER = "other";
  public static final String KEY_RECOVERY_MESSAGE = "recovery_message";
  public static final String KEY_TRANSIENT = "transient";
  private static FacebookRequestErrorClassification defaultInstance;
  private final Map<Integer, Set<Integer>> loginRecoverableErrors;
  private final String loginRecoverableRecoveryMessage;
  private final Map<Integer, Set<Integer>> otherErrors;
  private final String otherRecoveryMessage;
  private final Map<Integer, Set<Integer>> transientErrors;
  private final String transientRecoveryMessage;

  FacebookRequestErrorClassification(Map<Integer, Set<Integer>> paramMap1, Map<Integer, Set<Integer>> paramMap2, Map<Integer, Set<Integer>> paramMap3, String paramString1, String paramString2, String paramString3)
  {
    this.otherErrors = paramMap1;
    this.transientErrors = paramMap2;
    this.loginRecoverableErrors = paramMap3;
    this.otherRecoveryMessage = paramString1;
    this.transientRecoveryMessage = paramString2;
    this.loginRecoverableRecoveryMessage = paramString3;
  }

  public static FacebookRequestErrorClassification createFromJSON(JSONArray paramJSONArray)
  {
    Object localObject1 = null;
    AppMethodBeat.i(72289);
    if (paramJSONArray == null)
    {
      AppMethodBeat.o(72289);
      paramJSONArray = localObject1;
    }
    while (true)
    {
      return paramJSONArray;
      int i = 0;
      localObject1 = null;
      Object localObject2 = null;
      Object localObject3 = null;
      Object localObject4 = null;
      Object localObject5 = null;
      Object localObject6 = null;
      if (i < paramJSONArray.length())
      {
        JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
        Object localObject7 = localObject6;
        Object localObject8 = localObject5;
        Object localObject9 = localObject4;
        Object localObject10 = localObject3;
        Object localObject11 = localObject2;
        Object localObject12 = localObject1;
        String str;
        if (localJSONObject != null)
        {
          str = localJSONObject.optString("name");
          localObject7 = localObject6;
          localObject8 = localObject5;
          localObject9 = localObject4;
          localObject10 = localObject3;
          localObject11 = localObject2;
          localObject12 = localObject1;
          if (str != null)
          {
            if (!str.equalsIgnoreCase("other"))
              break label185;
            localObject10 = localJSONObject.optString("recovery_message", null);
            localObject7 = parseJSONDefinition(localJSONObject);
            localObject12 = localObject1;
            localObject11 = localObject2;
            localObject9 = localObject4;
            localObject8 = localObject5;
          }
        }
        while (true)
        {
          i++;
          localObject6 = localObject7;
          localObject5 = localObject8;
          localObject4 = localObject9;
          localObject3 = localObject10;
          localObject2 = localObject11;
          localObject1 = localObject12;
          break;
          label185: if (str.equalsIgnoreCase("transient"))
          {
            localObject11 = localJSONObject.optString("recovery_message", null);
            localObject8 = parseJSONDefinition(localJSONObject);
            localObject7 = localObject6;
            localObject9 = localObject4;
            localObject10 = localObject3;
            localObject12 = localObject1;
          }
          else
          {
            localObject7 = localObject6;
            localObject8 = localObject5;
            localObject9 = localObject4;
            localObject10 = localObject3;
            localObject11 = localObject2;
            localObject12 = localObject1;
            if (str.equalsIgnoreCase("login_recoverable"))
            {
              localObject12 = localJSONObject.optString("recovery_message", null);
              localObject9 = parseJSONDefinition(localJSONObject);
              localObject7 = localObject6;
              localObject8 = localObject5;
              localObject10 = localObject3;
              localObject11 = localObject2;
            }
          }
        }
      }
      paramJSONArray = new FacebookRequestErrorClassification(localObject6, localObject5, localObject4, localObject3, localObject2, localObject1);
      AppMethodBeat.o(72289);
    }
  }

  public static FacebookRequestErrorClassification getDefaultErrorClassification()
  {
    try
    {
      AppMethodBeat.i(72286);
      if (defaultInstance == null)
        defaultInstance = getDefaultErrorClassificationImpl();
      FacebookRequestErrorClassification localFacebookRequestErrorClassification = defaultInstance;
      AppMethodBeat.o(72286);
      return localFacebookRequestErrorClassification;
    }
    finally
    {
    }
  }

  private static FacebookRequestErrorClassification getDefaultErrorClassificationImpl()
  {
    AppMethodBeat.i(72287);
    FacebookRequestErrorClassification localFacebookRequestErrorClassification = new FacebookRequestErrorClassification(null, new FacebookRequestErrorClassification.1(), new HashMap()
    {
    }
    , null, null, null);
    AppMethodBeat.o(72287);
    return localFacebookRequestErrorClassification;
  }

  private static Map<Integer, Set<Integer>> parseJSONDefinition(JSONObject paramJSONObject)
  {
    HashMap localHashMap = null;
    AppMethodBeat.i(72288);
    JSONArray localJSONArray1 = paramJSONObject.optJSONArray("items");
    if (localJSONArray1.length() == 0)
    {
      AppMethodBeat.o(72288);
      paramJSONObject = localHashMap;
      return paramJSONObject;
    }
    localHashMap = new HashMap();
    int i = 0;
    label40: int j;
    if (i < localJSONArray1.length())
    {
      paramJSONObject = localJSONArray1.optJSONObject(i);
      if (paramJSONObject != null)
      {
        j = paramJSONObject.optInt("code");
        if (j != 0)
        {
          JSONArray localJSONArray2 = paramJSONObject.optJSONArray("subcodes");
          if ((localJSONArray2 == null) || (localJSONArray2.length() <= 0))
            break label174;
          paramJSONObject = new HashSet();
          for (int k = 0; k < localJSONArray2.length(); k++)
          {
            int m = localJSONArray2.optInt(k);
            if (m != 0)
              paramJSONObject.add(Integer.valueOf(m));
          }
        }
      }
    }
    while (true)
    {
      localHashMap.put(Integer.valueOf(j), paramJSONObject);
      i++;
      break label40;
      AppMethodBeat.o(72288);
      paramJSONObject = localHashMap;
      break;
      label174: paramJSONObject = null;
    }
  }

  public final FacebookRequestError.Category classify(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(72285);
    Object localObject;
    if (paramBoolean)
    {
      localObject = FacebookRequestError.Category.TRANSIENT;
      AppMethodBeat.o(72285);
    }
    while (true)
    {
      return localObject;
      if ((this.otherErrors != null) && (this.otherErrors.containsKey(Integer.valueOf(paramInt1))))
      {
        localObject = (Set)this.otherErrors.get(Integer.valueOf(paramInt1));
        if ((localObject == null) || (((Set)localObject).contains(Integer.valueOf(paramInt2))))
        {
          localObject = FacebookRequestError.Category.OTHER;
          AppMethodBeat.o(72285);
        }
      }
      else if ((this.loginRecoverableErrors != null) && (this.loginRecoverableErrors.containsKey(Integer.valueOf(paramInt1))))
      {
        localObject = (Set)this.loginRecoverableErrors.get(Integer.valueOf(paramInt1));
        if ((localObject == null) || (((Set)localObject).contains(Integer.valueOf(paramInt2))))
        {
          localObject = FacebookRequestError.Category.LOGIN_RECOVERABLE;
          AppMethodBeat.o(72285);
        }
      }
      else if ((this.transientErrors != null) && (this.transientErrors.containsKey(Integer.valueOf(paramInt1))))
      {
        localObject = (Set)this.transientErrors.get(Integer.valueOf(paramInt1));
        if ((localObject == null) || (((Set)localObject).contains(Integer.valueOf(paramInt2))))
        {
          localObject = FacebookRequestError.Category.TRANSIENT;
          AppMethodBeat.o(72285);
        }
      }
      else
      {
        localObject = FacebookRequestError.Category.OTHER;
        AppMethodBeat.o(72285);
      }
    }
  }

  public final Map<Integer, Set<Integer>> getLoginRecoverableErrors()
  {
    return this.loginRecoverableErrors;
  }

  public final Map<Integer, Set<Integer>> getOtherErrors()
  {
    return this.otherErrors;
  }

  public final String getRecoveryMessage(FacebookRequestError.Category paramCategory)
  {
    AppMethodBeat.i(72284);
    switch (FacebookRequestErrorClassification.3.$SwitchMap$com$facebook$FacebookRequestError$Category[paramCategory.ordinal()])
    {
    default:
      paramCategory = null;
      AppMethodBeat.o(72284);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return paramCategory;
      paramCategory = this.otherRecoveryMessage;
      AppMethodBeat.o(72284);
      continue;
      paramCategory = this.loginRecoverableRecoveryMessage;
      AppMethodBeat.o(72284);
      continue;
      paramCategory = this.transientRecoveryMessage;
      AppMethodBeat.o(72284);
    }
  }

  public final Map<Integer, Set<Integer>> getTransientErrors()
  {
    return this.transientErrors;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FacebookRequestErrorClassification
 * JD-Core Version:    0.6.2
 */