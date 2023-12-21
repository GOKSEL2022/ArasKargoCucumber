package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US01 {

    public US01() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.='Hakkimizda']")
    public WebElement hakkimizdaButon;

    @FindBy(xpath = "(//*[text()='Hakkimizda'])[2]")
    public WebElement hakkimizdaText;

    @FindBy(xpath = "(//*[.='Hizmetlerimiz'])[1]")
    public WebElement hizmetlerimizButon;
    @FindBy(xpath = "(//*[.='Hizmetlerimiz'])[7]")
    public WebElement hizmetlerimizText;
    @FindBy(xpath = "//*[@class='popup-close']")
    public WebElement popupCloseHome;

    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Kariyer']")
    public WebElement kariyerButon;

    @FindBy(xpath = "(//h1[contains(text(),'Bizde Önem Taşir')]")
    public WebElement kariyerText;

    @FindBy(xpath = "(//*[.='Sürdürülebilirlik'])[1]")
    public WebElement surdurebilirlikButon;
    @FindBy(xpath = "(//h1[contains(text(),'Doğa Dostu Araslar olarak ')]")
    public WebElement surdurebilirlikText;
    @FindBy(xpath = "(//*[@href='/is-ortakligi-sss'])[1]")
    public WebElement isOrtagimizOlunButon;
    @FindBy(xpath = "(//h1[contains(text(),'Sik Sorulan Sorular')]")
    public WebElement isOrtagimizOlunText;
    @FindBy(xpath = "((//*[@href='/musteri-iliskileri'])[1]")
    public WebElement musteriiliskileriButon;
    @FindBy(xpath = "(//h1[contains(text(),'Size nasil yardimci olabiliriz?')]")
    public WebElement musteriiliskileriText;

    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[7]")
    public WebElement arasKargaSporKulbuButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[8]")
    public WebElement bizeUlasinButon;


    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Vizyon, Misyon ve Politikalar']")
    public WebElement vizyonMisyonPolitikalarDrapdownButon;
    @FindBy(partialLinkText = "Vizyon, Misyon ve Politikalar")
    public WebElement vizyonMisyonPolitikalaDrapdownButon;



    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement yonetimEkibimizDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement haberDuyurularDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement  reklamlarimizDrapdownButon;

    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement bireyselHizmetlerimizDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement kurumsalHizmetlerimizDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement ambalajUrunlerimizDrapdownButon;


    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement araslarBizdeOnemTaşirDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement geleceginBizdeOnemTaşirDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement iyiBirDunyaBizdeOnemTasirDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement teknolojiBizdeOnemTasirDrapdownButon;


    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement surdurulebilirlikRotasiDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement  sosyalSorumlulukPlatformlarimizDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement kaliteYönetimSistemiDrapdownButon;


    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement   acentemizOlunDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement  arasBurasiNoktasiOlunDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement esnafKuryeOlunDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement araciniziKiralayinDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement sikSorulanSorularDrapdownButon;



    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement arasaSorDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement cagriMerkeziDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement  hasarTazminDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement geriBildirimFormuDrapdownButon;



    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement ssSDrapdownButon;


    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement  arasKargoSporKulübüDrapdownButon;


    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement  iletişimDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement  genelMüdürlükDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement  bölgeMüdürlüklerimizDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement subelerimizDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement arasBurasiNoktalarimizDrapdownButon;
    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement müşterimizOlunDrapdownButon;
}
