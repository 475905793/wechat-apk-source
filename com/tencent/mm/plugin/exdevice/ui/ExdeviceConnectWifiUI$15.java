package com.tencent.mm.plugin.exdevice.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceConnectWifiUI$15
  implements View.OnKeyListener
{
  ExdeviceConnectWifiUI$15(ExdeviceConnectWifiUI paramExdeviceConnectWifiUI)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(19891);
    boolean bool;
    if ((66 == paramInt) && (paramKeyEvent.getAction() == 0))
    {
      ExdeviceConnectWifiUI.k(this.lAf);
      bool = true;
      AppMethodBeat.o(19891);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(19891);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.15
 * JD-Core Version:    0.6.2
 */