package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.AmbalajUrunlerimiz02_page;
import utilities.ConfigReader;
import utilities.Driver;
import static utilities.ReusableMethods.*;
public class AmbalajUrunlerimiz02_StepDef {
    AmbalajUrunlerimiz02_page ambalajUrunlerimiz02Page =new AmbalajUrunlerimiz02_page();
    Actions actions=new Actions(Driver.getDriver());
    @Given("GC Kullanici {string}  url ye gelir")
    public void kullanici_url_ye_gelir(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("GC Kullanici anasayfanin acildigini dogrular")
    public void kullanici_anasayfanin_acildigini_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("araskargo");
    }
    @When("GC Kullanici Hizmetlerinmiz basligina gelir")
    public void kullanici_hizmetlerinmiz_basligina_gelir()  {
        clickWithTimeOut(ambalajUrunlerimiz02Page.popupCloseHome,3);
        actions.moveToElement(ambalajUrunlerimiz02Page.hizmetlerimizLinkHome).perform();
    }
    @When("GC Kullanici Ambalaj Urunlerimiz secenegine tiklar")
    public void kullanici_ambalaj_urunlerimiz_secenegine_tiklar() {
        clickWithTimeOut(ambalajUrunlerimiz02Page.ambalajUrunlerimizHizmetlerimizLinkHome,3);
    }
    @When("GC Kullanici Ambalaj Urunlerimiz sayfasinda oldugunu dogrular")
    public void kullanici_ambalaj_urunlerimiz_sayfasinda_oldugunu_dogrular() throws InterruptedException {
        Thread.sleep(2000);
        assert ambalajUrunlerimiz02Page.ambalajUrunlerimizTextTitle.isDisplayed();
    }
    @Then("GC Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.quitDriver();
    }
    @Given("GC Kullanici Kutu_Koli basligini goruntuler")
    public void gcKullaniciKutu_KoliBasliginiGoruntuler() {
        assert ambalajUrunlerimiz02Page.kutuKoliButonAmbalajUrunleri.isDisplayed();
    }
    @When("GC Kullanici Kutu_Koli basliginin seceneklerini goruntuler")
    public void gcKullaniciKutu_KoliBasligininSecenekleriniGoruntuler() {
        scrollIntoViewJS(ambalajUrunlerimiz02Page.kutuKoliSecenekleriAmbalajUrunleri);
        assert ambalajUrunlerimiz02Page.kutuKoliSecenekleriAmbalajUrunleri.isDisplayed();
    }
    @And("GC Kullanici Ambalaj fiyatlari alanina tiklar")
    public void gcKullaniciAmbalajFiyatlariAlaninaTiklar() {
        clickByJS(ambalajUrunlerimiz02Page.ambalajFiyatlariButonAmbalajUrunleri);
    }
    @And("GC Kullanici Aras Kargo Hizmetler Fiyat Listesini goruntuler")
    public void gcKullaniciArasKargoHizmetlerFiyatListesiniGoruntuler() throws InterruptedException {
        Thread.sleep(2000);
        switchToWindow(1);
        assert Driver.getDriver().getCurrentUrl().contains("Aras_Hizmetler_fiyat_listesi_2023");
    }
    @And("GC Kullanici indirme linkini goruntuler")
    public void gcKullaniciIndirmeLinkiniGoruntuler() throws InterruptedException {
        System.out.println("ambalajUrunlerimiz02Page.shadow1.getText() = " + ambalajUrunlerimiz02Page.shadow1.getText());
        Thread.sleep(2000);
        System.out.println("ambalajUrunlerimiz02Page.shadow2.getText() = " + ambalajUrunlerimiz02Page.shadow2.getText());
        /*
        switchToWindow(1);

        SearchContext pdfIndir=Driver.getDriver().findElement(By.cssSelector("cr-icon-button[id=download]")).getShadowRoot();
        WebElement indirLinkiAmbalajUrunleri=pdfIndir.findElement(By.id("maskedImage"));
        //assert indirLinkiAmbalajUrunleri.isDisplayed();
        indirLinkiAmbalajUrunleri.click();

         */
    }
    @When("GC Kullanici yazdirma linkini goruntuler")
    public void gcKullaniciYazdirmaLinkiniGoruntuler() {
        /*
        SearchContext pdfYazdir=Driver.getDriver().findElement(By.cssSelector("tabindex=\"0")).getShadowRoot();
        WebElement yazdirLinkiAmbalajUrunleri=pdfYazdir.findElement(By.cssSelector("iron-icon"));
        assert yazdirLinkiAmbalajUrunleri.isDisplayed();

         */
    }
    @Given("GC Kullanici Dosya_Evrak basligina tiklar")
    public void gcKullaniciDosya_EvrakBasliginaTiklar() {
        clickWithTimeOut(ambalajUrunlerimiz02Page.dosyaEvrakButonAmbalajUrunleri,2);
    }
    @When("GC Kullanici Dosya_Evrak basliginin seceneklerini goruntuler")
    public void gcKullaniciDosya_EvrakBasligininSecenekleriniGoruntuler() {
        assert ambalajUrunlerimiz02Page.dosyaEvrakSecenekleriAmbalajUrunleri.isDisplayed();
    }
}