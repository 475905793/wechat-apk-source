package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.protocal.protobuf.aar;

final class l$4
  implements Runnable
{
  l$4(boolean paramBoolean, String paramString, g paramg, aar paramaar)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74193);
    if ((this.mkt) || (l.cW(this.fXq)))
      b.a(this.meE, this.mjL, this.mkt);
    AppMethodBeat.o(74193);
  }

  public final String toString()
  {
    AppMethodBeat.i(74194);
    String str = super.toString() + "|getBigImg";
    AppMethodBeat.o(74194);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.l.4
 * JD-Core Version:    0.6.2
 */