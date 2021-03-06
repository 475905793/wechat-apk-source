package com.google.android.gms.common.server.response;

import android.content.ContentValues;
import com.google.android.gms.common.util.VisibleForTesting;

public abstract class FastContentValuesJsonResponse extends FastJsonResponse
{
  private final ContentValues zzwj;

  public FastContentValuesJsonResponse()
  {
    this.zzwj = new ContentValues();
  }

  @VisibleForTesting
  public FastContentValuesJsonResponse(ContentValues paramContentValues)
  {
    this.zzwj = paramContentValues;
  }

  protected Object getValueObject(String paramString)
  {
    return this.zzwj.get(paramString);
  }

  public ContentValues getValues()
  {
    return this.zzwj;
  }

  protected boolean isPrimitiveFieldSet(String paramString)
  {
    return this.zzwj.containsKey(paramString);
  }

  protected void setBoolean(String paramString, boolean paramBoolean)
  {
    this.zzwj.put(paramString, Boolean.valueOf(paramBoolean));
  }

  protected void setDecodedBytes(String paramString, byte[] paramArrayOfByte)
  {
    this.zzwj.put(paramString, paramArrayOfByte);
  }

  protected void setDouble(String paramString, double paramDouble)
  {
    this.zzwj.put(paramString, Double.valueOf(paramDouble));
  }

  protected void setFloat(String paramString, float paramFloat)
  {
    this.zzwj.put(paramString, Float.valueOf(paramFloat));
  }

  protected void setInteger(String paramString, int paramInt)
  {
    this.zzwj.put(paramString, Integer.valueOf(paramInt));
  }

  protected void setLong(String paramString, long paramLong)
  {
    this.zzwj.put(paramString, Long.valueOf(paramLong));
  }

  protected void setString(String paramString1, String paramString2)
  {
    this.zzwj.put(paramString1, paramString2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.response.FastContentValuesJsonResponse
 * JD-Core Version:    0.6.2
 */