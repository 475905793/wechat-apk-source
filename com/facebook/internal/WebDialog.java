package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;

public class WebDialog extends Dialog
{
  private static final int API_EC_DIALOG_CANCEL = 4201;
  private static final int BACKGROUND_GRAY = -872415232;
  private static final int DEFAULT_THEME = 2131493844;
  static final boolean DISABLE_SSL_CHECK_FOR_TESTING = false;
  private static final String DISPLAY_TOUCH = "touch";
  private static final String LOG_TAG = "FacebookSDK.WebDialog";
  private static final int MAX_PADDING_SCREEN_HEIGHT = 1280;
  private static final int MAX_PADDING_SCREEN_WIDTH = 800;
  private static final double MIN_SCALE_FACTOR = 0.5D;
  private static final int NO_PADDING_SCREEN_HEIGHT = 800;
  private static final int NO_PADDING_SCREEN_WIDTH = 480;
  private static volatile int webDialogTheme;
  private FrameLayout contentFrameLayout;
  private ImageView crossImageView;
  private String expectedRedirectUrl;
  private boolean isDetached;
  private boolean isPageFinished;
  private boolean listenerCalled;
  private WebDialog.OnCompleteListener onCompleteListener;
  private ProgressDialog spinner;
  private WebDialog.UploadStagingResourcesTask uploadTask;
  private String url;
  private WebView webView;
  private WindowManager.LayoutParams windowParams;

  protected WebDialog(Context paramContext, String paramString)
  {
    this(paramContext, paramString, getWebDialogTheme());
    AppMethodBeat.i(96676);
    AppMethodBeat.o(96676);
  }

