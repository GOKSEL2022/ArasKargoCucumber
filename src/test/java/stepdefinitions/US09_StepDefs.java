package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import utilities.*;
import pages.US09;
import java.util.Random;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;


public class US09_StepDefs {

    US09 us09 = new US09();
    Faker faker;
    Random rnd;
    String randomPhoneNo, mail, randomIslemNo;

    @Given("AA Kullanıcı Urle gider")
    public void aaKullanıcıUrleGider() {
        navigateToUrl();
        closePopUp();
        closeCookies();
    }

    @And("AA Anasayfada Size Nasıl Yardimci olabilirim PopUpa tiklar")
    public void aaAnasayfadaSizeNasılYardimciOlabilirimPopUpaTiklar() {
        us09.chatBot.click();
    }

    @When("AA Acilan pencereden Devam butonuna tiklar")
    public void aaAcilanPenceredenDevamButonunaTiklar() {
        switchToWindow(1);
        Driver.getDriver().manage().window().maximize();
        us09.devamButton.click();

    }

    @And("AA Valid random ad soyad bilgilerini girer ve gonder butonuna tiklar")
    public void aaValidRandomAdSoyadBilgileriniGirerVeGonderButonunaTiklar() {
        faker = new Faker();
        us09.adSoyadTextBox.sendKeys(faker.name().fullName());
        us09.gonderButton.click();
    }

    @And("AA Valid random telefon numarası girer ve gonder butonuna tiklar")
    public void aaValidRandomTelefonNumarasıGirerVeGonderButonunaTiklar() {
        rnd = new Random();
        randomPhoneNo = String.valueOf(268)
                + (rnd.nextInt(999 - 100) + 100)
                + (rnd.nextInt(9999 - 1000) + 1000);
        us09.telNoTextBox.sendKeys(randomPhoneNo);
        us09.gonderButton.click();

    }

    @And("AA Random valid mail adresi bilgisini girer ve gonder butonuna tiklar")
    public void aaRandomValidMailAdresiBilgisiniGirerVeGonderButonunaTiklar() {
        mail = faker.internet().emailAddress();
        us09.mailAdresiTextBox.sendKeys(mail);
        us09.gonderButton.click();

    }

    @And("AA Kullanici random islem numarasi girer")
    public void aaKullaniciRandomIslemNumarasiGirer() {
//        int randomNumber = rand.nextInt(10) + 1;  ->1 to 10
        rnd = new Random();
        randomIslemNo = String.valueOf(rnd.nextInt(us09.islemMetniList.size()) + 1);
        us09.islemNoTextBox.sendKeys(randomIslemNo);
        us09.gonderButton.click();
    }

    @Then("AA Ilgili soruya yönlendirildigini dogrular")
    public void aaIlgiliSoruyaYönlendirildiginiDogrular() {
        assertTrue("It is not the correct menu", us09.ilgiliMenuNoText.isDisplayed());
    }

    @And("AA Sayfalari kapatir")
    public void aaSayfalariKapatir() {
        Driver.quitDriver();
    }

    @And("AA Kullanici {string} girer")
    public void aaKullaniciGirer(String invalidIsim) {
        us09.adSoyadTextBox.sendKeys(invalidIsim);
        us09.gonderButton.click();
    }

    @Then("AA Uyarı mesajini dogrular")
    public void aaUyarıMesajiniDogrular() {
        assertTrue("Error message is not displayed", us09.hataMesajiText.isDisplayed());
        waitFor(2);
    }


    @And("AA Kullanici invalid {string} girer")
    public void aaKullaniciInvalidGirer(String invalidTelNo) {
        us09.telNoTextBox.sendKeys(invalidTelNo);
        us09.gonderButton.click();
    }

    @And("AA Kullanici {string} girer ve gonderir")
    public void aaKullaniciGirerVeGonderir(String invalidMail) {
        us09.mailAdresiTextBox.sendKeys(invalidMail);
        us09.gonderButton.click();

    }


    @And("AA Isleme devam eder gonder tusuna basar")
    public void aaIslemeDevamEderGonderTusunaBasar() {
        us09.islemDevamTextBox.sendKeys("1");
        us09.gonderButton.click();
    }

    @And("AA Kullanici Cikis yazar ve gondere basar")
    public void aaKullaniciCikisYazarVeGondereBasar() {
        us09.textBox.sendKeys("Çıkış");
        us09.gonderButton.click();
    }

    @Then("AA Ilgili mesaji dogrular")
    public void aaIlgiliMesajiDogrular() {
        assertTrue(us09.tesekkurMesajiText.getText().contains("teşekkür"));

    }
}


