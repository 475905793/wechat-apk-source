package com.tencent.wcdb;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.support.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractCursor
  implements CrossProcessCursor
{
  private static final String TAG = "Cursor";
  protected boolean mClosed;
  private final ContentObservable mContentObservable = new ContentObservable();
  protected ContentResolver mContentResolver;

  @Deprecated
  protected Long mCurrentRowID = null;
  private final DataSetObservable mDataSetObservable = new DataSetObservable();
  private Bundle mExtras = Bundle.EMPTY;
  private Uri mNotifyUri;
  public int mPos = -1;

  @Deprecated
  protected int mRowIdColumnIndex = -1;
  private ContentObserver mSelfObserver;
  private final Object mSelfObserverLock = new Object();
  private boolean mSelfObserverRegistered;

  @Deprecated
  protected HashMap<Long, Map<String, Object>> mUpdatedRows = new HashMap();

  protected void checkPosition()
  {
    if ((-1 == this.mPos) || (getCount() == this.mPos))
      throw new CursorIndexOutOfBoundsException(this.mPos, getCount());
  }

  public void close()
  {
    this.mClosed = true;
    this.mContentObservable.unregisterAll();
    onDeactivateOrClose();
  }

  public void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
    String str = getString(paramInt);
    char[] arrayOfChar;
    if (str != null)
    {
      arrayOfChar = paramCharArrayBuffer.data;
      if ((arrayOfChar == null) || (arrayOfChar.length < str.length()))
        paramCharArrayBuffer.data = str.toCharArray();
    }
    for (paramCharArrayBuffer.sizeCopied = str.length(); ; paramCharArrayBuffer.sizeCopied = 0)
    {
      return;
      str.getChars(0, str.length(), arrayOfChar, 0);
      break;
    }
  }

  public void deactivate()
  {
    onDeactivateOrClose();
  }

  public void fillWindow(int paramInt, CursorWindow paramCursorWindow)
  {
    DatabaseUtils.cursorFillWindow(this, paramInt, paramCursorWindow);
  }

  protected void finalize()
  {
    if ((this.mSelfObserver != null) && (this.mSelfObserverRegistered == true))
      this.mContentResolver.unregisterContentObserver(this.mSelfObserver);
    try
    {
      if (!this.mClosed)
        close();
      label37: return;
    }
    catch (Exception localException)
    {
      break label37;
    }
  }

  public byte[] getBlob(int paramInt)
  {
    throw new UnsupportedOperationException("getBlob is not supported");
  }

  public int getColumnCount()
  {
    return getColumnNames().length;
  }

  public int getColumnIndex(String paramString)
  {
    int i = 0;
    int j = paramString.lastIndexOf('.');
    Object localObject = paramString;
    if (j != -1)
    {
      localObject = new Exception();
      Log.e("Cursor", "requesting column name with table name -- ".concat(String.valueOf(paramString)), new Object[] { localObject });
      localObject = paramString.substring(j + 1);
    }
    paramString = getColumnNames();
    j = paramString.length;
    if (i < j)
      if (!paramString[i].equalsIgnoreCase((String)localObject));
    while (true)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }

  public int getColumnIndexOrThrow(String paramString)
  {
    int i = getColumnIndex(paramString);
    if (i < 0)
      throw new IllegalArgumentException("column '" + paramString + "' does not exist");
    return i;
  }

  public String getColumnName(int paramInt)
  {
    return getColumnNames()[paramInt];
  }

  public abstract String[] getColumnNames();

  public abstract int getCount();

  public abstract double getDouble(int paramInt);

  public Bundle getExtras()
  {
    return this.mExtras;
  }

  public abstract float getFloat(int paramInt);

  public abstract int getInt(int paramInt);

  public abstract long getLong(int paramInt);

  public Uri getNotificationUri()
  {
    return this.mNotifyUri;
  }

  public final int getPosition()
  {
    return this.mPos;
  }

  public abstract short getShort(int paramInt);

  public abstract String getString(int paramInt);

  public int getType(int paramInt)
  {
    return 3;
  }

  @Deprecated
  protected Object getUpdatedField(int paramInt)
  {
    return null;
  }

  public boolean getWantsAllOnMoveCalls()
  {
    return false;
  }

  public CursorWindow getWindow()
  {
    return null;
  }

  public final boolean isAfterLast()
  {
    boolean bool = true;
    if (getCount() == 0);
    while (true)
    {
      return bool;
      if (this.mPos != getCount())
        bool = false;
    }
  }

  public final boolean isBeforeFirst()
  {
    boolean bool = true;
    if (getCount() == 0);
    while (true)
    {
      return bool;
      if (this.mPos != -1)
        bool = false;
    }
  }

  public boolean isClosed()
  {
    return this.mClosed;
  }

  @Deprecated
  protected boolean isFieldUpdated(int paramInt)
  {
    return false;
  }

  public final boolean isFirst()
  {
    if ((this.mPos == 0) && (getCount() != 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean isLast()
  {
    int i = getCount();
    if ((this.mPos == i - 1) && (i != 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public abstract boolean isNull(int paramInt);

  public final boolean move(int paramInt)
  {
    return moveToPosition(this.mPos + paramInt);
  }

  public final boolean moveToFirst()
  {
    return moveToPosition(0);
  }

  public final boolean moveToLast()
  {
    return moveToPosition(getCount() - 1);
  }

  public final boolean moveToNext()
  {
    return moveToPosition(this.mPos + 1);
  }

  public boolean moveToPosition(int paramInt)
  {
    boolean bool1 = false;
    int i = getCount();
    if (paramInt >= i)
      this.mPos = i;
    while (true)
    {
      return bool1;
      if (paramInt < 0)
      {
        this.mPos = -1;
      }
      else if (paramInt == this.mPos)
      {
        bool1 = true;
      }
      else
      {
        boolean bool2 = onMove(this.mPos, paramInt);
        if (!bool2)
        {
          this.mPos = -1;
          bool1 = bool2;
        }
        else
        {
          this.mPos = paramInt;
          bool1 = bool2;
          if (this.mRowIdColumnIndex != -1)
          {
            this.mCurrentRowID = Long.valueOf(getLong(this.mRowIdColumnIndex));
            bool1 = bool2;
          }
        }
      }
    }
  }

  public final boolean moveToPrevious()
  {
    return moveToPosition(this.mPos - 1);
  }

  protected void onChange(boolean paramBoolean)
  {
    synchronized (this.mSelfObserverLock)
    {
      this.mContentObservable.dispatchChange(paramBoolean);
      if ((this.mNotifyUri != null) && (paramBoolean))
        this.mContentResolver.notifyChange(this.mNotifyUri, this.mSelfObserver);
      return;
    }
  }

  protected void onDeactivateOrClose()
  {
    if (this.mSelfObserver != null)
    {
      this.mContentResolver.unregisterContentObserver(this.mSelfObserver);
      this.mSelfObserverRegistered = false;
    }
    this.mDataSetObservable.notifyInvalidated();
  }

  public boolean onMove(int paramInt1, int paramInt2)
  {
    return true;
  }

  public void registerContentObserver(ContentObserver paramContentObserver)
  {
    this.mContentObservable.registerObserver(paramContentObserver);
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.mDataSetObservable.registerObserver(paramDataSetObserver);
  }

  public boolean requery()
  {
    if ((this.mSelfObserver != null) && (!this.mSelfObserverRegistered))
    {
      this.mContentResolver.registerContentObserver(this.mNotifyUri, true, this.mSelfObserver);
      this.mSelfObserverRegistered = true;
    }
    this.mDataSetObservable.notifyChanged();
    return true;
  }

  public Bundle respond(Bundle paramBundle)
  {
    return Bundle.EMPTY;
  }

  public void setExtras(Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
      localBundle = Bundle.EMPTY;
    this.mExtras = localBundle;
  }

  public void setNotificationUri(ContentResolver paramContentResolver, Uri paramUri)
  {
    synchronized (this.mSelfObserverLock)
    {
      this.mNotifyUri = paramUri;
      this.mContentResolver = paramContentResolver;
      if (this.mSelfObserver != null)
        this.mContentResolver.unregisterContentObserver(this.mSelfObserver);
      paramContentResolver = new com/tencent/wcdb/AbstractCursor$SelfContentObserver;
      paramContentResolver.<init>(this);
      this.mSelfObserver = paramContentResolver;
      this.mContentResolver.registerContentObserver(this.mNotifyUri, true, this.mSelfObserver);
      this.mSelfObserverRegistered = true;
      return;
    }
  }

  public void unregisterContentObserver(ContentObserver paramContentObserver)
  {
    if (!this.mClosed)
      this.mContentObservable.unregisterObserver(paramContentObserver);
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    this.mDataSetObservable.unregisterObserver(paramDataSetObserver);
  }

  protected static class SelfContentObserver extends ContentObserver
  {
    WeakReference<AbstractCursor> mCursor;

    public SelfContentObserver(AbstractCursor paramAbstractCursor)
    {
      super();
      AppMethodBeat.i(11958);
      this.mCursor = new WeakReference(paramAbstractCursor);
      AppMethodBeat.o(11958);
    }

    public boolean deliverSelfNotifications()
    {
      return false;
    }

    public void onChange(boolean paramBoolean)
    {
      AppMethodBeat.i(11959);
      AbstractCursor localAbstractCursor = (AbstractCursor)this.mCursor.get();
      if (localAbstractCursor != null)
        localAbstractCursor.onChange(false);
      AppMethodBeat.o(11959);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.AbstractCursor
 * JD-Core Version:    0.6.2
 */