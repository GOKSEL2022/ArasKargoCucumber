package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BireyselSekmesi08_page;
import utilities.ConfigReader;
import utilities.Driver;
import static utilities.ReusableMethods.*;
public class BireyselSekmesi08_StepDef {
    BireyselSekmesi08_page bireyselSekmesi08Page =new BireyselSekmesi08_page();
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
        clickWithTimeOut(bireyselSekmesi08Page.popupCloseHome,3);
    }
    @And("EK Kullanici dashboarddaki Musteri Iliskileri kisminin goruldugunu dogrular")
    public void ekKullaniciDashboarddakiMusteriIliskileriKismininGoruldugunuDogrular() {
        assert bireyselSekmesi08Page.musteriIliskileriButon.isDisplayed();
    }
    @And("EK Kullanici dashboarddaki Musteri Iliskileri kismina tiklar")
    public void ekKullaniciDashboarddakiMusteriIliskileriKisminaTiklar() {
        clickByJS(bireyselSekmesi08Page.musteriIliskileriButon);
    }
    @And("EK Kullanici Geri Bildirim Formu kisminin altindaki Sayfaya Git yazisina tiklar")
    public void ekKullaniciGeriBildirimFormuKismininAltindakiSayfayaGitYazisinaTiklar() {
        scrollIntoViewJS(bireyselSekmesi08Page.arasaSorTitleTextMusteriIliskileri);
        clickByJS(bireyselSekmesi08Page.sayfayaGitLinkGeriBildirimFormuMusteriIliskileri);
    }
    @And("EK Kullanici Geri Bildirim Formu sayfasinin acildigini dogrular")
    public void ekKullaniciGeriBildirimFormuSayfasininAcildiginiDogrular() {
        assert bireyselSekmesi08Page.geriBildirimFormuTitleText.isDisplayed();
    }
    @And("EK Kullanici Bireysel kismina tiklar")
    public void ekKullaniciBireyselKisminaTiklar() {
       clickWithTimeOut(bireyselSekmesi08Page.bireyselButonGeriBildirimFormuMusteriIliskileri,2);
    }
    @And("EK Kullanici Kategori Secin yazisi gozukene kadar sayfayi asagi kaydirir")
    public void ekKullaniciKategoriSecinYazisiGozukeneKadarSayfayiAsagiKaydirir() {
        scrollIntoViewJS(bireyselSekmesi08Page.kategoriSecinDropDownGeriBildirimFormuMusteriIliskileri);
    }
    @And("EK Kullanici Kategori Secin yazisina tiklar")
    public void ekKullaniciKategoriSecinYazisinaTiklar() {
        clickByJS(bireyselSekmesi08Page.kategoriSecinDropDownGeriBildirimFormuMusteriIliskileri);
    }
    @Given("EK Kullanici acilan dropdowndaki BILGI butonuna tiklar")
    public void ekKullaniciAcilanDropdowndakiBILGIButonunaTiklar() {
        clickByJS(bireyselSekmesi08Page.bilgiSecenegiDropdown);
    }
    @When("EK Kullanici dropdown icinde BILGI secildigini dogrular")
    public void ekKullaniciDropdownIcindeBILGISecildiginiDogrular()  {
           bireyselSekmesi08Page.bilgiTitleTextGeriBildirimFormu.getText().contains("BİLGİ");
    }
    @Then("EK Kullanici sayfayi kapatir")
    public void ekKullaniciSayfayiKapatir() {
        Driver.quitDriver();
    }
    @Given("EK Kullanici acilan dropdowndaki ISLEM_TALEP butonuna tiklar")
    public void ekKullaniciAcilanDropdowndakiISLEM_TALEPButonunaTiklar() {
        clickByJS(bireyselSekmesi08Page.islem_TalepSecenegiDropdown);
    }
    @When("EK Kullanici dropdown icinde ISLEM_TALEP secildigini dogrular")
    public void ekKullaniciDropdownIcindeISLEM_TALEPSecildiginiDogrular() {
        assert bireyselSekmesi08Page.islemTalepTitleTextGeriBildirimFormu.isDisplayed();
    }
    @Given("EK Kullanici acilan dropdowndaki ONERI butonuna tiklar")
    public void ekKullaniciAcilanDropdowndakiONERIButonunaTiklar() {
        clickWithTimeOut(bireyselSekmesi08Page.oneriSecenegiDropdown,2);
    }
    @When("EK Kullanici dropdown icinde ONERI secildigini dogrular")
    public void ekKullaniciDropdownIcindeONERISecildiginiDogrular() {
        assert bireyselSekmesi08Page.oneriTitleTextGeriBildirimFormu.isDisplayed();
    }
    @Given("EK Kullanici acilan dropdowndaki SIKAYET_PROBLEM butonuna tiklar")
    public void ekKullaniciAcilanDropdowndakiSIKAYET_PROBLEMButonunaTiklar() {
       clickByJS(bireyselSekmesi08Page.sikayet_ProblemSecenegiDropdown);
    }
    @When("EK Kullanici dropdown icinde SIKAYET_PROBLEM secildigini dogrular")
    public void ekKullaniciDropdownIcindeSIKAYET_PROBLEMSecildiginiDogrular() {
        assert bireyselSekmesi08Page.sikayetProblemTitleTextGeriBildirimFormu.isDisplayed();
    }
    @Given("EK Kullanici acilan dropdowndaki TESEKKURLER butonuna tiklar")
    public void ekKullaniciAcilanDropdowndakiTESEKKURLERButonunaTiklar() {
        clickWithTimeOut(bireyselSekmesi08Page.tesekkurlerSecenegiDropdown,2);
    }
    @When("EK Kullanici dropdown icinde TESEKKURLER secildigini dogrular")
    public void ekKullaniciDropdownIcindeTESEKKURLERSecildiginiDogrular() {
        assert bireyselSekmesi08Page.tesekkurlerTitleTextGeriBildirimFormu.isDisplayed();
    }
    @And("EK Kullanici iki saniye bekler")
    public void ekKullaniciIkiSaniyeBekler() throws InterruptedException {
        Thread.sleep(2000);
    }
    @And("EK KUllanici konu basligi dropdowna tiklar")
    public void ekKUllaniciKonuBasligiDropdownaTiklar() {
        clickByJS(bireyselSekmesi08Page.konuBasligiSecinDropdownGeriBildirimFormu);
    }
    @And("EK Kullanici eOdemeBilgisi secenegini tiklar")
    public void ekKullaniciEOdemeBilgisiSeceneginiTiklar() {
        clickWithTimeOut(bireyselSekmesi08Page.eOdemeBilgisiKonuBasligiSecenegiGeriBildirimFormu,2);
    }
    @And("EK Kullanici acentelik talebi secenegini tiklar")
    public void ekKullaniciAcentelikTalebiSeceneginiTiklar() {
       clickWithTimeOut(bireyselSekmesi08Page.acentelikTalebiIslemTalepSecenegiGeriBildirimFormu,2);
    }
    @And("EK Kullanici diger secenegini tiklar")
    public void ekKullaniciDigerSeceneginiTiklar() {
        clickWithTimeOut(bireyselSekmesi08Page.digerOneriSecenegiGeriBildirimFormu,2);
    }
    @And("EK Kullanici adresten alim yapilmamasi secenegini tiklar")
    public void ekKullaniciAdrestenAlimYapilmamasiSeceneginiTiklar() {
        clickWithTimeOut(bireyselSekmesi08Page.adrestenAlimYapilmamasiSikayetProblemSecenegiGeriBildirimFormu,2);
    }
    @And("EK Kullanici bolge personeli secenegini tiklar")
    public void ekKullaniciBolgePersoneliSeceneginiTiklar() {
        clickWithTimeOut(bireyselSekmesi08Page.bolgePersoneliTesekkurlerSecenegiGeriBildirimFormu,2);
    }
}
