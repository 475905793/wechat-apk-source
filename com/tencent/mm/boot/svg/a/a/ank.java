package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class ank extends c
{
  private final int height = 120;
  private final int width = 120;

  public final int a(int paramInt, Object[] paramArrayOfObject)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      paramInt = 0;
      while (true)
      {
        return paramInt;
        paramInt = 120;
        continue;
        paramInt = 120;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.FILL);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.STROKE);
      ((Paint)localObject).setColor(-16777216);
      localPaint.setStrokeWidth(1.0F);
      localPaint.setStrokeCap(Paint.Cap.BUTT);
      localPaint.setStrokeJoin(Paint.Join.MITER);
      localPaint.setStrokeMiter(4.0F);
      localPaint.setPathEffect(null);
      c.a(localPaint, paramArrayOfObject).setStrokeWidth(1.0F);
      localPaint = c.a((Paint)localObject, paramArrayOfObject);
      localPaint.setColor(-15028967);
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(31.450109F, 60.4841F);
      ((Path)localObject).lineTo(32.711105F, 58.771122F);
      ((Path)localObject).lineTo(32.711105F, 58.771122F);
      ((Path)localObject).cubicTo(33.365929F, 57.881584F, 34.617882F, 57.691311F, 35.50742F, 58.346134F);
      ((Path)localObject).cubicTo(35.517391F, 58.353477F, 35.527294F, 58.360909F, 35.537128F, 58.368431F);
      ((Path)localObject).lineTo(49.747337F, 69.241776F);
      ((Path)localObject).lineTo(49.747337F, 69.241776F);
      ((Path)localObject).cubicTo(50.488701F, 69.809052F, 51.523895F, 69.788017F, 52.241604F, 69.191093F);
      ((Path)localObject).lineTo(89.730385F, 38.011433F);
      ((Path)localObject).lineTo(89.730385F, 38.011433F);
      ((Path)localObject).cubicTo(90.52095F, 37.35392F, 91.681259F, 37.403004F, 92.413467F, 38.124935F);
      ((Path)localObject).lineTo(93.147606F, 38.848774F);
      ((Path)localObject).lineTo(93.147606F, 38.848774F);
      ((Path)localObject).cubicTo(93.934151F, 39.624283F, 93.9431F, 40.890579F, 93.167587F, 41.677128F);
      ((Path)localObject).cubicTo(93.160156F, 41.684666F, 93.152664F, 41.692146F, 93.145111F, 41.699566F);
      ((Path)localObject).lineTo(52.450825F, 81.682739F);
      ((Path)localObject).lineTo(52.450825F, 81.682739F);
      ((Path)localObject).cubicTo(51.662922F, 82.456879F, 50.396641F, 82.445717F, 49.622509F, 81.657814F);
      ((Path)localObject).cubicTo(49.618988F, 81.654228F, 49.615482F, 81.650635F, 49.611988F, 81.647026F);
      ((Path)localObject).lineTo(31.623617F, 63.060673F);
      ((Path)localObject).lineTo(31.623617F, 63.060673F);
      ((Path)localObject).cubicTo(30.944754F, 62.359241F, 30.871418F, 61.270214F, 31.450109F, 60.4841F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ank
 * JD-Core Version:    0.6.2
 */