package com.tencent.mm.plugin.collect.reward.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class QrRewardMainUI$7
  implements o.a
{
  QrRewardMainUI$7(QrRewardMainUI paramQrRewardMainUI)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(41090);
    ab.d("MicroMsg.QrRewardMainUI", "go to: %s", new Object[] { QrRewardMainUI.r(this.kEC) });
    e.n(this.kEC.mController.ylL, QrRewardMainUI.r(this.kEC), false);
    h.pYm.e(14721, new Object[] { Integer.valueOf(1), Integer.valueOf(6) });
    AppMethodBeat.o(41090);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.7
 * JD-Core Version:    0.6.2
 */