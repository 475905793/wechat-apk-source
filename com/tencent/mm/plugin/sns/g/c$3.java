package com.tencent.mm.plugin.sns.g;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.sdk.platformtools.ab;

final class c$3
  implements DialogInterface.OnClickListener
{
  c$3(c paramc, Context paramContext, cbf paramcbf, d.a parama, d.b paramb, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, d paramd)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(36778);
    ab.i("MicroMsg.SnSABTestMgr", "onClick alert1");
    c.a(this.qPD, this.val$context, this.qJF, this.qPE, this.qPA, this.qPB, this.qPC);
    AppMethodBeat.o(36778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.c.3
 * JD-Core Version:    0.6.2
 */