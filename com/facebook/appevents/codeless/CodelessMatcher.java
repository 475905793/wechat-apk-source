package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ParameterComponent;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.internal.InternalSettings;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CodelessMatcher
{
  private static final String CURRENT_CLASS_NAME = ".";
  private static final String PARENT_CLASS_NAME = "..";
  private static final String TAG;
  private Set<Activity> activitiesSet;
  private HashMap<String, String> delegateMap;
  private final Handler uiThreadHandler;
  private Set<CodelessMatcher.ViewMatcher> viewMatchers;

  static
  {
    AppMethodBeat.i(72068);
    TAG = CodelessMatcher.class.getCanonicalName();
    AppMethodBeat.o(72068);
  }

  public CodelessMatcher()
  {
    AppMethodBeat.i(72061);
    this.uiThreadHandler = new Handler(Looper.getMainLooper());
    this.activitiesSet = new HashSet();
    this.viewMatchers = new HashSet();
    this.delegateMap = new HashMap();
    AppMethodBeat.o(72061);
  }

  public static Bundle getParameters(EventBinding paramEventBinding, View paramView1, View paramView2)
  {
    AppMethodBeat.i(72064);
    Bundle localBundle = new Bundle();
    if (paramEventBinding == null)
      AppMethodBeat.o(72064);
    while (true)
    {
      return localBundle;
      Object localObject1 = paramEventBinding.getViewParameters();
      if (localObject1 != null)
      {
        Iterator localIterator = ((List)localObject1).iterator();
        break label158;
        break label158;
        label44: ParameterComponent localParameterComponent;
        do
          while (true)
          {
            if (!localIterator.hasNext())
              break label244;
            localParameterComponent = (ParameterComponent)localIterator.next();
            if ((localParameterComponent.value == null) || (localParameterComponent.value.length() <= 0))
              break;
            localBundle.putString(localParameterComponent.name, localParameterComponent.value);
          }
        while (localParameterComponent.path.size() <= 0);
        if (localParameterComponent.pathType.equals("relative"));
        for (localObject1 = CodelessMatcher.ViewMatcher.findViewByPath(paramEventBinding, paramView2, localParameterComponent.path, 0, -1, paramView2.getClass().getSimpleName()); ; localObject1 = CodelessMatcher.ViewMatcher.findViewByPath(paramEventBinding, paramView1, localParameterComponent.path, 0, -1, paramView1.getClass().getSimpleName()))
        {
          localObject1 = ((List)localObject1).iterator();
          label158: if (!((Iterator)localObject1).hasNext())
            break label44;
          Object localObject2 = (CodelessMatcher.MatchedView)((Iterator)localObject1).next();
          if (((CodelessMatcher.MatchedView)localObject2).getView() == null)
            break;
          localObject2 = ViewHierarchy.getTextOfView(((CodelessMatcher.MatchedView)localObject2).getView());
          if (((String)localObject2).length() <= 0)
            break;
          localBundle.putString(localParameterComponent.name, (String)localObject2);
          break label44;
        }
      }
      label244: AppMethodBeat.o(72064);
    }
  }

  private void matchViews()
  {
    AppMethodBeat.i(72066);
    Iterator localIterator = this.activitiesSet.iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (Activity)localIterator.next();
      Object localObject2 = ((Activity)localObject1).getWindow().getDecorView().getRootView();
      localObject1 = localObject1.getClass().getSimpleName();
      localObject2 = new CodelessMatcher.ViewMatcher((View)localObject2, this.uiThreadHandler, this.delegateMap, (String)localObject1);
      this.viewMatchers.add(localObject2);
    }
    AppMethodBeat.o(72066);
  }

  private void startTracking()
  {
    AppMethodBeat.i(72065);
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      matchViews();
      AppMethodBeat.o(72065);
    }
    while (true)
    {
      return;
      this.uiThreadHandler.post(new CodelessMatcher.1(this));
      AppMethodBeat.o(72065);
    }
  }

  public void add(Activity paramActivity)
  {
    AppMethodBeat.i(72062);
    if (InternalSettings.isUnityApp())
      AppMethodBeat.o(72062);
    while (true)
    {
      return;
      if (Thread.currentThread() != Looper.getMainLooper().getThread())
      {
        paramActivity = new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
        AppMethodBeat.o(72062);
        throw paramActivity;
      }
      this.activitiesSet.add(paramActivity);
      this.delegateMap.clear();
      startTracking();
      AppMethodBeat.o(72062);
    }
  }

  public void remove(Activity paramActivity)
  {
    AppMethodBeat.i(72063);
    if (InternalSettings.isUnityApp())
      AppMethodBeat.o(72063);
    while (true)
    {
      return;
      if (Thread.currentThread() != Looper.getMainLooper().getThread())
      {
        paramActivity = new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
        AppMethodBeat.o(72063);
        throw paramActivity;
      }
      this.activitiesSet.remove(paramActivity);
      this.viewMatchers.clear();
      this.delegateMap.clear();
      AppMethodBeat.o(72063);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.CodelessMatcher
 * JD-Core Version:    0.6.2
 */