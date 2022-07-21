package Login;

import org.barreragerman.pages.LoginPage;
import org.barreragerman.pages.SecureAreaPage;
import org.barreragerman.webDriver.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfullLogin() {
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains(
                        "You logged into a secure area!"),
                "Alert text is incorrect");


    }
}
