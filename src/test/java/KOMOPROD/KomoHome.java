package KOMOPROD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class KomoHome {

    @Test
    public void Test1(){
        System.setProperty("webdriver.chrome.driver", "/Users/hasnake/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();


        String baseUrl = "http://komonews.com/";
        String expectedTitle = "Seattle News, Weather, Sports, Breaking News | KOMO";
        String actualTitle = "";

        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        assertEquals(expectedTitle,actualTitle);
        driver.close();
    }
 @Test
    public void Test2(){
        System.setProperty("webdriver.chrome.driver", "/Users/hasnake/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://komonews.com/";
        String tagName = "";

        driver.get(baseUrl);
        tagName = driver.findElement(By.cssSelector("h3")).getText();
        System.out.println(tagName);
        driver.close();
    }
}

