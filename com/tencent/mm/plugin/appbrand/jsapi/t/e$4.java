package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.b;

final class e$4
  implements MenuItem.OnMenuItemClickListener
{
  e$4(e parame, String paramString)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(17031);
    try
    {
      bool = e.i(this.icM).isSDCardAvailable();
    }
    catch (Exception paramMenuItem)
    {
      try
      {
        while (true)
        {
          u.a(e.g(this.icM), this.icQ, b.dTR().getCookie(this.icQ), bool);
          AppMethodBeat.o(17031);
          return true;
          paramMenuItem = paramMenuItem;
          ab.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "onMenuItemClick fail, ex = " + paramMenuItem.getMessage());
          boolean bool = false;
        }
      }
      catch (Exception paramMenuItem)
      {
        while (true)
          ab.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "save to sdcard failed : %s", new Object[] { paramMenuItem.getMessage() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.e.4
 * JD-Core Version:    0.6.2
 */