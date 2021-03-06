package com.tencent.mm.plugin.wallet_core.id_verify.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Profession
  implements Parcelable
{
  public static final Parcelable.Creator<Profession> CREATOR;
  public String tvN;
  public int tvO;

  static
  {
    AppMethodBeat.i(46657);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(46657);
  }

  protected Profession(Parcel paramParcel)
  {
    AppMethodBeat.i(46655);
    this.tvN = paramParcel.readString();
    this.tvO = paramParcel.readInt();
    AppMethodBeat.o(46655);
  }

  public Profession(String paramString, int paramInt)
  {
    this.tvN = paramString;
    this.tvO = paramInt;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46656);
    paramParcel.writeString(this.tvN);
    paramParcel.writeInt(this.tvO);
    AppMethodBeat.o(46656);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.model.Profession
 * JD-Core Version:    0.6.2
 */