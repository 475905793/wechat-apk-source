package com.facebook.share.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.facebook.FacebookButtonBase;
import com.tencent.matrix.trace.core.AppMethodBeat;

@Deprecated
public class LikeButton extends FacebookButtonBase
{
  @Deprecated
  public LikeButton(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, 0, 0, "fb_like_button_create", "fb_like_button_did_tap");
    AppMethodBeat.i(97084);
    setSelected(paramBoolean);
    AppMethodBeat.o(97084);
  }

  private void updateForLikeStatus()
  {
    AppMethodBeat.i(97087);
    if (isSelected())
    {
      setCompoundDrawablesWithIntrinsicBounds(2130838379, 0, 0, 0);
      setText(getResources().getString(2131296299));
      AppMethodBeat.o(97087);
    }
    while (true)
    {
      return;
      setCompoundDrawablesWithIntrinsicBounds(2130838375, 0, 0, 0);
      setText(getResources().getString(2131296300));
      AppMethodBeat.o(97087);
    }
  }

  public void configureButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(97086);
    super.configureButton(paramContext, paramAttributeSet, paramInt1, paramInt2);
    updateForLikeStatus();
    AppMethodBeat.o(97086);
  }

  public int getDefaultRequestCode()
  {
    return 0;
  }

  public int getDefaultStyleResource()
  {
    return 2131493848;
  }

  @Deprecated
  public void setSelected(boolean paramBoolean)
  {
    AppMethodBeat.i(97085);
    super.setSelected(paramBoolean);
    updateForLikeStatus();
    AppMethodBeat.o(97085);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeButton
 * JD-Core Version:    0.6.2
 */