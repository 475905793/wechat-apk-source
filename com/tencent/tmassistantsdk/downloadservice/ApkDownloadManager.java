package com.tencent.tmassistantsdk.downloadservice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tmassistantsdk.storage.DBManager;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ApkDownloadManager
  implements NetworkMonitorReceiver.INetworkChangedObserver
{
  protected static final long INTERVAL = 180000L;
  protected static final String TAG = "ApkDownloadManager";
  protected static ApkDownloadManager mApkDownloadManager = null;
  final Map<String, DownloadInfo> mDownloads;

  private ApkDownloadManager()
  {
    AppMethodBeat.i(75681);
    this.mDownloads = new ConcurrentHashMap();
    AppMethodBeat.o(75681);
  }

  public static ApkDownloadManager getInstance()
  {
    AppMethodBeat.i(75680);
    if (mApkDownloadManager == null)
      mApkDownloadManager = new ApkDownloadManager();
    ApkDownloadManager localApkDownloadManager = mApkDownloadManager;
    AppMethodBeat.o(75680);
    return localApkDownloadManager;
  }

  public void AddDownloadListener(IDownloadManagerListener paramIDownloadManagerListener)
  {
    AppMethodBeat.i(75689);
    TMLog.i("ApkDownloadManager", "call AddDownloadListener, dl: ".concat(String.valueOf(paramIDownloadManagerListener)));
    DownloadListenerManager.getInstance().Add(paramIDownloadManagerListener);
    AppMethodBeat.o(75689);
  }

  public void RemoveDownloadListener(IDownloadManagerListener paramIDownloadManagerListener)
  {
    AppMethodBeat.i(75690);
    TMLog.i("ApkDownloadManager", "call RemoveDownloadListener, dl: ".concat(String.valueOf(paramIDownloadManagerListener)));
    DownloadListenerManager.getInstance().Remove(paramIDownloadManagerListener);
    AppMethodBeat.o(75690);
  }

  public void cancelDownload(String paramString)
  {
    AppMethodBeat.i(75686);
    TMLog.i("ApkDownloadManager", "call cancelDownload, url: ".concat(String.valueOf(paramString)));
    paramString = (DownloadInfo)this.mDownloads.remove(paramString);
    if (paramString != null)
      paramString.stopDownload();
    AppMethodBeat.o(75686);
  }

  public void init()
  {
    AppMethodBeat.i(75682);
    TMLog.i("ApkDownloadManager", "Start to load DownloadInfo list.");
    this.mDownloads.clear();
    Object localObject = DBManager.getInstance().queryDownloadInfoList();
    if (localObject != null)
    {
      TMLog.i("ApkDownloadManager", "The size of downloadinfo_list: " + ((ArrayList)localObject).size());
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        DownloadInfo localDownloadInfo = (DownloadInfo)((Iterator)localObject).next();
        TMLog.i("ApkDownloadManager", "---------------load download info---------------");
        localDownloadInfo.dump("ApkDownloadManager");
        this.mDownloads.put(localDownloadInfo.mURL, localDownloadInfo);
        if (!localDownloadInfo.hasFinished())
          localDownloadInfo.updateStatus(3, false);
      }
    }
    TMLog.i("ApkDownloadManager", "Add NetworkChangedObserver to NetworkMonitorReceiver");
    NetworkMonitorReceiver.getInstance().addNetworkChangedObserver(this);
    AppMethodBeat.o(75682);
  }

  public Boolean isAllDownloadFinished()
  {
    AppMethodBeat.i(75688);
    Object localObject = this.mDownloads.keySet().iterator();
    while (((Iterator)localObject).hasNext())
      if (!((DownloadInfo)this.mDownloads.get(((Iterator)localObject).next())).hasFinished())
      {
        localObject = Boolean.FALSE;
        AppMethodBeat.o(75688);
      }
    while (true)
    {
      return localObject;
      localObject = Boolean.TRUE;
      AppMethodBeat.o(75688);
    }
  }

  public void onNetworkChanged()
  {
    AppMethodBeat.i(75691);
    TMLog.i("ApkDownloadManager", "onNetworkChanged");
    if ((DownloadHelper.isNetworkConncted()) && (DownloadSetting.getInstance().isAutoDownload()))
    {
      String str = DownloadHelper.getNetStatus();
      TMLog.i("ApkDownloadManager", "currentNetType = ".concat(String.valueOf(str)));
      Iterator localIterator = this.mDownloads.keySet().iterator();
      while (localIterator.hasNext())
      {
        DownloadInfo localDownloadInfo = (DownloadInfo)this.mDownloads.get(localIterator.next());
        if (DownloadSetting.getInstance().isAutoDownload(localDownloadInfo.mNetType, str))
        {
          TMLog.i("ApkDownloadManager", "onNetworkChanged, errCode = " + localDownloadInfo.mDownloadFailedErrCode);
          if ((localDownloadInfo.mDownloadFailedErrCode == 601) || (localDownloadInfo.mDownloadFailedErrCode == 602) || (localDownloadInfo.mDownloadFailedErrCode == 605) || (localDownloadInfo.mDownloadFailedErrCode == 603) || (localDownloadInfo.mDownloadFailedErrCode == 606))
          {
            long l = System.currentTimeMillis();
            TMLog.i("ApkDownloadManager", "onNetworkChanged, currentTime = " + l + ", DownloadFailedTime = " + localDownloadInfo.mDownloadFailedTime);
            if (l - localDownloadInfo.mDownloadFailedTime < 180000L)
              localDownloadInfo.startDownloadIfReady(true);
          }
        }
      }
    }
    AppMethodBeat.o(75691);
  }

  public void pauseDownload(String paramString)
  {
    AppMethodBeat.i(75685);
    TMLog.i("ApkDownloadManager", "call pauseDownload, url: ".concat(String.valueOf(paramString)));
    paramString = (DownloadInfo)this.mDownloads.get(paramString);
    if (paramString != null)
      paramString.pauseDownload();
    AppMethodBeat.o(75685);
  }

  public DownloadInfo queryDownloadInfo(String paramString)
  {
    AppMethodBeat.i(75687);
    TMLog.i("ApkDownloadManager", "call queryDownloadInfo, url: ".concat(String.valueOf(paramString)));
    Object localObject1 = (DownloadInfo)this.mDownloads.get(paramString);
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = DBManager.getInstance().queryDownloadInfoByUrl(paramString);
    boolean bool = false;
    if (localObject2 != null)
      if (!((DownloadInfo)localObject2).mContentType.equals("application/tm.android.apkdiff"))
        break label129;
    label129: for (bool = DownloadHelper.isDownloadFileExisted(paramString, ((DownloadInfo)localObject2).mContentType); ; bool = DownloadHelper.isDownloadFileExisted(((DownloadInfo)localObject2).mFileName))
    {
      localObject1 = localObject2;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((DownloadInfo)localObject2).hasReceivedAllDataBytes())
        {
          localObject1 = localObject2;
          if (!bool)
          {
            this.mDownloads.remove(paramString);
            DBManager.getInstance().deleteDownloadInfo(paramString);
            localObject1 = null;
          }
        }
      }
      AppMethodBeat.o(75687);
      return localObject1;
    }
  }

  public int startDownload(String paramString1, String paramString2, long paramLong, int paramInt, String paramString3, String paramString4, Map<String, String> paramMap)
  {
    AppMethodBeat.i(75684);
    TMLog.i("ApkDownloadManager", "call startDownload, url: " + paramString1 + "priority: " + paramInt);
    if (!DownloadHelper.isNetworkConncted())
    {
      TMLog.i("ApkDownloadManager", "call startDownload, return errCode: 1");
      paramInt = 1;
      AppMethodBeat.o(75684);
    }
    while (true)
    {
      return paramInt;
      if ((!DownloadHelper.getNetStatus().equalsIgnoreCase("wifi")) && (DownloadSetting.getInstance().getIsDownloadWifiOnly()))
      {
        TMLog.i("ApkDownloadManager", "call startDownload, return errCode: 2");
        paramInt = 2;
        AppMethodBeat.o(75684);
      }
      else if (!DownloadHelper.isValidURL(paramString1))
      {
        TMLog.i("ApkDownloadManager", "call startDownload, return errCode: 3");
        paramInt = 3;
        AppMethodBeat.o(75684);
      }
      else
      {
        if (!DownloadHelper.isDownloadFileExisted(paramString1, paramString3))
          break;
        TMLog.i("ApkDownloadManager", "call startDownload, return errCode: 4");
        paramInt = 4;
        AppMethodBeat.o(75684);
      }
    }
    Object localObject1 = (DownloadInfo)this.mDownloads.get(paramString1);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = DBManager.getInstance().queryDownloadInfoByUrl(paramString1);
      if (localObject1 == null)
      {
        localObject2 = new DownloadInfo(paramString1, paramString2, paramLong, paramInt, paramString3);
        localObject1 = localObject2;
        if (((DownloadInfo)localObject2).mContentType.equals("resource/tm.android.unknown"))
        {
          ((DownloadInfo)localObject2).mFileName = paramString4;
          localObject1 = localObject2;
        }
        label241: this.mDownloads.put(paramString1, localObject1);
      }
    }
    while (true)
    {
      ((DownloadInfo)localObject1).setHeaderParams((HashMap)paramMap);
      if (((DownloadInfo)localObject1).mContentType.equals("application/tm.android.apkdiff"));
      for (boolean bool = DownloadHelper.isDownloadFileExisted(paramString1, ((DownloadInfo)localObject1).mContentType); ; bool = DownloadHelper.isDownloadFileExisted(((DownloadInfo)localObject1).mFileName))
      {
        TMLog.i("ApkDownloadManager", "fileExited = ".concat(String.valueOf(bool)));
        if (!bool)
          break label398;
        paramInt = 4;
        AppMethodBeat.o(75684);
        break;
        if (((DownloadInfo)localObject1).mContentType.equals("application/tm.android.apkdiff"));
        for (bool = DownloadHelper.isDownloadFileExisted(paramString1, ((DownloadInfo)localObject1).mContentType); ; bool = DownloadHelper.isDownloadFileExisted(((DownloadInfo)localObject1).mFileName))
        {
          if (!bool)
            break label383;
          TMLog.i("ApkDownloadManager", "call startDownload, return errCode: 4");
          paramInt = 4;
          AppMethodBeat.o(75684);
          break;
        }
        label383: break label241;
      }
      label398: localObject2 = localObject1;
      if (((DownloadInfo)localObject1).hasReceivedAllDataBytes())
      {
        localObject2 = localObject1;
        if (!bool)
        {
          this.mDownloads.remove(paramString1);
          DBManager.getInstance().deleteDownloadInfo(paramString1);
          localObject2 = new DownloadInfo(paramString1, paramString2, paramLong, paramInt, paramString3);
          if (((DownloadInfo)localObject2).mContentType.equals("resource/tm.android.unknown"))
            ((DownloadInfo)localObject2).mFileName = paramString4;
          ((DownloadInfo)localObject2).setHeaderParams((HashMap)paramMap);
          this.mDownloads.put(paramString1, localObject2);
        }
      }
      paramInt = ((DownloadInfo)localObject2).startDownloadIfReady();
      TMLog.i("ApkDownloadManager", "call startDownload, return errCode: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(75684);
      break;
    }
  }

  public void uninit()
  {
    AppMethodBeat.i(75683);
    NetworkMonitorReceiver.getInstance().removeNetworkChangedObserver(this);
    ArrayList localArrayList = new ArrayList();
    if (!this.mDownloads.isEmpty())
    {
      Iterator localIterator = this.mDownloads.keySet().iterator();
      while (localIterator.hasNext())
      {
        DownloadInfo localDownloadInfo = (DownloadInfo)this.mDownloads.get(localIterator.next());
        if (localDownloadInfo.mStatus == 2)
          pauseDownload(localDownloadInfo.mURL);
        localArrayList.add(localDownloadInfo);
      }
    }
    TMLog.i("ApkDownloadManager", "Start to save DownloadInfo list.");
    DBManager.getInstance().saveDownloadInfoList(localArrayList);
    AppMethodBeat.o(75683);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager
 * JD-Core Version:    0.6.2
 */