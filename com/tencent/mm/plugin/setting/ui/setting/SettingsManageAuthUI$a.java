package com.tencent.mm.plugin.setting.ui.setting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cmb;
import java.util.List;

final class SettingsManageAuthUI$a extends BaseAdapter
{
  List<cmb> qnw;

  private SettingsManageAuthUI$a(SettingsManageAuthUI paramSettingsManageAuthUI)
  {
  }

  public final cmb Cm(int paramInt)
  {
    AppMethodBeat.i(127255);
    cmb localcmb;
    if ((paramInt >= 0) && (paramInt < getCount()))
    {
      localcmb = (cmb)this.qnw.get(paramInt);
      AppMethodBeat.o(127255);
    }
    while (true)
    {
      return localcmb;
      localcmb = null;
      AppMethodBeat.o(127255);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(127254);
    int i;
    if ((this.qnw != null) && (!this.qnw.isEmpty()))
    {
      i = this.qnw.size();
      AppMethodBeat.o(127254);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(127254);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(127256);
    if (paramView == null)
    {
      paramView = this.qnv.getLayoutInflater().inflate(2130970632, null);
      paramViewGroup = new a((byte)0);
      paramView.setTag(paramViewGroup);
      paramViewGroup.iPD = ((TextView)paramView.findViewById(2131827384));
      paramViewGroup.qnA = ((TextView)paramView.findViewById(2131827385));
      paramViewGroup.qnB = ((TextView)paramView.findViewById(2131827386));
      paramViewGroup.gzI = ((Button)paramView.findViewById(2131827387));
      paramViewGroup.gzI.setOnClickListener(new SettingsManageAuthUI.a.1(this, paramInt));
      if (!SettingsManageAuthUI.c(this.qnv))
        break label198;
      paramViewGroup.gzI.setVisibility(0);
    }
    while (true)
    {
      if (Cm(paramInt) != null)
      {
        paramViewGroup.iPD.setText(Cm(paramInt).fhH);
        paramViewGroup.qnA.setText(Cm(paramInt).xjO);
        paramViewGroup.qnB.setText(SettingsManageAuthUI.cX(Cm(paramInt).xjN));
      }
      AppMethodBeat.o(127256);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label198: paramViewGroup.gzI.setVisibility(8);
    }
  }

  final class a
  {
    Button gzI;
    TextView iPD;
    TextView qnA;
    TextView qnB;

    private a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI.a
 * JD-Core Version:    0.6.2
 */