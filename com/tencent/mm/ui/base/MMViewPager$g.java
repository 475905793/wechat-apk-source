package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class MMViewPager$g extends MMViewPager.a
{
  float[] v;

  public MMViewPager$g(MMViewPager paramMMViewPager)
  {
    super(paramMMViewPager);
    AppMethodBeat.i(106909);
    this.v = new float[9];
    AppMethodBeat.o(106909);
  }

  public final void play()
  {
    AppMethodBeat.i(106910);
    MMViewPager.c(this.yyC).post(new MMViewPager.g.1(this));
    AppMethodBeat.o(106910);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.g
 * JD-Core Version:    0.6.2
 */