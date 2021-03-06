package com.tencent.mm.ui.widget.picker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import com.tencent.matrix.trace.core.AppMethodBeat;

class YADatePicker$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR;
  private final int enR;
  private final int enV;
  private final int jHz;

  static
  {
    AppMethodBeat.i(112908);
    CREATOR = new YADatePicker.SavedState.1();
    AppMethodBeat.o(112908);
  }

  private YADatePicker$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(112906);
    this.enV = paramParcel.readInt();
    this.enR = paramParcel.readInt();
    this.jHz = paramParcel.readInt();
    AppMethodBeat.o(112906);
  }

  private YADatePicker$SavedState(Parcelable paramParcelable, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramParcelable);
    this.enV = paramInt1;
    this.enR = paramInt2;
    this.jHz = paramInt3;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(112907);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.enV);
    paramParcel.writeInt(this.enR);
    paramParcel.writeInt(this.jHz);
    AppMethodBeat.o(112907);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.YADatePicker.SavedState
 * JD-Core Version:    0.6.2
 */