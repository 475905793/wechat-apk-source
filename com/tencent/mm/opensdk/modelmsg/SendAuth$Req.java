package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.Log;

public class SendAuth$Req extends BaseReq
{
  private static final int LENGTH_LIMIT = 1024;
  private static final String TAG = "MicroMsg.SDK.SendAuth.Req";
  public String scope;
  public String state;

  public SendAuth$Req()
  {
  }

  public SendAuth$Req(Bundle paramBundle)
  {
    AppMethodBeat.i(128249);
    fromBundle(paramBundle);
    AppMethodBeat.o(128249);
  }

  public boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(128252);
    if ((this.scope == null) || (this.scope.length() == 0) || (this.scope.length() > 1024))
    {
      Log.e("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, scope is invalid");
      AppMethodBeat.o(128252);
    }
    while (true)
    {
      return bool;
      if ((this.state != null) && (this.state.length() > 1024))
      {
        Log.e("MicroMsg.SDK.SendAuth.Req", "checkArgs fail, state is invalid");
        AppMethodBeat.o(128252);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(128252);
      }
    }
  }

  public void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128250);
    super.fromBundle(paramBundle);
    this.scope = paramBundle.getString("_wxapi_sendauth_req_scope");
    this.state = paramBundle.getString("_wxapi_sendauth_req_state");
    AppMethodBeat.o(128250);
  }

  public int getType()
  {
    return 1;
  }

  public void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128251);
    super.toBundle(paramBundle);
    paramBundle.putString("_wxapi_sendauth_req_scope", this.scope);
    paramBundle.putString("_wxapi_sendauth_req_state", this.state);
    AppMethodBeat.o(128251);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.SendAuth.Req
 * JD-Core Version:    0.6.2
 */