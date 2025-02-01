package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CreateAccountPage extends BasePage{

    //create account page web elements
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement createAccountBreadcrumb;
    @FindBy(xpath = "//div[@id='noSlide']/h1")
    private WebElement createAccountPageTitle;
    @FindBy(xpath = "//div[@class='account_creation']/h3")
    private WebElement createAccountPageSubtitle;
    @FindBy(xpath = "//div[@class='clearfix']/label")
    private WebElement createAccountTitleSubtitle;
    @FindBy(xpath = "//div[@class='clearfix']//input[@id='id_gender1']")
    private WebElement createAccountMrRadioButton;
    @FindBy(xpath = "//div[@class='clearfix']//input[@id='id_gender2']")
    private WebElement createAccountMrsRadioButton;
    @FindBy(xpath = "//label[@for='customer_firstname']")
    private WebElement createAccountFirstNameSubtitle;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElement createAccountFirstNameInputField;
    @FindBy(xpath = "//label[@for='customer_lastname']")
    private WebElement createAccountLastNameSubtitle;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement createAccountLastNameInputField;
    @FindBy(xpath = "//label[@for='email']")
    private WebElement createAccountEmailSubtitle;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement createAccountEmailInputField;
    @FindBy(xpath = "//label[@for='passwd']")
    private WebElement createAccountPasswordSubtitle;
    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement createAccountPasswordInputField;
    @FindBy(xpath = "//span[@class='form_info']")
    private WebElement createAccountPasswordHint;
    @FindBy(xpath = "//label[.='Date of Birth']")
    private WebElement createAccountDateOfBirthSubtitle;
    @FindBy(xpath = "//select[@id='days']")
    private WebElement createAccountDayDropdownMenu;
    @FindBy(xpath = "//select[@id='months']")
    private WebElement createAccountMonthDropdownMenu;
    @FindBy(xpath = "//select[@id='years']")
    private WebElement createAccountYearDropdownMenu;
    @FindBy(xpath = "//div[@class='checkbox']//input")
    private WebElement createAccountNewsletterSignupCheckbox;
    @FindBy(xpath = "//div[@class='checkbox']/label")
    private WebElement createAccountNewsletterSignupText;
    @FindBy(xpath = "//button[@id='submitAccount']")
    private WebElement registerButton;
    @FindBy(xpath = "//p[@class='pull-right required']")
    private WebElement requiredFieldText;

    //valid user input data variables
    private String firstName;
    private String lastName;
    private String password;

    public CreateAccountPage(WebDriver driver) {super(driver);}

    //valid user input data getter
    public void validMaleUserInputDataGetter(){
        firstName = TestDataGenerator.getRandomFirstName();
        lastName = TestDataGenerator.getRandomLastName();
        password = TestDataGenerator.generateRandomPassword();

        System.out.println("Valid generated male user input data: " + "\n");
        logger.info("Valid user first name: " + firstName);
        logger.info("Valid user last name: " + lastName);
        logger.info("Valid user password: " + password);
        System.out.println("\n");
    }

    //valid user data input methods
    public void inputFirstNameIntoFirstNameInputField(){createAccountFirstNameInputField.sendKeys(firstName);}
    public void inputLastNameIntoLastNameInputField(){createAccountLastNameInputField.sendKeys(lastName);}
    public void inputPasswordIntoPasswordInputField(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", createAccountPasswordInputField);
        createAccountPasswordInputField.sendKeys(password);
    }

    //click 'Mr.' radio button method
    public void clickMrRadioButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(createAccountMrRadioButton).click().perform();
    }

    //click 'Register' button method
    public void clickRegisterButton(){
        Actions actions = new Actions(driver);
        actions.moveToElement(registerButton).click().perform();
    }

    //private data getter (email is being input on login/register dashboard page)
    public String getPassword() {return password;}

    //create account page text element getters
    public String getCreateAccountPageTitle() {return createAccountPageTitle.getText();}
    public String getCreateAccountPageSubtitle() {return createAccountPageSubtitle.getText();}
    public String getCreateAccountTitleSubtitle() {return createAccountTitleSubtitle.getText();}
    public String getCreateAccountFirstNameSubtitle() {return createAccountFirstNameSubtitle.getText();}
    public String getCreateAccountLastNameSubtitle() {return createAccountLastNameSubtitle.getText();}
    public String getCreateAccountEmailSubtitle() {return createAccountEmailSubtitle.getText();}
    public String getCreateAccountPasswordSubtitle() {return createAccountPasswordSubtitle.getText();}
    public String getCreateAccountDateOfBirthSubtitle() {return createAccountDateOfBirthSubtitle.getText();}
    public String getCreateAccountNewsletterSignupText() {return createAccountNewsletterSignupText.getText();}
    public String getRequiredFieldText() {return requiredFieldText.getText();}

    //create account page web element assert methods
    public boolean isCreateAccountBreadcrumbDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountBreadcrumb));
        return createAccountBreadcrumb.isDisplayed();
    }
    public boolean isCreateAccountPageTitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountPageTitle));
        return createAccountPageTitle.isDisplayed();
    }
    public boolean isCreateAccountPageSubtitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountPageSubtitle));
        return createAccountPageSubtitle.isDisplayed();
    }
    public boolean isCreateAccountTitleSubtitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountTitleSubtitle));
        return createAccountTitleSubtitle.isDisplayed();
    }
    public boolean isCreateAccountMrRadioButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountMrRadioButton));
        return createAccountMrRadioButton.isDisplayed();
    }
    public boolean isCreateAccountMrsRadioButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountMrsRadioButton));
        return createAccountMrsRadioButton.isDisplayed();
    }
    public boolean isCreateAccountFirstNameSubtitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountFirstNameSubtitle));
        return createAccountFirstNameSubtitle.isDisplayed();
    }
    public boolean isCreateAccountFirstNameInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountFirstNameInputField));
        return createAccountFirstNameInputField.isDisplayed();
    }
    public boolean isCreateAccountLastNameSubtitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountLastNameSubtitle));
        return createAccountLastNameSubtitle.isDisplayed();
    }
    public boolean isCreateAccountLastNameInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountLastNameInputField));
        return createAccountLastNameInputField.isDisplayed();
    }
    public boolean isCreateAccountEmailSubtitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountEmailSubtitle));
        return createAccountEmailSubtitle.isDisplayed();
    }
    public boolean isCreateAccountEmailInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountEmailInputField));
        return createAccountEmailInputField.isDisplayed();
    }
    public boolean isCreateAccountPasswordSubtitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountPasswordSubtitle));
        return createAccountPasswordSubtitle.isDisplayed();
    }
    public boolean isCreateAccountPasswordInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountPasswordInputField));
        return createAccountPasswordInputField.isDisplayed();
    }
    public boolean isCreateAccountPasswordHintDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountPasswordHint));
        return createAccountPasswordHint.isDisplayed();
    }
    public boolean isCreateAccountDateOfBirthSubtitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountDateOfBirthSubtitle));
        return createAccountDateOfBirthSubtitle.isDisplayed();
    }
    public boolean isCreateAccountDayDropdownMenuDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountDayDropdownMenu));
        return createAccountDayDropdownMenu.isDisplayed();
    }
    public boolean isCreateAccountMonthDropdownMenuDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountMonthDropdownMenu));
        return createAccountMonthDropdownMenu.isDisplayed();
    }
    public boolean isCreateAccountYearDropdownMenuDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountYearDropdownMenu));
        return createAccountYearDropdownMenu.isDisplayed();
    }
    public boolean isCreateAccountNewsletterSignupCheckboxDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountNewsletterSignupCheckbox));
        return createAccountNewsletterSignupCheckbox.isDisplayed();
    }
    public boolean isCreateAccountNewsletterSignupTextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(createAccountNewsletterSignupText));
        return createAccountNewsletterSignupText.isDisplayed();
    }
    public boolean isRegisterButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(registerButton));
        return registerButton.isDisplayed();
    }
    public boolean isRequiredFieldTextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(requiredFieldText));
        return requiredFieldText.isDisplayed();
    }

}
