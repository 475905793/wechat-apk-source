package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class be
{
  private final int a;
  private final int b;
  private final int c;
  private final int d;
  private Bitmap e = null;
  private da f;
  private BitmapFactory.Options g;

  public be(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }

  public be(int paramInt1, int paramInt2, int paramInt3, int paramInt4, da paramda)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.f = paramda;
  }

  public int a()
  {
    return this.a;
  }

  public void a(Bitmap paramBitmap)
  {
    this.e = paramBitmap;
  }

  public void a(BitmapFactory.Options paramOptions)
  {
    this.g = paramOptions;
  }

  public int b()
  {
    return this.b;
  }

  public int c()
  {
    return this.c;
  }

  public int d()
  {
    return this.d;
  }

  public da e()
  {
    return this.f;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof be))
      {
        bool = false;
      }
      else
      {
        paramObject = (be)paramObject;
        if ((this.a != paramObject.a) || (this.b != paramObject.b) || (this.c != paramObject.c))
          bool = false;
      }
    }
  }

  public BitmapFactory.Options f()
  {
    return this.g;
  }

  public int hashCode()
  {
    return this.a * 7 + this.b * 11 + this.c * 13;
  }

  public String toString()
  {
    AppMethodBeat.i(100781);
    Object localObject = new StringBuilder(24);
    ((StringBuilder)localObject).append(this.a);
    ((StringBuilder)localObject).append("-");
    ((StringBuilder)localObject).append(this.b);
    ((StringBuilder)localObject).append("-");
    ((StringBuilder)localObject).append(this.c);
    ((StringBuilder)localObject).append("-");
    ((StringBuilder)localObject).append(this.d);
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(100781);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.be
 * JD-Core Version:    0.6.2
 */