package com.nopcommerce.demo.invalidscenarios;

import com.nopcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;


public class MyAccountInfoInvalidScenariosPage extends BasePage {

    @FindBy(xpath = "//div[@id='center_column']//input[@id='firstname']")
    private WebElement myAccountInfoFirstNameInputField;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='lastname']")
    private WebElement myAccountInfoLastNameInputField;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='email']")
    private WebElement myAccountInfoEmailInputField;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='old_passwd']")
    private WebElement myAccountInfoCurrentPasswordInputField;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='passwd']")
    private WebElement myAccountInfoNewPasswordInputField;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='confirmation']")
    private WebElement myAccountInfoConfirmPasswordInputField;
    //invalid singular input error message element
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement myAccountInfoSingularInputError;

    //missing 'My Account' page updated data variables
    private String noUpdatedFirstName;
    private String noUpdatedLastName;

    public MyAccountInfoInvalidScenariosPage(WebDriver driver) {super(driver);}

    //my account information missing user data input methods
    public void inputNoFirstNameIntoFirstNameInputField(){
        myAccountInfoFirstNameInputField.clear();
        noUpdatedFirstName = "";
        logger.info("No updated user first name: " + noUpdatedFirstName);
        myAccountInfoFirstNameInputField.sendKeys(noUpdatedFirstName);
    }
    public void inputNoLastNameIntoLastNameInputField(){
        myAccountInfoLastNameInputField.clear();
        noUpdatedLastName = "";
        logger.info("No updated user last name: " + noUpdatedLastName);
        myAccountInfoLastNameInputField.sendKeys(noUpdatedLastName);
    }

    //singular input error message getter
    public String getSingularInputErrorMessage(){return myAccountInfoSingularInputError.getText();}

}
