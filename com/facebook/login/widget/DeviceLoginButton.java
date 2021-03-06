package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class DeviceLoginButton extends LoginButton
{
  private Uri deviceRedirectUri;

  public DeviceLoginButton(Context paramContext)
  {
    super(paramContext);
  }

  public DeviceLoginButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public DeviceLoginButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public Uri getDeviceRedirectUri()
  {
    return this.deviceRedirectUri;
  }

  protected LoginButton.LoginClickListener getNewLoginClickListener()
  {
    AppMethodBeat.i(92630);
    DeviceLoginButton.DeviceLoginClickListener localDeviceLoginClickListener = new DeviceLoginButton.DeviceLoginClickListener(this, null);
    AppMethodBeat.o(92630);
    return localDeviceLoginClickListener;
  }

  public void setDeviceRedirectUri(Uri paramUri)
  {
    this.deviceRedirectUri = paramUri;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.login.widget.DeviceLoginButton
 * JD-Core Version:    0.6.2
 */