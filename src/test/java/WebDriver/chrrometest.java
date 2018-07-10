package WebDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class chrrometest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/hasnake/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://komonews.com/watch");
    }
}

//driver.close();
//        driver.quit();