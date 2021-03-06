package com.tencent.ttpic.cache;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.util.FaceOffUtil;
import com.tencent.ttpic.util.FaceOffUtil.FEATURE_TYPE;
import java.util.Map;

public class LoadGrayImageTask extends AsyncTask<Void, Integer, Boolean>
{
  private final FaceOffUtil.FEATURE_TYPE featureType;
  private final Map<FaceOffUtil.FEATURE_TYPE, Bitmap> mGrayCache;
  private final int sampleSize;

  public LoadGrayImageTask(Map<FaceOffUtil.FEATURE_TYPE, Bitmap> paramMap, FaceOffUtil.FEATURE_TYPE paramFEATURE_TYPE, int paramInt)
  {
    this.mGrayCache = paramMap;
    this.featureType = paramFEATURE_TYPE;
    this.sampleSize = paramInt;
  }

  protected Boolean doInBackground(Void[] paramArrayOfVoid)
  {
    AppMethodBeat.i(81791);
    if (isCancelled())
    {
      paramArrayOfVoid = Boolean.FALSE;
      AppMethodBeat.o(81791);
    }
    while (true)
    {
      return paramArrayOfVoid;
      if (this.mGrayCache == null)
      {
        paramArrayOfVoid = Boolean.FALSE;
        AppMethodBeat.o(81791);
      }
      else
      {
        if (!this.mGrayCache.containsKey(this.featureType))
        {
          paramArrayOfVoid = FaceOffUtil.getGrayBitmap(this.featureType);
          this.mGrayCache.put(this.featureType, paramArrayOfVoid);
        }
        paramArrayOfVoid = Boolean.TRUE;
        AppMethodBeat.o(81791);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.LoadGrayImageTask
 * JD-Core Version:    0.6.2
 */