package org.barreragerman.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage extends AbstractPage {

    private By inputField = By.id("file-upload");
    private By upLoadButton = By.id("file-submit");
    private By uploadedFiledText = By.id("uploaded-files");

    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    public void clickUploadButton(){
        driver.findElement(upLoadButton).click();
    }

    /**
     * This method provides path of the file to the form then clicks Upload button
     * @param absolutePathOfFile The complete path of the file to upload
     */
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedText(){
        return driver.findElement(uploadedFiledText).getText();
    }
}
