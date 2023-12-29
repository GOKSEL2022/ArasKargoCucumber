package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US11;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.waitFor;
public class US11_StepDefs {


    US11 us11 = new US11();
    Actions actions = new Actions(Driver.getDriver());
    SearchContext shadowRootElement;
    WebElement hiddenElement;




    @Given("SG Url'e gidilir")
    public void sg_url_e_gidilir() { Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
    @When("SG Acilan sayfada gelen bilgilendirme ekrani kapatilir")
    public void sg_acilan_sayfada_gelen_bilgilendirme_ekrani_kapatilir() {

        try {
            us11.popupCloseeSG.click();
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


    @Then("SG Is Ortagimiz Olun butonunun goruldugu dogrulanir ve tiklanir")
    public void sg_is_ortagimiz_olun_butonunun_goruldugu_dogrulanir_ve_tiklanir() {
        Assert.assertTrue(us11.isOrtagimizOlunSG.isDisplayed());
        us11.isOrtagimizOlunSG.click();
        waitFor(2);

    }


    @Then("SG Acilan sayfada Sik Sorulan Sorular basliginin goruldugu dogrulanir")
    public void sg_acilan_sayfada_sik_sorulan_sorular_basliginin_goruldugu_dogrulanir() {
        Assert.assertTrue(us11.sikSorulanSorularSG.isDisplayed());
        ReusableMethods.scrollIntoViewJS(us11.acentemizOlunIlkSoruSG);

    }



   /* @Then("SG ACENTEMİZ OLUN basliginin goruldugu dogrulanir.")
    public void sg_acentemi̇z_olun_basliginin_goruldugu_dogrulanir() {
        ReusableMethods.scrollIntoViewJS(us11.acentemizOlunIlkSoruSG);
        Assert.assertTrue(us11.acentemizOlunButtonSG.isDisplayed());

        waitFor(1);
    }

    */
    @Then("SG Ilk sorunun ve cevabinin goruldugu Dogrulanir.")
    public void sg_ilk_sorunun_ve_cevabinin_goruldugu_dogrulanir() {
        //Assert.assertTrue(us11.acentemizOlunIlkSoruSG.isDisplayed());
        ReusableMethods.clickWithTimeOut(us11.acentemizOlunIlkSoruSG, 1);
        Assert.assertTrue(us11.acentemizOlunIlkCevapSG.isDisplayed());
    }
    @Then("SG Ikinci sorunun ve cevabinin goruldugu dogrulanirr.")
    public void sg_ikinci_sorunun_ve_cevabinin_goruldugu_dogrulanirr() {

        waitFor(1);
        ReusableMethods.scrollIntoViewJS(us11.acentemizOlunButtonSG);
        us11.acentemizOlunIkinciSoruSG.click();
        Assert.assertTrue(us11.acentemizOlunIkinciCevapSG.isDisplayed());

    }



    @Then("ARAS BURASI NOKTASI OLUN Basliginin gorulldugu dogrulanir.")
    public void arasBURASINOKTASIOLUNBasligininGorullduguDogrulanir() {

        ReusableMethods.scrollIntoViewJS(us11.arasBurasiNoktasiOlunButtonSG);
        Assert.assertTrue(us11.arasBurasiNoktasiOlunButtonSG.isDisplayed());
        us11.arasBurasiNoktasiOlunButtonSG.click();

    }


    @Then("Ilk sorunun ve cevabinin gorulldugu Dogrulanir.")
    public void ılkSorununVeCevabininGorullduguDogrulanir() {

        ReusableMethods.scrollIntoViewJS(us11.arasBurasiNoktasiOlunButtonSG);

        Assert.assertTrue(us11.arasBurasiNoktasiOlunButtonSG.isDisplayed());
        us11.arasBurasiNoktasiOlunIlkSoruSG.click();
        Assert.assertTrue(us11.arasBurasiNoktasiOlunIlkCevapSG.isDisplayed());
        waitFor(2);
    }

    @And("Ikinci sorunun ve cevabinin gorulldugu dogrulanirr.")
    public void ıkinciSorununVeCevabininGorullduguDogrulanirr() {

        ReusableMethods.scrollIntoViewJS(us11.arasBurasiNoktasiOlunButtonSG);

        us11.arasBurasiNoktasiOlunIkinciSoruSG.click();
        Assert.assertTrue(us11.arasBurasiNoktasiOlunIkinciCevapSG.isDisplayed());

    }


    @Then("SG ESNAF KURYE OLUN basliginin gorulldugu dogrulanir")
    public void sg_esnaf_kurye_olun_basliginin_gorulldugu_dogrulanir() {

        ReusableMethods.scrollIntoViewJS(us11.esnafKuryeOlunOlunButtonSG);

        Assert.assertTrue(us11.esnafKuryeOlunOlunButtonSG.isDisplayed());

    }
    @Then("SG Ilk sorunun ve cevabinin gorulldugu dogrulanir")
    public void sg_ilk_sorunun_ve_cevabinin_gorulldugu_dogrulanir() {
        waitFor(3);
        us11.esnafKuryeOlunOlunIlkSoruSG.click();
        Assert.assertTrue(us11.esnafKuryeOlunOlunIlkCevapSG.isDisplayed());

    }
    @Then("SG Ikinci sorunun ve cevabinin gorulldugu dogrulanir")
    public void sg_ikinci_sorunun_ve_cevabinin_gorulldugu_dogrulanir() {


        us11.esnafKuryeOlunOlunIkinciSoruSG.click();
        Assert.assertTrue(us11.esnafKuryeOlunOlunIkinciCevapSG.isDisplayed());

    }



    @Then("SG ARACINIZI KIRALAYIN basliginiin goruldugu dogrulanir.")
    public void sg_aracinizi_kiralayin_basliginiin_goruldugu_dogrulanir() {
        Assert.assertTrue(us11.araciniziKiralayinButtonSG.isDisplayed());
    }
    @Then("SG Ilk sorunun ve cevabinin goruuldugu dogrulanir.")
    public void sg_ilk_sorunun_ve_cevabinin_goruuldugu_dogrulanir() {

        waitFor(3);
        us11.araciniziKiralayinIlkSoruSG.click();
        Assert.assertTrue(us11.araciniziKiralayinIlkCevapSG.isDisplayed());

    }
    @Then("SG Ikinci sorunun ve cevabinin goruuldugu dogrulanir.")
    public void sg_ikinci_sorunun_ve_cevabinin_goruuldugu_dogrulanir() {

        us11.araciniziKiralayinIkinciSoruSG.click();
        Assert.assertTrue(us11.araciniziKiralayinIkinciCevapSG.isDisplayed());


    }

}




