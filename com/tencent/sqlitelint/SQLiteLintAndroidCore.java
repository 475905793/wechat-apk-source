package com.tencent.sqlitelint;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.sqlitelint.behaviour.BaseBehaviour;
import com.tencent.sqlitelint.behaviour.alert.IssueAlertBehaviour;
import com.tencent.sqlitelint.behaviour.persistence.IssueStorage;
import com.tencent.sqlitelint.behaviour.persistence.PersistenceBehaviour;
import com.tencent.sqlitelint.behaviour.persistence.SQLiteLintDbHelper;
import com.tencent.sqlitelint.behaviour.report.IssueReportBehaviour;
import com.tencent.sqlitelint.util.SQLite3ProfileHooker;
import com.tencent.sqlitelint.util.SQLiteLintUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class SQLiteLintAndroidCore
  implements IOnIssuePublishListener
{
  private static final String TAG = "SQLiteLint.SQLiteLintAndroidCore";
  private final List<BaseBehaviour> mBehaviors;
  private final String mConcernedDbPath;
  private final Context mContext;
  private final ISQLiteExecutionDelegate mSQLiteExecutionDelegate;

  SQLiteLintAndroidCore(Context paramContext, SQLiteLint.InstallEnv paramInstallEnv, SQLiteLint.Options paramOptions)
  {
    AppMethodBeat.i(93993);
    this.mContext = paramContext;
    SQLiteLintDbHelper.INSTANCE.initialize(paramContext);
    this.mConcernedDbPath = paramInstallEnv.getConcernedDbPath();
    this.mSQLiteExecutionDelegate = paramInstallEnv.getSQLiteExecutionDelegate();
    if (SQLiteLint.getSqlExecutionCallbackMode() == SQLiteLint.SqlExecutionCallbackMode.HOOK)
      SQLite3ProfileHooker.hook();
    SQLiteLintNativeBridge.nativeInstall(this.mConcernedDbPath);
    this.mBehaviors = new ArrayList();
    this.mBehaviors.add(new PersistenceBehaviour());
    if (paramOptions.isAlertBehaviourEnable())
      this.mBehaviors.add(new IssueAlertBehaviour(paramContext, this.mConcernedDbPath));
    if (paramOptions.isReportBehaviourEnable())
      this.mBehaviors.add(new IssueReportBehaviour(SQLiteLint.sReportDelegate));
    AppMethodBeat.o(93993);
  }

  public void addBehavior(BaseBehaviour paramBaseBehaviour)
  {
    AppMethodBeat.i(93994);
    if (!this.mBehaviors.contains(paramBaseBehaviour))
      this.mBehaviors.add(paramBaseBehaviour);
    AppMethodBeat.o(93994);
  }

  public void enableCheckers(List<String> paramList)
  {
    AppMethodBeat.i(93999);
    String[] arrayOfString = new String[paramList.size()];
    for (int i = 0; i < paramList.size(); i++)
      arrayOfString[i] = ((String)paramList.get(i));
    SQLiteLintNativeBridge.nativeEnableCheckers(this.mConcernedDbPath, arrayOfString);
    AppMethodBeat.o(93999);
  }

  public ISQLiteExecutionDelegate getSQLiteExecutionDelegate()
  {
    return this.mSQLiteExecutionDelegate;
  }

  public void notifySqlExecution(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(93997);
    String str = "null";
    if (paramLong >= 8L)
      str = SQLiteLintUtil.getThrowableStack(new Throwable());
    SQLiteLintNativeBridge.nativeNotifySqlExecute(paramString1, paramString2, paramLong, str);
    AppMethodBeat.o(93997);
  }

  public void onPublish(List<SQLiteLintIssue> paramList)
  {
    int i = 0;
    AppMethodBeat.i(94000);
    Iterator localIterator = paramList.iterator();
    int j;
    while (true)
    {
      j = i;
      if (!localIterator.hasNext())
        break;
      SQLiteLintIssue localSQLiteLintIssue = (SQLiteLintIssue)localIterator.next();
      if (IssueStorage.hasIssue(localSQLiteLintIssue.id))
        localSQLiteLintIssue.isNew = false;
      else
        localSQLiteLintIssue.isNew = true;
    }
    while (j < this.mBehaviors.size())
    {
      ((BaseBehaviour)this.mBehaviors.get(j)).onPublish(paramList);
      j++;
    }
    AppMethodBeat.o(94000);
  }

  public void release()
  {
    AppMethodBeat.i(93996);
    if (SQLiteLint.getSqlExecutionCallbackMode() == SQLiteLint.SqlExecutionCallbackMode.HOOK)
      SQLite3ProfileHooker.unHook();
    SQLiteLintNativeBridge.nativeUninstall(this.mConcernedDbPath);
    AppMethodBeat.o(93996);
  }

  public void removeBehavior(BaseBehaviour paramBaseBehaviour)
  {
    AppMethodBeat.i(93995);
    this.mBehaviors.remove(paramBaseBehaviour);
    AppMethodBeat.o(93995);
  }

  public void setWhiteList(int paramInt)
  {
    AppMethodBeat.i(93998);
    CheckerWhiteListLogic.setWhiteList(this.mContext, this.mConcernedDbPath, paramInt);
    AppMethodBeat.o(93998);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.sqlitelint.SQLiteLintAndroidCore
 * JD-Core Version:    0.6.2
 */