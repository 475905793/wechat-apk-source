package com.tencent.mm.plugin.fav.ui.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a;
import com.tencent.mm.plugin.fts.a.d.e.b;

public final class d extends a
{
  public final com.tencent.mm.plugin.fts.a.d.e a(Context paramContext, e.b paramb, int paramInt)
  {
    AppMethodBeat.i(74503);
    paramContext = new e(paramContext, paramb, paramInt);
    AppMethodBeat.o(74503);
    return paramContext;
  }

  public final int getPriority()
  {
    return 128;
  }

  public final int getType()
  {
    return 128;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.b.d
 * JD-Core Version:    0.6.2
 */