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

public final class ajz extends c
{
  private final int height = 144;
  private final int width = 144;

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
        paramInt = 144;
        continue;
        paramInt = 144;
      }
      Canvas localCanvas = (Canvas)paramArrayOfObject[0];
      paramArrayOfObject = (Looper)paramArrayOfObject[1];
      c.h(paramArrayOfObject);
      c.g(paramArrayOfObject);
      Paint localPaint = c.k(paramArrayOfObject);
      localPaint.setFlags(385);
      localPaint.setStyle(Paint.Style.FILL);
      Object localObject = c.k(paramArrayOfObject);
      ((Paint)localObject).setFlags(385);
      ((Paint)localObject).setStyle(Paint.Style.STROKE);
      localPaint.setColor(-16777216);
      ((Paint)localObject).setStrokeWidth(1.0F);
      ((Paint)localObject).setStrokeCap(Paint.Cap.BUTT);
      ((Paint)localObject).setStrokeJoin(Paint.Join.MITER);
      ((Paint)localObject).setStrokeMiter(4.0F);
      ((Paint)localObject).setPathEffect(null);
      c.a((Paint)localObject, paramArrayOfObject).setStrokeWidth(1.0F);
      localCanvas.save();
      localObject = c.a(localPaint, paramArrayOfObject);
      ((Paint)localObject).setColor(-1);
      Path localPath = c.l(paramArrayOfObject);
      localPath.moveTo(72.0F, 144.0F);
      localPath.cubicTo(32.235497F, 144.0F, 0.0F, 111.7645F, 0.0F, 72.0F);
      localPath.cubicTo(0.0F, 32.235497F, 32.235497F, 0.0F, 72.0F, 0.0F);
      localPath.cubicTo(111.7645F, 0.0F, 144.0F, 32.235497F, 144.0F, 72.0F);
      localPath.cubicTo(144.0F, 111.7645F, 111.7645F, 144.0F, 72.0F, 144.0F);
      localPath.close();
      WeChatSVGRenderC2Java.setFillType(localPath, 2);
      localCanvas.drawPath(localPath, (Paint)localObject);
      localCanvas.restore();
      localCanvas.save();
      localPaint = c.a(localPaint, paramArrayOfObject);
      localPaint.setColor(-5066062);
      localObject = c.l(paramArrayOfObject);
      ((Path)localObject).moveTo(42.5F, 80.0F);
      ((Path)localObject).cubicTo(38.357864F, 80.0F, 35.0F, 76.642136F, 35.0F, 72.5F);
      ((Path)localObject).cubicTo(35.0F, 68.357864F, 38.357864F, 65.0F, 42.5F, 65.0F);
      ((Path)localObject).cubicTo(46.642136F, 65.0F, 50.0F, 68.357864F, 50.0F, 72.5F);
      ((Path)localObject).cubicTo(50.0F, 76.642136F, 46.642136F, 80.0F, 42.5F, 80.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(72.5F, 80.0F);
      ((Path)localObject).cubicTo(68.357864F, 80.0F, 65.0F, 76.642136F, 65.0F, 72.5F);
      ((Path)localObject).cubicTo(65.0F, 68.357864F, 68.357864F, 65.0F, 72.5F, 65.0F);
      ((Path)localObject).cubicTo(76.642136F, 65.0F, 80.0F, 68.357864F, 80.0F, 72.5F);
      ((Path)localObject).cubicTo(80.0F, 76.642136F, 76.642136F, 80.0F, 72.5F, 80.0F);
      ((Path)localObject).close();
      ((Path)localObject).moveTo(102.5F, 80.0F);
      ((Path)localObject).cubicTo(98.357864F, 80.0F, 95.0F, 76.642136F, 95.0F, 72.5F);
      ((Path)localObject).cubicTo(95.0F, 68.357864F, 98.357864F, 65.0F, 102.5F, 65.0F);
      ((Path)localObject).cubicTo(106.64214F, 65.0F, 110.0F, 68.357864F, 110.0F, 72.5F);
      ((Path)localObject).cubicTo(110.0F, 76.642136F, 106.64214F, 80.0F, 102.5F, 80.0F);
      ((Path)localObject).close();
      WeChatSVGRenderC2Java.setFillType((Path)localObject, 2);
      localCanvas.drawPath((Path)localObject, localPaint);
      localCanvas.restore();
      c.j(paramArrayOfObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.boot.svg.a.a.ajz
 * JD-Core Version:    0.6.2
 */