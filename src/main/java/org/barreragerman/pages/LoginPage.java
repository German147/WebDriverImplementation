package org.barreragerman.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends AbstractPage {
    //the By word refers to a WebElement type of variable
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void setUsername(String username){
        //using sendkeys() we can type text into a field
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        //Here we are passing the same driver in order to continuous interaction with the page
        return new SecureAreaPage(driver);
    }


}
