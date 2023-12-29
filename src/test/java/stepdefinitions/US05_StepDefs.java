package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US05;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.hover;
import static utilities.ReusableMethods.waitFor;

public class US05_StepDefs {

    US05 us05 = new US05();
    Actions actions=new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    SearchContext shadowRootElement;
    WebElement hiddenElement;

    @Given("Url'e gidilir.")
    public void url_e_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


    @Then("Acilan sayfada gelen bilgilendirme ekrani kapatilir.")
    public void acilan_sayfada_gelen_bilgilendirme_ekrani_kapatilir() {

        try {
            us05.popupCloseSG.click();
        } catch (Exception e) {
        }

        waitFor(1);
        try {
            shadowRootElement =
                    Driver.getDriver().findElement(By.cssSelector(".efilli-layout-default")).getShadowRoot();
            hiddenElement =
                    shadowRootElement.findElement(By.cssSelector(".banner__accept-button"));
//            shadowRootElement.findElement(By.cssSelector("banner__reject-button"));
            hiddenElement.click();
        } catch (Exception e) {
        }

    }


    @And("Sayfayi asagi kaydirarak Ucret Hesapla pop-up'inin goruldugu dogrulanir ve tiklanir.")
    public void sayfayiAsagiKaydirarakUcretHesaplaPopUpIninGorulduguDogrulanirVeTiklanir() {

        ReusableMethods.scrollIntoViewJS(us05.adresiDegistirSG);
        waitFor(1);
        Assert.assertTrue(us05.ucretHesaplaSG.isDisplayed());
        ReusableMethods.clickWithTimeOut(us05.ucretHesaplaSG,2);


    }


    @Then("Yurt ici pop-upinin acildigi dogrulanir.")
    public void yurtIciPopUpininAcildigiDogrulanir() {
        Assert.assertTrue(us05.yurticiPopupSG.isDisplayed());
    }


    @Then("Acilan pop-up'ta Yurt ici fiyatlarina ulasmak icin tiklayiniz butonunun goruldugu dogrulanir ve tiklanir.")
    public void acilanPopUpTaYurtIciFiyatlarinaUlasmakIcinTiklayinizButonununGorulduguDogrulanirVeTiklanir() {
        Assert.assertTrue(us05.yurticiFiyatListesiSG.isDisplayed());
        us05.yurticiFiyatListesiSG.click();
    }


    @Then("Standart Fiyat Listesi butonunun goruldugu dogrulanir ve tiklanir.")
    public void standartFiyatListesiButonununGorulduguDogrulanirVeTiklanir() {

        ReusableMethods.switchToWindow(1);
        Assert.assertTrue(us05.standartFiyatListesiSG.isDisplayed());
        us05.standartFiyatListesiSG.click();

    }


    @And("Yurt ici fiyat listesinin acildigi dogrulanir.")
    public void yurtIciFiyatListesininAcildigiDogrulanir() {
        ReusableMethods.switchToWindow(2);
        assert Driver.getDriver().getCurrentUrl().contains("aras-kargo-standart-fiyat-listesi-2023-ikinci-yari-yil.pdf");

    }
}

