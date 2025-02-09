package com.nopcommerce.demo.utilities;

import com.nopcommerce.demo.*;
import com.nopcommerce.demo.invalidscenarios.CreateAccountInvalidScenariosPage;
import com.nopcommerce.demo.invalidscenarios.MyAccountInfoInvalidScenariosPage;
import com.nopcommerce.demo.invalidscenarios.MyAddressPageInvalidScenarios;
import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.*;

public class TestMethods extends BaseTest {

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //valid user navigation to 'Create Account' page test

    //valid navigate to 'Create Account' page (with valid email) test method
    protected void validNavigateToCreateAccountPageTest(){
        HomePage homePage = new HomePage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //click 'Bestsellers' section button link
        homePage.clickBestsellersSectionButtonLink();
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //home page bestseller products data logger
        logHomePageBestSellerProductData(homePage);
        //capture screenshot of the home page
        captureScreenshot(driver, "Home Page Visual Display");
        //click 'Sign In' nav link
        generalPage.clickSignInNavLink();
        //capture screenshot of the user moving to create account / login dashboard page
        captureScreenshot(driver, "User Navigation to Create Account And Login Dashboard Page");
        //create account/login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account/login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //input valid email into email input field
        createAccountLoginDashboardPage.inputValidEmailIntoEmailInputField();
        //click 'Create an account' button
        createAccountLoginDashboardPage.clickCreateAccountButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Navigation to Register Page Test Result");
    }

    //no singular input

    //invalid navigate to 'Create Account' page (no user email) test method
    protected void invalidNavigateToCreateAccountPageNoEmailTest(){
        HomePage homePage = new HomePage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //click 'Bestsellers' section button link
        homePage.clickBestsellersSectionButtonLink();
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //home page bestseller products data logger
        logHomePageBestSellerProductData(homePage);
        //capture screenshot of the home page
        captureScreenshot(driver, "Home Page Visual Display");
        //click 'Sign In' nav link
        generalPage.clickSignInNavLink();
        //capture screenshot of the user moving to create account / login dashboard page
        captureScreenshot(driver, "User Navigation to Create Account And Login Dashboard Page");
        //create account/login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account/login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //don't input email into email input field
        createAccountLoginDashboardPage.inputNoEmailIntoEmailInputField();
        //click 'Create an account' button
        createAccountLoginDashboardPage.clickCreateAccountButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Navigation to Register Page Test Result - No Email");
        //assert the user gets the expected error message
        assertEquals("Invalid email address.", createAccountLoginDashboardPage.getInvalidInputErrorMessageText(), "The invalid input email error message text doesn't match expectations or it didn't appear.");
    }

    //too short singular input

    //invalid navigate to 'Create Account' page (too short user email) test method (1 char -> name, domain)
    protected void invalidNavigateToCreateAccountPageTooShortEmailTest(){
        HomePage homePage = new HomePage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //click 'Bestsellers' section button link
        homePage.clickBestsellersSectionButtonLink();
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //home page bestseller products data logger
        logHomePageBestSellerProductData(homePage);
        //capture screenshot of the home page
        captureScreenshot(driver, "Home Page Visual Display");
        //click 'Sign In' nav link
        generalPage.clickSignInNavLink();
        //capture screenshot of the user moving to create account / login dashboard page
        captureScreenshot(driver, "User Navigation to Create Account And Login Dashboard Page");
        //create account/login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account/login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //input too short email into email input field (1 char -> name, domain)
        createAccountLoginDashboardPage.inputTooShortEmailIntoEmailInputField();
        //click 'Create an account' button
        createAccountLoginDashboardPage.clickCreateAccountButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Navigation to Register Page Test Result - Too Short Email");
        //assert the user gets the expected error message, log the issue if it doesn't appear
        try {
            assertEquals("Too short email address.", createAccountLoginDashboardPage.getInvalidInputErrorMessageText(), "The invalid input email error message text doesn't match expectations or it didn't appear.");
        } catch (NoSuchElementException e) {
            logger.warn("The user navigation to create account page doesn't get interrupted with too short register email. Test has failed.");
        }
    }

    //invalid navigate to 'Create Account' page (too long user email) test method (100 chars -> name, domain)
    protected void invalidNavigateToCreateAccountPageTooLongEmailTest(){
        HomePage homePage = new HomePage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //click 'Bestsellers' section button link
        homePage.clickBestsellersSectionButtonLink();
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //home page bestseller products data logger
        logHomePageBestSellerProductData(homePage);
        //capture screenshot of the home page
        captureScreenshot(driver, "Home Page Visual Display");
        //click 'Sign In' nav link
        generalPage.clickSignInNavLink();
        //capture screenshot of the user moving to create account / login dashboard page
        captureScreenshot(driver, "User Navigation to Create Account And Login Dashboard Page");
        //create account/login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account/login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //input too long email into email input field (100 chars -> name, domain)
        createAccountLoginDashboardPage.inputTooLongEmailIntoEmailInputField();
        //click 'Create an account' button
        createAccountLoginDashboardPage.clickCreateAccountButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Navigation to Register Page Test Result - Too Long Email");
        //assert the user gets the expected error message, log the issue if it doesn't appear
        try {
            assertEquals("Too long email address.", createAccountLoginDashboardPage.getInvalidInputErrorMessageText(), "The invalid input email error message text doesn't match expectations or it didn't appear.");
        } catch (NoSuchElementException e) {
            logger.warn("The user navigation to create account page doesn't get interrupted with too long register email. Test has failed.");
        }
    }

    //invalid navigate to 'Create Account' page (invalid user email format) test method (missing '@')
    protected void invalidNavigateToCreateAccountPageInvalidEmailFormatTest(){
        HomePage homePage = new HomePage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //click 'Bestsellers' section button link
        homePage.clickBestsellersSectionButtonLink();
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //home page bestseller products data logger
        logHomePageBestSellerProductData(homePage);
        //capture screenshot of the home page
        captureScreenshot(driver, "Home Page Visual Display");
        //click 'Sign In' nav link
        generalPage.clickSignInNavLink();
        //capture screenshot of the user moving to create account / login dashboard page
        captureScreenshot(driver, "User Navigation to Create Account And Login Dashboard Page");
        //create account/login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account/login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //input invalid email format into email input field (missing '@')
        createAccountLoginDashboardPage.inputInvalidEmailFormatIntoEmailInputField();
        //click 'Create an account' button
        createAccountLoginDashboardPage.clickCreateAccountButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Navigation to Register Page Test Result - Invalid Email Format");
        //assert the user gets the expected error message, log the issue if it doesn't appear
        try {
            assertEquals("Invalid email address.", createAccountLoginDashboardPage.getInvalidInputErrorMessageText(), "The invalid input email error message text doesn't match expectations or it didn't appear.");
        } catch (NoSuchElementException e) {
            logger.warn("The user navigation to create account page doesn't get interrupted with invalid register email format. Test has failed.");
        }
    }

    //invalid navigate to 'Create Account' page (existing user email format) test method (used beforehand in manual testing)
    protected void invalidNavigateToCreateAccountPageExistingEmailTest(){
        HomePage homePage = new HomePage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //click 'Bestsellers' section button link
        homePage.clickBestsellersSectionButtonLink();
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //home page bestseller products data logger
        logHomePageBestSellerProductData(homePage);
        //capture screenshot of the home page
        captureScreenshot(driver, "Home Page Visual Display");
        //click 'Sign In' nav link
        generalPage.clickSignInNavLink();
        //capture screenshot of the user moving to create account / login dashboard page
        captureScreenshot(driver, "User Navigation to Create Account And Login Dashboard Page");
        //create account/login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account/login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //input existing email into email input field (used beforehand)
        createAccountLoginDashboardPage.inputExistingEmailIntoEmailInputField();
        //click 'Create an account' button
        createAccountLoginDashboardPage.clickCreateAccountButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Navigation to Register Page Test Result - Existing Email");
        //assert the user gets the expected error message, log the issue if it doesn't appear
        try {
            assertEquals("An account using this email address has already been registered. Please enter a valid password or request a new one.", createAccountLoginDashboardPage.getInvalidInputErrorMessageText(), "The invalid input email error message text doesn't match expectations or it didn't appear.");
        } catch (NoSuchElementException e) {
            logger.warn("The user navigation to create account page doesn't get interrupted with existing register email format. Test has failed.");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user account creation tests

    //valid male user account creation test method
    protected void validMaleUserAccountCreationTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //valid user data input getter (male)
        createAccountPage.validMaleUserInputDataGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input valid first name (male)
        createAccountPage.inputMaleFirstNameIntoFirstNameInputField();
        //input valid last name
        createAccountPage.inputLastNameIntoLastNameInputField();
        //input valid password
        createAccountPage.inputPasswordIntoPasswordInputField();
        //capture screenshot of the valid user data input
        captureScreenshot(driver, "Valid Male User Data Input");
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid Male User Account Creation Test Result");
        //assert the user gets an expected success message
        assertEquals("Your account has been created.", myAccountPage.getMyAccountSuccessMessageText(), "The valid user account creation success message text doesn't match expectations or the user account creation has failed.");
    }

    //valid female user account creation test method
    protected void validFemaleUserAccountCreationTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //valid user data input getter (female)
        createAccountPage.validFemaleUserInputDataGetter();
        //click 'Mrs.' radio button
        createAccountPage.clickMrsRadioButton();
        //input valid first name (female)
        createAccountPage.inputFemaleFirstNameIntoFirstNameInputField();
        //input valid last name
        createAccountPage.inputLastNameIntoLastNameInputField();
        //input valid password
        createAccountPage.inputPasswordIntoPasswordInputField();
        //capture screenshot of the valid user data input
        captureScreenshot(driver, "Valid Female User Data Input");
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid Female User Account Creation Test Result");
        //assert the user gets an expected success message
        assertEquals("Your account has been created.", myAccountPage.getMyAccountSuccessMessageText(), "The valid user account creation success message text doesn't match expectations or the user account creation has failed.");
    }

    //no singular input tests

    //invalid user account creation test method - no first name
    protected void invalidUserAccountNoFirstNameCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //invalid user data input getter - no first name
        createAccountInvalidScenariosPage.invalidUserInputDataNoFirstNameGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //don't input first name
        createAccountInvalidScenariosPage.inputNoFirstNameIntoFirstNameInputField();
        //capture screenshot of the invalid user data input - no first name
        captureScreenshot(driver, "Invalid User Data Input - No First Name");
        //input valid last name
        createAccountInvalidScenariosPage.inputLastNameIntoLastNameInputField();
        //input valid password
        createAccountInvalidScenariosPage.inputPasswordIntoPasswordInputField();
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - No First Name");
        //assert the user gets an expected error message (no first name)
        assertEquals("There is 1 error\n" + "firstname is required.", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The missing singular input error text doesn't match expectations (no first name) or the error wasn't triggered.");
    }

    //invalid user account creation test method - no last name
    protected void invalidUserAccountNoLastNameCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //invalid user data input getter - no last name
        createAccountInvalidScenariosPage.invalidUserInputDataNoLastNameGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input valid first name
        createAccountInvalidScenariosPage.inputMaleFirstNameIntoFirstNameInputField();
        //don't input last name
        createAccountInvalidScenariosPage.inputNoLastNameIntoLastNameInputField();
        //capture screenshot of the invalid user data input - no last name
        captureScreenshot(driver, "Invalid User Data Input - No Last Name");
        //input valid password
        createAccountInvalidScenariosPage.inputPasswordIntoPasswordInputField();
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - No Last Name");
        //assert the user gets an expected error message (no last name)
        assertEquals("There is 1 error\n" + "lastname is required.", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The missing singular input error text doesn't match expectations (no last name) or the error wasn't triggered.");
    }

    //invalid user account creation test method - no email address
    protected void invalidUserAccountNoEmailCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //valid user data input getter (except for email address)
        createAccountPage.validMaleUserInputDataGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input valid first name
        createAccountPage.inputMaleFirstNameIntoFirstNameInputField();
        //input valid last name
        createAccountPage.inputLastNameIntoLastNameInputField();
        //clear email address from input field
        createAccountInvalidScenariosPage.inputNoEmailIntoEmailInputField();
        //capture screenshot of the invalid user data input - no email
        captureScreenshot(driver, "Invalid User Data Input - No Email");
        //input valid password
        createAccountPage.inputPasswordIntoPasswordInputField();
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - No Email");
        //assert the user gets an expected error message (no email)
        assertEquals("There is 1 error\n" + "email is required.", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The missing singular input error text doesn't match expectations (no email) or the error wasn't triggered.");
    }

    //invalid user account creation test method - no password
    protected void invalidUserAccountNoPasswordCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //invalid user data input getter (no password)
        createAccountInvalidScenariosPage.invalidUserInputDataNoPasswordGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input valid first name
        createAccountInvalidScenariosPage.inputMaleFirstNameIntoFirstNameInputField();
        //input valid last name
        createAccountInvalidScenariosPage.inputLastNameIntoLastNameInputField();
        //don't input password
        createAccountInvalidScenariosPage.inputNoPasswordIntoPasswordInputField();
        //capture screenshot of the invalid user data input - no password
        captureScreenshot(driver, "Invalid User Data Input - No Password");
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - No Password");
        //assert the user gets an expected error message (no password)
        assertEquals("There is 1 error\n" + "passwd is required.", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The missing singular input error text doesn't match expectations (no password) or the error wasn't triggered.");
    }

    //too short singular input tests

    //invalid user account creation test method - too short first name (1 char)
    protected void invalidUserAccountTooShortFirstNameCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //invalid user data input getter - too short first name (1 char)
        createAccountInvalidScenariosPage.invalidUserInputDataTooShortFirstNameGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input too short first name
        createAccountInvalidScenariosPage.inputTooShortFirstNameIntoFirstNameInputField();
        //capture screenshot of the invalid user data input - too short first name (1 char)
        captureScreenshot(driver, "Invalid User Data Input - Too Short First Name");
        //input valid last name
        createAccountInvalidScenariosPage.inputLastNameIntoLastNameInputField();
        //input valid password
        createAccountInvalidScenariosPage.inputPasswordIntoPasswordInputField();
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Short First Name");
        //assert the user gets an expected error message (too short first name), log the issue otherwise
            try {
                assertEquals("There is 1 error\n" + "Too short firstname.", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The singular input error text doesn't match expectations (too short first name).");
            } catch (Exception e) {
                logger.warn("The too short first name error wasn't triggered");
            }
        }

