package com.tencent.mm.plugin.game.ui;

import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class w
  implements View.OnTouchListener
{
  private int mColor;

  public w()
  {
    this(Color.argb(221, 136, 136, 136));
    AppMethodBeat.i(112218);
    AppMethodBeat.o(112218);
  }

  private w(int paramInt)
  {
    this.mColor = paramInt;
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(112219);
    int i = paramMotionEvent.getAction();
    if (i == 0)
      if ((paramView instanceof ImageView))
      {
        paramMotionEvent = (ImageView)paramView;
        paramView = paramMotionEvent.getDrawable();
        if (paramView != null)
        {
          paramView.setColorFilter(this.mColor, PorterDuff.Mode.MULTIPLY);
          paramMotionEvent.setImageDrawable(paramView);
        }
      }
    while (true)
    {
      AppMethodBeat.o(112219);
      return false;
      if (paramView.getBackground() != null)
      {
        paramView.getBackground().setColorFilter(this.mColor, PorterDuff.Mode.MULTIPLY);
        continue;
        if ((i == 1) || (i == 3))
          if ((paramView instanceof ImageView))
          {
            paramView = ((ImageView)paramView).getDrawable();
            if (paramView != null)
              paramView.clearColorFilter();
          }
          else
          {
            paramView = paramView.getBackground();
            if (paramView != null)
              paramView.clearColorFilter();
          }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.w
 * JD-Core Version:    0.6.2
 */