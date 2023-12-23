package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.US02;
import pages.US10;
import utilities.Driver;
import utilities.ReusableMethods;

public class US10_StepDefs {
    US02 us02 =new US02(); US10 us10=new US10();
    Actions actions=new Actions(Driver.getDriver());
    @And("GC Kullanici Kariyer basligina gelir")
    public void gcKullaniciKariyerBasliginaGelir() throws InterruptedException {
        ReusableMethods.clickWithTimeOut(us02.popupCloseHome,3);
        actions.moveToElement(us10.kariyerLinkHome).perform();
    }
    @And("GC Kullanici Gelecegin Bizde Onem Tasir secenegine tiklar")
    public void gcKullaniciGeleceginBizdeOnemTasirSecenegineTiklar() {
        ReusableMethods.clickWithTimeOut(us10.geleceginBizdeOnemTasirSecenegiKariyerLinkHome,3);
    }
    @And("GC Kullanici Gelecegin Bizde Onem Tasir sayfasinda oldugunu dogrular")
    public void gcKullaniciGeleceginBizdeOnemTasirSayfasindaOldugunuDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("gelecegin-bizde-onem-tasir");
        // assert us10.geleceginBizdeOnemTasirTitleText.isDisplayed();
    }
    @Given("GC Kullanici Aras Kargo Is Basvurulari basligini goruntuler")
    public void gcKullaniciArasKargoIsBasvurulariBasliginiGoruntuler() {
        ReusableMethods.scrollIntoViewJS(us10.arasKargoIsBasvurulariTextGeleceginBizdeOnemTasir);
    }
    @When("GC Kullanici Aras Kargo Is Basvurulari  altinda aciklamayi goruntuler")
    public void gcKullaniciArasKargoIsBasvurulariAltindaAciklamayiGoruntuler() {
        assert us10.aciklamaYazisiTextArasKargoIsBasvurulari.isDisplayed();
    }
    @Then("GC Kullanici basvuru seceneklerinin altinda mail adresini goruntuler")
    public void gcKullaniciBasvuruSeceneklerininAltindaMailAdresiniGoruntuler() {
        assert us10.mailAdresiTextArasKargoIsBasvurulari.isDisplayed();
    }
    @And("GC Kullanici Linkedin butonuna tiklar")
    public void gcKullaniciLinkedinButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us10.linkedinLinkArasKargoIsBasvurulari,1);
    }
    @When("GC Kullanici Aras Kargo Linkedin sayfasinda oldugunu dogrular")
    public void gcKullaniciArasKargoLinkedinSayfasindaOldugunuDogrular() {
        ReusableMethods.switchToWindow(1);
        Driver.getDriver().getCurrentUrl().contains("linkedin.com/company/aras-kargo/jobs/");
    }
    @And("GC Kullanici kariyer.net butonuna tiklar")
    public void gcKullaniciKariyerNetButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us10.kariyernetLinkArasKargoIsBasvurulari,1);
    }
    @When("GC Kullanici Aras Kargo kariyer.net sayfasinda oldugunu dogrular")
    public void gcKullaniciArasKargoKariyerNetSayfasindaOldugunuDogrular() {
        ReusableMethods.switchToWindow(1);
        Driver.getDriver().getCurrentUrl().contains("kariyer.net/firma-profil/aras-kargo");
    }
    @And("GC Kullanici Secretcv butonuna tiklar")
    public void gcKullaniciSecretcvButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us10.secretcvLinkArasKargoIsBasvurulari,1);
    }
    @When("GC Kullanici Aras Kargo Secretcv  sayfasinda oldugunu dogrular")
    public void gcKullaniciArasKargoSecretcvSayfasindaOldugunuDogrular() {
        ReusableMethods.switchToWindow(1);
        Driver.getDriver().getCurrentUrl().contains("secretcv.com/firma/aras-kargo");
    }
    @And("GC Kullanici eleman.net butonuna tiklar")
    public void gcKullaniciElemanNetButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us10.elemannetLinkArasKargoIsBasvurulari,1);
    }
    @When("GC Kullanici Aras Kargo eleman.net  sayfasinda oldugunu dogrular")
    public void gcKullaniciArasKargoElemanNetSayfasindaOldugunuDogrular() {
        ReusableMethods.switchToWindow(1);
        Driver.getDriver().getCurrentUrl().contains("eleman.net/firma/aras-kargo");
    }
}
