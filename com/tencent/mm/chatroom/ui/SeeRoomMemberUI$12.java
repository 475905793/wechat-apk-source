package com.tencent.mm.chatroom.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SeeRoomMemberUI$12
  implements TextWatcher
{
  SeeRoomMemberUI$12(SeeRoomMemberUI paramSeeRoomMemberUI)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(104318);
    SeeRoomMemberUI.c(this.elX).ko(paramCharSequence.toString());
    AppMethodBeat.o(104318);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeRoomMemberUI.12
 * JD-Core Version:    0.6.2
 */