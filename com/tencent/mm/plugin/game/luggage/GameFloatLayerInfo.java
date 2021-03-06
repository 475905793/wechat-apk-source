package com.tencent.mm.plugin.game.luggage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GameFloatLayerInfo
  implements Parcelable
{
  public static final Parcelable.Creator<GameFloatLayerInfo> CREATOR;
  public boolean mTC;
  public int orientation;
  public String url;

  static
  {
    AppMethodBeat.i(135797);
    CREATOR = new GameFloatLayerInfo.1();
    AppMethodBeat.o(135797);
  }

  public GameFloatLayerInfo()
  {
    this.mTC = false;
    this.orientation = -1;
  }

  private GameFloatLayerInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(135796);
    this.mTC = false;
    this.orientation = -1;
    this.url = paramParcel.readString();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.mTC = bool;
      this.orientation = paramParcel.readInt();
      AppMethodBeat.o(135796);
      return;
      bool = false;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(135795);
    paramParcel.writeString(this.url);
    if (this.mTC);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.orientation);
      AppMethodBeat.o(135795);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo
 * JD-Core Version:    0.6.2
 */