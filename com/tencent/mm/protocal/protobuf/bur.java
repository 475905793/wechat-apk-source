package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bur extends com.tencent.mm.bt.a
{
  public int Timestamp;
  public int nbk;
  public int wWg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124345);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wWg);
      paramArrayOfObject.iz(2, this.Timestamp);
      paramArrayOfObject.iz(3, this.nbk);
      AppMethodBeat.o(124345);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wWg) + 0 + e.a.a.b.b.a.bs(2, this.Timestamp) + e.a.a.b.b.a.bs(3, this.nbk);
        AppMethodBeat.o(124345);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124345);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bur localbur = (bur)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124345);
          break;
        case 1:
          localbur.wWg = locala.BTU.vd();
          AppMethodBeat.o(124345);
          paramInt = 0;
          break;
        case 2:
          localbur.Timestamp = locala.BTU.vd();
          AppMethodBeat.o(124345);
          paramInt = 0;
          break;
        case 3:
          localbur.nbk = locala.BTU.vd();
          AppMethodBeat.o(124345);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124345);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bur
 * JD-Core Version:    0.6.2
 */