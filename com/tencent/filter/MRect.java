package com.tencent.filter;

import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MRect
{
  int h;
  int w;
  int x;
  int y;

  public MRect()
  {
  }

  public MRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.x = paramInt1;
    this.y = paramInt2;
    this.w = paramInt3;
    this.h = paramInt4;
  }

  public static MRect toMRect(Rect paramRect)
  {
    AppMethodBeat.i(86385);
    paramRect = new MRect(paramRect.left, paramRect.top, paramRect.width(), paramRect.height());
    AppMethodBeat.o(86385);
    return paramRect;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.filter.MRect
 * JD-Core Version:    0.6.2
 */