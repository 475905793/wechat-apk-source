package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Orders$DeductShowInfo
  implements Parcelable
{
  public static final Parcelable.Creator<DeductShowInfo> CREATOR;
  public String name;
  public int tBi;
  public String tBj;
  public String tBk;
  public String tBl;
  public String value;

  static
  {
    AppMethodBeat.i(46807);
    CREATOR = new Orders.DeductShowInfo.1();
    AppMethodBeat.o(46807);
  }

  public Orders$DeductShowInfo()
  {
  }

  protected Orders$DeductShowInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(46805);
    this.name = paramParcel.readString();
    this.value = paramParcel.readString();
    this.tBi = paramParcel.readInt();
    this.tBj = paramParcel.readString();
    this.tBk = paramParcel.readString();
    this.tBl = paramParcel.readString();
    AppMethodBeat.o(46805);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46806);
    paramParcel.writeString(this.name);
    paramParcel.writeString(this.value);
    paramParcel.writeInt(this.tBi);
    paramParcel.writeString(this.tBj);
    paramParcel.writeString(this.tBk);
    paramParcel.writeString(this.tBl);
    AppMethodBeat.o(46806);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo
 * JD-Core Version:    0.6.2
 */