package applicationBasePage;


import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reporting.TestLogger;

public class ApplicationPageBase extends BrowserDriver {



    /**
     * This class will contain Helper Methods
     *
     * */

    public static void waitUntilElementisCLickable(WebElement webElement, int waitTime){
         WebDriverWait wait = new WebDriverWait(driver, waitTime);
         wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static void sendKeys(String webELementName,String keys, WebElement webElement){
        TestLogger.log("Sending Keys to " + webELementName);
        webElement.sendKeys(keys);
        TestLogger.log("Keys Sent to " + webELementName);
    }

    public static void click(String webElementName, WebElement webElement){
        TestLogger.log("Click " + webElementName);
        webElement.click();
        TestLogger.log("Clicked " + webElementName);
    }
}
