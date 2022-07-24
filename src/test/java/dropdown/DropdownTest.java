package dropdown;

import org.barreragerman.webDriver.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTests {

    @Test
    public void testSelectedOptions() {
        String option = "Option 1";
        var dropdownPage = homePage.clickOnDropdownLink();
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        /**
         * next I do the assertion for the test
         */
        assertEquals(selectedOptions.size(),1,"The number of selected option is not 1");
        assertTrue(selectedOptions.contains(option),"The option was not selected");
    }
}
