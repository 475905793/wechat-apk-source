package com.tencent.mm.plugin.appbrand.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.sdk.platformtools.al;

final class f$1 extends BroadcastReceiver
{
  f$1(f paramf)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(114319);
    if (paramIntent == null)
      AppMethodBeat.o(114319);
    while (true)
    {
      return;
      if ("android.intent.action.SCREEN_OFF".equals(paramIntent.getAction()))
        e.aNS().aa(new f.1.1(this));
      AppMethodBeat.o(114319);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b.f.1
 * JD-Core Version:    0.6.2
 */