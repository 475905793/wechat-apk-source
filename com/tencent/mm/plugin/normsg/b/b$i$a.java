package com.tencent.mm.plugin.normsg.b;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$i$a<T> extends SparseArray<T>
{
  private b$i$a(b.i parami)
  {
  }

  public final void clear()
  {
    AppMethodBeat.i(10413);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(10413);
    throw localUnsupportedOperationException;
  }

  public final void put(int paramInt, T paramT)
  {
    AppMethodBeat.i(10414);
    if (get(paramInt) != null)
    {
      paramT = new UnsupportedOperationException();
      AppMethodBeat.o(10414);
      throw paramT;
    }
    super.put(paramInt, paramT);
    AppMethodBeat.o(10414);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.b.i.a
 * JD-Core Version:    0.6.2
 */