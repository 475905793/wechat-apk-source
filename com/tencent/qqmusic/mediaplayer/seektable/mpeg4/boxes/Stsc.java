package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public class Stsc extends FullBox
{
  int entryCount;
  int[] firstChunk;
  int[] sampleDescIndex;
  int[] samplesPerChunk;

  public int getEntryCount()
  {
    return this.entryCount;
  }

  public int[] getFirstChunk()
  {
    return this.firstChunk;
  }

  public int[] getSampleDescIndex()
  {
    return this.sampleDescIndex;
  }

  public int[] getSamplesPerChunk()
  {
    return this.samplesPerChunk;
  }

  public void parse(Parsable paramParsable, Box paramBox)
  {
    AppMethodBeat.i(128485);
    super.parse(paramParsable, paramBox);
    this.entryCount = paramParsable.readInt();
    this.firstChunk = new int[this.entryCount];
    this.samplesPerChunk = new int[this.entryCount];
    this.sampleDescIndex = new int[this.entryCount];
    paramParsable.readIntArrayInterleaved(this.entryCount, new int[][] { this.firstChunk, this.samplesPerChunk, this.sampleDescIndex });
    AppMethodBeat.o(128485);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsc
 * JD-Core Version:    0.6.2
 */