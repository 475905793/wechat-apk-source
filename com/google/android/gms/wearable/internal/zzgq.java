package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzgq extends zzgm<CapabilityApi.GetAllCapabilitiesResult>
{
  public zzgq(BaseImplementation.ResultHolder<CapabilityApi.GetAllCapabilitiesResult> paramResultHolder)
  {
    super(paramResultHolder);
  }

  public final void zza(zzdi paramzzdi)
  {
    AppMethodBeat.i(71378);
    zza(new zzx(zzgd.zzb(paramzzdi.statusCode), zzgk.zzb(paramzzdi.zzdp)));
    AppMethodBeat.o(71378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzgq
 * JD-Core Version:    0.6.2
 */