package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US03 {

    public US03(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@*='popup-close']")
    public WebElement popUpCloseGL;

    @FindBy(xpath = "(//*[text()='İş Ortağımız Olun'])[1]")
    public WebElement isOrtagiGL;

    @FindBy(xpath = "//*[text()='Acentemiz Olun']")
    public WebElement acentemizOlunGL;

    @FindBy(xpath = "//*[text()=' Hemen Başvur ']")
    public WebElement hemenBasvurGL;
    @FindBy(xpath = "//*[@id='mat-autocomplete-1']")
    public List<WebElement> ilSecimi;

    @FindBy(xpath = "//*[@id='mat-input-1']")
    public WebElement ilSecimi1;

    @FindBy(xpath = "//*[@*='add-location-btn ng-star-inserted']")
    public WebElement locasyonEkle;

    @FindBy(xpath = "//*[@formcontrolname='Name']")
    public WebElement isimGir;

    @FindBy(xpath = "//*[@formcontrolname='EducationStatu']")
    public WebElement egitimDurumu1;

    @FindBy(xpath = "//*[@class='mat-simple-snack-bar-content']")
    public WebElement hatalıMesajYazisi;

    @FindBy(xpath = "//*[@class='ng-tns-c2842056177-17']")
    public WebElement minimum18karakter;

    @FindBy(xpath = "(//*[@*='error-block ng-star-inserted'])[2]")
    public WebElement formatHatası;


}
