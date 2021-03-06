package com.tencent.mm.plugin.q;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.i.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.LinkedList;

public final class f
  implements a.a
{
  private static f oFG;
  public int cFu;
  private c oFH;
  long oFI;
  boolean oFJ = false;
  boolean oFK = false;

  static void RT(String paramString)
  {
    AppMethodBeat.i(22912);
    if (paramString.equals(b.oFb))
    {
      h.pYm.a(466L, 2L, 1L, false);
      AppMethodBeat.o(22912);
    }
    while (true)
    {
      return;
      if (paramString.equals(b.oFc))
      {
        h.pYm.a(466L, 17L, 1L, false);
        AppMethodBeat.o(22912);
      }
      else
      {
        if (paramString.equals(b.oFd))
          h.pYm.a(466L, 33L, 1L, false);
        AppMethodBeat.o(22912);
      }
    }
  }

  private void a(d paramd, int paramInt)
  {
    AppMethodBeat.i(22908);
    ab.i("MicroMsg.MsgSynchronizeServer", "startLoginSynchronize, loginDevice[%d]", new Object[] { Integer.valueOf(paramInt) });
    h.pYm.a(466L, 0L, 1L, false);
    com.tencent.mm.plugin.backup.h.d.aUr().aUu();
    this.oFH.oFp = this;
    LinkedList localLinkedList = this.oFH.bQW();
    ab.i("MicroMsg.MsgSynchronizeServer", "startLoginSynchronize calculateConversationList finish. conversationList size:%d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    if (localLinkedList.size() == 0)
    {
      ab.e("MicroMsg.MsgSynchronizeServer", "startLoginSynchronize, No conversation to synchronize");
      cancel();
      l = bo.gb(this.oFI);
      h.pYm.a(466L, 1L, 1L, false);
      h.pYm.a(466L, 5L, 0L, false);
      h.pYm.a(466L, 7L, l, false);
      h.pYm.a(466L, 11L, 0L, false);
      h.pYm.a(466L, 12L, 0L, false);
      b.l(l, paramInt, 1);
      AppMethodBeat.o(22908);
      return;
    }
    if (b.oFk < 0);
    for (long l = b.oFk; ; l = bo.gb(b.oFk * 24 * 60 * 60 * 1000))
    {
      this.oFH.a(paramd, localLinkedList, l, System.currentTimeMillis(), b.oFi);
      AppMethodBeat.o(22908);
      break;
    }
  }

  private void a(d paramd, long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(22909);
    ab.i("MicroMsg.MsgSynchronizeServer", "startAfterSleepSynchronize, loginDevice[%d]", new Object[] { Integer.valueOf(paramInt) });
    h.pYm.a(466L, 15L, 1L, false);
    com.tencent.mm.plugin.backup.h.d.aUr().aUu();
    this.oFH.oFp = this;
    LinkedList localLinkedList = this.oFH.bQW();
    ab.i("MicroMsg.MsgSynchronizeServer", "startAfterSleepSynchronize getConversationList finish. conversationList size:%d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    if (localLinkedList.size() == 0)
    {
      ab.e("MicroMsg.MsgSynchronizeServer", "startAfterSleepSynchronize, No conversation to synchronize");
      cancel();
      paramLong1 = bo.gb(this.oFI);
      h.pYm.a(466L, 16L, 1L, false);
      h.pYm.a(466L, 20L, 0L, false);
      h.pYm.a(466L, 22L, paramLong1, false);
      h.pYm.a(466L, 26L, 0L, false);
      h.pYm.a(466L, 27L, 0L, false);
      b.l(paramLong1, paramInt, 2);
      AppMethodBeat.o(22909);
      return;
    }
    long l;
    if (b.oFk < 0)
    {
      l = b.oFk;
      label207: if (paramLong1 >= l)
        break label329;
    }
    while (true)
    {
      if (paramLong2 == 0L);
      for (paramLong1 = System.currentTimeMillis(); ; paramLong1 = paramLong2)
      {
        if (l > paramLong1)
        {
          ab.e("MicroMsg.MsgSynchronizeServer", "startAfterSleepSynchronize no msg should be synchroinzed. startTime[%d], endTIme[%d]", new Object[] { Long.valueOf(l), Long.valueOf(paramLong1) });
          a(paramd, true);
          AppMethodBeat.o(22909);
          break;
          l = bo.gb(b.oFk * 24 * 60 * 60 * 1000);
          break label207;
        }
        this.oFH.a(paramd, localLinkedList, l, paramLong1, b.oFi);
        AppMethodBeat.o(22909);
        break;
      }
      label329: l = paramLong1;
    }
  }

  private void a(d paramd, String paramString, long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(22910);
    ab.i("MicroMsg.MsgSynchronizeServer", "startGetMoreSynchronize, loginDevice[%d]", new Object[] { Integer.valueOf(paramInt2) });
    h.pYm.a(466L, 31L, 1L, false);
    com.tencent.mm.plugin.backup.h.d.aUr().aUu();
    this.oFH.oFp = this;
    paramString = c.RR(paramString);
    ab.i("MicroMsg.MsgSynchronizeServer", "startGetMoreSynchronize addConversationList finish. conversationList size:%d", new Object[] { Integer.valueOf(paramString.size()) });
    if (paramString.size() == 0)
    {
      ab.e("MicroMsg.MsgSynchronizeServer", "startGetMoreSynchronize, No conversation to synchronize");
      cancel();
      paramLong1 = bo.gb(this.oFI);
      h.pYm.a(466L, 32L, 1L, false);
      h.pYm.a(466L, 36L, 0L, false);
      h.pYm.a(466L, 38L, paramLong1, false);
      h.pYm.a(466L, 42L, 0L, false);
      h.pYm.a(466L, 43L, 0L, false);
      b.l(paramLong1, paramInt2, 3);
      AppMethodBeat.o(22910);
    }
    while (true)
    {
      return;
      this.oFH.a(paramd, paramString, paramLong1, paramLong2, paramInt1);
      AppMethodBeat.o(22910);
    }
  }

  public static f jf(boolean paramBoolean)
  {
    AppMethodBeat.i(22906);
    if (oFG == null)
      oFG = new f();
    while (true)
    {
      f localf = oFG;
      AppMethodBeat.o(22906);
      return localf;
      if (paramBoolean)
      {
        oFG.cancel();
        oFG = new f();
      }
    }
  }

  public final void a(d paramd, String paramString, int paramInt)
  {
    AppMethodBeat.i(22911);
    ab.i("MicroMsg.MsgSynchronizeServer", "onMsgSynchronizePackFinish filePath:%s, conversationSize:%d, msgSyncSessionCount:%d, msgSyncMsgCount:%d, msgSyncMsgSize:%d", new Object[] { paramString, Integer.valueOf(paramInt), Long.valueOf(paramd.oFv), Long.valueOf(paramd.oFw), Long.valueOf(paramd.oFx) });
    if ((paramd.oFv <= 0L) && (paramd.oFw <= 0L) && (paramd.oFx <= 0L))
    {
      ab.i("MicroMsg.MsgSynchronizeServer", "no data should be synchronize");
      a(paramd, true);
      AppMethodBeat.o(22911);
    }
    while (true)
    {
      return;
      f.2 local2 = new f.2(this, paramd, new f.1(this, paramd));
      String str = "MSG_SYNCHRONIZE_" + paramInt + "_" + bo.anU();
      com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
      localg.egl = local2;
      localg.field_mediaId = str;
      localg.field_fullpath = paramString;
      localg.field_fileType = a.MediaType_FILE;
      localg.field_talker = ((String)com.tencent.mm.plugin.backup.h.d.aUr().aUs().Ry().get(2, null));
      localg.field_priority = a.efC;
      if (!com.tencent.mm.al.f.afx().e(localg))
      {
        ab.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize addSendTask failed. clientid:%s", new Object[] { str });
        RT(paramd.action);
        b.a(0L, 0L, 0L, 0L, 1, this.cFu, paramd.action);
      }
      AppMethodBeat.o(22911);
    }
  }

  final void a(d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(22913);
    ab.i("MicroMsg.MsgSynchronizeServer", "msgSynchronize start send AppMsg, isEmpty[%b].", new Object[] { Boolean.valueOf(paramBoolean) });
    Object localObject = new f.3(this, paramd);
    aw.Rg().a(222, (com.tencent.mm.ai.f)localObject);
    localObject = "";
    if (paramd.action.equals(b.oFd))
      localObject = paramd.oFy + "," + paramd.oFz;
    if (paramBoolean);
    for (paramd = new e("", "NULL", 0, paramd.ecX, paramd.action, (String)localObject); ; paramd = new e(paramd.oFA, paramd.oFB, paramd.oFC, paramd.ecX, paramd.action, (String)localObject))
    {
      aw.Rg().a(paramd, 0);
      AppMethodBeat.o(22913);
      return;
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(22914);
    ab.e("MicroMsg.MsgSynchronizeServer", "MsgSynchronizeServer cancel, Caller:%s", new Object[] { an.doQ() });
    this.oFH.oFo = true;
    this.oFK = false;
    AppMethodBeat.o(22914);
  }

  public final void e(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(22907);
    ab.i("MicroMsg.MsgSynchronizeServer", "start, action:%s, extInfo:%s, loginDevice[%d]", new Object[] { paramString1, paramString2, Integer.valueOf(this.cFu) });
    if (this.oFK)
    {
      ab.e("MicroMsg.MsgSynchronizeServer", "synchronize has Started!!!!! reject! action:%s", new Object[] { paramString1 });
      AppMethodBeat.o(22907);
    }
    while (true)
    {
      return;
      this.oFK = true;
      this.oFI = bo.anU();
      if (this.oFH != null)
        this.oFH.oFo = true;
      this.oFH = new c();
      d locald = new d(paramString1);
      locald.oFu = paramArrayOfByte;
      if (paramString1.equals(b.oFb))
      {
        a(locald, this.cFu);
        AppMethodBeat.o(22907);
      }
      else
      {
        aw.ZK();
        if (!((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xPz, Boolean.FALSE)).booleanValue())
        {
          ab.e("MicroMsg.MsgSynchronizeServer", "start reject!!!User did not approve synchroinze!!!!");
          cancel();
          AppMethodBeat.o(22907);
        }
        else
        {
          paramString2 = paramString2.split(",");
          if (paramString1.equals(b.oFc))
          {
            if (b.oFl <= 0)
            {
              ab.e("MicroMsg.MsgSynchronizeServer", "start reject!!!Abtest reject synchroinze after sleep.");
              cancel();
              AppMethodBeat.o(22907);
            }
            else if (paramString2.length < 2)
            {
              ab.e("MicroMsg.MsgSynchronizeServer", "start extinfo size wrong, action:%s, exinfo:%s", new Object[] { paramString1, paramString2 });
              cancel();
              AppMethodBeat.o(22907);
            }
            else
            {
              a(locald, com.tencent.mm.plugin.backup.b.g.Fe(paramString2[0]) * 1000L, com.tencent.mm.plugin.backup.b.g.Fe(paramString2[1]) * 1000L, this.cFu);
              AppMethodBeat.o(22907);
            }
          }
          else if (paramString1.equals(b.oFd))
          {
            if (b.oFm <= 0)
            {
              ab.e("MicroMsg.MsgSynchronizeServer", "start reject!!!Abtest reject synchroinze after sleep.");
              cancel();
              AppMethodBeat.o(22907);
            }
            else if (paramString2.length < 5)
            {
              ab.e("MicroMsg.MsgSynchronizeServer", "start extinfo size wrong, action:%s, exinfo:%s", new Object[] { paramString1, paramString2 });
              cancel();
              AppMethodBeat.o(22907);
            }
            else
            {
              paramString1 = paramString2[0];
              long l1 = com.tencent.mm.plugin.backup.b.g.Fe(paramString2[1]);
              long l2 = com.tencent.mm.plugin.backup.b.g.Fe(paramString2[2]);
              locald.RS(paramString2[3]);
              a(locald, paramString1, l1 * 1000L, l2 * 1000L, com.tencent.mm.plugin.backup.b.g.bC(paramString2[4], 0), this.cFu);
            }
          }
          else
            AppMethodBeat.o(22907);
        }
      }
    }
  }

  public final void onCancel()
  {
    AppMethodBeat.i(22915);
    cancel();
    AppMethodBeat.o(22915);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.q.f
 * JD-Core Version:    0.6.2
 */