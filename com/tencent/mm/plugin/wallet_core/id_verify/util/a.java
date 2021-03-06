package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.bpt;
import com.tencent.mm.protocal.protobuf.cgs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.wallet_core.c.a;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  implements f
{
  int gOW = -1;
  private a.a tvR = null;
  WeakReference<MMActivity> tvS;
  WeakReference<com.tencent.mm.wallet_core.d.e> tvT;
  private boolean tvU = false;
  c tvV;

  public static boolean a(Activity paramActivity, int paramInt1, com.tencent.mm.ai.m paramm, Bundle paramBundle, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(46684);
    if (paramInt1 != 416)
    {
      ab.i("MicroMsg.RealnameVerifyUtil", "don't need realname verify");
      AppMethodBeat.o(46684);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.RealnameVerifyUtil", "need realname verify");
      bool = a(paramActivity, paramm, paramBundle, false, paramInt2);
      AppMethodBeat.o(46684);
    }
  }

  public static boolean a(Activity paramActivity, int paramInt1, bpt parambpt, Bundle paramBundle, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(46686);
    if (paramInt1 != 416)
    {
      ab.i("MicroMsg.RealnameVerifyUtil", "don't need realname verify");
      AppMethodBeat.o(46686);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.RealnameVerifyUtil", "need realname verify");
      if (parambpt == null)
      {
        AppMethodBeat.o(46686);
      }
      else
      {
        ab.i("MicroMsg.RealnameVerifyUtil", "guide_flag = " + parambpt.vAF + ";upload_credit_url=" + parambpt.nZd);
        if (bo.isEqual("1", parambpt.vAF))
        {
          ab.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog");
          bool = a(paramActivity, paramBundle, null, paramInt2);
          AppMethodBeat.o(46686);
        }
        else if ((bo.isEqual("2", parambpt.vAF)) && (!bo.isNullOrNil(parambpt.nZd)))
        {
          ab.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog");
          bool = a(paramActivity, parambpt.nZa, parambpt.nZd, parambpt.nZb, parambpt.nZc, true, null);
          AppMethodBeat.o(46686);
        }
        else
        {
          ab.e("MicroMsg.RealnameVerifyUtil", "guide_flag=" + parambpt.vAF + ";upload_credit_url=null?" + bo.isNullOrNil(parambpt.nZd));
          AppMethodBeat.o(46686);
        }
      }
    }
  }

  public static boolean a(Activity paramActivity, Bundle paramBundle, int paramInt, String paramString1, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(46689);
    g.RQ();
    int i = ((Integer)g.RP().Ry().get(ac.a.xTf, Integer.valueOf(0))).intValue();
    ab.i("MicroMsg.RealnameVerifyUtil", "showSetPwdDialog count %s", new Object[] { Integer.valueOf(i) });
    boolean bool;
    if (i >= 3)
    {
      bool = false;
      AppMethodBeat.o(46689);
      return bool;
    }
    g.RQ();
    g.RP().Ry().set(ac.a.xTf, Integer.valueOf(i + 1));
    if (bo.isNullOrNil(paramString2))
      paramString2 = paramActivity.getString(2131296868);
    while (true)
    {
      if (bo.isNullOrNil(paramString3))
        paramString3 = paramActivity.getString(2131296994);
      while (true)
      {
        if (paramOnClickListener == null)
          paramOnClickListener = new a.3(paramActivity);
        while (true)
        {
          paramBundle = h.a(paramActivity, paramString1, "", paramString3, paramString2, new a.4(paramBundle, paramInt, paramActivity), paramOnClickListener, 2131690683);
          if (paramBundle != null)
          {
            paramBundle.setOnCancelListener(new a.5(paramActivity));
            paramBundle.setOnDismissListener(new a.6(paramActivity));
          }
          bool = true;
          AppMethodBeat.o(46689);
          break;
        }
      }
    }
  }

  public static boolean a(Activity paramActivity, Bundle paramBundle, c.a parama, int paramInt)
  {
    AppMethodBeat.i(46687);
    ab.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog call %d", new Object[] { Integer.valueOf(0) });
    ab.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog click OK");
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
      localBundle = new Bundle();
    localBundle.putInt("real_name_verify_mode", 0);
    localBundle.putInt("entry_scene", paramInt);
    com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.wallet_core.id_verify.a.class, localBundle, parama);
    com.tencent.mm.wallet_core.ui.e.a(19, bo.anT(), paramInt);
    AppMethodBeat.o(46687);
    return true;
  }

  public static boolean a(Activity paramActivity, com.tencent.mm.ai.m paramm, Bundle paramBundle, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(46685);
    String str1 = "";
    String str2 = "";
    String str3 = "";
    String str4 = "";
    Object localObject = r(paramm);
    if (localObject != null)
    {
      paramm = (com.tencent.mm.ai.m)localObject;
      if (((JSONObject)localObject).has("real_name_info"))
        paramm = ((JSONObject)localObject).optJSONObject("real_name_info");
      localObject = paramm.optString("guide_flag", "0");
      str1 = paramm.optString("guide_wording");
      str2 = paramm.optString("left_button_wording", paramActivity.getString(2131296868));
      str3 = paramm.optString("right_button_wording", paramActivity.getString(2131296994));
      str4 = paramm.optString("upload_credit_url", "");
    }
    for (paramm = str3; ; paramm = str3)
    {
      ab.i("MicroMsg.RealnameVerifyUtil", "guide_flag = " + (String)localObject + ";upload_credit_url=" + str4);
      if ("1".equals(localObject))
      {
        ab.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog");
        paramBoolean = a(paramActivity, paramBundle, null, paramInt);
        AppMethodBeat.o(46685);
      }
      while (true)
      {
        return paramBoolean;
        if (("2".equals(localObject)) && (!bo.isNullOrNil(str4)))
        {
          ab.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog");
          paramBoolean = a(paramActivity, str1, str4, str2, paramm, paramBoolean, null);
          AppMethodBeat.o(46685);
        }
        else
        {
          ab.e("MicroMsg.RealnameVerifyUtil", "guide_flag=" + (String)localObject + ";upload_credit_url=null?" + bo.isNullOrNil(str4));
          paramBoolean = false;
          AppMethodBeat.o(46685);
        }
      }
      localObject = "";
    }
  }

  public static boolean a(final Activity paramActivity, String paramString1, String paramString2, String paramString3, String paramString4, final boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(46688);
    if (bo.isNullOrNil(paramString3))
      paramString3 = paramActivity.getString(2131296868);
    while (true)
    {
      if (bo.isNullOrNil(paramString4))
        paramString4 = paramActivity.getString(2131296994);
      while (true)
      {
        if (paramOnClickListener == null)
        {
          ab.i("MicroMsg.RealnameVerifyUtil", "showRealnameDialog use default calcel listener");
          paramOnClickListener = new a.9(paramBoolean, paramActivity);
        }
        while (true)
        {
          paramString1 = h.a(paramActivity, paramString1, "", paramString4, paramString3, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(46675);
              ab.i("MicroMsg.RealnameVerifyUtil", "showUploadCreditDialog click OK");
              Intent localIntent = new Intent();
              localIntent.putExtra("rawUrl", this.val$url);
              localIntent.putExtra("showShare", false);
              d.b(paramActivity, "webview", ".ui.tools.WebViewUI", localIntent);
              paramAnonymousDialogInterface.dismiss();
              if (paramBoolean)
                paramActivity.finish();
              AppMethodBeat.o(46675);
            }
          }
          , paramOnClickListener, 2131690683);
          if (paramString1 != null)
          {
            paramString1.setOnCancelListener(new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                AppMethodBeat.i(46676);
                if (this.tvZ)
                  paramActivity.finish();
                AppMethodBeat.o(46676);
              }
            });
            paramString1.setOnDismissListener(new a.2(paramBoolean, paramActivity));
          }
          AppMethodBeat.o(46688);
          return true;
        }
      }
    }
  }

  private void bLB()
  {
    AppMethodBeat.i(46678);
    if ((this.tvT != null) && (this.tvT.get() != null))
      ((com.tencent.mm.wallet_core.d.e)this.tvT.get()).bLB();
    AppMethodBeat.o(46678);
  }

  private void destory()
  {
    AppMethodBeat.i(46682);
    this.tvU = false;
    if (this.tvV != null)
    {
      ab.i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : close mDisclaimerDialog");
      this.tvV = null;
    }
    if (this.tvT != null)
    {
      ab.i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : clear mNetSceneMgr");
      this.tvT.clear();
      this.tvT = null;
    }
    if (this.tvS != null)
    {
      ab.i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : clear mContextReference");
      this.tvS.clear();
      this.tvS = null;
    }
    ab.i("MicroMsg.RealnameVerifyUtil", "getDisclaimerCallback : clear getDisclaimerCallback");
    this.tvR = null;
    AppMethodBeat.o(46682);
  }

  private static JSONObject r(com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(46683);
    String str;
    if ((paramm != null) && ((paramm instanceof com.tencent.mm.wallet_core.tenpay.model.m)))
    {
      paramm = ((com.tencent.mm.wallet_core.tenpay.model.m)paramm).dNN();
      if (paramm != null)
      {
        paramm = (cgs)paramm.fsH.fsP;
        if (paramm.wxA != null)
          str = aa.b(paramm.wxA);
      }
    }
    while (true)
    {
      try
      {
        paramm = new org/json/JSONObject;
        paramm.<init>(str);
        AppMethodBeat.o(46683);
        return paramm;
      }
      catch (JSONException paramm)
      {
        ab.printErrStackTrace("MicroMsg.RealnameVerifyUtil", paramm, "", new Object[0]);
        paramm = null;
        continue;
      }
      AppMethodBeat.o(46683);
      paramm = null;
    }
  }

  public final void a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.e parame, String paramString1, String paramString2, String paramString3, String paramString4, a.a parama, boolean paramBoolean, final int paramInt)
  {
    AppMethodBeat.i(46680);
    this.tvS = new WeakReference(paramMMActivity);
    this.tvT = new WeakReference(parame);
    this.tvU = paramBoolean;
    if ((this.tvS != null) && (this.tvS.get() != null))
    {
      this.tvR = parama;
      paramString1 = paramString1 + paramString2;
      parame = new com.tencent.mm.plugin.wallet_core.ui.j(paramMMActivity);
      parame.tHw = new a.1(this, paramInt, paramString3, paramMMActivity);
      paramString3 = com.tencent.mm.pluginsdk.ui.e.j.b(paramMMActivity, paramString1);
      paramString1 = new SpannableString(paramString3);
      paramString1.setSpan(parame, paramString3.length() - paramString2.length(), paramString3.length(), 33);
      parame = new TextView(paramMMActivity);
      parame.setText(paramString1);
      parame.setTextSize(0, com.tencent.mm.bz.a.al(paramMMActivity, 2131427762));
      parame.setTextColor(paramMMActivity.getResources().getColorStateList(2131690316));
      parame.setMovementMethod(LinkMovementMethod.getInstance());
      com.tencent.mm.wallet_core.ui.e.a(0, bo.anT(), paramInt);
      this.tvV = h.a(paramMMActivity, "", parame, paramString4, paramMMActivity.getString(2131296868), new a.7(this, paramInt), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(46673);
          com.tencent.mm.wallet_core.ui.e.a(1, bo.anT(), paramInt);
          a.this.d(1, -1, "cancel", false);
          AppMethodBeat.o(46673);
        }
      });
    }
    AppMethodBeat.o(46680);
  }

  public final boolean a(MMActivity paramMMActivity, com.tencent.mm.wallet_core.d.e parame, int paramInt)
  {
    AppMethodBeat.i(46677);
    this.tvU = false;
    g.RQ();
    long l1 = ((Long)g.RP().Ry().get(ac.a.xNB, Long.valueOf(0L))).longValue();
    if (l1 > 0L)
    {
      long l2 = System.currentTimeMillis();
      com.tencent.mm.wallet_core.ui.e.a(5, bo.anT(), paramInt);
      if (l2 < l1)
      {
        ab.i("MicroMsg.RealnameVerifyUtil", "getDisclaimer query is not expired. expiredTime = ".concat(String.valueOf(l1)));
        AppMethodBeat.o(46677);
      }
    }
    while (true)
    {
      return false;
      ab.i("MicroMsg.RealnameVerifyUtil", "getDisclaimer query had expired. expiredTime = ".concat(String.valueOf(l1)));
      if (paramMMActivity == null)
      {
        ab.e("MicroMsg.RealnameVerifyUtil", "context is null");
        AppMethodBeat.o(46677);
      }
      else if (parame == null)
      {
        ab.e("MicroMsg.RealnameVerifyUtil", "netmgr is null");
        AppMethodBeat.o(46677);
      }
      else
      {
        AppMethodBeat.o(46677);
      }
    }
  }

  final void d(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(46681);
    ab.i("MicroMsg.RealnameVerifyUtil", "doGetDisclaimerCallback call");
    z localz;
    ac.a locala;
    if (this.tvR != null)
    {
      g.RQ();
      localz = g.RP().Ry();
      locala = ac.a.xNC;
      if (!paramBoolean)
        break label98;
    }
    label98: for (int i = 0; ; i = 1)
    {
      localz.set(locala, Integer.valueOf(i));
      this.tvR.c(paramInt1, paramInt2, paramString, paramBoolean);
      if (this.tvV != null)
        this.tvV.dismiss();
      destory();
      AppMethodBeat.o(46681);
      return;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(46679);
    if ((paramm instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.e))
    {
      g.RQ();
      g.RO().eJo.b(385, this);
      bLB();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramm = (com.tencent.mm.plugin.wallet_core.id_verify.model.e)paramm;
        boolean bool = paramm.tvB.equals("1");
        if (bool)
        {
          ab.i("MicroMsg.RealnameVerifyUtil", "user had agreed");
          d(0, paramInt2, paramString, bool);
          AppMethodBeat.o(46679);
        }
      }
    }
    while (true)
    {
      return;
      String str1 = paramm.title;
      String str2 = paramm.tvC;
      paramString = paramm.tvD;
      String str3 = paramm.tvE;
      paramInt1 = paramm.tvF;
      a((MMActivity)this.tvS.get(), (com.tencent.mm.wallet_core.d.e)this.tvT.get(), str1, str2, paramString, str3, this.tvR, false, paramInt1);
      AppMethodBeat.o(46679);
      continue;
      d(2, paramInt2, paramString, false);
      AppMethodBeat.o(46679);
      continue;
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.a))
      {
        g.RQ();
        g.RO().eJo.a(385, this);
        bLB();
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          d(0, paramInt2, paramString, true);
          AppMethodBeat.o(46679);
        }
        else
        {
          d(3, paramInt2, paramString, false);
        }
      }
      else
      {
        AppMethodBeat.o(46679);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.util.a
 * JD-Core Version:    0.6.2
 */