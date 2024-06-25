package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddUserPage extends Utility {
    public static final Logger log = Logger.getLogger(AddUserPage.class);

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement addButton;

    public void clickOnAddButton() {
        log.info("Click on add " + addButton.toString());
        clickOnElement(addButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement addText;

    public String getAddText() {
        log.info("Verify Text " + addText.toString());
        return getTextFromElement(addText);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@role='listbox']//span")
    List<WebElement> statusOptions;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Status')]/following::div[1]")
    WebElement userStatusDropdown;

    public void selectUserStatus(String role) throws InterruptedException {
        log.info("select user status " + role.toString());
        //CustomListeners.test.log(Status.PASS,"select user status  "+role);
        userStatusDropdown.click();
        Thread.sleep(2000);
        for (WebElement option : statusOptions) {
            if (option.getText().equals(role)) {
                option.click();
                break;
            }
        }
    }

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'User Role')]/following::div[1]")
    WebElement userRoleDropdown;

    public void selectUserRole(String role) {
        log.info("select text " + role.toString());
        userRoleDropdown.click();
        for (WebElement option : dropdownOptionsUser) {
            if (option.getText().equals(role)) {
                option.click();
                break;
            }
        }
    }


    @CacheLookup
    @FindBy(xpath = "//div[@role='listbox']//span")
    List<WebElement> dropdownOptionsUser;


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement employeeNameField;

    public void enterEmployeeName(String employeeName) {
        log.info("Enter employee name " + employeeNameField.toString());
        sendTextToElement(employeeNameField, employeeName);
    }

    @CacheLookup
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement enterUserName;

    public void enterUserName(String name) {
        log.info("Enter User name " + enterUserName.toString());
        sendTextToElement(enterUserName, name);
    }

    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement enterPassword;

    public void enterPassword(String password) {
        log.info("Enter Password " + enterPassword.toString());
        sendTextToElement(enterPassword, password);
    }

    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement enterConfirmPassword;

    public void enterConfirmPassword(String reEnterPassword) {
        log.info("Confirm Password " + enterConfirmPassword.toString());
        sendTextToElement(enterConfirmPassword, reEnterPassword);
    }

    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
    WebElement saveButton;

    public void clickOnSave() {
        log.info("click on save button " + saveButton.toString());
        clickOnElement(saveButton);
    }

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement successMessage;

    public String getSavedMessage() {
        log.info("get saved message" + successMessage.toString());
        return getTextFromElement(successMessage);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@role='listbox']//span")
    List<WebElement> employeeNameSuggestions;

    public void selectEmployeeRole(String role) {
        log.info("select employee role " + role.toString());
        // CustomListeners.test.log(Status.PASS,"select the employee role "+role);
        for (WebElement suggestion : employeeNameSuggestions) {
            if (suggestion.getText().equals(role)) {
                suggestion.click();
                break;
            }
        }
    }


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;

    public void clickOnSearchButton() {
        log.info("clicked on the seach button " + searchButton.toString());
        clickOnElement(searchButton);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='(1) Record Found']")
    WebElement searchText;

    public String getSeachText() {
        log.info("Verify the text " + searchText.toString());
        return getTextFromElement(searchText);
    }

}
