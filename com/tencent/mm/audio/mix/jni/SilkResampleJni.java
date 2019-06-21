package com.tencent.mm.audio.mix.jni;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class SilkResampleJni
{
  static
  {
    AppMethodBeat.i(137084);
    System.loadLibrary("wechataudiosilk");
    AppMethodBeat.o(137084);
  }

  public static native int clearResample(String paramString);

  public static native int clearResampleAll();

  public static native int initResample(String paramString, int paramInt1, int paramInt2);

  public static native int resamplePcm(String paramString, int paramInt1, int paramInt2, short[] paramArrayOfShort1, int paramInt3, short[] paramArrayOfShort2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.jni.SilkResampleJni
 * JD-Core Version:    0.6.2
 */