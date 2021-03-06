package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzp
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  public final Api<?> mApi;
  private final boolean zzfo;
  private zzq zzfp;

  public zzp(Api<?> paramApi, boolean paramBoolean)
  {
    this.mApi = paramApi;
    this.zzfo = paramBoolean;
  }

  private final void zzy()
  {
    AppMethodBeat.i(60945);
    Preconditions.checkNotNull(this.zzfp, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    AppMethodBeat.o(60945);
  }

  public final void onConnected(Bundle paramBundle)
  {
    AppMethodBeat.i(60942);
    zzy();
    this.zzfp.onConnected(paramBundle);
    AppMethodBeat.o(60942);
  }

  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    AppMethodBeat.i(60944);
    zzy();
    this.zzfp.zza(paramConnectionResult, this.mApi, this.zzfo);
    AppMethodBeat.o(60944);
  }

  public final void onConnectionSuspended(int paramInt)
  {
    AppMethodBeat.i(60943);
    zzy();
    this.zzfp.onConnectionSuspended(paramInt);
    AppMethodBeat.o(60943);
  }

  public final void zza(zzq paramzzq)
  {
    this.zzfp = paramzzq;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzp
 * JD-Core Version:    0.6.2
 */