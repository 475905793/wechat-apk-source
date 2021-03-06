package com.google.android.gms.auth.api.credentials;

import android.accounts.Account;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class IdentityProviders
{
  public static final String FACEBOOK = "https://www.facebook.com";
  public static final String GOOGLE = "https://accounts.google.com";
  public static final String LINKEDIN = "https://www.linkedin.com";
  public static final String MICROSOFT = "https://login.live.com";
  public static final String PAYPAL = "https://www.paypal.com";
  public static final String TWITTER = "https://twitter.com";
  public static final String YAHOO = "https://login.yahoo.com";

  public static final String getIdentityProviderForAccount(Account paramAccount)
  {
    AppMethodBeat.i(50354);
    Preconditions.checkNotNull(paramAccount, "account cannot be null");
    if ("com.google".equals(paramAccount.type))
    {
      paramAccount = "https://accounts.google.com";
      AppMethodBeat.o(50354);
    }
    while (true)
    {
      return paramAccount;
      if ("com.facebook.auth.login".equals(paramAccount.type))
      {
        paramAccount = "https://www.facebook.com";
        AppMethodBeat.o(50354);
      }
      else
      {
        paramAccount = null;
        AppMethodBeat.o(50354);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.IdentityProviders
 * JD-Core Version:    0.6.2
 */