package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.i;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e extends i
{
  private Context mContext;

  public e(Context paramContext)
  {
    this(paramContext, (byte)0);
  }

  private e(Context paramContext, byte paramByte)
  {
    super(paramContext, 2131493279);
    AppMethodBeat.i(8836);
    fA();
    this.mContext = paramContext;
    AppMethodBeat.o(8836);
  }

  private View b(int paramInt, View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(8841);
    Object localObject1 = getWindow();
    Object localObject2;
    View localView;
    if (isLandscape())
    {
      ((Window)localObject1).setGravity(5);
      ((Window)localObject1).setWindowAnimations(2131493530);
      ((Window)localObject1).getDecorView().setPadding(0, 0, 0, 0);
      localObject2 = ((Window)localObject1).getAttributes();
      ((WindowManager.LayoutParams)localObject2).width = -1;
      ((WindowManager.LayoutParams)localObject2).height = -1;
      ((Window)localObject1).setAttributes((WindowManager.LayoutParams)localObject2);
      localObject1 = (ViewGroup)LayoutInflater.from(this.mContext).inflate(2130969751, null);
      localView = ((ViewGroup)localObject1).findViewById(2131823263);
      localObject2 = paramView;
      if (paramInt != 0)
      {
        localObject2 = paramView;
        if (paramView == null)
          localObject2 = getLayoutInflater().inflate(paramInt, (ViewGroup)localObject1, false);
      }
      if (!isLandscape())
        break label203;
      paramView = (FrameLayout)((ViewGroup)localObject1).findViewById(2131824569);
      label142: paramView.setVisibility(0);
      if (paramLayoutParams != null)
        break label217;
      paramView.addView((View)localObject2);
    }
    while (true)
    {
      if (dce())
        localView.setOnClickListener(new e.1(this));
      AppMethodBeat.o(8841);
      return localObject1;
      ((Window)localObject1).setGravity(80);
      ((Window)localObject1).setWindowAnimations(2131493109);
      break;
      label203: paramView = (FrameLayout)((ViewGroup)localObject1).findViewById(2131824568);
      break label142;
      label217: paramView.addView((View)localObject2, paramLayoutParams);
    }
  }

  private boolean dce()
  {
    boolean bool = true;
    AppMethodBeat.i(8842);
    if (Build.VERSION.SDK_INT < 11)
      AppMethodBeat.o(8842);
    while (true)
    {
      return bool;
      TypedValue localTypedValue = new TypedValue();
      if (getContext().getTheme().resolveAttribute(16843611, localTypedValue, true))
      {
        if (localTypedValue.data != 0)
        {
          AppMethodBeat.o(8842);
        }
        else
        {
          AppMethodBeat.o(8842);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(8842);
        bool = false;
      }
    }
  }

  private boolean isLandscape()
  {
    AppMethodBeat.i(8843);
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    boolean bool;
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels)
    {
      bool = true;
      AppMethodBeat.o(8843);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(8843);
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(8838);
    super.onCreate(paramBundle);
    getWindow().setLayout(-1, -1);
    AppMethodBeat.o(8838);
  }

  public final void setContentView(int paramInt)
  {
    AppMethodBeat.i(8837);
    super.setContentView(b(paramInt, null, null));
    AppMethodBeat.o(8837);
  }

  public final void setContentView(View paramView)
  {
    AppMethodBeat.i(8839);
    super.setContentView(b(0, paramView, null));
    AppMethodBeat.o(8839);
  }

  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(8840);
    super.setContentView(b(0, paramView, paramLayoutParams));
    AppMethodBeat.o(8840);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.menu.e
 * JD-Core Version:    0.6.2
 */