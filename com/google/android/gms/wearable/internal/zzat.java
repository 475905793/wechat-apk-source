package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.google.android.gms.wearable.ChannelClient.ChannelCallback;
import javax.annotation.Nullable;

final class zzat extends RegisterListenerMethod<zzhg, ChannelClient.ChannelCallback>
{
  private final IntentFilter[] zzba;

  @Nullable
  private final String zzce;
  private final ChannelApi.ChannelListener zzcf;
  private final ListenerHolder<ChannelApi.ChannelListener> zzci;

  zzat(ChannelApi.ChannelListener paramChannelListener, @Nullable String paramString, IntentFilter[] paramArrayOfIntentFilter, ListenerHolder<ChannelClient.ChannelCallback> paramListenerHolder, ListenerHolder<ChannelApi.ChannelListener> paramListenerHolder1)
  {
    super(paramListenerHolder);
    this.zzcf = paramChannelListener;
    this.zzba = paramArrayOfIntentFilter;
    this.zzce = paramString;
    this.zzci = paramListenerHolder1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzat
 * JD-Core Version:    0.6.2
 */