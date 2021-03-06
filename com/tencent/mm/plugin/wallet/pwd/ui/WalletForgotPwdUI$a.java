package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.ArrayList;
import java.util.List;

public final class WalletForgotPwdUI$a extends BaseAdapter
{
  private Context context;
  List<Bankcard> items;

  public WalletForgotPwdUI$a(WalletForgotPwdUI paramWalletForgotPwdUI, Context paramContext)
  {
    AppMethodBeat.i(46284);
    this.items = new ArrayList();
    this.context = paramContext;
    AppMethodBeat.o(46284);
  }

  private Bankcard Hd(int paramInt)
  {
    AppMethodBeat.i(46287);
    Bankcard localBankcard;
    if ((paramInt >= 0) && (paramInt <= this.items.size() - 1))
    {
      localBankcard = (Bankcard)this.items.get(paramInt);
      AppMethodBeat.o(46287);
    }
    while (true)
    {
      return localBankcard;
      localBankcard = null;
      AppMethodBeat.o(46287);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(46286);
    int i = this.items.size();
    AppMethodBeat.o(46286);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(46285);
    if (paramView == null);
    for (paramView = (WalletFormView)View.inflate(this.context, 2130971054, null); ; paramView = (WalletFormView)paramView)
    {
      Bankcard localBankcard = Hd(paramInt);
      if (localBankcard != null)
      {
        String str = localBankcard.field_desc;
        paramViewGroup = str;
        if (localBankcard.field_bankcardState == 1)
          paramViewGroup = str + this.context.getString(2131304816);
        paramView.setText(paramViewGroup);
      }
      paramView.setOnClickListener(new WalletForgotPwdUI.a.1(this, localBankcard));
      AppMethodBeat.o(46285);
      return paramView;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI.a
 * JD-Core Version:    0.6.2
 */