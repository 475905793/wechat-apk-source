package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class acy extends c
{
  private final int height = 48;
  private final int width = 48;

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
        paramInt = 48;
        continue;
        paramInt = 48;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      Object localObject1 = c.h(paramArrayOfObject);
      Object localObject2 = c.g(paramArrayOfObject);
      Paint localPaint1 = c.k(paramArrayOfObject);
      localPaint1.setFlags(385);
      localPaint1.setStyle(Paint.Style.FILL);
      Paint localPaint2 = c.k(paramArrayOfObject);
      localPaint2.setFlags(385);
      localPaint2.setStyle(Paint.Style.STROKE);
      localPaint1.setColor(-16777216);
      localPaint2.setStrokeWidth(1.0F);
      localPaint2.setStrokeCap(Paint.Cap.BUTT);
      localPaint2.setStrokeJoin(Paint.Join.MITER);
      localPaint2.setStrokeMiter(4.0F);
      localPaint2.setPathEffect(null);
      c.a(localPaint2, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localPaint1 = c.a(localPaint1, paramArrayOfObject);
      localPaint1.setColor(-65794);
      localObject2 = c.a((float[])localObject2, 1.0F, 0.0F, 3.0F, 0.0F, 1.0F, 9.0F);
      ((Matrix)localObject1).reset();
      ((Matrix)localObject1).setValues((float[])localObject2);
      localCanvas.concat((Matrix)localObject1);
      localCanvas.save();
      localObject1 = c.a(localPaint1, paramArrayOfObject);
      localObject2 = c.l(paramArrayOfObject);
      ((Path)localObject2).moveTo(38.485332F, 0.0F);
      ((Path)localObject2).cubicTo(39.240726F, 0.1016682F, 39.99612F, 0.2033363F, 40.751514F, 0.3050045F);
      ((Path)localObject2).cubicTo(40.831032F, 1.087849F, 40.920486F, 1.870694F, 41.0F, 2.653539F);
      ((Path)localObject2).cubicTo(39.270546F, 3.477051F, 38.048F, 4.98174F, 36.736F, 6.333927F);
      ((Path)localObject2).cubicTo(29.221819F, 14.182709F, 21.498909F, 21.817987F, 14.094061F, 29.768438F);
      ((Path)localObject2).cubicTo(11.698667F, 30.886787F, 10.595394F, 27.65374F, 9.02497F, 26.47439F);
      ((Path)localObject2).cubicTo(5.953697F, 23.678514F, 3.498667F, 20.130297F, 0.0F, 17.88343F);
      ((Path)localObject2).cubicTo(0.09939394F, 17.141253F, 0.2087273F, 16.409241F, 0.3180606F, 15.677231F);
      ((Path)localObject2).cubicTo(1.063515F, 15.58573F, 1.79903F, 15.494228F, 2.534545F, 15.402727F);
      ((Path)localObject2).cubicTo(4.631758F, 18.666275F, 8.011151F, 20.760639F, 10.158061F, 23.973352F);
      ((Path)localObject2).cubicTo(11.002909F, 26.037216F, 14.004606F, 26.545557F, 15.266909F, 24.634195F);
      ((Path)localObject2).cubicTo(20.554667F, 18.564606F, 26.438787F, 13.074526F, 31.965092F, 7.238773F);
      ((Path)localObject2).cubicTo(34.131878F, 4.819071F, 36.875153F, 2.887376F, 38.485332F, 0.0F);
      ((Path)localObject2).lineTo(38.485332F, 0.0F);
      ((Path)localObject2).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject2, 2);
      localCanvas.drawPath((Path)localObject2, (Paint)localObject1);
      localCanvas.restore();
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.acy
 * JD-Core Version:    0.6.2
 */