package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ViewSystemUserPage extends Utility {

    public static final Logger log = Logger.getLogger(ViewSystemUserPage.class);

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement systemUserText;

    public String getSystemUserText() {
        log.info("Verify text " + systemUserText.toString());
        return getTextFromElement(systemUserText);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card']//div")
    List<WebElement> userRecordList;

    public void verifyUser(String role) {
        log.info("Verify user " + userRecordList.toString());
        for (WebElement suggestion : userRecordList) {
            if (suggestion.getText().equals(role)) {
                break;
            }
        }
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement useCheckBox;

    public void clickOnUserCheckbox() {
        clickOnElement(useCheckBox);
        log.info("Click on checkbox " + useCheckBox.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement deleteUser;

    public void clickOnDeleteUser() {
        clickOnElement(deleteUser);
        log.info("Click on delete user " + deleteUser.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement confirmDeleteButton;

    public void clickOnPopUp() {
        clickOnElement(confirmDeleteButton);
        log.info("Click on confirm delete " + confirmDeleteButton.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement deleteMessage;

    public String getDeleteSucessMessage() {
        log.info("Verify the delete message " + deleteMessage.toString());
        return getTextFromElement(deleteMessage);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;

    public void clickOnReset() {
        clickOnElement(resetButton);
        log.info("Click on reset " + resetButton.toString());
    }

}
