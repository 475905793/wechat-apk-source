package com.tencent.mm.ui.conversation;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class BizConversationUI$BizConversationFmUI$1
  implements MenuItem.OnMenuItemClickListener
{
  BizConversationUI$BizConversationFmUI$1(BizConversationUI.BizConversationFmUI paramBizConversationFmUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(34116);
    if (aa.HU(0))
      ((m)g.K(m.class)).a(ah.getContext(), new BizConversationUI.BizConversationFmUI.1.1(this));
    while (true)
    {
      AppMethodBeat.o(34116);
      return true;
      ab.e("MicroMsg.BizConversationUI", "fts h5 template not avail");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BizConversationUI.BizConversationFmUI.1
 * JD-Core Version:    0.6.2
 */