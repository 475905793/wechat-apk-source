package com.tencent.mm.ui.gridviewheaders;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import com.tencent.matrix.trace.core.AppMethodBeat;

class GridHeadersGridView$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR;
  boolean zyU;

  static
  {
    AppMethodBeat.i(107370);
    CREATOR = new GridHeadersGridView.SavedState.1();
    AppMethodBeat.o(107370);
  }

  private GridHeadersGridView$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(107367);
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.zyU = bool;
      AppMethodBeat.o(107367);
      return;
    }
  }

  public GridHeadersGridView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public String toString()
  {
    AppMethodBeat.i(107368);
    String str = "StickyGridHeadersGridView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " areHeadersSticky=" + this.zyU + "}";
    AppMethodBeat.o(107368);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(107369);
    super.writeToParcel(paramParcel, paramInt);
    if (this.zyU);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      AppMethodBeat.o(107369);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.SavedState
 * JD-Core Version:    0.6.2
 */