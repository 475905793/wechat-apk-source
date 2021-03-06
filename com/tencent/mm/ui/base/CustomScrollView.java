package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class CustomScrollView extends ScrollView
{
  private CustomScrollView.a yso;

  public CustomScrollView(Context paramContext)
  {
    super(paramContext);
  }

  public CustomScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CustomScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(112504);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.yso != null)
      this.yso.a(this, paramInt2, paramInt4);
    AppMethodBeat.o(112504);
  }

  public void setOnScrollChangeListener(CustomScrollView.a parama)
  {
    this.yso = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.CustomScrollView
 * JD-Core Version:    0.6.2
 */