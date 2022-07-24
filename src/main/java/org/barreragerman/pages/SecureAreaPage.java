package org.barreragerman.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage  extends AbstractPage{
    //the By word refers to a WebElement type of variable
    private By statusAlert = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public String getAlertText(){
        //here with the getTex() read text from an element
        return driver.findElement(statusAlert).getText();
    }

}
