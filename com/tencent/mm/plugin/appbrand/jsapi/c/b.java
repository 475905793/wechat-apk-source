package com.tencent.mm.plugin.appbrand.jsapi.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 223;
  private static final String NAME = "getBeacons";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(94359);
    ab.d("MicroMsg.JsApiGetBeacons", "getBeacons!");
    paramJSONObject = new JSONArray();
    Object localObject = a.AZ(paramc.getAppId());
    if (localObject != null)
    {
      localObject = ((a.a)localObject).hJZ;
      if ((localObject != null) && (((Map)localObject).size() > 0))
      {
        localObject = ((Map)localObject).values().iterator();
        while (((Iterator)localObject).hasNext())
          paramJSONObject.put((JSONObject)((Iterator)localObject).next());
      }
    }
    else
    {
      ab.e("MicroMsg.JsApiGetBeacons", "not found device");
    }
    localObject = new HashMap();
    ((Map)localObject).put("beacons", paramJSONObject);
    paramc.M(paramInt, j("ok", (Map)localObject));
    AppMethodBeat.o(94359);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.c.b
 * JD-Core Version:    0.6.2
 */