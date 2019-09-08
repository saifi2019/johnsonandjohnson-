package pageObjectTest;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.ContactUsPage;
import page.objects.HomePage;

public class HomePageTest extends BrowserDriver {

    /**
     *
     * This Test page should consists the test cases associated with Home Page
     * No WebElements should be available or used here explicitly
     *
     * */
    HomePage objHomePage ;

    @BeforeMethod
    public void initElements(){
        objHomePage = PageFactory.initElements(driver, HomePage.class);

    }

    @Test
    public void searchTest(){
        objHomePage.search();
        String actualText = objHomePage.getSearchResultsText();
        Assert.assertEquals(actualText,"No results were found for your search \"iphone\"" );
    }


}
