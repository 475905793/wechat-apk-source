package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class CaptureEditorContainer$3
  implements View.OnClickListener
{
  CaptureEditorContainer$3(CaptureEditorContainer paramCaptureEditorContainer)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(3027);
    EmojiCaptureReporter.a(12, CaptureEditorContainer.c(this.lnr).ezZ, 0L, 0L, 0L, 0L, 0L, 0, 0, CaptureEditorContainer.c(this.lnr).scene);
    paramView = this.lnr;
    if (!this.lnr.bmC());
    for (boolean bool = true; ; bool = false)
    {
      paramView.gC(bool);
      AppMethodBeat.o(3027);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer.3
 * JD-Core Version:    0.6.2
 */