package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {

    public static final Logger log = Logger.getLogger(AdminPage.class);

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Admin']")
    WebElement adminButton;

    public void clickOnAdminButton() {
        clickOnElement(adminButton);
        log.info("Click on Admin ");
    }
}
