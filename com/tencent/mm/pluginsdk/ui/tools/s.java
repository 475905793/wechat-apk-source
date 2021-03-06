package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class s
{
  static Pattern sAddressPattern;
  String mAuthInfo;
  String mHost;
  String mPath;
  int mPort;
  String mScheme;

  static
  {
    AppMethodBeat.i(80456);
    sAddressPattern = Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_-][a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);
    AppMethodBeat.o(80456);
  }

  public s(String paramString)
  {
    AppMethodBeat.i(80454);
    if (paramString == null)
    {
      paramString = new NullPointerException();
      AppMethodBeat.o(80454);
      throw paramString;
    }
    this.mScheme = "";
    this.mHost = "";
    this.mPort = -1;
    this.mPath = "/";
    this.mAuthInfo = "";
    paramString = sAddressPattern.matcher(paramString);
    String str;
    if (paramString.matches())
    {
      str = paramString.group(1);
      if (str != null)
        this.mScheme = str.toLowerCase();
      str = paramString.group(2);
      if (str != null)
        this.mAuthInfo = str;
      str = paramString.group(3);
      if (str != null)
        this.mHost = str;
      str = paramString.group(4);
      if ((str == null) || (str.length() <= 0));
    }
    while (true)
    {
      try
      {
        this.mPort = bo.getInt(str, this.mPort);
        paramString = paramString.group(5);
        if ((paramString != null) && (paramString.length() > 0))
        {
          if (paramString.charAt(0) == '/')
            this.mPath = paramString;
        }
        else
        {
          if ((this.mPort != 443) || (!this.mScheme.equals("")))
            break label284;
          this.mScheme = "https";
          if (this.mScheme.equals(""))
            this.mScheme = "http";
          AppMethodBeat.o(80454);
          return;
        }
      }
      catch (NumberFormatException paramString)
      {
        paramString = new Exception("Bad port");
        AppMethodBeat.o(80454);
        throw paramString;
      }
      this.mPath = "/".concat(String.valueOf(paramString));
      continue;
      paramString = new Exception("Bad address");
      AppMethodBeat.o(80454);
      throw paramString;
      label284: if (this.mPort == -1)
        if (this.mScheme.equals("https"))
          this.mPort = 443;
        else
          this.mPort = 80;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(80455);
    String str1 = "";
    if ((this.mPort == 443) || (!this.mScheme.equals("https")))
    {
      str2 = str1;
      if (this.mPort != 80)
      {
        str2 = str1;
        if (!this.mScheme.equals("http"));
      }
    }
    else
    {
      str2 = ":" + Integer.toString(this.mPort);
    }
    str1 = "";
    if (this.mAuthInfo.length() > 0)
      str1 = this.mAuthInfo + "@";
    String str2 = this.mScheme + "://" + str1 + this.mHost + str2 + this.mPath;
    AppMethodBeat.o(80455);
    return str2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.s
 * JD-Core Version:    0.6.2
 */