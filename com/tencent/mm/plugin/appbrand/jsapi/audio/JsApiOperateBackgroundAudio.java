package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public class JsApiOperateBackgroundAudio<CONTEXT extends c> extends a<CONTEXT>
{
  public static final int CTRL_INDEX = 161;
  public static final String NAME = "operateBackgroundAudio";
  protected JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask hAp;

  protected JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask a(a parama, CONTEXT paramCONTEXT, int paramInt)
  {
    AppMethodBeat.i(137760);
    parama = new JsApiSetBackgroundAudioState.SetBackgroundAudioListenerTask(this, paramCONTEXT, paramInt);
    AppMethodBeat.o(137760);
    return parama;
  }

  public final void a(CONTEXT paramCONTEXT, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(137759);
    if (paramJSONObject == null)
    {
      paramCONTEXT.M(paramInt, j("fail:data is null", null));
      ab.e("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio data is null");
      AppMethodBeat.o(137759);
    }
    while (true)
    {
      return;
      String str = paramCONTEXT.getAppId();
      ab.i("MicroMsg.Music.JsApiOperateBackgroundAudio", "operateBackgroundAudio appId:%s", new Object[] { str });
      if (this.hAp == null)
        this.hAp = a(this, paramCONTEXT, paramInt);
      this.hAp.hwi = paramInt;
      this.hAp.appId = str;
      l(paramCONTEXT);
      paramCONTEXT = new JsApiOperateBackgroundAudio.OperateBackgroundAudioTask(this, paramCONTEXT, paramInt);
      paramCONTEXT.hwi = paramInt;
      paramCONTEXT.appId = str;
      paramCONTEXT.hAs = paramJSONObject.toString();
      AppBrandMainProcessService.a(paramCONTEXT);
      AppMethodBeat.o(137759);
    }
  }

  protected void l(CONTEXT paramCONTEXT)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio
 * JD-Core Version:    0.6.2
 */