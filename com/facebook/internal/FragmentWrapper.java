package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FragmentWrapper
{
  private android.app.Fragment nativeFragment;
  private android.support.v4.app.Fragment supportFragment;

  public FragmentWrapper(android.app.Fragment paramFragment)
  {
    AppMethodBeat.i(96648);
    Validate.notNull(paramFragment, "fragment");
    this.nativeFragment = paramFragment;
    AppMethodBeat.o(96648);
  }

  public FragmentWrapper(android.support.v4.app.Fragment paramFragment)
  {
    AppMethodBeat.i(96647);
    Validate.notNull(paramFragment, "fragment");
    this.supportFragment = paramFragment;
    AppMethodBeat.o(96647);
  }

  public final Activity getActivity()
  {
    AppMethodBeat.i(96650);
    Object localObject;
    if (this.supportFragment != null)
    {
      localObject = this.supportFragment.getActivity();
      AppMethodBeat.o(96650);
    }
    while (true)
    {
      return localObject;
      localObject = this.nativeFragment.getActivity();
      AppMethodBeat.o(96650);
    }
  }

  public android.app.Fragment getNativeFragment()
  {
    return this.nativeFragment;
  }

  public android.support.v4.app.Fragment getSupportFragment()
  {
    return this.supportFragment;
  }

  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(96649);
    if (this.supportFragment != null)
    {
      this.supportFragment.startActivityForResult(paramIntent, paramInt);
      AppMethodBeat.o(96649);
    }
    while (true)
    {
      return;
      this.nativeFragment.startActivityForResult(paramIntent, paramInt);
      AppMethodBeat.o(96649);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FragmentWrapper
 * JD-Core Version:    0.6.2
 */