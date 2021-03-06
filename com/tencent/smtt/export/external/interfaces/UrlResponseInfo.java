package com.tencent.smtt.export.external.interfaces;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public abstract class UrlResponseInfo
{
  public abstract Map<String, List<String>> getAllHeaders();

  public abstract List<Map.Entry<String, String>> getAllHeadersAsList();

  public abstract int getHttpStatusCode();

  public abstract String getHttpStatusText();

  public abstract String getNegotiatedProtocol();

  public abstract String getProxyServer();

  public abstract long getReceivedByteCount();

  public abstract String getUrl();

  public abstract List<String> getUrlChain();

  public abstract boolean wasCached();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.UrlResponseInfo
 * JD-Core Version:    0.6.2
 */