package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @CacheLookup
    @FindBy(name = "username")
    WebElement userName;

    public void enterEmailId(String email) {
        log.info("Enter email " + email + " to username field" + email.toString());

        sendTextToElement(userName, email);
    }

    // For password
    @CacheLookup
    @FindBy(name = "password")
    WebElement passWordField;

    public void enterPassword(String password) {
        log.info("Enter password " + passWordField + " to password field" + password.toString());

        sendTextToElement(passWordField, password);
    }

    //for login Button
    @CacheLookup
    @FindBy(css = ".oxd-button")
    WebElement loginButton;

    public void clickOnLoginButton() {
        log.info("Clicking on login button");

        clickOnElement(loginButton);
    }

    //Login text of page
    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='Login']")
    WebElement loginText;


    public String getLoginText() {
        log.info("Get text from login ");

        String message = getTextFromElement(loginText);
        return message;
    }

}