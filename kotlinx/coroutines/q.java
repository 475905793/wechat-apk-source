package kotlinx.coroutines;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/CompletedExceptionally;", "", "cause", "", "(Ljava/lang/Throwable;)V", "toString", "", "kotlinx-coroutines-core"})
public class q
{
  public final Throwable cause;

  public q(Throwable paramThrowable)
  {
    AppMethodBeat.i(118475);
    this.cause = paramThrowable;
    AppMethodBeat.o(118475);
  }

  public String toString()
  {
    AppMethodBeat.i(118474);
    String str = af.ef(this) + '[' + this.cause + ']';
    AppMethodBeat.o(118474);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.q
 * JD-Core Version:    0.6.2
 */