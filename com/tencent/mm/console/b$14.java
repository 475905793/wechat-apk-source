package com.tencent.mm.console;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.ClipboardManager;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$14
  implements DialogInterface.OnClickListener
{
  b$14(Context paramContext, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(16095);
    ((ClipboardManager)this.ewr.getSystemService("clipboard")).setText(this.val$key);
    Toast.makeText(this.ewr, 2131304422, 0).show();
    AppMethodBeat.o(16095);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.b.14
 * JD-Core Version:    0.6.2
 */