package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bib extends com.tencent.mm.bt.a
{
  public int wLr;
  public String wLs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28570);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wLr);
      if (this.wLs != null)
        paramArrayOfObject.e(2, this.wLs);
      AppMethodBeat.o(28570);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wLr) + 0;
        paramInt = i;
        if (this.wLs != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wLs);
        AppMethodBeat.o(28570);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28570);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bib localbib = (bib)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28570);
          paramInt = -1;
          break;
        case 1:
          localbib.wLr = locala.BTU.vd();
          AppMethodBeat.o(28570);
          paramInt = 0;
          break;
        case 2:
          localbib.wLs = locala.BTU.readString();
          AppMethodBeat.o(28570);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(28570);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bib
 * JD-Core Version:    0.6.2
 */