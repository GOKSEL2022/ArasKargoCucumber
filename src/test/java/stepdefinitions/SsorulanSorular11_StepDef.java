package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.SsorulanSorular11_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.waitFor;
public class SsorulanSorular11_StepDef {


    SsorulanSorular11_page ssorulanSorular11Page = new SsorulanSorular11_page();
    Actions actions = new Actions(Driver.getDriver());
    SearchContext shadowRootElement;
    WebElement hiddenElement;




    @Given("SG Url'e gidilir")
    public void sg_url_e_gidilir() { Driver.getDriver().get(ConfigReader.getProperty("url"));

    }
    @When("SG Acilan sayfada gelen bilgilendirme ekrani kapatilir")
    public void sg_acilan_sayfada_gelen_bilgilendirme_ekrani_kapatilir() {

        try {
            ssorulanSorular11Page.popupCloseeSG.click();
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
        Assert.assertTrue(ssorulanSorular11Page.isOrtagimizOlunSG.isDisplayed());
        ssorulanSorular11Page.isOrtagimizOlunSG.click();
        waitFor(2);

    }


    @Then("SG Acilan sayfada Sik Sorulan Sorular basliginin goruldugu dogrulanir")
    public void sg_acilan_sayfada_sik_sorulan_sorular_basliginin_goruldugu_dogrulanir() {
        Assert.assertTrue(ssorulanSorular11Page.sikSorulanSorularSG.isDisplayed());
        ReusableMethods.scrollIntoViewJS(ssorulanSorular11Page.acentemizOlunIlkSoruSG);

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
        ReusableMethods.clickWithTimeOut(ssorulanSorular11Page.acentemizOlunIlkSoruSG, 1);
        Assert.assertTrue(ssorulanSorular11Page.acentemizOlunIlkCevapSG.isDisplayed());
    }
    @Then("SG Ikinci sorunun ve cevabinin goruldugu dogrulanirr.")
    public void sg_ikinci_sorunun_ve_cevabinin_goruldugu_dogrulanirr() {

        waitFor(1);
        ReusableMethods.scrollIntoViewJS(ssorulanSorular11Page.acentemizOlunButtonSG);
        ssorulanSorular11Page.acentemizOlunIkinciSoruSG.click();
        Assert.assertTrue(ssorulanSorular11Page.acentemizOlunIkinciCevapSG.isDisplayed());

    }



    @Then("ARAS BURASI NOKTASI OLUN Basliginin gorulldugu dogrulanir.")
    public void arasBURASINOKTASIOLUNBasligininGorullduguDogrulanir() {

        ReusableMethods.scrollIntoViewJS(ssorulanSorular11Page.arasBurasiNoktasiOlunButtonSG);
        Assert.assertTrue(ssorulanSorular11Page.arasBurasiNoktasiOlunButtonSG.isDisplayed());
        ssorulanSorular11Page.arasBurasiNoktasiOlunButtonSG.click();

    }


    @Then("Ilk sorunun ve cevabinin gorulldugu Dogrulanir.")
    public void ılkSorununVeCevabininGorullduguDogrulanir() {

        ReusableMethods.scrollIntoViewJS(ssorulanSorular11Page.arasBurasiNoktasiOlunButtonSG);

        Assert.assertTrue(ssorulanSorular11Page.arasBurasiNoktasiOlunButtonSG.isDisplayed());
        ssorulanSorular11Page.arasBurasiNoktasiOlunIlkSoruSG.click();
        Assert.assertTrue(ssorulanSorular11Page.arasBurasiNoktasiOlunIlkCevapSG.isDisplayed());
        waitFor(2);
    }

    @And("Ikinci sorunun ve cevabinin gorulldugu dogrulanirr.")
    public void ıkinciSorununVeCevabininGorullduguDogrulanirr() {

        ReusableMethods.scrollIntoViewJS(ssorulanSorular11Page.arasBurasiNoktasiOlunButtonSG);

        ssorulanSorular11Page.arasBurasiNoktasiOlunIkinciSoruSG.click();
        Assert.assertTrue(ssorulanSorular11Page.arasBurasiNoktasiOlunIkinciCevapSG.isDisplayed());

    }


    @Then("SG ESNAF KURYE OLUN basliginin gorulldugu dogrulanir")
    public void sg_esnaf_kurye_olun_basliginin_gorulldugu_dogrulanir() {

        ReusableMethods.scrollIntoViewJS(ssorulanSorular11Page.esnafKuryeOlunOlunButtonSG);

        Assert.assertTrue(ssorulanSorular11Page.esnafKuryeOlunOlunButtonSG.isDisplayed());

    }
    @Then("SG Ilk sorunun ve cevabinin gorulldugu dogrulanir")
    public void sg_ilk_sorunun_ve_cevabinin_gorulldugu_dogrulanir() {
        waitFor(3);
        ssorulanSorular11Page.esnafKuryeOlunOlunIlkSoruSG.click();
        Assert.assertTrue(ssorulanSorular11Page.esnafKuryeOlunOlunIlkCevapSG.isDisplayed());

    }
    @Then("SG Ikinci sorunun ve cevabinin gorulldugu dogrulanir")
    public void sg_ikinci_sorunun_ve_cevabinin_gorulldugu_dogrulanir() {


        ssorulanSorular11Page.esnafKuryeOlunOlunIkinciSoruSG.click();
        Assert.assertTrue(ssorulanSorular11Page.esnafKuryeOlunOlunIkinciCevapSG.isDisplayed());

    }



    @Then("SG ARACINIZI KIRALAYIN basliginiin goruldugu dogrulanir.")
    public void sg_aracinizi_kiralayin_basliginiin_goruldugu_dogrulanir() {
        Assert.assertTrue(ssorulanSorular11Page.araciniziKiralayinButtonSG.isDisplayed());
    }
    @Then("SG Ilk sorunun ve cevabinin goruuldugu dogrulanir.")
    public void sg_ilk_sorunun_ve_cevabinin_goruuldugu_dogrulanir() {

        waitFor(3);
        ssorulanSorular11Page.araciniziKiralayinIlkSoruSG.click();
        Assert.assertTrue(ssorulanSorular11Page.araciniziKiralayinIlkCevapSG.isDisplayed());

    }
    @Then("SG Ikinci sorunun ve cevabinin goruuldugu dogrulanir.")
    public void sg_ikinci_sorunun_ve_cevabinin_goruuldugu_dogrulanir() {

        ssorulanSorular11Page.araciniziKiralayinIkinciSoruSG.click();
        Assert.assertTrue(ssorulanSorular11Page.araciniziKiralayinIkinciCevapSG.isDisplayed());


    }

}




