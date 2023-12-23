package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US03 {

    public US03(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='popup-close']")
    public WebElement popUpCloseGL;

    @FindBy(xpath = "(//*[text()='İş Ortağımız Olun'])[1]")
    public WebElement isOrtagiGL;

    @FindBy(xpath = "//*[text()='Acentemiz Olun']")
    public WebElement acentemizOlunGL;

    @FindBy(xpath = "//*[text()=' Hemen Başvur ']")
    public WebElement hemenBasvurGL;

    @FindBy(xpath = "//*[@class='mat-form-field-flex ng-tns-c2842056177-2']")
    public WebElement ilSecimiGL;


}
