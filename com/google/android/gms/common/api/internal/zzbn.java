package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Map;

final class zzbn
  implements Runnable
{
  zzbn(GoogleApiManager.zzc paramzzc, ConnectionResult paramConnectionResult)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(60842);
    if (this.zzkl.isSuccess())
    {
      GoogleApiManager.zzc.zza(this.zzkr, true);
      if (GoogleApiManager.zzc.zza(this.zzkr).requiresSignIn())
      {
        GoogleApiManager.zzc.zzb(this.zzkr);
        AppMethodBeat.o(60842);
      }
    }
    while (true)
    {
      return;
      GoogleApiManager.zzc.zza(this.zzkr).getRemoteService(null, Collections.emptySet());
      AppMethodBeat.o(60842);
      continue;
      ((GoogleApiManager.zza)GoogleApiManager.zzj(this.zzkr.zzjy).get(GoogleApiManager.zzc.zzc(this.zzkr))).onConnectionFailed(this.zzkl);
      AppMethodBeat.o(60842);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzbn
 * JD-Core Version:    0.6.2
 */