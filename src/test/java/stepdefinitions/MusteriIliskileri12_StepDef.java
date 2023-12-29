package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.AmbalajUrunlerimiz02_page;
import pages.MusteriIliskileri12_page;
import utilities.Driver;
import static utilities.ReusableMethods.clickWithTimeOut;
import static utilities.ReusableMethods.scrollIntoViewJS;
public class MusteriIliskileri12_StepDef {
    MusteriIliskileri12_page musteriIliskileri12Page =new MusteriIliskileri12_page();  AmbalajUrunlerimiz02_page ambalajUrunlerimiz02Page =new AmbalajUrunlerimiz02_page();
    Actions actions=new Actions(Driver.getDriver());
    @And("GC Kullanici Musteri Iliskileri basligina gelir")
    public void gcKullaniciMusteriIliskileriBasliginaGelir() throws InterruptedException {
        clickWithTimeOut(ambalajUrunlerimiz02Page.popupCloseHome,3);
        actions.moveToElement(musteriIliskileri12Page.musteriIliskileriLinkHome).perform();
    }
    @And("GC Kullanici SSS secenegine tiklar")
    public void gcKullaniciSSSSecenegineTiklar() {
        clickWithTimeOut(musteriIliskileri12Page.sssSecenegiMusteriIliskileriLinkHome,3);
    }
    @When("GC Kullanici Sik Sorulan Sorular sayfasinda oldugunu dogrular")
    public void gcKullaniciSikSorulanSorularSayfasindaOldugunuDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("musteri-iliskileri/sss");
    }
    @Given("GC Kullanici sayfadaki ilk soruyu goruntuler")
    public void gcKullaniciSayfadakiIlkSoruyuGoruntuler() {
        assert musteriIliskileri12Page.ilkSoruSikSorulanSorularMusteriIliskileri.isDisplayed();
    }
    @When("GC Kullanici sayfadaki son soruyu goruntuler")
    public void gcKullaniciSayfadakiSonSoruyuGoruntuler() {
        scrollIntoViewJS(musteriIliskileri12Page.sonSoruSikSorulanSorularMusteriIliskileri);
    }
    @Given("GC Kullanici sayfadaki ilk soruya tiklar")
    public void gcKullaniciSayfadakiIlkSoruyaTiklar() {
        clickWithTimeOut(musteriIliskileri12Page.ilkSoruSikSorulanSorularMusteriIliskileri,2);
    }
    @When("GC Kullanici ilk soru ile ilk cevabin ilgili oldugunu dogrular")
    public void gcKullaniciIlkSoruIleIlkCevabinIlgiliOldugunuDogrular() {
        musteriIliskileri12Page.ilkCevapSikSorulanSorularMusteriIliskileri.getText().contains(musteriIliskileri12Page.ilkCevapSikSorulanSorularMusteriIliskileri.getText());
    }
    @And("GC Kullanici sayfadaki ikinci soruya tiklar")
    public void gcKullaniciSayfadakiIkinciSoruyaTiklar() {
        clickWithTimeOut(musteriIliskileri12Page.ikinciSoruSikSorulanSorularMusteriIliskileri,2);
    }
    @And("GC Kullanici ikinci soru ile ikinci cevabin ilgili oldugunu dogrular")
    public void gcKullaniciIkinciSoruIleIkinciCevabinIlgiliOldugunuDogrular() {
        musteriIliskileri12Page.ikinciCevapSikSorulanSorularMusteriIliskileri.getText().contains(musteriIliskileri12Page.ikinciSoruSikSorulanSorularMusteriIliskileri.getText());
    }
    @And("GC Kullanici son soruyu tiklar")
    public void gcKullaniciSonSoruyuTiklar() {
        scrollIntoViewJS(musteriIliskileri12Page.sonSoruSikSorulanSorularMusteriIliskileri);
        clickWithTimeOut(musteriIliskileri12Page.sonSoruSikSorulanSorularMusteriIliskileri,2);
    }
    @When("GC Kullanici son soru ile son cevabin ilgili oldugunu dogrular")
    public void gcKullaniciSonSoruIleSonCevabinIlgiliOldugunuDogrular() {
        musteriIliskileri12Page.sonCevapSikSorulanSorularMusteriIliskileri.getText().contains(musteriIliskileri12Page.sonSoruSikSorulanSorularMusteriIliskileri.getText());
    }
    @When("GC Kullanici cevapta belirtilen mobil uygulamalardan GooglePlay e tiklar")
    public void gcKullaniciCevaptaBelirtilenMobilUygulamalardanGooglePlayETiklar() {
        clickWithTimeOut(musteriIliskileri12Page.googlePlayLinkMusteriIliskileri,2);
    }
    @And("GC Kullanici GooglePlay sayfasina yonlendirildigini dogrular")
    public void gcKullaniciGooglePlaySayfasinaYonlendirildiginiDogrular() {
        Driver.getDriver().getCurrentUrl().contains("play.google.com/store/apps");
    }
    @When("GC Kullanici cevapta belirtilen mobil uygulamalardan AppStore a tiklar")
    public void gcKullaniciCevaptaBelirtilenMobilUygulamalardanAppStoreATiklar() {
        clickWithTimeOut(musteriIliskileri12Page.appleStoreLinkMusteriIliskileri,2);
    }
    @And("GC Kullanici AppStore  sayfasina yonlendirildigini dogrular")
    public void gcKullaniciAppStoreSayfasinaYonlendirildiginiDogrular() {
        Driver.getDriver().getCurrentUrl().contains("apps.apple.com/ca/app/aras-kargo");
    }
    @When("GC Kullanici cevapta belirtilen mobil uygulamalardan AppGallery e tiklar")
    public void gcKullaniciCevaptaBelirtilenMobilUygulamalardanAppGalleryETiklar() {
        clickWithTimeOut(musteriIliskileri12Page.appleGalleryLinkMusteriIliskileri,2);
    }
    @And("GC Kullanici AppGallery sayfasina yonlendirildigini dogrular")
    public void gcKullaniciAppGallerySayfasinaYonlendirildiginiDogrular() {
        Driver.getDriver().getCurrentUrl().contains("appgallery.huawei.com/app");
    }
}
