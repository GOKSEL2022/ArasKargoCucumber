package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US10 {
    public US10(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
