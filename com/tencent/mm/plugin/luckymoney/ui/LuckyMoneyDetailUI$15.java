package com.tencent.mm.plugin.luckymoney.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.emoji.f.e;
import com.tencent.mm.protocal.protobuf.hv;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.LinkedList;

final class LuckyMoneyDetailUI$15
  implements f
{
  LuckyMoneyDetailUI$15(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(42664);
    if ((bo.gW(paramm.getType(), 697)) && ((paramm instanceof e)))
    {
      paramString = (e)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = paramString.bku();
        if ((paramString != null) && (paramString.vKl != null) && (paramString.vKl.size() > 0) && (bo.isEqual(((xx)paramString.vKl.get(0)).Md5, LuckyMoneyDetailUI.m(this.oeA).Aq())))
          LuckyMoneyDetailUI.a(this.oeA, false);
      }
    }
    AppMethodBeat.o(42664);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.15
 * JD-Core Version:    0.6.2
 */