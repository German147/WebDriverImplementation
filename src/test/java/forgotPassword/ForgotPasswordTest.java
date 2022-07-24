package forgotPassword;

import org.barreragerman.webDriver.TheInternetBaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends TheInternetBaseTests {
    @Test
    public void testForgotPassword() {
        String errorMessage = "Internal Server Error";
        var forgotPassWordPage = homePage.clickInForgotPassword();
        forgotPassWordPage.setEmail("tau@example.com");
        forgotPassWordPage.clickOnRetrieveButton();
        String errorMessageText = forgotPassWordPage.getMessageError();
        assertTrue(errorMessageText.contains(errorMessage),"The page works correctly");
    }
}