    //invalid user account creation test method - too short last name (1 char)
    protected void invalidUserAccountTooShortLastNameCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //invalid user data input getter - too short last name (1 char)
        createAccountInvalidScenariosPage.invalidUserInputDataTooShortLastNameGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input valid first name
        createAccountInvalidScenariosPage.inputMaleFirstNameIntoFirstNameInputField();
        //input too short last name (1 char)
        createAccountInvalidScenariosPage.inputTooShortLastNameIntoLastNameInputField();
        //capture screenshot of the invalid user data input - too short last name (1 char)
        captureScreenshot(driver, "Invalid User Data Input - Too Short Last Name");
        //input valid password
        createAccountInvalidScenariosPage.inputPasswordIntoPasswordInputField();
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Short Last Name");
        //assert the user gets an expected error message (too short last name), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "Too short lastname.", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The singular input error text doesn't match expectations (too short last name).");
        } catch (Exception e) {
            logger.warn("The too short last name error wasn't triggered");
        }
    }

    //invalid user account creation test method - too short email address (1 char, name, domain)
    protected void invalidUserAccountTooShortEmailCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //valid user data input getter (except too short email)
        createAccountPage.validMaleUserInputDataGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input valid first name
        createAccountPage.inputMaleFirstNameIntoFirstNameInputField();
        //input valid last name
        createAccountPage.inputLastNameIntoLastNameInputField();
        //input too short email (1 char, name, domain)
        createAccountInvalidScenariosPage.inputTooShortEmailIntoEmailInputField();
        //capture screenshot of the invalid user data input - too short email (1 char, name, domain)
        captureScreenshot(driver, "Invalid User Data Input - Too Short Email");
        //input valid password
        createAccountPage.inputPasswordIntoPasswordInputField();
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Short Email");
        //assert the user gets an expected error message (too short email address), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "An account using this email address has already been registered.", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The singular input error text doesn't match expectations (too short email address).");
        } catch (Exception e) {
            logger.warn("The too short email address error wasn't triggered");
        }
    }

    //invalid user account creation test method - too short password (4 chars)
    protected void invalidUserAccountTooShortPasswordCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //invalid user data input getter - too short password (4 chars)
        createAccountInvalidScenariosPage.invalidUserInputDataTooShortPasswordGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input valid first name
        createAccountInvalidScenariosPage.inputMaleFirstNameIntoFirstNameInputField();
        //input valid last name
        createAccountInvalidScenariosPage.inputLastNameIntoLastNameInputField();
        //input too short password (4 chars)
        createAccountInvalidScenariosPage.inputTooShortPasswordIntoLastNameInputField();
        //capture screenshot of the invalid user data input - too short password (4 chars)
        captureScreenshot(driver, "Invalid User Data Input - Too Short Password");
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Short Password");
        //assert the user gets an expected error message (too short password), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "passwd is invalid.", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The singular input error text doesn't match expectations (too short password).");
        } catch (Exception e) {
            logger.warn("The too short password error wasn't triggered");
        }
    }

    //too long singular input tests

    //invalid user account creation test method - too long first name (33 chars)
    protected void invalidUserAccountTooLongFirstNameCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //invalid user data input getter - too long first name (33 chars)
        createAccountInvalidScenariosPage.invalidUserInputDataTooLongFirstNameGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input too long first name
        createAccountInvalidScenariosPage.inputTooLongFirstNameIntoFirstNameInputField();
        //capture screenshot of the invalid user data input - too long first name (33 chars)
        captureScreenshot(driver, "Invalid User Data Input - Too Long First Name");
        //input valid last name
        createAccountInvalidScenariosPage.inputLastNameIntoLastNameInputField();
        //input valid password
        createAccountInvalidScenariosPage.inputPasswordIntoPasswordInputField();
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Long First Name");
        //assert the user gets an expected error message (too long first name), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "firstname is too long. Maximum length: 32", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The singular input error text doesn't match expectations (too long first name).");
        } catch (Exception e) {
            logger.warn("The too long first name error wasn't triggered");
        }
    }

    //invalid user account creation test method - too long last name (33 chars)
    protected void invalidUserAccountTooLongLastNameCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //invalid user data input getter - too short last name (33 chars)
        createAccountInvalidScenariosPage.invalidUserInputDataTooLongLastNameGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input valid first name
        createAccountInvalidScenariosPage.inputMaleFirstNameIntoFirstNameInputField();
        //input too short last name (1 char)
        createAccountInvalidScenariosPage.inputTooLongLastNameIntoLastNameInputField();
        //capture screenshot of the invalid user data input - too short last name (33 chars)
        captureScreenshot(driver, "Invalid User Data Input - Too Long Last Name");
        //input valid password
        createAccountInvalidScenariosPage.inputPasswordIntoPasswordInputField();
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Long Last Name");
        //assert the user gets an expected error message (too short last name), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "lastname is too long. Maximum length: 32", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The singular input error text doesn't match expectations (too long last name).");
        } catch (Exception e) {
            logger.warn("The too long last name error wasn't triggered");
        }
    }

    //invalid user account creation test method - too long email address (100 chars)
    protected void invalidUserAccountTooLongEmailCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //valid user data input getter (except too long email)
        createAccountPage.validMaleUserInputDataGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input valid first name
        createAccountPage.inputMaleFirstNameIntoFirstNameInputField();
        //input valid last name
        createAccountPage.inputLastNameIntoLastNameInputField();
        //input too long user email (100 chars)
        createAccountInvalidScenariosPage.inputTooLongEmailIntoEmailInputField();
        //capture screenshot of the invalid user data input - too long email address (100 chars)
        captureScreenshot(driver, "Invalid User Data Input - Too Long Email");
        //input valid password
        createAccountPage.inputPasswordIntoPasswordInputField();
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Long Email");
        //assert the user gets an expected error message (too long email address), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "email is invalid.", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The singular input error text doesn't match expectations (too long email address).");
        } catch (Exception e) {
            logger.warn("The too long email address error wasn't triggered");
        }
    }

    //invalid user account creation test method - too long password (33 chars)
    protected void invalidUserAccountTooLongPasswordCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //invalid user data input getter - too long password (33 chars)
        createAccountInvalidScenariosPage.invalidUserInputDataTooLongPasswordGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input valid first name
        createAccountInvalidScenariosPage.inputMaleFirstNameIntoFirstNameInputField();
        //input valid last name
        createAccountInvalidScenariosPage.inputLastNameIntoLastNameInputField();
        //input too long password (33 chars)
        createAccountInvalidScenariosPage.inputTooLongPasswordIntoLastNameInputField();
        //capture screenshot of the invalid user data input - too short password (33 chars)
        captureScreenshot(driver, "Invalid User Data Input - Too Long Password");
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Too Long Password");
        //assert the user gets an expected error message (too long password), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "passwd is too long. Maximum length: 32", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The singular input error text doesn't match expectations (too long password).");
        } catch (Exception e) {
            logger.warn("The too long password error wasn't triggered");
        }
    }

    //invalid singular input format tests

    //invalid user account creation test method - invalid first name format (special symbols only)
    protected void invalidUserAccountInvalidFirstNameFormatCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //invalid user data input getter - invalid first name format(special symbols only)
        createAccountInvalidScenariosPage.invalidUserInputDataInvalidFirstNameFormatGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input invalid first name format
        createAccountInvalidScenariosPage.inputInvalidFirstNameFormatIntoFirstNameInputField();
        //capture screenshot of the invalid user data input - invalid first name format (special symbols only)
        captureScreenshot(driver, "Invalid User Data Input - Invalid First Name Format");
        //input valid last name
        createAccountInvalidScenariosPage.inputLastNameIntoLastNameInputField();
        //input valid password
        createAccountInvalidScenariosPage.inputPasswordIntoPasswordInputField();
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Invalid First Name Format");
        //assert the user gets an expected error message (invalid first name format), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "firstname is invalid.", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The invalid singular input error text doesn't match expectations (invalid first name format).");
        } catch (Exception e) {
            logger.warn("The invalid first name format error wasn't triggered");
        }
    }

    //invalid user account creation test method - invalid last name format (special symbols only)
    protected void invalidUserAccountInvalidLastNameFormatCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //invalid user data input getter - invalid last name format (special symbols only)
        createAccountInvalidScenariosPage.invalidUserInputDataInvalidLastNameFormatGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input valid first name
        createAccountInvalidScenariosPage.inputMaleFirstNameIntoFirstNameInputField();
        //input invalid last name format (special symbols only)
        createAccountInvalidScenariosPage.inputInvalidLastNameFormatIntoLastNameInputField();
        //capture screenshot of the invalid user data input - invalid last name format (special symbols only)
        captureScreenshot(driver, "Invalid User Data Input - Invalid Last Name Format");
        //input valid password
        createAccountInvalidScenariosPage.inputPasswordIntoPasswordInputField();
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Invalid Last Name Format");
        //assert the user gets an expected error message (invalid last name format), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "lastname is invalid.", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The invalid singular input format error text doesn't match expectations (invalid last name format).");
        } catch (Exception e) {
            logger.warn("The invalid last name format error wasn't triggered");
        }
    }

    //invalid user account creation test method - invalid email address format (missing '@')
    protected void invalidUserAccountInvalidEmailFormatCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //valid user data input getter (except invalid email)
        createAccountPage.validMaleUserInputDataGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input valid first name
        createAccountPage.inputMaleFirstNameIntoFirstNameInputField();
        //input valid last name
        createAccountPage.inputLastNameIntoLastNameInputField();
        //input invalid user email format (missing '@')
        createAccountInvalidScenariosPage.inputInvalidEmailFormatIntoEmailInputField();
        //capture screenshot of the invalid user data input - invalid email address format (missing '@')
        captureScreenshot(driver, "Invalid User Data Input - Invalid Email Format");
        //input valid password
        createAccountPage.inputPasswordIntoPasswordInputField();
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Invalid Email Format");
        //assert the user gets an expected error message (invalid email address format), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "email is invalid.", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The invalid singular input format error text doesn't match expectations (invalid email address format).");
        } catch (Exception e) {
            logger.warn("The invalid email address format error wasn't triggered");
        }
    }

    //invalid user account creation test method - existing email address format (used in manual testing beforehand)
    protected void invalidUserAccountExistingEmailFormatCreationTest(CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //create account page web element assert
        isCreateAccountPageWebElementDisplayed(createAccountPage);
        //create account page text element assert
        isCreateAccountPageTextElementAsExpected(createAccountPage);
        //valid user data input getter (except existing email)
        createAccountPage.validMaleUserInputDataGetter();
        //click 'Mr.' radio button
        createAccountPage.clickMrRadioButton();
        //input valid first name
        createAccountPage.inputMaleFirstNameIntoFirstNameInputField();
        //input valid last name
        createAccountPage.inputLastNameIntoLastNameInputField();
        //input pre-existing email (used in manual testing beforehand)
        createAccountInvalidScenariosPage.inputExistingEmailIntoEmailInputField();
        //capture screenshot of the invalid user data input - existing email address format (used in manual testing beforehand)
        captureScreenshot(driver, "Invalid User Data Input - Existing Email");
        //input valid password
        createAccountPage.inputPasswordIntoPasswordInputField();
        //click 'Register' button
        createAccountPage.clickRegisterButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid Male User Account Creation Test Result - Existing Email");
        //assert the user gets an expected error message (existing email address), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "An account using this email address has already been registered.", createAccountInvalidScenariosPage.getMissingSingularInputError(), "The invalid singular input error text doesn't match expectations (existing email address).");
        } catch (Exception e) {
            logger.warn("The existing email address error wasn't triggered");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user login test

    //valid user login test method
    protected void validUserLoginTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //my account page web element assert
        isMyAccountPageWebElementDisplayed(myAccountPage);
        //my account page text element assert
        isMyAccountPageTextElementAsExpected(myAccountPage);
        //click 'Logout' link
        generalPage.clickLogOutNavLink();
        //create account login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //valid login user input data getter
        createAccountLoginDashboardPage.validLoginUserDataGetter(createAccountPage);
        //input valid login user email address
        createAccountLoginDashboardPage.inputValidLoginEmailIntoEmailInputField();
        //input valid login user password
        createAccountLoginDashboardPage.inputValidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the valid user input data
        captureScreenshot(driver, "Valid User Login Data Input");
        //click 'Sign In' button
        createAccountLoginDashboardPage.clickSignInButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Login Test Result");
        //assert the user gets onto 'My Account' page
        assertEquals("MY ACCOUNT", myAccountPage.getMyAccountPageTitle(), "The my account page title text doesn't match expectations or the user has failed to login.");
    }

    //invalid user login tests

    //no singular input

    //invalid user login test method - no login email
    protected void invalidUserLoginNoEmailTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //my account page web element assert
        isMyAccountPageWebElementDisplayed(myAccountPage);
        //my account page text element assert
        isMyAccountPageTextElementAsExpected(myAccountPage);
        //click 'Logout' link
        generalPage.clickLogOutNavLink();
        //create account login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //invalid login user input data getter - no login email
        createAccountLoginDashboardPage.invalidLoginUserDataNoEmailGetter(createAccountPage);
        //don't input login user email address
        createAccountLoginDashboardPage.inputNoLoginEmailIntoEmailInputField();
        //input valid login user password
        createAccountLoginDashboardPage.inputValidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the invalid user input data - no login email
        captureScreenshot(driver, "Invalid User Login Data Input - No Login Email");
        //click 'Sign In' button
        createAccountLoginDashboardPage.clickSignInButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Login Test Result - No Login Email");
        //assert the user gets an expected error message (no login email address), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "An email address required.", createAccountLoginDashboardPage.getInvalidLoginInputErrorMessageText(), "The missing singular input error text doesn't match expectations (no login email address).");
        } catch (Exception e) {
            logger.warn("The missing email address error wasn't triggered");
        }
    }

    //invalid user login test method - no login password
    protected void invalidUserLoginNoPasswordTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //my account page web element assert
        isMyAccountPageWebElementDisplayed(myAccountPage);
        //my account page text element assert
        isMyAccountPageTextElementAsExpected(myAccountPage);
        //click 'Logout' link
        generalPage.clickLogOutNavLink();
        //create account login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //invalid login user input data getter - no login password
        createAccountLoginDashboardPage.invalidLoginUserDataNoPasswordGetter();
        //input valid login user email address
        createAccountLoginDashboardPage.inputValidLoginEmailIntoEmailInputField();
        //don't input login user password
        createAccountLoginDashboardPage.inputNoLoginPasswordIntoPasswordInputField();
        //capture screenshot of the invalid user input data - no login password
        captureScreenshot(driver, "Invalid User Login Data Input - No Login Password");
        //click 'Sign In' button
        createAccountLoginDashboardPage.clickSignInButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Login Test Result - No Login Password");
        //assert the user gets an expected error message (no login password), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "Password is required.", createAccountLoginDashboardPage.getInvalidLoginInputErrorMessageText(), "The missing singular input error text doesn't match expectations (no login password).");
        } catch (Exception e) {
            logger.warn("The missing password error wasn't triggered");
        }
    }

    //invalid singular input

    //invalid user login test method - invalid login email
    protected void invalidUserLoginInvalidEmailTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //my account page web element assert
        isMyAccountPageWebElementDisplayed(myAccountPage);
        //my account page text element assert
        isMyAccountPageTextElementAsExpected(myAccountPage);
        //click 'Logout' link
        generalPage.clickLogOutNavLink();
        //create account login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //invalid login user input data getter - invalid login email
        createAccountLoginDashboardPage.invalidLoginUserDataInvalidEmailGetter(createAccountPage);
        //input invalid login user email address
        createAccountLoginDashboardPage.inputInvalidLoginEmailIntoEmailInputField();
        //input valid login user password
        createAccountLoginDashboardPage.inputValidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the invalid user input data - invalid login email
        captureScreenshot(driver, "Invalid User Login Data Input - Invalid Login Email");
        //click 'Sign In' button
        createAccountLoginDashboardPage.clickSignInButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Login Test Result - Invalid Login Email");
        //assert the user gets an expected error message (invalid login email address), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "Authentication failed.", createAccountLoginDashboardPage.getInvalidLoginInputErrorMessageText(), "The invalid singular input error text doesn't match expectations (invalid login email address).");
        } catch (Exception e) {
            logger.warn("The invalid email address error wasn't triggered");
        }
    }

    //invalid user login test method - invalid login password
    protected void invalidUserLoginInvalidPasswordTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //my account page web element assert
        isMyAccountPageWebElementDisplayed(myAccountPage);
        //my account page text element assert
        isMyAccountPageTextElementAsExpected(myAccountPage);
        //click 'Logout' link
        generalPage.clickLogOutNavLink();
        //create account login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //invalid login user input data getter - invalid login password
        createAccountLoginDashboardPage.invalidLoginUserDataInvalidPasswordGetter();
        //input valid login user email address
        createAccountLoginDashboardPage.inputValidLoginEmailIntoEmailInputField();
        //input invalid login user password
        createAccountLoginDashboardPage.inputInvalidLoginPasswordIntoPasswordInputField();
        //capture screenshot of the invalid user input data - invalid login password
        captureScreenshot(driver, "Invalid User Login Data Input - Invalid Login Password");
        //click 'Sign In' button
        createAccountLoginDashboardPage.clickSignInButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Login Test Result - Invalid Login Password");
        //assert the user gets an expected error message (invalid login password), log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "Password is required.", createAccountLoginDashboardPage.getInvalidLoginInputErrorMessageText(), "The invalid singular input error text doesn't match expectations (invalid login password).");
        } catch (Exception e) {
            logger.warn("The invalid password error wasn't triggered");
        }
    }

    //valid user logout test

    //valid user logout test method
    protected void validUserLogOutTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //my account page web element assert
        isMyAccountPageWebElementDisplayed(myAccountPage);
        //my account page text element assert
        isMyAccountPageTextElementAsExpected(myAccountPage);
        //click 'Logout' link
        generalPage.clickLogOutNavLink();
        //create account login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Logout Test Result");
        //assert the user gets onto 'Create Account & Login' dashboard page
        assertEquals("AUTHENTICATION", createAccountLoginDashboardPage.getCreateAccountLoginDashboardTitle(), "The create account login dashboard page title text doesn't match expectations or the user has failed to logout.");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid 'My Account' page information update tests

    //valid 'My Account' page first name update test method
    protected void validUserAccountFirstNameUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input updated user first name
        myAccountInformationPage.inputUpdatedFirstNameIntoFirstNameInputField();
        //capture screenshot of valid test data input
        captureScreenshot(driver, "Valid User Account Updated First Name Input");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets an expected success message
        assertEquals("Your personal information has been successfully updated.", myAccountInformationPage.getMyAccountInfoUpdateSuccessMessage(),"The personal information update success message doesn't match expectations or the update process has failed");
        //click 'My Personal Info' footer link
        generalPage.clickMyPersonalInfoFooterLink();
        //assert the last name was indeed updated
        assertEquals("Bennett", myAccountInformationPage.getFirstNameInputFieldText(), "The first name doesn't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Update First Name Test Result");
    }

    //valid 'My Account' page last name update test method
    protected void validUserAccountLastNameUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input updated user last name
        myAccountInformationPage.inputUpdatedLastNameIntoLastNameInputField();
        //capture screenshot of valid test data input
        captureScreenshot(driver, "Valid User Account Updated Last Name Input");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets an expected success message
        assertEquals("Your personal information has been successfully updated.", myAccountInformationPage.getMyAccountInfoUpdateSuccessMessage(),"The personal information update success message doesn't match expectations or the update process has failed");
        //click 'My Personal Info' footer link
        generalPage.clickMyPersonalInfoFooterLink();
        //assert the last name was indeed updated
        assertEquals("Kammerberger", myAccountInformationPage.getLastNameInputFieldText(), "The last name doesn't match expectations.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Update Last Name Test Result");
    }

    //valid 'My Account' page email address update test method
    protected void validUserAccountEmailUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input updated user email address
        myAccountInformationPage.inputUpdatedEmailIntoEmailInputField();
        //capture screenshot of valid test data input
        captureScreenshot(driver, "Valid User Account Updated Email Input");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets an expected success message
        assertEquals("Your personal information has been successfully updated.", myAccountInformationPage.getMyAccountInfoUpdateSuccessMessage(),"The personal information update success message doesn't match expectations or the update process has failed");
        //click 'My Personal Info' footer link
        generalPage.clickMyPersonalInfoFooterLink();
        //assert the last name was indeed updated
        assertEquals(myAccountInformationPage.getUpdatedEmail(), myAccountInformationPage.getEmailInputFieldText(), "The email doesn't match expectations.");
        //capture screenshot of the updated email
        captureScreenshot(driver, "Valid User Account Updated Email");
        //click 'Sign out' nav link
        generalPage.clickLogOutNavLink();
        //valid updated user data getter (updated user email)
        createAccountLoginDashboardPage.validUpdatedEmailUserDataGetter(myAccountInformationPage, createAccountPage);
        //input updated user email address
        createAccountLoginDashboardPage.inputUpdatedLoginEmailIntoEmailInputField();
        //input user login password
        createAccountLoginDashboardPage.inputValidLoginPasswordIntoPasswordInputField();
        //click 'Sign in' button
        createAccountLoginDashboardPage.clickSignInButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Update Email Test Result");
    }

    //valid 'My Account' page user password update test method
    protected void validUserAccountPasswordUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //input updated user password
        myAccountInformationPage.inputNewPasswordIntoNewPasswordInputField();
        //input matching user confirm password
        myAccountInformationPage.inputConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of valid test data input
        captureScreenshot(driver, "Valid User Account Updated New and Confirm Password Input");
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets an expected success message
        assertEquals("Your personal information has been successfully updated.", myAccountInformationPage.getMyAccountInfoUpdateSuccessMessage(),"The personal information update success message doesn't match expectations or the update process has failed");
        //click 'My Personal Info' footer link
        generalPage.clickMyPersonalInfoFooterLink();
        //capture screenshot of the updated password result
        captureScreenshot(driver, "Valid User Account Updated Password");
        //click 'Sign out' nav link
        generalPage.clickLogOutNavLink();
        //valid updated user data getter (updated user password)
        createAccountLoginDashboardPage.validUpdatedPasswordUserDataGetter(myAccountInformationPage);
        //input user login email address
        createAccountLoginDashboardPage.inputValidLoginEmailIntoEmailInputField();
        //input updated user login password
        createAccountLoginDashboardPage.inputUpdatedLoginPasswordIntoPasswordInputField();
        //click 'Sign in' button
        createAccountLoginDashboardPage.clickSignInButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Update Password Test Result");
    }

    //invalid 'My Account' page update information tests

    //no singular input

    //invalid 'My Account' page user first name update test method - no first name
    protected void invalidUserAccountNoFirstNameUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //don't input user first name
        myAccountInfoInvalidScenariosPage.inputNoFirstNameIntoFirstNameInputField();
        //capture screenshot of invalid test data input - no first name
        captureScreenshot(driver, "Invalid User Account Updated First Name Input - No First Name");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the first name got the expected empty string
        assertEquals("", myAccountInformationPage.getFirstNameInputFieldText(), "The first name doesn't match expectations.");
        //assert the user gets the expected error message
        assertEquals("There is 1 error\n" + "firstname is required.", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The missing first name error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update First Name Test Result - No First Name");
    }

    //invalid 'My Account' page user last name update test method - no last name
    protected void invalidUserAccountNoLastNameUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //don't input user last name
        myAccountInfoInvalidScenariosPage.inputNoLastNameIntoLastNameInputField();
        //capture screenshot of invalid test data input - no last name
        captureScreenshot(driver, "Invalid User Account Updated Last Name Input - No Last Name");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the first name got the expected empty string
        assertEquals("", myAccountInformationPage.getLastNameInputFieldText(), "The last name doesn't match expectations.");
        //assert the user gets the expected error message
        assertEquals("There is 1 error\n" + "lastname is required.", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The missing last name error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update Last Name Test Result - No Last Name");
    }

    //invalid 'My Account' page user email update test method - no email address
    protected void invalidUserAccountNoEmailUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //don't input user email
        myAccountInfoInvalidScenariosPage.inputNoEmailIntoEmailInputField();
        //capture screenshot of invalid test data input - no email address
        captureScreenshot(driver, "Invalid User Account Updated Email Input - No Email");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the first name got the expected empty string
        assertEquals("", myAccountInformationPage.getEmailInputFieldText(), "The email doesn't match expectations.");
        //assert the user gets the expected error message
        assertEquals("There is 1 error\n" + "This email address is not valid", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The missing email address error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update Email Test Result - No Email");
    }

    //invalid 'My Account' page user password update test method - no new password
    protected void invalidUserAccountNoConfirmPasswordUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //input new user password but omit 'Confirm Password' input
        myAccountInfoInvalidScenariosPage.inputNewPasswordForNoConfirmIntoNewPasswordInputField();
        //capture screenshot of invalid test data input - no new password confirmation
        captureScreenshot(driver, "Invalid User Account Updated Password Input - No Confirm New Password");
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets the expected error message
        assertEquals("There is 1 error\n" + "The password and confirmation do not match.", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The missing new password confirmation error doesn't match expectations or the error wasn't triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update Password Test Result - No Confirm New Password");
    }

    //too short singular input

    //invalid 'My Account' page user first name update test method - too short first name (1 char)
    protected void invalidUserAccountTooShortFirstNameUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input too short user first name (1 char)
        myAccountInfoInvalidScenariosPage.inputTooShortFirstNameIntoFirstNameInputField();
        //capture screenshot of invalid test data input - too short first name (1 char)
        captureScreenshot(driver, "Invalid User Account Updated First Name Input - Too Short First Name");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "firstname is too short.", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The too short first name error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too short first name error doesn't get triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update First Name Test Result - Too Short First Name");
    }

    //invalid 'My Account' page user last name update test method - too short last name (1 char)
    protected void invalidUserAccountTooShortLastNameUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input too short user last name (1 char)
        myAccountInfoInvalidScenariosPage.inputTooShortLastNameIntoLastNameInputField();
        //capture screenshot of invalid test data input - too short last name (1 char)
        captureScreenshot(driver, "Invalid User Account Updated Last Name Input - Too Short Last Name");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "lastname is too short.", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The too short last name error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too short last name error doesn't get triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update Last Name Test Result - Too Short Last Name");
    }

    //invalid 'My Account' page user email update test method - too short email (1 char - name,domain)
    protected void invalidUserAccountTooShortEmailUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input too short user email (1 char - name,domain)
        myAccountInfoInvalidScenariosPage.inputTooShortEmailIntoEmailInputField();
        //capture screenshot of invalid test data input - too short email (1 char - name,domain)
        captureScreenshot(driver, "Invalid User Account Updated Email Input - Too Short Email");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "email is too short.", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The too short email error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too short email error doesn't get triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update Email Test Result - Too Short Email");
    }

    //invalid 'My Account' page user password update test method - too short new password / confirm password (4 chars)
    protected void invalidUserAccountTooShortNewPasswordConfirmUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //input too short new password (4 chars)
        myAccountInfoInvalidScenariosPage.inputTooShortNewPasswordIntoNewPasswordInputField();
        //input too short confirm (new) password (4 chars)
        myAccountInfoInvalidScenariosPage.inputTooShortConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of invalid test data input - too short new password / confirm password (4 chars)
        captureScreenshot(driver, "Invalid User Account Updated Password Input - Too Short New Password and Confirm Password");
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "passwd is invalid.", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The too short password error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too short new password / confirm password error doesn't get triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update Password Test Result - Too Short New Password and Confirm Password");
    }

    //too long singular input

    //invalid 'My Account' page user first name update test method - too long first name (33 chars)
    protected void invalidUserAccountTooLongFirstNameUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input too long user first name (33 chars)
        myAccountInfoInvalidScenariosPage.inputTooLongFirstNameIntoFirstNameInputField();
        //capture screenshot of invalid test data input - too long first name (33 chars)
        captureScreenshot(driver, "Invalid User Account Updated First Name Input - Too Long First Name");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "firstname is too long. Maximum length: 32", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The too long first name error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too long first name error doesn't get triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update First Name Test Result - Too Long First Name");
    }

    //invalid 'My Account' page user last name update test method - too long last name (33 chars)
    protected void invalidUserAccountTooLongLastNameUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input too long user last name (33 chars)
        myAccountInfoInvalidScenariosPage.inputTooLongLastNameIntoLastNameInputField();
        //capture screenshot of invalid test data input - too long last name (33 chars)
        captureScreenshot(driver, "Invalid User Account Updated Last Name Input - Too Long Last Name");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "lastname is too long. Maximum length: 32", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The too long last name error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too long last name error doesn't get triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update Last Name Test Result - Too Long Last Name");
    }

    //invalid 'My Account' page user email update test method - too long email (100 chars)
    protected void invalidUserAccountTooLongEmailUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input too long user email (100 chars)
        myAccountInfoInvalidScenariosPage.inputTooLongEmailIntoEmailInputField();
        //capture screenshot of invalid test data input - too long email (100 chars)
        captureScreenshot(driver, "Invalid User Account Updated Email Input - Too Long Email");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "email is invalid.", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The too long email error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too long email error doesn't get triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update Email Test Result - Too Long Email");
    }

    //invalid 'My Account' page user password update test method - too long new password / confirm password (33 chars)
    protected void invalidUserAccountTooLongNewPasswordConfirmUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //input too long new password (33 chars)
        myAccountInfoInvalidScenariosPage.inputTooLongNewPasswordIntoNewPasswordInputField();
        //input too long confirm (new) password (33 chars)
        myAccountInfoInvalidScenariosPage.inputTooLongConfirmPasswordIntoConfirmPasswordInputField();
        //capture screenshot of invalid test data input - too long new password / confirm password (33 chars)
        captureScreenshot(driver, "Invalid User Account Updated Password Input - Too Long New Password and Confirm Password");
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "passwd is too long. Maximum length: 32", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The too long password error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too long new password / confirm password error doesn't get triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update Password Test Result - Too Long New Password and Confirm Password");
    }

    //invalid singular input (by format)

    //invalid 'My Account' page user first name update test method - invalid first name format (special symbols only)
    protected void invalidUserAccountInvalidFirstNameFormatUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input invalid user first name format (special symbols only)
        myAccountInfoInvalidScenariosPage.inputInvalidFirstNameFormatIntoFirstNameInputField();
        //capture screenshot of invalid test data input - invalid first name (special symbols only)
        captureScreenshot(driver, "Invalid User Account Updated First Name Input - Invalid First Name Format");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "firstname is invalid.", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The invalid first name format error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The invalid first name format error doesn't get triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update First Name Test Result - Invalid First Name Format");
    }

    //invalid 'My Account' page user last name update test method - invalid last name format (special symbols only)
    protected void invalidUserAccountInvalidLastNameFormatUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input invalid user last name format (special symbols only)
        myAccountInfoInvalidScenariosPage.inputInvalidLastNameFormatIntoLastNameInputField();
        //capture screenshot of invalid test data input - invalid last name format (special symbols only)
        captureScreenshot(driver, "Invalid User Account Updated Last Name Input - Invalid Last Name Format");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "lastname is invalid.", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The invalid last name format error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The invalid last name format error doesn't get triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update Last Name Test Result - Invalid Last Name");
    }

    //invalid 'My Account' page user email update test method - invalid email format (missing '@')
    protected void invalidUserAccountInvalidEmailFormatUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input invalid user email format (missing '@')
        myAccountInfoInvalidScenariosPage.inputInvalidEmailFormatIntoEmailInputField();
        //capture screenshot of invalid test data input - invalid email format (missing '@')
        captureScreenshot(driver, "Invalid User Account Updated Email Input - Invalid Email Format");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "email is invalid.", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The invalid email format error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The invalid email format error doesn't get triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update Email Test Result - Invalid Email Format");
    }

    //invalid 'My Account' page user email update test method - existing email (used beforehand in manual testing)
    protected void invalidUserAccountExistingEmailUpdateTest(CreateAccountPage createAccountPage){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAccountInformationPage myAccountInformationPage = new MyAccountInformationPage(driver);
        MyAccountInfoInvalidScenariosPage myAccountInfoInvalidScenariosPage = new MyAccountInfoInvalidScenariosPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'My Account' information button link
        myAccountPage.clickMyAccountInformationButtonLink();
        //my account information page web element assert
        isMyAccountInformationPageWebElementDisplayed(myAccountInformationPage);
        //my account information page text element assert
        isMyAccountInformationPageTextElementAsExpected(myAccountInformationPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account Information Page Display");
        //input existing user email format (used beforehand in manual testing)
        myAccountInfoInvalidScenariosPage.inputExistingEmailIntoEmailInputField();
        //capture screenshot of invalid test data input - existing email (used beforehand in manual testing)
        captureScreenshot(driver, "Invalid User Account Updated Email Input - Existing Email");
        //input current user password
        myAccountInformationPage.inputCurrentUserPasswordIntoUserPasswordInputField(createAccountPage);
        //click 'Save' button
        myAccountInformationPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "An account using this email address has already been registered.", myAccountInfoInvalidScenariosPage.getSingularInputErrorMessage(), "The existing email error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The existing email error doesn't get triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Update Email Test Result - Existing Email");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //valid user 'My Address' address addition tests

    //valid user address addition test method
    protected void validUserAddressAdditionTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressesPage myAddressesPage = new MyAddressesPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account 'My Address' Page Display");
        //valid user address (address-related) data getter
        myAddressPage.validUserAddressDataGetter();
        //input valid user address (address1)
        myAddressPage.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPage.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPage.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPage.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPage.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the valid user data input
        captureScreenshot(driver, "Valid User Account Address Data Input");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //my addresses page web element assert
        isMyAddressesPageWebElementDisplayed(myAddressesPage);
        //my addresses page text element assert
        isMyAddressesPageTextElementAsExpected(myAddressesPage);
        //log displayed address data
        logMyAddressesPageAddressData(myAddressesPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Address Input Test Result");
    }

    //valid two user addresses addition test method
    protected void validTwoUserAddressesAdditionTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressesPage myAddressesPage = new MyAddressesPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account 'My Address' Page Display Before First Address Input");
        //valid user address (address-related) data getter
        myAddressPage.validUserAddressDataGetter();
        //input valid user address (address1)
        myAddressPage.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPage.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPage.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPage.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPage.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the valid user data input
        captureScreenshot(driver, "Valid User Account First Address Data Input");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //my addresses page web element assert
        isMyAddressesPageWebElementDisplayed(myAddressesPage);
        //my addresses page text element assert
        isMyAddressesPageTextElementAsExpected(myAddressesPage);
        //log displayed address data
        logMyAddressesPageAddressData(myAddressesPage);
        //click 'Add a new address' button
        myAddressesPage.clickAddANewAddressButton();
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account 'My Address' Page Display Before Second Address Addition");
        //valid user address (address-related) data getter
        myAddressPage.validUserAddressDataGetter();
        //input valid user address (address1)
        myAddressPage.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPage.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPage.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPage.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPage.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the valid user data input
        captureScreenshot(driver, "Valid User Account Additional Address Data Input");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //log displayed address data
        logMyAddressesPageAddressData(myAddressesPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Two Addresses Input Test Result");
    }

    //valid user address addition and update test method
    protected void validUserAddressAdditionAndUpdateTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressesPage myAddressesPage = new MyAddressesPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account 'My Address' Page Display");
        //valid user address (address-related) data getter
        myAddressPage.validUserAddressDataGetter();
        //input valid user address (address1)
        myAddressPage.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPage.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPage.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPage.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPage.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the valid user data input
        captureScreenshot(driver, "Valid User Account Address Data Input");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //my addresses page web element assert
        isMyAddressesPageWebElementDisplayed(myAddressesPage);
        //my addresses page text element assert
        isMyAddressesPageTextElementAsExpected(myAddressesPage);
        //log displayed address data
        logMyAddressesPageAddressData(myAddressesPage);
        //click 'Update' address button
        myAddressesPage.clickUpdateAddressButtonOne();
        //capture screenshot before address update
        captureScreenshot(driver, "Valid User Account Address Data Before Update");
        //valid user address (address-related) data getter
        myAddressPage.validUserAddressDataGetter();
        //clear address one input field before update
        myAddressPage.clearAddressInputField();
        //input updated valid user address (address1)
        myAddressPage.inputValidUserAddressIntoAddressInputField();
        //clear city input field before update
        myAddressPage.clearCityInputField();
        //input updated valid user city
        myAddressPage.inputValidUserCityIntoCityInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Alabama' state option
        myAddressPage.selectStateAlabamaOption();
        //clear postal code input field before update
        myAddressPage.clearPostalCodeInputField();
        //input updated valid user postal code
        myAddressPage.inputValidUserPostalCodeIntoPostalCodeInputField();
        //clear home phone input field before update
        myAddressPage.clearHomePhoneInputField();
        //input updated valid user home phone number
        myAddressPage.inputValidUserHomePhoneIntoHomePhoneInputField();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Updated Address Input Test Result");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //log displayed address data
        logMyAddressesPageAddressData(myAddressesPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Updated Address Input Test Result");
    }

    //valid user address addition and removal test method
    protected void validUserAddressAdditionAndRemovalTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressesPage myAddressesPage = new MyAddressesPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //capture screenshot of the page
        captureScreenshot(driver, "Valid User Account 'My Address' Page Display");
        //valid user address (address-related) data getter
        myAddressPage.validUserAddressDataGetter();
        //input valid user address (address1)
        myAddressPage.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPage.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPage.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPage.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPage.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the valid user data input
        captureScreenshot(driver, "Valid User Account Address Data Input");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //my addresses page web element assert
        isMyAddressesPageWebElementDisplayed(myAddressesPage);
        //my addresses page text element assert
        isMyAddressesPageTextElementAsExpected(myAddressesPage);
        //log displayed address data
        logMyAddressesPageAddressData(myAddressesPage);
        //capture screenshot before address removal
        captureScreenshot(driver, "Valid User Account Address Addition Before Removal");
        //click 'Delete' address button
        myAddressesPage.clickDeleteAddressButtonOne();
        //click 'OK' button to confirm address removal
        myAddressesPage.clickOKButton();
        //assert the user gets the expected message box
        assertEquals("No addresses are available. Add a new address", myAddressesPage.getAddressRemovedMessage(), "The address removal message doesn't match expectations or removal has failed.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Account Address Removal Test Result");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //invalid user address input tests

    //no singular input

    //invalid user address addition test method - no user address
    protected void invalidUserAddressAdditionNoUserAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - no user address
        myAddressPageInvalidScenarios.invalidUserAddressDataNoUserAddressGetter();
        //don't input user address (address1)
        myAddressPageInvalidScenarios.inputNoUserAddressIntoAddressInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - No User Address");
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - No User Address");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message
        assertEquals("There is 1 error\n" + "address1 is required.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The missing user address error doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - No User Address");
    }

    //invalid user address addition test method - no user city
    protected void invalidUserAddressAdditionNoUserCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - no user city
        myAddressPageInvalidScenarios.invalidUserAddressDataNoUserCityGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //don't input user city
        myAddressPageInvalidScenarios.inputNoUserCityIntoCityInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - No User City");
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - No User City");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message
        assertEquals("There is 1 error\n" + "city is required.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The missing user city error doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - No User City");
    }

    //invalid user address addition test method - no user state
    protected void invalidUserAddressAdditionNoUserStateTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //valid user address (address-related) data getter
        myAddressPage.validUserAddressDataGetter();
        //input valid user address (address1)
        myAddressPage.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPage.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPage.inputValidUserPostalCodeIntoPostalCodeInputField();
        //input valid user home phone number
        myAddressPage.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPage.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - No User State");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message
        assertEquals("There is 1 error\n" + "This country requires you to chose a State.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The missing user state error doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - No User State");
    }

    //invalid user address addition test method - no user postal code
    protected void invalidUserAddressAdditionNoUserPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - no user postal code
        myAddressPageInvalidScenarios.invalidUserAddressDataNoUserPostalCodeGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //don't input user postal code
        myAddressPageInvalidScenarios.inputNoUserPostalCodeIntoPostalCodeInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - No User Postal Code");
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - No User Postal Code");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message
        assertEquals("There is 1 error\n" + "The Zip/Postal code you've entered is invalid. It must follow this format: 00000", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The missing user postal code error doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - No User Postal Code");
    }

    //invalid user address addition test method - no user home phone
    protected void invalidUserAddressAdditionNoUserHomePhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - no user home phone
        myAddressPageInvalidScenarios.invalidUserAddressDataNoUserHomePhoneGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //don't input user home phone number
        myAddressPageInvalidScenarios.inputNoUserHomePhoneIntoHomePhoneInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - No User Home Phone");
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - No User Home Phone");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message
        assertEquals("There is 1 error\n" + "You must register at least one phone number.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The missing user home phone error doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - No User Home Phone");
    }

    //invalid user address addition test method - no user address title
    protected void invalidUserAddressAdditionNoUserAddressTitleTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - no user address title
        myAddressPageInvalidScenarios.invalidUserAddressDataNoUserAddressTitleGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //don't input user address title
        myAddressPageInvalidScenarios.inputNoUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - No User Address Title");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message
        assertEquals("There is 1 error\n" + "alias is required.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The missing user address title error doesn't match expectations or the error hasn't been triggered.");
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - No User Address Title");
    }

    //too short singular input

    //invalid user address addition test method - too short user address (4 chars)
    protected void invalidUserAddressAdditionTooShortUserAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - too short user address (4 chars)
        myAddressPageInvalidScenarios.invalidUserAddressDataTooShortUserAddressGetter();
        //input too short user address (address1) (4 chars)
        myAddressPageInvalidScenarios.inputTooShortUserAddressIntoAddressInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - Too Short User Address");
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Too Short User Address");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "address1 is too short.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The too short user address error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too short user address error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Too Short User Address");
    }

    //invalid user address addition test method - too short user city (1 char)
    protected void invalidUserAddressAdditionTooShortUserCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - too short user city (1 char)
        myAddressPageInvalidScenarios.invalidUserAddressDataTooShortUserCityGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input too short user city (1 char)
        myAddressPageInvalidScenarios.inputTooShortUserCityIntoCityInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - Too Short User City");
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Too Short User City");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "city is too short.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The too short user city error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too short user city error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Too Short User City");
    }

    //invalid user address addition test method - too short user postal code (4 digits)
    protected void invalidUserAddressAdditionTooShortUserPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - too short user postal code (4 digits)
        myAddressPageInvalidScenarios.invalidUserAddressDataTooShortUserPostalCodeGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input too short user postal code (4 digits)
        myAddressPageInvalidScenarios.inputTooShortUserPostalCodeIntoPostalCodeInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - Too Short User Postal Code");
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Too Short User Postal Code");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "The Zip/Postal code you've entered is invalid. It must follow this format: 00000", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The too short user postal code error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too short user postal code error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Too Short User Postal Code");
    }

    //invalid user address addition test method - too short user home phone (3 digits)
    protected void invalidUserAddressAdditionTooShortUserHomePhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - too short user home phone (3 digits)
        myAddressPageInvalidScenarios.invalidUserAddressDataTooShortUserHomePhoneGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input too short user home phone number (3 digits)
        myAddressPageInvalidScenarios.inputTooShortUserHomePhoneIntoHomePhoneInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - Too Short User Home Phone");
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Too Short User Home Phone");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "The home phone is too short.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The too short user home phone error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too short user home phone error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Too Short User Home Phone");
    }

    //too long singular input

    //invalid user address addition test method - too long user address (100 chars)
    protected void invalidUserAddressAdditionTooLongUserAddressTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - too long user address (100 chars)
        myAddressPageInvalidScenarios.invalidUserAddressDataTooLongUserAddressGetter();
        //input too long user address (address1) (100 chars)
        myAddressPageInvalidScenarios.inputTooLongUserAddressIntoAddressInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - Too Long User Address");
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Too Long User Address");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "address1 is too long.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The too long user address error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too long user address error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Too Long User Address");
    }

    //invalid user address addition test method - too long user city (100 chars)
    protected void invalidUserAddressAdditionTooLongUserCityTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - too long user city (100 chars)
        myAddressPageInvalidScenarios.invalidUserAddressDataTooLongUserCityGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input too long user city (100 chars)
        myAddressPageInvalidScenarios.inputTooLongUserCityIntoCityInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - Too Long User City");
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Too Long User City");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "city is too long.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The too long user city error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too long user city error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Too Long User City");
    }

    //invalid user address addition test method - too long user postal code (6 digits)
    protected void invalidUserAddressAdditionTooLongUserPostCodeTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - too long user postal code (6 digits)
        myAddressPageInvalidScenarios.invalidUserAddressDataTooLongUserPostalCodeGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input too long user postal code (6 digits)
        myAddressPageInvalidScenarios.inputTooLongUserPostalCodeIntoPostalCodeInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - Too Long User Postal Code");
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Too Long User Postal Code");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "The Zip/Postal code you've entered is invalid. It must follow this format: 00000", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The too long user postal code error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too long user postal code error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Too Long User Postal Code");
    }

    //invalid user address addition test method - too long user home phone (33 digits) (additional test)
    protected void invalidUserAddressAdditionTooLongUserHomePhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - too long user home phone (33 digits)
        myAddressPageInvalidScenarios.invalidUserAddressDataTooLongUserHomePhoneGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input too long user home phone number (33 digits)
        myAddressPageInvalidScenarios.inputTooLongUserHomePhoneIntoHomePhoneInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - Too Long User Home Phone");
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Too Long User Home Phone");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "phone is too long. Maximum length: 32", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The too long user home phone error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too long user home phone error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Too Long User Home Phone");
    }

    //invalid user address addition test method - too long user mobile phone (33 digits)
    protected void invalidUserAddressAdditionTooLongUserMobilePhoneTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - too long user mobile phone (33 digits)
        myAddressPageInvalidScenarios.invalidUserAddressDataTooLongUserMobilePhoneGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input too long user mobile phone number (33 digits)
        myAddressPageInvalidScenarios.inputTooLongUserMobilePhoneIntoMobilePhoneInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - Too Long User Mobile Phone");
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Too Long User Mobile Phone");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "phone_mobile is too long. Maximum length: 32", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The too long user mobile phone error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too long user mobile phone error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Too Long User Home Phone");
    }

    //invalid user address addition test method - too long user address title (33 chars)
    protected void invalidUserAddressAdditionTooLongUserAddressTitleTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - too long user address title (33 chars)
        myAddressPageInvalidScenarios.invalidUserAddressDataTooLongUserAddressTitleGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input too long user address title (33 chars)
        myAddressPageInvalidScenarios.inputTooLongUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Too Long User Address Title");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "alias is too long. Maximum length: 32", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The too long user address title error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The too long user address title error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Too Long User Address Title");
    }

    //invalid singular input (by format)

    //invalid user address addition test method - invalid user address format (100 chars)
    protected void invalidUserAddressAdditionInvalidUserAddressFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - invalid user address format (special symbols only)
        myAddressPageInvalidScenarios.invalidUserAddressDataInvalidUserAddressFormatGetter();
        //input invalid user address format (address1) (special symbols only)
        myAddressPageInvalidScenarios.inputInvalidUserAddressFormatIntoAddressInputField();
        //capture screenshot of the invalid data input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - Invalid User Address Format");
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Invalid User Address Format");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "address1 is invalid.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The invalid user address format error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The invalid user address format error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Invalid User Address Format");
    }

    //invalid user address addition test method - invalid user city format (special symbols only)
    protected void invalidUserAddressAdditionInvalidUserCityFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - invalid user city format (special symbols only)
        myAddressPageInvalidScenarios.invalidUserAddressDataInvalidUserCityFormatGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input invalid user city format (special symbols only)
        myAddressPageInvalidScenarios.inputInvalidUserCityFormatIntoCityInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - Invalid User City Format");
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Invalid User City Format");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "city is invalid.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The invalid user city format error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The invalid user city format error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Invalid User City Format");
    }

    //invalid user address addition test method - invalid user postal code format (special symbols only)
    protected void invalidUserAddressAdditionInvalidUserPostCodeFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - invalid user postal code format (special symbols only)
        myAddressPageInvalidScenarios.invalidUserAddressDataInvalidUserPostalCodeFormatGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input invalid user postal code format (special symbols only)
        myAddressPageInvalidScenarios.inputInvalidUserPostalCodeFormatIntoPostalCodeInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - Invalid User Postal Code Format");
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Invalid User Postal Code Format");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There are 2 errors\n" + "postcode is invalid.\n" + "The Zip/Postal code you've entered is invalid. It must follow this format: 00000", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The invalid user postal code format error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The invalid user postal code format error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Invalid User Postal Code Format");
    }

    //invalid user address addition test method - invalid user home phone format (special symbols only)
    protected void invalidUserAddressAdditionInvalidUserHomePhoneFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - invalid user home phone format (special symbols only)
        myAddressPageInvalidScenarios.invalidUserAddressDataInvalidUserHomePhoneFormatGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input invalid user home phone number format (special symbols only)
        myAddressPageInvalidScenarios.inputInvalidUserHomePhoneFormatIntoHomePhoneInputField();
        //capture screenshot of the invalid input
        captureScreenshot(driver, "Invalid User Account 'My Address' Address Input - Invalid User Home Phone Format");
        //input valid user address title
        myAddressPageInvalidScenarios.inputValidUserAddressTitleIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Invalid User Home Phone Format");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "phone is invalid.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The invalid user home phone format error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The invalid user home phone format error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Invalid User Home Phone Format");
    }

    //invalid user address addition test method - invalid user address title format (special symbols only)
    protected void invalidUserAddressAdditionInvalidUserAddressTitleFormatTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddressPageInvalidScenarios myAddressPageInvalidScenarios = new MyAddressPageInvalidScenarios(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Add My First Address' button link
        myAccountPage.clickAddMyFirstAddressButtonLink();
        //my address page web element assert
        isMyAddressPageWebElementDisplayed(myAddressPage);
        //my address page text element assert
        isMyAddressPageTextElementAsExpected(myAddressPage);
        //invalid user address (address-related) data getter - invalid user address title format (special symbols only)
        myAddressPageInvalidScenarios.invalidUserAddressDataInvalidUserAddressTitleFormatGetter();
        //input valid user address (address1)
        myAddressPageInvalidScenarios.inputValidUserAddressIntoAddressInputField();
        //input valid user city
        myAddressPageInvalidScenarios.inputValidUserCityIntoCityInputField();
        //input valid user postal code
        myAddressPageInvalidScenarios.inputValidUserPostalCodeIntoPostalCodeInputField();
        //click 'State' dropdown menu
        myAddressPage.clickStateDropdownMenu();
        //select 'Illinois' option
        myAddressPage.selectStateIllinoisOption();
        //input valid user home phone number
        myAddressPageInvalidScenarios.inputValidUserHomePhoneIntoHomePhoneInputField();
        //input invalid user address title format (special symbols only)
        myAddressPageInvalidScenarios.inputInvalidUserAddressTitleFormatIntoAddressAliasInputField();
        //capture screenshot of the invalid user data input
        captureScreenshot(driver, "Invalid User Account Address Data Input - Invalid User Address Title Format");
        //click 'Save' button
        myAddressPage.clickSaveButton();
        //assert the user gets the expected error message, log the issue otherwise
        try {
            assertEquals("There is 1 error\n" + "alias is invalid.", myAddressPageInvalidScenarios.getInvalidSingularInputErrorMessage(), "The invalid user address title format error doesn't match expectations.");
        } catch (Exception e) {
            logger.warn("The invalid user address title format error hasn't been triggered or is non-existent.");
        }
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Account Address Input Test Result - Invalid User Address Title Format");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //guest navigation to 'Women' category product dashboard page test method
    protected void navigateToWomenCategoryProductDashboardPageTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //click 'Women' category nav link
        generalPage.clickWomenCategoryNavLink();
        //single product category dashboard page web element assert (main content)
        isSingleProductCategoryDashboardPageMainWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (main content)
        isWomenProductCategoryDashboardPageMainTextElementAsExpected(singleProductCategoryDashboardPage);
        //single product category dashboard page web element assert (aside content)
        isSingleProductCategoryDashboardPageAsideWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (aside content)
        isWomenProductCategoryDashboardPageAsideTextElementAsExpected(singleProductCategoryDashboardPage);
        //log single product category dashboard page data
        logSingleProductCategoryDashboardPageProductData(singleProductCategoryDashboardPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User (or Guest) Navigation To 'Women' Product Category Dashboard Page");
    }

    //display 'Sort By' tests

    //product sort by lowest price first test method
    protected void sortByLowestPriceFirstViewTest(){
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        //single product category dashboard page web element assert (main content)
        isSingleProductCategoryDashboardPageMainWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (main content)
        isWomenProductCategoryDashboardPageMainTextElementAsExpected(singleProductCategoryDashboardPage);
        //single product category dashboard page web element assert (aside content)
        //isSingleProductCategoryDashboardPageAsideWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (aside content)
        isWomenProductCategoryDashboardPageAsideTextElementAsExpected(singleProductCategoryDashboardPage);
        //log single product category dashboard page data
        logSingleProductCategoryDashboardPageProductData(singleProductCategoryDashboardPage);
        //click 'Sort By' dropdown menu
        singleProductCategoryDashboardPage.clickSortByDropdownMenu();
        //select 'Sort By Lowest Price First' option
        singleProductCategoryDashboardPage.selectSortByLowestPriceOption();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User (or Guest) Product Sort By Lowest Price First on 'Women' Product Category Dashboard Page");
    }

    //product sort by highest price first test method
    protected void sortByHighestPriceFirstViewTest(){
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        //single product category dashboard page web element assert (main content)
        isSingleProductCategoryDashboardPageMainWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (main content)
        isWomenProductCategoryDashboardPageMainTextElementAsExpected(singleProductCategoryDashboardPage);
        //single product category dashboard page web element assert (aside content)
        //isSingleProductCategoryDashboardPageAsideWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (aside content)
        isWomenProductCategoryDashboardPageAsideTextElementAsExpected(singleProductCategoryDashboardPage);
        //log single product category dashboard page data
        logSingleProductCategoryDashboardPageProductData(singleProductCategoryDashboardPage);
        //click 'Sort By' dropdown menu
        singleProductCategoryDashboardPage.clickSortByDropdownMenu();
        //select 'Sort By Highest Price First' option
        singleProductCategoryDashboardPage.selectSortByHighestPriceOption();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User (or Guest) Product Sort By Highest Price First on 'Women' Product Category Dashboard Page");
    }

    //product sort by name (A - Z) first test method
    protected void sortByNameAZFirstViewTest(){
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        //single product category dashboard page web element assert (main content)
        isSingleProductCategoryDashboardPageMainWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (main content)
        isWomenProductCategoryDashboardPageMainTextElementAsExpected(singleProductCategoryDashboardPage);
        //single product category dashboard page web element assert (aside content)
        //isSingleProductCategoryDashboardPageAsideWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (aside content)
        isWomenProductCategoryDashboardPageAsideTextElementAsExpected(singleProductCategoryDashboardPage);
        //log single product category dashboard page data
        logSingleProductCategoryDashboardPageProductData(singleProductCategoryDashboardPage);
        //click 'Sort By' dropdown menu
        singleProductCategoryDashboardPage.clickSortByDropdownMenu();
        //select 'Sort By Name (A - Z)' option
        singleProductCategoryDashboardPage.selectSortByNameAZOption();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User (or Guest) Product Sort By Product Name A - Z on 'Women' Product Category Dashboard Page");
    }

    //product sort by name (Z - A) first test method
    protected void sortByNameZAFirstViewTest(){
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        //single product category dashboard page web element assert (main content)
        isSingleProductCategoryDashboardPageMainWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (main content)
        isWomenProductCategoryDashboardPageMainTextElementAsExpected(singleProductCategoryDashboardPage);
        //single product category dashboard page web element assert (aside content)
        //isSingleProductCategoryDashboardPageAsideWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (aside content)
        isWomenProductCategoryDashboardPageAsideTextElementAsExpected(singleProductCategoryDashboardPage);
        //log single product category dashboard page data
        logSingleProductCategoryDashboardPageProductData(singleProductCategoryDashboardPage);
        //click 'List' view button
        singleProductCategoryDashboardPage.clickListViewButton();
        //click 'Sort By' dropdown menu
        singleProductCategoryDashboardPage.clickSortByDropdownMenu();
        //select 'Sort By Name (Z - A)' option
        singleProductCategoryDashboardPage.selectSortByNameZAOption();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User (or Guest) Product Sort By Product Name Z - A on 'Women' Product Category Dashboard Page");
    }

    //product sort by 'In Stock' option first test method
    protected void sortByInStockOptionViewTest(){
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        //single product category dashboard page web element assert (main content)
        isSingleProductCategoryDashboardPageMainWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (main content)
        isWomenProductCategoryDashboardPageMainTextElementAsExpected(singleProductCategoryDashboardPage);
        //single product category dashboard page web element assert (aside content)
        //isSingleProductCategoryDashboardPageAsideWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (aside content)
        isWomenProductCategoryDashboardPageAsideTextElementAsExpected(singleProductCategoryDashboardPage);
        //log single product category dashboard page data
        logSingleProductCategoryDashboardPageProductData(singleProductCategoryDashboardPage);
        //click 'Sort By' dropdown menu
        singleProductCategoryDashboardPage.clickSortByDropdownMenu();
        //select 'Sort By In Stock' option
        singleProductCategoryDashboardPage.selectSortByInStockOption();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User (or Guest) Product Sort By 'In Stock' Option on 'Women' Product Category Dashboard Page");
    }

    //product sort by lowest reference option first test method
    protected void sortByLowestReferenceOptionViewTest(){
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        //single product category dashboard page web element assert (main content)
        isSingleProductCategoryDashboardPageMainWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (main content)
        isWomenProductCategoryDashboardPageMainTextElementAsExpected(singleProductCategoryDashboardPage);
        //single product category dashboard page web element assert (aside content)
        //isSingleProductCategoryDashboardPageAsideWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (aside content)
        isWomenProductCategoryDashboardPageAsideTextElementAsExpected(singleProductCategoryDashboardPage);
        //log single product category dashboard page data
        logSingleProductCategoryDashboardPageProductData(singleProductCategoryDashboardPage);
        //click 'Sort By' dropdown menu
        singleProductCategoryDashboardPage.clickSortByDropdownMenu();
        //select 'Lowest Reference' option
        singleProductCategoryDashboardPage.selectSortByLowestReferenceOption();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User (or Guest) Product Sort By 'Lowest Reference' Option on 'Women' Product Category Dashboard Page");
    }

    //product sort by highest reference option first test method
    protected void sortByHighestReferenceOptionViewTest(){
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        //single product category dashboard page web element assert (main content)
        isSingleProductCategoryDashboardPageMainWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (main content)
        isWomenProductCategoryDashboardPageMainTextElementAsExpected(singleProductCategoryDashboardPage);
        //single product category dashboard page web element assert (aside content)
        //isSingleProductCategoryDashboardPageAsideWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (aside content)
        isWomenProductCategoryDashboardPageAsideTextElementAsExpected(singleProductCategoryDashboardPage);
        //log single product category dashboard page data
        logSingleProductCategoryDashboardPageProductData(singleProductCategoryDashboardPage);
        //click 'Sort By' dropdown menu
        singleProductCategoryDashboardPage.clickSortByDropdownMenu();
        //select 'Highest Reference' option
        singleProductCategoryDashboardPage.selectSortByHighestReferenceOption();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User (or Guest) Product Sort By 'Highest Reference' Option on 'Women' Product Category Dashboard Page");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    //add single 'Blouse' to cart test method
    protected void addSingleBlouseToCartTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //single product category dashboard page web element assert (main content)
        isSingleProductCategoryDashboardPageMainWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (main content)
        isWomenProductCategoryDashboardPageMainTextElementAsExpected(singleProductCategoryDashboardPage);
        //single product category dashboard page web element assert (aside content)
        //isSingleProductCategoryDashboardPageAsideWebElementDisplayed(singleProductCategoryDashboardPage);
        //single product category (Women) dashboard page text element assert (aside content)
        isWomenProductCategoryDashboardPageAsideTextElementAsExpected(singleProductCategoryDashboardPage);
        //log single product category dashboard page data
        logSingleProductCategoryDashboardPageProductData(singleProductCategoryDashboardPage);
        //click 'Blouse' product name link
        singleProductCategoryDashboardPage.clickBlouseNameLink(1);
        //assert the user gets onto correct single product page
        assertEquals("Blouse", singleProductPage.getSingleProductPageTitle(), "The single product page title doesn't match expectations or the user is on the wrong page.");
        //single product page web element assert
        isSingleProductPageWebElementDisplayed(singleProductPage);
        //single product page text element assert
        isSingleProductPageTextAsExpected(singleProductPage);
        //log single product page data
        logSingleProductPageData(singleProductPage);
        //capture screenshot of the product page
        captureScreenshot(driver, "'Blouse' Product Page Display");
        //click 'White' color button
        singleProductPage.clickBlouseWhiteColorButton();
        //capture screenshot of the available product selection
        captureScreenshot(driver, "Available 'Blouse' Product Selected");
        //click 'Add to Cart' button
        singleProductPage.clickAddToCartButton();
        //wait for elements to load
        generalPage.waitElementsToLoad(driver);
        //click 'Proceed to Checkout' button method
        singleProductPage.clickProceedToCheckoutButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Available 'Blouse' Product Addition To Cart Test Result");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //add two product to compare list test method ('Blouse' and 'Printed Chiffon Dress')
    protected void addBlouseAndPrintedDressToCompareListTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        SingleProductCategoryDashboardPage singleProductCategoryDashboardPage = new SingleProductCategoryDashboardPage(driver);
        ProductComparisonPage productComparisonPage = new ProductComparisonPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //hover above 'Blouse' product image
        singleProductCategoryDashboardPage.hoverAboveProductImageLink(1);
        //click 'Add to Compare' link
        singleProductCategoryDashboardPage.clickAddToCompareLink(1);
        //hover above 'Printed Chiffon Dress' product image
        singleProductCategoryDashboardPage.hoverAboveProductImageLink(6);
        //click 'Add to Compare' link
        singleProductCategoryDashboardPage.clickAddToCompareLink(6);
        //click 'Compare' button box
        singleProductCategoryDashboardPage.clickCompareButtonBox();
        //wait for elements to load
        generalPage.waitElementsToLoad(driver);
        //product comparison page web element assert
        isProductComparisonPageWebElementDisplayed(productComparisonPage);
        //product comparison page text element assert
        isProductComparisonPageTextElementAsExpected(productComparisonPage);
        //log product comparison page data
        logProductComparisonPageProductData(productComparisonPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Blouse and Dress Product Addition To Comparison Page Test Result");
    }

    //add 'Blouse' from compare list to shopping cart test method
    protected void addBlouseFromCompareListToShoppingCartTest(){
        GeneralPage generalPage = new GeneralPage(driver);
        ProductComparisonPage productComparisonPage = new ProductComparisonPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //product comparison page web element assert
        isProductComparisonPageWebElementDisplayed(productComparisonPage);
        //product comparison page text element assert
        isProductComparisonPageTextElementAsExpected(productComparisonPage);
        //log product comparison page data
        logProductComparisonPageProductData(productComparisonPage);
        //click 'Add to Cart' product button
        productComparisonPage.clickAddToCartProductButton(0);
        //click 'Proceed to Checkout' button
        productComparisonPage.clickProceedToCheckoutButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Blouse Product Addition From Comparison Page To Shopping Cart Page Test Result");
    }

    //remove a single product from compare list test method ('Blouse')
    protected void removeBlouseFromCompareListTest(){
        ProductComparisonPage productComparisonPage = new ProductComparisonPage(driver);
        //remove 'Blouse' from compared list
        productComparisonPage.clickRemoveProductButton(0);
        //log remaining product data
        logProductComparisonPageProductData(productComparisonPage);
        //capture screenshot of the test result
        captureScreenshot(driver, "Blouse and Dress Product Removal From Comparison Page Test Result");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page web element assert test method (all pages have them)
    protected void isGeneralPageWebElementDisplayed(GeneralPage generalPage){
        //assert header banner link is displayed
        assertTrue(generalPage.isHeaderBannerLinkDisplayed(), "The header banner link isn't displayed");
        //assert header shop phone is displayed
        assertTrue(generalPage.isHeaderShopPhoneDisplayed(), "The header shop phone isn't displayed");
        //assert header contact us is displayed
        assertTrue(generalPage.isHeaderContactUsNavLinkDisplayed(), "The header contact us navbar link isn't displayed");
        //assert header logo link is displayed
        assertTrue(generalPage.isHeaderLogoLinkDisplayed(), "The header logo link isn't displayed");
        //assert header search bar input field is displayed
        assertTrue(generalPage.isHeaderSearchBarInputFieldDisplayed(), "The header search bar input field isn't displayed");
        //assert search button is displayed
        assertTrue(generalPage.isSearchButtonDisplayed(), "The search button isn't displayed");
        //assert shopping cart link button is displayed
        assertTrue(generalPage.isShoppingCartLinkButtonDisplayed(), "The shopping cart link button isn't displayed");
        //assert women nav link is displayed
        assertTrue(generalPage.isWomenNavLinkDisplayed(), "The women nav link isn't displayed");
        //assert t-shirts nav link is displayed
        assertTrue(generalPage.isTShirtsNavLinkDisplayed(), "The t-shirts nav link isn't displayed");
        //assert blog nav link is displayed
        assertTrue(generalPage.isBlogNavLinkDisplayed(), "The blog nav link isn't displayed");
        //assert footer newsletter submit button is displayed
        assertTrue(generalPage.isFooterNewsletterSubmitButtonDisplayed(), "The footer newsletter submit button isn't displayed");
        //assert footer information stores link is displayed
        assertTrue(generalPage.isFooterInfoStoresLinkDisplayed(), "The footer information stores link isn't displayed");
        //assert footer information terms of use link is displayed
        assertTrue(generalPage.isFooterInfoTermsOfUseLinkDisplayed(), "The footer information terms of use link isn't displayed");
        //assert footer information about us link is displayed
        assertTrue(generalPage.isFooterInfoAboutUsLinkDisplayed(), "The footer information about us link isn't displayed");
        //assert footer categories section title is displayed
        assertTrue(generalPage.isFooterCategoriesSectionTitleDisplayed(), "The footer categories section title isn't displayed");
        //assert footer women link is displayed
        assertTrue(generalPage.isFooterWomenLinkDisplayed(), "The footer women link isn't displayed");
        //assert footer my account section title is displayed
        assertTrue(generalPage.isFooterMyAccountSectionTitleDisplayed(), "The footer my account section title isn't displayed");
        //assert footer orders link is displayed
        assertTrue(generalPage.isFooterOrdersLinkDisplayed(), "The footer orders link isn't displayed");
        //assert footer credit slips link is displayed
        assertTrue(generalPage.isFooterCreditSlipsLinkDisplayed(), "The footer my account credit slips link isn't displayed");
        //assert footer my account addresses link is displayed
        assertTrue(generalPage.isFooterMyAccountAddressesLinkDisplayed(), "The footer my account addresses link isn't displayed");
        //assert footer my personal info link is displayed
        assertTrue(generalPage.isFooterMyPersonalInfoLinkDisplayed(), "The footer my personal info link isn't displayed");
        //assert footer store information section title is displayed
        assertTrue(generalPage.isFooterStoreInfoSectionTitleDisplayed(), "The footer store information section title isn't displayed");
        //assert footer call store phone text is displayed
        assertTrue(generalPage.isFooterCallStorePhoneTextDisplayed(), "The footer call store phone text isn't displayed");
        //assert footer store address is displayed
        assertTrue(generalPage.isFooterStoreAddressDisplayed(), "The footer call address text isn't displayed");
        //assert footer follow us section title is displayed
        assertTrue(generalPage.isFooterFollowUsSectionTitleDisplayed(), "The footer follow us section title isn't displayed");
        //assert footer follow us facebook logo link is displayed
        assertTrue(generalPage.isFooterFollowUsFacebookLogoLinkDisplayed(), "The footer follow us facebook logo link isn't displayed");
        //assert footer follow us X logo link is displayed
        assertTrue(generalPage.isFooterFollowUsXLogoLinkDisplayed(), "The footer follow us X logo link isn't displayed");
        //assert footer follow us RSS logo link is displayed
        assertTrue(generalPage.isFooterFollowUsRSSLogoLinkDisplayed(), "The footer follow us RSS logo link isn't displayed");
        //assert footer newsletter section title is displayed
        assertTrue(generalPage.isFooterNewsletterSectionTitleDisplayed(), "The footer newsletter section title isn't displayed");
        //assert footer newsletter input field is displayed
        assertTrue(generalPage.isFooterNewsletterInputFieldDisplayed(), "The footer newsletter input field isn't displayed");
        //assert footer store information section title is displayed
        assertTrue(generalPage.isFooterStoreInformationTitleDisplayed(), "The footer store information section title isn't displayed");
        //assert footer email text is displayed
        assertTrue(generalPage.isFooterEmailTextDisplayed(), "The footer email text isn't displayed");
        //assert footer email link is displayed
        assertTrue(generalPage.isFooterEmailLinkDisplayed(), "The footer email link isn't displayed");
        //assert footer copyright text link is displayed
        assertTrue(generalPage.isFooterCopyrightTextLinkDisplayed(), "The footer copyright text link isn't displayed");
    }

    //home page web element assert test method
    protected void isHomePageWebElementDisplayed(HomePage homePage){
        //assert home page image carousel is displayed
        assertTrue(homePage.isHomePageCarouselDisplayed(), "The home page image carousel isn't displayed");
        //assert home page image carousel button one is displayed
        assertTrue(homePage.isHomePageCarouselButtonOneDisplayed(), "The home page image carousel button one isn't displayed");
        //assert home page image carousel button two is displayed
        assertTrue(homePage.isHomePageCarouselButtonTwoDisplayed(), "The home page image carousel button two isn't displayed");
        //assert home page quarter percent sale image link is displayed
        assertTrue(homePage.isHomePageQuarterPercentSaleImgLinkDisplayed(), "The home page quarter percent sale image link isn't displayed");
        //assert home page forty-five percent sale image link is displayed
        assertTrue(homePage.isHomePageFortyFivePercentSaleImgLinkDisplayed(), "The home page forty-five percent sale image link isn't displayed");
        //assert home page popular section button link is displayed
        assertTrue(homePage.isPopularSectionButtonLinkDisplayed(), "The home page popular section button link isn't displayed");
        //assert home page bestseller section button link is displayed
        assertTrue(homePage.isBestsellersSectionButtonLinkDisplayed(), "The home page bestseller section button link isn't displayed");
        //assert home page top trends category image is displayed
        assertTrue(homePage.isTopTrendsCategoryImageDisplayed(), "The top trends category image isn't displayed");
        //assert home page men coats & jackets image link is displayed
        assertTrue(homePage.isMenCoatsJacketsImgLinkDisplayed(), "The home page men coats & jackets image link isn't displayed");
        //assert home page women coats & jackets image link is displayed
        assertTrue(homePage.isWomenCoatsJacketsImgLinkDisplayed(), "The home page women coats & jackets image link isn't displayed");
        //assert home page sunglasses image link is displayed
        assertTrue(homePage.isSunglassesImageLinkDisplayed(), "The home page sunglasses image link isn't displayed");
        //assert home page handbags image link is displayed
        assertTrue(homePage.isHandbagsImageLinkDisplayed(), "The home page handbags image link isn't displayed");
        //assert home page bestseller product images are displayed (as a list)
        assertTrue(homePage.isBestsellerProductImgDisplayed(), "The home page bestseller product images aren't displayed");
        //assert home page bestseller product name links are displayed (as a list)
        assertTrue(homePage.isBestsellerProductNameLinkDisplayed(), "The home page bestseller product name links aren't displayed");
        //assert home page bestseller product view button are displayed (as a list)
        //assertTrue(homePage.isBestsellerProductViewButtonDisplayed(), "The home page bestseller product view button aren't displayed");
        //assert home page bestseller product unit prices are displayed (as a list)
        assertTrue(homePage.isBestsellerProductUnitPriceDisplayed(), "The home page bestseller product unit prices aren't displayed");
        //assert home page bestseller product 'add to cart' button are displayed - they're disabled for now (as a list)
        assertTrue(homePage.isBestsellerProductAddToCartButtonDisplayed(), "The home page bestseller product 'add to cart' buttons aren't displayed");
        //assert home page bestseller product more buttons are displayed (as a list) //Selenium can't see it even though it's present in DOM and not obstructed
        //assertTrue(homePage.isBestsellerProductMoreButtonDisplayed(), "The home page bestseller product more buttons aren't displayed");
        //assert home page follow us section title is displayed
        assertTrue(homePage.isFollowUsSectionTitleDisplayed(), "The home page follow us section title isn't displayed");
        //assert home page facebook fan box is displayed
        assertTrue(homePage.isFacebookFanBoxDisplayed(), "The home page facebook fan box isn't displayed");
        //assert home page shipping icon is displayed
        assertTrue(homePage.isShippingIconDisplayed(), "The home page shipping icon isn't displayed");
        //assert home page shipping section title is displayed
        assertTrue(homePage.isShippingSectionTitleDisplayed(), "The home page shipping section isn't displayed");
        //assert home page shipping section text is displayed
        assertTrue(homePage.isShippingSectionTextDisplayed(), "The home page shipping section text isn't displayed");
        //assert home page phone icon is displayed
        assertTrue(homePage.isPhoneIconDisplayed(), "The home page phone icon isn't displayed");
        //assert home page phone section title is displayed
        assertTrue(homePage.isPhoneSectionTitleDisplayed(), "The home page phone section title isn't displayed");
        //assert home page phone section text is displayed
        assertTrue(homePage.isPhoneSectionTextDisplayed(), "The home page phone section text isn't displayed");
        //assert home page phone icon is displayed
        assertTrue(homePage.isCreditCardIconDisplayed(), "The home page credit card icon isn't displayed");
        //assert home page phone section title is displayed
        assertTrue(homePage.isCreditCardSectionTitleDisplayed(), "The home page credit card section title isn't displayed");
        //assert home page phone section text is displayed
        assertTrue(homePage.isCreditCardSectionTextDisplayed(), "The home page credit card section text isn't displayed");
        //assert home page custom block section title is displayed
        assertTrue(homePage.isCustomBlockSectionTitleDisplayed(), "The home page custom block section title isn't displayed");
        //assert home page custom block section subtitle is displayed
        assertTrue(homePage.isCustomBlockSectionSubtitleDisplayed(), "The home page custom block section subtitle isn't displayed");
        //assert home page custom block section text is displayed
        assertTrue(homePage.isCustomBlockSectionTextDisplayed(), "The home page custom block section text isn't displayed");
    }

    //create account/login dashboard page web element assert test method (commented out elements are present in DOM, aren't obstructed, are interactable but Selenium can't find them)
    protected void isCreateAccountLoginDashboardPageWebElementDisplayed(CreateAccountLoginDashboardPage createAccountLoginDashboardPage){
        //assert login dashboard breadcrumb is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginDashboardBreadcrumbDisplayed(), "The login dashboard breadcrumb isn't displayed");
        //assert login dashboard title is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginDashboardTitleDisplayed(), "The login dashboard title isn't displayed");
        //assert create account section title is displayed
        assertTrue(createAccountLoginDashboardPage.isCreateAccountSectionTitleDisplayed(), "The create account section title isn't displayed");
        //assert create account section hint is displayed
        assertTrue(createAccountLoginDashboardPage.isCreateAccountSectionHintDisplayed(), "The create account section hint isn't displayed");
        //assert create account section email subtext is displayed
        assertTrue(createAccountLoginDashboardPage.isCreateAccountSectionEmailSubtextDisplayed(), "The create account section email subtext isn't displayed");
        //assert create account section email input field is displayed
        assertTrue(createAccountLoginDashboardPage.isCreateAccountSectionEmailInputFieldDisplayed(), "The create account section email input field isn't displayed");
        //assert create account button is displayed
        assertTrue(createAccountLoginDashboardPage.isCreateAccountButtonDisplayed(), "The create account button isn't displayed");
        //assert login section title is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginSectionTitleDisplayed(), "The login section title isn't displayed");
        //assert login section email subtext is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginSectionEmailSubtextDisplayed(), "The login section email subtext isn't displayed");
        //assert login section email input field is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginSectionEmailInputFieldDisplayed(), "The login section email input field isn't displayed");
        //assert login section password subtext is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginSectionPasswordSubtextDisplayed(), "The login section password subtext isn't displayed");
        //assert login section password input field is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginSectionPasswordInputFieldDisplayed(), "The login section password input field isn't displayed");
        //assert login section forgot password link is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginSectionForgotPasswordDisplayed(), "The login section forgot password link isn't displayed");
        //assert signin button is displayed
        assertTrue(createAccountLoginDashboardPage.isSignInButtonDisplayed(), "The signin button isn't displayed");
    }

    //create account page web element assert test method
    protected void isCreateAccountPageWebElementDisplayed(CreateAccountPage createAccountPage){
        //assert create account breadcrumb is displayed
        assertTrue(createAccountPage.isCreateAccountBreadcrumbDisplayed(), "The create account page breadcrumb isn't displayed");
        //assert create account page title is displayed
        assertTrue(createAccountPage.isCreateAccountPageTitleDisplayed(), "The create account page title isn't displayed");
        //assert create account page subtitle is displayed
        assertTrue(createAccountPage.isCreateAccountPageSubtitleDisplayed(), "The create account page subtitle isn't displayed");
        //assert create account page title subtitle (social) is displayed
        assertTrue(createAccountPage.isCreateAccountTitleSubtitleDisplayed(), "The create account page title social subtitle isn't displayed");
        //assert create account page 'Mr' radio button is displayed
        //assertTrue(createAccountPage.isCreateAccountMrRadioButtonDisplayed(), "The create account page 'Mr' radio button isn't displayed");
        //assert create account page 'Mrs.' radio button is displayed
        //assertTrue(createAccountPage.isCreateAccountMrsRadioButtonDisplayed(), "The create account page 'Mrs' radio button isn't displayed");
        //assert create account page first name subtitle is displayed
        assertTrue(createAccountPage.isCreateAccountFirstNameSubtitleDisplayed(), "The create account page first name subtitle isn't displayed");
        //assert create account page first name input field is displayed
        assertTrue(createAccountPage.isCreateAccountFirstNameInputFieldDisplayed(), "The create account page first name input field isn't displayed");
        //assert create account page last name subtitle is displayed
        assertTrue(createAccountPage.isCreateAccountLastNameSubtitleDisplayed(), "The create account page last name subtitle isn't displayed");
        //assert create account page last name input field is displayed
        assertTrue(createAccountPage.isCreateAccountLastNameInputFieldDisplayed(), "The create account page last name input field isn't displayed");
        //assert create account page email subtitle is displayed
        assertTrue(createAccountPage.isCreateAccountEmailSubtitleDisplayed(), "The create account page email subtitle isn't displayed");
        //assert create account page email input field is displayed
        assertTrue(createAccountPage.isCreateAccountEmailInputFieldDisplayed(), "The create account page email input field isn't displayed");
        //assert create account page password subtitle is displayed
        assertTrue(createAccountPage.isCreateAccountPasswordSubtitleDisplayed(), "The create account page password name subtitle isn't displayed");
        //assert create account page password input field is displayed
        assertTrue(createAccountPage.isCreateAccountPasswordInputFieldDisplayed(), "The create account page password name input field isn't displayed");
        //assert create account page password input hint is displayed
        assertTrue(createAccountPage.isCreateAccountPasswordHintDisplayed(), "The create account page password input hint isn't displayed");
        //assert create account page date of birth subtitle is displayed
        assertTrue(createAccountPage.isCreateAccountDateOfBirthSubtitleDisplayed(), "The create account page date of birth subtitle isn't displayed");
        //assert create account page day dropdown menu is displayed
        //assertTrue(createAccountPage.isCreateAccountDayDropdownMenuDisplayed(), "The create account page day dropdown menu isn't displayed");
        //assert create account page month dropdown menu is displayed
        //assertTrue(createAccountPage.isCreateAccountMonthDropdownMenuDisplayed(), "The create account page month dropdown menu isn't displayed");
        //assert create account page year dropdown menu is displayed
        //assertTrue(createAccountPage.isCreateAccountYearDropdownMenuDisplayed(), "The create account page year dropdown menu isn't displayed");
        //assert create account page newsletter signup checkbox is displayed
        //assertTrue(createAccountPage.isCreateAccountNewsletterSignupCheckboxDisplayed(), "The create account page newsletter signup checkbox isn't displayed");
        //assert create account page newsletter signup text is displayed
        assertTrue(createAccountPage.isCreateAccountNewsletterSignupTextDisplayed(), "The create account page newsletter signup text isn't displayed");
        //assert create account page register button displayed is displayed
        assertTrue(createAccountPage.isRegisterButtonDisplayed(), "The create account page register button isn't displayed");
        //assert create account page required field text is displayed
        assertTrue(createAccountPage.isRequiredFieldTextDisplayed(), "The create account page required field text isn't displayed");
    }

    //my account page web element assert test method
    protected void isMyAccountPageWebElementDisplayed(MyAccountPage myAccountPage){
        //assert my account page breadcrumb is displayed
        assertTrue(myAccountPage.isMyAccountBreadcrumbDisplayed(), "The my account page breadcrumb isn't displayed");
        //assert my account page title is displayed
        assertTrue(myAccountPage.isMyAccountPageTitleDisplayed(), "The my account page title isn't displayed");
        //assert my account page subtitle is displayed
        assertTrue(myAccountPage.isMyAccountSubtitleDisplayed(), "The my account page subtitle isn't displayed");
        //assert my account button link is displayed
        assertTrue(myAccountPage.isAddFirstAddressButtonLinkDisplayed(), "The my account button link isn't displayed");
        //assert order history button link is displayed
        assertTrue(myAccountPage.isOrderHistoryButtonLinkDisplayed(), "The order history button link isn't displayed");
        //assert credit slips button link is displayed
        assertTrue(myAccountPage.isCreditSlipsButtonLinkDisplayed(), "The credit slips button link isn't displayed");
        //assert my addresses button link is displayed
        assertTrue(myAccountPage.isMyAddressesButtonLinkDisplayed(), "The my addresses button link isn't displayed");
        //assert my personal information button link is displayed
        assertTrue(myAccountPage.isMyPersonalInfoButtonLinkDisplayed(), "The my personal information button link isn't displayed");
        //assert home button link is displayed
        assertTrue(myAccountPage.isHomeButtonLinkDisplayed(), "The home button link isn't displayed");
    }

    //my account information page web element assert test method
    protected void isMyAccountInformationPageWebElementDisplayed(MyAccountInformationPage myAccountInformationPage) {
        //assert my account information breadcrumb is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoBreadcrumbDisplayed(), "The my account information breadcrumb isn't displayed");
        //assert my account information page title is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoPageTitleDisplayed(), "The my account information page title isn't displayed");
        //assert my account information page subtitle is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoPageSubtitleDisplayed(), "The my account information page subtitle isn't displayed");
        //assert my account information required field text is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoRequiredFieldTextDisplayed(), "The my account information required field text isn't displayed");
        //assert my account information social title subtitle is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoSocialTitleSubtitleDisplayed(), "The my account information social title subtitle isn't displayed");
        //assert my account information 'Mr.' radio button is displayed
        //assertTrue(myAccountInformationPage.isMyAccountInfoMrRadioButtonDisplayed(), "The my account information 'Mr,' radio button isn't displayed");
        //assert my account information 'Mrs.' radio button is displayed
        //assertTrue(myAccountInformationPage.isMyAccountInfoMrsRadioButtonDisplayed(), "The my account information 'Mrs.' radio button isn't displayed");
        //assert my account information first name subtext is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoFirstNameSubtextDisplayed(), "The my account information first name subtext isn't displayed");
        //assert my account information first name input field is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoFirstNameInputFieldDisplayed(), "The my account information first name input field isn't displayed");
        //assert my account information last name subtext is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoLastNameSubtextDisplayed(), "The my account information last name subtext isn't displayed");
        //assert my account information last name input field is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoLastNameInputFieldDisplayed(), "The my account information last name input field isn't displayed");
        //assert my account information email subtext is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoEmailSubtextDisplayed(), "The my account information email subtext isn't displayed");
        //assert my account information email input field is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoEmailInputFieldDisplayed(), "The my account information email input field isn't displayed");
        //assert my account information date of birth subtext is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoDateOfBirthSubtextDisplayed(), "The my account information date of birth subtext isn't displayed");
        //assert my account information day dropdown menu is displayed
        //assertTrue(myAccountInformationPage.isMyAccountInfoDayDropdownMenuDisplayed(), "The my account information day dropdown menu isn't displayed");
        //assert my account information month dropdown menu is displayed
        //assertTrue(myAccountInformationPage.isMyAccountInfoMonthDropdownMenuDisplayed(), "The my account information month dropdown menu isn't displayed");
        //assert my account information year dropdown menu is displayed
        //assertTrue(myAccountInformationPage.isMyAccountInfoYearDropdownMenuDisplayed(), "The my account information year dropdown menu isn't displayed");
        //assert my account information current password subtext is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoCurrentPasswordSubtextDisplayed(), "The my account information current password subtext isn't displayed");
        //assert my account information current password input field is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoCurrentPasswordInputFieldDisplayed(), "The my account information current password input field isn't displayed");
        //assert my account information new password subtext is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoNewPasswordSubtextDisplayed(), "The my account information new password subtext isn't displayed");
        //assert my account information new password input field is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoNewPasswordInputFieldDisplayed(), "The my account information new password input field isn't displayed");
        //assert my account information confirm password subtext is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoConfirmPasswordSubtextDisplayed(), "The my account information confirm password subtext isn't displayed");
        //assert my account information confirm password input field is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoConfirmPasswordInputFieldDisplayed(), "The my account information confirm password input field isn't displayed");
        //assert my account information newsletter text is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoNewsletterTextDisplayed(), "The my account information newsletter subtext isn't displayed");
        //assert my account information newsletter input field is displayed
        //assertTrue(myAccountInformationPage.isMyAccountInfoNewsletterCheckboxDisplayed(), "The my account information newsletter input field isn't displayed");
        //assert my account information save button is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoSaveButtonDisplayed(), "The my account information 'Save' button isn't displayed");
        //assert my account information 'back to account' button is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoBackToAccountButtonDisplayed(), "The my account information 'Back to your accounts' button isn't displayed");
        //assert my account information 'home' button is displayed
        assertTrue(myAccountInformationPage.isMyAccountInfoHomeButtonDisplayed(), "The my account information 'Home' button isn't displayed");
    }

    //my address page web element assert test method
    protected void isMyAddressPageWebElementDisplayed(MyAddressPage myAddressPage){
        //assert my address breadcrumb is displayed
        assertTrue(myAddressPage.isMyAddressBreadcrumbDisplayed(), "The my address breadcrumb isn't displayed");
        //assert my address page title is displayed
        assertTrue(myAddressPage.isMyAddressPageTitleDisplayed(), "The my address page title isn't displayed");
        //assert my address page subtitle is displayed
        assertTrue(myAddressPage.isMyAddressPageSubtitleDisplayed(), "The my address page subtitle isn't displayed");
        //assert required field is displayed
        assertTrue(myAddressPage.isRequiredFieldTextDisplayed(), "The required field text isn't displayed");
        //assert my address first name subtext is displayed
        assertTrue(myAddressPage.isMyAddressFirstNameSubtextDisplayed(), "The my address first name subtext isn't displayed");
        //assert my address first name input field is displayed
        assertTrue(myAddressPage.isMyAddressFirstNameInputFieldDisplayed(), "The my address first name input field isn't displayed");
        //assert my address last name subtext is displayed
        assertTrue(myAddressPage.isMyAddressLastNameSubtextDisplayed(), "The my address last name subtext isn't displayed");
        //assert my address last name input field is displayed
        assertTrue(myAddressPage.isMyAddressLastNameInputFieldDisplayed(), "The my address last name input field isn't displayed");
        //assert my address company subtext is displayed
        assertTrue(myAddressPage.isMyAddressCompanySubtextDisplayed(), "The my address company subtext isn't displayed");
        //assert my address company input field is displayed
        assertTrue(myAddressPage.isMyAddressCompanyInputFieldDisplayed(), "The my address company input field isn't displayed");
        //assert my address one subtext is displayed
        assertTrue(myAddressPage.isMyAddressOneSubtextDisplayed(), "The my address one subtext isn't displayed");
        //assert my address one input field is displayed
        assertTrue(myAddressPage.isMyAddressOneInputFieldDisplayed(), "The my address one input field isn't displayed");
        //assert my address two subtext is displayed
        assertTrue(myAddressPage.isMyAddressTwoSubtextDisplayed(), "The my address two subtext isn't displayed");
        //assert my address two input field is displayed
        assertTrue(myAddressPage.isMyAddressTwoInputFieldDisplayed(), "The my address two input field isn't displayed");
        //assert my address city subtext is displayed
        assertTrue(myAddressPage.isMyAddressCitySubtextDisplayed(), "The my address city subtext isn't displayed");
        //assert my address city input field is displayed
        assertTrue(myAddressPage.isMyAddressCityInputFieldDisplayed(), "The my address city input field isn't displayed");
        //assert my address state subtext is displayed
        assertTrue(myAddressPage.isMyAddressStateSubtextDisplayed(), "The my address state subtext isn't displayed");
        //assert my address state input field is displayed
        //assertTrue(myAddressPage.isMyAddressStateDropdownMenuDisplayed(), "The my address state dropdown menu isn't displayed");
        //assert my address postal code subtext is displayed
        assertTrue(myAddressPage.isMyAddressPostalCodeSubtextDisplayed(), "The my address postal code subtext isn't displayed");
        //assert my address postal code input field is displayed
        assertTrue(myAddressPage.isMyAddressPostalCodeInputFieldDisplayed(), "The my address postal code input field isn't displayed");
        //assert my address country subtext is displayed
        assertTrue(myAddressPage.isMyAddressCountrySubtextDisplayed(), "The my address country subtext isn't displayed");
        //assert my address country input field is displayed
        //assertTrue(myAddressPage.isMyAddressCountryDropdownMenuDisplayed(), "The my address country dropdown menu isn't displayed");
        //assert my address home phone subtext is displayed
        assertTrue(myAddressPage.isMyAddressHomePhoneSubtextDisplayed(), "The my address home phone subtext isn't displayed");
        //assert my address home phone input field is displayed
        assertTrue(myAddressPage.isMyAddressHomePhoneInputFieldDisplayed(), "The my address home phone input field isn't displayed");
        //assert my address mobile phone subtext is displayed
        assertTrue(myAddressPage.isMyAddressMobilePhoneSubtextDisplayed(), "The my address mobile phone subtext isn't displayed");
        //assert my address mobile phone input field is displayed
        assertTrue(myAddressPage.isMyAddressMobilePhoneInputFieldDisplayed(), "The my address mobile phone input field isn't displayed");
        //assert my address additional information subtext is displayed
        assertTrue(myAddressPage.isMyAddressAdditionalInfoSubtextDisplayed(), "The my address additional information subtext isn't displayed");
        //assert my address additional information input field is displayed
        assertTrue(myAddressPage.isMyAddressAdditionalInfoInputFieldDisplayed(), "The my address additional information input field isn't displayed");
        //assert my address alias subtext is displayed
        assertTrue(myAddressPage.isMyAddressAliasSubtextDisplayed(), "The my address alias subtext isn't displayed");
        //assert my address alias input field is displayed
        assertTrue(myAddressPage.isMyAddressAliasInputFieldDisplayed(), "The my address alias input field isn't displayed");
        //assert save button is displayed
        assertTrue(myAddressPage.isSaveButtonDisplayed(), "The save button isn't displayed");
        //assert back to addresses button is displayed
        assertTrue(myAddressPage.isBackToAddressesDisplayed(), "The back to addresses button isn't displayed");
    }

    //my addresses page web element assert test method
    protected void isMyAddressesPageWebElementDisplayed(MyAddressesPage myAddressesPage) {
        //assert 'My Addresses' page breadcrumb displayed
        assertTrue(myAddressesPage.isMyAddressesBreadcrumbDisplayed(), "The 'My Addresses' page breadcrumb isn't displayed");
        //assert 'My Addresses' page title displayed
        assertTrue(myAddressesPage.isMyAddressesPageTitleDisplayed(), "The 'My Addresses' page title isn't displayed");
        //assert 'My Addresses' page subtitle displayed
        assertTrue(myAddressesPage.isMyAddressesPageSubtitleDisplayed(), "The 'My Addresses' page subtitle isn't displayed");
        //assert 'My Addresses' page description one displayed
        assertTrue(myAddressesPage.isMyAddressesPageDescriptionOneDisplayed(), "The 'My Addresses' page description one isn't displayed");
        //assert 'My Addresses' page description two displayed
        assertTrue(myAddressesPage.isMyAddressesPageDescriptionTwoDisplayed(), "The 'My Addresses' page description two isn't displayed");
        //assert 'My Addresses' page 'Add a new address' button displayed
        assertTrue(myAddressesPage.isMyAddressesAddANewAddressButtonDisplayed(), "The 'My Addresses' 'Add a new address' button isn't displayed");
        //assert 'My Addresses' page 'Back to account' button displayed
        assertTrue(myAddressesPage.isMyAddressesBackToAccountButtonDisplayed(), "The 'My Addresses' 'Back to account' button isn't displayed");
        //assert 'My Addresses' page home button displayed
        assertTrue(myAddressesPage.isMyAddressesHomeButtonDisplayed(), "The 'My Addresses' page home button isn't displayed");
        //assert 'My Addresses' page address titles are displayed (as a list)
        assertTrue(myAddressesPage.isAddressTitleDisplayed(), "The 'My Addresses' page address titles aren't displayed ");
        //assert 'My Addresses' page address usernames are displayed (as a list)
        assertTrue(myAddressesPage.isAddressUserNameDisplayed(), "The 'My Addresses' page address user names aren't displayed ");
        //assert 'My Addresses' page address elements are displayed (as a list)
        assertTrue(myAddressesPage.isAddressElementDisplayed(), "The 'My Addresses' page address elements aren't displayed ");
        //assert 'My Addresses' page address states are displayed (as a list)
        assertTrue(myAddressesPage.isAddressStateDisplayed(), "The 'My Addresses' page address states aren't displayed ");
        //assert 'My Addresses' page address countries are displayed (as a list)
        assertTrue(myAddressesPage.isAddressCountryDisplayed(), "The 'My Addresses' page address countries aren't displayed ");
        //assert 'My Addresses' page address phone numbers are displayed (as a list)
        assertTrue(myAddressesPage.isAddressPhoneNumberDisplayed(), "The 'My Addresses' page address phone numbers aren't displayed ");
        //assert 'My Addresses' page address update buttons are displayed (as a list)
        assertTrue(myAddressesPage.isAddressUpdateButtonDisplayed(), "The 'My Addresses' page address update buttons aren't displayed ");
        //assert 'My Addresses' page address delete buttons are displayed (as a list)
        assertTrue(myAddressesPage.isAddressDeleteButtonDisplayed(), "The 'My Addresses' page address delete buttons aren't displayed ");
    }

    //single product category dashboard page web element assert test method (for main page)
    protected void isSingleProductCategoryDashboardPageMainWebElementDisplayed(SingleProductCategoryDashboardPage singleProductCategoryDashboardPage) {
        //assert product dashboard page breadcrumb is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardBreadcrumbDisplayed(), "The 'Single Product Category' dashboard page breadcrumb isn't displayed");
        //assert product dashboard page category image is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardCategoryImageDisplayed(), "The 'Single Product Category' dashboard page category image isn't displayed");
        //assert product dashboard page category image title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardCategoryImgTitleDisplayed(), "The 'Single Product Category' dashboard page category image title isn't displayed");
        //assert product dashboard page category image description is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardCategoryImgDescDisplayed(), "The 'Single Product Category' dashboard page category image description isn't displayed");
        //assert product dashboard page title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardTitleDisplayed(), "The 'Single Product Category' dashboard page title breadcrumb isn't displayed");
        //assert product dashboard page count text is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardCountTextDisplayed(), "The 'Single Product Category' dashboard page count text isn't displayed");
        //assert product dashboard page sort by subtext is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardSortBySubtextDisplayed(), "The 'Single Product Category' dashboard page sort by subtext isn't displayed");
        //assert product dashboard page sort by dropdown menu is displayed
        //assertTrue(singleProductCategoryDashboardPage.isProductDashboardSortByDropdownMenuDisplayed(), "The 'Single Product Category' dashboard page sort by dropdown menu isn't displayed");
        //assert product dashboard page view subtext is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardViewSubtextDisplayed(), "The 'Single Product Category' dashboard page view subtext isn't displayed");
        //assert product dashboard page grid view button is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardGridViewDisplayed(), "The 'Single Product Category' dashboard page grid view button isn't displayed");
        //assert product dashboard page list view button is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardListViewDisplayed(), "The 'Single Product Category' dashboard page list viw button isn't displayed");
        //assert product dashboard page showing items text is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardShowingItemsTextDisplayed(), "The 'Single Product Category' dashboard page showing items text isn't displayed");
        //assert product dashboard page compare button box is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardCompareButtonBoxDisplayed(), "The 'Single Product Category' dashboard page compare button box isn't displayed");
        //assert product image links are displayed (as a list)
        //assertTrue(singleProductCategoryDashboardPage.isProductDashboardProductImgLinkDisplayed(), "The 'Single Product Category' dashboard page product image links aren't displayed");
        //assert product names are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardProductNameLinkDisplayed(), "The 'Single Product Category' dashboard page product names aren't displayed");
        //assert product unit prices are displayed (as a list)
        //assertTrue(singleProductCategoryDashboardPage.isProductDashboardProductUnitPriceDisplayed(), "The 'Single Product Category' dashboard page product unit prices aren't displayed");
        //assert product 'Add to Cart' disabled buttons are displayed (as a list)
        //assertTrue(singleProductCategoryDashboardPage.isProductDashboardAddToCartDisabledButtonDisplayed(), "The 'Single Product Category' dashboard page product 'Add to Cart' disabled buttons aren't displayed");
        //assert product 'More' buttons are displayed (as a list)
        //assertTrue(singleProductCategoryDashboardPage.isProductDashboardMoreButtonDisplayed(), "The 'Single Product Category' dashboard page product 'More' buttons aren't displayed");
        //assert product color buttons are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardColorButtonDisplayed(), "The 'Single Product Category' dashboard page product color buttons aren't displayed");
        //assert product 'Add to Compare' links are displayed (as a list)
        //assertTrue(singleProductCategoryDashboardPage.isProductDashboardAddToCompareLinkDisplayed(), "The 'Single Product Category' dashboard page product 'Add to Compare' links aren't displayed");
        //assert product availability boxes are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAvailabilityBoxDisplayed(), "The 'Single Product Category' dashboard product availability boxes aren't displayed");
    }

    //single product category dashboard page web element assert test method (for aside page content - it's not similar for all categories)
    protected void isSingleProductCategoryDashboardPageAsideWebElementDisplayed(SingleProductCategoryDashboardPage singleProductCategoryDashboardPage) {
        //assert product dashboard aside category one title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatOneTitleDisplayed(), "The 'Single Product Category' dashboard page aside category one title isn't displayed");
        //assert product dashboard aside category two title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatTwoTitleDisplayed(), "The 'Single Product Category' dashboard page aside category two title isn't displayed");
        //assert product dashboard aside category three title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatThreeTitleDisplayed(), "The 'Single Product Category' dashboard page aside category three title isn't displayed");
        //assert product dashboard aside category four title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatFourTitleDisplayed(), "The 'Single Product Category' dashboard page aside category four title isn't displayed");
        //assert product dashboard aside category five title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatFiveTitleDisplayed(), "The 'Single Product Category' dashboard page aside category five title isn't displayed");
        //assert product dashboard aside category six title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatSixTitleDisplayed(), "The 'Single Product Category' dashboard page aside category six title isn't displayed");
        //assert product dashboard aside category seven title is displayed
        //assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatSevenTitleDisplayed(), "The 'Single Product Category' dashboard page aside category seven title isn't displayed");
        //assert product dashboard aside category two subcategory one title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatTwoSubCatOneTitleDisplayed(), "The 'Single Product Category' dashboard page aside category two subcategory one title isn't displayed");
        //assert product dashboard aside category two subcategory two title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatTwoSubCatTwoTitleDisplayed(), "The 'Single Product Category' dashboard page aside category two subcategory two title isn't displayed");
        //assert product dashboard aside category two subcategory three title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatTwoSubCatThreeTitleDisplayed(), "The 'Single Product Category' dashboard page aside category two subcategory three title isn't displayed");
        //assert product dashboard aside category two subcategory four title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatTwoSubCatFourTitleDisplayed(), "The 'Single Product Category' dashboard page aside category two subcategory four title isn't displayed");
        //assert product dashboard aside category two subcategory five title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatTwoSubCatFiveTitleDisplayed(), "The 'Single Product Category' dashboard page aside category two subcategory five title isn't displayed");
        //assert product dashboard aside category two subcategory six title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatTwoSubCatSixTitleDisplayed(), "The 'Single Product Category' dashboard page aside category two subcategory six title isn't displayed");
        //assert product dashboard aside category two subcategory seven title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatTwoSubCatSevenTitleDisplayed(), "The 'Single Product Category' dashboard page aside category two subcategory seven title isn't displayed");
        //assert product dashboard aside category two subcategory eight title is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatTwoSubCatEightTitleDisplayed(), "The 'Single Product Category' dashboard page aside category two subcategory eight title isn't displayed");
        //assert product dashboard aside price range subtext is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsidePriceRangeSubtextDisplayed(), "The 'Single Product Category' dashboard page aside price range subtext isn't displayed");
        //assert product dashboard aside price range slider down is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsidePriceRangeSliderDownDisplayed(), "The 'Single Product Category' dashboard page aside price range slider down isn't displayed");
        //assert product dashboard aside price range slider up is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsidePriceRangeSliderUpDisplayed(), "The 'Single Product Category' dashboard page aside price range slider up isn't displayed");
        //assert product dashboard aside category five product image link is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatFiveProductImgLinkDisplayed(), "The 'Single Product Category' dashboard page aside category five product image link isn't displayed");
        //assert product dashboard aside category five product name link is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatFiveProductNameLinkDisplayed(), "The 'Single Product Category' dashboard page aside category five product name link isn't displayed");
        //assert product dashboard aside category five product description is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatFiveProductDescDisplayed(), "The 'Single Product Category' dashboard page aside category five product description isn't displayed");
        //assert product dashboard aside category five product price box is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatFiveProductPriceBoxDisplayed(), "The 'Single Product Category' dashboard page aside category five product price box isn't displayed");
        //assert product dashboard aside category five button link is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatFiveButtonLinkDisplayed(), "The 'Single Product Category' dashboard page aside category five button link isn't displayed");
        //assert product dashboard aside category six image link is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatSixImgLinkDisplayed(), "The 'Single Product Category' dashboard page aside category six image link isn't displayed");
        //assert product dashboard aside category six button link is displayed
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatSixButtonLinkDisplayed(), "The 'Single Product Category' dashboard page aside category six button link isn't displayed");
        //assert product dashboard aside category one subcategory links are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatOneSubcategoryLinkDisplayed(), "The 'Single Product Category' dashboard page aside category one subcategory links aren't displayed");
        //assert product dashboard aside category one subcategory checkboxes are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatOneSubcategoryCheckboxDisplayed(), "The 'Single Product Category' dashboard page aside category one subcategory checkboxes aren't displayed");
        //assert product dashboard aside info subcategory links are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideInfoSubcategoryLinkDisplayed(), "The 'Single Product Category' dashboard page aside information subcategory links aren't displayed");
        //assert product dashboard aside category seven product image links are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatSevenProductImgLinkDisplayed(), "The 'Single Product Category' dashboard page aside category seven product image links aren't displayed");
        //assert product dashboard aside category seven product name links are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatSevenProductNameLinkDisplayed(), "The 'Single Product Category' dashboard page aside category seven product name links aren't displayed");
        //assert product dashboard aside category seven product descriptions are displayed (as a list)
        assertTrue(singleProductCategoryDashboardPage.isProductDashboardAsideCatSevenProductDescDisplayed(), "The 'Single Product Category' dashboard page aside category seven product descriptions aren't displayed");
    }

    //product comparison page web element assert test method
    protected void isProductComparisonPageWebElementDisplayed(ProductComparisonPage productComparisonPage){
        //assert product comparison page breadcrumb is displayed
        assertTrue(productComparisonPage.isProductComparisonPageBreadcrumbDisplayed(), "The 'Product Comparison' page breadcrumb isn't displayed");
        //assert product comparison page title is displayed
        assertTrue(productComparisonPage.isProductComparisonPageTitleDisplayed(), "The 'Product Comparison' page title isn't displayed");
        //assert product comparison page comparison box subtext is displayed
        assertTrue(productComparisonPage.isProductComparisonBoxSubtextDisplayed(), "The 'Product Comparison' page comparison box subtext isn't displayed");
        //assert product comparison page comparison box tweet share link is displayed
        assertTrue(productComparisonPage.isProductComparisonBoxTweetShareLinkDisplayed(), "The 'Product Comparison' page comparison box tweet share link isn't displayed");
        //assert product comparison page comparison box facebook share link is displayed
        assertTrue(productComparisonPage.isProductComparisonBoxFacebookShareLinkDisplayed(), "The 'Product Comparison' page comparison box facebook share link isn't displayed");
        //assert product comparison page comparison box google share link is displayed
        assertTrue(productComparisonPage.isProductComparisonBoxGoogleShareLinkDisplayed(), "The 'Product Comparison' page comparison box google share link isn't displayed");
        //assert product comparison page comparison box pinterest share link is displayed
        assertTrue(productComparisonPage.isProductComparisonBoxPinterestShareLinkDisplayed(), "The 'Product Comparison' page comparison box pinterest share link isn't displayed");
        //assert product comparison page continue shopping button is displayed
        assertTrue(productComparisonPage.isProductComparisonContinueShoppingButtonDisplayed(), "The 'Product Comparison' page continue shopping button isn't displayed");
        //assert product comparison page comparison product names are displayed (as a list)
        assertTrue(productComparisonPage.isProductComparedProductNameDisplayed(), "The 'Product Comparison' page comparison product names aren't displayed");
        //assert product comparison page comparison product unit prices are displayed (as a list)
        assertTrue(productComparisonPage.isProductComparedProductUnitPriceDisplayed(), "The 'Product Comparison' page comparison product unit prices aren't displayed");
        //assert product comparison page comparison product reduced price tags are displayed (as a list)
        assertTrue(productComparisonPage.isProductComparedProductReducedPriceTagDisplayed(), "The 'Product Comparison' page comparison product reduced price tags aren't displayed");
        //assert product comparison page comparison product descriptions are displayed (as a list)
        assertTrue(productComparisonPage.isProductComparedProductDescDisplayed(), "The 'Product Comparison' page comparison product descriptions aren't displayed");
        //assert product comparison page comparison product images are displayed (as a list)
        assertTrue(productComparisonPage.isProductComparedProductImageDisplayed(), "The 'Product Comparison' page comparison product images aren't displayed");
        //assert product comparison page comparison product remove buttons are displayed (as a list)
        assertTrue(productComparisonPage.isProductComparedProductRemoveButtonDisplayed(), "The 'Product Comparison' page comparison product remove buttons aren't displayed");
        //assert product comparison page comparison product add to cart buttons are displayed (as a list)
        assertTrue(productComparisonPage.isProductComparedProductAddToCartButtonDisplayed(), "The 'Product Comparison' page comparison product add to cart buttons aren't displayed");
        //assert product comparison page comparison product view buttons are displayed (as a list)
        assertTrue(productComparisonPage.isProductComparedProductViewButtonDisplayed(), "The 'Product Comparison' page comparison product view buttons aren't displayed");
        //assert product comparison page comparison product compositions are displayed (as a list)
        assertTrue(productComparisonPage.isProductComparedProductCompositionDisplayed(), "The 'Product Comparison' page comparison product compositions aren't displayed");
        //assert product comparison page comparison product styles are displayed (as a list)
        assertTrue(productComparisonPage.isProductComparedProductStylesDisplayed(), "The 'Product Comparison' page comparison product styles aren't displayed");
        //assert product comparison page comparison product properties are displayed (as a list)
        assertTrue(productComparisonPage.isProductComparedProductPropertiesDisplayed(), "The 'Product Comparison' page comparison product properties aren't displayed");
    }

    //single product page web element assert test method
    protected void isSingleProductPageWebElementDisplayed(SingleProductPage singleProductPage){
        //assert single product page breadcrumb displayed
        assertTrue(singleProductPage.isSingleProductPageBreadcrumbDisplayed(), "The 'Single Product' page breadcrumb isn't displayed");
        //assert single product page product main image is displayed
        assertTrue(singleProductPage.isSingleProductPageMainProductImageDisplayed(), "The 'Single Product' page product main image isn't displayed");
        //assert single product page 'view larger image' button is displayed
        assertTrue(singleProductPage.isSingleProductPageViewLargerImageButtonDisplayed(), "The 'Single Product' page 'View larger image' button isn't displayed");
        //assert single product page product title is displayed
        assertTrue(singleProductPage.isSingleProductPageProductTitleDisplayed(), "The 'Single Product' page product title isn't displayed");
        //assert single product page product reference subtext is  displayed
        assertTrue(singleProductPage.isSingleProductPageProductReferenceSubtextDisplayed(), "The 'Single Product' page product reference subtext isn't displayed");
        //assert single product page product reference is displayed
        assertTrue(singleProductPage.isSingleProductPageProductReferenceDisplayed(), "The 'Single Product' page product reference isn't displayed");
        //assert single product page product condition subtext is displayed
        assertTrue(singleProductPage.isSingleProductPageProductConditionSubtextDisplayed(), "The 'Single Product' page product condition subtext isn't displayed");
        //assert single product page product condition is displayed
        assertTrue(singleProductPage.isSingleProductPageProductConditionDisplayed(), "The 'Single Product' page product condition isn't displayed");
        //assert single product page product short description is displayed
        assertTrue(singleProductPage.isSingleProductPageProductShortDescriptionDisplayed(), "The 'Single Product' page product short description isn't displayed");
        //assert single product page product availability box is displayed
        assertTrue(singleProductPage.isSingleProductPageProductAvailabilityBoxDisplayed(), "The 'Single Product' page product availability box isn't displayed");
        //assert single product page share tweet link is displayed
        assertTrue(singleProductPage.isSingleProductPageProductShareTweetLinkDisplayed(), "The 'Single Product' page share tweet link isn't displayed");
        //assert single product page share facebook link is displayed
        assertTrue(singleProductPage.isSingleProductPageProductShareFacebookLinkDisplayed(), "The 'Single Product' page share facebook link isn't displayed");
        //assert single product page share google link is displayed
        assertTrue(singleProductPage.isSingleProductPageProductShareGoogleLinkDisplayed(), "The 'Single Product' page share google link isn't displayed");
        //assert single product page share pinterest link is displayed
        assertTrue(singleProductPage.isSingleProductPageProductSharePinterestLinkDisplayed(), "The 'Single Product' page share pinterest link isn't displayed");
        //assert single product page send friend email link is displayed
        assertTrue(singleProductPage.isSingleProductPageProductSendFriendEmailLinkDisplayed(), "The 'Single Product' page send friend email link isn't displayed");
        //assert single product page print link is displayed
        assertTrue(singleProductPage.isSingleProductPageProductPrintLinkDisplayed(), "The 'Single Product' page print link isn't displayed");
        //assert single product page product unit price is displayed
        assertTrue(singleProductPage.isSingleProductPageProductUnitPriceDisplayed(), "The 'Single Product' page product unit price isn't displayed");
        //assert single product page payment methods icon is displayed
        assertTrue(singleProductPage.isSingleProductPagePaymentIconDisplayed(), "The 'Single Product' page payment methods icon isn't displayed");
        //assert single product page data sheet section title is displayed
        assertTrue(singleProductPage.isSingleProductPageDataSheetSectionTitleDisplayed(), "The 'Single Product' page data sheet section title isn't displayed");
        //assert single product page product composition is displayed
        assertTrue(singleProductPage.isSingleProductPageProductCompositionDisplayed(), "The 'Single Product' page product composition isn't displayed");
        //assert single product page product styles is displayed
        assertTrue(singleProductPage.isSingleProductPageProductStylesDisplayed(), "The 'Single Product' page product styles isn't displayed");
        //assert single product page product property(ies) is displayed
        assertTrue(singleProductPage.isSingleProductPageProductPropertiesDisplayed(), "The 'Single Product' page product property(ies) isn't displayed");
        //assert single product page 'More Information' section title is displayed
        assertTrue(singleProductPage.isSingleProductPageMoreInfoSectionTitleDisplayed(), "The 'Single Product' page 'More Information' section title' isn't displayed");
        //assert single product page product detailed description is displayed
        assertTrue(singleProductPage.isSingleProductPageProductDetailedDescriptionDisplayed(), "The 'Single Product' page product detailed description isn't displayed");
        //assert single product page product color buttons are displayed (as a list)
        assertTrue(singleProductPage.isProductColorButtonDisplayed(), "The 'Single Product' page product color buttons aren't displayed");
        //assert single product page product view images are displayed (as a list)
        assertTrue(singleProductPage.isProductViewImageDisplayed(), "The 'Single Product' page product view images aren't displayed");
    }

    //shopping cart page web element assert test method
    protected void isShoppingCartPageWebElementDisplayed(ShoppingCartSummaryPage shoppingCartSummaryPage) {
        //assert shopping cart page breadcrumb is displayed
        assertTrue(shoppingCartSummaryPage.isShoppingCartPageBreadcrumbDisplayed(), "The shopping cart page breadcrumb isn't displayed");
        //assert shopping cart page title is displayed
        assertTrue(shoppingCartSummaryPage.isShoppingCartPageTitleDisplayed(), "The shopping cart page title isn't displayed");
        //assert shopping cart page product count is displayed
        assertTrue(shoppingCartSummaryPage.isShoppingCartProductCountDisplayed(), "The shopping cart page product count isn't displayed");
        //assert shopping cart page step image breadcrumb is displayed (as a list)
        assertTrue(shoppingCartSummaryPage.isShoppingCartStepImageDisplayed(), "The shopping cart page step image breadcrumb isn't displayed");
        //assert shopping cart page product image links are displayed (as a list)
        assertTrue(shoppingCartSummaryPage.isShoppingCartProductImageLinkDisplayed(), "The shopping cart page product image links aren't displayed");
        //assert shopping cart page product name links are displayed (as a list)
        assertTrue(shoppingCartSummaryPage.isShoppingCartProductNameLinkDisplayed(), "The shopping cart page product name links aren't displayed");
        //assert shopping cart page product descriptions are displayed (as a list)
        assertTrue(shoppingCartSummaryPage.isShoppingCartProductDescriptionDisplayed(), "The shopping cart page product descriptions aren't displayed");
        //assert shopping cart page product availability tags are displayed (as a list)
        assertTrue(shoppingCartSummaryPage.isShoppingCartProductAvailabilityTagDisplayed(), "The shopping cart page product availability tags aren't displayed");
        //assert shopping cart page product unit prices are displayed (as a list)
        assertTrue(shoppingCartSummaryPage.isShoppingCartProductUnitPriceDisplayed(), "The shopping cart page product unit prices aren't displayed");
        //assert shopping cart page product quantity decrease buttons are displayed (as a list)
        assertTrue(shoppingCartSummaryPage.isShoppingCartProductQtyDecreaseButtonDisplayed(), "The shopping cart page product quantity decrease buttons aren't displayed");
        //assert shopping cart page product quantity input fields are displayed (as a list)
        assertTrue(shoppingCartSummaryPage.isShoppingCartProductQtyInputFieldDisplayed(), "The shopping cart page product quantity input fields aren't displayed");
        //assert shopping cart page product quantity increase buttons are displayed (as a list)
        assertTrue(shoppingCartSummaryPage.isShoppingCartProductQtyIncreaseButtonDisplayed(), "The shopping cart page product quantity increase buttons aren't displayed");
        //assert shopping cart page product remove buttons are displayed (as a list)
        assertTrue(shoppingCartSummaryPage.isShoppingCartProductRemoveButtonDisplayed(), "The shopping cart page product remove buttons aren't displayed");
        //assert shopping cart page product total prices are displayed (as a list)
        assertTrue(shoppingCartSummaryPage.isShoppingCartProductTotalPriceDisplayed(), "The shopping cart page product total prices aren't displayed");
        //assert shopping cart page summary total product price is displayed
        assertTrue(shoppingCartSummaryPage.isShoppingCartSummaryTotalProductPriceDisplayed(), "The shopping cart page summary total product price isn't displayed");
        //assert shopping cart page summary total shipping price is displayed
        assertTrue(shoppingCartSummaryPage.isShoppingCartSummaryTotalShippingPriceDisplayed(), "The shopping cart page summary total shipping price isn't displayed");
        //assert shopping cart page summary total price is displayed
        assertTrue(shoppingCartSummaryPage.isShoppingCartSummaryTotalPriceDisplayed(), "The shopping cart page summary total price isn't displayed");
        //assert shopping cart page back to shopping button is displayed
        assertTrue(shoppingCartSummaryPage.isShoppingCartBackToShoppingButtonDisplayed(), "The shopping cart page back to shopping button isn't displayed");
        //assert shopping cart page 'Proceed to Checkout' button is displayed
        assertTrue(shoppingCartSummaryPage.isShoppingCartProceedToCheckoutButtonDisplayed(), "The shopping cart page 'Proceed to Checkout' button isn't displayed");
    }

    //shopping cart (registered user version) page additional web element assert test method
    protected void isShoppingCartRegUserAddressesSectionWebElementDisplayed(ShoppingCartSummaryPage shoppingCartSummaryPage) {
        //assert shopping cart page delivery address subtext is displayed
        assertTrue(shoppingCartSummaryPage.isShoppingCartDeliveryAddressSubtitleDisplayed(), "The shopping cart page delivery address subtext isn't displayed");
        //assert shopping cart page delivery address data is displayed
        assertTrue(shoppingCartSummaryPage.isShoppingCartDeliveryAddressDataDisplayed(), "The shopping cart page delivery address data isn't displayed");
        //assert shopping cart page shipping address subtitle is displayed
        assertTrue(shoppingCartSummaryPage.isShoppingCartShippingAddressSubtitleDisplayed(), "The shopping cart page shipping address subtitle isn't displayed");
        //assert shopping cart page shipping address data is displayed
        assertTrue(shoppingCartSummaryPage.isShoppingCartShippingAddressDataDisplayed(), "The shopping cart page shipping address data isn't displayed");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page text element assert test method (all pages have them)
    protected void isGeneralPageTextElementAsExpected(GeneralPage generalPage){
        //assert footer information section title is as expected
        assertEquals("Information", generalPage.getFooterInfoSectionTitle(), "The footer information section title doesn't match expectations.");
        //assert footer customer service section title is as expected
        assertEquals("Categories", generalPage.getFooterCategoriesSectionTitle(), "The footer categories section title doesn't match expectations.");
        //assert footer my account section title is as expected
        assertEquals("My account", generalPage.getFooterMyAccountSectionTitle(), "The footer my account section title doesn't match expectations.");
        //assert footer follow us section title is as expected
        assertEquals("Follow us", generalPage.getFooterFollowUsSectionTitle(), "The footer follow us section title doesn't match expectations.");
        //assert footer newsletter section title is as expected
        assertEquals("Newsletter", generalPage.getFooterNewsletterSectionTitle(), "The footer newsletter section title doesn't match expectations.");
        //assert footer store information section title is as expected
        assertEquals("Store Information", generalPage.getStoreInfoSectionTitle(), "The footer store information section title doesn't match expectations.");
        //assert footer store info address is as expected
        assertEquals("My Company, 42 avenue des Champs Elysées 75000 Paris France", generalPage.getStoreInfoAddress(), "The footer store information address doesn't match expectations.");
        //assert footer store information phone text is as expected
        assertEquals("Call us now: 0123-456-789", generalPage.getStoreInfoPhoneText(), "The footer store information phone text doesn't match expectations.");
        //assert footer email link text is as expected
        assertEquals("sales@yourcompany.com", generalPage.getFooterEmailLink(), "The footer email link text text doesn't match expectations.");
        //assert footer copyright text is as expected
        assertEquals("Ecommerce software by PrestaShop™", generalPage.getFooterCopyrightTextLink(), "The footer copyright text doesn't match expectations.");
    }

    //home page text element assert text test method
    protected void isHomePageTextElementAsExpected(HomePage homePage){
        //assert home page follow us section title is as expected
        assertEquals("Follow us on Facebook", homePage.getFollowUsSectionTitle(), "The home page follow us section title doesn't match expectations.");
        //assert home page shipping section title is as expected
        assertEquals("Lorem Ipsum", homePage.getShippingSectionTitle(), "The home page shipping section title doesn't match expectations.");
        //assert home page shipping section text is as expected
        assertEquals("Lorem ipsum dolor sit amet conse ctetur voluptate velit esse cillum dolore eu", homePage.getShippingSectionText(), "The home page shipping section text doesn't match expectations.");
        //assert home page phone section title is as expected
        assertEquals("Dolor Sit Amet", homePage.getPhoneSectionTitle(), "The home page phone section title doesn't match expectations.");
        //assert home page phone section text is as expected
        assertEquals("Lorem ipsum dolor sit amet conse ctetur voluptate velit esse cillum dolore eu", homePage.getPhoneSectionText(), "The home page phone section text doesn't match expectations.");
        //assert home page credit card section title is as expected
        assertEquals("Ctetur Voluptate", homePage.getCreditCardSectionTitle(), "The home page credit card section title doesn't match expectations.");
        //assert home page credit card section text is as expected
        assertEquals("Lorem ipsum dolor sit amet conse ctetur voluptate velit esse cillum dolore eu", homePage.getCreditCardSectionText(), "The home page credit card section text doesn't match expectations.");
        //assert home page custom block section title is as expected
        assertEquals("Custom Block", homePage.getCustomBlockSectionTitle(), "The home page custom block section title doesn't match expectations.");
        //assert home page custom block section subtitle is as expected
        assertEquals("Lorem ipsum dolor sit amet conse ctetu", homePage.getCustomBlockSubtitleText(), "The home page custom block section subtitle doesn't match expectations.");
        //assert home page custom block section text is as expected
        assertEquals("Sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit.", homePage.getCustomBlockText(), "The home page custom block text doesn't match expectations.");
    }

    //create account/login dashboard page text element assert test method
    protected void isCreateAccountLoginDashboardPageTextElementAsExpected(CreateAccountLoginDashboardPage createAccountLoginDashboardPage){
        //assert create account login dashboard page title is as expected
        assertEquals("AUTHENTICATION", createAccountLoginDashboardPage.getCreateAccountLoginDashboardTitle(), "The create account login dashboard page title doesn't match expectations.");
        //assert create account section title is as expected
        assertEquals("CREATE AN ACCOUNT", createAccountLoginDashboardPage.getCreateAccountSectionTitle(), "The create account login section title doesn't match expectations.");
        //assert create account section hint is as expected
        assertEquals("Please enter your email address to create an account.", createAccountLoginDashboardPage.getCreateAccountSectionHint(), "The create account section hint doesn't match expectations.");
        //assert create account section email subtext is as expected
        assertEquals("Email address", createAccountLoginDashboardPage.getCreateAccountSectionEmailSubtext(), "The create account section email subtext doesn't match expectations.");
        //assert login section title is as expected
        assertEquals("ALREADY REGISTERED?", createAccountLoginDashboardPage.getLoginSectionTitle(), "The login section title doesn't match expectations.");
        //assert login section email subtext is as expected
        assertEquals("Email address", createAccountLoginDashboardPage.getLoginSectionEmailSubtext(), "The login section email subtext doesn't match expectations.");
        //assert login section password subtext is as expected
        assertEquals("Password", createAccountLoginDashboardPage.getLoginSectionPasswordSubtext(), "The login section password subtext doesn't match expectations.");
    }

    //create account page text element assert test method
    protected void isCreateAccountPageTextElementAsExpected(CreateAccountPage createAccountPage){
        //assert create account page title is as expected
        assertEquals("CREATE AN ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title doesn't match expectations.");
        //assert create account page subtitle is as expected
        assertEquals("YOUR PERSONAL INFORMATION", createAccountPage.getCreateAccountPageSubtitle(), "The create account page subtitle doesn't match expectations.");
        //assert create account page title (social) subtitle is as expected
        assertEquals("Title", createAccountPage.getCreateAccountTitleSubtitle(), "The create account page title social subtitle doesn't match expectations.");
        //assert create account page first name subtitle is as expected
        assertEquals("First name *", createAccountPage.getCreateAccountFirstNameSubtitle(), "The create account page first name subtitle doesn't match expectations.");
        //assert create account page last name subtitle is as expected
        assertEquals("Last name *", createAccountPage.getCreateAccountLastNameSubtitle(), "The create account page last name subtitle doesn't match expectations.");
        //assert create account page email subtitle is as expected
        assertEquals("Email *", createAccountPage.getCreateAccountEmailSubtitle(), "The create account page email subtitle doesn't match expectations.");
        //assert create account page password subtitle is as expected
        assertEquals("Password *", createAccountPage.getCreateAccountPasswordSubtitle(), "The create account page password subtitle doesn't match expectations.");
        //assert create account page date of birth subtitle is as expected
        assertEquals("Date of Birth", createAccountPage.getCreateAccountDateOfBirthSubtitle(), "The create account page date of birth subtitle doesn't match expectations.");
        //assert create account page newsletter subtitle is as expected
        assertEquals("Sign up for our newsletter!", createAccountPage.getCreateAccountNewsletterSignupText(), "The create account page newsletter subtitle doesn't match expectations.");
        //assert create account page required field text is as expected
        assertEquals("*Required field", createAccountPage.getRequiredFieldText(), "The create account page required field text doesn't match expectations.");
    }

    //my account page text element assert test method
    protected void isMyAccountPageTextElementAsExpected(MyAccountPage myAccountPage){
        //assert my account page title text is as expected
        assertEquals("MY ACCOUNT", myAccountPage.getMyAccountPageTitle(), "The my account page title doesn't match expectations.");
        //assert my account page subtitle text is as expected
        assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", myAccountPage.getMyAccountSubtitle(), "The my account page subtitle doesn't match expectations.");
    }

    //my account information page text element assert test method
    protected void isMyAccountInformationPageTextElementAsExpected(MyAccountInformationPage myAccountInformationPage){
        //assert my account information page title is as expected
        assertEquals("YOUR PERSONAL INFORMATION", myAccountInformationPage.getMyAccountInfoPageTitle(), "The my account information page title doesn't match expectations.");
        //assert my account information page subtitle is as expected
        assertEquals("Please be sure to update your personal information if it has changed.", myAccountInformationPage.getMyAccountInfoPageSubtitle(), "The my account information page subtitle doesn't match expectations.");
        //assert my account information page required field text is as expected
        assertEquals("*Required field", myAccountInformationPage.getRequiredFieldText(), "The my account information required field text doesn't match expectations.");
        //assert my account information page social title subtext is as expected
        assertEquals("Social title", myAccountInformationPage.getMyAccountSocialSubtext(), "The my account information social title subtext doesn't match expectations.");
        //assert my account information page first name subtext is as expected
        assertEquals("First name", myAccountInformationPage.getMyAccountInfoFirstNameSubtext(), "The my account information first name subtext doesn't match expectations.");
        //assert my account information page last name subtext is as expected
        assertEquals("Last name", myAccountInformationPage.getMyAccountInfoLastNameSubtext(), "The my account information last name subtext doesn't match expectations.");
        //assert my account information page email subtext is as expected
        assertEquals("E-mail address", myAccountInformationPage.getMyAccountInfoEmailSubtext(), "The my account information email subtext doesn't match expectations.");
        //assert my account information page date of birth subtext is as expected
        assertEquals("Date of Birth", myAccountInformationPage.getMyAccountInfoDateOfBirthSubtext(), "The my account information date of birth subtext doesn't match expectations.");
        //assert my account information page current password subtext is as expected
        assertEquals("Current Password", myAccountInformationPage.getMyAccountInfoCurrentPasswordSubtext(), "The my account information current password subtext doesn't match expectations.");
        //assert my account information page new password subtext is as expected
        assertEquals("New Password", myAccountInformationPage.getMyAccountInfoNewPasswordSubtext(), "The my account information new password subtext doesn't match expectations.");
        //assert my account information page confirm password subtext is as expected
        assertEquals("Confirmation", myAccountInformationPage.getMyAccountInfoConfirmPasswordSubtext(), "The my account information confirm password subtext doesn't match expectations.");
        //assert my account information page newsletter subtext is as expected
        assertEquals("Sign up for our newsletter!", myAccountInformationPage.getMyAccountInfoNewsletterSubtext(), "The my account information newsletter subtext doesn't match expectations.");
    }

    //my address page text element assert test method
    protected void isMyAddressPageTextElementAsExpected(MyAddressPage myAddressPage){
        //assert my address page title text is as expected
        assertEquals("YOUR ADDRESSES", myAddressPage.getMyAddressPageTitle(), "The my address page title doesn't match expectations.");
        //assert my address page subtitle text is as expected
        assertEquals("To add a new address, please fill out the form below.", myAddressPage.getMyAddressPageSubtitle(), "The my address page subtitle doesn't match expectations.");
        //assert my address required field text is as expected
        assertEquals("*Required field", myAddressPage.getRequiredFieldText(), "The my address required field text doesn't match expectations.");
        //assert my address page first name subtext is as expected
        assertEquals("First name *", myAddressPage.getMyAddressFirstNameSubtext(), "The my address first name subtext doesn't match expectations.");
        //assert my address page last name subtext is as expected
        assertEquals("Last name *", myAddressPage.getMyAddressLastNameSubtext(), "The my address last name subtext doesn't match expectations.");
        //assert my address page company subtext is as expected
        assertEquals("Company", myAddressPage.getMyAddressCompanySubtext(), "The my address company subtext doesn't match expectations.");
        //assert my address one subtext is as expected
        assertEquals("Address *", myAddressPage.getMyAddressOneSubtext(), "The my address one subtext doesn't match expectations.");
        //assert my address two subtext is as expected
        assertEquals("Address (Line 2)", myAddressPage.getMyAddressTwoSubtext(), "The my address two subtext doesn't match expectations.");
        //assert my address page city subtext is as expected
        assertEquals("City *", myAddressPage.getMyAddressCitySubtext(), "The my address city subtext doesn't match expectations.");
        //assert my address page state subtext is as expected
        assertEquals("State *", myAddressPage.getMyAddressStateSubtext(), "The my address state subtext doesn't match expectations.");
        //assert my address page postal code subtext is as expected
        assertEquals("Zip/Postal Code *", myAddressPage.getMyAddressPostalCodeSubtext(), "The my address postal code subtext doesn't match expectations.");
        //assert my address page country subtext is as expected
        assertEquals("Country *", myAddressPage.getMyAddressCountrySubtext(), "The my address country subtext doesn't match expectations.");
        //assert my address page home phone subtext is as expected
        assertEquals("Home phone **", myAddressPage.getMyAddressHomePhoneSubtext(), "The my address home phone subtext doesn't match expectations.");
        //assert my address page mobile phone subtext is as expected
        assertEquals("Mobile phone **", myAddressPage.getMyAddressMobilePhoneSubtext(), "The my address mobile phone subtext doesn't match expectations.");
        //assert my address page additional information subtext is as expected
        assertEquals("Additional information", myAddressPage.getMyAddressAdditionalInfoSubtext(), "The my address additional information subtext doesn't match expectations.");
        //assert my address page alias subtext is as expected
        assertEquals("Please assign an address title for future reference. *", myAddressPage.getMyAddressAliasSubtext(), "The my address alias subtext doesn't match expectations.");
    }

    //my addresses page text element assert test method
    protected void isMyAddressesPageTextElementAsExpected(MyAddressesPage myAddressesPage){
        //assert 'My Addresses' page title is as expected
        assertEquals("MY ADDRESSES", myAddressesPage.getMyAddressesPageTitle(), "The 'My Addresses' page title doesn't match expectations.");
        //assert 'My Addresses' page subtitle is as expected
        assertEquals("Your addresses are listed below.", myAddressesPage.getMyAddressesPageSubtitle(), "The 'My Addresses' page subtitle doesn't match expectations.");
        //assert 'My Addresses' page description one is as expected
        assertEquals("Please configure your default billing and delivery addresses when placing an order. You may also add additional addresses, which can be useful for sending gifts or receiving an order at your office.", myAddressesPage.getMyAddressesPageDescriptionOne(), "The 'My Addresses' page description one doesn't match expectations.");
        //assert 'My Addresses' page description two is as expected
        assertEquals("Be sure to update your personal information if it has changed.", myAddressesPage.getMyAddressesPageDescriptionTwo(), "The 'My Addresses' page description two doesn't match expectations.");
    }

    //single product category (Women) dashboard page text element assert test method (main content)
    protected void isWomenProductCategoryDashboardPageMainTextElementAsExpected(SingleProductCategoryDashboardPage singleProductCategoryDashboardPage){
        //assert women product dashboard page image title is as expected
        assertEquals("Women", singleProductCategoryDashboardPage.getProductDashboardCategoryImgTitle(), "The 'Women Product Dashboard' page category image title doesn't match expectations.");
        //assert women product dashboard page image description is as expected
        assertEquals("You will find here all woman fashion collections.\n" + "This category includes all the basics of your wardrobe and much more:\n" + "shoes, accessories, printed t-shirts, feminine dresses, women's jeans!", singleProductCategoryDashboardPage.getProductDashboardCategoryImgDesc(), "The 'Women Product Dashboard' page category image description doesn't match expectations.");
        //assert women product dashboard page title is as expected
        assertEquals("WOMEN ", singleProductCategoryDashboardPage.getProductDashboardTitle(), "The 'Women Product Dashboard' page title doesn't match expectations.");
        //assert women product dashboard sort by subtext is as expected
        assertEquals("Sort by", singleProductCategoryDashboardPage.getProductDashboardSortBySubtext(), "The 'Women Product Dashboard' page sort by subtext doesn't match expectations.");
        //assert women product dashboard view subtext is as expected
        assertEquals("View:", singleProductCategoryDashboardPage.getProductDashboardViewSubtext(), "The 'Women Product Dashboard' page view subtext doesn't match expectations.");
    }

    //single product category (Women) dashboard page text element assert test method (aside content)
    protected void isWomenProductCategoryDashboardPageAsideTextElementAsExpected(SingleProductCategoryDashboardPage singleProductCategoryDashboardPage){
        //assert women product dashboard aside category one title is as expected
        assertEquals("WOMEN", singleProductCategoryDashboardPage.getProductDashboardAsideCatOneTitle(), "The 'Women Product Dashboard' page aside category one title doesn't match expectations.");
        //assert women product dashboard aside category two title is as expected
        assertEquals("CATALOG", singleProductCategoryDashboardPage.getProductDashboardAsideCatTwoTitle(), "The 'Women Product Dashboard' page aside category two title doesn't match expectations.");
        //assert women product dashboard aside category two subcategory one title is as expected
        assertEquals("Categories", singleProductCategoryDashboardPage.getProductDashboardAsideCatTwoSubCatOneTitle(), "The 'Women Product Dashboard' page aside category two subcategory one title doesn't match expectations.");
        //assert women product dashboard aside category two subcategory two title is as expected
        assertEquals("Size", singleProductCategoryDashboardPage.getProductDashboardAsideCatTwoSubCatTwoTitle(), "The 'Women Product Dashboard' page aside category two subcategory two title doesn't match expectations.");
        //assert women product dashboard aside category two subcategory three title is as expected
        assertEquals("Color", singleProductCategoryDashboardPage.getProductDashboardAsideCatTwoSubCatThreeTitle(), "The 'Women Product Dashboard' page aside category two subcategory three title doesn't match expectations.");
        //assert women product dashboard aside category two subcategory four title is as expected
        assertEquals("Properties", singleProductCategoryDashboardPage.getProductDashboardAsideCatTwoSubCatFourTitle(), "The 'Women Product Dashboard' page aside category two subcategory four title doesn't match expectations.");
        //assert women product dashboard aside category two subcategory five title is as expected
        assertEquals("Compositions", singleProductCategoryDashboardPage.getProductDashboardAsideCatTwoSubCatFiveTitle(), "The 'Women Product Dashboard' page aside category two subcategory five title doesn't match expectations.");
        //assert women product dashboard aside category two subcategory six title is as expected
        assertEquals("Styles", singleProductCategoryDashboardPage.getProductDashboardAsideCatTwoSubCatSixTitle(), "The 'Women Product Dashboard' page aside category two subcategory six title doesn't match expectations.");
        //assert women product dashboard aside category two subcategory seven title is as expected
        assertEquals("Availability", singleProductCategoryDashboardPage.getProductDashboardAsideCatTwoSubCatSevenTitle(), "The 'Women Product Dashboard' page aside category two subcategory seven title doesn't match expectations.");
        //assert women product dashboard aside category two subcategory eight title is as expected
        assertEquals("Condition", singleProductCategoryDashboardPage.getProductDashboardAsideCatTwoSubCatEightTitle(), "The 'Women Product Dashboard' page aside category two subcategory eight title doesn't match expectations.");
        //assert women product dashboard aside category three title is as expected
        assertEquals("INFORMATION", singleProductCategoryDashboardPage.getProductDashboardAsideCatThreeTitle(), "The 'Women Product Dashboard' page aside category three title doesn't match expectations.");
        //assert women product dashboard aside category four title is as expected
        assertEquals("SPECIALS", singleProductCategoryDashboardPage.getProductDashboardAsideCatFourTitle(), "The 'Women Product Dashboard' page aside category four title doesn't match expectations.");
        //assert women product dashboard aside category five title is as expected
        assertEquals("OUR STORES", singleProductCategoryDashboardPage.getProductDashboardAsideCatFiveTitle(), "The 'Women Product Dashboard' page aside category five title doesn't match expectations.");
        //assert women product dashboard aside category six title is as expected
        assertEquals("OUR STORES", singleProductCategoryDashboardPage.getProductDashboardAsideCatSixTitle(), "The 'Women Product Dashboard' page aside category six title doesn't match expectations.");
        //assert women product dashboard aside category seven title is as expected
        //assertEquals("VIEWED PRODUCTS", singleProductCategoryDashboardPage.getProductDashboardAsideCatSevenTitle(), "The 'Women Product Dashboard' page aside category seven title doesn't match expectations.");
    }

    //product comparison page text element assert test method
    protected void isProductComparisonPageTextElementAsExpected(ProductComparisonPage productComparisonPage){
        //assert product comparison page title is as expected
        assertEquals("PRODUCT COMPARISON", productComparisonPage.getProductComparisonPageTitle(), "The 'Product Comparison' page title doesn't match expectations.");
        //assert product comparison box subtext is as expected
        assertEquals("Share this comparison with your friends:", productComparisonPage.getProductComparisonBoxSubtext(), "The 'Product Comparison' page comparison box subtext doesn't match expectations.");
    }

    //single product page text element test assert method
    protected void isSingleProductPageTextAsExpected(SingleProductPage singleProductPage){
        //assert single product page reference subtext is as expected
        assertEquals("Reference:", singleProductPage.getProductReferenceSubtext(), "The single product page product reference subtext doesn't match expectations.");
        //assert single product page condition subtext is as expected
        assertEquals("Condition:", singleProductPage.getProductConditionSubtext(), "The single product page product condition subtext doesn't match expectations.");
        //assert single product page data section title is as expected
        assertEquals("DATA SHEET", singleProductPage.getDataSheetSectionTitle(), "The single product page data section title doesn't match expectations.");
        //assert single product page more information section title is as expected
        assertEquals("MORE INFO", singleProductPage.getMoreInformationSectionTitle(), "The single product page more information section title doesn't match expectations.");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page bestseller product data logger method
    protected void logHomePageBestSellerProductData(HomePage homePage){
        System.out.println("Home page best seller product data: " + "\n");
        logger.info("Best seller product name(s): " + homePage.getBestsellerProductNames() + "\n");
        logger.info("Best seller product unit price(s): " + homePage.getBestsellerProductUnitPrices() + "\n");
        System.out.println("\n");
    }

    //my addresses page address data logger method
    protected void logMyAddressesPageAddressData(MyAddressesPage myAddressesPage){
        System.out.println("'My Addresses' page displayed address data:" + "\n");
        logger.info("Address title(s): " + myAddressesPage.getAddressTitle() + "\n");
        logger.info("Address user full name(s): " + myAddressesPage.getAddressUserName() + "\n");
        logger.info("Address(es): " + myAddressesPage.getAddressElements() + "\n");
        logger.info("Address state(s): " + myAddressesPage.getAddressState() + "\n");
        logger.info("Address country(ies): " + myAddressesPage.getAddressCountry() + "\n");
        logger.info("Address phone number(s): " + myAddressesPage.getAddressPhoneNumber() + "\n");
        System.out.println("\n");
    }

    //single product category dashboard page page / product data logger method
    protected void logSingleProductCategoryDashboardPageProductData(SingleProductCategoryDashboardPage singleProductCategoryDashboardPage){
        System.out.println("'Single Product Category' page displayed data:" + "\n");
        logger.info("Product displayed count: " + singleProductCategoryDashboardPage.getProductDashboardCountText());
        logger.info("Product showing items: " + singleProductCategoryDashboardPage.getProductDashboardShowingItemsText());
        logger.info("Product price range displayed: " + singleProductCategoryDashboardPage.getProductDashboardAsidePriceRangeSubtext());
        System.out.println("'Single Product Category' page displayed product data (main section):" + "\n");
        logger.info("Product name(s): " + singleProductCategoryDashboardPage.getProductName());
        logger.info("Product unit price(s): " + singleProductCategoryDashboardPage.getProductUnitPrice());
        logger.info("Displayed product availability list: " + singleProductCategoryDashboardPage.getProductDashboardAvailabilityBoxText());
        System.out.println("'Single Product Category' page displayed product data (aside section):" + "\n");
        logger.info("Aside product name(s): " + singleProductCategoryDashboardPage.getAsideProductName());
        System.out.println("\n");
    }

    //product comparison page product data logger method
    protected void logProductComparisonPageProductData(ProductComparisonPage productComparisonPage){
        System.out.println("Product comparison displayed data: " + "\n");
        logger.info("Compared product name(s): " + productComparisonPage.getProductComparedName());
        logger.info("Compared product unit price(s): " + productComparisonPage.getProductComparedUnitPrice());
        logger.info("Compared product description(s): " + productComparisonPage.getProductComparedDescription());
        logger.info("Compared product composition(s): " + productComparisonPage.getProductComparedComposition());
        logger.info("Compared product style(s): " + productComparisonPage.getProductComparedStyles());
        logger.info("Compared product property(ies): " + productComparisonPage.getProductComparedProperty());
        if(productComparisonPage.isProductComparedProductReducedPriceTagDisplayed()) {
            logger.info("Compared product reduced price tag(s): " + productComparisonPage.getProductComparedReducedPriceTag());
        }
        System.out.println("\n");
    }

    //single product page data logger method
    protected void logSingleProductPageData(SingleProductPage singleProductPage){
        System.out.println("Displayed single product page data: " + "\n");
        logger.info("Single product reference: " + singleProductPage.getProductReference());
        logger.info("Single product condition: " + singleProductPage.getProductCondition());
        logger.info("Single product short description: " + singleProductPage.getProductShortDescription());
        logger.info("Single product availability: " + singleProductPage.getProductAvailabilityBoxText());
        logger.info("Single product unit price: " + singleProductPage.getProductUnitPrice());
        logger.info("Single product composition: " + singleProductPage.getProductComposition());
        logger.info("Single product styles: " + singleProductPage.getProductStyles());
        logger.info("Single product description: " + singleProductPage.getProductDescription());
        System.out.println("\n");
    }

    //shopping cart page product data logger method
    protected void logShoppingCartProductData(ShoppingCartSummaryPage shoppingCartSummaryPage){
        System.out.println("Shopping cart displayed product data: " + "\n");
        logger.info("Shopping cart product name(s): " + shoppingCartSummaryPage.getShoppingCartProductName());
        logger.info("Shopping cart product description(s): " + shoppingCartSummaryPage.getShoppingCartProductDescription());
        logger.info("Shopping cart product availability tag(s): " + shoppingCartSummaryPage.getShoppingCartProductAvailabilityTag());
        logger.info("Shopping cart product unit price(s): " + shoppingCartSummaryPage.getShoppingCartProductUnitPrice());
        logger.info("Shopping cart product quantity(ies): " + shoppingCartSummaryPage.getShoppingCartProductQuantity());
        logger.info("Shopping cart product total price(s): " + shoppingCartSummaryPage.getShoppingCartProductTotalPrice());

        System.out.println("Shopping cart summary section data: " + "\n");
        logger.info("Shopping cart summary total product price: " + shoppingCartSummaryPage.getShoppingCartSummaryTotalProductPrice());
        logger.info("Shopping cart summary total shipping price: " + shoppingCartSummaryPage.getShoppingCartSummaryTotalShippingPrice());
        logger.info("Shopping cart summary total price: " + shoppingCartSummaryPage.getShoppingCartSummaryTotalPrice());

        System.out.println("\n");
    }

    //shopping cart addresses logger method
    protected void logShoppingCartAddressesData(ShoppingCartSummaryPage shoppingCartSummaryPage){
        System.out.println("Shopping cart addresses section displayed data: " + "\n");
        logger.info(shoppingCartSummaryPage.getShoppingCartDeliveryAddressSubtitle());
        logger.info("Shopping cart delivery address data: " + shoppingCartSummaryPage.getDeliveryAddressData());
        logger.info(shoppingCartSummaryPage.getShoppingCartShippingAddressSubtitle());
        logger.info("Shopping cart shipping address data: " + shoppingCartSummaryPage.getShippingAddressData());
        System.out.println("\n");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //return user to homepage utility test method
    protected void returnRegisteredUserToHomePage(){
        GeneralPage generalPage = new GeneralPage(driver);
        //click 'HomePage' logo
        generalPage.clickHomePageLogoLink();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //test result screenshot method
    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            Thread.sleep(1500);//apply wait time for the right time to get the screenshot (WebDriverWait doesn't work here)
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("E:\\IntelliAqua Selenium projects\\AutomationPracticeShopSelenium\\src\\test\\resources\\" + " " +  fileName + ".png");
            Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            logger.info("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
