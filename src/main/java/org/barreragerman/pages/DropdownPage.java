package org.barreragerman.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage extends AbstractPage {

    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    private Select findDropdownElement() {
        return new Select(driver.findElement(dropdown));
    }

    public void selectFromDropdown(String option) {
        findDropdownElement().selectByVisibleText(option);
    }

    /**
     * Here I make a list of the selected options and then get the text of each one in a list
     * @return a list of the selected options
     */
    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());

    }

}
