package com.tencent.mm.plugin.backup.backuppcui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.d;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class BackupPcUI$3$4$1
  implements DialogInterface.OnClickListener
{
  BackupPcUI$3$4$1(BackupPcUI.3.4 param4)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(17596);
    ab.i("MicroMsg.BackupPcUI", "user click close. stop recover.");
    h.pYm.a(400L, 18L, 1L, false);
    b.aTD().aTG().rt(4);
    b.aTD().aTa().stop();
    b.aTD().aTG().c(true, true, -100);
    AppMethodBeat.o(17596);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.3.4.1
 * JD-Core Version:    0.6.2
 */