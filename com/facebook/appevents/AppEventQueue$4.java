package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class AppEventQueue$4
  implements Runnable
{
  AppEventQueue$4(AccessTokenAppIdPair paramAccessTokenAppIdPair, AppEvent paramAppEvent)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71887);
    AppEventQueue.access$100().addEvent(this.val$accessTokenAppId, this.val$appEvent);
    if ((AppEventsLogger.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) && (AppEventQueue.access$100().getEventCount() > 100))
    {
      AppEventQueue.flushAndWait(FlushReason.EVENT_THRESHOLD);
      AppMethodBeat.o(71887);
    }
    while (true)
    {
      return;
      if (AppEventQueue.access$000() == null)
        AppEventQueue.access$002(AppEventQueue.access$300().schedule(AppEventQueue.access$200(), 15L, TimeUnit.SECONDS));
      AppMethodBeat.o(71887);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventQueue.4
 * JD-Core Version:    0.6.2
 */