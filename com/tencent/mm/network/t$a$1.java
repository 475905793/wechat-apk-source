package com.tencent.mm.network;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.bo;

final class t$a$1 extends bj<Object>
{
  t$a$1(t.a parama, r paramr, int paramInt1, int paramInt2, String paramString)
  {
    super(1000L, null, (byte)0);
  }

  public final Object run()
  {
    AppMethodBeat.i(58565);
    try
    {
      t.a(t.a.a(this.gdC), this.gdA, this.gdB);
      AppMethodBeat.o(58565);
      return null;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        ab.e("MicroMsg.MMAutoAuth", "exception:%s", new Object[] { bo.l(localRemoteException) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.t.a.1
 * JD-Core Version:    0.6.2
 */