package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiNoAuthStateUI$3
  implements DialogInterface.OnClickListener
{
  FreeWifiNoAuthStateUI$3(FreeWifiNoAuthStateUI paramFreeWifiNoAuthStateUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(21056);
    this.mzQ.finish();
    AppMethodBeat.o(21056);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiNoAuthStateUI.3
 * JD-Core Version:    0.6.2
 */