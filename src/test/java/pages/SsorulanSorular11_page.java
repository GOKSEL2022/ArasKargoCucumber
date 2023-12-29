package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SsorulanSorular11_page {
    public SsorulanSorular11_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='popup-close']//*[@xmlns='http://www.w3.org/2000/svg']")
    public WebElement popupCloseeSG;

    @FindBy(xpath = "//li[@class='menu-item ng-tns-c588362358-0 ng-star-inserted'][5]")
    public WebElement isOrtagimizOlunSG;

    @FindBy(xpath = "//h1")
    public WebElement sikSorulanSorularSG;


    @FindBy(xpath = "//h2[@class='be-our-business-partner-faq__title pb-4']")
    public WebElement acentemizOlunButtonSG;

    @FindBy(id = "mat-expansion-panel-header-0")
    public WebElement acentemizOlunIlkSoruSG;

    @FindBy(xpath = "//div[@class='mat-expansion-panel-body ng-tns-c1859850774-80']")
    public WebElement acentemizOlunIlkCevapSG;

    @FindBy(xpath = "//span[@class='mat-content ng-tns-c2690051721-83 mat-content-hide-toggle']")
    public WebElement acentemizOlunIkinciSoruSG;

    @FindBy(xpath = "//div[@id='cdk-accordion-child-1'][1]")
    public WebElement acentemizOlunIkinciCevapSG;



    @FindBy(xpath = "//*[text()=' ARAS BURASI NOKTASI OLUN '][1]")
    public WebElement arasBurasiNoktasiOlunButtonSG;

    @FindBy(xpath = "//span[@class='mat-content ng-tns-c2690051721-103 mat-content-hide-toggle']")
    public WebElement arasBurasiNoktasiOlunIlkSoruSG;
    @FindBy(xpath = "//div[@id='cdk-accordion-child-19']")
    public WebElement arasBurasiNoktasiOlunIlkCevapSG;

    @FindBy(xpath = "//span[@class='mat-content ng-tns-c2690051721-105 mat-content-hide-toggle']]")
    public WebElement arasBurasiNoktasiOlunIkinciSoruSG;
    @FindBy(xpath = "//div[@id='cdk-accordion-child-20']")
    public WebElement arasBurasiNoktasiOlunIkinciCevapSG;




    @FindBy(xpath = "//*[text()=' ESNAF KURYE OLUN '][1]")
    public WebElement esnafKuryeOlunOlunButtonSG;

    @FindBy(xpath = "//span[@class='mat-content ng-tns-c2690051721-125 mat-content-hide-toggle']")
    public WebElement esnafKuryeOlunOlunIlkSoruSG;

    @FindBy(xpath = "//div[@class='mat-expansion-panel-body ng-tns-c1859850774-146']")
    public WebElement esnafKuryeOlunOlunIlkCevapSG;

    @FindBy(xpath = "//span[@class='mat-content ng-tns-c2690051721-149 mat-content-hide-toggle']")
    public WebElement esnafKuryeOlunOlunIkinciSoruSG;

    @FindBy(xpath = "//div[@class='mat-expansion-panel-body ng-tns-c1859850774-148']")
    public WebElement esnafKuryeOlunOlunIkinciCevapSG;



    @FindBy(xpath = "//*[text()=' ARACINIZI KİRALAYIN '][1]")
    public WebElement araciniziKiralayinButtonSG;

    @FindBy(xpath = "//span[@class='mat-content ng-tns-c2690051721-139 mat-content-hide-toggle']")
    public WebElement araciniziKiralayinIlkSoruSG;

    @FindBy(xpath = "//div[@class='mat-expansion-panel-body ng-tns-c1859850774-138']")
    public WebElement araciniziKiralayinIlkCevapSG;

    @FindBy(xpath = "//span[@class='mat-content ng-tns-c2690051721-141 mat-content-hide-toggle']")
    public WebElement araciniziKiralayinIkinciSoruSG;

    @FindBy(xpath = "//div[@class='mat-expansion-panel-body ng-tns-c1859850774-140']']")
    public WebElement araciniziKiralayinIkinciCevapSG;



}
