package com.tencent.mm.plugin.scanner.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class j$1$1
  implements DialogInterface.OnClickListener
{
  j$1$1(j.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(81157);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(81157);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.j.1.1
 * JD-Core Version:    0.6.2
 */