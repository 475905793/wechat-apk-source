package com.tencent.mm.plugin.account.friend.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a.a;
import com.tencent.mm.plugin.account.friend.a.o;

final class InviteFriendUI$1$6
  implements h.a
{
  InviteFriendUI$1$6(InviteFriendUI.1 param1)
  {
  }

  public final void dn(boolean paramBoolean)
  {
    AppMethodBeat.i(108576);
    if (paramBoolean)
      ((o)((a)g.M(a.class)).getGoogleFriendStorage()).aj(InviteFriendUI.d(this.gxB.gxy), 1);
    AppMethodBeat.o(108576);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.InviteFriendUI.1.6
 * JD-Core Version:    0.6.2
 */