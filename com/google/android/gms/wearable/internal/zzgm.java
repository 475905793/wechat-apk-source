package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;

class zzgm<T> extends zza
{
  private BaseImplementation.ResultHolder<T> zzet;

  public zzgm(BaseImplementation.ResultHolder<T> paramResultHolder)
  {
    this.zzet = paramResultHolder;
  }

  public final void zza(T paramT)
  {
    AppMethodBeat.i(71374);
    BaseImplementation.ResultHolder localResultHolder = this.zzet;
    if (localResultHolder != null)
    {
      localResultHolder.setResult(paramT);
      this.zzet = null;
    }
    AppMethodBeat.o(71374);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzgm
 * JD-Core Version:    0.6.2
 */