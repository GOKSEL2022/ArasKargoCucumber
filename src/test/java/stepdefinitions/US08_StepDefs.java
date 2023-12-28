package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US08;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;
public class US08_StepDefs {
    US08 us08 =new US08();
    @Given("EK Kullanici verilen URL'e gider")
    public void ekKullaniciVerilenURLEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("EK Kullanici anasayfanin acildigini dogrular")
    public void ekKullaniciAnasayfaninAcildiginiDogrular() {
        assert Driver.getDriver().getCurrentUrl().contains("araskargo");
    }
    @When("EK Kullanici cikan popupi kapatir")
    public void ekKullaniciCikanPopupiKapatir() {
        clickWithTimeOut(us08.popupCloseHome,3);
    }
    @And("EK Kullanici dashboarddaki Musteri Iliskileri kisminin goruldugunu dogrular")
    public void ekKullaniciDashboarddakiMusteriIliskileriKismininGoruldugunuDogrular() {
        assert us08.musteriIliskileriButon.isDisplayed();
    }
    @And("EK Kullanici dashboarddaki Musteri Iliskileri kismina tiklar")
    public void ekKullaniciDashboarddakiMusteriIliskileriKisminaTiklar() {
        clickByJS(us08.musteriIliskileriButon);
    }
    @And("EK Kullanici Geri Bildirim Formu kisminin altindaki Sayfaya Git yazisina tiklar")
    public void ekKullaniciGeriBildirimFormuKismininAltindakiSayfayaGitYazisinaTiklar() {
        scrollIntoViewJS(us08.arasaSorTitleTextMusteriIliskileri);
        clickByJS(us08.sayfayaGitLinkGeriBildirimFormuMusteriIliskileri);
    }
    @And("EK Kullanici Geri Bildirim Formu sayfasinin acildigini dogrular")
    public void ekKullaniciGeriBildirimFormuSayfasininAcildiginiDogrular() {
        assert us08.geriBildirimFormuTitleText.isDisplayed();
    }
    @And("EK Kullanici Bireysel kismina tiklar")
    public void ekKullaniciBireyselKisminaTiklar() {
       clickWithTimeOut(us08.bireyselButonGeriBildirimFormuMusteriIliskileri,2);
    }
    @And("EK Kullanici Kategori Secin yazisi gozukene kadar sayfayi asagi kaydirir")
    public void ekKullaniciKategoriSecinYazisiGozukeneKadarSayfayiAsagiKaydirir() {
        scrollIntoViewJS(us08.kategoriSecinDropDownGeriBildirimFormuMusteriIliskileri);
    }
    @And("EK Kullanici Kategori Secin yazisina tiklar")
    public void ekKullaniciKategoriSecinYazisinaTiklar() {
        clickByJS(us08.kategoriSecinDropDownGeriBildirimFormuMusteriIliskileri);
    }
    @Given("EK Kullanici acilan dropdowndaki BILGI butonuna tiklar")
    public void ekKullaniciAcilanDropdowndakiBILGIButonunaTiklar() {
        clickByJS(us08.bilgiSecenegiDropdown);
        //new Select(us08.kategoriSecinDropDownGeriBildirimFormuMusteriIliskileri).selectByVisibleText("BİLGİ");
    }
    @When("EK Kullanici dropdown icinde BILGI secildigini dogrular")
    public void ekKullaniciDropdownIcindeBILGISecildiginiDogrular() throws InterruptedException {
        Thread.sleep(2000);
        assert us08.bilgiTextDropdown.getText().contains("BİLGİ");
    }
    @Then("EK Kullanici sayfayi kapatir")
    public void ekKullaniciSayfayiKapatir() {
        Driver.quitDriver();
    }
    @Given("EK Kullanici acilan dropdowndaki ISLEM_TALEP butonuna tiklar")
    public void ekKullaniciAcilanDropdowndakiISLEM_TALEPButonunaTiklar() {
        //new Select(us08.kategoriSecinDropDownGeriBildirimFormuMusteriIliskileri).selectByVisibleText("İŞLEM - TALEP");
        clickByJS(us08.islem_TalepSecenegiDropdown);
    }
    @When("EK Kullanici dropdown icinde ISLEM_TALEP secildigini dogrular")
    public void ekKullaniciDropdownIcindeISLEM_TALEPSecildiginiDogrular() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(us08.islemTalepTextDropdown.getText().contains("İŞLEM"));
    }
    @Given("EK Kullanici acilan dropdowndaki ONERI butonuna tiklar")
    public void ekKullaniciAcilanDropdowndakiONERIButonunaTiklar() {
        //new Select(us08.kategoriSecinDropDownGeriBildirimFormuMusteriIliskileri).selectByVisibleText("ÖNERİ");
        clickByJS(us08.oneriSecenegiDropdown);
    }
    @When("EK Kullanici dropdown icinde ONERI secildigini dogrular")
    public void ekKullaniciDropdownIcindeONERISecildiginiDogrular() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(us08.oneriTextDropdown.getText().contains("ÖNERİ"));
    }
    @Given("EK Kullanici acilan dropdowndaki SIKAYET_PROBLEM butonuna tiklar")
    public void ekKullaniciAcilanDropdowndakiSIKAYET_PROBLEMButonunaTiklar() {
        //new Select(us08.kategoriSecinDropDownGeriBildirimFormuMusteriIliskileri).selectByVisibleText("ŞİKAYET - PROBLEM");
       clickByJS(us08.sikayet_ProblemSecenegiDropdown);
    }
    @When("EK Kullanici dropdown icinde SIKAYET_PROBLEM secildigini dogrular")
    public void ekKullaniciDropdownIcindeSIKAYET_PROBLEMSecildiginiDogrular() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(us08.sikayetProblemTextDropdown.getText().contains("ŞİKAYET"));
    }
    @Given("EK Kullanici acilan dropdowndaki TESEKKURLER butonuna tiklar")
    public void ekKullaniciAcilanDropdowndakiTESEKKURLERButonunaTiklar() {
        //new Select(us08.kategoriSecinDropDownGeriBildirimFormuMusteriIliskileri).selectByVisibleText("TEŞEKKÜRLER");
        clickByJS(us08.tesekkurlerSecenegiDropdown);
    }
    @When("EK Kullanici dropdown icinde TESEKKURLER secildigini dogrular")
    public void ekKullaniciDropdownIcindeTESEKKURLERSecildiginiDogrular() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(us08.tesekkurlerTextDropdown.getText().contains("TEŞEKKÜRLER"));
    }
    @And("EK Kullanici iki saniye bekler")
    public void ekKullaniciIkiSaniyeBekler() throws InterruptedException {
        Thread.sleep(2000);
    }
}
