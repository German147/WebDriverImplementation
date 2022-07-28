package org.barreragerman.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage extends AbstractPage {

    private String editorIframe = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.cssSelector("button[title='Increase indent']");

    public WysiwygEditorPage(WebDriver driver) {
        super(driver);
    }

    private void switchToEditArea() {
        driver.switchTo().frame(editorIframe);
    }

    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();

    }

    public void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public void setTextArea(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void increaseIndention() {
        driver.findElement(increaseIndentButton).click();
    }

    public String getTextFromEditor() {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
