package com.tencent.mm.at;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class g$a extends BitmapDrawable
{
  private g$a(Resources paramResources, Bitmap paramBitmap)
  {
    super(paramResources, paramBitmap);
  }

  public static void a(Bitmap paramBitmap, ImageView paramImageView)
  {
    AppMethodBeat.i(78206);
    if ((paramImageView == null) || (paramImageView.getResources() == null))
      AppMethodBeat.o(78206);
    while (true)
    {
      return;
      paramBitmap = new a(paramImageView.getResources(), paramBitmap);
      if (paramImageView.getLayerType() == 1)
      {
        paramImageView.destroyDrawingCache();
        paramImageView.setLayerType(0, null);
      }
      paramImageView.setImageDrawable(paramBitmap);
      AppMethodBeat.o(78206);
    }
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(78207);
    if ((getBitmap() != null) && (!getBitmap().isRecycled()))
    {
      super.draw(paramCanvas);
      AppMethodBeat.o(78207);
    }
    while (true)
    {
      return;
      if (getBitmap() != null)
        ab.e("MicroMsg.ImgInfoStorage", "Cannot draw recycled bitmaps:%s", new Object[] { getBitmap().toString() });
      AppMethodBeat.o(78207);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.g.a
 * JD-Core Version:    0.6.2
 */