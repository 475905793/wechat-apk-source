package com.tencent.mm.pluginsdk.i;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.io.IOException;
import java.io.OutputStream;

public final class f
{
  public static void a(Bitmap paramBitmap, Bitmap.CompressFormat paramCompressFormat, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(27482);
    if (isNullOrNil(paramString))
    {
      paramBitmap = new IOException("saveBitmapToImage pathName null or nil");
      AppMethodBeat.o(27482);
      throw paramBitmap;
    }
    Object localObject = null;
    String str = null;
    try
    {
      paramString = e.L(paramString, false);
      str = paramString;
      localObject = paramString;
      paramBitmap.compress(paramCompressFormat, 60, paramString);
      str = paramString;
      localObject = paramString;
      paramString.flush();
      if (paramString != null);
      try
      {
        paramString.close();
        if (paramBoolean)
        {
          ab.i("MicroMsg.VideoUtil", "recycle bitmap:%s", new Object[] { paramBitmap.toString() });
          paramBitmap.recycle();
          AppMethodBeat.o(27482);
          return;
        }
      }
      catch (IOException paramCompressFormat)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.VideoUtil", paramCompressFormat, "", new Object[0]);
      }
    }
    catch (Exception paramCompressFormat)
    {
      while (true)
      {
        localObject = str;
        ab.printErrStackTrace("MicroMsg.VideoUtil", paramCompressFormat, "", new Object[0]);
        if (str != null);
        try
        {
          str.close();
          if (paramBoolean)
          {
            ab.i("MicroMsg.VideoUtil", "recycle bitmap:%s", new Object[] { paramBitmap.toString() });
            paramBitmap.recycle();
            AppMethodBeat.o(27482);
          }
        }
        catch (IOException paramCompressFormat)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.VideoUtil", paramCompressFormat, "", new Object[0]);
        }
      }
    }
    finally
    {
      while (true)
      {
        if (localObject != null);
        try
        {
          ((OutputStream)localObject).close();
          if (paramBoolean)
          {
            ab.i("MicroMsg.VideoUtil", "recycle bitmap:%s", new Object[] { paramBitmap.toString() });
            paramBitmap.recycle();
          }
          AppMethodBeat.o(27482);
          throw paramCompressFormat;
        }
        catch (IOException paramString)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.VideoUtil", paramString, "", new Object[0]);
        }
        AppMethodBeat.o(27482);
      }
    }
  }

  private static boolean isNullOrNil(String paramString)
  {
    AppMethodBeat.i(27481);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = true;
      AppMethodBeat.o(27481);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(27481);
    }
  }

  public static String mK(int paramInt)
  {
    AppMethodBeat.i(27480);
    String str = String.format("%d:%02d", new Object[] { Long.valueOf(paramInt / 60L), Long.valueOf(paramInt % 60L) });
    AppMethodBeat.o(27480);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.i.f
 * JD-Core Version:    0.6.2
 */