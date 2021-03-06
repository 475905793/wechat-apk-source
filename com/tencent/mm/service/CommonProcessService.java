package com.tencent.mm.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentHashMap;

public class CommonProcessService extends Service
{
  private static ConcurrentHashMap<String, MMService> xEV;
  private Handler handler;
  private b.a xEW;

  static
  {
    AppMethodBeat.i(115266);
    xEV = new ConcurrentHashMap();
    AppMethodBeat.o(115266);
  }

  public CommonProcessService()
  {
    AppMethodBeat.i(115258);
    this.xEW = new b.a()
    {
      public final void a(final Intent paramAnonymousIntent, final a paramAnonymousa)
      {
        AppMethodBeat.i(115254);
        e.pXa.a(963L, 38L, 1L, false);
        if (paramAnonymousIntent != null)
        {
          CommonProcessService.a(CommonProcessService.this).post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(115250);
              paramAnonymousIntent.setExtrasClassLoader(CommonProcessService.class.getClassLoader());
              String str = paramAnonymousIntent.getStringExtra("class_name");
              try
              {
                ab.i(CommonProcessService.this.getTag(), "bindService() class_name = %s", new Object[] { str });
                MMService localMMService = (MMService)CommonProcessService.anH().get(str);
                Object localObject = localMMService;
                if (localMMService == null)
                {
                  localObject = (MMService)Class.forName(str).newInstance();
                  ((MMService)localObject).xEV = CommonProcessService.anH();
                  ((MMService)localObject).xFe = CommonProcessService.this;
                  CommonProcessService.anH().put(str, localObject);
                }
                e.pXa.a(963L, 39L, 1L, false);
                localObject = ((MMService)localObject).q(paramAnonymousIntent, "bind");
                try
                {
                  if (paramAnonymousa != null)
                    paramAnonymousa.M((IBinder)localObject);
                  AppMethodBeat.o(115250);
                  return;
                }
                catch (RemoteException localRemoteException)
                {
                  while (true)
                  {
                    ab.i(CommonProcessService.this.getTag(), "bindService() immserviceConnectionStubAIDL RemoteException: %s", new Object[] { localRemoteException.getMessage() });
                    AppMethodBeat.o(115250);
                  }
                }
              }
              catch (Exception localException)
              {
                while (true)
                {
                  ab.i(CommonProcessService.this.getTag(), "bindService()  Class.forName(%s) Exception: %s", new Object[] { str, localException.getMessage() });
                  AppMethodBeat.o(115250);
                }
              }
            }
          });
          AppMethodBeat.o(115254);
        }
        while (true)
        {
          return;
          ab.i(CommonProcessService.this.getTag(), "bindService() intent == null");
          AppMethodBeat.o(115254);
        }
      }

      public final void aH(final Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(115256);
        e.pXa.a(963L, 7L, 1L, false);
        if (paramAnonymousIntent != null)
        {
          CommonProcessService.a(CommonProcessService.this).post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(115252);
              paramAnonymousIntent.setExtrasClassLoader(CommonProcessService.class.getClassLoader());
              String str = paramAnonymousIntent.getStringExtra("class_name");
              try
              {
                ab.i(CommonProcessService.this.getTag(), "startService() class_name = %s", new Object[] { str });
                MMService localMMService1 = (MMService)CommonProcessService.anH().get(str);
                MMService localMMService2 = localMMService1;
                if (localMMService1 == null)
                {
                  localMMService2 = (MMService)Class.forName(str).newInstance();
                  localMMService2.xEV = CommonProcessService.anH();
                  localMMService2.xFe = CommonProcessService.this;
                  CommonProcessService.anH().put(str, localMMService2);
                }
                e.pXa.a(963L, 8L, 1L, false);
                localMMService2.q(paramAnonymousIntent, "start");
                AppMethodBeat.o(115252);
                return;
              }
              catch (Exception localException)
              {
                while (true)
                {
                  ab.i(CommonProcessService.this.getTag(), "startService()  Class.forName(%s) Exception: %s", new Object[] { str, localException.getMessage() });
                  AppMethodBeat.o(115252);
                }
              }
            }
          });
          AppMethodBeat.o(115256);
        }
        while (true)
        {
          return;
          ab.i(CommonProcessService.this.getTag(), "startService() intent == null");
          AppMethodBeat.o(115256);
        }
      }

      public final void aI(final Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(115257);
        e.pXa.a(963L, 23L, 1L, false);
        if (paramAnonymousIntent != null)
        {
          CommonProcessService.a(CommonProcessService.this).post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(115253);
              paramAnonymousIntent.setExtrasClassLoader(CommonProcessService.class.getClassLoader());
              Object localObject = paramAnonymousIntent.getStringExtra("class_name");
              ab.i(CommonProcessService.this.getTag(), "stopService() class_name = %s", new Object[] { localObject });
              localObject = (MMService)CommonProcessService.anH().get(localObject);
              if (localObject == null)
                AppMethodBeat.o(115253);
              while (true)
              {
                return;
                e.pXa.a(963L, 24L, 1L, false);
                ((MMService)localObject).q(paramAnonymousIntent, "stop");
                AppMethodBeat.o(115253);
              }
            }
          });
          AppMethodBeat.o(115257);
        }
        while (true)
        {
          return;
          ab.i(CommonProcessService.this.getTag(), "stopService() intent == null");
          AppMethodBeat.o(115257);
        }
      }

      public final void aN(final Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(115255);
        e.pXa.a(963L, 53L, 1L, false);
        if (paramAnonymousIntent != null)
        {
          CommonProcessService.a(CommonProcessService.this).post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(115251);
              paramAnonymousIntent.setExtrasClassLoader(CommonProcessService.class.getClassLoader());
              Object localObject = paramAnonymousIntent.getStringExtra("class_name");
              ab.i(CommonProcessService.this.getTag(), "unbindService() class_name = %s", new Object[] { localObject });
              localObject = (MMService)CommonProcessService.anH().get(localObject);
              if (localObject == null)
                AppMethodBeat.o(115251);
              while (true)
              {
                return;
                e.pXa.a(963L, 54L, 1L, false);
                ((MMService)localObject).q(paramAnonymousIntent, "unbind");
                AppMethodBeat.o(115251);
              }
            }
          });
          AppMethodBeat.o(115255);
        }
        while (true)
        {
          return;
          ab.i(CommonProcessService.this.getTag(), "unbindService() intent == null");
          AppMethodBeat.o(115255);
        }
      }
    };
    AppMethodBeat.o(115258);
  }

  public String getTag()
  {
    return "MicroMsg.MMProcessService";
  }

  public IBinder onBind(Intent paramIntent)
  {
    AppMethodBeat.i(115265);
    ab.i(getTag(), "onBind()");
    paramIntent = this.xEW;
    AppMethodBeat.o(115265);
    return paramIntent;
  }

  public void onCreate()
  {
    AppMethodBeat.i(115259);
    ab.i(getTag(), "onCreate()");
    this.handler = new Handler();
    super.onCreate();
    AppMethodBeat.o(115259);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(115262);
    ab.i(getTag(), "onDestroy()");
    super.onDestroy();
    AppMethodBeat.o(115262);
  }

  public void onRebind(Intent paramIntent)
  {
    AppMethodBeat.i(115264);
    ab.i(getTag(), "onRebind()");
    super.onRebind(paramIntent);
    AppMethodBeat.o(115264);
  }

  public void onStart(Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(115260);
    ab.i(getTag(), "onStart()");
    super.onStart(paramIntent, paramInt);
    AppMethodBeat.o(115260);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115261);
    ab.i(getTag(), "onStartCommand()");
    AppMethodBeat.o(115261);
    return 1;
  }

  public boolean onUnbind(Intent paramIntent)
  {
    AppMethodBeat.i(115263);
    ab.i(getTag(), "onUnbind()");
    boolean bool = super.onUnbind(paramIntent);
    AppMethodBeat.o(115263);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.service.CommonProcessService
 * JD-Core Version:    0.6.2
 */