package com.google.android.exoplayer2.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f$h extends Exception
{
  public final int errorCode;

  public f$h(int paramInt)
  {
    super("AudioTrack write failed: ".concat(String.valueOf(paramInt)));
    AppMethodBeat.i(94673);
    this.errorCode = paramInt;
    AppMethodBeat.o(94673);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.f.h
 * JD-Core Version:    0.6.2
 */