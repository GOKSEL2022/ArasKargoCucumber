package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.US06_pages;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.clickByJS;
import static utilities.ReusableMethods.waitForVisibility;

public class US06_stepDefs {

    US06_pages uS06page = new US06_pages();
    SearchContext shadowRootElement;
    WebElement hiddenElement;
    Actions actions;
    int rndNumber, commaIndex, itemTotalPrice;
    List<WebElement> ulkelerListesi;
    Random rnd;
    String totalPriceStr;

    @Given("AA Kullanıcı belirtilen Urle gider")
    public void aaKullanıcıBelirtilenUrleGider() throws InterruptedException {
//        uS06page = new US06_pages();
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        try {
            uS06page.popUpClose.click();
        } catch (Exception e) {

        }
        Thread.sleep(2000);
        try {
            shadowRootElement =
                    Driver.getDriver().findElement(By.cssSelector(".efilli-layout-default")).getShadowRoot();
            hiddenElement =
                    shadowRootElement.findElement(By.cssSelector(".banner__accept-button"));
//            shadowRootElement.findElement(By.cssSelector("banner__reject-button"));
            hiddenElement.click();
        } catch (Exception e) {
        }
        Thread.sleep(2000);
    }

    @When("AA Kullanıcı anasayfada Ucret Hesapla butonunu tiklar")
    public void aaKullanıcıAnasayfadaUcretHesaplaButonunuTiklar() {
//        uS06page = new US06_pages();
        clickByJS(uS06page.ucretHesaplaButonu);

    }

    @And("AA Acilan sayfada Yurt Disi secer")
    public void aaAcilanSayfadaYurtDisiSecer() {
//        uS06page = new US06_pages();
        uS06page.yurtDisiButton.click();
    }

    @And("AA Random bir ulke secer")
    public void aaRandomBirUlkeSecer() throws InterruptedException {
//        uS06page = new US06_pages();
        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        Thread.sleep(1000);

        try {
            ulkelerListesi = uS06page.ulkeIsimleri_List;
            rnd = new Random();
            rndNumber = rnd.nextInt(1, ulkelerListesi.size() + 1);
            ulkelerListesi.get(rndNumber).click();
        } catch (Exception e) {
            uS06page.nereyeTextBox.sendKeys("a");
            ulkelerListesi = uS06page.ulkeIsimleri_List;
            rnd = new Random();
            rndNumber = rnd.nextInt(1, ulkelerListesi.size() + 1);
            ulkelerListesi.get(rndNumber).click();
        }

    }

    @When("AA Dosya - Evrak tiklar ve hizmet turunu secer")
    public void aaDosyaEvrakTiklarVeHizmetTurunuSecer() {
//        uS06page = new US06_pages();
        uS06page.dosyaEvrakButonu.click();
    }


    @Then("AA Gonderi Detayindan ucret goruntulendigini dogrular")
    public void aaGonderiDetayindanUcretGoruntulendiginiDogrular() {
//        uS06page = new US06_pages();
        System.out.println("uS06page.itemTotalPrice.getText() = " + uS06page.itemTotalPrice.getText());

        totalPriceStr = uS06page.itemTotalPrice.getText();

        System.out.println("uS06page.itemTotalPrice.getText() = " + uS06page.itemTotalPrice.getText().length());
        if (itemTotalPrice < 4) {
            System.out.println("item price hatalı.Hesaplama yapılamadı");
        } else {
            commaIndex = totalPriceStr.indexOf(",");
            itemTotalPrice = Integer.parseInt(totalPriceStr.substring(0, commaIndex));
            System.out.println("itemTotalPrice = " + itemTotalPrice);
        }
        waitForVisibility(uS06page.itemTotalPrice, 2);

        assertTrue("item's total price is not as expected", itemTotalPrice > 0);
        assertTrue("item's is not displayed", uS06page.itemTotalPrice.isDisplayed());
    }

    @And("AA Sayfayi kapatir")
    public void aaSayfayiKapatir() {
        Driver.closeDriver();
    }


    @And("AA Kutu - Koli secer")
    public void aaKutuKoliSecer() {
        uS06page.kutuKoliButonu.click();
    }

    @When("AA {string} {string} {string} ve {string} bilgilerini girer")
    public void aaVeBilgileriniGirer(String agirlik, String boy, String yukseklik, String en) {
        uS06page.agirlikTextBox.sendKeys(agirlik);
        uS06page.boyTextBox.sendKeys(boy);
        uS06page.yukseklikTextBox.sendKeys(yukseklik);
        uS06page.enTextBox.sendKeys(en);

    }

    @And("AA Desi Kg Hesapla butonuna tiklar")
    public void aaDesiKgHesaplaButonunaTiklar() {
        uS06page.dsKgHesaplaButton.click();

    }


    @And("AA Yeni Hesaplama Yap butonuna tiklar")
    public void aayeniHesaplamaYapButonunaTiklar() {
        uS06page.yeniHesaplamaYapButton.click();
    }

    @Then("AA Ilgili Hesaplama sayfasında oldugunu dogrular")
    public void aaılgiliHesaplamaSayfasındaOldugunuDogrular() {
        assertTrue("ilgili ucret hesaplama sayfasında değil", uS06page.ucretHesaplamaSayfasiText.isDisplayed());
    }

    @And("AA Ulke bilgisini girer")
    public void aaUlkeBilgisiniGirer() {
        uS06page.nereyeTextBox.sendKeys("a");
        ulkelerListesi = uS06page.ulkeIsimleri_List;
        rnd = new Random();
        rndNumber = rnd.nextInt(1, ulkelerListesi.size() + 1);
        ulkelerListesi.get(rndNumber).click();

    }

    @Then("AA Agirlik textboxinin kızardigini dogrular")
    public void aaAgirlikTextboxininKızardiginiDogrular() {
    }

    @Then("AA Gonderi Detayindan ucret goruntulenmedigini doğrular")
    public void aaGonderiDetayindanUcretGoruntulenmediginiDoğrular() {
    }
}
