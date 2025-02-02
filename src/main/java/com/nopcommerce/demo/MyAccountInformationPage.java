package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class MyAccountInformationPage extends BasePage {

    //my account information page web elements
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement myAccountInformationBreadcrumb;
    @FindBy(xpath = "//div[@id='center_column']//h1")
    private WebElement myAccountInfoPageTitle;
    @FindBy(xpath = "//div[@id='center_column']//p[@class='info-title']")
    private WebElement myAccountInfoPageSubtitle;
    @FindBy(xpath = "//div[@id='center_column']//p[@class='required']")
    private WebElement requiredFieldText;
    @FindBy(xpath = "//div[@class='clearfix']/label")
    private WebElement myAccountInfoSocialTitleSubtitle;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='gender_1']")
    private WebElement myAccountInfoMrRadioButton;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='gender_2']")
    private WebElement myAccountInfoMrsRadioButton;
    @FindBy(xpath = "//div[@id='center_column']//label[@for='firstname']")
    private WebElement myAccountInfoFirstNameSubtext;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='firstname']")
    private WebElement myAccountInfoFirstNameInputField;
    @FindBy(xpath = "//div[@id='center_column']//label[@for='lastname']")
    private WebElement myAccountInfoLastNameSubtext;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='lastname']")
    private WebElement myAccountInfoLastNameInputField;
    @FindBy(xpath = "//div[@id='center_column']//label[@for='email']")
    private WebElement myAccountInfoEmailSubtext;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='email']")
    private WebElement myAccountInfoEmailInputField;
    @FindBy(xpath = "//div[@class='form-group']//label")
    private WebElement myAccountInfoDateOfBirthSubtext;
    @FindBy(xpath = "//div[@id='center_column']//select[@id='days']")
    private WebElement myAccountInfoDayDropdownMenu;
    @FindBy(xpath = "//div[@id='center_column']//select[@id='months']")
    private WebElement myAccountInfoMonthDropdownMenu;
    @FindBy(xpath = "//div[@id='center_column']//select[@id='years']")
    private WebElement myAccountInfoYearDropdownMenu;
    @FindBy(xpath = "//div[@id='center_column']//label[@for='old_passwd']")
    private WebElement myAccountInfoCurrentPasswordSubtext;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='old_passwd']")
    private WebElement myAccountInfoCurrentPasswordInputField;
    @FindBy(xpath = "//div[@id='center_column']//label[@for='passwd']")
    private WebElement myAccountInfoNewPasswordSubtext;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='passwd']")
    private WebElement myAccountInfoNewPasswordInputField;
    @FindBy(xpath = "//div[@id='center_column']//label[@for='confirmation']")
    private WebElement myAccountInfoConfirmPasswordSubtext;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='confirmation']")
    private WebElement myAccountInfoConfirmPasswordInputField;
    @FindBy(xpath = "//div[@id='center_column']//label[@for='newsletter']")
    private WebElement myAccountInfoNewsletterText;
    @FindBy(xpath = "//div[@id='center_column']//input[@id='newsletter']")
    private WebElement myAccountInfoNewsletterCheckbox;
    @FindBy(xpath = "//div[@id='center_column']//button")
    private WebElement myAccountInfoSaveButton;
    @FindBy(xpath = "//ul[@class='footer_links clearfix']/li[1]/a")
    private WebElement myAccountInfoBackToAccountButton;
    @FindBy(xpath = "//ul[@class='footer_links clearfix']/li[2]/a")
    private WebElement myAccountInfoHomeButton;
    //information update success message element
    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElement myAccountInfoUpdateSuccessMessage;

    //valid user data variable
    private String userPassword;

    //valid user updated data variables
    private String updatedUserFirstName = "Bennett";
    private String updatedUserLastName = "Kammerberger";

    public MyAccountInformationPage(WebDriver driver) {super(driver);}

    //my account information valid user data input methods
    public void inputUpdatedFirstNameIntoFirstNameInputField(){
        myAccountInfoFirstNameInputField.clear();
        logger.info("Valid updated user first name: " + updatedUserFirstName);
        myAccountInfoFirstNameInputField.sendKeys(updatedUserFirstName);
    }
    public void inputUpdatedLastNameIntoLastNameInputField(){
        myAccountInfoLastNameInputField.clear();
        logger.info("Valid updated user last name: " + updatedUserLastName);
        myAccountInfoLastNameInputField.sendKeys(updatedUserLastName);
    }

    //input current user password method
    public void inputCurrentUserPasswordIntoUserPasswordInputField(CreateAccountPage createAccountPage){
        userPassword = createAccountPage.getPassword();
        logger.info("Valid user password: " + userPassword);
        myAccountInfoCurrentPasswordInputField.sendKeys(userPassword);
    }

    //click 'Save' button method
    public void clickSaveButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(myAccountInfoSaveButton).click().perform();
    }

    //my account information page text element getters
    public String getMyAccountInfoPageTitle() {return myAccountInfoPageTitle.getText();}
    public String getMyAccountInfoPageSubtitle() {return myAccountInfoPageSubtitle.getText();}
    public String getRequiredFieldText() {return requiredFieldText.getText();}
    public String getMyAccountSocialSubtext(){return myAccountInfoSocialTitleSubtitle.getText();}
    public String getMyAccountInfoFirstNameSubtext() {return myAccountInfoFirstNameSubtext.getText();}
    public String getMyAccountInfoLastNameSubtext() {return myAccountInfoLastNameSubtext.getText();}
    public String getMyAccountInfoEmailSubtext() {return myAccountInfoEmailSubtext.getText();}
    public String getMyAccountInfoDateOfBirthSubtext() {return myAccountInfoDateOfBirthSubtext.getText();}
    public String getMyAccountInfoCurrentPasswordSubtext() {return myAccountInfoCurrentPasswordSubtext.getText();}
    public String getMyAccountInfoNewPasswordSubtext() {return myAccountInfoNewPasswordSubtext.getText();}
    public String getMyAccountInfoConfirmPasswordSubtext() {return myAccountInfoConfirmPasswordSubtext.getText();}
    public String getMyAccountInfoNewsletterSubtext() {return myAccountInfoNewsletterText.getText();}
    public String getMyAccountInfoUpdateSuccessMessage() {return myAccountInfoUpdateSuccessMessage.getText();}

    //input field data getters
    public String getFirstNameInputFieldText() {JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", myAccountInfoFirstNameInputField);
        return myAccountInfoFirstNameInputField.getDomAttribute("value");}
    public String getLastNameInputFieldText() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", myAccountInfoLastNameInputField);
        return myAccountInfoLastNameInputField.getDomAttribute("value");
    }

    //my account information page web element assert methods
    public boolean isMyAccountInfoBreadcrumbDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInformationBreadcrumb));
        return myAccountInformationBreadcrumb.isDisplayed();
    }
    public boolean isMyAccountInfoPageTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoPageTitle));
        return myAccountInfoPageTitle.isDisplayed();
    }
    public boolean isMyAccountInfoPageSubtitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoPageSubtitle));
        return myAccountInfoPageSubtitle.isDisplayed();
    }
    public boolean isMyAccountInfoRequiredFieldTextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(requiredFieldText));
        return requiredFieldText.isDisplayed();
    }
    public boolean isMyAccountInfoSocialTitleSubtitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoSocialTitleSubtitle));
        return myAccountInfoSocialTitleSubtitle.isDisplayed();
    }
    public boolean isMyAccountInfoMrRadioButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoMrRadioButton));
        return myAccountInfoMrRadioButton.isDisplayed();
    }
    public boolean isMyAccountInfoMrsRadioButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoMrsRadioButton));
        return myAccountInfoMrsRadioButton.isDisplayed();
    }
    public boolean isMyAccountInfoFirstNameSubtextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoFirstNameSubtext));
        return myAccountInfoFirstNameSubtext.isDisplayed();
    }
    public boolean isMyAccountInfoFirstNameInputFieldDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoFirstNameInputField));
        return myAccountInfoFirstNameInputField.isDisplayed();
    }
    public boolean isMyAccountInfoLastNameSubtextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoLastNameSubtext));
        return myAccountInfoLastNameSubtext.isDisplayed();
    }
    public boolean isMyAccountInfoLastNameInputFieldDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoLastNameInputField));
        return myAccountInfoLastNameInputField.isDisplayed();
    }
    public boolean isMyAccountInfoEmailSubtextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoEmailSubtext));
        return myAccountInfoEmailSubtext.isDisplayed();
    }
    public boolean isMyAccountInfoEmailInputFieldDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoEmailInputField));
        return myAccountInfoEmailInputField.isDisplayed();
    }
    public boolean isMyAccountInfoDateOfBirthSubtextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoDateOfBirthSubtext));
        return myAccountInfoDateOfBirthSubtext.isDisplayed();
    }
    public boolean isMyAccountInfoDayDropdownMenuDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoDayDropdownMenu));
        return myAccountInfoDayDropdownMenu.isDisplayed();
    }
    public boolean isMyAccountInfoMonthDropdownMenuDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoMonthDropdownMenu));
        return myAccountInfoMonthDropdownMenu.isDisplayed();
    }
    public boolean isMyAccountInfoYearDropdownMenuDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoYearDropdownMenu));
        return myAccountInfoYearDropdownMenu.isDisplayed();
    }
    public boolean isMyAccountInfoCurrentPasswordSubtextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoCurrentPasswordSubtext));
        return myAccountInfoCurrentPasswordSubtext.isDisplayed();
    }
    public boolean isMyAccountInfoCurrentPasswordInputFieldDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoCurrentPasswordInputField));
        return myAccountInfoCurrentPasswordInputField.isDisplayed();
    }
    public boolean isMyAccountInfoNewPasswordSubtextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoNewPasswordSubtext));
        return myAccountInfoNewPasswordSubtext.isDisplayed();
    }
    public boolean isMyAccountInfoNewPasswordInputFieldDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoNewPasswordInputField));
        return myAccountInfoNewPasswordInputField.isDisplayed();
    }
    public boolean isMyAccountInfoConfirmPasswordSubtextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoConfirmPasswordSubtext));
        return myAccountInfoConfirmPasswordSubtext.isDisplayed();
    }
    public boolean isMyAccountInfoConfirmPasswordInputFieldDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoConfirmPasswordInputField));
        return myAccountInfoConfirmPasswordInputField.isDisplayed();
    }
    public boolean isMyAccountInfoNewsletterTextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoNewsletterText));
        return myAccountInfoNewsletterText.isDisplayed();
    }
    public boolean isMyAccountInfoNewsletterCheckboxDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoNewsletterCheckbox));
        return myAccountInfoNewsletterCheckbox.isDisplayed();
    }
    public boolean isMyAccountInfoSaveButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoSaveButton));
        return myAccountInfoSaveButton.isDisplayed();
    }
    public boolean isMyAccountInfoBackToAccountButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoBackToAccountButton));
        return myAccountInfoBackToAccountButton.isDisplayed();
    }
    public boolean isMyAccountInfoHomeButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountInfoHomeButton));
        return myAccountInfoHomeButton.isDisplayed();
    }
}
