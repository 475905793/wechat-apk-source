package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$a
{
  public byte cFps;
  public byte cHPPMaxLyr;
  public byte cIPeriod;
  public byte cIReqFlag;
  public byte cQPmax;
  public byte cQPmin;
  public byte cRSLevel;
  public byte cResolution;
  public byte cRsvd1;
  public byte cRsvd2;
  public byte cSkipFlag;
  public byte cSwitch;
  public short iKbps;
  public byte[] s2p;

  public e$a(e parame)
  {
    AppMethodBeat.i(4340);
    this.s2p = new byte[14];
    AppMethodBeat.o(4340);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.e.a
 * JD-Core Version:    0.6.2
 */