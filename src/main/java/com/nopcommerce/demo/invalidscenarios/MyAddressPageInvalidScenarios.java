package com.nopcommerce.demo.invalidscenarios;

import com.nopcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class MyAddressPageInvalidScenarios extends BasePage{

    @FindBy(xpath = "//div[@class='box']//input[@id='address1']")
    private WebElement myAddress1InputField;
    @FindBy(xpath = "//div[@class='box']//input[@id='address2']")
    private WebElement myAddress2InputField;
    @FindBy(xpath = "//div[@class='box']//input[@id='city']")
    private WebElement myAddressCityInputField;
    @FindBy(xpath = "//div[@class='box']//select[@id='id_state']")
    private WebElement myAddressStateDropdownMenu;
    @FindBy(xpath = "//select[@id='id_state']/option[@value='13']")
    private WebElement myAddressStateIllinoisOption;
    @FindBy(xpath = "//select[@id='id_state']/option[@value='1']")
    private WebElement myAddressStateAlabamaOption;
    @FindBy(xpath = "//div[@class='box']//input[@id='postcode']")
    private WebElement myAddressPostalCodeInputField;
    @FindBy(xpath = "//div[@class='box']//select[@id='id_country']")
    private WebElement myAddressCountryDropdownMenu;
    @FindBy(xpath = "//div[@class='box']//input[@id='phone']")
    private WebElement myAddressHomePhoneInputField;
    @FindBy(xpath = "//div[@class='box']//input[@id='phone_mobile']")
    private WebElement myAddressMobilePhoneInputField;
    @FindBy(xpath = "//div[@class='box']//input[@id='alias']")
    private WebElement myAddressAliasInputField;

    public MyAddressPageInvalidScenarios(WebDriver driver) {super(driver);}


}
