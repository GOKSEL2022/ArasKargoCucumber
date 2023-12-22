package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.US01;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class US01_StepDefs {
    US01 us01 = new US01();
    Actions actions = new Actions(Driver.getDriver());

    @Given("MS Kullanici ana sayfaya  gider")
    public void kullaniciAnaSayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("aras_url"));
        ReusableMethods.waitFor(1);
        ReusableMethods.clickWithTimeOut(us01.popupCloseHome, 1);
    }


    @When("MS Ana sayfayi dogrular")
    public void msanaSayfayiDogrular() {
        assertTrue(Driver.getDriver().getCurrentUrl().contains("https://www.araskargo.com.tr/"));

    }

    @And("MS Hakkimizda butonuna tiklar")
    public void mshakkimizdaButonunaTiklar() {
        ReusableMethods.clickByJS(us01.hakkimizdaButon);
    }
    @When("MS Hizmetlerimiz butonuna tiklar")
    public void hizmetlerimiz_butonuna_tiklar() {
        ReusableMethods.clickByJS(us01.hizmetlerimizButon);
    }

    @And("MS Hakkimizda sayfanin acildigini dogrular")
    public void msHakkimizdaSayfaninAcildiginiDogrular() {
        Assert.assertTrue(us01.hakkimizdaButon.isDisplayed());
    }

    @And("MS Hizmetlerimiz sayfanin acildigini dogrular")
    public void msHizmetlerimizSayfaninAcildiginiDogrular() {
        Assert.assertTrue(us01.hizmetlerimizText.isDisplayed());
    }

    @And("MS Kariyer butonuna tiklar")
    public void msKariyerButonunaTiklar() {
        actions.moveToElement(us01.kariyerButon).perform();
        us01.kariyerButon.click();
    }

    @And("MS Kariyer sayfanin acildigini dogrular")
    public void msKariyerSayfaninAcildiginiDogrular() {
        Assert.assertTrue(us01.kariyerText.isDisplayed());
    }

    @And("MS isOrtagimizOlun butonuna tiklar")
    public void msIsOrtagimizOlunButonunaTiklar() {
    }

    @And("MS isOrtagimizOlun sayfanin acildigini dogrular")
    public void msIsOrtagimizOlunSayfaninAcildiginiDogrular() {
    }

    @And("MS Musteriliskileri butonuna tiklar")
    public void msMusteriliskileriButonunaTiklar() {
    }

    @And("MS Musteriliskileri sayfanin acildigini dogrular")
    public void msMusteriliskileriSayfaninAcildiginiDogrular() {
    }

    @And("MS ArasKargoSporKulubu butonuna tiklar")
    public void msArasKargoSporKulubuButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.arasKargaSporKulbuButon, 2);


    }

    @And("MS ArasKargoSporKulubu sayfanin acildigini dogrular")
    public void msArasKargoSporKulubuSayfaninAcildiginiDogrular() {
        Assert.assertEquals("https://www.araskargo.com.tr/aras-kargo-spor-kulubu", Driver.getDriver().getCurrentUrl());
    }


    @And("MS BizeUlasin sayfanin acildigini dogrular")
    public void msBizeUlasinSayfaninAcildiginiDogrular() {
        Assert.assertEquals("https://www.araskargo.com.tr/genel-mudurluk", Driver.getDriver().getCurrentUrl());
    }

    @And("MS BizeUlasin butonuna tiklar")
    public void msBizeUlasinButonunaTiklar() {
        ReusableMethods.clickWithTimeOut(us01.bizeUlasinButon, 2);

    }

    @And("MS Hakkimizda butonunun ustune gelir")
    public void msHakkimizdaButonununUstuneGelir() {
    }

    @And("MS Acilan Drapdawn menude Vizyon Misyon Politikalar butonuna tiklar")
    public void msAcilanDrapdawnMenudeVizyonMisyonPolitikalarButonunaTiklar() {
    }

    @And("MS VizyonMisyonPolitikalar sayfanin acildigini dogrular")
    public void msVizyonMisyonPolitikalarSayfaninAcildiginiDogrular() {
    }

    @And("MS Acilan Drapdawn menude YonetimEkibimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeYonetimEkibimizButonunaTiklar() {
    }

    @And("MS YonetimEkibimiz sayfanin acildigini dogrular")
    public void msYonetimEkibimizSayfaninAcildiginiDogrular() {
    }

    @And("MS Acilan Drapdawn menude HaberDuyurular butonuna tiklar")
    public void msAcilanDrapdawnMenudeHaberDuyurularButonunaTiklar() {
    }

    @And("MS HaberDuyurular sayfanin acildigini dogrular")
    public void msHaberDuyurularSayfaninAcildiginiDogrular() {
    }

    @And("MS Acilan Drapdawn menude Reklamlarimiz butonuna tiklar")
    public void msAcilanDrapdawnMenudeReklamlarimizButonunaTiklar() {
    }

    @And("MS Reklamlarimiz sayfanin acildigini dogrular")
    public void msReklamlarimizSayfaninAcildiginiDogrular() {
    }
}


