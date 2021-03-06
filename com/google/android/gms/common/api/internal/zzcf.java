package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzcf extends TaskApiCall<A, ResultT>
{
  zzcf(TaskApiCall.Builder paramBuilder, Feature[] paramArrayOfFeature, boolean paramBoolean)
  {
    super(paramArrayOfFeature, paramBoolean, null);
  }

  protected final void doExecute(A paramA, TaskCompletionSource<ResultT> paramTaskCompletionSource)
  {
    AppMethodBeat.i(60875);
    TaskApiCall.Builder.zza(this.zzmc).accept(paramA, paramTaskCompletionSource);
    AppMethodBeat.o(60875);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzcf
 * JD-Core Version:    0.6.2
 */