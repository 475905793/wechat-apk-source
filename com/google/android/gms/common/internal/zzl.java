package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.TimeUnit;

final class zzl
  implements PendingResult.StatusListener
{
  zzl(PendingResult paramPendingResult, TaskCompletionSource paramTaskCompletionSource, PendingResultUtil.ResultConverter paramResultConverter, PendingResultUtil.StatusConverter paramStatusConverter)
  {
  }

  public final void onComplete(Status paramStatus)
  {
    AppMethodBeat.i(61408);
    if (paramStatus.isSuccess())
    {
      paramStatus = this.zzuo.await(0L, TimeUnit.MILLISECONDS);
      this.zzup.setResult(this.zzuq.convert(paramStatus));
      AppMethodBeat.o(61408);
    }
    while (true)
    {
      return;
      this.zzup.setException(this.zzur.convert(paramStatus));
      AppMethodBeat.o(61408);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.zzl
 * JD-Core Version:    0.6.2
 */