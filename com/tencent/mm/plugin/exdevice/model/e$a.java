package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.b.a.f;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class e$a
  implements e.b
{
  private String cbq;
  private String lst;
  private String lsu;
  private String mURL;

  public e$a(e parame, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(19211);
    this.lst = paramString1;
    this.cbq = paramString2;
    this.mURL = paramString3;
    this.lsu = paramString4;
    ab.d("MicroMsg.exdevice.ExdeviceEventManager", "brandName : %s, mac : %s.", new Object[] { paramString1, paramString2 });
    AppMethodBeat.o(19211);
  }

  public final void b(String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(19213);
    if ((this.cbq == null) || (!this.cbq.equals(paramString)))
    {
      ab.i("MicroMsg.exdevice.ExdeviceEventManager", "onRecvFromDevice, mac(%s) is null or not correct.(mac : %s, succ : %s)", new Object[] { this.cbq, paramString, Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(19213);
    }
    while (true)
    {
      return;
      if ((paramBoolean) && (paramArrayOfByte != null))
        try
        {
          ad.bph();
          if (!e.c(this.cbq, this.lst, paramArrayOfByte))
          {
            ab.w("MicroMsg.exdevice.ExdeviceEventManager", "The parser isn't a correct type.");
            AppMethodBeat.o(19213);
            continue;
          }
          AppMethodBeat.o(19213);
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.exdevice.ExdeviceEventManager", "Read data from bytes failed.");
        }
      else
        AppMethodBeat.o(19213);
    }
  }

  public final void c(String paramString, int paramInt, long paramLong)
  {
    AppMethodBeat.i(19214);
    if ((this.cbq == null) || (!this.cbq.equals(paramString)))
    {
      ab.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, mac(%s) is null or not correct.(mac : %s, state : %s, type : %s)", new Object[] { this.cbq, paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
      AppMethodBeat.o(19214);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.exdevice.ExdeviceEventManager", "mac(%s), connectState(%s), profileType(%s)", new Object[] { paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
      switch (paramInt)
      {
      case 3:
      default:
        ab.d("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, out of range(mac : %s, state : %s, type : %s).", new Object[] { paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
        e.b(this.lst, this.mURL, -1, this.lsu);
        AppMethodBeat.o(19214);
        break;
      case 2:
        ab.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device connected now start send data to it.(mac : %s)", new Object[] { paramString });
        e.b(this.lst, this.mURL, 2, this.lsu);
        paramString = new f();
        paramString.jHc = f.jIf;
        paramString.jHd = 2;
        ad.bph().u(this.cbq, b.bQ(paramString));
        AppMethodBeat.o(19214);
        break;
      case 1:
        ab.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device is connectiong.(mac: %s)", new Object[] { paramString });
        e.b(this.lst, this.mURL, 1, this.lsu);
        AppMethodBeat.o(19214);
        break;
      case 4:
        e.b(this.lst, this.mURL, 4, this.lsu);
        ab.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device disconnected.(mac : %s)", new Object[] { paramString });
        AppMethodBeat.o(19214);
        break;
      case 0:
        e.b(this.lst, this.mURL, 0, this.lsu);
        ab.i("MicroMsg.exdevice.ExdeviceEventManager", "onConnectStateChanged, device state none.(mac : %s)", new Object[] { paramString });
        AppMethodBeat.o(19214);
      }
    }
  }

  public final void p(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(19212);
    if ((this.cbq == null) || (!this.cbq.equals(paramString2)))
    {
      ab.d("MicroMsg.exdevice.ExdeviceEventManager", "onScanResult, mac(%s) is null or not correct.(mac : %s, isCompleted : %s)", new Object[] { this.cbq, paramString2, Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(19212);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(19212);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.e.a
 * JD-Core Version:    0.6.2
 */