package com.google.android.gms.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

final class zzo
{
  private final KeyPair zzbw;
  private final long zzbx;

  @VisibleForTesting
  zzo(KeyPair paramKeyPair, long paramLong)
  {
    this.zzbw = paramKeyPair;
    this.zzbx = paramLong;
  }

  private final String zzo()
  {
    AppMethodBeat.i(57594);
    String str = Base64.encodeToString(this.zzbw.getPublic().getEncoded(), 11);
    AppMethodBeat.o(57594);
    return str;
  }

  private final String zzp()
  {
    AppMethodBeat.i(57595);
    String str = Base64.encodeToString(this.zzbw.getPrivate().getEncoded(), 11);
    AppMethodBeat.o(57595);
    return str;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(57592);
    if (!(paramObject instanceof zzo))
      AppMethodBeat.o(57592);
    while (true)
    {
      return bool;
      paramObject = (zzo)paramObject;
      if ((this.zzbx == paramObject.zzbx) && (this.zzbw.getPublic().equals(paramObject.zzbw.getPublic())) && (this.zzbw.getPrivate().equals(paramObject.zzbw.getPrivate())))
      {
        bool = true;
        AppMethodBeat.o(57592);
      }
      else
      {
        AppMethodBeat.o(57592);
      }
    }
  }

  final long getCreationTime()
  {
    return this.zzbx;
  }

  final KeyPair getKeyPair()
  {
    return this.zzbw;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(57593);
    int i = Objects.hashCode(new Object[] { this.zzbw.getPublic(), this.zzbw.getPrivate(), Long.valueOf(this.zzbx) });
    AppMethodBeat.o(57593);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.iid.zzo
 * JD-Core Version:    0.6.2
 */