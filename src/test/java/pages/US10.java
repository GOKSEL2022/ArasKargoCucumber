package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US10 {
    public US10(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[.='Kariyer'])[1]")
    public WebElement kariyerLinkHome;

    @FindBy(xpath = "(//a[@href='/kariyer/gelecegin-bizde-onem-tasir'])[1]")
    public WebElement geleceginBizdeOnemTasirSecenegiKariyerLinkHome;

    @FindBy(xpath = "//*[@class='career-pages-hero__title']")
    public WebElement geleceginBizdeOnemTasirTitleText;

    @FindBy(xpath ="//div[@class='job-applications-box__title ng-star-inserted']" )
    public WebElement  arasKargoIsBasvurulariTextGeleceginBizdeOnemTasir;

    @FindBy(xpath = "//*[@class='job-applications-box__subtitle']")
    public WebElement aciklamaYazisiTextArasKargoIsBasvurulari;

    @FindBy(xpath = "//a[@href='mailto:kariyer@araskargo.com.tr']")
    public WebElement mailAdresiTextArasKargoIsBasvurulari;

    @FindBy(xpath = "//a[@href='https://www.linkedin.com/company/aras-kargo/jobs/']")
    public WebElement linkedinLinkArasKargoIsBasvurulari;

    @FindBy(xpath = "//a[@href='https://www.kariyer.net/firma-profil/aras-kargo-3079-40011']")
    public WebElement kariyernetLinkArasKargoIsBasvurulari;

    @FindBy(xpath = "//a[@href='https://www.secretcv.com/firma/aras-kargo-is-ilanlari']")
    public WebElement secretcvLinkArasKargoIsBasvurulari;

    @FindBy(xpath = "//a[@href='https://www.eleman.net/firma/aras-kargo-f295113']")
    public WebElement elemannetLinkArasKargoIsBasvurulari;
}
