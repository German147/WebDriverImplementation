package Keyboard;

import org.barreragerman.webDriver.TheInternetBaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends TheInternetBaseTests {

    @Test
    public void testBackSpace() {
        var keyPage = homePage.clickKeyPress();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");

    }

    @Test
    public void testSpacekey() {
        var keypage = homePage.clickKeyPress();
        keypage.enterText("A" + Keys.SPACE);
        assertEquals(keypage.getResult(), "You entered: SPACE!");
        System.out.println(keypage.getResult());
    }

    @Test
    public void testArroba() {
        var keyPage = homePage.clickKeyPress();
        keyPage.enterArroba();
//        assertEquals(keyPage.getResult(),"You entered: NUMPAD4");
        System.out.println(keyPage.getResult());
    }

    @Test
    public void testSlideToWholeNumber(){
        String value = "4";
        var sliderPage = homePage.clickHorizonalSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(), value, "Slider value is incorrect");
    }


}
