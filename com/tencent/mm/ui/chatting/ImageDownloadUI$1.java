package com.tencent.mm.ui.chatting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;

final class ImageDownloadUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ImageDownloadUI$1(ImageDownloadUI paramImageDownloadUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(30945);
    aw.Rg().c(ImageDownloadUI.a(this.yLM));
    this.yLM.finish();
    AppMethodBeat.o(30945);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ImageDownloadUI.1
 * JD-Core Version:    0.6.2
 */