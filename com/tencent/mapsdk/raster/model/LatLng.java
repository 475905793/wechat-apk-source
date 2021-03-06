package com.tencent.mapsdk.raster.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class LatLng
  implements Cloneable
{
  private static DecimalFormat df;
  private final double latitude;
  private final double longitude;

  static
  {
    AppMethodBeat.i(101198);
    df = new DecimalFormat("0.000000", new DecimalFormatSymbols(Locale.US));
    AppMethodBeat.o(101198);
  }

  public LatLng(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(101191);
    if ((-180.0D <= paramDouble2) && (paramDouble2 < 180.0D));
    for (this.longitude = parseDouble(paramDouble2); ; this.longitude = parseDouble(((paramDouble2 - 180.0D) % 360.0D + 360.0D) % 360.0D - 180.0D))
    {
      this.latitude = parseDouble(Math.max(-85.0D, Math.min(85.0D, paramDouble1)));
      AppMethodBeat.o(101191);
      return;
    }
  }

  private static double parseDouble(double paramDouble)
  {
    AppMethodBeat.i(101192);
    paramDouble = Double.parseDouble(df.format(paramDouble));
    AppMethodBeat.o(101192);
    return paramDouble;
  }

  public final LatLng clone()
  {
    AppMethodBeat.i(101193);
    LatLng localLatLng = new LatLng(this.latitude, this.longitude);
    AppMethodBeat.o(101193);
    return localLatLng;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(101195);
    if (this == paramObject)
      AppMethodBeat.o(101195);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof LatLng))
      {
        AppMethodBeat.o(101195);
        bool = false;
      }
      else
      {
        paramObject = (LatLng)paramObject;
        if ((Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(paramObject.latitude)) && (Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(paramObject.longitude)))
        {
          AppMethodBeat.o(101195);
        }
        else
        {
          AppMethodBeat.o(101195);
          bool = false;
        }
      }
    }
  }

  public final double getLatitude()
  {
    return this.latitude;
  }

  public final double getLongitude()
  {
    return this.longitude;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(101194);
    long l = Double.doubleToLongBits(this.latitude);
    int i = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(this.longitude);
    int j = (int)(l ^ l >>> 32);
    AppMethodBeat.o(101194);
    return (i + 31) * 31 + j;
  }

  public final String toString()
  {
    AppMethodBeat.i(101196);
    String str = "lat/lng: (" + this.latitude + "," + this.longitude + ")";
    AppMethodBeat.o(101196);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mapsdk.raster.model.LatLng
 * JD-Core Version:    0.6.2
 */