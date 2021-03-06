package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;

public abstract interface e
{
  public abstract void B(double paramDouble);

  public abstract void d(double paramDouble, boolean paramBoolean);

  public abstract int getCurrentPosition();

  public abstract int getDuration();

  public abstract double getLastProgresstime();

  public abstract long getLastSurfaceUpdateTime();

  public abstract String getVideoPath();

  public abstract boolean isPlaying();

  public abstract void onDetach();

  public abstract void pause();

  public abstract void setLoop(boolean paramBoolean);

  public abstract void setMute(boolean paramBoolean);

  public abstract void setOnInfoCallback(e.b paramb);

  public abstract void setOnSeekCompleteCallback(e.c paramc);

  public abstract void setOnSurfaceCallback(d paramd);

  public abstract void setOneTimeVideoTextureUpdateCallback(e.e parame);

  public abstract void setPlayProgressCallback(boolean paramBoolean);

  public abstract void setThumb(Bitmap paramBitmap);

  public abstract void setVideoCallback(e.a parama);

  public abstract void setVideoPath(String paramString);

  public abstract boolean start();

  public abstract void stop();

  public abstract boolean w(Context paramContext, boolean paramBoolean);

  public static abstract interface d
  {
    public abstract void akY();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.e
 * JD-Core Version:    0.6.2
 */