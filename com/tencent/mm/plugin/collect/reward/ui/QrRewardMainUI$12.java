package com.tencent.mm.plugin.collect.reward.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.sdk.platformtools.ab;

final class QrRewardMainUI$12
  implements o.a
{
  QrRewardMainUI$12(QrRewardMainUI paramQrRewardMainUI)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(41095);
    ab.i("MicroMsg.QrRewardMainUI", "click save code");
    QrRewardMainUI.b(this.kEC);
    h.pYm.e(14721, new Object[] { Integer.valueOf(1), Integer.valueOf(5) });
    AppMethodBeat.o(41095);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.12
 * JD-Core Version:    0.6.2
 */