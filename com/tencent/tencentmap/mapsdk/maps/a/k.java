package com.tencent.tencentmap.mapsdk.maps.a;

import TT;;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class k
{
  protected String a;
  private ByteBuffer b;

  public k()
  {
    this.a = "GBK";
  }

  public k(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(100157);
    this.a = "GBK";
    this.b = ByteBuffer.wrap(paramArrayOfByte);
    AppMethodBeat.o(100157);
  }

  public k(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(100158);
    this.a = "GBK";
    this.b = ByteBuffer.wrap(paramArrayOfByte);
    this.b.position(paramInt);
    AppMethodBeat.o(100158);
  }

  public static int a(k.a parama, ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(100160);
    int i = paramByteBuffer.get();
    parama.a = ((byte)(byte)(i & 0xF));
    parama.b = ((i & 0xF0) >> 4);
    if (parama.b == 15)
    {
      parama.b = (paramByteBuffer.get() & 0xFF);
      i = 2;
      AppMethodBeat.o(100160);
    }
    while (true)
    {
      return i;
      i = 1;
      AppMethodBeat.o(100160);
    }
  }

  private <K, V> Map<K, V> a(Map<K, V> paramMap1, Map<K, V> paramMap2, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100177);
    if ((paramMap2 == null) || (paramMap2.isEmpty()))
    {
      paramMap1 = new HashMap();
      AppMethodBeat.o(100177);
    }
    while (true)
    {
      return paramMap1;
      Object localObject = (Map.Entry)paramMap2.entrySet().iterator().next();
      paramMap2 = ((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      if (a(paramInt))
      {
        k.a locala = new k.a();
        a(locala);
        switch (locala.a)
        {
        default:
          paramMap1 = new h("type mismatch.");
          AppMethodBeat.o(100177);
          throw paramMap1;
        case 8:
        }
        int i = a(0, 0, true);
        if (i < 0)
        {
          paramMap1 = new h("size invalid: ".concat(String.valueOf(i)));
          AppMethodBeat.o(100177);
          throw paramMap1;
        }
        for (paramInt = 0; paramInt < i; paramInt++)
          paramMap1.put(a(paramMap2, 0, true), a(localObject, 1, true));
      }
      if (paramBoolean)
      {
        paramMap1 = new h("require field not exist.");
        AppMethodBeat.o(100177);
        throw paramMap1;
      }
      AppMethodBeat.o(100177);
    }
  }

  private void a(byte paramByte)
  {
    byte b1 = 0;
    byte b2 = 0;
    AppMethodBeat.i(100167);
    Object localObject;
    switch (paramByte)
    {
    default:
      localObject = new h("invalid type.");
      AppMethodBeat.o(100167);
      throw ((Throwable)localObject);
    case 0:
      b(1);
      AppMethodBeat.o(100167);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 13:
    case 10:
    case 11:
    case 12:
    }
    while (true)
    {
      return;
      b(2);
      AppMethodBeat.o(100167);
      continue;
      b(4);
      AppMethodBeat.o(100167);
      continue;
      b(8);
      AppMethodBeat.o(100167);
      continue;
      b(4);
      AppMethodBeat.o(100167);
      continue;
      b(8);
      AppMethodBeat.o(100167);
      continue;
      b2 = this.b.get();
      paramByte = b2;
      if (b2 < 0)
        paramByte = b2 + 256;
      b(paramByte);
      AppMethodBeat.o(100167);
      continue;
      b(this.b.getInt());
      AppMethodBeat.o(100167);
      continue;
      b1 = a(0, 0, true);
      for (paramByte = b2; paramByte < b1 * 2; paramByte++)
        b();
      AppMethodBeat.o(100167);
      continue;
      b2 = a(0, 0, true);
      for (paramByte = b1; paramByte < b2; paramByte++)
        b();
      AppMethodBeat.o(100167);
      continue;
      localObject = new k.a();
      a((k.a)localObject);
      if (((k.a)localObject).a != 0)
      {
        localObject = new h("skipField with invalid type, type value: " + paramByte + ", " + ((k.a)localObject).a);
        AppMethodBeat.o(100167);
        throw ((Throwable)localObject);
      }
      b(a(0, 0, true));
      AppMethodBeat.o(100167);
      continue;
      a();
      AppMethodBeat.o(100167);
      continue;
      AppMethodBeat.o(100167);
    }
  }

  private int b(k.a parama)
  {
    AppMethodBeat.i(100162);
    int i = a(parama, this.b.duplicate());
    AppMethodBeat.o(100162);
    return i;
  }

  private void b()
  {
    AppMethodBeat.i(100166);
    k.a locala = new k.a();
    a(locala);
    a(locala.a);
    AppMethodBeat.o(100166);
  }

  private void b(int paramInt)
  {
    AppMethodBeat.i(100163);
    this.b.position(this.b.position() + paramInt);
    AppMethodBeat.o(100163);
  }

  private <T> T[] b(T paramT, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100187);
    if (a(paramInt))
    {
      Object localObject = new k.a();
      a((k.a)localObject);
      switch (((k.a)localObject).a)
      {
      default:
        paramT = new h("type mismatch.");
        AppMethodBeat.o(100187);
        throw paramT;
      case 9:
      }
      int i = a(0, 0, true);
      if (i < 0)
      {
        paramT = new h("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(100187);
        throw paramT;
      }
      localObject = (Object[])Array.newInstance(paramT.getClass(), i);
      for (paramInt = 0; paramInt < i; paramInt++)
        localObject[paramInt] = a(paramT, 0, true);
      AppMethodBeat.o(100187);
      paramT = (TT)localObject;
    }
    while (true)
    {
      return paramT;
      if (paramBoolean)
      {
        paramT = new h("require field not exist.");
        AppMethodBeat.o(100187);
        throw paramT;
      }
      paramT = null;
      AppMethodBeat.o(100187);
    }
  }

  public final byte a(byte paramByte, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100169);
    byte b1;
    if (a(paramInt))
    {
      localObject = new k.a();
      a((k.a)localObject);
      switch (((k.a)localObject).a)
      {
      default:
        localObject = new h("type mismatch.");
        AppMethodBeat.o(100169);
        throw ((Throwable)localObject);
      case 12:
        paramByte = 0;
        b1 = paramByte;
      case 0:
      }
    }
    do
    {
      while (true)
      {
        AppMethodBeat.o(100169);
        return b1;
        paramByte = this.b.get();
        b1 = paramByte;
      }
      b1 = paramByte;
    }
    while (!paramBoolean);
    Object localObject = new h("require field not exist.");
    AppMethodBeat.o(100169);
    throw ((Throwable)localObject);
  }

  public final double a(double paramDouble, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100174);
    if (a(paramInt))
    {
      localObject = new k.a();
      a((k.a)localObject);
      switch (((k.a)localObject).a)
      {
      default:
        localObject = new h("type mismatch.");
        AppMethodBeat.o(100174);
        throw ((Throwable)localObject);
      case 12:
        paramDouble = 0.0D;
      case 4:
      case 5:
      }
    }
    while (!paramBoolean)
      while (true)
      {
        AppMethodBeat.o(100174);
        return paramDouble;
        paramDouble = this.b.getFloat();
        continue;
        paramDouble = this.b.getDouble();
      }
    Object localObject = new h("require field not exist.");
    AppMethodBeat.o(100174);
    throw ((Throwable)localObject);
  }

  public final float a(float paramFloat, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100173);
    if (a(paramInt))
    {
      localObject = new k.a();
      a((k.a)localObject);
      switch (((k.a)localObject).a)
      {
      default:
        localObject = new h("type mismatch.");
        AppMethodBeat.o(100173);
        throw ((Throwable)localObject);
      case 12:
        paramFloat = 0.0F;
      case 4:
      }
    }
    while (!paramBoolean)
      while (true)
      {
        AppMethodBeat.o(100173);
        return paramFloat;
        paramFloat = this.b.getFloat();
      }
    Object localObject = new h("require field not exist.");
    AppMethodBeat.o(100173);
    throw ((Throwable)localObject);
  }

  public final int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(100171);
    if (a(paramInt2))
    {
      localObject = new k.a();
      a((k.a)localObject);
      switch (((k.a)localObject).a)
      {
      default:
        localObject = new h("type mismatch.");
        AppMethodBeat.o(100171);
        throw ((Throwable)localObject);
      case 12:
        paramInt1 = 0;
      case 0:
      case 1:
      case 2:
      }
    }
    while (!paramBoolean)
      while (true)
      {
        AppMethodBeat.o(100171);
        return paramInt1;
        paramInt1 = this.b.get();
        continue;
        paramInt1 = this.b.getShort();
        continue;
        paramInt1 = this.b.getInt();
      }
    Object localObject = new h("require field not exist.");
    AppMethodBeat.o(100171);
    throw ((Throwable)localObject);
  }

  public final int a(String paramString)
  {
    this.a = paramString;
    return 0;
  }

  public final long a(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100172);
    if (a(paramInt))
    {
      localObject = new k.a();
      a((k.a)localObject);
      switch (((k.a)localObject).a)
      {
      default:
        localObject = new h("type mismatch.");
        AppMethodBeat.o(100172);
        throw ((Throwable)localObject);
      case 12:
        paramLong = 0L;
      case 0:
      case 1:
      case 2:
      case 3:
      }
    }
    while (!paramBoolean)
      while (true)
      {
        AppMethodBeat.o(100172);
        return paramLong;
        paramLong = this.b.get();
        continue;
        paramLong = this.b.getShort();
        continue;
        paramLong = this.b.getInt();
        continue;
        paramLong = this.b.getLong();
      }
    Object localObject = new h("require field not exist.");
    AppMethodBeat.o(100172);
    throw ((Throwable)localObject);
  }

  public final m a(m paramm, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100188);
    k.a locala = null;
    if (a(paramInt))
    {
      try
      {
        paramm = (m)paramm.getClass().newInstance();
        locala = new k.a();
        a(locala);
        if (locala.a != 10)
        {
          paramm = new h("type mismatch.");
          AppMethodBeat.o(100188);
          throw paramm;
        }
      }
      catch (Exception paramm)
      {
        paramm = new h(paramm.getMessage());
        AppMethodBeat.o(100188);
        throw paramm;
      }
      paramm.readFrom(this);
      a();
    }
    do
    {
      AppMethodBeat.o(100188);
      return paramm;
      paramm = locala;
    }
    while (!paramBoolean);
    paramm = new h("require field not exist.");
    AppMethodBeat.o(100188);
    throw paramm;
  }

  public final <T> Object a(T paramT, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100189);
    if ((paramT instanceof Byte))
    {
      paramT = Byte.valueOf(a((byte)0, paramInt, paramBoolean));
      AppMethodBeat.o(100189);
    }
    while (true)
    {
      return paramT;
      if ((paramT instanceof Boolean))
      {
        paramT = Boolean.valueOf(a(false, paramInt, paramBoolean));
        AppMethodBeat.o(100189);
      }
      else if ((paramT instanceof Short))
      {
        paramT = Short.valueOf(a((short)0, paramInt, paramBoolean));
        AppMethodBeat.o(100189);
      }
      else if ((paramT instanceof Integer))
      {
        paramT = Integer.valueOf(a(0, paramInt, paramBoolean));
        AppMethodBeat.o(100189);
      }
      else if ((paramT instanceof Long))
      {
        paramT = Long.valueOf(a(0L, paramInt, paramBoolean));
        AppMethodBeat.o(100189);
      }
      else if ((paramT instanceof Float))
      {
        paramT = Float.valueOf(a(0.0F, paramInt, paramBoolean));
        AppMethodBeat.o(100189);
      }
      else if ((paramT instanceof Double))
      {
        paramT = Double.valueOf(a(0.0D, paramInt, paramBoolean));
        AppMethodBeat.o(100189);
      }
      else if ((paramT instanceof String))
      {
        paramT = a(paramInt, paramBoolean);
        AppMethodBeat.o(100189);
      }
      else if ((paramT instanceof Map))
      {
        paramT = a((Map)paramT, paramInt, paramBoolean);
        AppMethodBeat.o(100189);
      }
      else if ((paramT instanceof List))
      {
        paramT = a((List)paramT, paramInt, paramBoolean);
        AppMethodBeat.o(100189);
      }
      else if ((paramT instanceof m))
      {
        paramT = a((m)paramT, paramInt, paramBoolean);
        AppMethodBeat.o(100189);
      }
      else
      {
        if (!paramT.getClass().isArray())
          break;
        if (((paramT instanceof byte[])) || ((paramT instanceof Byte[])))
        {
          paramT = a(null, paramInt, paramBoolean);
          AppMethodBeat.o(100189);
        }
        else if ((paramT instanceof boolean[]))
        {
          paramT = a(null, paramInt, paramBoolean);
          AppMethodBeat.o(100189);
        }
        else if ((paramT instanceof short[]))
        {
          paramT = a(null, paramInt, paramBoolean);
          AppMethodBeat.o(100189);
        }
        else if ((paramT instanceof int[]))
        {
          paramT = a(null, paramInt, paramBoolean);
          AppMethodBeat.o(100189);
        }
        else if ((paramT instanceof long[]))
        {
          paramT = a(null, paramInt, paramBoolean);
          AppMethodBeat.o(100189);
        }
        else if ((paramT instanceof float[]))
        {
          paramT = a(null, paramInt, paramBoolean);
          AppMethodBeat.o(100189);
        }
        else if ((paramT instanceof double[]))
        {
          paramT = a(null, paramInt, paramBoolean);
          AppMethodBeat.o(100189);
        }
        else
        {
          paramT = a((Object[])paramT, paramInt, paramBoolean);
          AppMethodBeat.o(100189);
        }
      }
    }
    paramT = new h("read object error: unsupport type.");
    AppMethodBeat.o(100189);
    throw paramT;
  }

  public final String a(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100175);
    Object localObject1 = null;
    if (a(paramInt))
    {
      localObject1 = new k.a();
      a((k.a)localObject1);
      switch (((k.a)localObject1).a)
      {
      default:
        localObject1 = new h("type mismatch.");
        AppMethodBeat.o(100175);
        throw ((Throwable)localObject1);
      case 6:
        i = this.b.get();
        paramInt = i;
        if (i < 0)
          paramInt = i + 256;
        arrayOfByte = new byte[paramInt];
        this.b.get(arrayOfByte);
      case 7:
      }
    }
    while (!paramBoolean)
      while (true)
      {
        Object localObject2;
        try
        {
          int i;
          localObject1 = new java/lang/String;
          ((String)localObject1).<init>(arrayOfByte, this.a);
          AppMethodBeat.o(100175);
          return localObject1;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException1)
        {
          localObject2 = new String(arrayOfByte);
          continue;
        }
        paramInt = this.b.getInt();
        if ((paramInt > 104857600) || (paramInt < 0) || (paramInt > this.b.capacity()))
        {
          localObject2 = new h("String too long: ".concat(String.valueOf(paramInt)));
          AppMethodBeat.o(100175);
          throw ((Throwable)localObject2);
        }
        byte[] arrayOfByte = new byte[paramInt];
        this.b.get(arrayOfByte);
        try
        {
          localObject2 = new java/lang/String;
          ((String)localObject2).<init>(arrayOfByte, this.a);
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          localObject3 = new String(arrayOfByte);
        }
      }
    Object localObject3 = new h("require field not exist.");
    AppMethodBeat.o(100175);
    throw ((Throwable)localObject3);
  }

  public final <K, V> HashMap<K, V> a(Map<K, V> paramMap, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100176);
    paramMap = (HashMap)a(new HashMap(), paramMap, paramInt, paramBoolean);
    AppMethodBeat.o(100176);
    return paramMap;
  }

  public final <T> List<T> a(List<T> paramList, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(100186);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      paramList = new ArrayList();
      AppMethodBeat.o(100186);
    }
    while (true)
    {
      return paramList;
      Object[] arrayOfObject = b(paramList.get(0), paramInt, paramBoolean);
      if (arrayOfObject == null)
      {
        paramList = null;
        AppMethodBeat.o(100186);
      }
      else
      {
        paramList = new ArrayList();
        for (paramInt = i; paramInt < arrayOfObject.length; paramInt++)
          paramList.add(arrayOfObject[paramInt]);
        AppMethodBeat.o(100186);
      }
    }
  }

  public final short a(short paramShort, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100170);
    short s;
    if (a(paramInt))
    {
      localObject = new k.a();
      a((k.a)localObject);
      switch (((k.a)localObject).a)
      {
      default:
        localObject = new h("type mismatch.");
        AppMethodBeat.o(100170);
        throw ((Throwable)localObject);
      case 12:
        paramShort = 0;
        s = paramShort;
      case 0:
      case 1:
      }
    }
    do
    {
      while (true)
      {
        AppMethodBeat.o(100170);
        return s;
        paramShort = (short)this.b.get();
        s = paramShort;
        continue;
        paramShort = this.b.getShort();
        s = paramShort;
      }
      s = paramShort;
    }
    while (!paramBoolean);
    Object localObject = new h("require field not exist.");
    AppMethodBeat.o(100170);
    throw ((Throwable)localObject);
  }

  public final void a()
  {
    AppMethodBeat.i(100165);
    k.a locala = new k.a();
    do
    {
      a(locala);
      a(locala.a);
    }
    while (locala.a != 11);
    AppMethodBeat.o(100165);
  }

  public final void a(k.a parama)
  {
    AppMethodBeat.i(100161);
    a(parama, this.b);
    AppMethodBeat.o(100161);
  }

  public final void a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(100159);
    this.b = ByteBuffer.wrap(paramArrayOfByte);
    AppMethodBeat.o(100159);
  }

  public final boolean a(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(100164);
    try
    {
      k.a locala = new com/tencent/tencentmap/mapsdk/maps/a/k$a;
      locala.<init>();
      while (true)
      {
        int i = b(locala);
        if ((paramInt <= locala.b) || (locala.a == 11))
        {
          if (locala.a == 11)
            AppMethodBeat.o(100164);
          while (true)
          {
            return bool;
            if (paramInt == locala.b)
            {
              AppMethodBeat.o(100164);
              bool = true;
            }
            else
            {
              AppMethodBeat.o(100164);
            }
          }
        }
        b(i);
        a(locala.a);
      }
    }
    catch (h localh)
    {
      while (true)
        AppMethodBeat.o(100164);
    }
    catch (BufferUnderflowException localBufferUnderflowException)
    {
      label103: break label103;
    }
  }

  public final boolean a(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    paramBoolean1 = false;
    AppMethodBeat.i(100168);
    if (a((byte)0, paramInt, paramBoolean2) != 0)
    {
      paramBoolean1 = true;
      AppMethodBeat.o(100168);
    }
    while (true)
    {
      return paramBoolean1;
      AppMethodBeat.o(100168);
    }
  }

  public final byte[] a(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100179);
    paramArrayOfByte = null;
    if (a(paramInt))
    {
      paramArrayOfByte = new k.a();
      a(paramArrayOfByte);
      switch (paramArrayOfByte.a)
      {
      default:
        paramArrayOfByte = new h("type mismatch.");
        AppMethodBeat.o(100179);
        throw paramArrayOfByte;
      case 13:
        localObject = new k.a();
        a((k.a)localObject);
        if (((k.a)localObject).a != 0)
        {
          paramArrayOfByte = new h("type mismatch, tag: " + paramInt + ", type: " + paramArrayOfByte.a + ", " + ((k.a)localObject).a);
          AppMethodBeat.o(100179);
          throw paramArrayOfByte;
        }
        i = a(0, 0, true);
        if ((i < 0) || (i > this.b.capacity()))
        {
          paramArrayOfByte = new h("invalid size, tag: " + paramInt + ", type: " + paramArrayOfByte.a + ", " + ((k.a)localObject).a + ", size: " + i);
          AppMethodBeat.o(100179);
          throw paramArrayOfByte;
        }
        paramArrayOfByte = new byte[i];
        this.b.get(paramArrayOfByte);
      case 9:
      }
    }
    while (!paramBoolean)
    {
      AppMethodBeat.o(100179);
      return paramArrayOfByte;
      int i = a(0, 0, true);
      if ((i < 0) || (i > this.b.capacity()))
      {
        paramArrayOfByte = new h("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(100179);
        throw paramArrayOfByte;
      }
      Object localObject = new byte[i];
      for (paramInt = 0; ; paramInt++)
      {
        paramArrayOfByte = (byte[])localObject;
        if (paramInt >= i)
          break;
        localObject[paramInt] = a(localObject[0], 0, true);
      }
    }
    paramArrayOfByte = new h("require field not exist.");
    AppMethodBeat.o(100179);
    throw paramArrayOfByte;
  }

  public final double[] a(double[] paramArrayOfDouble, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100184);
    paramArrayOfDouble = null;
    if (a(paramInt))
    {
      paramArrayOfDouble = new k.a();
      a(paramArrayOfDouble);
      switch (paramArrayOfDouble.a)
      {
      default:
        paramArrayOfDouble = new h("type mismatch.");
        AppMethodBeat.o(100184);
        throw paramArrayOfDouble;
      case 9:
      }
      int i = a(0, 0, true);
      if (i < 0)
      {
        paramArrayOfDouble = new h("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(100184);
        throw paramArrayOfDouble;
      }
      double[] arrayOfDouble = new double[i];
      for (paramInt = 0; ; paramInt++)
      {
        paramArrayOfDouble = arrayOfDouble;
        if (paramInt >= i)
          break;
        arrayOfDouble[paramInt] = a(arrayOfDouble[0], 0, true);
      }
    }
    if (paramBoolean)
    {
      paramArrayOfDouble = new h("require field not exist.");
      AppMethodBeat.o(100184);
      throw paramArrayOfDouble;
    }
    AppMethodBeat.o(100184);
    return paramArrayOfDouble;
  }

  public final float[] a(float[] paramArrayOfFloat, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100183);
    paramArrayOfFloat = null;
    if (a(paramInt))
    {
      paramArrayOfFloat = new k.a();
      a(paramArrayOfFloat);
      switch (paramArrayOfFloat.a)
      {
      default:
        paramArrayOfFloat = new h("type mismatch.");
        AppMethodBeat.o(100183);
        throw paramArrayOfFloat;
      case 9:
      }
      int i = a(0, 0, true);
      if (i < 0)
      {
        paramArrayOfFloat = new h("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(100183);
        throw paramArrayOfFloat;
      }
      float[] arrayOfFloat = new float[i];
      for (paramInt = 0; ; paramInt++)
      {
        paramArrayOfFloat = arrayOfFloat;
        if (paramInt >= i)
          break;
        arrayOfFloat[paramInt] = a(arrayOfFloat[0], 0, true);
      }
    }
    if (paramBoolean)
    {
      paramArrayOfFloat = new h("require field not exist.");
      AppMethodBeat.o(100183);
      throw paramArrayOfFloat;
    }
    AppMethodBeat.o(100183);
    return paramArrayOfFloat;
  }

  public final int[] a(int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100181);
    paramArrayOfInt = null;
    if (a(paramInt))
    {
      paramArrayOfInt = new k.a();
      a(paramArrayOfInt);
      switch (paramArrayOfInt.a)
      {
      default:
        paramArrayOfInt = new h("type mismatch.");
        AppMethodBeat.o(100181);
        throw paramArrayOfInt;
      case 9:
      }
      int i = a(0, 0, true);
      if (i < 0)
      {
        paramArrayOfInt = new h("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(100181);
        throw paramArrayOfInt;
      }
      int[] arrayOfInt = new int[i];
      for (paramInt = 0; ; paramInt++)
      {
        paramArrayOfInt = arrayOfInt;
        if (paramInt >= i)
          break;
        arrayOfInt[paramInt] = a(arrayOfInt[0], 0, true);
      }
    }
    if (paramBoolean)
    {
      paramArrayOfInt = new h("require field not exist.");
      AppMethodBeat.o(100181);
      throw paramArrayOfInt;
    }
    AppMethodBeat.o(100181);
    return paramArrayOfInt;
  }

  public final long[] a(long[] paramArrayOfLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100182);
    paramArrayOfLong = null;
    if (a(paramInt))
    {
      paramArrayOfLong = new k.a();
      a(paramArrayOfLong);
      switch (paramArrayOfLong.a)
      {
      default:
        paramArrayOfLong = new h("type mismatch.");
        AppMethodBeat.o(100182);
        throw paramArrayOfLong;
      case 9:
      }
      int i = a(0, 0, true);
      if (i < 0)
      {
        paramArrayOfLong = new h("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(100182);
        throw paramArrayOfLong;
      }
      long[] arrayOfLong = new long[i];
      for (paramInt = 0; ; paramInt++)
      {
        paramArrayOfLong = arrayOfLong;
        if (paramInt >= i)
          break;
        arrayOfLong[paramInt] = a(arrayOfLong[0], 0, true);
      }
    }
    if (paramBoolean)
    {
      paramArrayOfLong = new h("require field not exist.");
      AppMethodBeat.o(100182);
      throw paramArrayOfLong;
    }
    AppMethodBeat.o(100182);
    return paramArrayOfLong;
  }

  public final <T> T[] a(T[] paramArrayOfT, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100185);
    if ((paramArrayOfT == null) || (paramArrayOfT.length == 0))
    {
      paramArrayOfT = new h("unable to get type of key and value.");
      AppMethodBeat.o(100185);
      throw paramArrayOfT;
    }
    paramArrayOfT = b(paramArrayOfT[0], paramInt, paramBoolean);
    AppMethodBeat.o(100185);
    return paramArrayOfT;
  }

  public final short[] a(short[] paramArrayOfShort, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100180);
    paramArrayOfShort = null;
    if (a(paramInt))
    {
      paramArrayOfShort = new k.a();
      a(paramArrayOfShort);
      switch (paramArrayOfShort.a)
      {
      default:
        paramArrayOfShort = new h("type mismatch.");
        AppMethodBeat.o(100180);
        throw paramArrayOfShort;
      case 9:
      }
      int i = a(0, 0, true);
      if (i < 0)
      {
        paramArrayOfShort = new h("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(100180);
        throw paramArrayOfShort;
      }
      short[] arrayOfShort = new short[i];
      for (paramInt = 0; ; paramInt++)
      {
        paramArrayOfShort = arrayOfShort;
        if (paramInt >= i)
          break;
        arrayOfShort[paramInt] = a(arrayOfShort[0], 0, true);
      }
    }
    if (paramBoolean)
    {
      paramArrayOfShort = new h("require field not exist.");
      AppMethodBeat.o(100180);
      throw paramArrayOfShort;
    }
    AppMethodBeat.o(100180);
    return paramArrayOfShort;
  }

  public final boolean[] a(boolean[] paramArrayOfBoolean, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(100178);
    paramArrayOfBoolean = null;
    if (a(paramInt))
    {
      paramArrayOfBoolean = new k.a();
      a(paramArrayOfBoolean);
      switch (paramArrayOfBoolean.a)
      {
      default:
        paramArrayOfBoolean = new h("type mismatch.");
        AppMethodBeat.o(100178);
        throw paramArrayOfBoolean;
      case 9:
      }
      int i = a(0, 0, true);
      if (i < 0)
      {
        paramArrayOfBoolean = new h("size invalid: ".concat(String.valueOf(i)));
        AppMethodBeat.o(100178);
        throw paramArrayOfBoolean;
      }
      boolean[] arrayOfBoolean = new boolean[i];
      for (paramInt = 0; ; paramInt++)
      {
        paramArrayOfBoolean = arrayOfBoolean;
        if (paramInt >= i)
          break;
        arrayOfBoolean[paramInt] = a(arrayOfBoolean[0], 0, true);
      }
    }
    if (paramBoolean)
    {
      paramArrayOfBoolean = new h("require field not exist.");
      AppMethodBeat.o(100178);
      throw paramArrayOfBoolean;
    }
    AppMethodBeat.o(100178);
    return paramArrayOfBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.k
 * JD-Core Version:    0.6.2
 */