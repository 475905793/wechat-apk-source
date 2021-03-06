package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ipcall.a.d.d;
import com.tencent.mm.protocal.protobuf.aqk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.LinkedList;

public class IPCallMyGiftCardUI extends MMActivity
  implements f
{
  private View Ek;
  private ProgressDialog gqo;
  private ListView mListView;
  private IPCallMyGiftCardUI.a nDx;
  private d nDy;

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969901;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22216);
    super.onCreate(paramBundle);
    aw.Rg().a(288, this);
    setMMTitle(2131300810);
    setBackBtn(new IPCallMyGiftCardUI.1(this));
    addTextOptionMenu(0, this.mController.ylL.getString(2131300808), new IPCallMyGiftCardUI.2(this));
    this.Ek = findViewById(2131825169);
    this.mListView = ((ListView)findViewById(2131825168));
    this.nDx = new IPCallMyGiftCardUI.a(this);
    this.mListView.setAdapter(this.nDx);
    paramBundle = this.mController.ylL;
    getString(2131297061);
    this.gqo = h.b(paramBundle, getString(2131300739), true, new IPCallMyGiftCardUI.3(this));
    this.nDy = new d();
    aw.Rg().a(this.nDy, 0);
    AppMethodBeat.o(22216);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22218);
    super.onDestroy();
    aw.Rg().b(288, this);
    AppMethodBeat.o(22218);
  }

  public void onResume()
  {
    AppMethodBeat.i(22217);
    super.onResume();
    AppMethodBeat.o(22217);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(22219);
    ab.i("MicroMsg.IPCallMyGiftCardUI", "onSceneEnd>errCode:%d,onSceneEnd>errMsg:%s", new Object[] { Integer.valueOf(paramInt2), paramString });
    if ((paramm instanceof d))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((d)paramm).nym;
        if ((this.gqo != null) && (this.gqo.isShowing()))
          this.gqo.dismiss();
        this.nDx.ngC = paramString.wuj;
        this.nDx.nDB = paramString;
        this.nDx.notifyDataSetChanged();
        if (paramString.wuj.size() == 0)
          this.Ek.setVisibility(0);
        AppMethodBeat.o(22219);
      }
    while (true)
    {
      return;
      if ((this.gqo != null) && (this.gqo.isShowing()))
        this.gqo.dismiss();
      this.Ek.setVisibility(0);
      Toast.makeText(this.mController.ylL, getString(2131300736), 0).show();
      AppMethodBeat.o(22219);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI
 * JD-Core Version:    0.6.2
 */