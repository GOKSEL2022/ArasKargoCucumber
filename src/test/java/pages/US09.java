package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US09 {
    public US09() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='popup-close']//*[@xmlns='http://www.w3.org/2000/svg']")
    public WebElement popUpClose;
    @FindBy(xpath = "(//img[@alt='Chat bot icon'])[1]")
    public WebElement chatBot;
    @FindBy(xpath = "//*[text()=' DEVAM >']")
    public WebElement devamButton;
    @FindBy(id = "pisano-text-input-9611e55f-7b0e-436b-9c29-88d7abd03910")
    public WebElement adSoyadTextBox;
    @FindBy(id = "pisano-text-input-7788fbbc-3d63-4b29-b934-79868db3ae52")
    public WebElement telNoTextBox;
    @FindBy(xpath = "//button[@class='pisano-send-button margin-top-5']")
    public WebElement gonderButton;
    @FindBy(id = "pisano-text-input-c80939ef-b825-442c-a5a2-f2102cb6eeea")
    public WebElement mailAdresiTextBox;
    @FindBy(xpath = "//p//br")
    public List<WebElement> islemMetniList;
    @FindBy(id = "pisano-text-input-7c196174-2857-48f6-b103-c0b88a1c05ba")
    public WebElement islemNoTextBox;
    @FindBy(xpath = "//div//p[contains(.,'menü numarasını')]")
    public WebElement ilgiliMenuNoText;
    @FindBy(xpath = "//*[@class='pisano-error']")
    public WebElement hataMesaji;
    @FindBy(id = "pisano-text-input-23ec80dd-36f1-41c1-9483-1d0c8816ae54")
    public WebElement islemDevamTextBox;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement textBox;
    @FindBy(xpath = "//p[contains(.,'teşekkür ')]")
    public WebElement tesekkurMesaji;


}
