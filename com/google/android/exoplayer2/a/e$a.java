package com.google.android.exoplayer2.a;

import android.os.Handler;
import com.google.android.exoplayer2.b.d;
import com.google.android.exoplayer2.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e$a
{
  final e aPH;
  final Handler handler;

  public e$a(Handler paramHandler, e parame)
  {
    AppMethodBeat.i(94658);
    if (parame != null);
    for (paramHandler = (Handler)a.checkNotNull(paramHandler); ; paramHandler = null)
    {
      this.handler = paramHandler;
      this.aPH = parame;
      AppMethodBeat.o(94658);
      return;
    }
  }

  public final void e(d paramd)
  {
    AppMethodBeat.i(94659);
    if (this.aPH != null)
      this.handler.post(new e.a.5(this, paramd));
    AppMethodBeat.o(94659);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.e.a
 * JD-Core Version:    0.6.2
 */