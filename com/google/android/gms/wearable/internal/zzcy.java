package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zzcy extends DataBufferRef
  implements DataEvent
{
  private final int zzdl;

  public zzcy(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    this.zzdl = paramInt2;
  }

  public final DataItem getDataItem()
  {
    AppMethodBeat.i(71177);
    zzdf localzzdf = new zzdf(this.mDataHolder, this.mDataRow, this.zzdl);
    AppMethodBeat.o(71177);
    return localzzdf;
  }

  public final int getType()
  {
    AppMethodBeat.i(71178);
    int i = getInteger("event_type");
    AppMethodBeat.o(71178);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(71179);
    String str1;
    if (getType() == 1)
      str1 = "changed";
    while (true)
    {
      String str2 = String.valueOf(getDataItem());
      str1 = String.valueOf(str1).length() + 32 + String.valueOf(str2).length() + "DataEventRef{ type=" + str1 + ", dataitem=" + str2 + " }";
      AppMethodBeat.o(71179);
      return str1;
      if (getType() == 2)
        str1 = "deleted";
      else
        str1 = "unknown";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzcy
 * JD-Core Version:    0.6.2
 */