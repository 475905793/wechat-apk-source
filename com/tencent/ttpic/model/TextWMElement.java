package com.tencent.ttpic.model;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.logic.watermark.LogicDataManager;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.WMTextDrawer;

public class TextWMElement extends WMElement
{
  protected static final String INT_D = "%d";
  private long firstTimestamp;
  public RectF mTextRect;
  public int rotate;
  private long timestamp;
  public WMTextDrawer wmTextDrawer;

  public TextWMElement()
  {
    AppMethodBeat.i(83539);
    this.mTextRect = new RectF();
    this.wmTextDrawer = new WMTextDrawer();
    this.rotate = 0;
    AppMethodBeat.o(83539);
  }

  private String getValue()
  {
    AppMethodBeat.i(83541);
    String str1;
    if ((this.userValue != null) && (!isDateWatermark()))
    {
      str1 = this.userValue;
      AppMethodBeat.o(83541);
    }
    while (true)
    {
      return str1;
      str1 = "";
      if (this.fmtstr != null)
        str1 = new String(this.fmtstr);
      String str2 = str1;
      if (this.logic != null)
        str2 = str1.replace("[logic]", this.logic.getValue(this.userValue));
      BenchUtil.benchStart("replaceWithData");
      str1 = LogicDataManager.getInstance().replaceWithData(str2, this.dataKeys);
      BenchUtil.benchEnd("replaceWithData");
      AppMethodBeat.o(83541);
    }
  }

  private boolean isDateWatermark()
  {
    AppMethodBeat.i(83542);
    boolean bool;
    if ((this.logic != null) && (this.logic.type != null) && ((this.logic.type.equals("since")) || (this.logic.type.equals("countdown"))))
    {
      bool = true;
      AppMethodBeat.o(83542);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(83542);
    }
  }

  private boolean needUpdateTextBitmap(boolean paramBoolean)
  {
    AppMethodBeat.i(83548);
    if ((this.curValue != null) && (!TextUtils.isEmpty(this.curValue)) && ((paramBoolean) || (!this.curValue.equals(this.lastValue)) || ((this.curValue != null) && (!TextUtils.isEmpty(this.curValue.trim())) && (!TextUtils.isEmpty(this.animateType)))))
    {
      paramBoolean = true;
      AppMethodBeat.o(83548);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(83548);
    }
  }

  private boolean needUpdateTextShaderBmp(long paramLong)
  {
    AppMethodBeat.i(83549);
    boolean bool = updateTextShaderBmp(paramLong);
    AppMethodBeat.o(83549);
    return bool;
  }

  public Bitmap getBitmap()
  {
    AppMethodBeat.i(83545);
    setContentChanged(false);
    Bitmap localBitmap = super.getBitmap();
    AppMethodBeat.o(83545);
    return localBitmap;
  }

  public int getFrameIndex()
  {
    if (this.firstTimestamp <= 0L)
      this.firstTimestamp = this.timestamp;
    if (this.frames <= 0);
    for (int i = 0; ; i = (int)((this.timestamp - this.firstTimestamp) / this.frameDuration) % this.frames)
      return i;
  }

  public RectF getTextRect()
  {
    return this.mTextRect;
  }

  public void init()
  {
    AppMethodBeat.i(83540);
    super.init();
    if (this.vertical == 2)
      this.rotate = 90;
    while (true)
    {
      this.curValue = getValue();
      AppMethodBeat.o(83540);
      return;
      if (this.vertical == 3)
        this.rotate = -90;
    }
  }

  public boolean isAsyncDrawFinished()
  {
    AppMethodBeat.i(83547);
    boolean bool = this.wmTextDrawer.isAsyncDrawFinished();
    AppMethodBeat.o(83547);
    return bool;
  }

  public void reset()
  {
    AppMethodBeat.i(83550);
    this.lastValue = "";
    this.curValue = "";
    this.wmTextDrawer.cancelAsyncDrawTask();
    setContentChanged(false);
    AppMethodBeat.o(83550);
  }

  public boolean updateBitmap(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(83543);
    paramBoolean = updateBitmap(paramLong, paramBoolean, false);
    AppMethodBeat.o(83543);
    return paramBoolean;
  }

  public boolean updateBitmap(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(83544);
    BenchUtil.benchStart("TextUpdateBitmap");
    this.timestamp = paramLong;
    if (!isAsyncDrawFinished())
    {
      AppMethodBeat.o(83544);
      paramBoolean1 = bool2;
      return paramBoolean1;
    }
    this.curValue = getValue();
    if (needUpdateTextBitmap(paramBoolean1))
    {
      BenchUtil.benchStart("drawTextToBitmap");
      this.wmTextDrawer.drawTextToBitmap(this, this.curValue, false, paramBoolean2);
      BenchUtil.benchEnd("drawTextToBitmap");
      this.firstDrew = true;
    }
    for (paramBoolean1 = bool1; ; paramBoolean1 = false)
    {
      this.lastValue = this.curValue;
      BenchUtil.benchEnd("TextUpdateBitmap");
      AppMethodBeat.o(83544);
      break;
      if ((!TextUtils.isEmpty(this.shaderBmp)) && (!TextUtils.isEmpty(this.wmTextDrawer.lastDrawText)))
        this.wmTextDrawer.drawTextToBitmap(this, this.lastValue, true, paramBoolean2);
    }
  }

  public boolean updateTextShaderBmp(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(83546);
    if (this.shaderBmp != null)
      if (!isAsyncDrawFinished())
        AppMethodBeat.o(83546);
    while (true)
    {
      return bool;
      this.timestamp = paramLong;
      String str = this.shaderBmp.replace("%d", String.valueOf(getFrameIndex()));
      if ((!TextUtils.isEmpty(str)) && (!str.equals(this.curShaderBmp)))
      {
        this.wmTextDrawer.drawTextToBitmap(this, this.lastValue, true, false);
        AppMethodBeat.o(83546);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(83546);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.TextWMElement
 * JD-Core Version:    0.6.2
 */