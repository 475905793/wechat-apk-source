package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class p extends com.tencent.mm.bt.a
{
  public String color;
  public String value;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35542);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.color != null)
        paramArrayOfObject.e(1, this.color);
      if (this.value != null)
        paramArrayOfObject.e(2, this.value);
      AppMethodBeat.o(35542);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.color == null)
        break label294;
    label294: for (paramInt = e.a.a.b.b.a.f(1, this.color) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.value != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.value);
      AppMethodBeat.o(35542);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35542);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        p localp = (p)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(35542);
          paramInt = -1;
          break;
        case 1:
          localp.color = locala.BTU.readString();
          AppMethodBeat.o(35542);
          paramInt = i;
          break;
        case 2:
          localp.value = locala.BTU.readString();
          AppMethodBeat.o(35542);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(35542);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.p
 * JD-Core Version:    0.6.2
 */