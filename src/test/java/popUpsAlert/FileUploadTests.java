package popUpsAlert;


import org.barreragerman.webDriver.TheInternetBaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends TheInternetBaseTests {

    @Test
    public void testFileUpload() {
        var fileUploadPage = homePage.clickOnFileUpLoader();
        fileUploadPage.uploadFile("F:/German 2022/TAU/Selenium_WebDriver/WebDriverImplementation/src/resource/Chapeter_1_Setup.txt");
        assertEquals(fileUploadPage.getUploadedText(),"Chapeter_1_Setup.txt","The texfile is incorrect");
    }
}
