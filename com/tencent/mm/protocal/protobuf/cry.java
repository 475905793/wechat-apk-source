package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cry extends com.tencent.mm.bt.a
{
  public String xps;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28710);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xps != null)
        paramArrayOfObject.e(1, this.xps);
      AppMethodBeat.o(28710);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xps == null)
        break label234;
    label234: for (paramInt = e.a.a.b.b.a.f(1, this.xps) + 0; ; paramInt = 0)
    {
      AppMethodBeat.o(28710);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28710);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cry localcry = (cry)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28710);
          paramInt = -1;
          break;
        case 1:
          localcry.xps = locala.BTU.readString();
          AppMethodBeat.o(28710);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28710);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cry
 * JD-Core Version:    0.6.2
 */