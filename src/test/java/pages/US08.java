package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US08 {
    public US08(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='popup-close']")
    public WebElement popupCloseHome;

    @FindBy(xpath = "(//*[.='Müşteri İlişkileri'])[1]")
    public WebElement musteriIliskileriButon;

    @FindBy(xpath = "(//a[@href='/musteri-iliskileri/geri-bildirim-formu'])[2]")
    public WebElement sayfayaGitLinkGeriBildirimFormuMusteriIliskileri;

    @FindBy(xpath = "(//*[@class='customer-relationship-tab__card-title'])[1]")
    public WebElement bireyselButonGeriBildirimFormuMusteriIliskileri;

    @FindBy(xpath = "(//*[@role='combobox'])[5]")
    public WebElement kategoriSecinDropDownGeriBildirimFormuMusteriIliskileri;

    @FindBy(xpath = "//*[.='Geri bildirim formu']")
    public WebElement geriBildirimFormuTitleTextMusteriIliskileri;

    @FindBy(xpath = "//*[.='Aras’a sor']")
    public WebElement arasaSorTitleTextMusteriIliskileri;

    @FindBy(xpath = "//*[@id='mat-option-7']")
    public WebElement bilgiSecenegiDropdown;

    @FindBy(xpath = "//*[@id='mat-option-8']")
    public WebElement islem_TalepSecenegiDropdown;

    @FindBy(xpath = "//*[@id='mat-option-9']")
    public WebElement oneriSecenegiDropdown;

    @FindBy(xpath = "//*[@id='mat-option-10']")
    public WebElement sikayet_ProblemSecenegiDropdown;

    @FindBy(xpath = "//*[@id='mat-option-11']")
    public WebElement tesekkurlerSecenegiDropdown;

    @FindBy(xpath = "//h1[@class='detail-pages-hero__title']")
    public WebElement geriBildirimFormuTitleText;

    @FindBy(xpath = "//*[text()='BİLGİ']")
    public WebElement bilgiTextDropdown;

    @FindBy(xpath = "//*[text()=' İŞLEM - TALEP ']")
    public WebElement islemTalepTextDropdown;

    @FindBy(xpath = "//*[text()=' ÖNERİ ']")
    public WebElement oneriTextDropdown;

    @FindBy(xpath = "//*[text()=' ŞİKAYET - PROBLEM ']")
    public WebElement sikayetProblemTextDropdown;

    @FindBy(xpath = "//*[text()=' TEŞEKKÜRLER ']")
    public WebElement tesekkurlerTextDropdown;
}
