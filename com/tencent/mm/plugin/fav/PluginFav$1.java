package com.tencent.mm.plugin.fav;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.b.a.b;
import com.tencent.mm.plugin.fts.a.i;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.plugin.fts.a.n;

final class PluginFav$1 extends com.tencent.mm.plugin.fts.a.a.a
{
  PluginFav$1(PluginFav paramPluginFav)
  {
  }

  public final boolean execute()
  {
    AppMethodBeat.i(5282);
    Object localObject = new com.tencent.mm.plugin.fav.b.a.a();
    ((n)g.M(n.class)).registerIndexStorage((i)localObject);
    ((i)localObject).create();
    localObject = new b();
    ((n)g.M(n.class)).registerNativeLogic(6, (k)localObject);
    ((k)localObject).create();
    AppMethodBeat.o(5282);
    return true;
  }

  public final String getName()
  {
    return "InitFTSFavPluginTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.PluginFav.1
 * JD-Core Version:    0.6.2
 */