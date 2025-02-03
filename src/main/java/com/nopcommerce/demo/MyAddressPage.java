package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class MyAddressPage extends BasePage{

    //my address page web elements
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement myAddressBreadcrumb;
    @FindBy(xpath = "//div[@class='box']/h1")
    private WebElement myAddressPageTitle;
    @FindBy(xpath = "//div[@class='box']/p[@class='info-title']")
    private WebElement myAddressPageSubtitle;
    @FindBy(xpath = "//div[@class='box']/p[@class='required']")
    private WebElement requiredFieldText;
    //form elements
    @FindBy(xpath = "//div[@class='box']//label[@for='firstname']")
    private WebElement myAddressFirstNameSubtext;
    @FindBy(xpath = "//div[@class='box']//input[@id='firstname']")
    private WebElement myAddressFirstNameInputField;
    @FindBy(xpath = "//div[@class='box']//label[@for='lastname']")
    private WebElement myAddressLastNameSubtext;
    @FindBy(xpath = "//div[@class='box']//input[@id='lastname']")
    private WebElement myAddressLastNameInputField;
    @FindBy(xpath = "//div[@class='box']//label[@for='company']")
    private WebElement myAddressCompanySubtext;
    @FindBy(xpath = "//div[@class='box']//input[@id='company']")
    private WebElement myAddressCompanyInputField;
    @FindBy(xpath = "//div[@class='box']//label[@for='address1']")
    private WebElement myAddress1Subtext;
    @FindBy(xpath = "//div[@class='box']//input[@id='address1']")
    private WebElement myAddress1InputField;
    @FindBy(xpath = "//div[@class='box']//label[@for='address2']")
    private WebElement myAddress2Subtext;
    @FindBy(xpath = "//div[@class='box']//input[@id='address2']")
    private WebElement myAddress2InputField;
    @FindBy(xpath = "//div[@class='box']//label[@for='city']")
    private WebElement myAddressCitySubtext;
    @FindBy(xpath = "//div[@class='box']//input[@id='city']")
    private WebElement myAddressCityInputField;
    @FindBy(xpath = "//div[@class='box']//label[@for='id_state']")
    private WebElement myAddressStateSubtext;
    @FindBy(xpath = "//div[@class='box']//select[@id='id_state']")
    private WebElement myAddressStateDropdownMenu;
    @FindBy(xpath = "//div[@class='box']//label[@for='postcode']")
    private WebElement myAddressPostalCodeSubtext;
    @FindBy(xpath = "//div[@class='box']//input[@id='postcode']")
    private WebElement myAddressPostalCodeInputField;
    @FindBy(xpath = "//div[@class='box']//label[@for='id_country']")
    private WebElement myAddressCountrySubtext;
    @FindBy(xpath = "//div[@class='box']//select[@id='id_country']")
    private WebElement myAddressCountryDropdownMenu;
    @FindBy(xpath = "//div[@class='box']//label[@for='phone']")
    private WebElement myAddressHomePhoneSubtext;
    @FindBy(xpath = "//div[@class='box']//input[@id='phone']")
    private WebElement myAddressHomePhoneInputField;
    @FindBy(xpath = "//div[@class='box']//label[@for='phone_mobile']")
    private WebElement myAddressMobilePhoneSubtext;
    @FindBy(xpath = "//div[@class='box']//input[@id='phone_mobile']")
    private WebElement myAddressMobilePhoneInputField;
    @FindBy(xpath = "//div[@class='box']//p[@class='inline-infos required']")
    private WebElement myAddressMobilePhoneRequiredWarning;
    @FindBy(xpath = "//div[@class='box']//label[@for='other']")
    private WebElement myAddressAdditionalInfoSubtext;
    @FindBy(xpath = "//div[@class='box']//textarea")
    private WebElement myAddressAdditionalInfoInputField;
    @FindBy(xpath = "//div[@class='box']//label[@for='alias']")
    private WebElement myAddressAliasSubtext;
    @FindBy(xpath = "//div[@class='box']//input[@id='alias']")
    private WebElement myAddressAliasInputField;
    @FindBy(xpath = "//div[@class='box']//button")
    private WebElement saveButton;
    @FindBy(xpath = "//ul[@class='footer_links clearfix']/li/a")
    private WebElement backToAddressesButton;

    public MyAddressPage(WebDriver driver) {super(driver);}

    //my address page text element getters
    public String getMyAddressPageTitle() {return myAddressPageTitle.getText();}
    public String getMyAddressPageSubtitle() {return myAddressPageSubtitle.getText();}
    public String getRequiredFieldText() {return requiredFieldText.getText();}
    public String getMyAddressFirstNameSubtext() {return myAddressFirstNameSubtext.getText();}
    public String getMyAddressLastNameSubtext() {return myAddressLastNameSubtext.getText();}
    public String getMyAddressCompanySubtext() {return myAddressCompanySubtext.getText();}
    public String getMyAddressOneSubtext() {return myAddress1Subtext.getText();}
    public String getMyAddressTwoSubtext() {return myAddress2Subtext.getText();}
    public String getMyAddressCitySubtext() {return myAddressCitySubtext.getText();}
    public String getMyAddressStateSubtext() {return myAddressStateSubtext.getText();}
    public String getMyAddressPostalCodeSubtext() {return myAddressPostalCodeSubtext.getText();}
    public String getMyAddressCountrySubtext() {return myAddressCountrySubtext.getText();}
    public String getMyAddressHomePhoneSubtext() {return myAddressHomePhoneSubtext.getText();}
    public String getMyAddressMobilePhoneSubtext() {return myAddressMobilePhoneSubtext.getText();}
    public String getMyAddressMobilePhoneRequiredWarning() {return myAddressMobilePhoneRequiredWarning.getText();}
    public String getMyAddressAdditionalInfoSubtext() {return myAddressAdditionalInfoSubtext.getText();}
    public String getMyAddressAliasSubtext() {return myAddressAliasSubtext.getText();}

    //my address page web element assert methods
    public boolean isMyAddressBreadcrumbDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressBreadcrumb));
        return myAddressBreadcrumb.isDisplayed();
    }
    public boolean isMyAddressPageTitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressPageTitle));
        return myAddressPageTitle.isDisplayed();
    }
    public boolean isMyAddressPageSubtitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressPageSubtitle));
        return myAddressPageSubtitle.isDisplayed();
    }
    public boolean isRequiredFieldTextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(requiredFieldText));
        return requiredFieldText.isDisplayed();
    }
    public boolean isMyAddressFirstNameSubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressFirstNameSubtext));
        return myAddressFirstNameSubtext.isDisplayed();
    }
    public boolean isMyAddressFirstNameInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressFirstNameInputField));
        return myAddressFirstNameInputField.isDisplayed();
    }
    public boolean isMyAddressLastNameSubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressLastNameSubtext));
        return myAddressLastNameSubtext.isDisplayed();
    }
    public boolean isMyAddressLastNameInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressLastNameInputField));
        return myAddressLastNameInputField.isDisplayed();
    }
    public boolean isMyAddressCompanySubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressCompanySubtext));
        return myAddressCompanySubtext.isDisplayed();
    }
    public boolean isMyAddressCompanyInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressCompanyInputField));
        return myAddressCompanyInputField.isDisplayed();
    }
    public boolean isMyAddressOneSubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddress1Subtext));
        return myAddress1Subtext.isDisplayed();
    }
    public boolean isMyAddressOneInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddress1InputField));
        return myAddress1InputField.isDisplayed();
    }
    public boolean isMyAddressTwoSubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddress2Subtext));
        return myAddress2Subtext.isDisplayed();
    }
    public boolean isMyAddressTwoInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddress2InputField));
        return myAddress2InputField.isDisplayed();
    }
    public boolean isMyAddressCitySubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressCitySubtext));
        return myAddressCityInputField.isDisplayed();
    }
    public boolean isMyAddressCityInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressCityInputField));
        return myAddressCityInputField.isDisplayed();
    }
    public boolean isMyAddressStateSubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressStateSubtext));
        return myAddressStateSubtext.isDisplayed();
    }
    public boolean isMyAddressStateDropdownMenuDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressStateDropdownMenu));
        return myAddressStateDropdownMenu.isDisplayed();
    }
    public boolean isMyAddressPostalCodeSubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressPostalCodeSubtext));
        return myAddressPostalCodeSubtext.isDisplayed();
    }
    public boolean isMyAddressPostalCodeInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressPostalCodeInputField));
        return myAddressPostalCodeInputField.isDisplayed();
    }
    public boolean isMyAddressCountrySubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressCountrySubtext));
        return myAddressCountrySubtext.isDisplayed();
    }
    public boolean isMyAddressCountryDropdownMenuDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressCountryDropdownMenu));
        return myAddressCountryDropdownMenu.isDisplayed();
    }
    public boolean isMyAddressHomePhoneSubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressHomePhoneSubtext));
        return myAddressHomePhoneSubtext.isDisplayed();
    }
    public boolean isMyAddressHomePhoneInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressHomePhoneInputField));
        return myAddressHomePhoneInputField.isDisplayed();
    }
    public boolean isMyAddressMobilePhoneSubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressMobilePhoneSubtext));
        return myAddressMobilePhoneSubtext.isDisplayed();
    }
    public boolean isMyAddressMobilePhoneInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressMobilePhoneInputField));
        return myAddressMobilePhoneInputField.isDisplayed();
    }
    public boolean isMyAddressAdditionalInfoSubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressAdditionalInfoSubtext));
        return myAddressAdditionalInfoSubtext.isDisplayed();
    }
    public boolean isMyAddressAdditionalInfoInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressAdditionalInfoInputField));
        return myAddressAdditionalInfoInputField.isDisplayed();
    }
    public boolean isMyAddressAliasSubtextDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressAliasSubtext));
        return myAddressAliasSubtext.isDisplayed();
    }
    public boolean isMyAddressAliasInputFieldDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressAliasInputField));
        return myAddressAliasInputField.isDisplayed();
    }
    public boolean isSaveButtonDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(saveButton));
        return saveButton.isDisplayed();
    }
    public boolean isBackToAddressesDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(backToAddressesButton));
        return backToAddressesButton.isDisplayed();
    }

}
