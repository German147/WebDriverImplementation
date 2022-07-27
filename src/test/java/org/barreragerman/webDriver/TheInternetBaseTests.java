package org.barreragerman.webDriver;


import org.barreragerman.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

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


//    public static void main(String[] args) {
//        TheInternetBaseTests tests = new TheInternetBaseTests();
//        tests.setUp();
//    }
}
