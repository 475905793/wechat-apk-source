package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.service.j.a;
import com.tencent.mm.sdk.platformtools.ab;

final class h$1 extends j.a
{
  h$1(h paramh)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19274);
    ab.d(h.TAG, "onScanCallback. messageType=%d, errCode=%d, errMsg=%s, deviceMac=%s, deviceName=%s, rssi=%d, advertisment=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, paramString2, paramString3, Integer.valueOf(paramInt3), b.aN(paramArrayOfByte) });
    if (1 == paramInt1)
      ad.bph().o(paramString3, paramString2, false);
    while (true)
    {
      if (ad.boW().id(b.KK(paramString2)) != null)
        ab.d(h.TAG, "the founded device hasn't been binded");
      AppMethodBeat.o(19274);
      return;
      if (2 == paramInt1)
        ad.bph().o(paramString3, paramString2, true);
      else
        ab.e(h.TAG, "unknown message type %d", new Object[] { Integer.valueOf(paramInt1) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.h.1
 * JD-Core Version:    0.6.2
 */