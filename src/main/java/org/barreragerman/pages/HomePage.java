package org.barreragerman.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage{
    //the By word refers to a WebElement type of variable
    private By formAuthenticationLink = By.linkText("Form Authentication");

    /**
     * here I inherit the driver of the parent class AbstractPage
     * @param driver
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickFormAuthentication() {
        //Here as it only one locator, I can put it directly into the call, but if it is going
        //to be used many times I have to declare it as a global variable
        clickLink("Form Authentication");
        //Here we are passing the same driver in order to continuous interaction with the page
        return new LoginPage(driver);
    }
    public ForgotPasswordPage clickInForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public DropdownPage clickOnDropdownLink(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHover(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPress(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickOnAlertPage(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public HorizontalSliderPage clickHorizonalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    /**
     * In this method I dont return anything because it is a generic method
     * to be called by any method
     * @param linkText it is for the WebElement locator
     */
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


}
