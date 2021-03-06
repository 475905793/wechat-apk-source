package com.tencent.qqmusic.mediaplayer.codec;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.NativeLibs;
import com.tencent.qqmusic.mediaplayer.upstream.FileDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class NativeDecoder extends BaseDecoder
{
  private static final String TAG = "NativeDecoder";
  private long mNativePointer;
  private final ReadWriteLock mReadWriteLock;

  public NativeDecoder()
  {
    AppMethodBeat.i(128552);
    this.mReadWriteLock = new ReentrantReadWriteLock();
    this.mNativePointer = 0L;
    AppMethodBeat.o(128552);
  }

  private native int nativeDecode(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  private native AudioInformation nativeGetAudioInformation(long paramLong);

  private native long nativeGetBytePositionOfTime(long paramLong1, long paramLong2);

  private native long nativeGetCurrentPosition(long paramLong);

  private native int nativeGetDetailErrorCode(long paramLong);

  private native String nativeGetDetailErrorDescription(long paramLong);

  private native long nativeGetDuration(long paramLong);

  private native long nativeGetMinBufferSize(long paramLong);

  private native long[] nativeInit(long paramLong);

  private native long[] nativeInit(IDataSource paramIDataSource);

  private native int nativeRelease(long paramLong);

  private native long nativeSeekTo(long paramLong1, long paramLong2);

  public int decodeData(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(128556);
    this.mReadWriteLock.readLock().lock();
    try
    {
      paramInt = nativeDecode(this.mNativePointer, paramArrayOfByte, 0, paramInt);
      return paramInt;
    }
    finally
    {
      this.mReadWriteLock.readLock().unlock();
      AppMethodBeat.o(128556);
    }
    throw paramArrayOfByte;
  }

  public AudioInformation getAudioInformation()
  {
    AppMethodBeat.i(128560);
    this.mReadWriteLock.readLock().lock();
    try
    {
      AudioInformation localAudioInformation = nativeGetAudioInformation(this.mNativePointer);
      return localAudioInformation;
    }
    finally
    {
      this.mReadWriteLock.readLock().unlock();
      AppMethodBeat.o(128560);
    }
  }

  public long getBytePositionOfTime(long paramLong)
  {
    AppMethodBeat.i(128563);
    this.mReadWriteLock.readLock().lock();
    try
    {
      paramLong = nativeGetBytePositionOfTime(this.mNativePointer, paramLong);
      return paramLong;
    }
    finally
    {
      this.mReadWriteLock.readLock().unlock();
      AppMethodBeat.o(128563);
    }
  }

  public long getCurrentTime()
  {
    AppMethodBeat.i(128558);
    this.mReadWriteLock.readLock().lock();
    try
    {
      long l = nativeGetCurrentPosition(this.mNativePointer);
      return l;
    }
    finally
    {
      this.mReadWriteLock.readLock().unlock();
      AppMethodBeat.o(128558);
    }
  }

  public long getDuration()
  {
    AppMethodBeat.i(128559);
    this.mReadWriteLock.readLock().lock();
    try
    {
      long l = nativeGetDuration(this.mNativePointer);
      return l;
    }
    finally
    {
      this.mReadWriteLock.readLock().unlock();
      AppMethodBeat.o(128559);
    }
  }

  public int getErrorCodeMask()
  {
    return -1;
  }

  public long getMinBufferSize()
  {
    AppMethodBeat.i(128562);
    this.mReadWriteLock.readLock().lock();
    try
    {
      long l = nativeGetMinBufferSize(this.mNativePointer);
      return l;
    }
    finally
    {
      this.mReadWriteLock.readLock().unlock();
      AppMethodBeat.o(128562);
    }
  }

  protected List<NativeLibs> getNativeLibs()
  {
    AppMethodBeat.i(128564);
    List localList = Arrays.asList(new NativeLibs[] { NativeLibs.audioCommon, NativeLibs.formatDetector, NativeLibs.codecFactory, NativeLibs.decoderJni, NativeLibs.cppShared, NativeLibs.stlportShared, NativeLibs.xlog, NativeLibs.FFmpeg });
    AppMethodBeat.o(128564);
    return localList;
  }

  public int init(IDataSource paramIDataSource)
  {
    AppMethodBeat.i(128553);
    this.mReadWriteLock.writeLock().lock();
    try
    {
      paramIDataSource = nativeInit(paramIDataSource);
      long l1 = -1L;
      long l2 = l1;
      if (paramIDataSource != null)
      {
        l2 = l1;
        if (paramIDataSource.length >= 2)
        {
          this.mNativePointer = paramIDataSource[0];
          l2 = paramIDataSource[1];
        }
      }
      int i = (int)l2;
      return i;
    }
    finally
    {
      this.mReadWriteLock.writeLock().unlock();
      AppMethodBeat.o(128553);
    }
    throw paramIDataSource;
  }

  public int init(INativeDataSource paramINativeDataSource)
  {
    AppMethodBeat.i(128554);
    this.mReadWriteLock.writeLock().lock();
    long l1 = -1L;
    long l2 = l1;
    if (paramINativeDataSource != null);
    try
    {
      paramINativeDataSource = nativeInit(paramINativeDataSource.getNativeInstance());
      l2 = l1;
      if (paramINativeDataSource != null)
      {
        l2 = l1;
        if (paramINativeDataSource.length >= 2)
        {
          this.mNativePointer = paramINativeDataSource[0];
          l2 = paramINativeDataSource[1];
        }
      }
      int i = (int)l2;
      return i;
    }
    finally
    {
      this.mReadWriteLock.writeLock().unlock();
      AppMethodBeat.o(128554);
    }
    throw paramINativeDataSource;
  }

  public int init(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(128555);
    int i = init(new FileDataSource(paramString));
    AppMethodBeat.o(128555);
    return i;
  }

  public int release()
  {
    AppMethodBeat.i(128561);
    this.mReadWriteLock.writeLock().lock();
    try
    {
      int i = nativeRelease(this.mNativePointer);
      this.mNativePointer = 0L;
      return i;
    }
    finally
    {
      this.mReadWriteLock.writeLock().unlock();
      AppMethodBeat.o(128561);
    }
  }

  public int seekTo(int paramInt)
  {
    AppMethodBeat.i(128557);
    this.mReadWriteLock.readLock().lock();
    try
    {
      long l = nativeSeekTo(this.mNativePointer, paramInt);
      paramInt = (int)l;
      return paramInt;
    }
    finally
    {
      this.mReadWriteLock.readLock().unlock();
      AppMethodBeat.o(128557);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.codec.NativeDecoder
 * JD-Core Version:    0.6.2
 */