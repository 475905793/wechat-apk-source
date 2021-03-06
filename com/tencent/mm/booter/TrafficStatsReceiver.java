package com.tencent.mm.booter;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bn;

public class TrafficStatsReceiver extends BroadcastReceiver
{
  private long mLastTime = -1L;

  public static void bu(Context paramContext)
  {
    AppMethodBeat.i(57817);
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    paramContext = PendingIntent.getBroadcast(paramContext, 1, new Intent("com.tencent.mm.TrafficStatsReceiver"), 268435456);
    localAlarmManager.setRepeating(3, SystemClock.elapsedRealtime(), 300000L, paramContext);
    ab.i("MicroMsg.TrafficStats", "Register alarm, interval: %d ms", new Object[] { Long.valueOf(300000L) });
    AppMethodBeat.o(57817);
  }

  public static void bv(Context paramContext)
  {
    AppMethodBeat.i(57818);
    ((AlarmManager)paramContext.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(paramContext, 1, new Intent("com.tencent.mm.TrafficStatsReceiver"), 268435456));
    AppMethodBeat.o(57818);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(57816);
    ab.d("MicroMsg.TrafficStats", "onRecieve");
    long l1 = SystemClock.elapsedRealtime();
    bn.update();
    if (this.mLastTime >= 0L)
    {
      long l2 = l1 - this.mLastTime;
      long l3 = bn.dpx() + bn.dpw();
      long l4 = bn.dpv() + bn.dpu();
      long l5 = bn.mv(0L) + bn.mu(0L);
      long l6 = bn.mv(0L) + bn.mu(0L);
      ab.i("MicroMsg.TrafficStats", "Time: %d ms, System - [Mobile: %d, Wifi: %d, Speed: %.2f], WeChat - [Mobile: %d, Wifi: %d, Speed: %.2f]", new Object[] { Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Double.valueOf((l3 + l4) / (l2 / 1000L)), Long.valueOf(l5), Long.valueOf(l6), Double.valueOf((l5 + l6) / (l2 / 1000L)) });
    }
    this.mLastTime = l1;
    AppMethodBeat.o(57816);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.TrafficStatsReceiver
 * JD-Core Version:    0.6.2
 */