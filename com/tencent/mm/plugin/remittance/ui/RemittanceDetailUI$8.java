package com.tencent.mm.plugin.remittance.ui;

import android.app.Dialog;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.d.a;

final class RemittanceDetailUI$8
  implements d.a
{
  RemittanceDetailUI$8(RemittanceDetailUI paramRemittanceDetailUI, Dialog paramDialog)
  {
  }

  public final void bi(Object paramObject)
  {
    AppMethodBeat.i(45003);
    if (this.mhZ != null)
      this.mhZ.dismiss();
    ab.i("MicroMsg.RemittanceDetailUI", "fetch detail failed: %s", new Object[] { paramObject });
    if (paramObject != null)
      if (!(paramObject instanceof String))
        break label68;
    label68: for (paramObject = paramObject.toString(); ; paramObject = this.pVw.getString(2131304945))
    {
      Toast.makeText(this.pVw, paramObject, 1).show();
      AppMethodBeat.o(45003);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.8
 * JD-Core Version:    0.6.2
 */