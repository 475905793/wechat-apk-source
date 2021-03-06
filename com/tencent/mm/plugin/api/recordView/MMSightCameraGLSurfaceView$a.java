package com.tencent.mm.plugin.api.recordView;

import android.opengl.GLSurfaceView.EGLConfigChooser;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

final class MMSightCameraGLSurfaceView$a
  implements GLSurfaceView.EGLConfigChooser
{
  private int EGL_OPENGL_ES2_BIT;
  private int[] eZf;
  protected int mAlphaSize;
  protected int mBlueSize;
  protected int mDepthSize;
  protected int mGreenSize;
  protected int mRedSize;
  protected int mStencilSize;
  private int[] mValue;

  public MMSightCameraGLSurfaceView$a(MMSightCameraGLSurfaceView paramMMSightCameraGLSurfaceView)
  {
    AppMethodBeat.i(76312);
    this.EGL_OPENGL_ES2_BIT = 4;
    this.eZf = new int[] { 12324, 4, 12323, 4, 12322, 4, 12352, this.EGL_OPENGL_ES2_BIT, 12344 };
    this.mValue = new int[1];
    this.mRedSize = 5;
    this.mGreenSize = 6;
    this.mBlueSize = 5;
    this.mAlphaSize = 0;
    this.mDepthSize = 0;
    this.mStencilSize = 0;
    AppMethodBeat.o(76312);
  }

  private int a(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(76315);
    if (paramEGL10.eglGetConfigAttrib(paramEGLDisplay, paramEGLConfig, paramInt, this.mValue))
    {
      paramInt = this.mValue[0];
      AppMethodBeat.o(76315);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(76315);
      paramInt = i;
    }
  }

  private static void b(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig)
  {
    AppMethodBeat.i(76316);
    int i = paramArrayOfEGLConfig.length;
    ab.i("GLConfigChooser", String.format("%d configurations", new Object[] { Integer.valueOf(i) }));
    for (int j = 0; j < i; j++)
    {
      ab.i("GLConfigChooser", String.format("Configuration %d:\n", new Object[] { Integer.valueOf(j) }));
      EGLConfig localEGLConfig = paramArrayOfEGLConfig[j];
      int[] arrayOfInt = new int[1];
      for (int k = 0; k < 33; k++)
        paramEGL10.eglGetConfigAttrib(paramEGLDisplay, localEGLConfig, new int[] { 12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354 }[k], arrayOfInt);
    }
    AppMethodBeat.o(76316);
  }

  private EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay, EGLConfig[] paramArrayOfEGLConfig)
  {
    AppMethodBeat.i(76314);
    int i = paramArrayOfEGLConfig.length;
    int j = 0;
    if (j < i)
    {
      EGLConfig localEGLConfig = paramArrayOfEGLConfig[j];
      int k = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12325);
      int m = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12326);
      if ((k >= this.mDepthSize) && (m >= this.mStencilSize))
      {
        int n = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12324);
        int i1 = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12323);
        m = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12322);
        k = a(paramEGL10, paramEGLDisplay, localEGLConfig, 12321);
        if ((n == this.mRedSize) && (i1 == this.mGreenSize) && (m == this.mBlueSize) && (k == this.mAlphaSize))
        {
          AppMethodBeat.o(76314);
          paramEGL10 = localEGLConfig;
        }
      }
    }
    while (true)
    {
      return paramEGL10;
      j++;
      break;
      paramEGL10 = null;
      AppMethodBeat.o(76314);
    }
  }

  public final EGLConfig chooseConfig(EGL10 paramEGL10, EGLDisplay paramEGLDisplay)
  {
    AppMethodBeat.i(76313);
    int[] arrayOfInt = new int[1];
    paramEGL10.eglChooseConfig(paramEGLDisplay, this.eZf, null, 0, arrayOfInt);
    int i = arrayOfInt[0];
    if (i <= 0)
    {
      paramEGL10 = new IllegalArgumentException("No configs match configSpec");
      AppMethodBeat.o(76313);
      throw paramEGL10;
    }
    EGLConfig[] arrayOfEGLConfig = new EGLConfig[i];
    paramEGL10.eglChooseConfig(paramEGLDisplay, this.eZf, arrayOfEGLConfig, i, arrayOfInt);
    b(paramEGL10, paramEGLDisplay, arrayOfEGLConfig);
    paramEGL10 = chooseConfig(paramEGL10, paramEGLDisplay, arrayOfEGLConfig);
    AppMethodBeat.o(76313);
    return paramEGL10;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.MMSightCameraGLSurfaceView.a
 * JD-Core Version:    0.6.2
 */