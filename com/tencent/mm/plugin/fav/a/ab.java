package com.tencent.mm.plugin.fav.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.af.j.b;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.ui.applet.q.a;

public abstract interface ab extends a
{
  public abstract int LU(String paramString);

  public abstract int a(j.b paramb, WXMediaMessage paramWXMediaMessage, String paramString);

  public abstract int a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3);

  public abstract void a(Activity paramActivity, String paramString1, String paramString2);

  public abstract void a(Context paramContext, String paramString, g paramg, boolean paramBoolean, q.a parama);

  public abstract void b(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.ab
 * JD-Core Version:    0.6.2
 */