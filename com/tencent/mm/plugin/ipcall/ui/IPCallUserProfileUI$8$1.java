package com.tencent.mm.plugin.ipcall.ui;

import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class IPCallUserProfileUI$8$1
  implements a.a
{
  IPCallUserProfileUI$8$1(IPCallUserProfileUI.8 param8)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(22378);
    ab.d("MicroMsg.IPCallUserProfileUI", "canAddContact, ok: %b, hasSentVerify: %b, respUsername: %s, itemID: %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), paramString1, paramString2 });
    if (paramBoolean1)
    {
      IPCallUserProfileUI.a(this.nGt.nGq).setVisibility(8);
      IPCallUserProfileUI.b(this.nGt.nGq).setVisibility(8);
      IPCallUserProfileUI.b(this.nGt.nGq, paramString1);
    }
    AppMethodBeat.o(22378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.8.1
 * JD-Core Version:    0.6.2
 */