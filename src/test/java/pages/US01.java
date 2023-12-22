package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US01 {

    public US01() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'Hakkımızda')]")
    public WebElement hakkimizdaButon;

    @FindBy(xpath = "//*[@class='corporate-pages__wrapper mt-lg-5']")
    public WebElement hakkimizdaText;

    @FindBy(xpath = "(//*[.='Hizmetlerimiz'])[1]")
    public WebElement hizmetlerimizButon;
    @FindBy(xpath = "(//*[.='Hizmetlerimiz'])[7]")
    public WebElement hizmetlerimizText;
    @FindBy(xpath = "//*[@class='popup-close']")
    public WebElement popupCloseHome;

    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Kariyer']")
    public WebElement kariyerButon;

    @FindBy(xpath = "//h1[@class='career-pages-hero__title']")
    public WebElement kariyerText;

    @FindBy(xpath = "(//*[.='Surdurulebilirlik'])[1]")
    public WebElement surdurebilirlikButon;
    @FindBy(xpath = "//h1")
    public WebElement surdurebilirlikText;
    @FindBy(xpath = "(//*[@href='/is-ortakligi-sss'])[1]")
    public WebElement isOrtagimizOlunButon;
    @FindBy(xpath = "(//*[@class='menu-item ng-tns-c588362358-0 ng-star-inserted'])[5]")
    public WebElement isOrtagimizOlunText;
    @FindBy(xpath = "((//*[@href='/musteri-iliskileri'])[1]")
    public WebElement musteriIliskileriButon;
    @FindBy(xpath = "(//h1[contains(text(),'Size nasil yardimci olabiliriz?')]")
    public WebElement musteriIliskileriText;
    //                    (//a[@href='/aras-kargo-spor-kulubu'])[1]
    @FindBy(xpath = "(//*[@class='menu-item ng-tns-c588362358-0 ng-star-inserted'])[7]")
    public WebElement arasKargaSporKulbuButon;
    @FindBy(xpath = "(//*[@class='menu-item ng-tns-c588362358-0 ng-star-inserted'])[8]")
    public WebElement bizeUlasinButon;


    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Vizyon, Misyon ve Politikalar']")
    public WebElement vizyonMisyonPolitikalarDrapdownButon;
    @FindBy(partialLinkText = "Vizyon, Misyon ve Politikalar")
    public WebElement vizyonMisyonPolitikalarTextDrapdownButon;


    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Yonetim Ekibimiz']")
    public WebElement yonetimEkibimizDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Haberler & Duyurular']")
    public WebElement haberDuyurularDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'Reklamlarımız')]")
    public WebElement reklamlarimizDrapdownButon;

    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Bireysel Hizmetlerimiz']")
    public WebElement bireyselHizmetlerimizDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Kurumsal Hizmetlerimiz']")
    public WebElement kurumsalHizmetlerimizDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Ambalaj urunlerimiz']")
    public WebElement ambalajUrunlerimizDrapdownButon;


    @FindBy(xpath = "/a[@class='ng-tns-c588362358-0'][contains(text(),'Araslar Bizde onem Tasır')]")
    public WebElement araslarBizdeOnemTasirDrapdownButon;
    @FindBy(xpath = "///a[@class='ng-tns-c588362358-0'][contains(text(),'Geleceğin Bizde onem Tasır')]")
    public WebElement geleceginBizdeOnemTasirDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'İyi Bir Dunya Bizde onem Tasır')]")
    public WebElement iyiBirDunyaBizdeOnemTasirDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'Teknoloji Bizde onem Tasır')]")
    public WebElement teknolojiBizdeOnemTasirDrapdownButon;


    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'Surdurulebilirlik Rotası')]")
    public WebElement surdurulebilirlikRotasiDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'Sosyal Sorumluluk Platformlarımız')]")
    public WebElement sosyalSorumlulukPlatformlarimizDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Kalite Yonetim Sistemi']")
    public WebElement kaliteYonetimSistemiDrapdownButon;


    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Acentemiz Olun']")
    public WebElement acentemizOlunDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'Aras Burası Noktası Olun')]")
    public WebElement arasBurasiNoktasiOlunDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Esnaf Kurye Olun']")
    public WebElement esnafKuryeOlunDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'Aracınızı Kiralayın')]")
    public WebElement araciniziKiralayinDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'Sık Sorulan Sorular')]")
    public WebElement sikSorulanSorularDrapdownButon;


    @FindBy(xpath = "//li[6]//ul[1]//li[4]//a[1]")
    public WebElement arasaSorDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'Çağrı Merkezi')]")
    public WebElement cagriMerkeziDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Hasar Tazmin']")
    public WebElement hasarTazminDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Geri Bildirim Formu']")
    public WebElement geriBildirimFormuDrapdownButon;


    @FindBy(xpath = "(//*[@class='menu-item-ghost ng-tns-c588362358-0'])[4]")
    public WebElement ssSDrapdownButon;


    @FindBy(xpath = "//li[@class='ng-tns-c588362358-0 ng-star-inserted']//a[@class='ng-tns-" +
            "c588362358-0'][normalize-space()='Aras Kargo Spor Kulubu']")
    public WebElement arasKargoSporKulubuDrapdownButon;


    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'İletisim')]")
    public WebElement iletisimDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Genel Mudurluk']")
    public WebElement genelMudurlukDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][normalize-space()='Bolge Mudurluklerimiz']")
    public WebElement bolgeMudurluklerimizDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'subelerimiz')]")
    public WebElement subelerimizDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'Aras Burası Noktalarımız')]")
    public WebElement arasBurasiNoktalarimizDrapdownButon;
    @FindBy(xpath = "//a[@class='ng-tns-c588362358-0'][contains(text(),'Musterimiz Olun')]")
    public WebElement musterimizOlunDrapdownButon;
}