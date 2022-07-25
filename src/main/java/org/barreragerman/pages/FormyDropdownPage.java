package org.barreragerman.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class FormyDropdownPage extends AbstractPage{

    private By components = By.id("select-menu");

    public FormyDropdownPage(WebDriver driver) {
        super(driver);
    }

    public Select findComponentFromNav() {
        return new Select(driver.findElement(components));
    }

    public void selectFromDropdownElements(String LinkText) {
        findComponentFromNav().selectByVisibleText(LinkText);
    }

    public List<String> getSelectedOptions() {
        List<WebElement> selectedOptions = findComponentFromNav().getAllSelectedOptions();
        return selectedOptions.stream().map(elements->elements.getText()).collect(Collectors.toList());
    }
}
