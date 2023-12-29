package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import utilities.*;
import pages.ChatBot09_page;
import java.util.Random;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;


public class ChatBot09_StepDef {

    ChatBot09_page chatBot09Page = new ChatBot09_page();
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
        chatBot09Page.chatBot.click();
    }

    @When("AA Acilan pencereden Devam butonuna tiklar")
    public void aaAcilanPenceredenDevamButonunaTiklar() {
        switchToWindow(1);
        Driver.getDriver().manage().window().maximize();
        chatBot09Page.devamButton.click();

    }

    @And("AA Valid random ad soyad bilgilerini girer ve gonder butonuna tiklar")
    public void aaValidRandomAdSoyadBilgileriniGirerVeGonderButonunaTiklar() {
        faker = new Faker();
        chatBot09Page.adSoyadTextBox.sendKeys(faker.name().fullName());
        chatBot09Page.gonderButton.click();
    }

    @And("AA Valid random telefon numarası girer ve gonder butonuna tiklar")
    public void aaValidRandomTelefonNumarasıGirerVeGonderButonunaTiklar() {
        rnd = new Random();
        randomPhoneNo = String.valueOf(268)
                + (rnd.nextInt(999 - 100) + 100)
                + (rnd.nextInt(9999 - 1000) + 1000);
        chatBot09Page.telNoTextBox.sendKeys(randomPhoneNo);
        chatBot09Page.gonderButton.click();

    }

    @And("AA Random valid mail adresi bilgisini girer ve gonder butonuna tiklar")
    public void aaRandomValidMailAdresiBilgisiniGirerVeGonderButonunaTiklar() {
        mail = faker.internet().emailAddress();
        chatBot09Page.mailAdresiTextBox.sendKeys(mail);
        chatBot09Page.gonderButton.click();

    }

    @And("AA Kullanici random islem numarasi girer")
    public void aaKullaniciRandomIslemNumarasiGirer() {
//        int randomNumber = rand.nextInt(10) + 1;  ->1 to 10
        rnd = new Random();
        randomIslemNo = String.valueOf(rnd.nextInt(chatBot09Page.islemMetniList.size()) + 1);
        chatBot09Page.islemNoTextBox.sendKeys(randomIslemNo);
        chatBot09Page.gonderButton.click();
    }

    @Then("AA Ilgili soruya yönlendirildigini dogrular")
    public void aaIlgiliSoruyaYönlendirildiginiDogrular() {
        assertTrue("It is not the correct menu", chatBot09Page.ilgiliMenuNoText.isDisplayed());
    }

    @And("AA Sayfalari kapatir")
    public void aaSayfalariKapatir() {
        Driver.quitDriver();
    }

    @And("AA Kullanici {string} girer")
    public void aaKullaniciGirer(String invalidIsim) {
        chatBot09Page.adSoyadTextBox.sendKeys(invalidIsim);
        chatBot09Page.gonderButton.click();
    }

    @Then("AA Uyarı mesajini dogrular")
    public void aaUyarıMesajiniDogrular() {
        assertTrue("Error message is not displayed", chatBot09Page.hataMesajiText.isDisplayed());
        waitFor(2);
    }


    @And("AA Kullanici invalid {string} girer")
    public void aaKullaniciInvalidGirer(String invalidTelNo) {
        chatBot09Page.telNoTextBox.sendKeys(invalidTelNo);
        chatBot09Page.gonderButton.click();
    }

    @And("AA Kullanici {string} girer ve gonderir")
    public void aaKullaniciGirerVeGonderir(String invalidMail) {
        chatBot09Page.mailAdresiTextBox.sendKeys(invalidMail);
        chatBot09Page.gonderButton.click();

    }


    @And("AA Isleme devam eder gonder tusuna basar")
    public void aaIslemeDevamEderGonderTusunaBasar() {
        chatBot09Page.islemDevamTextBox.sendKeys("1");
        chatBot09Page.gonderButton.click();
    }

    @And("AA Kullanici Cikis yazar ve gondere basar")
    public void aaKullaniciCikisYazarVeGondereBasar() {
        chatBot09Page.textBox.sendKeys("Çıkış");
        chatBot09Page.gonderButton.click();
    }

    @Then("AA Ilgili mesaji dogrular")
    public void aaIlgiliMesajiDogrular() {
        assertTrue(chatBot09Page.tesekkurMesajiText.getText().contains("teşekkür"));

    }
}


