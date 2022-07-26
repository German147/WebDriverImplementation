package org.barreragerman.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage extends AbstractPage {

    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    //here the index starts at 1, as it is a list of elements I have to put the number index to choose.
    //as it -1 is pointing to zero index, or the very first index.
    public  FigureCaption hoverOverFigures(int index){
        WebElement figure = driver.findElements(figureBox).get(index-1);

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(boxCaption));
    }

    /**This is an inner class.
     * Caption means the image with it information
     * This class could be settled into its own package, but as it a small one, it is used as
     * an example purpose, so it is created in here. this represents the image when the hovering
     * over the image (kind of work as if it was a dropdownPage).
     */
    public class FigureCaption{

        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }
        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }
        public String getTitle(){
            return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }
}
