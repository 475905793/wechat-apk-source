package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cfn extends bsr
{
  public cad xeP;
  public String xeR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56983);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.xeP != null)
      {
        paramArrayOfObject.iy(2, this.xeP.computeSize());
        this.xeP.writeFields(paramArrayOfObject);
      }
      if (this.xeR != null)
        paramArrayOfObject.e(3, this.xeR);
      AppMethodBeat.o(56983);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label545;
    label545: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xeP != null)
        paramInt = i + e.a.a.a.ix(2, this.xeP.computeSize());
      i = paramInt;
      if (this.xeR != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.xeR);
      AppMethodBeat.o(56983);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56983);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cfn localcfn = (cfn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56983);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcfn.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56983);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cad();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcfn.xeP = paramArrayOfObject;
          }
          AppMethodBeat.o(56983);
          paramInt = i;
          break;
        case 3:
          localcfn.xeR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56983);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56983);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cfn
 * JD-Core Version:    0.6.2
 */