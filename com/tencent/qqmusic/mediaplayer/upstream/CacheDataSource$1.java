package com.tencent.qqmusic.mediaplayer.upstream;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.downstream.IDataSink;

class CacheDataSource$1
  implements Loader.Factory
{
  CacheDataSource$1(Looper paramLooper, IDataSource paramIDataSource, IDataSink paramIDataSink)
  {
  }

  public Loader createLoader(Loader.Listener paramListener)
  {
    AppMethodBeat.i(104565);
    paramListener = new CacheDataSource.1.1(this, this.val$eventLooper, new DummyUriLoader(null), paramListener);
    AppMethodBeat.o(104565);
    return paramListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.1
 * JD-Core Version:    0.6.2
 */