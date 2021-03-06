package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class zzck
{
  public static final Status zzmm;
  private static final BasePendingResult<?>[] zzmn;
  private final Map<Api.AnyClientKey<?>, Api.Client> zzil;

  @VisibleForTesting
  final Set<BasePendingResult<?>> zzmo;
  private final zzcn zzmp;

  static
  {
    AppMethodBeat.i(60895);
    zzmm = new Status(8, "The connection to Google Play services was lost");
    zzmn = new BasePendingResult[0];
    AppMethodBeat.o(60895);
  }

  public zzck(Map<Api.AnyClientKey<?>, Api.Client> paramMap)
  {
    AppMethodBeat.i(60891);
    this.zzmo = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    this.zzmp = new zzcl(this);
    this.zzil = paramMap;
    AppMethodBeat.o(60891);
  }

  public final void release()
  {
    AppMethodBeat.i(60893);
    BasePendingResult[] arrayOfBasePendingResult = (BasePendingResult[])this.zzmo.toArray(zzmn);
    int i = arrayOfBasePendingResult.length;
    int j = 0;
    while (j < i)
    {
      BasePendingResult localBasePendingResult = arrayOfBasePendingResult[j];
      localBasePendingResult.zza(null);
      if (localBasePendingResult.zzo() == null)
      {
        if (localBasePendingResult.zzw())
          this.zzmo.remove(localBasePendingResult);
        j++;
      }
      else
      {
        localBasePendingResult.setResultCallback(null);
        IBinder localIBinder = ((Api.Client)this.zzil.get(((BaseImplementation.ApiMethodImpl)localBasePendingResult).getClientKey())).getServiceBrokerBinder();
        if (localBasePendingResult.isReady())
          localBasePendingResult.zza(new zzcm(localBasePendingResult, null, localIBinder, null));
        while (true)
        {
          this.zzmo.remove(localBasePendingResult);
          break;
          if ((localIBinder != null) && (localIBinder.isBinderAlive()))
          {
            zzcm localzzcm = new zzcm(localBasePendingResult, null, localIBinder, null);
            localBasePendingResult.zza(localzzcm);
            try
            {
              localIBinder.linkToDeath(localzzcm, 0);
            }
            catch (RemoteException localRemoteException)
            {
              localBasePendingResult.cancel();
              localBasePendingResult.zzo().intValue();
              throw new NullPointerException();
            }
          }
        }
        localBasePendingResult.zza(null);
        localBasePendingResult.cancel();
        localBasePendingResult.zzo().intValue();
        throw new NullPointerException();
      }
    }
    AppMethodBeat.o(60893);
  }

  final void zzb(BasePendingResult<? extends Result> paramBasePendingResult)
  {
    AppMethodBeat.i(60892);
    this.zzmo.add(paramBasePendingResult);
    paramBasePendingResult.zza(this.zzmp);
    AppMethodBeat.o(60892);
  }

  public final void zzce()
  {
    AppMethodBeat.i(60894);
    BasePendingResult[] arrayOfBasePendingResult = (BasePendingResult[])this.zzmo.toArray(zzmn);
    int i = arrayOfBasePendingResult.length;
    for (int j = 0; j < i; j++)
      arrayOfBasePendingResult[j].zzb(zzmm);
    AppMethodBeat.o(60894);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzck
 * JD-Core Version:    0.6.2
 */