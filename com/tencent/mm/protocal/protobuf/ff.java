package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ff extends com.tencent.mm.bt.a
{
  public LinkedList<fg> vHk;

  public ff()
  {
    AppMethodBeat.i(28317);
    this.vHk = new LinkedList();
    AppMethodBeat.o(28317);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28318);
    if (paramInt == 0)
    {
      ((e.a.a.c.a)paramArrayOfObject[0]).e(1, 8, this.vHk);
      AppMethodBeat.o(28318);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.a.c(1, 8, this.vHk) + 0;
        AppMethodBeat.o(28318);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vHk.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28318);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ff localff = (ff)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(28318);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new fg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localff.vHk.add(localObject1);
          }
          AppMethodBeat.o(28318);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(28318);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ff
 * JD-Core Version:    0.6.2
 */