package com.tencent.mm.plugin.emojicapture.ui;

import a.l;
import a.v;
import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLTextureView;
import com.tencent.mm.plugin.emojicapture.ui.b.b;
import com.tencent.mm.plugin.emojicapture.ui.b.f;
import com.tencent.mm.plugin.emojicapture.ui.b.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureGLTextureView;", "Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLTextureView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "getPreviewTextureId", "Companion", "plugin-emojicapture_release"})
public final class EmojiCaptureGLTextureView extends CameraPreviewGLTextureView
{
  public static final EmojiCaptureGLTextureView.a llb;

  static
  {
    AppMethodBeat.i(2861);
    llb = new EmojiCaptureGLTextureView.a((byte)0);
    AppMethodBeat.o(2861);
  }

  public EmojiCaptureGLTextureView(Context paramContext)
  {
    super(paramContext);
  }

  public EmojiCaptureGLTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public EmojiCaptureGLTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final int getPreviewTextureId()
  {
    AppMethodBeat.i(2860);
    Object localObject;
    int i;
    if ((getRenderer() instanceof b))
    {
      localObject = getRenderer();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.emojicapture.ui.gl.EmojiCaptureGLSurfaceTextureRenderer");
        AppMethodBeat.o(2860);
        throw ((Throwable)localObject);
      }
      localObject = (b)localObject;
      if ((((com.tencent.mm.media.h.a)localObject).eYL instanceof com.tencent.mm.plugin.emojicapture.ui.b.a))
      {
        localObject = ((com.tencent.mm.media.h.a)localObject).eYL;
        if (localObject == null)
        {
          localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.emojicapture.ui.gl.EmojiCaptureCropTopRenderProc");
          AppMethodBeat.o(2860);
          throw ((Throwable)localObject);
        }
        i = ((com.tencent.mm.plugin.emojicapture.ui.b.a)localObject).loL.boj();
        AppMethodBeat.o(2860);
      }
    }
    while (true)
    {
      return i;
      if ((((com.tencent.mm.media.h.a)localObject).eYL instanceof f))
      {
        localObject = ((com.tencent.mm.media.h.a)localObject).eYL;
        if (localObject == null)
        {
          localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.emojicapture.ui.gl.EmojiCaptureRGBRenderProc");
          AppMethodBeat.o(2860);
          throw ((Throwable)localObject);
        }
        i = ((f)localObject).loL.boj();
        AppMethodBeat.o(2860);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(2860);
        continue;
        i = super.getPreviewTextureId();
        AppMethodBeat.o(2860);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureGLTextureView
 * JD-Core Version:    0.6.2
 */