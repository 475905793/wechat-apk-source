package com.tencent.wxmm;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class v2stqos
{
  private static final String TAG = "WXMM.Voip[stqos]";
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

  public v2stqos()
  {
    AppMethodBeat.i(35429);
    this.s2p = new byte[14];
    AppMethodBeat.o(35429);
  }

  public void parseS2PData()
  {
    AppMethodBeat.i(35430);
    ByteBuffer localByteBuffer = ByteBuffer.wrap(this.s2p);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    this.iKbps = localByteBuffer.getShort();
    this.cFps = localByteBuffer.get();
    this.cIPeriod = localByteBuffer.get();
    this.cRSLevel = localByteBuffer.get();
    this.cQPmin = localByteBuffer.get();
    this.cQPmax = localByteBuffer.get();
    this.cHPPMaxLyr = localByteBuffer.get();
    this.cSwitch = localByteBuffer.get();
    this.cResolution = localByteBuffer.get();
    this.cRsvd1 = localByteBuffer.get();
    this.cRsvd2 = localByteBuffer.get();
    this.cSkipFlag = localByteBuffer.get();
    this.cIReqFlag = localByteBuffer.get();
    AppMethodBeat.o(35430);
  }

  public void printS2P()
  {
    AppMethodBeat.i(35431);
    new StringBuilder("raw S2P:").append(this.s2p);
    new StringBuilder("-S2P- iKbps:").append(this.iKbps).append(", fps:").append(this.cFps).append(", IP:").append(this.cIPeriod).append(", RS:").append(this.cRSLevel).append(", QPMin:").append(this.cQPmin).append(", QPMax:").append(this.cQPmax).append(", HPP:").append(this.cHPPMaxLyr).append(", SWitch:").append(this.cSwitch).append(", Reso:").append(this.cResolution).append(", Rsvd1:").append(this.cRsvd1).append(", Rsvd2:").append(this.cRsvd2).append(", Skip:").append(this.cSkipFlag).append(", IReq:").append(this.cIReqFlag);
    AppMethodBeat.o(35431);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wxmm.v2stqos
 * JD-Core Version:    0.6.2
 */