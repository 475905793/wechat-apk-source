package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.a;

final class WalletCheckPwdUI$7
  implements c.a
{
  WalletCheckPwdUI$7(WalletCheckPwdUI paramWalletCheckPwdUI)
  {
  }

  public final Intent n(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(47339);
    ab.i("Micromsg.WalletCheckPwdUI", "verify code end: %s", new Object[] { Integer.valueOf(paramInt) });
    Intent localIntent = new Intent();
    localIntent.putExtra("token", paramBundle.getString("key_jsapi_token"));
    localIntent.putExtra("key_process_result_code", paramInt);
    localIntent.setClass(this.tHs.mController.ylL, WalletCheckPwdUI.class);
    localIntent.addFlags(536870912);
    localIntent.putExtra("key_process_is_stay", false);
    AppMethodBeat.o(47339);
    return localIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.7
 * JD-Core Version:    0.6.2
 */