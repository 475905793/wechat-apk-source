package com.tencent.mm.plugin.qqmail.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MailAddrListUI$4
  implements AbsListView.OnScrollListener
{
  MailAddrListUI$4(MailAddrListUI paramMailAddrListUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(68314);
    if (1 == paramInt)
      this.pyp.aqX();
    AppMethodBeat.o(68314);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailAddrListUI.4
 * JD-Core Version:    0.6.2
 */