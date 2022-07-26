package hover;


import org.barreragerman.webDriver.TheInternetBaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTest extends TheInternetBaseTests {

    @Test
   public void testHoverUser1(){
       var hoverPage = homePage.clickHover();
       var caption = hoverPage.hoverOverFigures(1);
       assertTrue(caption.isCaptionDisplayed(),"Caption is not displayed");
       assertEquals(caption.getTitle(),"name: user1","Caption Title is incorrect");
       assertEquals(caption.getLinkText(),"View profile","Caption link text is incorrect");
       assertTrue(caption.getLink().endsWith("/users/1"),"The link provided is incorrect");
   }

}
