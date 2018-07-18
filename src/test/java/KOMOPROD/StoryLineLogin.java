package KOMOPROD;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StoryLineLogin {
    @Test
    public void Login() {

        System.setProperty("webdriver.chrome.driver", "/Users/hasnake/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://qa-sinclairstoryline.com/";
        driver.get(baseUrl);

        WebElement logUsername = driver.findElement(By.id("log-username"));

        WebElement password = driver.findElement(By.id("log-password"));

        logUsername.sendKeys("qa-user");
        password.sendKeys("123123");
        WebElement login = driver.findElement(By.id("login-btn"));

        login.click();
        System.out.println("Login successful");
        driver.close();
    }
}
