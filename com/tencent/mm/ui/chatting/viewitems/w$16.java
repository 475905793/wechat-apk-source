package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.chat.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import java.util.Map;

final class w$16
  implements View.OnClickListener
{
  w$16(w paramw)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33145);
    Object localObject1 = (ay)paramView.getTag();
    Object localObject2 = br.z(((c)localObject1).cKd.field_content, "msg");
    if (localObject2 == null)
    {
      ab.i("MicroMsg.ChattingItemDyeingTemplate", "values map is null.");
      AppMethodBeat.o(33145);
    }
    while (true)
    {
      return;
      int i = bo.getInt((String)((Map)localObject2).get(".msg.appmsg.mmreader.category.item.template_op_type"), -1);
      if (i == 1)
      {
        String str1 = (String)((Map)localObject2).get(".msg.appmsg.mmreader.category.item.weapp_username");
        String str2 = (String)((Map)localObject2).get(".msg.appmsg.mmreader.category.item.weapp_path");
        int j = bo.getInt((String)((Map)localObject2).get(".msg.appmsg.mmreader.category.item.weapp_version"), 0);
        i = bo.getInt((String)((Map)localObject2).get(".msg.appmsg.mmreader.category.item.weapp_state"), 0);
        paramView = bo.nullAsNil((String)((Map)localObject2).get(".msg.appmsg.template_id"));
        ab.i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) container click", new Object[] { str1 });
        localObject2 = new AppBrandStatObject();
        ((AppBrandStatObject)localObject2).cst = (((ay)localObject1).cKd.field_msgSvrId + ":" + ((ay)localObject1).userName + ":" + w.b(this.zeW).getTalkerUserName() + ":" + paramView);
        if (((com.tencent.mm.plugin.biz.a.a)g.K(com.tencent.mm.plugin.biz.a.a.class)).mg(((ay)localObject1).userName))
        {
          ((AppBrandStatObject)localObject2).scene = w.arF(paramView);
          ((e)g.K(e.class)).a(w.b(this.zeW).yTx.getContext(), str1, null, i, j, str2, (AppBrandStatObject)localObject2);
          w.M(9, w.c(this.zeW), w.d(this.zeW));
          h.pYm.e(11608, new Object[] { w.d(this.zeW), ((ay)localObject1).userName, Integer.valueOf(0) });
          AppMethodBeat.o(33145);
        }
        else
        {
          ((AppBrandStatObject)localObject2).scene = 1043;
          paramView = f.qX(((ay)localObject1).userName);
          e locale = (e)g.K(e.class);
          Activity localActivity = w.b(this.zeW).yTx.getContext();
          if (paramView == null);
          for (paramView = null; ; paramView = paramView.field_appId)
          {
            locale.a(localActivity, str1, null, i, j, str2, (AppBrandStatObject)localObject2, paramView);
            break;
          }
        }
      }
      else
      {
        if (i == 2)
        {
          localObject1 = (String)((Map)localObject2).get(".msg.appmsg.mmreader.category.item.schedule_username");
          long l = bo.getLong((String)((Map)localObject2).get(".msg.appmsg.mmreader.category.item.schedule_messvrid"), -1L);
          w.b(paramView.getContext(), (String)localObject1, l);
          ab.i("MicroMsg.ChattingItemDyeingTemplate", "[onClick] Remind! username:%s svrMsgId:%s", new Object[] { localObject1, Long.valueOf(l) });
        }
        AppMethodBeat.o(33145);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.16
 * JD-Core Version:    0.6.2
 */