package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

class AppEventStore$MovedClassObjectInputStream extends ObjectInputStream
{
  private static final String ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";
  private static final String APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1";

  public AppEventStore$MovedClassObjectInputStream(InputStream paramInputStream)
  {
    super(paramInputStream);
  }

  protected ObjectStreamClass readClassDescriptor()
  {
    AppMethodBeat.i(71900);
    ObjectStreamClass localObjectStreamClass1 = super.readClassDescriptor();
    ObjectStreamClass localObjectStreamClass2;
    if (localObjectStreamClass1.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1"))
      localObjectStreamClass2 = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
    while (true)
    {
      AppMethodBeat.o(71900);
      return localObjectStreamClass2;
      localObjectStreamClass2 = localObjectStreamClass1;
      if (localObjectStreamClass1.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1"))
        localObjectStreamClass2 = ObjectStreamClass.lookup(AppEvent.SerializationProxyV1.class);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventStore.MovedClassObjectInputStream
 * JD-Core Version:    0.6.2
 */