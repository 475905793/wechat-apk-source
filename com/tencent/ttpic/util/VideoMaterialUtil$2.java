package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FilenameFilter;

final class VideoMaterialUtil$2
  implements FilenameFilter
{
  public final boolean accept(File paramFile, String paramString)
  {
    AppMethodBeat.i(84051);
    boolean bool = paramString.endsWith(".mp4");
    AppMethodBeat.o(84051);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoMaterialUtil.2
 * JD-Core Version:    0.6.2
 */