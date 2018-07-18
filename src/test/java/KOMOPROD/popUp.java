package KOMOPROD;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class popUp {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/Users/hasnake/Driver/chromedriver");
            WebDriver driver = new ChromeDriver();
            String alertMessage = "";

            driver.get("http://jsbin.com/usidix/1");
            driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
            alertMessage = driver.switchTo().alert().getText();
            driver.switchTo().alert().accept();

            System.out.println(alertMessage);
            //driver.quit();

        }
    }


    /*
Switching Between Pop-up Windows.
WebDriver allows pop-up windows like alerts to be displayed, unlike in Selenium IDE.
To access the elements within the alert (such as the message it contains), we must use the "switchTo().alert()" method.
*/