  private WebDialog(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, i);
    AppMethodBeat.i(96677);
    this.expectedRedirectUrl = "fbconnect://success";
    this.listenerCalled = false;
    this.isDetached = false;
    this.isPageFinished = false;
    this.url = paramString;
    AppMethodBeat.o(96677);
  }

  private WebDialog(Context paramContext, String paramString, Bundle paramBundle, int paramInt, WebDialog.OnCompleteListener paramOnCompleteListener)
  {
    super(paramContext, i);
    AppMethodBeat.i(96678);
    this.expectedRedirectUrl = "fbconnect://success";
    this.listenerCalled = false;
    this.isDetached = false;
    this.isPageFinished = false;
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
      localBundle = new Bundle();
    if (Utility.isChromeOS(paramContext))
    {
      paramContext = "fbconnect://chrome_os_success";
      this.expectedRedirectUrl = paramContext;
      localBundle.putString("redirect_uri", this.expectedRedirectUrl);
      localBundle.putString("display", "touch");
      localBundle.putString("client_id", FacebookSdk.getApplicationId());
      localBundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[] { FacebookSdk.getSdkVersion() }));
      this.onCompleteListener = paramOnCompleteListener;
      if ((!paramString.equals("share")) || (!localBundle.containsKey("media")))
        break label185;
      this.uploadTask = new WebDialog.UploadStagingResourcesTask(this, paramString, localBundle);
      AppMethodBeat.o(96678);
    }
    while (true)
    {
      return;
      paramContext = "fbconnect://success";
      break;
      label185: this.url = Utility.buildUri(ServerProtocol.getDialogAuthority(), FacebookSdk.getGraphApiVersion() + "/dialog/" + paramString, localBundle).toString();
      AppMethodBeat.o(96678);
    }
  }

  private void createCrossImage()
  {
    AppMethodBeat.i(96692);
    this.crossImageView = new ImageView(getContext());
    this.crossImageView.setOnClickListener(new WebDialog.2(this));
    Drawable localDrawable = getContext().getResources().getDrawable(2130838383);
    this.crossImageView.setImageDrawable(localDrawable);
    this.crossImageView.setVisibility(4);
    AppMethodBeat.o(96692);
  }

  private int getScaledSize(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    double d = 0.5D;
    int i = (int)(paramInt1 / paramFloat);
    if (i <= paramInt2)
      d = 1.0D;
    while (true)
    {
      return (int)(d * paramInt1);
      if (i < paramInt3)
        d = 0.5D + (paramInt3 - i) / (paramInt3 - paramInt2) * 0.5D;
    }
  }

  public static int getWebDialogTheme()
  {
    AppMethodBeat.i(96675);
    Validate.sdkInitialized();
    int i = webDialogTheme;
    AppMethodBeat.o(96675);
    return i;
  }

  protected static void initDefaultTheme(Context paramContext)
  {
    AppMethodBeat.i(96673);
    if (paramContext == null)
      AppMethodBeat.o(96673);
    while (true)
    {
      return;
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        if ((paramContext != null) && (paramContext.metaData != null))
          break label62;
        AppMethodBeat.o(96673);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        AppMethodBeat.o(96673);
      }
      continue;
      label62: if (webDialogTheme == 0)
        setWebDialogTheme(paramContext.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
      AppMethodBeat.o(96673);
    }
  }

  public static WebDialog newInstance(Context paramContext, String paramString, Bundle paramBundle, int paramInt, WebDialog.OnCompleteListener paramOnCompleteListener)
  {
    AppMethodBeat.i(96674);
    initDefaultTheme(paramContext);
    paramContext = new WebDialog(paramContext, paramString, paramBundle, paramInt, paramOnCompleteListener);
    AppMethodBeat.o(96674);
    return paramContext;
  }

  @SuppressLint({"SetJavaScriptEnabled"})
  private void setUpWebView(int paramInt)
  {
    AppMethodBeat.i(96693);
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    this.webView = new WebDialog.3(this, getContext());
    this.webView.setVerticalScrollBarEnabled(false);
    this.webView.setHorizontalScrollBarEnabled(false);
    this.webView.setWebViewClient(new WebDialog.DialogWebViewClient(this, null));
    this.webView.getSettings().setJavaScriptEnabled(true);
    this.webView.loadUrl(this.url);
    this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    this.webView.setVisibility(4);
    this.webView.getSettings().setSavePassword(false);
    this.webView.getSettings().setSaveFormData(false);
    this.webView.setFocusable(true);
    this.webView.setFocusableInTouchMode(true);
    this.webView.setOnTouchListener(new WebDialog.4(this));
    localLinearLayout.setPadding(paramInt, paramInt, paramInt, paramInt);
    localLinearLayout.addView(this.webView);
    localLinearLayout.setBackgroundColor(-872415232);
    this.contentFrameLayout.addView(localLinearLayout);
    AppMethodBeat.o(96693);
  }

  public static void setWebDialogTheme(int paramInt)
  {
    if (paramInt != 0);
    while (true)
    {
      webDialogTheme = paramInt;
      return;
      paramInt = DEFAULT_THEME;
    }
  }

  public void cancel()
  {
    AppMethodBeat.i(96691);
    if ((this.onCompleteListener != null) && (!this.listenerCalled))
      sendErrorToListener(new FacebookOperationCanceledException());
    AppMethodBeat.o(96691);
  }

  public void dismiss()
  {
    AppMethodBeat.i(96680);
    if (this.webView != null)
      this.webView.stopLoading();
    if ((!this.isDetached) && (this.spinner != null) && (this.spinner.isShowing()))
      this.spinner.dismiss();
    super.dismiss();
    AppMethodBeat.o(96680);
  }

  public WebDialog.OnCompleteListener getOnCompleteListener()
  {
    return this.onCompleteListener;
  }

  protected WebView getWebView()
  {
    return this.webView;
  }

  protected boolean isListenerCalled()
  {
    return this.listenerCalled;
  }

  protected boolean isPageFinished()
  {
    return this.isPageFinished;
  }

  public void onAttachedToWindow()
  {
    AppMethodBeat.i(96684);
    this.isDetached = false;
    if ((Utility.mustFixWindowParamsForAutofill(getContext())) && (this.windowParams != null) && (this.windowParams.token == null))
    {
      this.windowParams.token = getOwnerActivity().getWindow().getAttributes().token;
      Utility.logd("FacebookSDK.WebDialog", "Set token on onAttachedToWindow(): " + this.windowParams.token);
    }
    super.onAttachedToWindow();
    AppMethodBeat.o(96684);
  }

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(96686);
    super.onCreate(paramBundle);
    this.spinner = new ProgressDialog(getContext());
    this.spinner.requestWindowFeature(1);
    this.spinner.setMessage(getContext().getString(2131296301));
    this.spinner.setCanceledOnTouchOutside(false);
    this.spinner.setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(96655);
        WebDialog.this.cancel();
        AppMethodBeat.o(96655);
      }
    });
    requestWindowFeature(1);
    this.contentFrameLayout = new FrameLayout(getContext());
    resize();
    getWindow().setGravity(17);
    getWindow().setSoftInputMode(16);
    createCrossImage();
    if (this.url != null)
      setUpWebView(this.crossImageView.getDrawable().getIntrinsicWidth() / 2 + 1);
    this.contentFrameLayout.addView(this.crossImageView, new ViewGroup.LayoutParams(-2, -2));
    setContentView(this.contentFrameLayout);
    AppMethodBeat.o(96686);
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(96683);
    this.isDetached = true;
    super.onDetachedFromWindow();
    AppMethodBeat.o(96683);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(96679);
    if (paramInt == 4)
      cancel();
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(96679);
    return bool;
  }

  protected void onStart()
  {
    AppMethodBeat.i(96681);
    super.onStart();
    if ((this.uploadTask != null) && (this.uploadTask.getStatus() == AsyncTask.Status.PENDING))
    {
      this.uploadTask.execute(new Void[0]);
      this.spinner.show();
      AppMethodBeat.o(96681);
    }
    while (true)
    {
      return;
      resize();
      AppMethodBeat.o(96681);
    }
  }

  protected void onStop()
  {
    AppMethodBeat.i(96682);
    if (this.uploadTask != null)
    {
      this.uploadTask.cancel(true);
      this.spinner.dismiss();
    }
    super.onStop();
    AppMethodBeat.o(96682);
  }

  public void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(96685);
    if (paramLayoutParams.token == null)
      this.windowParams = paramLayoutParams;
    super.onWindowAttributesChanged(paramLayoutParams);
    AppMethodBeat.o(96685);
  }

  protected Bundle parseResponseUri(String paramString)
  {
    AppMethodBeat.i(96687);
    paramString = Uri.parse(paramString);
    Bundle localBundle = Utility.parseUrlQueryString(paramString.getQuery());
    localBundle.putAll(Utility.parseUrlQueryString(paramString.getFragment()));
    AppMethodBeat.o(96687);
    return localBundle;
  }

  public void resize()
  {
    AppMethodBeat.i(96688);
    Display localDisplay = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    int i;
    if (localDisplayMetrics.widthPixels < localDisplayMetrics.heightPixels)
    {
      i = localDisplayMetrics.widthPixels;
      if (localDisplayMetrics.widthPixels >= localDisplayMetrics.heightPixels)
        break label144;
    }
    label144: for (int j = localDisplayMetrics.heightPixels; ; j = localDisplayMetrics.widthPixels)
    {
      i = Math.min(getScaledSize(i, localDisplayMetrics.density, 480, 800), localDisplayMetrics.widthPixels);
      j = Math.min(getScaledSize(j, localDisplayMetrics.density, 800, 1280), localDisplayMetrics.heightPixels);
      getWindow().setLayout(i, j);
      AppMethodBeat.o(96688);
      return;
      i = localDisplayMetrics.heightPixels;
      break;
    }
  }

  protected void sendErrorToListener(Throwable paramThrowable)
  {
    AppMethodBeat.i(96690);
    if ((this.onCompleteListener != null) && (!this.listenerCalled))
    {
      this.listenerCalled = true;
      if (!(paramThrowable instanceof FacebookException))
        break label59;
    }
    label59: for (paramThrowable = (FacebookException)paramThrowable; ; paramThrowable = new FacebookException(paramThrowable))
    {
      this.onCompleteListener.onComplete(null, paramThrowable);
      dismiss();
      AppMethodBeat.o(96690);
      return;
    }
  }

  protected void sendSuccessToListener(Bundle paramBundle)
  {
    AppMethodBeat.i(96689);
    if ((this.onCompleteListener != null) && (!this.listenerCalled))
    {
      this.listenerCalled = true;
      this.onCompleteListener.onComplete(paramBundle, null);
      dismiss();
    }
    AppMethodBeat.o(96689);
  }

  protected void setExpectedRedirectUrl(String paramString)
  {
    this.expectedRedirectUrl = paramString;
  }

  public void setOnCompleteListener(WebDialog.OnCompleteListener paramOnCompleteListener)
  {
    this.onCompleteListener = paramOnCompleteListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.internal.WebDialog
 * JD-Core Version:    0.6.2
 */