package com.tencent.mm.plugin.game.luggage;

import com.tencent.luggage.d.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.GameWebPerformanceInfo;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.plugin.webview.luggage.permission.LuggageGetA8Key.a;
import com.tencent.mm.plugin.webview.ui.tools.game.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class c$1 extends LuggageGetA8Key.a
{
  c$1(GameWebPerformanceInfo paramGameWebPerformanceInfo, k paramk)
  {
  }

  public final void NN(String paramString)
  {
    AppMethodBeat.i(135824);
    this.mTN.eCh = System.currentTimeMillis();
    g.aD(paramString, System.currentTimeMillis());
    AppMethodBeat.o(135824);
  }

  public final void a(int paramInt1, String paramString1, int paramInt2, int paramInt3, String paramString2)
  {
  }

  public final void e(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(135825);
    ab.i("MicroMsg.LuggageGetA8KeyUtil", "getA8Key end, time: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    this.mTN.eCi = System.currentTimeMillis();
    g.aE(paramString1, System.currentTimeMillis());
    l.q(new c.1.1(this, paramMap, paramString2));
    AppMethodBeat.o(135825);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.1
 * JD-Core Version:    0.6.2
 */