package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.xweb.x5.sdk.f.a;

final class AppBrandTBSDownloadProxyUI$2
  implements f.a
{
  AppBrandTBSDownloadProxyUI$2(AppBrandTBSDownloadProxyUI paramAppBrandTBSDownloadProxyUI)
  {
  }

  public final void onNeedDownloadFinish(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(133100);
    if ((paramBoolean) && (paramInt >= 36824))
    {
      ab.i("MicroMsg.AppBrandTBSDownloadProxyUI", "try to get need download success result %s version %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
      al.d(new AppBrandTBSDownloadProxyUI.2.1(this));
      AppMethodBeat.o(133100);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrandTBSDownloadProxyUI", "try to get need download fail result %s version %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
      Intent localIntent = new Intent();
      this.iIJ.setResult(0, localIntent);
      this.iIJ.finish();
      AppMethodBeat.o(133100);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandTBSDownloadProxyUI.2
 * JD-Core Version:    0.6.2
 */