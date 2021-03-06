package com.tencent.mm.plugin.offline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.offline.c.a;
import com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class h extends c
{
  public final void F(Activity paramActivity)
  {
    int i = 2;
    AppMethodBeat.i(43335);
    int j;
    if (paramActivity != null)
    {
      j = this.mqu.getInt("offline_from_scene", -1);
      if (j != 1)
        break label96;
    }
    while (true)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(14096, new Object[] { Integer.valueOf(i) });
      Intent localIntent = new Intent(paramActivity, WalletOfflineEntranceUI.class);
      localIntent.putExtra("key_from_scene", j);
      localIntent.putExtra("is_offline_create", true);
      a(paramActivity, WalletOfflineEntranceUI.class, localIntent);
      paramActivity.finish();
      AppMethodBeat.o(43335);
      return;
      label96: if (j == 2)
        i = 1;
      else if (j == 3)
        i = 3;
      else if (j == 4)
        i = 6;
      else if (j == 8)
        i = 4;
      else
        i = 1;
    }
  }

  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(43331);
    b(paramActivity, WalletCheckPwdUI.class, paramBundle);
    AppMethodBeat.o(43331);
    return this;
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(43336);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new h.1(this, paramMMActivity, parami);
      AppMethodBeat.o(43336);
    }
    while (true)
    {
      return paramMMActivity;
      paramMMActivity = super.a(paramMMActivity, parami);
      AppMethodBeat.o(43336);
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(43332);
    if ((paramActivity instanceof WalletCheckPwdUI))
      F(paramActivity);
    AppMethodBeat.o(43332);
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(43334);
    F(paramActivity);
    if ((paramBundle != null) && (paramBundle.getBoolean("is_offline_create")))
      a.W((WalletBaseUI)paramActivity);
    AppMethodBeat.o(43334);
  }

  public final String bxP()
  {
    return "OfflineProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(43333);
    if (paramActivity != null)
      paramActivity.finish();
    AppMethodBeat.o(43333);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.h
 * JD-Core Version:    0.6.2
 */