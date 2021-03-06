package com.tencent.tmassistantsdk.storage.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import com.tencent.tmassistantsdk.storage.table.DownloadInfoTable;
import com.tencent.tmassistantsdk.storage.table.DownloadLogTable;
import com.tencent.tmassistantsdk.storage.table.DownloadSettingTable;
import com.tencent.tmassistantsdk.storage.table.TipsInfoLogTable;
import com.tencent.tmassistantsdk.storage.table.UpdateInfoLogTable;
import com.tencent.tmassistantsdk.util.GlobalUtil;

public class AstSDKDBHelper_V2 extends SqliteHelper
{
  protected static final String DB_NAME = "tmassistant_sdk_v2.db";
  protected static final int DB_VERSION = 3;
  private static final Class<?>[] TABLESS = { DownloadInfoTable.class, DownloadSettingTable.class, ClientInfoTable.class, TipsInfoLogTable.class, DownloadLogTable.class, UpdateInfoLogTable.class };
  protected static SqliteHelper mInstance = null;

  public AstSDKDBHelper_V2(Context paramContext, String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    super(paramContext, paramString, paramCursorFactory, paramInt);
  }

  public static SqliteHelper getInstance()
  {
    try
    {
      AppMethodBeat.i(76183);
      if (mInstance == null)
      {
        localObject1 = GlobalUtil.getInstance().getContext();
        if (localObject1 != null)
        {
          AstSDKDBHelper_V2 localAstSDKDBHelper_V2 = new com/tencent/tmassistantsdk/storage/helper/AstSDKDBHelper_V2;
          localAstSDKDBHelper_V2.<init>((Context)localObject1, "tmassistant_sdk_v2.db", null, 3);
          mInstance = localAstSDKDBHelper_V2;
        }
      }
      Object localObject1 = mInstance;
      AppMethodBeat.o(76183);
      return localObject1;
    }
    finally
    {
    }
  }

  public int getDBVersion()
  {
    return 3;
  }

  public Class<?>[] getTables()
  {
    return TABLESS;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.storage.helper.AstSDKDBHelper_V2
 * JD-Core Version:    0.6.2
 */