package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US02;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.*;

public class US02_StepDefs {
    US02 us02 =new US02();
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
    public void kullanici_hizmetlerinmiz_basligina_gelir() throws InterruptedException {
        clickWithTimeOut(us02.popupCloseHome,3);
        actions.moveToElement(us02.hizmetlerimizLinkHome).perform();
    }
    @When("GC Kullanici Ambalaj Urunlerimiz secenegine tiklar")
    public void kullanici_ambalaj_urunlerimiz_secenegine_tiklar() {
        clickWithTimeOut(us02.ambalajUrunlerimizHizmetlerimizLinkHome,3);
    }
    @When("GC Kullanici Ambalaj Urunlerimiz sayfasinda oldugunu dogrular")
    public void kullanici_ambalaj_urunlerimiz_sayfasinda_oldugunu_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("ambalaj-urunlerimiz");
    }
    @Then("GC Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.quitDriver();
    }
    @Given("GC Kullanici Kutu_Koli basligini goruntuler")
    public void gcKullaniciKutu_KoliBasliginiGoruntuler() {
        assert us02.kutuKoliButonAmbalajUrunleri.isDisplayed();
    }
    @When("GC Kullanici Kutu_Koli basliginin seceneklerini goruntuler")
    public void gcKullaniciKutu_KoliBasligininSecenekleriniGoruntuler() {
        scrollIntoViewJS(us02.kutuKoliSecenekleriAmbalajUrunleri);
        assert us02.kutuKoliSecenekleriAmbalajUrunleri.isDisplayed();
    }
    @And("GC Kullanici Ambalaj fiyatlari alanina tiklar")
    public void gcKullaniciAmbalajFiyatlariAlaninaTiklar() throws InterruptedException {
        clickByJS(us02.ambalajFiyatlariButonAmbalajUrunleri);
    }
    @And("GC Kullanici Aras Kargo Hizmetler Fiyat Listesini goruntuler")
    public void gcKullaniciArasKargoHizmetlerFiyatListesiniGoruntuler() throws InterruptedException {
        Thread.sleep(2000);
        assert Driver.getDriver().getCurrentUrl().contains("Aras_Hizmetler_fiyat_listesi");
    }
    @And("GC Kullanici indirme linkini goruntuler")
    public void gcKullaniciIndirmeLinkiniGoruntuler() {
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
        clickWithTimeOut(us02.dosyaEvrakButonAmbalajUrunleri,2);
    }
    @When("GC Kullanici Dosya_Evrak basliginin seceneklerini goruntuler")
    public void gcKullaniciDosya_EvrakBasligininSecenekleriniGoruntuler() {
        assert us02.dosyaEvrakSecenekleriAmbalajUrunleri.isDisplayed();
    }
}