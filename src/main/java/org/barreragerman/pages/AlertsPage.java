package org.barreragerman.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends AbstractPage {

    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmbutton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPrompt = By.xpath(".//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void triggerAlertClick() {
        driver.findElement(triggerAlertButton).click();
    }
    public void triggerPormpt(){
        driver.findElement(triggerPrompt).click();
    }
    public void setInputToPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public void triggerConfirmClick(){
        driver.findElement(triggerConfirmbutton).click();
    }
    public void clickOnConfirmDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void clickToAcceptAlert() {
        driver.switchTo().alert().accept();
    }
    public String getConfirmTextResult(){
        return driver.switchTo().alert().getText();
    }
    public String getAlertTextResult() {
        return driver.findElement(resultText).getText();
    }

}
