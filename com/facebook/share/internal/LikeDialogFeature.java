package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;
import com.tencent.matrix.trace.core.AppMethodBeat;

@Deprecated
public enum LikeDialogFeature
  implements DialogFeature
{
  private int minVersion;

  static
  {
    AppMethodBeat.i(97121);
    LIKE_DIALOG = new LikeDialogFeature("LIKE_DIALOG", 0, 20140701);
    $VALUES = new LikeDialogFeature[] { LIKE_DIALOG };
    AppMethodBeat.o(97121);
  }

  private LikeDialogFeature(int paramInt)
  {
    this.minVersion = paramInt;
  }

  public final String getAction()
  {
    return "com.facebook.platform.action.request.LIKE_DIALOG";
  }

  public final int getMinVersion()
  {
    return this.minVersion;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeDialogFeature
 * JD-Core Version:    0.6.2
 */