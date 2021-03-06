package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import junit.framework.Assert;

public class TouchImageView extends ImageView
{
  private int a;
  private int b;
  private boolean enable;
  private int g;
  private int r;
  private RectF rDW;
  private Paint rDX;
  ak rgT;
  Runnable rgU;

  public TouchImageView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(39897);
    this.rDW = new RectF();
    this.rDX = new Paint();
    this.a = 90;
    this.r = 0;
    this.g = 0;
    this.b = 0;
    this.enable = true;
    init();
    AppMethodBeat.o(39897);
  }

  public TouchImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(39898);
    this.rDW = new RectF();
    this.rDX = new Paint();
    this.a = 90;
    this.r = 0;
    this.g = 0;
    this.b = 0;
    this.enable = true;
    init();
    AppMethodBeat.o(39898);
  }

  private void init()
  {
    AppMethodBeat.i(39899);
    this.rgT = new ak();
    this.rgU = new TouchImageView.1(this);
    super.setOnTouchListener(new TouchImageView.2(this));
    AppMethodBeat.o(39899);
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(39902);
    super.onAttachedToWindow();
    ab.d("MicroMsg.MaskImageView", "onAttachedToWindow");
    AppMethodBeat.o(39902);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(39903);
    super.onDetachedFromWindow();
    ab.d("MicroMsg.MaskImageView", "onDetachedFromWindow");
    AppMethodBeat.o(39903);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(39900);
    super.onDraw(paramCanvas);
    if (isPressed())
    {
      this.rDW.left = getPaddingLeft();
      this.rDW.top = getPaddingTop();
      this.rDW.right = (getWidth() - getPaddingRight());
      this.rDW.bottom = (getHeight() - getPaddingBottom());
      this.rDX.setARGB(this.a, this.r, this.g, this.b);
      paramCanvas.drawRoundRect(this.rDW, getWidth() / 10, getHeight() / 10, this.rDX);
    }
    AppMethodBeat.o(39900);
  }

  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    AppMethodBeat.i(39901);
    Assert.assertTrue(false);
    AppMethodBeat.o(39901);
  }

  public void settouchEnable(boolean paramBoolean)
  {
    this.enable = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.TouchImageView
 * JD-Core Version:    0.6.2
 */