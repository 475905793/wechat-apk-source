package com.tencent.mm.plugin.fingerprint.b;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.i;

final class r$5
  implements View.OnClickListener
{
  r$5(r paramr, CheckBox paramCheckBox, i parami)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41565);
    ab.i("MicroMsg.WalletSoterService", "click cancel btn");
    if (this.msm.isChecked())
      g.RP().Ry().set(ac.a.xKQ, Boolean.TRUE);
    this.iGU.dismiss();
    AppMethodBeat.o(41565);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.r.5
 * JD-Core Version:    0.6.2
 */