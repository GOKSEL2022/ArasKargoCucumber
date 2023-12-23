package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.US02;
import pages.US12;
import utilities.Driver;
import utilities.ReusableMethods;

public class US12_StepDefs {
    US12 us12=new US12();  US02 us02 =new US02();
    Actions actions=new Actions(Driver.getDriver());
    @And("GC Kullanici Musteri Iliskileri basligina gelir")
    public void gcKullaniciMusteriIliskileriBasliginaGelir() throws InterruptedException {
        ReusableMethods.clickWithTimeOut(us02.popupCloseHome,3);
        actions.moveToElement(us12.musteriIliskileriLinkHome).perform();
    }
    @And("GC Kullanici SSS secenegine tiklar")
    public void gcKullaniciSSSSecenegineTiklar() {
        ReusableMethods.clickWithTimeOut(us12.sssSecenegiMusteriIliskileriLinkHome,3);
    }
    @When("GC Kullanici Sik Sorulan Sorular sayfasinda oldugunu dogrular")
    public void gcKullaniciSikSorulanSorularSayfasindaOldugunuDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("sss");
        //assert us12.sikSorulanSorularTitleTextMusteriIliskileri.isDisplayed();
    }
    @Given("GC Kullanici sayfadaki ilk soruyu goruntuler")
    public void gcKullaniciSayfadakiIlkSoruyuGoruntuler() {
        assert us12.ilkSoruSikSorulanSorularMusteriIliskileri.isDisplayed();
    }
    @When("GC Kullanici sayfadaki son soruyu goruntuler")
    public void gcKullaniciSayfadakiSonSoruyuGoruntuler() {
        ReusableMethods.scrollIntoViewJS(us12.sonSoruSikSorulanSorularMusteriIliskileri);
    }
    @Given("GC Kullanici sayfadaki ilk soruya tiklar")
    public void gcKullaniciSayfadakiIlkSoruyaTiklar() {
        ReusableMethods.clickWithTimeOut(us12.ilkSoruSikSorulanSorularMusteriIliskileri,2);
    }
    @When("GC Kullanici ilk soru ile ilk cevabin ilgili oldugunu dogrular")
    public void gcKullaniciIlkSoruIleIlkCevabinIlgiliOldugunuDogrular() {
        us12.ilkCevapSikSorulanSorularMusteriIliskileri.getText().contains(us12.ilkCevapSikSorulanSorularMusteriIliskileri.getText());
    }
    @And("GC Kullanici sayfadaki ikinci soruya tiklar")
    public void gcKullaniciSayfadakiIkinciSoruyaTiklar() {
        ReusableMethods.clickWithTimeOut(us12.ikinciSoruSikSorulanSorularMusteriIliskileri,2);
    }
    @And("GC Kullanici ikinci soru ile ikinci cevabin ilgili oldugunu dogrular")
    public void gcKullaniciIkinciSoruIleIkinciCevabinIlgiliOldugunuDogrular() {
        us12.ikinciCevapSikSorulanSorularMusteriIliskileri.getText().contains(us12.ikinciSoruSikSorulanSorularMusteriIliskileri.getText());
    }
    @And("GC Kullanici son soruyu tiklar")
    public void gcKullaniciSonSoruyuTiklar() {
        ReusableMethods.scrollIntoViewJS(us12.sonSoruSikSorulanSorularMusteriIliskileri);
        ReusableMethods.clickWithTimeOut(us12.sonSoruSikSorulanSorularMusteriIliskileri,2);
    }
    @When("GC Kullanici son soru ile son cevabin ilgili oldugunu dogrular")
    public void gcKullaniciSonSoruIleSonCevabinIlgiliOldugunuDogrular() {
        us12.sonCevapSikSorulanSorularMusteriIliskileri.getText().contains(us12.sonSoruSikSorulanSorularMusteriIliskileri.getText());
    }
    @When("GC Kullanici cevapta belirtilen mobil uygulamalardan GooglePlay e tiklar")
    public void gcKullaniciCevaptaBelirtilenMobilUygulamalardanGooglePlayETiklar() {
        ReusableMethods.clickWithTimeOut(us12.googlePlayLinkMusteriIliskileri,2);
    }
    @And("GC Kullanici GooglePlay sayfasina yonlendirildigini dogrular")
    public void gcKullaniciGooglePlaySayfasinaYonlendirildiginiDogrular() {
        //ReusableMethods.switchToWindow(1);
        Driver.getDriver().getCurrentUrl().contains("play.google.com/store/apps");
    }
    @When("GC Kullanici cevapta belirtilen mobil uygulamalardan AppStore a tiklar")
    public void gcKullaniciCevaptaBelirtilenMobilUygulamalardanAppStoreATiklar() {
        ReusableMethods.clickWithTimeOut(us12.appleStoreLinkMusteriIliskileri,2);
    }
    @And("GC Kullanici AppStore  sayfasina yonlendirildigini dogrular")
    public void gcKullaniciAppStoreSayfasinaYonlendirildiginiDogrular() {
        //ReusableMethods.switchToWindow(1);
        Driver.getDriver().getCurrentUrl().contains("apps.apple.com/ca/app/aras-kargo");
    }
    @When("GC Kullanici cevapta belirtilen mobil uygulamalardan AppGallery e tiklar")
    public void gcKullaniciCevaptaBelirtilenMobilUygulamalardanAppGalleryETiklar() {
        ReusableMethods.clickWithTimeOut(us12.appleGalleryLinkMusteriIliskileri,2);
    }
    @And("GC Kullanici AppGallery sayfasina yonlendirildigini dogrular")
    public void gcKullaniciAppGallerySayfasinaYonlendirildiginiDogrular() {
        //ReusableMethods.switchToWindow(1);
        Driver.getDriver().getCurrentUrl().contains("appgallery.huawei.com/app");
    }
}
