package com.tencent.qqmusic.mediaplayer.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteOrder;

public class DataConversionUtil
{
  private static final float BASE_16BIT = 32768.0F;
  private static final float BASE_32BIT = 2.147484E+009F;
  private static final boolean IS_LITTLE_ENDIAN;

  static
  {
    AppMethodBeat.i(105541);
    if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN);
    for (boolean bool = true; ; bool = false)
    {
      IS_LITTLE_ENDIAN = bool;
      AppMethodBeat.o(105541);
      return;
    }
  }

  public static int byteArray16BitToShortArray(byte[] paramArrayOfByte, int paramInt, short[] paramArrayOfShort)
  {
    AppMethodBeat.i(105530);
    checkByteArrayLength(paramArrayOfByte, paramInt);
    checkShortArrayLength(paramArrayOfShort, paramInt / 2);
    if (paramInt % 2 != 0)
    {
      paramArrayOfByte = new IllegalArgumentException("length of byteArray must be multiple of 2");
      AppMethodBeat.o(105530);
      throw paramArrayOfByte;
    }
    int i = 0;
    int j = 0;
    if ((i < paramInt) && (j < paramArrayOfShort.length))
    {
      if (IS_LITTLE_ENDIAN);
      for (int k = bytesToShort16bitInLittleEndian(paramArrayOfByte, i); ; k = bytesToShort16bitInBigEndian(paramArrayOfByte, i))
      {
        paramArrayOfShort[j] = ((short)k);
        j++;
        i += 2;
        break;
      }
    }
    AppMethodBeat.o(105530);
    return j;
  }

  public static int byteArray24BitToIntArray(byte[] paramArrayOfByte, int paramInt, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(105531);
    checkByteArrayLength(paramArrayOfByte, paramInt);
    checkIntArrayLength(paramArrayOfInt, paramInt / 3);
    if (paramInt % 3 != 0)
    {
      paramArrayOfByte = new IllegalArgumentException("length of byteArray must be multiple of 3");
      AppMethodBeat.o(105531);
      throw paramArrayOfByte;
    }
    int i = 0;
    int j = 0;
    if ((i < paramInt) && (j < paramArrayOfInt.length))
    {
      if (IS_LITTLE_ENDIAN);
      for (int k = bytesToInt24bitInLittleEndian(paramArrayOfByte, i); ; k = bytesToInt24bitInBigEndian(paramArrayOfByte, i))
      {
        paramArrayOfInt[j] = k;
        j++;
        i += 3;
        break;
      }
    }
    AppMethodBeat.o(105531);
    return j;
  }

  public static int byteArray32BitToIntArray(byte[] paramArrayOfByte, int paramInt, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(105532);
    checkByteArrayLength(paramArrayOfByte, paramInt);
    checkIntArrayLength(paramArrayOfInt, paramInt / 4);
    if (paramInt % 4 != 0)
    {
      paramArrayOfByte = new IllegalArgumentException("length of byteArray must be multiple of 4");
      AppMethodBeat.o(105532);
      throw paramArrayOfByte;
    }
    int i = 0;
    int j = 0;
    if ((i < paramInt) && (j < paramArrayOfInt.length))
    {
      if (IS_LITTLE_ENDIAN);
      for (int k = bytesToInt32bitInLittleEndian(paramArrayOfByte, i); ; k = bytesToInt32bitInBigEndian(paramArrayOfByte, i))
      {
        paramArrayOfInt[j] = k;
        j++;
        i += 4;
        break;
      }
    }
    AppMethodBeat.o(105532);
    return j;
  }

  public static int byteArrayToFloatArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(105529);
    checkByteArrayLength(paramArrayOfByte, paramInt1);
    checkFloatArrayLength(paramArrayOfFloat, paramInt1 / paramInt2);
    checkByteArrayProperty(paramInt1, paramInt2);
    int i = 0;
    int j = 0;
    if (i < paramInt1)
    {
      int k = i / paramInt2;
      if (paramInt2 == 3);
      for (float f = bytesToFloat24bit(paramArrayOfByte, i); ; f = bytesToFloat32bit(paramArrayOfByte, i))
      {
        paramArrayOfFloat[k] = f;
        j++;
        i += paramInt2;
        break;
      }
    }
    AppMethodBeat.o(105529);
    return j;
  }

  public static float bytesToFloat24bit(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(105522);
    float f;
    if (IS_LITTLE_ENDIAN)
    {
      f = bytesToFloat24bitInLittleEndian(paramArrayOfByte, paramInt);
      AppMethodBeat.o(105522);
    }
    while (true)
    {
      return f;
      f = bytesToFloat24bitInBigEndian(paramArrayOfByte, paramInt);
      AppMethodBeat.o(105522);
    }
  }

  public static float bytesToFloat24bitInBigEndian(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(105525);
    float f = bytesToInt24bitInBigEndian(paramArrayOfByte, paramInt) / 2.147484E+009F;
    AppMethodBeat.o(105525);
    return f;
  }

  public static float bytesToFloat24bitInLittleEndian(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(105524);
    float f = bytesToInt24bitInLittleEndian(paramArrayOfByte, paramInt) / 2.147484E+009F;
    AppMethodBeat.o(105524);
    return f;
  }

  public static float bytesToFloat32bit(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(105523);
    float f;
    if (IS_LITTLE_ENDIAN)
    {
      f = bytesToFloat32bitInLittleEndian(paramArrayOfByte, paramInt);
      AppMethodBeat.o(105523);
    }
    while (true)
    {
      return f;
      f = bytesToFloat32bitInBigEndian(paramArrayOfByte, paramInt);
      AppMethodBeat.o(105523);
    }
  }

  public static float bytesToFloat32bitInBigEndian(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(105527);
    float f = bytesToInt32bitInBigEndian(paramArrayOfByte, paramInt) / 2.147484E+009F;
    AppMethodBeat.o(105527);
    return f;
  }

  public static float bytesToFloat32bitInLittleEndian(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(105526);
    float f = bytesToInt32bitInLittleEndian(paramArrayOfByte, paramInt) / 2.147484E+009F;
    AppMethodBeat.o(105526);
    return f;
  }

  public static int bytesToInt24bitInBigEndian(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[(paramInt + 2)] << 8 & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 16 | (paramArrayOfByte[paramInt] & 0xFF) << 24;
  }

  public static int bytesToInt24bitInLittleEndian(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[paramInt] << 8 & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 24;
  }

  public static int bytesToInt32bitInBigEndian(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[(paramInt + 3)] & 0xFF | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 8 | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 16 | (paramArrayOfByte[paramInt] & 0xFF) << 24;
  }

  public static int bytesToInt32bitInLittleEndian(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[paramInt] & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 3)] & 0xFF) << 24;
  }

  public static short bytesToShort16bitInBigEndian(byte[] paramArrayOfByte, int paramInt)
  {
    return (short)(paramArrayOfByte[(paramInt + 1)] & 0xFF | (paramArrayOfByte[paramInt] & 0xFF) << 8);
  }

  public static short bytesToShort16bitInLittleEndian(byte[] paramArrayOfByte, int paramInt)
  {
    return (short)(paramArrayOfByte[paramInt] & 0xFF | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8);
  }

  private static void checkByteArrayLength(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(105537);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      paramArrayOfByte = new IllegalArgumentException("byte Array must not be null or zero length");
      AppMethodBeat.o(105537);
      throw paramArrayOfByte;
    }
    if (paramInt > paramArrayOfByte.length)
    {
      paramArrayOfByte = new IllegalArgumentException("the length param can not larger than byte Array length. param:" + paramInt + ", byte array length:" + paramArrayOfByte.length);
      AppMethodBeat.o(105537);
      throw paramArrayOfByte;
    }
    AppMethodBeat.o(105537);
  }

  private static void checkByteArrayProperty(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105536);
    IllegalArgumentException localIllegalArgumentException;
    if ((paramInt2 > 4) || (paramInt2 < 3))
    {
      localIllegalArgumentException = new IllegalArgumentException("bytesPerSample of " + paramInt2 + " is not supported");
      AppMethodBeat.o(105536);
      throw localIllegalArgumentException;
    }
    if (paramInt1 % paramInt2 != 0)
    {
      localIllegalArgumentException = new IllegalArgumentException("length of byteArray must be multiple of bytesPerSample");
      AppMethodBeat.o(105536);
      throw localIllegalArgumentException;
    }
    AppMethodBeat.o(105536);
  }

  private static void checkFloatArrayLength(float[] paramArrayOfFloat, int paramInt)
  {
    AppMethodBeat.i(105540);
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length == 0))
    {
      paramArrayOfFloat = new IllegalArgumentException("float Array must not be null or zero length");
      AppMethodBeat.o(105540);
      throw paramArrayOfFloat;
    }
    if (paramInt > paramArrayOfFloat.length)
    {
      paramArrayOfFloat = new IllegalArgumentException("the length param can not larger than float Array length. param:" + paramInt + ", float array length:" + paramArrayOfFloat.length);
      AppMethodBeat.o(105540);
      throw paramArrayOfFloat;
    }
    AppMethodBeat.o(105540);
  }

  private static void checkIntArrayLength(int[] paramArrayOfInt, int paramInt)
  {
    AppMethodBeat.i(105539);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      paramArrayOfInt = new IllegalArgumentException("int Array must not be null or zero length");
      AppMethodBeat.o(105539);
      throw paramArrayOfInt;
    }
    if (paramInt > paramArrayOfInt.length)
    {
      paramArrayOfInt = new IllegalArgumentException("the length param can not larger than int Array length. param:" + paramInt + ", int array length:" + paramArrayOfInt.length);
      AppMethodBeat.o(105539);
      throw paramArrayOfInt;
    }
    AppMethodBeat.o(105539);
  }

  private static void checkShortArrayLength(short[] paramArrayOfShort, int paramInt)
  {
    AppMethodBeat.i(105538);
    if ((paramArrayOfShort == null) || (paramArrayOfShort.length == 0))
    {
      paramArrayOfShort = new IllegalArgumentException("short Array must not be null or zero length");
      AppMethodBeat.o(105538);
      throw paramArrayOfShort;
    }
    if (paramInt > paramArrayOfShort.length)
    {
      paramArrayOfShort = new IllegalArgumentException("the length param can not larger than short Array length. param:" + paramInt + ", short array length:" + paramArrayOfShort.length);
      AppMethodBeat.o(105538);
      throw paramArrayOfShort;
    }
    AppMethodBeat.o(105538);
  }

  public static void floatTo2Bytes(float paramFloat, byte[] paramArrayOfByte, int paramInt)
  {
    float f1 = 1.0F;
    float f2 = -1.0F;
    AppMethodBeat.i(105528);
    if (paramFloat > 1.0F)
      paramFloat = f1;
    while (true)
    {
      if (paramFloat < -1.0F)
        paramFloat = f2;
      while (true)
      {
        shortTo2Bytes((short)(int)(paramFloat * 32768.0F), paramArrayOfByte, paramInt);
        AppMethodBeat.o(105528);
        return;
      }
    }
  }

  public static int intArrayToByteArray24Bit(int[] paramArrayOfInt, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(105534);
    checkIntArrayLength(paramArrayOfInt, paramInt);
    checkByteArrayLength(paramArrayOfByte, paramInt * 3);
    int i = 0;
    for (int j = 0; i < paramInt; j += 3)
    {
      intTo3Bytes(paramArrayOfInt[i], paramArrayOfByte, j);
      i++;
    }
    AppMethodBeat.o(105534);
    return j;
  }

  public static int intArrayToByteArray32Bit(int[] paramArrayOfInt, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(105535);
    checkIntArrayLength(paramArrayOfInt, paramInt);
    checkByteArrayLength(paramArrayOfByte, paramInt * 4);
    int i = 0;
    for (int j = 0; i < paramInt; j += 4)
    {
      intTo4Bytes(paramArrayOfInt[i], paramArrayOfByte, j);
      i++;
    }
    AppMethodBeat.o(105535);
    return j;
  }

  public static void intTo3Bytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    if (IS_LITTLE_ENDIAN)
    {
      paramArrayOfByte[paramInt2] = ((byte)(byte)(paramInt1 >> 8 & 0xFF));
      paramArrayOfByte[(paramInt2 + 1)] = ((byte)(byte)(paramInt1 >> 16 & 0xFF));
      paramArrayOfByte[(paramInt2 + 2)] = ((byte)(byte)(paramInt1 >> 24 & 0xFF));
    }
    while (true)
    {
      return;
      paramArrayOfByte[(paramInt2 + 2)] = ((byte)(byte)(paramInt1 >> 8 & 0xFF));
      paramArrayOfByte[(paramInt2 + 1)] = ((byte)(byte)(paramInt1 >> 16 & 0xFF));
      paramArrayOfByte[paramInt2] = ((byte)(byte)(paramInt1 >> 24 & 0xFF));
    }
  }

  public static void intTo4Bytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    if (IS_LITTLE_ENDIAN)
    {
      paramArrayOfByte[paramInt2] = ((byte)(byte)(paramInt1 & 0xFF));
      paramArrayOfByte[(paramInt2 + 1)] = ((byte)(byte)(paramInt1 >> 8 & 0xFF));
      paramArrayOfByte[(paramInt2 + 2)] = ((byte)(byte)(paramInt1 >> 16 & 0xFF));
      paramArrayOfByte[(paramInt2 + 3)] = ((byte)(byte)(paramInt1 >> 24 & 0xFF));
    }
    while (true)
    {
      return;
      paramArrayOfByte[(paramInt2 + 3)] = ((byte)(byte)(paramInt1 & 0xFF));
      paramArrayOfByte[(paramInt2 + 2)] = ((byte)(byte)(paramInt1 >> 8 & 0xFF));
      paramArrayOfByte[(paramInt2 + 1)] = ((byte)(byte)(paramInt1 >> 16 & 0xFF));
      paramArrayOfByte[paramInt2] = ((byte)(byte)(paramInt1 >> 24 & 0xFF));
    }
  }

  public static int shortArrayToByteArray16Bit(short[] paramArrayOfShort, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(105533);
    checkShortArrayLength(paramArrayOfShort, paramInt);
    checkByteArrayLength(paramArrayOfByte, paramInt * 2);
    int i = 0;
    for (int j = 0; i < paramInt; j += 2)
    {
      shortTo2Bytes(paramArrayOfShort[i], paramArrayOfByte, j);
      i++;
    }
    AppMethodBeat.o(105533);
    return j;
  }

  public static void shortTo2Bytes(short paramShort, byte[] paramArrayOfByte, int paramInt)
  {
    if (IS_LITTLE_ENDIAN)
    {
      paramArrayOfByte[paramInt] = ((byte)(byte)(paramShort & 0xFF));
      paramArrayOfByte[(paramInt + 1)] = ((byte)(byte)(paramShort >> 8 & 0xFF));
    }
    while (true)
    {
      return;
      paramArrayOfByte[(paramInt + 1)] = ((byte)(byte)(paramShort & 0xFF));
      paramArrayOfByte[paramInt] = ((byte)(byte)(paramShort >> 8 & 0xFF));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.util.DataConversionUtil
 * JD-Core Version:    0.6.2
 */