package com.eclipsesource.v8.utils.typedarrays;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class Int16Array extends TypedArray
{
  public Int16Array(ArrayBuffer paramArrayBuffer)
  {
    this(paramArrayBuffer.getByteBuffer());
    AppMethodBeat.i(75056);
    AppMethodBeat.o(75056);
  }

  public Int16Array(ByteBuffer paramByteBuffer)
  {
    super(paramByteBuffer);
  }

  public short get(int paramInt)
  {
    AppMethodBeat.i(75057);
    short s = this.buffer.asShortBuffer().get(paramInt);
    AppMethodBeat.o(75057);
    return s;
  }

  public int getType()
  {
    return 13;
  }

  public int length()
  {
    AppMethodBeat.i(75058);
    int i = this.buffer.asShortBuffer().limit();
    AppMethodBeat.o(75058);
    return i;
  }

  public void put(int paramInt, short paramShort)
  {
    AppMethodBeat.i(75059);
    this.buffer.asShortBuffer().put(paramInt, paramShort);
    AppMethodBeat.o(75059);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.utils.typedarrays.Int16Array
 * JD-Core Version:    0.6.2
 */