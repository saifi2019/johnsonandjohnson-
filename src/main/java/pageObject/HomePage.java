package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {


    /**
     *
     * This class will contains all the WebElements of HomePage
     * And associated methods of the Home Page
     * */

   @FindBy(id = "search_query_top")
    private WebElement searchBox;

   @FindBy(name = "submit_search")
   private WebElement submitButton;

   @FindBy(className = "alert-warning")
   private WebElement searchResultText;

   @FindBy(linkText = "Contact us")
   private WebElement contactUs;


   public void search(){
       //TestLogger.log("Send Texts/Keys to search box");
       searchBox.sendKeys("iphone");
       //TestLogger.log("S");
       submitButton.click();
       //TestLogger.log("Clicked Submit Button");
   }

   public String getSearchResultsText(){
       String actualText = searchResultText.getText();
       return actualText;

       }
       public void clickContactUs(){

       contactUs.click();
       //TestLogger.log("You are in Contact Us Page");

       }

    private static class TestLogger {
    }
}
