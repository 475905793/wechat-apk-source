package com.google.android.gms.common.images.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CrossFadingDrawable$zzb extends Drawable.ConstantState
{
  int mChangingConfigurations;
  int zzql;

  CrossFadingDrawable$zzb(zzb paramzzb)
  {
    AppMethodBeat.i(61260);
    if (paramzzb != null)
    {
      this.mChangingConfigurations = paramzzb.mChangingConfigurations;
      this.zzql = paramzzb.zzql;
    }
    AppMethodBeat.o(61260);
  }

  public final int getChangingConfigurations()
  {
    return this.mChangingConfigurations;
  }

  public final Drawable newDrawable()
  {
    AppMethodBeat.i(61261);
    CrossFadingDrawable localCrossFadingDrawable = new CrossFadingDrawable(this);
    AppMethodBeat.o(61261);
    return localCrossFadingDrawable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.internal.CrossFadingDrawable.zzb
 * JD-Core Version:    0.6.2
 */