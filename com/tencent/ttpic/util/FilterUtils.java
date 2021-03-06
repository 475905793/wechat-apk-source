package com.tencent.ttpic.util;

import android.graphics.Bitmap;
import com.tencent.filter.FilterAlgorithm;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.view.raw.FilterRawGet;

public class FilterUtils
{
  private static final String TAG;
  public static boolean loadLibSuccessed;

  static
  {
    AppMethodBeat.i(83914);
    TAG = FilterUtils.class.getSimpleName();
    loadLibSuccessed = false;
    checkLibraryInit();
    AppMethodBeat.o(83914);
  }

  public static void checkLibraryInit()
  {
    AppMethodBeat.i(83912);
    LogUtils.d(TAG, "[checkLibraryInit] + BEGIN");
    long l = System.currentTimeMillis();
    if (!loadLibSuccessed);
    try
    {
      System.loadLibrary("YTCommon");
      System.loadLibrary("image_filter_common");
      System.loadLibrary("image_filter_gpu");
      System.loadLibrary("format_convert");
      if (NativeProperty.hasNeonFeature())
      {
        System.loadLibrary("nnpack");
        System.loadLibrary("YTFaceTrackPro");
        System.loadLibrary("algo_youtu_jni");
      }
      loadLibSuccessed = true;
      FilterRawGet.setGetInputStream(new FilterUtils.FiltersGetInputStream());
      LogUtils.d(TAG, "[checkLibraryInit] + END, time cost = " + (System.currentTimeMillis() - l));
      AppMethodBeat.o(83912);
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
      {
        LogUtils.e(localUnsatisfiedLinkError);
        loadLibSuccessed = false;
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        loadLibSuccessed = false;
        LogUtils.e(localRuntimeException);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        loadLibSuccessed = false;
        LogUtils.e(localException);
      }
    }
  }

  public static void drawBitmapWithBlendmode(Bitmap paramBitmap1, Bitmap paramBitmap2, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(83913);
    FilterAlgorithm.nativeDrawBitmapWithBlendmode(paramBitmap1, paramBitmap2, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(83913);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.FilterUtils
 * JD-Core Version:    0.6.2
 */