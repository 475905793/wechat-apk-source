package com.tencent.mm.plugin.freewifi.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class b
{
  b.a mvB;
  BroadcastReceiver mvC;

  private b()
  {
    AppMethodBeat.i(20692);
    this.mvB = new b.a((byte)0);
    this.mvC = new b.1(this);
    AppMethodBeat.o(20692);
  }

  static void a(b.a parama1, b.a parama2)
  {
    AppMethodBeat.i(20694);
    m.MA("on mobile connected.");
    ab.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "onMobileConnected. lastRecord=%s, newRecord=%s", new Object[] { parama1.toString(), parama2.toString() });
    com.tencent.mm.plugin.freewifi.f.b.kT(0);
    AppMethodBeat.o(20694);
  }

  static void b(b.a parama1, b.a parama2)
  {
    AppMethodBeat.i(20695);
    m.MA("on wifi connected.");
    ab.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "onWifiConnected. lastRecord=%s, newRecord=%s", new Object[] { parama1.toString(), parama2.toString() });
    if ((parama1.type == 1) && (parama1.ssid.equals(parama2.ssid)) && (!parama1.bssid.equals(parama2.bssid)))
    {
      String str = parama1.ssid;
      parama1 = parama1.bssid;
      parama2 = parama2.bssid;
      m.MA("on wifi roaming.");
      ab.i("MicroMsg.FreeWifi.FreeWifiConnChangedManager", "WifiRoaming. ssid=%s, fromBssid=%s, toBssid=%s", new Object[] { str, parama1, parama2 });
    }
    com.tencent.mm.plugin.freewifi.f.b.kT(1);
    AppMethodBeat.o(20695);
  }

  public final void byc()
  {
    AppMethodBeat.i(20693);
    try
    {
      ah.getContext().unregisterReceiver(this.mvC);
      AppMethodBeat.o(20693);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        AppMethodBeat.o(20693);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.b
 * JD-Core Version:    0.6.2
 */