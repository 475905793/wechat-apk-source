package com.tencent.mm.plugin.licence.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class CardInfo
{
  public byte[] bitmapData;
  public int bitmapLen;
  public int height;
  public int width;

  public CardInfo(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(72865);
    this.width = 0;
    this.height = 0;
    this.bitmapLen = 0;
    this.bitmapData = new byte[(int)(0.8D * paramInt1) * (int)(0.52D * paramInt1) * 3 + 54];
    AppMethodBeat.o(72865);
  }

  public byte[] getData()
  {
    return this.bitmapData;
  }

  public int getHeight()
  {
    return this.height;
  }

  public int getSize()
  {
    return this.bitmapLen;
  }

  public int getWidth()
  {
    return this.width;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.licence.model.CardInfo
 * JD-Core Version:    0.6.2
 */