package com.tencent.mm.plugin.subapp.ui.friend;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI;

final class FMessageConversationUI$5
  implements MenuItem.OnMenuItemClickListener
{
  FMessageConversationUI$5(FMessageConversationUI paramFMessageConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(25362);
    paramMenuItem = new Intent(this.stR, AddMoreFriendsUI.class);
    paramMenuItem.putExtra("invite_friend_scene", 3);
    this.stR.startActivity(paramMenuItem);
    AppMethodBeat.o(25362);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI.5
 * JD-Core Version:    0.6.2
 */