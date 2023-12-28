package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US13 {


    public US13() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='popup-close']//*[@xmlns='http://www.w3.org/2000/svg']")
    public WebElement popUpClose;

    @FindBy(xpath = "//*[@class='menu-item ng-tns-c588362358-0 ng-star-inserted' and contains(.,'Sürdürülebilirlik')]")
    public WebElement surdurulebilirlikSekmesi;


}
