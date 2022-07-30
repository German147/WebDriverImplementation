package wait;

import org.barreragerman.webDriver.TheInternetBaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTest extends TheInternetBaseTests {

    @Test
    public void testWaitPage() {
        String textResult = "Hello World!";
        var loadingAPge = homePage.clickDynamicLoading();
        var example1 = loadingAPge.clickExample1();
        example1.clickOnStart();
        String text = example1.getLoadedText();
        assertEquals(text,textResult,"The text is not the correct");

    }
}
