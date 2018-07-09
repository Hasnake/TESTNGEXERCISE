package BrowsersLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/hasnake/Driver/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.get("http://komonews.com/watch");
        //Assert.assertTrue("title should start with Selenium simplified",driver.getTitle().startsWith("Selenium Simplified"));
//            driver.close();
//            driver.quit();
    }

}
