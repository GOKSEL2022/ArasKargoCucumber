package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US12 {
    public US12(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[.='Müşteri İlişkileri'])[1]")
    public WebElement musteriIliskileriLinkHome;

    @FindBy(xpath = "(//*[@href='/musteri-iliskileri/sss'])[1]")
    public WebElement sssSecenegiMusteriIliskileriLinkHome;

    @FindBy(xpath = "//h1[@class='detail-pages-hero__title']")
    public WebElement sikSorulanSorularTitleTextMusteriIliskileri;

    @FindBy(xpath = "//*[@id='mat-expansion-panel-header-0']")
    public WebElement ilkSoruSikSorulanSorularMusteriIliskileri;

    @FindBy(xpath = "//*[@id='mat-expansion-panel-header-1']")
    public WebElement ikinciSoruSikSorulanSorularMusteriIliskileri;

    @FindBy(xpath = "//*[@id='mat-expansion-panel-header-26']")
    public WebElement sonSoruSikSorulanSorularMusteriIliskileri;

    @FindBy(xpath = "//div[@class='mat-expansion-panel-body ng-tns-c1859850774-2']")
    public WebElement ilkCevapSikSorulanSorularMusteriIliskileri;

    @FindBy(xpath = "//*[@class='mat-expansion-panel-header-description accordion-light__description ng-tns-c1859850774-4 accordion-light__description--customer-relationship-description']")
    public WebElement ikinciCevapSikSorulanSorularMusteriIliskileri;

    @FindBy(xpath = "//*[@class='mat-expansion-panel-body ng-tns-c1859850774-54']")
    public WebElement sonCevapSikSorulanSorularMusteriIliskileri;

    @FindBy(xpath = "(//*[@href='https://play.google.com/store/apps/details?id=com.araskargo.mobileapp&hl=tr&gl=US'])[1]")
    public WebElement googlePlayLinkMusteriIliskileri;

    @FindBy(xpath = "(//a[@href='https://apps.apple.com/ca/app/aras-kargo/id1524636976'])[1]")
    public WebElement appleStoreLinkMusteriIliskileri;

    @FindBy(xpath = "(//a[@href='https://appgallery.huawei.com/app/C105371373'])[1]")
    public WebElement appleGalleryLinkMusteriIliskileri;


}
