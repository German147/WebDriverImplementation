package org.barreragerman.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends AbstractPage{

    private By emailField = By.id("email");
    private By retrieveButton = By.id("form_submit");
    private By internalServerError = By.tagName("h1");

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);

    }

    public void clickOnRetrieveButton() {
        driver.findElement(retrieveButton).click();
    }

    public String getMessageError(){
        return driver.findElement(internalServerError).getText();
    }

}
