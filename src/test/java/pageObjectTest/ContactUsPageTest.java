package pageObjectTest;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.ContactUsPage;
import page.objects.HomePage;

public class ContactUsPageTest extends BrowserDriver {

    HomePage objHomePage ;
    ContactUsPage objContactUsPage ;

    @BeforeMethod
    public void initElements(){
        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objContactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
    }

    @Test
    public void contactUsTest(){


        objHomePage.clickContactUs();
        objContactUsPage.attemptToContact();
    }

    @Test
    public void demo(){

    }
}
