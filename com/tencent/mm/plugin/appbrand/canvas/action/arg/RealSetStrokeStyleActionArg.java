package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONArray;

public class RealSetStrokeStyleActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<RealSetStrokeStyleActionArg> CREATOR;

  static
  {
    AppMethodBeat.i(103399);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(103399);
  }

  public RealSetStrokeStyleActionArg()
  {
  }

  public RealSetStrokeStyleActionArg(Parcel paramParcel)
  {
    super(paramParcel, (byte)0);
  }

  public int describeContents()
  {
    return 0;
  }

  public void f(JSONArray paramJSONArray)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionArg
 * JD-Core Version:    0.6.2
 */