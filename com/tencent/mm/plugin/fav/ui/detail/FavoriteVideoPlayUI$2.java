package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.fav.a.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.vfs.e;

final class FavoriteVideoPlayUI$2
  implements View.OnLongClickListener
{
  FavoriteVideoPlayUI$2(FavoriteVideoPlayUI paramFavoriteVideoPlayUI)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(74460);
    paramView.getTag();
    paramView = new j(this.mne.mController.ylL);
    paramView.rBl = new FavoriteVideoPlayUI.2.1(this);
    paramView.rBm = new n.d()
    {
      public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        AppMethodBeat.i(74459);
        switch (paramAnonymousMenuItem.getItemId())
        {
        default:
        case 1:
        case 2:
        }
        while (true)
        {
          AppMethodBeat.o(74459);
          label37: return;
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("Select_Conv_Type", 3);
          paramAnonymousMenuItem.putExtra("select_is_ret", true);
          paramAnonymousMenuItem.putExtra("mutil_select_is_ret", true);
          if (e.ct(FavoriteVideoPlayUI.b(FavoriteVideoPlayUI.2.this.mne)))
            paramAnonymousMenuItem.putExtra("image_path", FavoriteVideoPlayUI.b(FavoriteVideoPlayUI.2.this.mne));
          while (true)
          {
            paramAnonymousMenuItem.putExtra("Retr_Msg_Type", 1);
            d.b(FavoriteVideoPlayUI.2.this.mne.mController.ylL, ".ui.transmit.SelectConversationUI", paramAnonymousMenuItem, 1);
            if (FavoriteVideoPlayUI.d(FavoriteVideoPlayUI.2.this.mne) != 0)
              break;
            h.j(FavoriteVideoPlayUI.2.this.mne.getIntent().getLongExtra("key_detail_info_id", 0L), 1, 0);
            AppMethodBeat.o(74459);
            break label37;
            paramAnonymousMenuItem.putExtra("image_path", FavoriteVideoPlayUI.c(FavoriteVideoPlayUI.2.this.mne));
          }
          FavoriteVideoPlayUI.f(FavoriteVideoPlayUI.c(FavoriteVideoPlayUI.2.this.mne), FavoriteVideoPlayUI.2.this.mne);
        }
      }
    };
    paramView.cuu();
    AppMethodBeat.o(74460);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteVideoPlayUI.2
 * JD-Core Version:    0.6.2
 */