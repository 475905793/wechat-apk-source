package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.g;
import com.tencent.filter.m.i;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class p extends BaseFilter
{
  private BaseFilter bNF = null;
  private int bNS = 0;

  public p()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86456);
    this.bNF = new BaseFilter(GLSLRender.bLG);
    this.bNF.addParam(new m.o("inputImageTexture2", "sh/darkcornermask_s.png", 33986));
    this.bNF.addParam(new m.o("inputImageTexture3", "sh/darkcornermask_l.png", 33987));
    this.bNF.addParam(new m.g("levelMinimum", new float[] { 0.0F, 0.0F, 0.0F }));
    this.bNF.addParam(new m.g("levelMiddle", new float[] { 0.3F, 0.3F, 0.3F }));
    this.bNF.addParam(new m.g("levelMaximum", new float[] { 1.0F, 1.0F, 1.0F }));
    this.bNF.addParam(new m.g("minOutput", new float[] { 0.0F, 0.0F, 0.0F }));
    this.bNF.addParam(new m.g("maxOutput", new float[] { 1.0F, 1.0F, 1.0F }));
    this.bNF.addParam(new m.i("maskType", this.bNS));
    setNextFilter(this.bNF, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86456);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.p
 * JD-Core Version:    0.6.2
 */