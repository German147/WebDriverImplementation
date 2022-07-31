package org.barreragerman.webDriver;


import com.google.common.io.Files;
import org.barreragerman.pages.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class TheInternetBaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com");
    }


//
//        WebElement inputLinks = driver.findElement(By.linkText("Shifting Content"));
//        inputLinks.click();
//        WebElement menu1 = driver.findElement(By.linkText("Example 1: Menu Element"));
//        menu1.click();
//        List<WebElement> menuItems = driver.findElements(By.tagName("li"));
//        System.out.println("The amount of menues li is of : " + menuItems.size());
//        List<WebElement> tagNames_a = driver.findElements(By.tagName("a"));
//        System.out.println("The amount of tagNames staritng with a are: " + tagNames_a.size());

    //   }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void takeScreenshot() {
        var camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        System.out.println("The absolute path is: " + screenshot.getAbsolutePath());
        try {
            Files.move(screenshot, new File("src/resource/screenShots/mySecondScreenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void recordFailureTests(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            System.out.println("The absolute path is: " + screenshot.getAbsolutePath());
            try {
                Files.move(screenshot, new File("src/resource/screenShots/"+ result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
