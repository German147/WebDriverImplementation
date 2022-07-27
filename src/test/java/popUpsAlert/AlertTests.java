package popUpsAlert;

import org.barreragerman.webDriver.TheInternetBaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends TheInternetBaseTests {
    @Test
    public void testAcceptAlert() {
        var alertPage = homePage.clickOnAlertPage();
        alertPage.triggerAlertClick();
        alertPage.clickToAcceptAlert();
        assertEquals(alertPage.getAlertTextResult(), "You successfully clicked an alert", "The result text is incorrect");
    }

    @Test
    public void testConfirmButtonCanceled() {
        var alertPage = homePage.clickOnAlertPage();
        alertPage.triggerConfirmClick();
        String text = alertPage.getConfirmTextResult();
        alertPage.clickOnConfirmDismiss();
        assertEquals(text, "I am a JS Confirm", "The text is not the expected");
    }

    @Test
    public void sendInputIntoAlert() {
        var alertPage = homePage.clickOnAlertPage();
        alertPage.triggerPormpt();
        String text = "German is coding";
        alertPage.setInputToPrompt(text);
       alertPage.clickToAcceptAlert();
        assertEquals(alertPage.getAlertTextResult(),"You entered: "+ text,"ResultText is incorrect");

    }
}
