package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(14)
final class zzid
  implements Application.ActivityLifecycleCallbacks
{
  private zzid(zzhk paramzzhk)
  {
  }

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(69235);
    try
    {
      this.zzanw.zzge().zzit().log("onActivityCreated");
      Object localObject = paramActivity.getIntent();
      if (localObject != null)
      {
        Uri localUri = ((Intent)localObject).getData();
        if ((localUri != null) && (localUri.isHierarchical()))
        {
          if (paramBundle == null)
          {
            Bundle localBundle = this.zzanw.zzgb().zza(localUri);
            this.zzanw.zzgb();
            if (!zzka.zzd((Intent)localObject))
              break label126;
            localObject = "gs";
            if (localBundle != null)
              this.zzanw.logEvent((String)localObject, "_cmp", localBundle);
          }
          localObject = localUri.getQueryParameter("referrer");
          boolean bool = TextUtils.isEmpty((CharSequence)localObject);
          if (bool)
            AppMethodBeat.o(69235);
        }
      }
      while (true)
      {
        return;
        label126: localObject = "auto";
        break;
        if ((((String)localObject).contains("gclid")) && ((((String)localObject).contains("utm_campaign")) || (((String)localObject).contains("utm_source")) || (((String)localObject).contains("utm_medium")) || (((String)localObject).contains("utm_term")) || (((String)localObject).contains("utm_content"))));
        for (int i = 1; ; i = 0)
        {
          if (i != 0)
            break label223;
          this.zzanw.zzge().zzis().log("Activity created with data 'referrer' param without gclid and at least one utm field");
          AppMethodBeat.o(69235);
          break;
        }
        label223: this.zzanw.zzge().zzis().zzg("Activity created with referrer", localObject);
        if (!TextUtils.isEmpty((CharSequence)localObject))
          this.zzanw.setUserProperty("auto", "_ldl", localObject);
        this.zzanw.zzfy().onActivityCreated(paramActivity, paramBundle);
        AppMethodBeat.o(69235);
      }
    }
    catch (Exception localException)
    {
      while (true)
        this.zzanw.zzge().zzim().zzg("Throwable caught in onActivityCreated", localException);
    }
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
    AppMethodBeat.i(69236);
    this.zzanw.zzfy().onActivityDestroyed(paramActivity);
    AppMethodBeat.o(69236);
  }

  public final void onActivityPaused(Activity paramActivity)
  {
    AppMethodBeat.i(69237);
    this.zzanw.zzfy().onActivityPaused(paramActivity);
    paramActivity = this.zzanw.zzgc();
    long l = paramActivity.zzbt().elapsedRealtime();
    paramActivity.zzgd().zzc(new zzjl(paramActivity, l));
    AppMethodBeat.o(69237);
  }

  public final void onActivityResumed(Activity paramActivity)
  {
    AppMethodBeat.i(69238);
    this.zzanw.zzfy().onActivityResumed(paramActivity);
    paramActivity = this.zzanw.zzgc();
    long l = paramActivity.zzbt().elapsedRealtime();
    paramActivity.zzgd().zzc(new zzjk(paramActivity, l));
    AppMethodBeat.o(69238);
  }

  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(69239);
    this.zzanw.zzfy().onActivitySaveInstanceState(paramActivity, paramBundle);
    AppMethodBeat.o(69239);
  }

  public final void onActivityStarted(Activity paramActivity)
  {
  }

  public final void onActivityStopped(Activity paramActivity)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzid
 * JD-Core Version:    0.6.2
 */