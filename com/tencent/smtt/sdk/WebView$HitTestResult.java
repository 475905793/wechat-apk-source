package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.HitTestResult;

public class WebView$HitTestResult
{

  @Deprecated
  public static final int ANCHOR_TYPE = 1;
  public static final int EDIT_TEXT_TYPE = 9;
  public static final int EMAIL_TYPE = 4;
  public static final int GEO_TYPE = 3;

  @Deprecated
  public static final int IMAGE_ANCHOR_TYPE = 6;
  public static final int IMAGE_TYPE = 5;
  public static final int PHONE_TYPE = 2;
  public static final int SRC_ANCHOR_TYPE = 7;
  public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
  public static final int UNKNOWN_TYPE = 0;
  private IX5WebViewBase.HitTestResult a;
  private android.webkit.WebView.HitTestResult b = null;

  public WebView$HitTestResult()
  {
    this.a = null;
    this.b = null;
  }

  public WebView$HitTestResult(android.webkit.WebView.HitTestResult paramHitTestResult)
  {
    this.a = null;
    this.b = paramHitTestResult;
  }

  public WebView$HitTestResult(IX5WebViewBase.HitTestResult paramHitTestResult)
  {
    this.a = paramHitTestResult;
    this.b = null;
  }

  public String getExtra()
  {
    AppMethodBeat.i(64842);
    String str = "";
    if (this.a != null)
      str = this.a.getExtra();
    while (true)
    {
      AppMethodBeat.o(64842);
      return str;
      if (this.b != null)
        str = this.b.getExtra();
    }
  }

  public int getType()
  {
    AppMethodBeat.i(64841);
    int i = 0;
    if (this.a != null)
      i = this.a.getType();
    while (true)
    {
      AppMethodBeat.o(64841);
      return i;
      if (this.b != null)
        i = this.b.getType();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebView.HitTestResult
 * JD-Core Version:    0.6.2
 */