package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bwc extends btd
{
  public String fKh;
  public int jCt;
  public String ndF;
  public String ndG;
  public int pcX;
  public int ptD;
  public long ptF;
  public String vFF;
  public String vRw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28630);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28630);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      if (this.ndG != null)
        paramArrayOfObject.e(3, this.ndG);
      if (this.ndF != null)
        paramArrayOfObject.e(4, this.ndF);
      paramArrayOfObject.iz(5, this.ptD);
      if (this.vFF != null)
        paramArrayOfObject.e(6, this.vFF);
      paramArrayOfObject.iz(7, this.pcX);
      paramArrayOfObject.iz(8, this.jCt);
      paramArrayOfObject.ai(9, this.ptF);
      if (this.vRw != null)
        paramArrayOfObject.e(10, this.vRw);
      AppMethodBeat.o(28630);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label899;
    label899: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fKh);
      paramInt = i;
      if (this.ndG != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ndG);
      i = paramInt;
      if (this.ndF != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.ndF);
      i += e.a.a.b.b.a.bs(5, this.ptD);
      paramInt = i;
      if (this.vFF != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vFF);
      i = paramInt + e.a.a.b.b.a.bs(7, this.pcX) + e.a.a.b.b.a.bs(8, this.jCt) + e.a.a.b.b.a.o(9, this.ptF);
      paramInt = i;
      if (this.vRw != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vRw);
      AppMethodBeat.o(28630);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28630);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28630);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bwc localbwc = (bwc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28630);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbwc.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28630);
          paramInt = i;
          break;
        case 2:
          localbwc.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28630);
          paramInt = i;
          break;
        case 3:
          localbwc.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28630);
          paramInt = i;
          break;
        case 4:
          localbwc.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28630);
          paramInt = i;
          break;
        case 5:
          localbwc.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28630);
          paramInt = i;
          break;
        case 6:
          localbwc.vFF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28630);
          paramInt = i;
          break;
        case 7:
          localbwc.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28630);
          paramInt = i;
          break;
        case 8:
          localbwc.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28630);
          paramInt = i;
          break;
        case 9:
          localbwc.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28630);
          paramInt = i;
          break;
        case 10:
          localbwc.vRw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28630);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28630);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bwc
 * JD-Core Version:    0.6.2
 */