package org.barreragerman.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FormyHomePage extends AbstractPage {

    private By components = By.id("select-menu");

    public FormyHomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * As it is a dropdown element I have to use the SELECT class objet to store this element
     *
     * @return
     */

    public FormyDropdownPage clickOnOptions(){
       clickLink("select-menu");
        return  new FormyDropdownPage(driver);
    }
    public void clickLink(String id){
        driver.findElement(By.id(id)).click();
    }

}
