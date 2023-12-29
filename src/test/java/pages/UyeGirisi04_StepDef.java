package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UyeGirisi04_StepDef {

    public UyeGirisi04_StepDef() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='popup-close']//*[@xmlns='http://www.w3.org/2000/svg']")
    public WebElement popUpClose;

    @FindBy(xpath = "//span[@class='mat-button-wrapper' and contains(text(),'ye Giri')]")
    public WebElement uyeGirisiButton;

    @FindBy(css = "#txtUsername")
    public WebElement userNameTextBox;
    @FindBy(xpath = "//table[@id='TableLogin']//tr[2]//td[1]")
    public WebElement userNameTextBox2;
    @FindBy(id = "txtPassword")
    public WebElement passwordTextBox;

    @FindBy(id = "txtSecurityKey")
    public WebElement securityKeyTextBox;
    @FindBy(id = "ButtonLogin")
    public WebElement girisYapButton;
    @FindBy(id = "ButtonForget")
    public WebElement sifremiUnuttumButton;


}
