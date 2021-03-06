package com.tencent.map.lib.mapstructure;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.hl;

public class LineInfo
{
  private static final int ROAD_NAME_BYTE_LEN = 64;
  public int color;
  public int endNum;
  public String roadName;
  public int speed;
  public int startNum;

  public byte[] fromBytes()
  {
    AppMethodBeat.i(98162);
    byte[] arrayOfByte1 = new byte[80];
    System.arraycopy(hl.a(this.startNum), 0, arrayOfByte1, 0, 4);
    System.arraycopy(hl.a(this.endNum), 0, arrayOfByte1, 4, 4);
    System.arraycopy(hl.a(this.color), 0, arrayOfByte1, 8, 4);
    System.arraycopy(hl.a(this.speed), 0, arrayOfByte1, 12, 4);
    byte[] arrayOfByte2 = hl.a(this.roadName);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 16, arrayOfByte2.length);
    AppMethodBeat.o(98162);
    return arrayOfByte1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.mapstructure.LineInfo
 * JD-Core Version:    0.6.2
 */