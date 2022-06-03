package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class SeleniumUtils {
     /**
      * This method will move your view to the given element
      *
      * @param driver  is WebDriver object
      * @param element is a WebElement object
      */
     public static void scrollIntoView(WebDriver driver, WebElement element) {
          JavascriptExecutor jExecutor = (JavascriptExecutor) driver;
          jExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
     }

     /**
      * This method will highlight the element's background to red color
      *
      * @param driver
      * @param element
      */
     public static void highlightElement(WebDriver driver, WebElement element) throws InterruptedException {
          JavascriptExecutor js = (JavascriptExecutor) driver;

          //will move into view first
          scrollIntoView(driver, element);

          //will highlight the element to red color
          js.executeScript("arguments[0].style.backgroundColor='red'", element);
          Thread.sleep(500);

          //will remove the red highlight
          js.executeScript("arguments[0].style.backgroundColor=''", element);
     }

     public static void waitUntilVisible(WebDriver driver, WebElement element) {
          WebDriverWait wait = new WebDriverWait(driver, 20);
          wait.until(ExpectedConditions.visibilityOf(element));
     }


     //switching driver to next window and based on the title of the page printing out some text
     public static void switchToNextWindow(WebDriver driver) throws InterruptedException {
          //capturing GUID of main window
          String mainWindowID = driver.getWindowHandle();

          //capturing GUID of all windows
          Set<String> allWindows = driver.getWindowHandles();

          //switching driver to next window and based on the title of the page printing out some text
          for (String each : allWindows) {
               Thread.sleep(1000);
               driver.switchTo().window(each);

          }}}