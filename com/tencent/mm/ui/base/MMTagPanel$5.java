package com.tencent.mm.ui.base;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMTagPanel$5
  implements TextView.OnEditorActionListener
{
  MMTagPanel$5(MMTagPanel paramMMTagPanel)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(106814);
    ab.d("MicroMsg.MMTagPanel", "on action %d, %s", new Object[] { Integer.valueOf(paramInt), paramKeyEvent });
    AppMethodBeat.o(106814);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanel.5
 * JD-Core Version:    0.6.2
 */