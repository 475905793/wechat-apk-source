package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.backup.d.b;
import com.tencent.mm.plugin.backup.d.c;
import com.tencent.mm.sdk.platformtools.ab;

final class BackupMoveRecoverUI$1$2
  implements View.OnClickListener
{
  BackupMoveRecoverUI$1$2(BackupMoveRecoverUI.1 param1, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(17361);
    ab.i("MicroMsg.BackupMoveRecoverUI", "backupmove click stop merge button.");
    com.tencent.mm.ui.base.h.a(this.jvd.jvc, 2131297208, 2131297207, 2131297254, 2131297189, false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(17360);
        ab.i("MicroMsg.BackupMoveRecoverUI", "user click close. stop recover merge, backupState[%d].", new Object[] { Integer.valueOf(BackupMoveRecoverUI.1.2.this.jtO) });
        com.tencent.mm.plugin.report.service.h.pYm.a(485L, 48L, 1L, false);
        b.aSZ().aTa().stop();
        b.aSZ().aTc().c(true, true, -100);
        AppMethodBeat.o(17360);
      }
    }
    , null, 2131689745);
    AppMethodBeat.o(17361);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI.1.2
 * JD-Core Version:    0.6.2
 */