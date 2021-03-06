package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.annotation.Nullable;

final class zzan extends zzn<Status>
{
  private final String zzce;
  private ChannelApi.ChannelListener zzcf;

  zzan(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener, @Nullable String paramString)
  {
    super(paramGoogleApiClient);
    AppMethodBeat.i(71004);
    this.zzcf = ((ChannelApi.ChannelListener)Preconditions.checkNotNull(paramChannelListener));
    this.zzce = paramString;
    AppMethodBeat.o(71004);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzan
 * JD-Core Version:    0.6.2
 */