package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US06_pages {
    public US06_pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='popup-close']//*[@xmlns='http://www.w3.org/2000/svg']")
    public WebElement popUpClose;
    @FindBy(xpath = "//*[@href='/kargo-ucreti-hesaplama']")
    public WebElement ucretHesaplaButonu;

    @FindBy(xpath = "//*[@class='area-select']//*[contains(.,'Yurt D')]")
    public WebElement yurtDisiButton;

    @FindBy(xpath ="//mat-option[@role='option']" )
    public List<WebElement> ulkeIsimleri_List;

    @FindBy(xpath = "//*[@class='selectable-box' and contains(.,'Dosya')]")
    public WebElement dosyaEvrakButonu;

    @FindBy(xpath = "//*[@class='item-total-price']")
    public WebElement itemTotalPrice;

    @FindBy(xpath = "//*[@class='selectable-box_title' and contains(.,'Kutu')]")
    public WebElement kutuKoliButonu;

    @FindBy(xpath = "//input[@type='text' and @id='mat-input-11' ]")
    public WebElement nereyeTextBox;

    @FindBy(xpath = "//input[@type='number' and @id='mat-input-12' ]")
    public WebElement agirlikTextBox;

    @FindBy(xpath = "//input[@type='number' and @id='mat-input-13' ]")
    public WebElement boyTextBox;

    @FindBy(xpath = "//input[@type='number' and @id='mat-input-14' ]")
    public WebElement yukseklikTextBox;

    @FindBy(xpath = "//input[@type='number' and @id='mat-input-15' ]")
    public WebElement enTextBox;

    @FindBy(xpath = "//*[contains(text(),'Kg Hesapla')]")
    public WebElement dsKgHesaplaButton;

    @FindBy(xpath = "//button[.='Yeni Hesaplama Yap']")
    public WebElement yeniHesaplamaYapButton;

    @FindBy(xpath = "//button[.='Yeni Hesaplama Yap']")
    public WebElement ucretHesaplamaSayfasiText;




}
