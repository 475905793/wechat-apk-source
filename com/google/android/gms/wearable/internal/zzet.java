package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.Map;

final class zzet<T> extends zzgm<Status>
{
  private WeakReference<Map<T, zzhk<T>>> zzec;
  private WeakReference<T> zzed;

  zzet(Map<T, zzhk<T>> paramMap, T paramT, BaseImplementation.ResultHolder<Status> paramResultHolder)
  {
    super(paramResultHolder);
    AppMethodBeat.i(71285);
    this.zzec = new WeakReference(paramMap);
    this.zzed = new WeakReference(paramT);
    AppMethodBeat.o(71285);
  }

  public final void zza(Status paramStatus)
  {
    AppMethodBeat.i(71286);
    Map localMap = (Map)this.zzec.get();
    Object localObject = this.zzed.get();
    if ((paramStatus.getStatus().getStatusCode() == 4002) && (localMap != null) && (localObject != null));
    try
    {
      localObject = (zzhk)localMap.remove(localObject);
      if (localObject != null)
        ((zzhk)localObject).clear();
      zza(paramStatus);
      AppMethodBeat.o(71286);
      return;
    }
    finally
    {
      AppMethodBeat.o(71286);
    }
    throw paramStatus;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzet
 * JD-Core Version:    0.6.2
 */