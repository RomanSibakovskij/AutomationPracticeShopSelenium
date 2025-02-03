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
    private String noUpdatedEmail;
    private String testPassword;//(for no confirm password test)

    //too short singular input updated variables
    private String tooShortUpdatedFirstName;
    private String tooShortUpdatedLastName;
    private String tooShortUpdatedEmail;
    private String tooShortUpdatedPassword;
    private String tooShortUpdatedConfirmPassword;

    //too long singular input updated variables
    private String tooLongUpdatedFirstName;
    private String tooLongUpdatedLastName;
    private String tooLongUpdatedEmail;

    public MyAccountInfoInvalidScenariosPage(WebDriver driver) {super(driver);}

    //my account information missing singular user data input methods
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
    public void inputNoEmailIntoEmailInputField(){
        myAccountInfoEmailInputField.clear();
        noUpdatedEmail = "";
        logger.info("No updated user email: " + noUpdatedEmail);
        myAccountInfoEmailInputField.sendKeys(noUpdatedEmail);
    }
    public void inputNewPasswordForNoConfirmIntoNewPasswordInputField(){
        testPassword = "Fzczx@#$#@42";
        logger.info("New user password (for non-confirmation testing): " + testPassword);
        myAccountInfoNewPasswordInputField.sendKeys(testPassword);
    }

    //my account information too short singular user data input methods
    public void inputTooShortFirstNameIntoFirstNameInputField(){
        myAccountInfoFirstNameInputField.clear();
        tooShortUpdatedFirstName = "Z";
        logger.info("Too short updated user first name: " + tooShortUpdatedFirstName);
        myAccountInfoFirstNameInputField.sendKeys(tooShortUpdatedFirstName);
    }
    public void inputTooShortLastNameIntoLastNameInputField(){
        myAccountInfoLastNameInputField.clear();
        tooShortUpdatedLastName = "G";
        logger.info("Too short updated user last name: " + tooShortUpdatedLastName);
        myAccountInfoLastNameInputField.sendKeys(tooShortUpdatedLastName);
    }
    public void inputTooShortEmailIntoEmailInputField(){
        myAccountInfoEmailInputField.clear();
        tooShortUpdatedEmail = TestDataGenerator.generateRandomTooShortEmailAddress(1);
        logger.info("Too short updated user email: " + tooShortUpdatedEmail);
        myAccountInfoEmailInputField.sendKeys(tooShortUpdatedEmail);
    }
    public void inputTooShortNewPasswordIntoNewPasswordInputField(){
        tooShortUpdatedPassword = "Fdc2";
        logger.info("Too short updated user new password: " + tooShortUpdatedPassword);
        myAccountInfoNewPasswordInputField.sendKeys(tooShortUpdatedPassword);
    }
    public void inputTooShortConfirmPasswordIntoConfirmPasswordInputField(){
        tooShortUpdatedConfirmPassword = tooShortUpdatedPassword;
        logger.info("Too short updated user confirm (new) password: " + tooShortUpdatedConfirmPassword);
        myAccountInfoConfirmPasswordInputField.sendKeys(tooShortUpdatedConfirmPassword);
    }

    //my account information too long singular user data input methods
    public void inputTooLongFirstNameIntoFirstNameInputField(){
        myAccountInfoFirstNameInputField.clear();
        tooLongUpdatedFirstName = "Dcfdsadwsdfghfafrujkuykmjnsfdasff";
        logger.info("Too long updated user first name: " + tooLongUpdatedFirstName);
        myAccountInfoFirstNameInputField.sendKeys(tooLongUpdatedFirstName);
    }
    public void inputTooLongLastNameIntoLastNameInputField(){
        myAccountInfoLastNameInputField.clear();
        tooLongUpdatedLastName = "Xffdsadwsdfghfafrujkuykmjnsfdasff";
        logger.info("Too long updated user last name: " + tooLongUpdatedLastName);
        myAccountInfoLastNameInputField.sendKeys(tooLongUpdatedLastName);
    }
    public void inputTooLongEmailIntoEmailInputField(){
        myAccountInfoEmailInputField.clear();
        tooLongUpdatedEmail = TestDataGenerator.generateRandomTooLongEmailAddress(100);
        logger.info("Too long updated user email: " + tooLongUpdatedEmail);
        myAccountInfoEmailInputField.sendKeys(tooLongUpdatedEmail);
    }

    //singular input error message getter
    public String getSingularInputErrorMessage(){return myAccountInfoSingularInputError.getText();}

}
