package frames;

import org.barreragerman.webDriver.TheInternetBaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest extends TheInternetBaseTests {

    @Test
    public void testWysiwyg() {
        var editorPage = homePage.clickOnWysiwygEditor();
        editorPage.clearTextArea();
        String text1 = "hello";
        String text2 = "world";
        editorPage.setTextArea(text1);
        editorPage.increaseIndention();
        editorPage.setTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(),text1+text2,"The text is incorrect");
    }
}
