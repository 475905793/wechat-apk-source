package com.tencent.mm.ak;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  private static int fyi = 0;
  private static int fyj = 0;

  public static String a(a.a parama)
  {
    AppMethodBeat.i(16427);
    if (parama == null)
    {
      parama = "";
      AppMethodBeat.o(16427);
    }
    while (true)
    {
      return parama;
      StringBuilder localStringBuilder = new StringBuilder("");
      localStringBuilder.append(bo.nullAsNil(parama.fys));
      localStringBuilder.append("\n-------------------\n");
      localStringBuilder.append(bo.nullAsNil(parama.fyq));
      localStringBuilder.append("\n-------------------\n");
      localStringBuilder.append(bo.nullAsNil(parama.fyn));
      parama = localStringBuilder.toString();
      AppMethodBeat.o(16427);
    }
  }

  public static String b(a.a parama)
  {
    AppMethodBeat.i(16428);
    StringBuilder localStringBuilder = new StringBuilder("");
    if (!r.mG(parama.cEV))
    {
      localStringBuilder.append(parama.fyk);
      localStringBuilder.append(": ");
    }
    if (bo.isNullOrNil(parama.fys))
      if (bo.isNullOrNil(parama.fyq))
        parama = parama.fyn;
    while (true)
    {
      localStringBuilder.append(parama);
      parama = localStringBuilder.toString();
      AppMethodBeat.o(16428);
      return parama;
      parama = parama.fyq;
      continue;
      parama = parama.fys;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.a
 * JD-Core Version:    0.6.2
 */