package com.facebook.login.widget;

import com.facebook.internal.ImageRequest.Callback;
import com.facebook.internal.ImageResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;

class ProfilePictureView$1
  implements ImageRequest.Callback
{
  ProfilePictureView$1(ProfilePictureView paramProfilePictureView)
  {
  }

  public void onCompleted(ImageResponse paramImageResponse)
  {
    AppMethodBeat.i(92688);
    ProfilePictureView.access$000(this.this$0, paramImageResponse);
    AppMethodBeat.o(92688);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.login.widget.ProfilePictureView.1
 * JD-Core Version:    0.6.2
 */