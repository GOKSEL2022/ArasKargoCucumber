package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US13;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class US13_StepDefs {

    SearchContext shadowRootElement;
    WebElement hiddenElement;
    Actions actions;
    List<WebElement> belgeIsimleriListesi;

    US13 us13 = new US13();
    @Given("SO Kullanici urle gider")
    public void so_kullanici_urle_gider() throws InterruptedException {
        navigateToUrl();
        closePopUp();
        closeCookies();
    }
    @When("SO Kullanici Surdurulebilirlik sekmesinden Kalite Yonetim Sistemini tiklar")
    public void so_kullanici_surdurulebilirlik_sekmesinden_kalite_yonetim_sistemini_tiklar() {
        hover(us13.surdurulebilirlikSekmesi);
        us13.kaliteYonetimSistemi.click();
    }
    @Then("SO Kullanici {int} tane Belge goruntulendigini dogrular")
    public void so_kullanici_tane_belge_goruntulendigini_dogrular(int belgeSayisi) {
        scrollIntoViewJS(us13.belgelerTitle);

        String text = "Number of Belgeler are not the same as expected number.";

        int obj = us13.belgelerIsimleriWEList.size();

        assertEquals(text, obj , belgeSayisi);
        actions=new Actions(Driver.getDriver());
        belgeIsimleriListesi = us13.belgelerIsimleriWEList;
        int count=0;
        for (int i = 0; i < belgeIsimleriListesi.size(); i++) {
            waitFor(1);
            belgeIsimleriListesi.get(i).click();
            count++;
            waitForVisibility(us13.belgeResimiWE,3);
            assertTrue(count + " Belge Pic is not displayed",us13.belgeResimiWE.isDisplayed());
            actions.sendKeys(Keys.ESCAPE).perform();
        }
        System.out.println(count + " tane belge resimleri ile kontrol edildi.");
    }
    @Then("SO Sayfayi kapatir")
    public void so_sayfayi_kapatir() {
        Driver.closeDriver();
    }


}
