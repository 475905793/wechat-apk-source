package com.tencent.mm.ui.tools;

import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

final class ShareImgUI$4$1
  implements Runnable
{
  ShareImgUI$4$1(ShareImgUI.4 param4, ArrayList paramArrayList, Parcelable paramParcelable, boolean[] paramArrayOfBoolean, CountDownLatch paramCountDownLatch)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34938);
    if (!ShareImgUI.a(this.zHy.zHr, this.zHu, this.zHv))
      this.zHw[0] = true;
    this.zHx.countDown();
    AppMethodBeat.o(34938);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ShareImgUI.4.1
 * JD-Core Version:    0.6.2
 */