package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class ChangeScroll extends Transition
{
  private static final String[] xV = { "android:changeScroll:x", "android:changeScroll:y" };

  public ChangeScroll()
  {
  }

  public ChangeScroll(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private static void c(ah paramah)
  {
    paramah.values.put("android:changeScroll:x", Integer.valueOf(paramah.view.getScrollX()));
    paramah.values.put("android:changeScroll:y", Integer.valueOf(paramah.view.getScrollY()));
  }

  public final Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    View localView = null;
    paramViewGroup = localView;
    if (paramah1 != null)
    {
      if (paramah2 == null)
        paramViewGroup = localView;
    }
    else
      return paramViewGroup;
    localView = paramah2.view;
    int i = ((Integer)paramah1.values.get("android:changeScroll:x")).intValue();
    int j = ((Integer)paramah2.values.get("android:changeScroll:x")).intValue();
    int k = ((Integer)paramah1.values.get("android:changeScroll:y")).intValue();
    int m = ((Integer)paramah2.values.get("android:changeScroll:y")).intValue();
    if (i != j)
      localView.setScrollX(i);
    for (paramViewGroup = ObjectAnimator.ofInt(localView, "scrollX", new int[] { i, j }); ; paramViewGroup = null)
    {
      if (k != m)
        localView.setScrollY(k);
      for (paramah1 = ObjectAnimator.ofInt(localView, "scrollY", new int[] { k, m }); ; paramah1 = null)
      {
        paramViewGroup = ag.a(paramViewGroup, paramah1);
        break;
      }
    }
  }

  public final void a(ah paramah)
  {
    c(paramah);
  }

  public final void b(ah paramah)
  {
    c(paramah);
  }

  public final String[] getTransitionProperties()
  {
    return xV;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeScroll
 * JD-Core Version:    0.6.2
 */