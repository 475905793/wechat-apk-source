package com.tencent.mm.plugin.fts.ui.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a;
import com.tencent.mm.plugin.fts.a.d.e;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.ui.d.j;

public final class i extends a
{
  public final e a(Context paramContext, e.b paramb, int paramInt)
  {
    AppMethodBeat.i(62048);
    paramContext = new j(paramContext, paramb, paramInt);
    AppMethodBeat.o(62048);
    return paramContext;
  }

  public final int getPriority()
  {
    return 2147483647;
  }

  public final int getType()
  {
    return 4176;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.b.i
 * JD-Core Version:    0.6.2
 */