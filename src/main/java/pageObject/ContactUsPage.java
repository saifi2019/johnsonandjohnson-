package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage {

    @FindBy(id = "email")
    private WebElement emailBox;

    public void attemptToContact(){
        //TestLogger.log("Send Keys to email box");
        emailBox.sendKeys("xyz@gmail.com");
        //TestLogger.log("Keys sent to email box");
    }

}
