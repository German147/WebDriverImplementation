package org.barreragerman.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends AbstractPage {

    private By inputField = By.id("target");
    private By resulText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    public void enterText(String text) {
        driver.findElement(inputField).sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(resulText).getText();
    }
    public void enterArroba(){
        enterText(Keys.chord(Keys.ALT,"64"));
    }
}
