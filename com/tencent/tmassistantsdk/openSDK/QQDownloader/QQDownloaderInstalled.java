package com.tencent.tmassistantsdk.openSDK.QQDownloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.util.TMLog;

public class QQDownloaderInstalled extends BroadcastReceiver
{
  private static final String TAG = "QQDownloaderInstalled";
  protected static QQDownloaderInstalled mInstance = null;
  protected boolean isRegisted = false;
  protected IQQDownloaderInstalled mListener = null;

  public static QQDownloaderInstalled getInstance()
  {
    try
    {
      AppMethodBeat.i(75852);
      if (mInstance == null)
      {
        localQQDownloaderInstalled = new com/tencent/tmassistantsdk/openSDK/QQDownloader/QQDownloaderInstalled;
        localQQDownloaderInstalled.<init>();
        mInstance = localQQDownloaderInstalled;
      }
      QQDownloaderInstalled localQQDownloaderInstalled = mInstance;
      AppMethodBeat.o(75852);
      return localQQDownloaderInstalled;
    }
    finally
    {
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(75853);
    TMLog.i("QQDownloaderInstalled", "onReceive!");
    new QQDownloaderInstalled.1(this, paramContext).start();
    AppMethodBeat.o(75853);
  }

  public void registeListener(IQQDownloaderInstalled paramIQQDownloaderInstalled)
  {
    this.mListener = paramIQQDownloaderInstalled;
  }

  public void registeReceiver(Context paramContext)
  {
    AppMethodBeat.i(75854);
    if (!this.isRegisted)
      TMLog.i("QQDownloaderInstalled", "registeReceiver   context" + paramContext + "  receiver:" + this);
    while (true)
    {
      try
      {
        this.isRegisted = true;
        AppMethodBeat.o(75854);
        return;
      }
      catch (Throwable paramContext)
      {
        TMLog.i("QQDownloaderInstalled", "registeReceiver exception!!!");
        this.isRegisted = false;
        ab.printErrStackTrace("QQDownloaderInstalled", paramContext, "", new Object[0]);
      }
      AppMethodBeat.o(75854);
    }
  }

  public void unRegisteReceiver(Context paramContext)
  {
    AppMethodBeat.i(75855);
    if ((paramContext == null) || (mInstance == null))
      AppMethodBeat.o(75855);
    while (true)
    {
      return;
      if (this.isRegisted)
      {
        TMLog.i("QQDownloaderInstalled", "realy unRegisteReceiver  context:" + paramContext + "  receiver:" + this);
        try
        {
          this.isRegisted = false;
          AppMethodBeat.o(75855);
        }
        catch (Throwable paramContext)
        {
          TMLog.i("QQDownloaderInstalled", "unRegisteReceiver exception!!!");
          this.isRegisted = false;
          ab.printErrStackTrace("QQDownloaderInstalled", paramContext, "", new Object[0]);
        }
      }
      else
      {
        AppMethodBeat.o(75855);
      }
    }
  }

  public void unregisteListener()
  {
    this.mListener = null;
  }

  public static abstract interface IQQDownloaderInstalled
  {
    public abstract void onQQDownloaderInstalled(Context paramContext);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.openSDK.QQDownloader.QQDownloaderInstalled
 * JD-Core Version:    0.6.2
 */