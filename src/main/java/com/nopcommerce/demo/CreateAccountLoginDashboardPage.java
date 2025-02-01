package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.BasePage;
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
    private WebElement invalidEmailAddressErrorMessage;



    public CreateAccountLoginDashboardPage(WebDriver driver) {super(driver);}



    //create account login dashboard page text element getters
    public String getCreateAccountLoginDashboardTitle() {return createAccountLoginDashboardTitle.getText();}
    public String getCreateAccountSectionTitle() {return createAccountSectionTitle.getText();}
    public String getCreateAccountSectionHint() {return createAccountSectionHint.getText();}
    public String getCreateAccountSectionEmailSubtext() {return createAccountSectionEmailSubtext.getText();}
    public String getLoginSectionTitle() {return loginSectionTitle.getText();}
    public String getLoginSectionEmailSubtext() {return loginSectionEmailSubtext.getText();}
    public String getLoginSectionPasswordSubtext() {return loginSectionPasswordSubtext.getText();}

    //invalid error message getter
    public String getInvalidEmailErrorMessageText(){return invalidEmailAddressErrorMessage.getText();}

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
