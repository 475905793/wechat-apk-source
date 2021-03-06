package oicq.wlogin_sdk.tools;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ErrMsg
  implements Parcelable, Cloneable
{
  public static final Parcelable.Creator<ErrMsg> CREATOR;
  public String BVZ;
  public String message;
  public String title;
  private int type;

  static
  {
    AppMethodBeat.i(96553);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(96553);
  }

  public ErrMsg()
  {
    this.type = 0;
    this.title = "";
    this.message = "";
    this.BVZ = "";
  }

  private ErrMsg(Parcel paramParcel)
  {
    AppMethodBeat.i(96555);
    this.type = paramParcel.readInt();
    this.title = paramParcel.readString();
    this.message = paramParcel.readString();
    this.BVZ = paramParcel.readString();
    AppMethodBeat.o(96555);
  }

  public Object clone()
  {
    AppMethodBeat.i(96554);
    Object localObject = super.clone();
    AppMethodBeat.o(96554);
    return localObject;
  }

  public int describeContents()
  {
    return 0;
  }

  public final void emK()
  {
    this.type = 0;
    this.title = "";
    this.message = "";
    this.BVZ = "";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(96556);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.title);
    paramParcel.writeString(this.message);
    paramParcel.writeString(this.BVZ);
    AppMethodBeat.o(96556);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.tools.ErrMsg
 * JD-Core Version:    0.6.2
 */