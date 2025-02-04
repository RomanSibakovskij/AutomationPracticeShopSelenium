package com.nopcommerce.demo.invalidscenarios;

import com.nopcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

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
    //invalid singular input error message element
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement myAddressInfoSingularInputErrorMessage;

    //valid user address relevant data
    private String userAddress;
    private String userCity;
    private int userPostalCode;
    private String userHomePhone;
    private String userMyAddressTitle;

    //missing singular input data
    private String noUserAddress;
    private String noUserCity;

    public MyAddressPageInvalidScenarios(WebDriver driver) {super(driver);}

    //invalid user address data getters
    //no singular input

    public void invalidUserAddressDataNoUserAddressGetter(){

        noUserAddress = "";
        userCity = TestDataGenerator.getRandomCity();
        userPostalCode = TestDataGenerator.getRandomPostalCode();
        userHomePhone = TestDataGenerator.generatePhoneNumber(7);
        userMyAddressTitle = TestDataGenerator.getRandomMyAddressTitle();

        System.out.println("Generated invalid user address data (no user address): ");

        logger.info("No user address: " + noUserAddress);
        logger.info("Valid user city (no user address): " + userCity);
        logger.info("Valid user postcode (no user address): " + userPostalCode);
        logger.info("Valid user home phone (no user address): " + userHomePhone);
        logger.info("Valid user myAddressTitle (no user address): " + userMyAddressTitle);

        System.out.println("\n");
    }

    public void invalidUserAddressDataNoUserCityGetter(){

        userAddress = TestDataGenerator.generateRandomAddress(6);
        noUserCity = "";
        userPostalCode = TestDataGenerator.getRandomPostalCode();
        userHomePhone = TestDataGenerator.generatePhoneNumber(7);
        userMyAddressTitle = TestDataGenerator.getRandomMyAddressTitle();

        System.out.println("Generated invalid user address data (no user city): ");

        logger.info("Valid user address (no user city): " + userAddress);
        logger.info("No user city: " + noUserCity);
        logger.info("Valid user postcode (no user city): " + userPostalCode);
        logger.info("Valid user home phone (no user city): " + userHomePhone);
        logger.info("Valid user myAddressTitle (no user city): " + userMyAddressTitle);

        System.out.println("\n");
    }


    //valid user address data input methods
    public void inputValidUserAddressIntoAddressInputField(){myAddress1InputField.sendKeys(userAddress);}
    public void inputValidUserCityIntoCityInputField(){myAddressCityInputField.sendKeys(userCity);}
    public void inputValidUserPostalCodeIntoPostalCodeInputField(){myAddressPostalCodeInputField.sendKeys(String.valueOf(userPostalCode));}
    public void inputValidUserHomePhoneIntoHomePhoneInputField(){myAddressHomePhoneInputField.sendKeys(userHomePhone);}

    //valid user address title input method
    public void inputValidUserAddressTitleIntoAddressAliasInputField(){
        myAddressAliasInputField.clear();
        userMyAddressTitle = TestDataGenerator.getRandomMyAddressTitle();
        logger.info("Valid user address title: " + userMyAddressTitle);
        myAddressAliasInputField.sendKeys(userMyAddressTitle);
    }

    //invalid user address data input methods
    //no singular input

    public void inputNoUserAddressIntoAddressInputField(){myAddress1InputField.sendKeys(noUserAddress);}
    public void inputNoUserCityIntoCityInputField(){myAddressCityInputField.sendKeys(noUserCity);}

    //invalid singular input error getter
    public String getInvalidSingularInputErrorMessage(){return myAddressInfoSingularInputErrorMessage.getText();}


}
