package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.a.a;
import java.util.Locale;

public final class bb extends a
{
  bb(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    super(b(paramString1, paramString2, paramInt1, paramInt2), aq.xz(b(paramString1, paramString2, paramInt1, paramInt2)), paramString1, paramString2, paramInt1, paramInt2);
    AppMethodBeat.i(59547);
    AppMethodBeat.o(59547);
  }

  private static String b(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(59546);
    paramString1 = String.format(Locale.US, "WxaPage_%s_%d_%d_%d", new Object[] { paramString2, Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramString1.hashCode()) });
    AppMethodBeat.o(59546);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.bb
 * JD-Core Version:    0.6.2
 */