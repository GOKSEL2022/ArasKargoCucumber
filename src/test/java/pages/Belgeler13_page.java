package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Belgeler13_page {

    public Belgeler13_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='popup-close']")
    public WebElement popUpClose;
    @FindBy(xpath = "//*[@class='menu-item ng-tns-c588362358-0 ng-star-inserted' and contains(.,'Sürdürülebilirlik')]")
    public WebElement surdurulebilirlikSekmesi;
    @FindBy(xpath = "//*[@class='menu-item ng-tns-c588362358-0 ng-star-inserted' and contains(.,'Sürdürülebilirlik')]//a[contains(.,'Kalite Yönetim Sistemi')]")
    public WebElement kaliteYonetimSistemi;
    @FindBy(xpath = "//h3[contains(.,'Belgeler')]")
    public WebElement belgelerTitle;
    @FindBy(xpath = "//*[@class='file-box-grey__wrapper']")
    public List<WebElement> belgelerIsimleriWEList;

    @FindBy(xpath = "//a[contains(.,' Belgeyi İndir ')]")
    public WebElement belgeyiIndirButton;
    @FindBy(xpath = "//img[@class='file-box-grey__image ng-star-inserted']")
    public WebElement belgeResimiWE;


}
