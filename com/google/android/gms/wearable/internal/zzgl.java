package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzgl extends zzgm<CapabilityApi.AddLocalCapabilityResult>
{
  public zzgl(BaseImplementation.ResultHolder<CapabilityApi.AddLocalCapabilityResult> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zza(zzf paramzzf)
  {
    AppMethodBeat.i(71373);
    zza(new zzu(zzgd.zzb(paramzzf.statusCode)));
    AppMethodBeat.o(71373);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzgl
 * JD-Core Version:    0.6.2
 */