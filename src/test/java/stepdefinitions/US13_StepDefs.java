package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import pages.US13;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.waitFor;

public class US13_StepDefs {

    US13 us13page = new US13();

    SearchContext shadowRootElement;

    WebElement hiddenElement;

    @Given("SO Kullanici aras kargo web sitesine gider")
    public void so_kullanici_aras_kargo_web_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("aras_url"));
        try {
            us13page.popUpClose.click();
        }catch (Exception e){}

        waitFor(1);

        try {
            shadowRootElement =
                    Driver.getDriver().findElement(By.cssSelector(".efilli-layout-default")).getShadowRoot();
            hiddenElement =
                    shadowRootElement.findElement(By.cssSelector(".banner__accept-button"));
            hiddenElement.click();
        } catch (Exception ignored) {
        }

    }
    @When("Kullanici sayfanin acildigini dogrular")
    public void kullanici_sayfanin_acildigini_dogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("araskargo");
    }
    @Then("Kullanici dashboard daki surdurulebilirlik kisminin goruldugunu dogrular")
    public void kullanici_dashboard_daki_surdurulebilirlik_kisminin_goruldugunu_dogrular() {
        ReusableMethods.wait(1);
        assertTrue("Sürdürülebilirlik textbox is not visible", us13page.surdurulebilirlikSekmesi.isEnabled());
    }
    @Then("Kullanici surdurulebilirlik butonuna tiklar")
    public void kullanici_surdurulebilirlik_butonuna_tiklar() {
       us13page.surdurulebilirlikSekmesi.click();
    }
    @Then("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.quitDriver();
    }

}
