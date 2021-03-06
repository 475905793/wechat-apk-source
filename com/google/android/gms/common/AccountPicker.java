package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class AccountPicker
{
  public static final int CUSTOM_THEME_ACCOUNT_CHIPS = 2;
  public static final int CUSTOM_THEME_GAMES = 1;
  public static final int CUSTOM_THEME_NONE = 0;
  public static final String EXTRA_ADD_ACCOUNT_AUTH_TOKEN_TYPE_STRING = "authTokenType";
  public static final String EXTRA_ADD_ACCOUNT_OPTIONS_BUNDLE = "addAccountOptions";
  public static final String EXTRA_ADD_ACCOUNT_REQUIRED_FEATURES_STRING_ARRAY = "addAccountRequiredFeatures";
  public static final String EXTRA_ALLOWABLE_ACCOUNTS_ARRAYLIST = "allowableAccounts";
  public static final String EXTRA_ALLOWABLE_ACCOUNT_TYPES_STRING_ARRAY = "allowableAccountTypes";
  public static final String EXTRA_ALWAYS_PROMPT_FOR_ACCOUNT = "alwaysPromptForAccount";
  public static final String EXTRA_DESCRIPTION_TEXT_OVERRIDE = "descriptionTextOverride";
  public static final String EXTRA_HOSTED_DOMAIN_FILTER = "hostedDomainFilter";
  public static final String EXTRA_IS_ACCOUNT_CHIPS_ACCOUNT_PICKER = "pickedFromAccountChips";
  public static final String EXTRA_OVERRIDE_CUSTOM_THEME = "overrideCustomTheme";
  public static final String EXTRA_OVERRIDE_THEME = "overrideTheme";
  public static final String EXTRA_REAL_CLIENT_PACKAGE = "realClientPackage";
  public static final String EXTRA_SELECTED_ACCOUNT = "selectedAccount";
  public static final String EXTRA_SET_GMS_CORE_ACCOUNT = "setGmsCoreAccount";
  public static final int THEME_DEFAULT = 0;
  public static final int THEME_LIGHT = 1;

  public static Intent newChooseAccountIntent(Account paramAccount, ArrayList<Account> paramArrayList, String[] paramArrayOfString1, boolean paramBoolean, String paramString1, String paramString2, String[] paramArrayOfString2, Bundle paramBundle)
  {
    AppMethodBeat.i(89334);
    paramAccount = newChooseAccountIntent(paramAccount, paramArrayList, paramArrayOfString1, paramBoolean, paramString1, paramString2, paramArrayOfString2, paramBundle, false);
    AppMethodBeat.o(89334);
    return paramAccount;
  }

  public static Intent newChooseAccountIntent(Account paramAccount, ArrayList<Account> paramArrayList, String[] paramArrayOfString1, boolean paramBoolean1, String paramString1, String paramString2, String[] paramArrayOfString2, Bundle paramBundle, boolean paramBoolean2)
  {
    AppMethodBeat.i(89335);
    paramAccount = newChooseAccountIntent(paramAccount, paramArrayList, paramArrayOfString1, paramBoolean1, paramString1, paramString2, paramArrayOfString2, paramBundle, paramBoolean2, 0, 0);
    AppMethodBeat.o(89335);
    return paramAccount;
  }

  public static Intent newChooseAccountIntent(Account paramAccount, ArrayList<Account> paramArrayList, String[] paramArrayOfString1, boolean paramBoolean1, String paramString1, String paramString2, String[] paramArrayOfString2, Bundle paramBundle, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(89336);
    paramAccount = newChooseAccountIntent(paramAccount, paramArrayList, paramArrayOfString1, paramBoolean1, paramString1, paramString2, paramArrayOfString2, paramBundle, paramBoolean2, paramInt1, paramInt2, null, false);
    AppMethodBeat.o(89336);
    return paramAccount;
  }

  public static Intent newChooseAccountIntent(Account paramAccount, ArrayList<Account> paramArrayList, String[] paramArrayOfString1, boolean paramBoolean1, String paramString1, String paramString2, String[] paramArrayOfString2, Bundle paramBundle, boolean paramBoolean2, int paramInt1, int paramInt2, String paramString3, boolean paramBoolean3)
  {
    AppMethodBeat.i(89337);
    Intent localIntent = new Intent();
    boolean bool;
    if (!paramBoolean3)
    {
      if (paramString3 == null)
      {
        bool = true;
        Preconditions.checkArgument(bool, "We only support hostedDomain filter for account chip styled account picker");
      }
    }
    else
      if (!paramBoolean3)
        break label189;
    label189: for (String str = "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE"; ; str = "com.google.android.gms.common.account.CHOOSE_ACCOUNT")
    {
      localIntent.setAction(str);
      localIntent.setPackage("com.google.android.gms");
      localIntent.putExtra("allowableAccounts", paramArrayList);
      localIntent.putExtra("allowableAccountTypes", paramArrayOfString1);
      localIntent.putExtra("addAccountOptions", paramBundle);
      localIntent.putExtra("selectedAccount", paramAccount);
      localIntent.putExtra("alwaysPromptForAccount", paramBoolean1);
      localIntent.putExtra("descriptionTextOverride", paramString1);
      localIntent.putExtra("authTokenType", paramString2);
      localIntent.putExtra("addAccountRequiredFeatures", paramArrayOfString2);
      localIntent.putExtra("setGmsCoreAccount", paramBoolean2);
      localIntent.putExtra("overrideTheme", paramInt1);
      localIntent.putExtra("overrideCustomTheme", paramInt2);
      localIntent.putExtra("hostedDomainFilter", paramString3);
      AppMethodBeat.o(89337);
      return localIntent;
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.AccountPicker
 * JD-Core Version:    0.6.2
 */