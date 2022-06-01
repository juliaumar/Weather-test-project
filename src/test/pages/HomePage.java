package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage {
    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id='privacy-data-notice']/div/p")
    public WebElement popUpWindow;


    @FindBy(xpath = "//*[@class ='Icon--icon--3wCKh Icon--actionTheme--sZu_q PrivacyDataNotice--closeButton--1fBzh']")
    public WebElement popUpClose;
}