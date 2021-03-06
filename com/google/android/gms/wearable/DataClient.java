package com.google.android.gms.wearable;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.tasks.Task;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class DataClient extends GoogleApi<Wearable.WearableOptions>
{
  public static final String ACTION_DATA_CHANGED = "com.google.android.gms.wearable.DATA_CHANGED";
  public static final int FILTER_LITERAL = 0;
  public static final int FILTER_PREFIX = 1;

  public DataClient(Activity paramActivity, GoogleApi.Settings paramSettings)
  {
    super(paramActivity, Wearable.API, null, paramSettings);
  }

  public DataClient(Context paramContext, GoogleApi.Settings paramSettings)
  {
    super(paramContext, Wearable.API, null, paramSettings);
  }

  public abstract Task<Void> addListener(DataClient.OnDataChangedListener paramOnDataChangedListener);

  public abstract Task<Void> addListener(DataClient.OnDataChangedListener paramOnDataChangedListener, Uri paramUri, int paramInt);

  public abstract Task<Integer> deleteDataItems(Uri paramUri);

  public abstract Task<Integer> deleteDataItems(Uri paramUri, int paramInt);

  public abstract Task<DataItem> getDataItem(Uri paramUri);

  public abstract Task<DataItemBuffer> getDataItems();

  public abstract Task<DataItemBuffer> getDataItems(Uri paramUri);

  public abstract Task<DataItemBuffer> getDataItems(Uri paramUri, int paramInt);

  public abstract Task<DataClient.GetFdForAssetResponse> getFdForAsset(Asset paramAsset);

  public abstract Task<DataClient.GetFdForAssetResponse> getFdForAsset(DataItemAsset paramDataItemAsset);

  public abstract Task<DataItem> putDataItem(PutDataRequest paramPutDataRequest);

  public abstract Task<Boolean> removeListener(DataClient.OnDataChangedListener paramOnDataChangedListener);

  @Retention(RetentionPolicy.SOURCE)
  public static @interface FilterType
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataClient
 * JD-Core Version:    0.6.2
 */