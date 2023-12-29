package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YurticiUcretHesapla05_page {

    public YurticiUcretHesapla05_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='popup-close']//*[@xmlns='http://www.w3.org/2000/svg']")
    public WebElement popupCloseSG;

    @FindBy(xpath = "//*[.='Adresi değiştir']")
    public WebElement adresiDegistirSG;

    @FindBy(xpath = "//*[text()=' Ücret Hesapla ']")
    public WebElement ucretHesaplaSG;

    @FindBy(xpath = "//div[@class='active']")
    public WebElement yurticiPopupSG;

    @FindBy(xpath = "//a[@class='takip-form-footer-left ng-star-inserted']")
    public WebElement yurticiFiyatListesiSG;

    @FindBy(xpath = "//a[@class='aras-pdf-button-href']")
    public WebElement standartFiyatListesiSG;

    @FindBy(xpath = "//html[@dir='ltr']")
    public WebElement YurticiFiyatListesiPDFSG;





}
