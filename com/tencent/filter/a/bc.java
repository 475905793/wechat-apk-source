package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.g;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bc extends BaseFilter
{
  public bc()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86510);
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bKD);
    localBaseFilter1.addParam(new m.o("inputImageTexture2", "sh/menghuan_curve.png", 33986));
    setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bLP);
    if (this.needFlipBlend);
    for (int i = 1; ; i = 0)
    {
      localBaseFilter2.addParam(new m.o("inputImageTexture2", "sh/menghuan_blend.png", i, (byte)0));
      localBaseFilter1.setNextFilter(localBaseFilter2, null);
      localBaseFilter1 = new BaseFilter(GLSLRender.bLT);
      localBaseFilter1.addParam(new m.g("levelMinimum", new float[] { 0.1607843F, 0.1607843F, 0.1607843F }));
      localBaseFilter1.addParam(new m.g("levelMiddle", new float[] { 1.0F, 1.0F, 1.0F }));
      localBaseFilter1.addParam(new m.g("levelMaximum", new float[] { 1.0F, 1.0F, 1.0F }));
      localBaseFilter1.addParam(new m.g("minOutput", new float[] { 0.0F, 0.0F, 0.0F }));
      localBaseFilter1.addParam(new m.g("maxOutput", new float[] { 1.0F, 1.0F, 1.0F }));
      localBaseFilter2.setNextFilter(localBaseFilter1, null);
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86510);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.bc
 * JD-Core Version:    0.6.2
 */