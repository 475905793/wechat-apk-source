package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Channel.GetOutputStreamResult;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.OutputStream;
import javax.annotation.Nullable;

final class zzbh
  implements Channel.GetOutputStreamResult
{
  private final OutputStream zzcu;
  private final Status zzp;

  zzbh(Status paramStatus, @Nullable OutputStream paramOutputStream)
  {
    AppMethodBeat.i(71072);
    this.zzp = ((Status)Preconditions.checkNotNull(paramStatus));
    this.zzcu = paramOutputStream;
    AppMethodBeat.o(71072);
  }

  @Nullable
  public final OutputStream getOutputStream()
  {
    return this.zzcu;
  }

  public final Status getStatus()
  {
    return this.zzp;
  }

  public final void release()
  {
    AppMethodBeat.i(71073);
    if (this.zzcu != null);
    while (true)
    {
      try
      {
        this.zzcu.close();
        AppMethodBeat.o(71073);
        return;
      }
      catch (IOException localIOException)
      {
      }
      AppMethodBeat.o(71073);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzbh
 * JD-Core Version:    0.6.2
 */