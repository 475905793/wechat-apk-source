package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.EntityBuffer;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class DataEventBuffer extends EntityBuffer<DataEvent>
  implements Result
{
  private final Status zzp;

  public DataEventBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    AppMethodBeat.i(70799);
    this.zzp = new Status(paramDataHolder.getStatusCode());
    AppMethodBeat.o(70799);
  }

  public String getPrimaryDataMarkerColumn()
  {
    return "path";
  }

  public Status getStatus()
  {
    return this.zzp;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataEventBuffer
 * JD-Core Version:    0.6.2
 */