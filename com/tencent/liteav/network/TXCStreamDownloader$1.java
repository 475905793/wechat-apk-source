package com.tencent.liteav.network;

import com.tencent.matrix.trace.core.AppMethodBeat;

class TXCStreamDownloader$1
  implements Runnable
{
  TXCStreamDownloader$1(TXCStreamDownloader paramTXCStreamDownloader)
  {
  }

  public void run()
  {
    AppMethodBeat.i(67545);
    this.a.stop();
    this.a.start(TXCStreamDownloader.access$000(this.a), TXCStreamDownloader.access$100(this.a), TXCStreamDownloader.access$200(this.a), TXCStreamDownloader.access$300(this.a));
    AppMethodBeat.o(67545);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.TXCStreamDownloader.1
 * JD-Core Version:    0.6.2
 */