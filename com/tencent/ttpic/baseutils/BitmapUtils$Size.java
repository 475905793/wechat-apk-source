package com.tencent.ttpic.baseutils;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class BitmapUtils$Size
{
  public int height;
  public int width;

  public BitmapUtils$Size(int paramInt1, int paramInt2)
  {
    this.width = paramInt1;
    this.height = paramInt2;
  }

  public String toString()
  {
    AppMethodBeat.i(49598);
    String str = "Size{width=" + this.width + ", height=" + this.height + '}';
    AppMethodBeat.o(49598);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.BitmapUtils.Size
 * JD-Core Version:    0.6.2
 */