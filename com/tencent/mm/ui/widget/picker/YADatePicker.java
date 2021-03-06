package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View.BaseSavedState;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CalendarView;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cg.a.a;
import java.util.Calendar;

public class YADatePicker extends FrameLayout
{
  private static final String LOG_TAG;
  public final YADatePicker.b zSI;

  static
  {
    AppMethodBeat.i(112935);
    LOG_TAG = YADatePicker.class.getSimpleName();
    AppMethodBeat.o(112935);
  }

  public YADatePicker(Context paramContext)
  {
    this(paramContext, null);
  }

  public YADatePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130771982);
  }

  public YADatePicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112909);
    this.zSI = new YADatePicker.c(this, paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.DatePicker, paramInt, 0);
    paramInt = paramContext.getInt(0, 0);
    paramContext.recycle();
    if (paramInt != 0)
      setFirstDayOfWeek(paramInt);
    AppMethodBeat.o(112909);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, YADatePicker.d paramd)
  {
    AppMethodBeat.i(112910);
    this.zSI.a(paramInt1, paramInt2, paramInt3, paramd);
    AppMethodBeat.o(112910);
  }

  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    AppMethodBeat.i(112921);
    boolean bool = this.zSI.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
    AppMethodBeat.o(112921);
    return bool;
  }

  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    AppMethodBeat.i(112932);
    dispatchThawSelfOnly(paramSparseArray);
    AppMethodBeat.o(112932);
  }

  public CharSequence getAccessibilityClassName()
  {
    AppMethodBeat.i(112923);
    String str = YADatePicker.class.getName();
    AppMethodBeat.o(112923);
    return str;
  }

  public CalendarView getCalendarView()
  {
    AppMethodBeat.i(112929);
    CalendarView localCalendarView = this.zSI.getCalendarView();
    AppMethodBeat.o(112929);
    return localCalendarView;
  }

  public boolean getCalendarViewShown()
  {
    AppMethodBeat.i(112927);
    boolean bool = this.zSI.getCalendarViewShown();
    AppMethodBeat.o(112927);
    return bool;
  }

  public int getDayOfMonth()
  {
    AppMethodBeat.i(112913);
    int i = this.zSI.getDayOfMonth();
    AppMethodBeat.o(112913);
    return i;
  }

  public int getFirstDayOfWeek()
  {
    AppMethodBeat.i(112925);
    int i = this.zSI.getFirstDayOfWeek();
    AppMethodBeat.o(112925);
    return i;
  }

  public long getMaxDate()
  {
    AppMethodBeat.i(112916);
    long l = this.zSI.dLp().getTimeInMillis();
    AppMethodBeat.o(112916);
    return l;
  }

  public long getMinDate()
  {
    AppMethodBeat.i(112914);
    long l = this.zSI.dLo().getTimeInMillis();
    AppMethodBeat.o(112914);
    return l;
  }

  public int getMonth()
  {
    AppMethodBeat.i(112912);
    int i = this.zSI.getMonth();
    AppMethodBeat.o(112912);
    return i;
  }

  public boolean getSpinnersShown()
  {
    AppMethodBeat.i(112930);
    boolean bool = this.zSI.getSpinnersShown();
    AppMethodBeat.o(112930);
    return bool;
  }

  @Keep
  public YADatePicker.b getUIDelegate()
  {
    return this.zSI;
  }

  public int getYear()
  {
    AppMethodBeat.i(112911);
    int i = this.zSI.getYear();
    AppMethodBeat.o(112911);
    return i;
  }

  public boolean isEnabled()
  {
    AppMethodBeat.i(112919);
    boolean bool = this.zSI.isEnabled();
    AppMethodBeat.o(112919);
    return bool;
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(112924);
    super.onConfigurationChanged(paramConfiguration);
    this.zSI.onConfigurationChanged(paramConfiguration);
    AppMethodBeat.o(112924);
  }

  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    AppMethodBeat.i(112922);
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    this.zSI.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    AppMethodBeat.o(112922);
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    AppMethodBeat.i(112934);
    paramParcelable = (View.BaseSavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.zSI.onRestoreInstanceState(paramParcelable);
    AppMethodBeat.o(112934);
  }

  protected Parcelable onSaveInstanceState()
  {
    AppMethodBeat.i(112933);
    Parcelable localParcelable = super.onSaveInstanceState();
    localParcelable = this.zSI.d(localParcelable);
    AppMethodBeat.o(112933);
    return localParcelable;
  }

  public void setCalendarViewShown(boolean paramBoolean)
  {
    AppMethodBeat.i(112928);
    this.zSI.setCalendarViewShown(paramBoolean);
    AppMethodBeat.o(112928);
  }

  public void setEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(112920);
    if (this.zSI.isEnabled() == paramBoolean)
      AppMethodBeat.o(112920);
    while (true)
    {
      return;
      super.setEnabled(paramBoolean);
      this.zSI.setEnabled(paramBoolean);
      AppMethodBeat.o(112920);
    }
  }

  public void setFirstDayOfWeek(int paramInt)
  {
    AppMethodBeat.i(112926);
    if ((paramInt <= 0) || (paramInt > 7))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("firstDayOfWeek must be between 1 and 7");
      AppMethodBeat.o(112926);
      throw localIllegalArgumentException;
    }
    this.zSI.setFirstDayOfWeek(paramInt);
    AppMethodBeat.o(112926);
  }

  public void setMaxDate(long paramLong)
  {
    AppMethodBeat.i(112917);
    this.zSI.setMaxDate(paramLong);
    AppMethodBeat.o(112917);
  }

  public void setMinDate(long paramLong)
  {
    AppMethodBeat.i(112915);
    this.zSI.setMinDate(paramLong);
    AppMethodBeat.o(112915);
  }

  public void setSpinnersShown(boolean paramBoolean)
  {
    AppMethodBeat.i(112931);
    this.zSI.setSpinnersShown(paramBoolean);
    AppMethodBeat.o(112931);
  }

  public void setValidationCallback(YADatePicker.e parame)
  {
    AppMethodBeat.i(112918);
    this.zSI.setValidationCallback(parame);
    AppMethodBeat.o(112918);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.YADatePicker
 * JD-Core Version:    0.6.2
 */