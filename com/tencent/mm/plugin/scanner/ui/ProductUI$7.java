package com.tencent.mm.plugin.scanner.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.o.a;
import com.tencent.mm.sdk.platformtools.ab;

final class ProductUI$7
  implements Runnable
{
  ProductUI$7(ProductUI paramProductUI, String paramString, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(81087);
    if ((this.paQ.equals(ProductUI.a(this.qdu).field_thumburl)) && (ProductUI.s(this.qdu) != null))
      ab.i("MicroMsg.scanner.ProductUI", "onGetPictureFinish: notifyKey=" + this.paQ);
    try
    {
      ProductUI.s(this.qdu).setImageBitmap(this.val$bitmap);
      ProductUI.s(this.qdu).setBackgroundDrawable(null);
      ProductUI.s(this.qdu).setBackgroundColor(-1);
      ProductUI.t(this.qdu);
      ProductUI.u(this.qdu);
      if ((this.paQ.equals(ProductUI.a(this.qdu).field_headerbackgroundurl)) && (ProductUI.v(this.qdu) != null))
        ProductUI.v(this.qdu).setImageBitmap(this.val$bitmap);
      AppMethodBeat.o(81087);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.scanner.ProductUI", "onGetPictureFinish : [%s]", new Object[] { localException.getLocalizedMessage() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductUI.7
 * JD-Core Version:    0.6.2
 */