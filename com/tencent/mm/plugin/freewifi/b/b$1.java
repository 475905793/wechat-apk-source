package com.tencent.mm.plugin.freewifi.b;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ah;

final class b$1
  implements Runnable
{
  b$1(b paramb, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20668);
    Intent localIntent = new Intent();
    localIntent.putExtra("free_wifi_ap_key", this.muV);
    localIntent.putExtra("free_wifi_sessionkey", m.bys());
    localIntent.putExtra("free_wifi_source", 6);
    localIntent.addFlags(67108864);
    d.b(ah.getContext(), "freewifi", ".ui.FreeWifiEntryUI", localIntent);
    AppMethodBeat.o(20668);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.b.b.1
 * JD-Core Version:    0.6.2
 */