package com.tencent.tmassistantsdk.openSDK.opensdktomsdk;

import android.os.Message;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;

class TMOpenSDKToMsdkManager$9$1
  implements Runnable
{
  TMOpenSDKToMsdkManager$9$1(TMOpenSDKToMsdkManager.9 param9, TMAssistantDownloadSDKClient paramTMAssistantDownloadSDKClient, String paramString)
  {
  }

  public void run()
  {
    AppMethodBeat.i(75928);
    try
    {
      String str = this.val$client.getDownloadTaskState(this.val$url).mSavePath;
      if (!TextUtils.isEmpty(str))
      {
        Message localMessage = new android/os/Message;
        localMessage.<init>();
        localMessage.what = 0;
        localMessage.obj = str;
        this.this$1.this$0.mMainMessageHandler.sendMessage(localMessage);
      }
      AppMethodBeat.o(75928);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("OpensdkToMsdkManager", localException, "", new Object[0]);
        AppMethodBeat.o(75928);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKToMsdkManager.9.1
 * JD-Core Version:    0.6.2
 */