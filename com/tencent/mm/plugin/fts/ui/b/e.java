package com.tencent.mm.plugin.fts.ui.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a;
import com.tencent.mm.plugin.fts.a.d.e.b;

public final class e extends a
{
  public final com.tencent.mm.plugin.fts.a.d.e a(Context paramContext, e.b paramb, int paramInt)
  {
    AppMethodBeat.i(62044);
    paramContext = new com.tencent.mm.plugin.fts.ui.d.e(paramContext, paramb, paramInt);
    AppMethodBeat.o(62044);
    return paramContext;
  }

  public final int getPriority()
  {
    return 32;
  }

  public final int getType()
  {
    return 32;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.b.e
 * JD-Core Version:    0.6.2
 */