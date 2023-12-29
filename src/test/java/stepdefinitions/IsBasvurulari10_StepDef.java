package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.AmbalajUrunlerimiz02_page;
import pages.IsBasvurulari10_page;
import utilities.Driver;
import static utilities.ReusableMethods.*;
public class IsBasvurulari10_StepDef {
    AmbalajUrunlerimiz02_page ambalajUrunlerimiz02Page =new AmbalajUrunlerimiz02_page(); IsBasvurulari10_page isBasvurulari10Page =new IsBasvurulari10_page();
    Actions actions=new Actions(Driver.getDriver());
    @And("GC Kullanici Kariyer basligina gelir")
    public void gcKullaniciKariyerBasliginaGelir() throws InterruptedException {
        clickWithTimeOut(ambalajUrunlerimiz02Page.popupCloseHome,3);
        actions.moveToElement(isBasvurulari10Page.kariyerLinkHome).perform();
    }
    @And("GC Kullanici Gelecegin Bizde Onem Tasir secenegine tiklar")
    public void gcKullaniciGeleceginBizdeOnemTasirSecenegineTiklar() {
        clickWithTimeOut(isBasvurulari10Page.geleceginBizdeOnemTasirSecenegiKariyerLinkHome,3);
    }
    @And("GC Kullanici Gelecegin Bizde Onem Tasir sayfasinda oldugunu dogrular")
    public void gcKullaniciGeleceginBizdeOnemTasirSayfasindaOldugunuDogrular() {
        assert isBasvurulari10Page.geleceginBizdeOnemTasirTitleText.isDisplayed();
    }
    @Given("GC Kullanici Aras Kargo Is Basvurulari basligini goruntuler")
    public void gcKullaniciArasKargoIsBasvurulariBasliginiGoruntuler() {
        scrollIntoViewJS(isBasvurulari10Page.arasKargoIsBasvurulariTextGeleceginBizdeOnemTasir);
    }
    @When("GC Kullanici Aras Kargo Is Basvurulari  altinda aciklamayi goruntuler")
    public void gcKullaniciArasKargoIsBasvurulariAltindaAciklamayiGoruntuler() {
        assert isBasvurulari10Page.aciklamaYazisiTextArasKargoIsBasvurulari.isDisplayed();
    }
    @Then("GC Kullanici basvuru seceneklerinin altinda mail adresini goruntuler")
    public void gcKullaniciBasvuruSeceneklerininAltindaMailAdresiniGoruntuler() {
        assert isBasvurulari10Page.mailAdresiTextArasKargoIsBasvurulari.isDisplayed();
    }
    @And("GC Kullanici Linkedin butonuna tiklar")
    public void gcKullaniciLinkedinButonunaTiklar() {
        clickWithTimeOut(isBasvurulari10Page.linkedinLinkArasKargoIsBasvurulari,1);
    }
    @When("GC Kullanici Aras Kargo Linkedin sayfasinda oldugunu dogrular")
    public void gcKullaniciArasKargoLinkedinSayfasindaOldugunuDogrular() {
        switchToWindow(1);
        Driver.getDriver().getCurrentUrl().contains("linkedin.com/company/aras-kargo/jobs/");
    }
    @And("GC Kullanici kariyer.net butonuna tiklar")
    public void gcKullaniciKariyerNetButonunaTiklar() {
        clickWithTimeOut(isBasvurulari10Page.kariyernetLinkArasKargoIsBasvurulari,1);
    }
    @When("GC Kullanici Aras Kargo kariyer.net sayfasinda oldugunu dogrular")
    public void gcKullaniciArasKargoKariyerNetSayfasindaOldugunuDogrular() {
        switchToWindow(1);
        Driver.getDriver().getCurrentUrl().contains("kariyer.net/firma-profil/aras-kargo");
    }
    @And("GC Kullanici Secretcv butonuna tiklar")
    public void gcKullaniciSecretcvButonunaTiklar() {
        clickWithTimeOut(isBasvurulari10Page.secretcvLinkArasKargoIsBasvurulari,1);
    }
    @When("GC Kullanici Aras Kargo Secretcv  sayfasinda oldugunu dogrular")
    public void gcKullaniciArasKargoSecretcvSayfasindaOldugunuDogrular() {
        switchToWindow(1);
        Driver.getDriver().getCurrentUrl().contains("secretcv.com/firma/aras-kargo");
    }
    @And("GC Kullanici eleman.net butonuna tiklar")
    public void gcKullaniciElemanNetButonunaTiklar() {
        clickWithTimeOut(isBasvurulari10Page.elemannetLinkArasKargoIsBasvurulari,1);
    }
    @When("GC Kullanici Aras Kargo eleman.net  sayfasinda oldugunu dogrular")
    public void gcKullaniciArasKargoElemanNetSayfasindaOldugunuDogrular() {
        switchToWindow(1);
        Driver.getDriver().getCurrentUrl().contains("eleman.net/firma/aras-kargo");
    }
}
