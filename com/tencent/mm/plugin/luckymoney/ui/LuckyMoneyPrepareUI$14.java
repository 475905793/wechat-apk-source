package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class LuckyMoneyPrepareUI$14
  implements View.OnClickListener
{
  LuckyMoneyPrepareUI$14(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI, EditText paramEditText1, EditText paramEditText2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42954);
    this.gnV.setOnClickListener(null);
    this.nTp.setOnClickListener(null);
    this.ohI.V(LuckyMoneyPrepareUI.c(this.ohI), 2);
    this.ohI.V(LuckyMoneyPrepareUI.b(this.ohI), 0);
    this.ohI.mKeyboard.setXMode(2);
    this.ohI.mKeyboard.setInputEditText(this.gnV);
    this.ohI.nTi.setVisibility(0);
    AppMethodBeat.o(42954);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.14
 * JD-Core Version:    0.6.2
 */