package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ami extends bsr
{
  public String appId;
  public String cxb;
  public int mzT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28456);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.appId != null)
        paramArrayOfObject.e(2, this.appId);
      paramArrayOfObject.iz(3, this.mzT);
      if (this.cxb != null)
        paramArrayOfObject.e(4, this.cxb);
      AppMethodBeat.o(28456);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label507;
    label507: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.appId != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.appId);
      i += e.a.a.b.b.a.bs(3, this.mzT);
      paramInt = i;
      if (this.cxb != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.cxb);
      AppMethodBeat.o(28456);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28456);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ami localami = (ami)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28456);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localami.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28456);
          paramInt = i;
          break;
        case 2:
          localami.appId = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28456);
          paramInt = i;
          break;
        case 3:
          localami.mzT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28456);
          paramInt = i;
          break;
        case 4:
          localami.cxb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28456);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28456);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ami
 * JD-Core Version:    0.6.2
 */