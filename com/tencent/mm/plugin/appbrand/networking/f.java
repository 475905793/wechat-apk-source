package com.tencent.mm.plugin.appbrand.networking;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ci.g;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.vending.h.h;
import java.util.Map;

public final class f
  implements a
{
  protected static final boolean gNV;
  protected static final h ipK;
  protected static final Map<String, Integer> ipL;

  static
  {
    AppMethodBeat.i(132321);
    gNV = bp.dpL();
    ipK = new h(new al("MicroMsg.WxaCgiServiceWC").oAl.getLooper(), "MicroMsg.WxaCgiServiceWC");
    f.1 local1 = new f.1();
    ipL = local1;
    local1.put("/cgi-bin/mmbiz-bin/wxaapp/verifyplugin", Integer.valueOf(1714));
    ipL.put("/cgi-bin/mmbiz-bin/wxabusiness/reportwxaappexpose", Integer.valueOf(1345));
    ipL.put("/cgi-bin/mmbiz-bin/wxaapp_getauthinfo", Integer.valueOf(1115));
    ipL.put("/cgi-bin/mmbiz-bin/wxabusiness/getremotedebugticket", Integer.valueOf(1862));
    ipL.put("/cgi-bin/mmbiz-bin/wxaapp/autofill/deleteinfo", Integer.valueOf(1194));
    ipL.put("/cgi-bin/mmbiz-bin/wxaapp/autofill/getinfo", Integer.valueOf(1191));
    ipL.put("/cgi-bin/mmbiz-bin/wxaapp/autofill/saveinfo", Integer.valueOf(1180));
    ipL.put("/cgi-bin/mmbiz-bin/wxaapp/autofill/authinfo", Integer.valueOf(1183));
    ipL.put("/cgi-bin/mmbiz-bin/js-authorize", Integer.valueOf(1157));
    ipL.put("/cgi-bin/mmbiz-bin/js-authorize-confirm", Integer.valueOf(1158));
    AppMethodBeat.o(132321);
  }

  private <Resp extends btd> com.tencent.mm.ci.f<Resp> b(String paramString, com.tencent.mm.bt.a parama, Class<Resp> paramClass)
  {
    AppMethodBeat.i(132319);
    b.a locala = new b.a();
    locala.fsI = ((Integer)ipL.get(paramString)).intValue();
    locala.uri = paramString;
    locala.fsJ = parama;
    try
    {
      locala.fsK = ((com.tencent.mm.bt.a)paramClass.newInstance());
      paramString = g.dOW().d(ipK).g(new f.2(this, locala));
      AppMethodBeat.o(132319);
      return paramString;
    }
    catch (InstantiationException paramString)
    {
      do
        ab.e("MicroMsg.WxaCgiServiceWC", "new Response failed %s", new Object[] { paramClass.getName() });
      while (!gNV);
      paramString = new RuntimeException(paramString);
      AppMethodBeat.o(132319);
      throw paramString;
    }
    catch (IllegalAccessException paramString)
    {
      label89: break label89;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.networking.f
 * JD-Core Version:    0.6.2
 */