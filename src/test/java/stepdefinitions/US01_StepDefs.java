package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US01;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getDriver;

public class US01_StepDefs {
    US01 us01 = new US01();

    @Given("MS Kullanici ana sayfaya  gider")
    public void kullaniciAnaSayfayaGider() {
        getDriver().get(ConfigReader.getProperty("aras_url"));
        ReusableMethods.waitFor(1);
        ReusableMethods.clickWithTimeOut(us01.popupCloseHome, 1);
    }


    @When("MS Ana sayfayi dogrular")
    public void msanaSayfayiDogrular() {
        assertTrue(getDriver().getCurrentUrl().contains("https://www.araskargo.com.tr/"));

    }

    @And("MS Hakkimizda butonuna tiklar")
    public void mshakkimizdaButonunaTiklar() {
        ReusableMethods.clickByJS(us01.hakkimizdaButon);


    }
    @When("MS Hizmetlerimiz butonuna tiklar")
    public void hizmetlerimiz_butonuna_tiklar() {
        ReusableMethods.clickByJS(us01.hizmetlerimizButon);
    }

    @When("MS Hizmetlerimiz sayfanin acildigini dogrular")
    public void hizmetlerimiz_sayfanin_acildigini_dogrular() {
        Assert.assertTrue(us01.hizmetlerimizText.isDisplayed());


    }

}
