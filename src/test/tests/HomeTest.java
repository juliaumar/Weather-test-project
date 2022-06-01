package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp(){
        homePage = new HomePage(getDriver());

    }
    @Test(testName = "IN-1 - Text of Pop-up Window")
    public void test01(){
      homePage.popUpWindow.getText();
      homePage.popUpClose.click();


    }
}
