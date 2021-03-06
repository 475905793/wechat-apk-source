package com.tencent.mm.plugin.music.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ag.b;
import com.tencent.mm.plugin.music.cache.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.qqmusic.mediaplayer.BaseMediaPlayer;
import com.tencent.qqmusic.mediaplayer.PlayerListenerCallback;

final class h$1
  implements PlayerListenerCallback
{
  b oKn = null;

  h$1(h paramh)
  {
  }

  public final void onBufferingUpdate(BaseMediaPlayer paramBaseMediaPlayer, int paramInt)
  {
  }

  public final void onCompletion(BaseMediaPlayer paramBaseMediaPlayer)
  {
    AppMethodBeat.i(137350);
    ab.i("MicroMsg.Audio.QQAudioPlayer", "onCompletion");
    AppMethodBeat.o(137350);
  }

  public final void onError(BaseMediaPlayer paramBaseMediaPlayer, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(137352);
    ab.e("MicroMsg.Audio.QQAudioPlayer", "onError what:%d, extra:%d, errCode:%d, audioId:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this.oKo.ckD });
    if (this.oKn == null)
    {
      ab.e("MicroMsg.Audio.QQAudioPlayer", "onError, currentParam is null");
      AppMethodBeat.o(137352);
    }
    while (true)
    {
      return;
      boolean bool = at.isNetworkConnected(ah.getContext());
      if ((paramInt2 == 80) && (bool))
        ab.e("MicroMsg.Audio.QQAudioPlayer", "connect success, but download is fail!");
      if (this.oKo.bqQ > 0)
      {
        ab.e("MicroMsg.Audio.QQAudioPlayer", "errorCount %d", new Object[] { Integer.valueOf(this.oKo.bqQ) });
        AppMethodBeat.o(137352);
      }
      else
      {
        this.oKo.oKe = false;
        paramBaseMediaPlayer = this.oKo;
        paramBaseMediaPlayer.bqQ += 1;
        this.oKo.lqz = paramInt2;
        this.oKo.eDL = System.currentTimeMillis();
        h.a(this.oKo, paramInt2);
        if (this.oKo.ckD.equalsIgnoreCase(this.oKn.ckD))
        {
          this.oKo.stopPlay();
          al.d(new h.1.2(this));
        }
        this.oKo.zl(paramInt2);
        if (this.oKo.oKg != null)
        {
          this.oKo.oKg.isStop = true;
          this.oKo.oKg = null;
        }
        if ((paramInt1 == 91) && (paramInt2 == 55))
        {
          ab.i("MicroMsg.Audio.QQAudioPlayer", "unknow format ,delete file");
          g.HS(this.oKo.cle);
        }
        AppMethodBeat.o(137352);
      }
    }
  }

  public final void onPrepared(BaseMediaPlayer paramBaseMediaPlayer)
  {
    AppMethodBeat.i(137353);
    ab.i("MicroMsg.Audio.QQAudioPlayer", "onPrepared");
    AppMethodBeat.o(137353);
  }

  public final void onSeekComplete(BaseMediaPlayer paramBaseMediaPlayer, int paramInt)
  {
    AppMethodBeat.i(137351);
    this.oKo.ilv.post(new h.1.1(this, paramInt));
    AppMethodBeat.o(137351);
  }

  public final void onStarted(BaseMediaPlayer paramBaseMediaPlayer)
  {
    AppMethodBeat.i(137355);
    ab.i("MicroMsg.Audio.QQAudioPlayer", "onStarted");
    AppMethodBeat.o(137355);
  }

  public final void onStateChanged(BaseMediaPlayer paramBaseMediaPlayer, int paramInt)
  {
    AppMethodBeat.i(137354);
    this.oKo.ilv.post(new h.1.3(this, paramInt));
    AppMethodBeat.o(137354);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.h.1
 * JD-Core Version:    0.6.2
 */