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
        WebElement inputLinks = driver.findElement(By.linkText("Inputs"));
        inputLinks.click();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("El numero total de links es " + links.size());
        System.out.println(driver.getTitle());

    }

    public static void main(String[] args) {
        BaseTests tests = new BaseTests();
        tests.setUp();
    }
}
