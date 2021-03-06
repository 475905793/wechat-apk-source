package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.util.List;

final class MediaBrowserServiceCompat$f
  implements MediaBrowserServiceCompat.e
{
  final Messenger IQ;

  MediaBrowserServiceCompat$f(Messenger paramMessenger)
  {
    this.IQ = paramMessenger;
  }

  private void b(int paramInt, Bundle paramBundle)
  {
    Message localMessage = Message.obtain();
    localMessage.what = paramInt;
    localMessage.arg1 = 2;
    localMessage.setData(paramBundle);
    this.IQ.send(localMessage);
  }

  public final void a(String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
      localBundle = new Bundle();
    localBundle.putInt("extra_service_version", 2);
    paramBundle = new Bundle();
    paramBundle.putString("data_media_item_id", paramString);
    paramBundle.putParcelable("data_media_session_token", paramToken);
    paramBundle.putBundle("data_root_hints", localBundle);
    b(1, paramBundle);
  }

  public final void a(String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle)
  {
    paramList = new Bundle();
    paramList.putString("data_media_item_id", paramString);
    paramList.putBundle("data_options", paramBundle);
    b(3, paramList);
  }

  public final IBinder asBinder()
  {
    return this.IQ.getBinder();
  }

  public final void dO()
  {
    b(2, null);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.media.MediaBrowserServiceCompat.f
 * JD-Core Version:    0.6.2
 */