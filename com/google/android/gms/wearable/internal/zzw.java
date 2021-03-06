package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Node;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Set;

public final class zzw
  implements CapabilityInfo
{
  private final String name;
  private final Set<Node> zzbt;

  public zzw(CapabilityInfo paramCapabilityInfo)
  {
    this(paramCapabilityInfo.getName(), paramCapabilityInfo.getNodes());
    AppMethodBeat.i(71476);
    AppMethodBeat.o(71476);
  }

  private zzw(String paramString, Set<Node> paramSet)
  {
    this.name = paramString;
    this.zzbt = paramSet;
  }

  public final String getName()
  {
    return this.name;
  }

  public final Set<Node> getNodes()
  {
    return this.zzbt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzw
 * JD-Core Version:    0.6.2
 */