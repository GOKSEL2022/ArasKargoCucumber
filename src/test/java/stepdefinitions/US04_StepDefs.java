package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import pages.US04;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.switchToWindow;
import static utilities.ReusableMethods.waitFor;

public class US04_StepDefs {

    US04 pages = new US04();

    SearchContext shadowRootElement;
    WebElement hiddenElement;

    //String expectedUrl="";
    @Given("SO Aras kargo web sitesine gidilir")
    public void so_aras_kargo_web_sitesine_gidilir() {

        Driver.getDriver().get(ConfigReader.getProperty("aras_url"));
        try {
            pages.popUpClose.click();
        }catch (Exception e){}

        waitFor(1);

        try {
            shadowRootElement =
                    Driver.getDriver().findElement(By.cssSelector(".efilli-layout-default")).getShadowRoot();
            hiddenElement =
                    shadowRootElement.findElement(By.cssSelector(".banner__accept-button"));
//            shadowRootElement.findElement(By.cssSelector("banner__reject-button"));
            hiddenElement.click();
        } catch (Exception ignored) {
        }
        //expectedUrl = Driver.getDriver().getCurrentUrl();
    }
    @When("Uye Girisi butonu tiklanir")
    public void uye_girisi_butonu_tiklanir() {

        pages.uyeGirisiButton.click();
        Driver.getDriver().get(ConfigReader.getProperty("uyelik_url"));

        //switchToWindow(1);
        ReusableMethods.wait(1);
    }
    @Then("Kullanici Adi, Sifre textboxlarinin goruntulendigi dogrulanir")
    public void kullanici_adi_sifre_textboxlarinin_goruntulendigi_dogrulanir() {
        //switchToWindow(1);
        ReusableMethods.wait(1);
        assertTrue("Kullanıcı Adı textbox is not visible", pages.userNameTextBox.isEnabled());
        assertTrue("Sifre Textbox is not visible", pages.passwordTextBox.isEnabled());
    }

    @Then("Guvenlik Kodu textboxinin goruntulendigi dogrulanir")
    public void guvenlik_kodu_textboxinin_goruntulendigi_dogrulanir(){
        assertTrue("Guvenlik Kodu Textbox is not visible", pages.securityKeyTextBox.isEnabled());
    }

    @Then("Giris Yap ve Sifremi Unuttum buttonlarinin goruntulendigi dogrulanir")
    public void giris_yap_ve_sifremi_unuttum_buttonlarinin_goruntulendigi_dogrulanir() {
        assertTrue("Giris Yap button is not visible", pages.girisYapButton.isDisplayed());
        assertTrue("Sifremi Unuttum button is not visible", pages.sifremiUnuttumButton.isDisplayed());
    }
    @Then("Sayfalari kapatir")
    public void sayfalari_kapatir() {
        Driver.quitDriver();
    }

}