package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public class g extends com.tencent.liteav.basic.e.g
{
  protected List<com.tencent.liteav.basic.e.g> r;
  protected List<com.tencent.liteav.basic.e.g> s;
  private int[] t;
  private int[] u;
  private com.tencent.liteav.basic.e.g v;

  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66910);
    int i = this.s.size();
    k();
    int j = 0;
    int k = 0;
    if (j < i)
    {
      com.tencent.liteav.basic.e.g localg = (com.tencent.liteav.basic.e.g)this.s.get(j);
      if (k != 0)
      {
        paramInt1 = localg.a(paramInt1, paramInt2, paramInt3);
        label63: if (k == 0)
          break label99;
      }
      label99: for (k = 0; ; k = 1)
      {
        j++;
        break;
        paramInt1 = localg.a(paramInt1, this.t[0], this.u[0]);
        break label63;
      }
    }
    if (k != 0)
      this.v.a(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(66910);
    return paramInt3;
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66909);
    if ((this.e == paramInt1) && (this.f == paramInt2))
      AppMethodBeat.o(66909);
    while (true)
    {
      return;
      if (this.t != null)
        f();
      super.a(paramInt1, paramInt2);
      int i = this.s.size();
      for (int j = 0; j < i; j++)
        ((com.tencent.liteav.basic.e.g)this.s.get(j)).a(paramInt1, paramInt2);
      this.v.a(paramInt1, paramInt2);
      if ((this.s != null) && (this.s.size() > 0))
      {
        this.s.size();
        this.t = new int[2];
        this.u = new int[2];
        for (j = 0; j < 2; j++)
        {
          GLES20.glGenFramebuffers(1, this.t, j);
          GLES20.glGenTextures(1, this.u, j);
          GLES20.glBindTexture(3553, this.u[j]);
          GLES20.glTexImage2D(3553, 0, 6408, paramInt1, paramInt2, 0, 6408, 5121, null);
          GLES20.glTexParameterf(3553, 10240, 9729.0F);
          GLES20.glTexParameterf(3553, 10241, 9729.0F);
          GLES20.glTexParameterf(3553, 10242, 33071.0F);
          GLES20.glTexParameterf(3553, 10243, 33071.0F);
          GLES20.glBindFramebuffer(36160, this.t[j]);
          GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.u[j], 0);
          GLES20.glBindTexture(3553, 0);
          GLES20.glBindFramebuffer(36160, 0);
        }
      }
      AppMethodBeat.o(66909);
    }
  }

  public boolean b()
  {
    AppMethodBeat.i(66906);
    boolean bool1 = super.b();
    boolean bool2 = bool1;
    if (bool1)
    {
      Iterator localIterator = this.r.iterator();
      com.tencent.liteav.basic.e.g localg;
      do
      {
        if (!localIterator.hasNext())
          break;
        localg = (com.tencent.liteav.basic.e.g)localIterator.next();
        localg.a();
      }
      while (localg.m());
      bool2 = this.v.a();
    }
    if ((bool2) && (GLES20.glGetError() == 0))
    {
      bool2 = true;
      AppMethodBeat.o(66906);
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      AppMethodBeat.o(66906);
    }
  }

  public void e()
  {
    AppMethodBeat.i(66907);
    super.e();
    Iterator localIterator = this.r.iterator();
    while (localIterator.hasNext())
      ((com.tencent.liteav.basic.e.g)localIterator.next()).d();
    AppMethodBeat.o(66907);
  }

  public void f()
  {
    AppMethodBeat.i(66908);
    super.f();
    if (this.u != null)
    {
      GLES20.glDeleteTextures(2, this.u, 0);
      this.u = null;
    }
    if (this.t != null)
    {
      GLES20.glDeleteFramebuffers(2, this.t, 0);
      this.t = null;
    }
    AppMethodBeat.o(66908);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.g
 * JD-Core Version:    0.6.2
 */