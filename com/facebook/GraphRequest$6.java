package com.facebook;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

class GraphRequest$6
  implements GraphRequest.KeyValueSerializer
{
  GraphRequest$6(GraphRequest paramGraphRequest, ArrayList paramArrayList)
  {
  }

  public void writeString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(71645);
    this.val$keysAndValues.add(String.format(Locale.US, "%s=%s", new Object[] { paramString1, URLEncoder.encode(paramString2, "UTF-8") }));
    AppMethodBeat.o(71645);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.GraphRequest.6
 * JD-Core Version:    0.6.2
 */