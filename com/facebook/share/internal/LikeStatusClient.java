package com.facebook.share.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.PlatformServiceClient;
import com.tencent.matrix.trace.core.AppMethodBeat;

@Deprecated
final class LikeStatusClient extends PlatformServiceClient
{
  private String objectId;

  LikeStatusClient(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext, 65542, 65543, 20141001, paramString1);
    this.objectId = paramString2;
  }

  public final void populateRequestBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(97122);
    paramBundle.putString("com.facebook.platform.extra.OBJECT_ID", this.objectId);
    AppMethodBeat.o(97122);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeStatusClient
 * JD-Core Version:    0.6.2
 */