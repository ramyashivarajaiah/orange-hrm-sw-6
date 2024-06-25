package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement logofield;

    public boolean getLogo() {
        log.info("Get orangehrm logo");
        return verifyThatElementIsDisplayed(logofield);
    }

    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement welcomeText;

    public String getWelcomeText() {
        log.info("Get welcome text");
        String message = getTextFromElement(welcomeText);
        return message;
    }

    @CacheLookup
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'][normalize-space()='Required'])")
    WebElement requireError;

    public String errorMessage() {
        log.info("Get error text");
        String message = getTextFromElement(requireError);
        return message;
    }


    }
