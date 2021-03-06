package com.eclipsesource.v8.debug;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

class V8DebugServer$ClientLoop
  implements Runnable
{
  private int from;

  private V8DebugServer$ClientLoop(V8DebugServer paramV8DebugServer)
  {
  }

  private int indexOf(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte1.length;
    int j;
    if (paramInt1 < paramInt2)
    {
      j = 0;
      label13: if (j <= i)
        if (j != i);
    }
    while (true)
    {
      return paramInt1;
      if ((paramInt1 + j < paramInt2) && (paramArrayOfByte2[(paramInt1 + j)] == paramArrayOfByte1[j]))
      {
        j++;
        break label13;
      }
      paramInt1++;
      break;
      paramInt1 = -1;
    }
  }

  private byte[] join(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(74926);
    byte[] arrayOfByte = new byte[paramArrayOfByte1.length + paramInt2];
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0, paramArrayOfByte1.length);
    System.arraycopy(paramArrayOfByte2, paramInt1, arrayOfByte, paramArrayOfByte1.length, paramInt2);
    AppMethodBeat.o(74926);
    return arrayOfByte;
  }

  private void processClientRequests()
  {
    AppMethodBeat.i(74923);
    byte[] arrayOfByte1 = new byte[0];
    byte[] arrayOfByte2 = new byte[4096];
    while (true)
    {
      int i;
      int k;
      int m;
      Object localObject2;
      boolean bool2;
      synchronized (V8DebugServer.access$700(this.this$0))
      {
        InputStream localInputStream = V8DebugServer.access$800(this.this$0).getInputStream();
        i = -1;
        ??? = arrayOfByte1;
        bool1 = false;
        j = 0;
        k = localInputStream.read(arrayOfByte2, j, 4096 - j);
        if (k <= 0)
          break;
        m = j + k;
        this.from = 0;
        localObject2 = ???;
        k = i;
        j = k;
        if (k < 0)
        {
          j = readContentLength(arrayOfByte2, m);
          i = j;
          ??? = localObject2;
          bool2 = bool1;
          if (j < 0);
        }
        else
        {
          bool2 = bool1;
          if (!bool1)
          {
            bool1 = skipToolInfo(arrayOfByte2, m);
            i = j;
            ??? = localObject2;
            bool2 = bool1;
            if (bool1)
              bool2 = bool1;
          }
          else
          {
            i = Math.min(j - localObject2.length, m - this.from);
            localObject2 = join((byte[])localObject2, arrayOfByte2, this.from, i);
            this.from = (i + this.from);
            i = j;
            ??? = localObject2;
            if (localObject2.length == j)
              localObject2 = new String((byte[])localObject2, V8DebugServer.access$1100());
          }
        }
      }
      synchronized (V8DebugServer.access$1200(this.this$0))
      {
        V8DebugServer.access$1200(this.this$0).add(localObject2);
        i = -1;
        ??? = arrayOfByte1;
        bool2 = false;
        k = i;
        localObject2 = ???;
        bool1 = bool2;
        if (this.from < m)
          continue;
        if (this.from < m)
        {
          System.arraycopy(arrayOfByte2, this.from, arrayOfByte2, 0, m - this.from);
          j = m - this.from;
          bool1 = bool2;
          continue;
          localObject3 = finally;
          AppMethodBeat.o(74923);
          throw localObject3;
        }
      }
      int j = 0;
      boolean bool1 = bool2;
    }
    AppMethodBeat.o(74923);
  }

  private int readContentLength(byte[] paramArrayOfByte, int paramInt)
  {
    int i = -1;
    AppMethodBeat.i(74924);
    int j = indexOf(V8DebugServer.access$1300(), paramArrayOfByte, this.from, paramInt);
    if (j < 0)
    {
      AppMethodBeat.o(74924);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      int k = j + V8DebugServer.access$1300().length;
      j = indexOf(V8DebugServer.access$1400(), paramArrayOfByte, k, paramInt);
      if (j < 0)
      {
        AppMethodBeat.o(74924);
        paramInt = i;
      }
      else
      {
        String str = new String(paramArrayOfByte, k, j - k, V8DebugServer.access$1100());
        try
        {
          paramInt = Integer.parseInt(str.trim());
          this.from = (V8DebugServer.access$1400().length + j);
          AppMethodBeat.o(74924);
        }
        catch (Exception localException)
        {
          paramArrayOfByte = new IOException("Invalid content length header: '" + str + "' in message" + new String(paramArrayOfByte, V8DebugServer.access$1100()));
          AppMethodBeat.o(74924);
        }
      }
    }
    throw paramArrayOfByte;
  }

  private boolean skipToolInfo(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(74925);
    paramInt = indexOf(V8DebugServer.access$1400(), paramArrayOfByte, this.from, paramInt);
    boolean bool;
    if (paramInt < 0)
    {
      bool = false;
      AppMethodBeat.o(74925);
    }
    while (true)
    {
      return bool;
      this.from = (paramInt + V8DebugServer.access$1400().length);
      bool = true;
      AppMethodBeat.o(74925);
    }
  }

  private void startHandshake()
  {
    AppMethodBeat.i(74922);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("V8-Version: ");
    localStringBuilder.append("4.10.253");
    localStringBuilder.append("\r\n");
    localStringBuilder.append("Protocol-Version: ");
    localStringBuilder.append("1");
    localStringBuilder.append("\r\n");
    localStringBuilder.append("Embedding-Host: ");
    localStringBuilder.append("j2v8 ");
    localStringBuilder.append("4.0.0");
    localStringBuilder.append("\r\n");
    localStringBuilder.append("Type: ");
    localStringBuilder.append("connect");
    localStringBuilder.append("\r\n");
    V8DebugServer.access$1000(this.this$0, localStringBuilder.toString(), "");
    AppMethodBeat.o(74922);
  }

  public void run()
  {
    AppMethodBeat.i(74921);
    while (true)
    {
      try
      {
        localSocket1 = V8DebugServer.access$600(this.this$0).accept();
        localSocket1.setTcpNoDelay(true);
      }
      catch (Exception localException)
      {
        synchronized (V8DebugServer.access$700(this.this$0))
        {
          Socket localSocket1;
          V8DebugServer.access$802(this.this$0, localSocket1);
          V8DebugServer.access$902(this.this$0, false);
          V8DebugServer.access$700(this.this$0).notifyAll();
          startHandshake();
          processClientRequests();
          continue;
          localException = localException;
          synchronized (V8DebugServer.access$700(this.this$0))
          {
            Socket localSocket2 = V8DebugServer.access$800(this.this$0);
            if (localSocket2 == null);
          }
        }
      }
      try
      {
        V8DebugServer.access$800(this.this$0).close();
        label105: V8DebugServer.access$802(this.this$0, null);
        this.this$0.logError(localException);
        continue;
        localObject1 = finally;
        AppMethodBeat.o(74921);
        throw localObject1;
        localObject2 = finally;
        AppMethodBeat.o(74921);
        throw localObject2;
      }
      catch (IOException localIOException)
      {
        break label105;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.debug.V8DebugServer.ClientLoop
 * JD-Core Version:    0.6.2
 */