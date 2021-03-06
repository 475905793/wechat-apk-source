package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@SafeParcelable.Class(creator="AncsNotificationParcelableCreator")
@SafeParcelable.Reserved({1})
@Immutable
public final class zzl extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzl> CREATOR;

  @SafeParcelable.Field(getter="getId", id=2)
  private int id;

  @Nullable
  @SafeParcelable.Field(getter="getPackageName", id=13)
  private final String packageName;

  @SafeParcelable.Field(getter="getAppId", id=3)
  private final String zzbf;

  @Nullable
  @SafeParcelable.Field(getter="getDateTime", id=4)
  private final String zzbg;

  @SafeParcelable.Field(getter="getNotificationText", id=5)
  private final String zzbh;

  @SafeParcelable.Field(getter="getTitle", id=6)
  private final String zzbi;

  @SafeParcelable.Field(getter="getSubtitle", id=7)
  private final String zzbj;

  @Nullable
  @SafeParcelable.Field(getter="getDisplayName", id=8)
  private final String zzbk;

  @SafeParcelable.Field(getter="getEventId", id=9)
  private final byte zzbl;

  @SafeParcelable.Field(getter="getEventFlags", id=10)
  private final byte zzbm;

  @SafeParcelable.Field(getter="getCategoryId", id=11)
  private final byte zzbn;

  @SafeParcelable.Field(getter="getCategoryCount", id=12)
  private final byte zzbo;

  static
  {
    AppMethodBeat.i(71453);
    CREATOR = new zzm();
    AppMethodBeat.o(71453);
  }

  @SafeParcelable.Constructor
  public zzl(@SafeParcelable.Param(id=2) int paramInt, @SafeParcelable.Param(id=3) String paramString1, @SafeParcelable.Param(id=4) @Nullable String paramString2, @SafeParcelable.Param(id=5) String paramString3, @SafeParcelable.Param(id=6) String paramString4, @SafeParcelable.Param(id=7) String paramString5, @SafeParcelable.Param(id=8) @Nullable String paramString6, @SafeParcelable.Param(id=9) byte paramByte1, @SafeParcelable.Param(id=10) byte paramByte2, @SafeParcelable.Param(id=11) byte paramByte3, @SafeParcelable.Param(id=12) byte paramByte4, @SafeParcelable.Param(id=13) @Nullable String paramString7)
  {
    this.id = paramInt;
    this.zzbf = paramString1;
    this.zzbg = paramString2;
    this.zzbh = paramString3;
    this.zzbi = paramString4;
    this.zzbj = paramString5;
    this.zzbk = paramString6;
    this.zzbl = ((byte)paramByte1);
    this.zzbm = ((byte)paramByte2);
    this.zzbn = ((byte)paramByte3);
    this.zzbo = ((byte)paramByte4);
    this.packageName = paramString7;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(71451);
    if (this == paramObject)
      AppMethodBeat.o(71451);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(71451);
        bool = false;
      }
      else
      {
        paramObject = (zzl)paramObject;
        if (this.id != paramObject.id)
        {
          AppMethodBeat.o(71451);
          bool = false;
        }
        else if (this.zzbl != paramObject.zzbl)
        {
          AppMethodBeat.o(71451);
          bool = false;
        }
        else if (this.zzbm != paramObject.zzbm)
        {
          AppMethodBeat.o(71451);
          bool = false;
        }
        else if (this.zzbn != paramObject.zzbn)
        {
          AppMethodBeat.o(71451);
          bool = false;
        }
        else if (this.zzbo != paramObject.zzbo)
        {
          AppMethodBeat.o(71451);
          bool = false;
        }
        else if (!this.zzbf.equals(paramObject.zzbf))
        {
          AppMethodBeat.o(71451);
          bool = false;
        }
        else
        {
          if (this.zzbg != null)
          {
            if (this.zzbg.equals(paramObject.zzbg));
          }
          else
            while (paramObject.zzbg != null)
            {
              AppMethodBeat.o(71451);
              bool = false;
              break;
            }
          if (!this.zzbh.equals(paramObject.zzbh))
          {
            AppMethodBeat.o(71451);
            bool = false;
          }
          else if (!this.zzbi.equals(paramObject.zzbi))
          {
            AppMethodBeat.o(71451);
            bool = false;
          }
          else if (!this.zzbj.equals(paramObject.zzbj))
          {
            AppMethodBeat.o(71451);
            bool = false;
          }
          else
          {
            if (this.zzbk != null)
            {
              if (this.zzbk.equals(paramObject.zzbk));
            }
            else
              while (paramObject.zzbk != null)
              {
                AppMethodBeat.o(71451);
                bool = false;
                break;
              }
            if (this.packageName != null)
            {
              bool = this.packageName.equals(paramObject.packageName);
              AppMethodBeat.o(71451);
            }
            else if (paramObject.packageName == null)
            {
              AppMethodBeat.o(71451);
            }
            else
            {
              AppMethodBeat.o(71451);
              bool = false;
            }
          }
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(71452);
    int j = this.id;
    int k = this.zzbf.hashCode();
    int m;
    int n;
    int i1;
    int i2;
    if (this.zzbg != null)
    {
      m = this.zzbg.hashCode();
      n = this.zzbh.hashCode();
      i1 = this.zzbi.hashCode();
      i2 = this.zzbj.hashCode();
      if (this.zzbk == null)
        break label198;
    }
    label198: for (int i3 = this.zzbk.hashCode(); ; i3 = 0)
    {
      int i4 = this.zzbl;
      int i5 = this.zzbm;
      int i6 = this.zzbn;
      int i7 = this.zzbo;
      if (this.packageName != null)
        i = this.packageName.hashCode();
      AppMethodBeat.o(71452);
      return (((((i3 + ((((m + ((j + 31) * 31 + k) * 31) * 31 + n) * 31 + i1) * 31 + i2) * 31) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i;
      m = 0;
      break;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(71450);
    int i = this.id;
    String str1 = this.zzbf;
    String str2 = this.zzbg;
    String str3 = this.zzbh;
    String str4 = this.zzbi;
    String str5 = this.zzbj;
    String str6 = this.zzbk;
    int j = this.zzbl;
    int k = this.zzbm;
    int m = this.zzbn;
    int n = this.zzbo;
    String str7 = this.packageName;
    str4 = String.valueOf(str1).length() + 211 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + "AncsNotificationParcelable{, id=" + i + ", appId='" + str1 + '\'' + ", dateTime='" + str2 + '\'' + ", notificationText='" + str3 + '\'' + ", title='" + str4 + '\'' + ", subtitle='" + str5 + '\'' + ", displayName='" + str6 + '\'' + ", eventId=" + j + ", eventFlags=" + k + ", categoryId=" + m + ", categoryCount=" + n + ", packageName='" + str7 + '\'' + '}';
    AppMethodBeat.o(71450);
    return str4;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(71449);
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 2, this.id);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzbf, false);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzbg, false);
    SafeParcelWriter.writeString(paramParcel, 5, this.zzbh, false);
    SafeParcelWriter.writeString(paramParcel, 6, this.zzbi, false);
    SafeParcelWriter.writeString(paramParcel, 7, this.zzbj, false);
    if (this.zzbk == null);
    for (String str = this.zzbf; ; str = this.zzbk)
    {
      SafeParcelWriter.writeString(paramParcel, 8, str, false);
      SafeParcelWriter.writeByte(paramParcel, 9, this.zzbl);
      SafeParcelWriter.writeByte(paramParcel, 10, this.zzbm);
      SafeParcelWriter.writeByte(paramParcel, 11, this.zzbn);
      SafeParcelWriter.writeByte(paramParcel, 12, this.zzbo);
      SafeParcelWriter.writeString(paramParcel, 13, this.packageName, false);
      SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
      AppMethodBeat.o(71449);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzl
 * JD-Core Version:    0.6.2
 */