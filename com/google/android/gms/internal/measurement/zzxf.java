package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class zzxf
{
  private final ConcurrentHashMap<zzxg, List<Throwable>> zzboa;
  private final ReferenceQueue<Throwable> zzbob;

  zzxf()
  {
    AppMethodBeat.i(3539);
    this.zzboa = new ConcurrentHashMap(16, 0.75F, 10);
    this.zzbob = new ReferenceQueue();
    AppMethodBeat.o(3539);
  }

  public final List<Throwable> zza(Throwable paramThrowable, boolean paramBoolean)
  {
    AppMethodBeat.i(3540);
    for (Reference localReference = this.zzbob.poll(); localReference != null; localReference = this.zzbob.poll())
      this.zzboa.remove(localReference);
    paramThrowable = new zzxg(paramThrowable, null);
    paramThrowable = (List)this.zzboa.get(paramThrowable);
    AppMethodBeat.o(3540);
    return paramThrowable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzxf
 * JD-Core Version:    0.6.2
 */