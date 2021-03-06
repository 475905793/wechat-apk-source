package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;

public class WXEmojiPageSharedObject
  implements WXMediaMessage.IMediaObject
{
  private static final String TAG = "MicroMsg.SDK.WXEmojiSharedObject";
  public String desc;
  public String iconUrl;
  public int pageType;
  public String secondUrl;
  public int tid;
  public String title;
  public int type;
  public String url;

  public WXEmojiPageSharedObject()
  {
  }

  public WXEmojiPageSharedObject(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt3, String paramString5)
  {
    this.tid = paramInt2;
    this.title = paramString1;
    this.desc = paramString2;
    this.iconUrl = paramString3;
    this.secondUrl = paramString4;
    this.pageType = paramInt3;
    this.url = paramString5;
    this.type = paramInt1;
  }

  public boolean checkArgs()
  {
    AppMethodBeat.i(128285);
    boolean bool;
    if ((d.b(this.title)) || (d.b(this.iconUrl)))
    {
      Log.e("MicroMsg.SDK.WXEmojiSharedObject", "checkArgs fail, title or iconUrl is invalid");
      bool = false;
      AppMethodBeat.o(128285);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(128285);
    }
  }

  public void serialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128283);
    paramBundle.putInt("_wxemojisharedobject_tid", this.tid);
    paramBundle.putString("_wxemojisharedobject_title", this.title);
    paramBundle.putString("_wxemojisharedobject_desc", this.desc);
    paramBundle.putString("_wxemojisharedobject_iconurl", this.iconUrl);
    paramBundle.putString("_wxemojisharedobject_secondurl", this.secondUrl);
    paramBundle.putInt("_wxemojisharedobject_pagetype", this.pageType);
    paramBundle.putString("_wxwebpageobject_url", this.url);
    AppMethodBeat.o(128283);
  }

  public int type()
  {
    return this.type;
  }

  public void unserialize(Bundle paramBundle)
  {
    AppMethodBeat.i(128284);
    this.tid = paramBundle.getInt("_wxemojisharedobject_tid");
    this.title = paramBundle.getString("_wxemojisharedobject_title");
    this.desc = paramBundle.getString("_wxemojisharedobject_desc");
    this.iconUrl = paramBundle.getString("_wxemojisharedobject_iconurl");
    this.secondUrl = paramBundle.getString("_wxemojisharedobject_secondurl");
    this.pageType = paramBundle.getInt("_wxemojisharedobject_pagetype");
    this.url = paramBundle.getString("_wxwebpageobject_url");
    AppMethodBeat.o(128284);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.WXEmojiPageSharedObject
 * JD-Core Version:    0.6.2
 */