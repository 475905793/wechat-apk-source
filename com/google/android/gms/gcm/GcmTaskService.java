package com.google.android.gms.gcm;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.concurrent.GuardedBy;

public abstract class GcmTaskService extends Service
{
  public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
  public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
  public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
  private ComponentName componentName;
  private final Object lock = new Object();

  @GuardedBy("lock")
  private int zzt;
  private ExecutorService zzu;
  private Messenger zzv;
  private GcmNetworkManager zzw;

  private final void zzd(int paramInt)
  {
    synchronized (this.lock)
    {
      this.zzt = paramInt;
      if (!this.zzw.zzf(this.componentName.getClassName()))
        stopSelf(this.zzt);
      return;
    }
  }

  private final void zzd(GcmTaskService.zze paramzze)
  {
    try
    {
      this.zzu.execute(paramzze);
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      while (true)
        GcmTaskService.zze.zzd(paramzze, 1);
    }
  }

  private final boolean zzg(String paramString)
  {
    synchronized (this.lock)
    {
      if (!this.zzw.zzd(paramString, this.componentName.getClassName()))
      {
        bool = true;
        if (bool)
        {
          String str = getPackageName();
          int i = String.valueOf(str).length();
          int j = String.valueOf(paramString).length();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(i + 44 + j);
          localStringBuilder.append(str).append(" ").append(paramString).append(": Task already running, won't start another");
        }
        return bool;
      }
      boolean bool = false;
    }
  }

  public IBinder onBind(Intent paramIntent)
  {
    if ((paramIntent == null) || (!PlatformVersion.isAtLeastLollipop()) || (!"com.google.android.gms.gcm.ACTION_TASK_READY".equals(paramIntent.getAction())));
    for (paramIntent = null; ; paramIntent = this.zzv.getBinder())
      return paramIntent;
  }

  public void onCreate()
  {
    super.onCreate();
    this.zzw = GcmNetworkManager.getInstance(this);
    this.zzu = Executors.newFixedThreadPool(2, new zze(this));
    this.zzv = new Messenger(new GcmTaskService.zzd(this, Looper.getMainLooper()));
    this.componentName = new ComponentName(this, getClass());
  }

  public void onDestroy()
  {
    super.onDestroy();
    List localList = this.zzu.shutdownNow();
    if (!localList.isEmpty())
    {
      int i = localList.size();
      new StringBuilder(79).append("Shutting down, but not all tasks are finished executing. Remaining: ").append(i);
    }
  }

  public void onInitializeTasks()
  {
  }

  public abstract int onRunTask(TaskParams paramTaskParams);

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (paramIntent == null)
    {
      zzd(paramInt2);
      return 2;
    }
    while (true)
    {
      String str;
      try
      {
        paramIntent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
        str = paramIntent.getAction();
        if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(str))
        {
          str = paramIntent.getStringExtra("tag");
          Object localObject1 = paramIntent.getParcelableExtra("callback");
          Object localObject2 = paramIntent.getBundleExtra("extras");
          paramIntent = paramIntent.getParcelableArrayListExtra("triggered_uris");
          if (!(localObject1 instanceof PendingCallback))
          {
            localObject2 = getPackageName();
            int i = String.valueOf(localObject2).length();
            paramInt1 = String.valueOf(str).length();
            paramIntent = new java/lang/StringBuilder;
            paramIntent.<init>(i + 47 + paramInt1);
            paramIntent.append((String)localObject2).append(" ").append(str).append(": Could not process request, invalid callback.");
            zzd(paramInt2);
            break;
          }
          boolean bool = zzg(str);
          if (bool)
          {
            zzd(paramInt2);
            break;
          }
          IBinder localIBinder = ((PendingCallback)localObject1).zzal;
          localObject1 = new com/google/android/gms/gcm/GcmTaskService$zze;
          ((GcmTaskService.zze)localObject1).<init>(this, str, localIBinder, (Bundle)localObject2, paramIntent);
          zzd((GcmTaskService.zze)localObject1);
          zzd(paramInt2);
          break;
        }
        if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(str))
        {
          onInitializeTasks();
          continue;
        }
      }
      finally
      {
        zzd(paramInt2);
      }
      paramInt1 = String.valueOf(str).length();
      paramIntent = new java/lang/StringBuilder;
      paramIntent.<init>(paramInt1 + 37);
      paramIntent.append("Unknown action received ").append(str).append(", terminating");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.GcmTaskService
 * JD-Core Version:    0.6.2
 */