package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US03;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


import java.util.List;
import java.util.Random;


public class US03_StepDefs {


    Actions actions = new Actions(Driver.getDriver());
    US03 pages = new US03();

    @Given("GL Web sitesine {string} gidilir")
    public void glWebSitesineGidilir(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("GL Ekrandaki uyarı yazısı kapatılır")
    public void glEkrandakiUyarıYazısıKapatılır() {
        pages.popUpCloseGL.click();

    }

    @Then("GL İş Ortağımız olun sekmesine tıklanır")
    public void glİşOrtağımızOlunSekmesineTıklanır() {
        ReusableMethods.hover(pages.isOrtagiGL);

    }

    @And("GL Acentemiz olun seceneğine tıklanır")
    public void glAcentemizOlunSeceneğineTıklanır() {
        pages.acentemizOlunGL.click();
    }

    @And("GL Hemen Başvur butonuna tıklanır")
    public void glHemenBaşvurButonunaTıklanır() {
        ReusableMethods.clickByJS(pages.hemenBasvurGL);

    }

    @And("GL Başvuru İli seçilir")
    public void glBaşvuruİliSeçilir() {

        ReusableMethods.clickByJS(pages.ilSecimi1);
        ReusableMethods.waitFor(2);
        List <WebElement> sehirlerListesi = pages.ilSecimi;
        Random rnd = new Random();
        int rndnumber= rnd.nextInt(sehirlerListesi.size());
        sehirlerListesi.get(rndnumber).click();


      //  ReusableMethods.clickByJS(pages.ilSecimiGL);   ---------
       // ReusableMethods.selectRandomTextFromDropdown();  -------


    }

    @And("GL Lokasyon ekle butonuna tıklanır")
    public void glLokasyonEkleButonunaTıklanır() {
       pages.locasyonEkle.click();
    }

    @And("GL İsim, Soyisim, Yaş, Telefon numarası, E-posta bilgileri girilir")
    public void glİsimSoyisimYaşTelefonNumarasıEPostaBilgileriGirilir() {
        pages.isimGir.sendKeys(ConfigReader.getProperty("isim"), Keys.TAB ,
                ConfigReader.getProperty("Soyisim"), Keys.TAB , ConfigReader.getProperty("Yaş"), Keys.TAB,
                ConfigReader.getProperty("Telefon"), Keys.TAB , ConfigReader.getProperty("Eposta"), Keys.TAB);

    }

    @And("GL Egitim durumu seçilir")
    public void glEgitimDurumuSeçilir() {
        Select select = new Select(pages.egitimDurumu);
        ReusableMethods.selectRandomTextFromDropdown(select);


    }

    @And("GL sayfa kapatılır")
    public void glSayfaKapatılır() {
    }

    @But("GL {int} saniye beklenir")
    public void glSaniyeBeklenir(int arg0) {
        try {
            Thread.sleep(1000 * 3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
