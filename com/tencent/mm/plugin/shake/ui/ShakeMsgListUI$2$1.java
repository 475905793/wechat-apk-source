package com.tencent.mm.plugin.shake.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.shake.b.g;
import com.tencent.mm.sdk.e.e;

final class ShakeMsgListUI$2$1
  implements DialogInterface.OnClickListener
{
  ShakeMsgListUI$2$1(ShakeMsgListUI.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(24752);
    paramDialogInterface = ShakeMsgListUI.a(this.quS.quR);
    paramDialogInterface.bSd.delete(paramDialogInterface.getTableName(), null, null);
    ShakeMsgListUI.b(this.quS.quR).KC();
    ShakeMsgListUI.c(this.quS.quR);
    AppMethodBeat.o(24752);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeMsgListUI.2.1
 * JD-Core Version:    0.6.2
 */