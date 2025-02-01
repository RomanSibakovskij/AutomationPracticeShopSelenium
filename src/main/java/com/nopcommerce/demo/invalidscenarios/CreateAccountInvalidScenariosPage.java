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

    public CreateAccountInvalidScenariosPage(WebDriver driver) {super(driver);}

    //no singular input test data getters
    public void invalidUserInputDataNoFirstNameGetter(){
        noFirstName = "";
        lastName = TestDataGenerator.getRandomLastName();
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Invalid generated user input data (no first name): " + "\n");
        logger.info("No user first name (no first name): " + noFirstName);
        logger.info("Valid user last name (no first name): " + lastName);
        logger.info("Valid user password (no first name): " + password);
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

    //no singular input
    public void inputNoFirstNameIntoFirstNameInputField(){createAccountFirstNameInputField.sendKeys(noFirstName);}

    //missing singular input error getter
    public String getMissingSingularInputError(){return createAccountMissingSingularInputError.getText();}

}
