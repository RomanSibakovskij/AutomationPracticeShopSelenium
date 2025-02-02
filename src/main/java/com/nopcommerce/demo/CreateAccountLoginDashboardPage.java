package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CreateAccountLoginDashboardPage extends BasePage {

    //create account & login dashboard page elements
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement createAccountLoginDashboardBreadcrumb;
    @FindBy(xpath = "//div[@id='center_column']/h1")
    private WebElement createAccountLoginDashboardTitle;
    //create account section
    @FindBy(xpath = "//div[@id='center_column']//div[@class='col-xs-12 col-sm-6'][1]//h3")
    private WebElement createAccountSectionTitle;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='col-xs-12 col-sm-6'][1]//p")
    private WebElement createAccountSectionHint;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='col-xs-12 col-sm-6'][1]//label")
    private WebElement createAccountSectionEmailSubtext;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='col-xs-12 col-sm-6'][1]//input[@id='email_create']")
    private WebElement createAccountSectionEmailInputField;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='col-xs-12 col-sm-6'][1]//button")
    private WebElement createAccountButton;
    //login section
    @FindBy(xpath = "//div[@id='center_column']//div[@class='col-xs-12 col-sm-6'][2]//h3")
    private WebElement loginSectionTitle;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='col-xs-12 col-sm-6'][2]//label[@for='email']")
    private WebElement loginSectionEmailSubtext;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='col-xs-12 col-sm-6'][2]//input[@id='email']")
    private WebElement loginSectionEmailInputField;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='col-xs-12 col-sm-6'][2]//label[@for='passwd']")
    private WebElement loginSectionPasswordSubtext;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='col-xs-12 col-sm-6'][2]//input[@id='passwd']")
    private WebElement loginSectionPasswordInputField;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='col-xs-12 col-sm-6'][2]//a")
    private WebElement loginSectionForgotPasswordLink;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='col-xs-12 col-sm-6'][2]//button")
    private WebElement signInButton;
    //invalid email address error element (create account section)
    @FindBy(xpath = "//div[@id='create_account_error']")
    private WebElement invalidInputErrorMessage;
    //invalid input error element (login section)
    @FindBy(xpath = "//div[@id='alert alert-danger']")
    private WebElement invalidLoginInputErrorMessage;

    //create account section data

    //valid variable (account creation)
    private static String validEmail = TestDataGenerator.generateRandomEmailAddress(8);
    //missing singular variable (account creation)
    private String noEmail = "";
    //too short email address input (1 char -> name, domain) (account creation)
    private String tooShortEmail = TestDataGenerator.generateRandomTooShortEmailAddress(1);
    //too long email address input (100 chars -> name, domain) (account creation)
    private String tooLongEmail = TestDataGenerator.generateRandomTooLongEmailAddress(100);
    //invalid singular variable format (missing '@') (account creation)
    private String invalidEmailFormat = "frerdr343fakemail.com";
    //existing singular variable format (used beforehand in manual testing) (account creation)
    private String existingEmail = "cortez3434@fakemail.com";

    //valid login section input data
    private String validLoginPassword;

    //missing singular login section input data
    private String noLoginPassword;

    //invalid singular input data
    private String invalidLoginEmail;
    private String invalidLoginPassword;

    //valid updated input data
    private String validUpdatedLoginEmail;
    private String validUpdatedLoginPassword;

    public CreateAccountLoginDashboardPage(WebDriver driver) {super(driver);}

    //valid login email input method (create account section)
    public void inputValidEmailIntoEmailInputField(){
        createAccountSectionEmailInputField.sendKeys(validEmail);
        logger.info("Valid user register email: " + validEmail);
    }

    //invalid singular input methods (create account section)

    //invalid login email input method - no user email address
    public void inputNoEmailIntoEmailInputField(){
        createAccountSectionEmailInputField.sendKeys(noEmail);
        logger.info("No user register email: " + noEmail);
    }
    //invalid login email input method - too short user email address
    public void inputTooShortEmailIntoEmailInputField(){
        createAccountSectionEmailInputField.sendKeys(tooShortEmail);
        logger.info("Too short user register email: " + tooShortEmail);
    }
    //invalid login email input method - too long user email address
    public void inputTooLongEmailIntoEmailInputField(){
        createAccountSectionEmailInputField.sendKeys(tooLongEmail);
        logger.info("Too long user register email: " + tooLongEmail);
    }
    //invalid login email input method - invalid user email address format
    public void inputInvalidEmailFormatIntoEmailInputField(){
        createAccountSectionEmailInputField.sendKeys(invalidEmailFormat);
        logger.info("Invalid user register email format: " + invalidEmailFormat);
    }
    //invalid login email input method - existing user email address (used beforehand in manual testing)
    public void inputExistingEmailIntoEmailInputField(){
        createAccountSectionEmailInputField.sendKeys(existingEmail);
        logger.info("Existing user register email: " + existingEmail);
    }

    //click 'Create an account' button method
    public void clickCreateAccountButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(createAccountButton).click().perform();
    }

    //valid login input data getter
    public void validLoginUserDataGetter(CreateAccountPage createAccountPage) {

        validLoginPassword = createAccountPage.getPassword();

        System.out.println("Valid login user data: " + "\n");
        logger.info("Valid login user email: " + getValidEmail());
        logger.info("Valid login user password: " + validLoginPassword);
        System.out.println("\n");

    }

    //valid login user data input methods
    public void inputValidLoginEmailIntoEmailInputField() {loginSectionEmailInputField.sendKeys(validEmail);}
    public void inputValidLoginPasswordIntoPasswordInputField() {loginSectionPasswordInputField.sendKeys(validLoginPassword);}

    //no singular input login data getters
    public void invalidLoginUserDataNoEmailGetter(CreateAccountPage createAccountPage) {

        noEmail = "";
        validLoginPassword = createAccountPage.getPassword();

        System.out.println("Invalid login user data (no login email): " + "\n");
        logger.info("No login user email: " + noEmail);
        logger.info("Valid login user password (no login email): " + validLoginPassword);
        System.out.println("\n");

    }
    public void invalidLoginUserDataNoPasswordGetter() {

        noLoginPassword = "";

        System.out.println("Invalid login user data (no login password): " + "\n");
        logger.info("Valid login user email (no login password): " + getValidEmail());
        logger.info("No login user password: " + noLoginPassword);
        System.out.println("\n");

    }

    //missing singular input methods
    public void inputNoLoginEmailIntoEmailInputField() {loginSectionEmailInputField.sendKeys(noEmail);}
    public void inputNoLoginPasswordIntoPasswordInputField() {loginSectionPasswordInputField.sendKeys(noLoginPassword);}

    //invalid singular input login data getters
    public void invalidLoginUserDataInvalidEmailGetter(CreateAccountPage createAccountPage) {

        invalidLoginEmail = "ghjhjhf@fakemail.com";
        validLoginPassword = createAccountPage.getPassword();

        System.out.println("Invalid login user data (invalid login email): " + "\n");
        logger.info("Invalid login user email: " + noEmail);
        logger.info("Valid login user password (invalid login email): " + validLoginPassword);
        System.out.println("\n");

    }
    public void invalidLoginUserDataInvalidPasswordGetter() {

        invalidLoginPassword = "Hbvbcxvxc*&(*&^(*";

        System.out.println("Invalid login user data (invalid login password): " + "\n");
        logger.info("Valid login user email (invalid login password): " + getValidEmail());
        logger.info("Invalid login user password: " + invalidLoginPassword);
        System.out.println("\n");

    }

    //invalid singular input methods
    public void inputInvalidLoginEmailIntoEmailInputField() {loginSectionEmailInputField.sendKeys(invalidLoginEmail);}
    public void inputInvalidLoginPasswordIntoPasswordInputField() {loginSectionPasswordInputField.sendKeys(invalidLoginPassword);}

    //valid updated login data getters
    public void validUpdatedEmailUserDataGetter(MyAccountInformationPage myAccountInformationPage, CreateAccountPage createAccountPage) {

        validUpdatedLoginEmail = myAccountInformationPage.getUpdatedEmail();
        validLoginPassword = createAccountPage.getPassword();

        System.out.println("Valid updated user data (updated email): " + "\n");
        logger.info("Valid updated user email: " + validUpdatedLoginEmail);
        logger.info("Valid login user password (updated email): " + validLoginPassword);
        System.out.println("\n");

    }
    public void validUpdatedPasswordUserDataGetter(MyAccountInformationPage myAccountInformationPage) {

        validUpdatedLoginPassword = myAccountInformationPage.getUpdatedPassword();

        System.out.println("Valid updated user data (updated password): " + "\n");
        logger.info("Valid user email (updated password): " + getValidEmail());
        logger.info("Valid updated user password: " + validUpdatedLoginPassword);
        System.out.println("\n");

    }

    //valid updated singular input methods
    public void inputUpdatedLoginEmailIntoEmailInputField() {loginSectionEmailInputField.sendKeys(validUpdatedLoginEmail);}
    public void inputUpdatedLoginPasswordIntoPasswordInputField() {loginSectionPasswordInputField.sendKeys(validUpdatedLoginPassword);}

    //click 'Sign In' button method
    public void clickSignInButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInButton).click().perform();
    }

    //create account login dashboard page text element getters
    public String getCreateAccountLoginDashboardTitle() {return createAccountLoginDashboardTitle.getText();}
    public String getCreateAccountSectionTitle() {return createAccountSectionTitle.getText();}
    public String getCreateAccountSectionHint() {return createAccountSectionHint.getText();}
    public String getCreateAccountSectionEmailSubtext() {return createAccountSectionEmailSubtext.getText();}
    public String getLoginSectionTitle() {return loginSectionTitle.getText();}
    public String getLoginSectionEmailSubtext() {return loginSectionEmailSubtext.getText();}
    public String getLoginSectionPasswordSubtext() {return loginSectionPasswordSubtext.getText();}

    //invalid error message getters
    public String getInvalidInputErrorMessageText(){return invalidInputErrorMessage.getText();}
    public String getInvalidLoginInputErrorMessageText(){return invalidLoginInputErrorMessage.getText();}

    //email getter
    public String getValidEmail() {
        if (validEmail == null) {
            validEmail = TestDataGenerator.generateRandomEmailAddress(8);
        }
        return validEmail;
    }

    //create account login dashboard page web elements
    public boolean isLoginDashboardBreadcrumbDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountLoginDashboardBreadcrumb));
        return createAccountLoginDashboardBreadcrumb.isDisplayed();
    }
    public boolean isLoginDashboardTitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountLoginDashboardTitle));
        return createAccountLoginDashboardTitle.isDisplayed();
    }
    public boolean isCreateAccountSectionTitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountSectionTitle));
        return createAccountSectionTitle.isDisplayed();
    }
    public boolean isCreateAccountSectionHintDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountSectionHint));
        return createAccountSectionHint.isDisplayed();
    }
    public boolean isCreateAccountSectionEmailSubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountSectionEmailSubtext));
        return createAccountSectionEmailSubtext.isDisplayed();
    }
    public boolean isCreateAccountSectionEmailInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountSectionEmailInputField));
        return createAccountSectionEmailInputField.isDisplayed();
    }
    public boolean isCreateAccountButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountButton));
        return createAccountButton.isDisplayed();
    }
    public boolean isLoginSectionTitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(loginSectionTitle));
        return loginSectionTitle.isDisplayed();
    }
    public boolean isLoginSectionEmailSubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(loginSectionEmailSubtext));
        return loginSectionEmailSubtext.isDisplayed();
    }
    public boolean isLoginSectionEmailInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(loginSectionEmailInputField));
        return loginSectionEmailInputField.isDisplayed();
    }
    public boolean isLoginSectionPasswordSubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(loginSectionPasswordSubtext));
        return loginSectionPasswordSubtext.isDisplayed();
    }
    public boolean isLoginSectionPasswordInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(loginSectionPasswordInputField));
        return loginSectionPasswordInputField.isDisplayed();
    }
    public boolean isLoginSectionForgotPasswordDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(loginSectionForgotPasswordLink));
        return loginSectionForgotPasswordLink.isDisplayed();
    }
    public boolean isSignInButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(signInButton));
        return signInButton.isDisplayed();
    }


}
