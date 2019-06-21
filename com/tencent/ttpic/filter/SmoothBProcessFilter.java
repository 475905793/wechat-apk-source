package com.tencent.ttpic.filter;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.m.f;
import com.tencent.filter.m.n;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SmoothBProcessFilter extends BaseFilter
{
  public static final String FRAGMENT_SHADER = "mee1362x2037539190x543649385x1751607656x1702240368x1948267107x1970567269x1866687858x1768190575x1702125934x1853164091x1919903337x1634934893x1701605485x541340274x1970302569x1634552180x1700029799x1920300152x1963604837x1868982638x1931505010x1819307361x1144156773x1886284064x1833530485x1415931745x1970567269x993158514x1768846602x1836216166x1835103008x1919249520x1763722290x1953853550x1734438217x2019906661x1701999988x1963604787x1868982638x1814064498x544241519x1634692198x1818370164x1816228469x996239472x2003790858x1818632304x544498031x1952670054x540111471x775036989x993146935x2003790858x1818632304x544498031x1952670054x540177007x774971453x993080113x2003790858x1818632304x544498031x1952670054x540242543x774971453x993539377x2003790858x1818632304x544498031x1952670054x540308079x775036989x993079353x2003790858x1818632304x544498031x1952670054x540373615x774905917x993605433x2003790858x1818632304x544498031x1952670054x540439151x774905917x993604406x2003790858x1818632304x544498031x1952670054x540504687x774905917x993211961x1869351434x1981837431x540238693x1953394499x1953718642x1970561363x1769234802x1916956271x1952999273x1936942446x2003790888x1702240368x1663054691x1919904879x1869357100x1713401975x1952542572x1953653280x1869357100x1713401975x1952542572x1952543520x1869357100x1713401975x1952542572x1852793632x175841321x538976288x1936617315x1869357172x1713401975x1952542572x1735803168x1382905164x807419168x171652398x538976288x1936617315x1869357172x1713401975x1952542572x1735803168x1198355788x807419168x171652398x538976288x1936617315x1869357172x1713401975x1952542572x1735803168x1114469708x807419168x171652398x538976288x1936617315x1869357172x1981837431x540238693x1131246924x1717986671x1981824288x674456421x825372208x539768114x825699888x539767861x925904432x992555314x538976266x2003790880x1702240368x1092629347x1967941494x544106861x1702240317x1093153635x1967941494x539775597x1281848897x742878581x1735803168x1114469708x537541417x1814044704x544241519x862152054x1953653280x1869377347x540876914x1869377379x539631730x997487202x538976266x2003790880x1702240368x1763717987x1852142702x2037672307x1981824288x674456421x678719332x1131704930x1919904879x1967923244x1701790573x690579046x538970683x1869357088x1981837431x540238693x1131700595x1919904879x1830829344x1764259945x1852142702x2037672307x1919033388x1819231092x539783791x695492979x538970683x1869357088x1981837431x540238693x1131310947x1919904879x1830829344x1093171305x1967941494x745433453x1952543520x1869377347x1663052914x992570991x538976266x1952805408x544109173x1131310947x1919904879x175966779x1768912394x1634541668x690515561x537557792x1814044704x544241519x878929270x1866688800x544370540x1702109245x1920300152x675557989x1970302569x1634552180x1700029799x1920300152x1948265573x1970567269x1866687858x1768190575x1702125934x537541417x1814044704x544241519x878929270x1634037024x1819231086x1025536623x2019914784x1701999988x1764246578x1953853550x1734438217x2019906661x1701999988x1948265522x1970567269x1866687858x1768190575x1702125934x537541417x1814044704x544241519x878929270x1918989856x1869377347x540876914x1954047348x845509237x1852385348x1232369008x1701273965x1954047316x862286453x1702109228x1920300152x1869562725x1852400754x694514785x538970683x1701650464x1836411236x1818632304x544498031x1852394859x824196384x757084206x1918989856x1869377347x996617842x538970634x1869357088x1981837431x540238693x1970496882x1866691692x544370540x1768759357x1130965112x1919904879x1650946606x1701650476x1866690145x779251564x744646514x1970037280x1886142834x706765160x925773856x539631666x1852394859x168442665x538976288x1180658791x1130848626x1919904879x1981824288x674521957x1970496882x1866691692x779251564x744646514x1866688800x779251564x171649377x2685x";
  public static final String VERTEX_SHADER = "mee190x1920234593x1953849961x1702240357x1881158755x1953067887x997093225x1953784074x1969383794x1981834612x540304229x1970302569x2019906676x1701999988x1919905603x1634625892x171664756x2037539190x543649385x845374838x2019914784x1701999988x1919905603x1634625892x171664756x1684631414x1767992608x539568238x538970747x1818697760x1936674911x1869182057x540876910x1769172848x1852795252x538970683x1702109216x1920300152x1869562725x1852400754x543519841x1852383293x1416918384x1970567269x1866687858x1768190575x1702125934x997816366x32010x";
  private float blurAlpha;

  public SmoothBProcessFilter()
  {
    super("mee190x1920234593x1953849961x1702240357x1881158755x1953067887x997093225x1953784074x1969383794x1981834612x540304229x1970302569x2019906676x1701999988x1919905603x1634625892x171664756x2037539190x543649385x845374838x2019914784x1701999988x1919905603x1634625892x171664756x1684631414x1767992608x539568238x538970747x1818697760x1936674911x1869182057x540876910x1769172848x1852795252x538970683x1702109216x1920300152x1869562725x1852400754x543519841x1852383293x1416918384x1970567269x1866687858x1768190575x1702125934x997816366x32010x", "mee1362x2037539190x543649385x1751607656x1702240368x1948267107x1970567269x1866687858x1768190575x1702125934x1853164091x1919903337x1634934893x1701605485x541340274x1970302569x1634552180x1700029799x1920300152x1963604837x1868982638x1931505010x1819307361x1144156773x1886284064x1833530485x1415931745x1970567269x993158514x1768846602x1836216166x1835103008x1919249520x1763722290x1953853550x1734438217x2019906661x1701999988x1963604787x1868982638x1814064498x544241519x1634692198x1818370164x1816228469x996239472x2003790858x1818632304x544498031x1952670054x540111471x775036989x993146935x2003790858x1818632304x544498031x1952670054x540177007x774971453x993080113x2003790858x1818632304x544498031x1952670054x540242543x774971453x993539377x2003790858x1818632304x544498031x1952670054x540308079x775036989x993079353x2003790858x1818632304x544498031x1952670054x540373615x774905917x993605433x2003790858x1818632304x544498031x1952670054x540439151x774905917x993604406x2003790858x1818632304x544498031x1952670054x540504687x774905917x993211961x1869351434x1981837431x540238693x1953394499x1953718642x1970561363x1769234802x1916956271x1952999273x1936942446x2003790888x1702240368x1663054691x1919904879x1869357100x1713401975x1952542572x1953653280x1869357100x1713401975x1952542572x1952543520x1869357100x1713401975x1952542572x1852793632x175841321x538976288x1936617315x1869357172x1713401975x1952542572x1735803168x1382905164x807419168x171652398x538976288x1936617315x1869357172x1713401975x1952542572x1735803168x1198355788x807419168x171652398x538976288x1936617315x1869357172x1713401975x1952542572x1735803168x1114469708x807419168x171652398x538976288x1936617315x1869357172x1981837431x540238693x1131246924x1717986671x1981824288x674456421x825372208x539768114x825699888x539767861x925904432x992555314x538976266x2003790880x1702240368x1092629347x1967941494x544106861x1702240317x1093153635x1967941494x539775597x1281848897x742878581x1735803168x1114469708x537541417x1814044704x544241519x862152054x1953653280x1869377347x540876914x1869377379x539631730x997487202x538976266x2003790880x1702240368x1763717987x1852142702x2037672307x1981824288x674456421x678719332x1131704930x1919904879x1967923244x1701790573x690579046x538970683x1869357088x1981837431x540238693x1131700595x1919904879x1830829344x1764259945x1852142702x2037672307x1919033388x1819231092x539783791x695492979x538970683x1869357088x1981837431x540238693x1131310947x1919904879x1830829344x1093171305x1967941494x745433453x1952543520x1869377347x1663052914x992570991x538976266x1952805408x544109173x1131310947x1919904879x175966779x1768912394x1634541668x690515561x537557792x1814044704x544241519x878929270x1866688800x544370540x1702109245x1920300152x675557989x1970302569x1634552180x1700029799x1920300152x1948265573x1970567269x1866687858x1768190575x1702125934x537541417x1814044704x544241519x878929270x1634037024x1819231086x1025536623x2019914784x1701999988x1764246578x1953853550x1734438217x2019906661x1701999988x1948265522x1970567269x1866687858x1768190575x1702125934x537541417x1814044704x544241519x878929270x1918989856x1869377347x540876914x1954047348x845509237x1852385348x1232369008x1701273965x1954047316x862286453x1702109228x1920300152x1869562725x1852400754x694514785x538970683x1701650464x1836411236x1818632304x544498031x1852394859x824196384x757084206x1918989856x1869377347x996617842x538970634x1869357088x1981837431x540238693x1970496882x1866691692x544370540x1768759357x1130965112x1919904879x1650946606x1701650476x1866690145x779251564x744646514x1970037280x1886142834x706765160x925773856x539631666x1852394859x168442665x538976288x1180658791x1130848626x1919904879x1981824288x674521957x1970496882x1866691692x779251564x744646514x1866688800x779251564x171649377x2685x");
    AppMethodBeat.i(82896);
    this.blurAlpha = 0.5F;
    initParams();
    AppMethodBeat.o(82896);
  }

  public float getBlurAlpha()
  {
    return this.blurAlpha;
  }

  public void initParams()
  {
    AppMethodBeat.i(82897);
    addParam(new m.f("blurAlpha", this.blurAlpha));
    addParam(new m.n("inputImageTexture2", 0, 33986));
    addParam(new m.n("inputImageTexture3", 0, 33987));
    AppMethodBeat.o(82897);
  }

  public void updateBlurAlpha(float paramFloat)
  {
    AppMethodBeat.i(82899);
    this.blurAlpha = paramFloat;
    addParam(new m.f("blurAlpha", paramFloat));
    AppMethodBeat.o(82899);
  }

  public void updateTextures(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(82898);
    addParam(new m.n("inputImageTexture2", paramInt1, 33986));
    addParam(new m.n("inputImageTexture3", paramInt2, 33987));
    AppMethodBeat.o(82898);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.SmoothBProcessFilter
 * JD-Core Version:    0.6.2
 */