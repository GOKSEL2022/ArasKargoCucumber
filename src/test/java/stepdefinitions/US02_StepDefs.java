package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.US02;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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
        ReusableMethods.clickWithTimeOut(us02.ambalajUrunlerimizHizmetlerimizLinkHome,3);
        actions.moveToElement(us02.hizmetlerimizLinkHome).perform();
        Thread.sleep(3000);
    }
    @When("GC Kullanici Ambalaj Urunlerimiz secenegine tiklar")
    public void kullanici_ambalaj_urunlerimiz_secenegine_tiklar() {
        ReusableMethods.clickWithTimeOut(us02.ambalajUrunlerimizHizmetlerimizLinkHome,3);

    }
    @When("GC Kullanici Ambalaj Urunlerimiz sayfasinda oldugunu dogrular")
    public void kullanici_ambalaj_urunlerimiz_sayfasinda_oldugunu_dogrular() {

    }
    @Then("GC Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {

    }

}