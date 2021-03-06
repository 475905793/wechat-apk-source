package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Executor;

public class HandlerExecutor
  implements Executor
{
  private final Handler handler;

  public HandlerExecutor(Handler paramHandler)
  {
    this(paramHandler.getLooper());
    AppMethodBeat.i(90298);
    AppMethodBeat.o(90298);
  }

  public HandlerExecutor(Looper paramLooper)
  {
    AppMethodBeat.i(90299);
    this.handler = new Handler(paramLooper);
    AppMethodBeat.o(90299);
  }

  public void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(90300);
    this.handler.post(paramRunnable);
    AppMethodBeat.o(90300);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.concurrent.HandlerExecutor
 * JD-Core Version:    0.6.2
 */