package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ayu extends com.tencent.mm.bt.a
{
  public String luG;
  public double vNH;
  public double vNI;
  public String wCI;
  public String wCJ;
  public String wCK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28541);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.f(1, this.vNI);
      paramArrayOfObject.f(2, this.vNH);
      if (this.luG != null)
        paramArrayOfObject.e(3, this.luG);
      if (this.wCI != null)
        paramArrayOfObject.e(4, this.wCI);
      if (this.wCJ != null)
        paramArrayOfObject.e(5, this.wCJ);
      if (this.wCK != null)
        paramArrayOfObject.e(6, this.wCK);
      AppMethodBeat.o(28541);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.fv(1) + 8 + 0 + (e.a.a.b.b.a.fv(2) + 8);
        paramInt = i;
        if (this.luG != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.luG);
        i = paramInt;
        if (this.wCI != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.wCI);
        paramInt = i;
        if (this.wCJ != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.wCJ);
        i = paramInt;
        if (this.wCK != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.wCK);
        AppMethodBeat.o(28541);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28541);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ayu localayu = (ayu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28541);
          break;
        case 1:
          localayu.vNI = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(28541);
          paramInt = 0;
          break;
        case 2:
          localayu.vNH = Double.longBitsToDouble(locala.BTU.eib());
          AppMethodBeat.o(28541);
          paramInt = 0;
          break;
        case 3:
          localayu.luG = locala.BTU.readString();
          AppMethodBeat.o(28541);
          paramInt = 0;
          break;
        case 4:
          localayu.wCI = locala.BTU.readString();
          AppMethodBeat.o(28541);
          paramInt = 0;
          break;
        case 5:
          localayu.wCJ = locala.BTU.readString();
          AppMethodBeat.o(28541);
          paramInt = 0;
          break;
        case 6:
          localayu.wCK = locala.BTU.readString();
          AppMethodBeat.o(28541);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28541);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ayu
 * JD-Core Version:    0.6.2
 */