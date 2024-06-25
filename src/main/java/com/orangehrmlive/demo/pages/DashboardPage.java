package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {

    public static final Logger log = LogManager.getLogger(DashboardPage.class);

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement userLogo;

    public void clickOnUserLogo() {
        log.info("Click on user link " + userLogo.toString());
        clickOnElement(userLogo);
    }

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    WebElement logOut;

    public void clickOnLogOut() {
        log.info("Click on Logout " + logOut.toString());
        mouseHoverToElementAndClick(logOut);
    }
}
