package org.barreragerman.webDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        WebElement inputLinks = driver.findElement(By.linkText("Shifting Content"));
        inputLinks.click();
        WebElement menu1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        menu1.click();
        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println("The amount of menues li is of : " + menuItems.size());
        List<WebElement> tagNames_a = driver.findElements(By.tagName("a"));
        System.out.println("The amount of tagNames staritng with a are: " + tagNames_a.size());

    }

    public static void main(String[] args) {
        BaseTests tests = new BaseTests();
        tests.setUp();
    }
}
