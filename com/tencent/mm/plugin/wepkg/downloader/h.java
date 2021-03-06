package com.tencent.mm.plugin.wepkg.downloader;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class h extends ThreadPoolExecutor
{
  public h(TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue, ThreadFactory paramThreadFactory)
  {
    super(3, 3, 3000L, paramTimeUnit, paramBlockingQueue, paramThreadFactory);
  }

  protected final void afterExecute(Runnable paramRunnable, Throwable paramThrowable)
  {
    AppMethodBeat.i(63452);
    if ((paramRunnable instanceof e))
    {
      e locale = (e)paramRunnable;
      if ((locale.uWn != null) && (locale.uWn.uVO != null))
      {
        d.dgw().ahO(locale.uWn.uVO.uWo);
        ab.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "remove download task");
      }
    }
    ab.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "afterExecute");
    super.afterExecute(paramRunnable, paramThrowable);
    AppMethodBeat.o(63452);
  }

  protected final void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
    AppMethodBeat.i(63451);
    super.beforeExecute(paramThread, paramRunnable);
    ab.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "beforeExecute");
    AppMethodBeat.o(63451);
  }

  protected final <V> RunnableFuture<V> newTaskFor(Runnable paramRunnable, V paramV)
  {
    AppMethodBeat.i(63449);
    if ((paramRunnable instanceof c))
    {
      paramRunnable = new e(paramRunnable, paramV, (c)paramRunnable);
      AppMethodBeat.o(63449);
    }
    while (true)
    {
      return paramRunnable;
      paramRunnable = super.newTaskFor(paramRunnable, paramV);
      AppMethodBeat.o(63449);
    }
  }

  protected final void terminated()
  {
    AppMethodBeat.i(63450);
    d locald = d.dgw();
    if (locald.uVY != null)
      locald.uVY.clear();
    super.terminated();
    AppMethodBeat.o(63450);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.downloader.h
 * JD-Core Version:    0.6.2
 */