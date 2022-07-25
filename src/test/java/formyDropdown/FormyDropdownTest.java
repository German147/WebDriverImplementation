package formyDropdown;

import org.barreragerman.webDriver.FormyPageBaseTests;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FormyDropdownTest extends FormyPageBaseTests {

    @Test
    public void TestFormyDropdownNavBar() {
        String option = "2-4";
        var formyDropDownPage = formyHomePage.clickOnOptions();
        formyDropDownPage.selectFromDropdownElements(option);
       var selectedOptions = formyDropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"The number of selected option is not 1");
        assertTrue(selectedOptions.contains(option),"The option was not selected");


    }
}
