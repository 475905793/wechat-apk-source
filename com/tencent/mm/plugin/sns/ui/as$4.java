package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.e.h;

final class as$4
  implements View.OnClickListener
{
  as$4(as paramas)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(39204);
    paramView = new Intent();
    paramView.putExtra("enter_scene", e.h.ygb);
    d.b(as.a(this.rvF), "setting", ".ui.setting.SettingsPrivacyUI", paramView);
    h.pYm.e(14098, new Object[] { Integer.valueOf(8) });
    AppMethodBeat.o(39204);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.as.4
 * JD-Core Version:    0.6.2
 */