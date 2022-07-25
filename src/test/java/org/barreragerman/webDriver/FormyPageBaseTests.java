package org.barreragerman.webDriver;

import org.barreragerman.pages.FormyHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FormyPageBaseTests {
    private WebDriver driver;
    protected FormyHomePage formyHomePage;

    @BeforeClass
    public void SetUpFromyPage(){
        System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        formyHomePage = new FormyHomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
