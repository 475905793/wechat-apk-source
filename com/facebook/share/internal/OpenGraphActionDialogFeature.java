package com.facebook.share.internal;

import com.facebook.internal.DialogFeature;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum OpenGraphActionDialogFeature
  implements DialogFeature
{
  private int minVersion;

  static
  {
    AppMethodBeat.i(97161);
    OG_ACTION_DIALOG = new OpenGraphActionDialogFeature("OG_ACTION_DIALOG", 0, 20130618);
    $VALUES = new OpenGraphActionDialogFeature[] { OG_ACTION_DIALOG };
    AppMethodBeat.o(97161);
  }

  private OpenGraphActionDialogFeature(int paramInt)
  {
    this.minVersion = paramInt;
  }

  public final String getAction()
  {
    return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
  }

  public final int getMinVersion()
  {
    return this.minVersion;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.OpenGraphActionDialogFeature
 * JD-Core Version:    0.6.2
 */