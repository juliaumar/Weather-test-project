package tests;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());

    }

    @Test(testName = "IN-1 - Text of Pop-up Window")
    public void test01() {


        homePage.popUpWindow.getText();
        homePage.popUpClose.click();

    }

    @Test(testName = "IN-2 - Click on btns of Facebook")
    public void test02() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        for (int i = 0; i < 4; i++) {
            js.executeScript("window.scrollBy(0,2000)");

            homePage.facebook.click();
        }
    }

    @Test(testName = "IN-3 - Click on btns of Twitter")
    public void test03() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        for (int i = 0; i < 4; i++) {
            js.executeScript("window.scrollBy(0,2000)");
            homePage.twitter.click();
        }
    }

    @Test(testName = "IN-4 - Click on btns of Youtube")
    public void test04() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        for (int i = 0; i < 4; i++) {
            js.executeScript("window.scrollBy(0,2000)");
            homePage.youtube.click();

        }
    }
}