package com.tencent.liteav.beauty.b.a;

import com.tencent.liteav.basic.e.g;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class c extends g
{
  public boolean a()
  {
    AppMethodBeat.i(66950);
    NativeLoad.getInstance();
    this.a = NativeLoad.nativeLoadGLProgram(6);
    if ((this.a != 0) && (b()));
    for (this.g = true; ; this.g = false)
    {
      c();
      boolean bool = this.g;
      AppMethodBeat.o(66950);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.beauty.b.a.c
 * JD-Core Version:    0.6.2
 */