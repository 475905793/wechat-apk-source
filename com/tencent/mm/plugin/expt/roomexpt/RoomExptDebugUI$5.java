package com.tencent.mm.plugin.expt.roomexpt;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomExptDebugUI$5
  implements View.OnClickListener
{
  RoomExptDebugUI$5(RoomExptDebugUI paramRoomExptDebugUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(73595);
    a.brg().lOx = 3;
    Toast.makeText(this.lOM, "set show finish", 0).show();
    AppMethodBeat.o(73595);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.roomexpt.RoomExptDebugUI.5
 * JD-Core Version:    0.6.2
 */