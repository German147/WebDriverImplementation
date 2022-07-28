package org.barreragerman.pages;

import org.openqa.selenium.WebDriver;

public class PageFactory extends AbstractPage {

    public PageFactory(WebDriver driver) {
        super(driver);
    }

//    public AbstractPage getPage(String page) {
//        switch (page) {
//            case "AlertsPage":
//                return new AlertsPage(driver);
//            case "DropdownPage":
//                return new DropdownPage(driver);
//            case "FileUploaderPage":
//                return new FileUploaderPage(driver);
//            case "ForgotPasswordPage":
//                return new ForgotPasswordPage(driver);
//            break;
//        }
//
//    }

}
