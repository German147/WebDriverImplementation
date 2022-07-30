package org.barreragerman.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends AbstractPage {
    private String linkXpath_Format = ".//a[contains(text(),'%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }
    public DinamicLoadingExample1 clickExample1(){
        driver.findElement(link_Example1).click();
        return new DinamicLoadingExample1(driver);
    }
}
