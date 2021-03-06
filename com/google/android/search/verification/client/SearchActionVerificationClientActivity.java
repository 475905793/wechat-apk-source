package com.google.android.search.verification.client;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract class SearchActionVerificationClientActivity extends Activity
{
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new Intent(this, up());
    paramBundle.putExtra("SearchActionVerificationClientExtraIntent", getIntent());
    startService(paramBundle);
    finish();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public abstract Class<? extends SearchActionVerificationClientService> up();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.search.verification.client.SearchActionVerificationClientActivity
 * JD-Core Version:    0.6.2
 */