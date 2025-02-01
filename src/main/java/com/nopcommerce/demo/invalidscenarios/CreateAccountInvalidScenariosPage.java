package com.nopcommerce.demo.invalidscenarios;

import com.nopcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CreateAccountInvalidScenariosPage extends BasePage {

    @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElement createAccountFirstNameInputField;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement createAccountLastNameInputField;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement createAccountEmailInputField;
    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement createAccountPasswordInputField;
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement createAccountMissingSingularInputError;

    //valid singular input(for other tests)
    private String maleFirstName;
    private String lastName;
    private String password;

    //missing singular input
    private String noFirstName;
    private String noLastName;
    private String noPassword;

    //too short singular input
    private String tooShortFirstName;
    private String tooShortLastName;
    private String tooShortPassword;

    public CreateAccountInvalidScenariosPage(WebDriver driver) {super(driver);}

    //no singular input test data getters
    public void invalidUserInputDataNoFirstNameGetter(){
        noFirstName = "";
        lastName = TestDataGenerator.getRandomLastName();
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user input data (no first name): " + "\n");
        logger.info("No user first name: " + noFirstName);
        logger.info("Valid user last name (no first name): " + lastName);
        logger.info("Valid user password (no first name): " + password);
        System.out.println("\n");
    }
    public void invalidUserInputDataNoLastNameGetter(){
        maleFirstName = TestDataGenerator.getRandomMaleFirstName();
        noLastName = "";
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user input data (no last name): " + "\n");
        logger.info("Valid user first name (no last name): " + maleFirstName);
        logger.info("No user last name: " + noLastName);
        logger.info("Valid user password (no last name): " + password);
        System.out.println("\n");
    }
    public void invalidUserInputDataNoPasswordGetter(){
        maleFirstName = TestDataGenerator.getRandomMaleFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        noPassword = "";

        System.out.println("Invalid generated user input data (no password): " + "\n");
        logger.info("Valid user first name (no password): " + maleFirstName);
        logger.info("Valid user last name (no password): " + lastName);
        logger.info("No user password: " + noPassword);
        System.out.println("\n");
    }

    //too short singular input test data getters
    public void invalidUserInputDataTooShortFirstNameGetter(){
        tooShortFirstName = "B";
        lastName = TestDataGenerator.getRandomLastName();
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user input data (too short first name): " + "\n");
        logger.info("Too short user first name: " + tooShortFirstName);
        logger.info("Valid user last name (too short first name): " + lastName);
        logger.info("Valid user password (too short first name): " + password);
        System.out.println("\n");
    }
    public void invalidUserInputDataTooShortLastNameGetter(){
        maleFirstName = TestDataGenerator.getRandomMaleFirstName();
        tooShortLastName = "M";
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user input data (too short last name): " + "\n");
        logger.info("Valid user first name (too short last name): " + maleFirstName);
        logger.info("Too short user last name: " + tooShortLastName);
        logger.info("Valid user password (too short last name): " + password);
        System.out.println("\n");
    }
    public void invalidUserInputDataTooShortPasswordGetter(){
        maleFirstName = TestDataGenerator.getRandomMaleFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        tooShortPassword = "Fr5$";

        System.out.println("Invalid generated user input data (too short password): " + "\n");
        logger.info("Valid user first name (too short password): " + maleFirstName);
        logger.info("Valid user last name (too short password): " + lastName);
        logger.info("Too short user password: " + tooShortPassword);
        System.out.println("\n");
    }

    //valid user data input methods
    public void inputMaleFirstNameIntoFirstNameInputField(){createAccountFirstNameInputField.sendKeys(maleFirstName);}
    public void inputLastNameIntoLastNameInputField(){createAccountLastNameInputField.sendKeys(lastName);}
    public void inputPasswordIntoPasswordInputField(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", createAccountPasswordInputField);
        createAccountPasswordInputField.sendKeys(password);
    }

    //no singular input methods
    public void inputNoFirstNameIntoFirstNameInputField(){createAccountFirstNameInputField.sendKeys(noFirstName);}
    public void inputNoLastNameIntoLastNameInputField(){createAccountLastNameInputField.sendKeys(noLastName);}
    public void inputNoEmailIntoEmailInputField(){createAccountEmailInputField.clear();}
    public void inputNoPasswordIntoPasswordInputField(){createAccountPasswordInputField.sendKeys(noPassword);}

    //too short singular input methods
    public void inputTooShortFirstNameIntoFirstNameInputField(){createAccountFirstNameInputField.sendKeys(tooShortFirstName);}
    public void inputTooShortLastNameIntoLastNameInputField(){createAccountLastNameInputField.sendKeys(tooShortLastName);}
    public void inputTooShortPasswordIntoLastNameInputField(){createAccountPasswordInputField.sendKeys(tooShortPassword);}

    //missing singular input error getter
    public String getMissingSingularInputError(){return createAccountMissingSingularInputError.getText();}

}
