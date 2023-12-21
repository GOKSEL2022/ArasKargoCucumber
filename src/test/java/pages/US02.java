package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US02 {
    public US02(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='popup-close']")
    public WebElement popupCloseHome;

    @FindBy(xpath = "(//*[.='Hizmetlerimiz'])[1]")
    public WebElement hizmetlerimizLinkHome;

    @FindBy(xpath = "(//a[@href='/hizmetlerimiz/ambalaj-urunlerimiz'])[1]")
    public WebElement ambalajUrunlerimizHizmetlerimizLinkHome;
}
