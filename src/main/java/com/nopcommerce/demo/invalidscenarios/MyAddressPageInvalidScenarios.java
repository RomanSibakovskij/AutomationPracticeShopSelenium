package com.nopcommerce.demo.invalidscenarios;

import com.nopcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class MyAddressPageInvalidScenarios extends BasePage{

    @FindBy(xpath = "//div[@class='box']//input[@id='address1']")
    private WebElement myAddress1InputField;
    @FindBy(xpath = "//div[@class='box']//input[@id='city']")
    private WebElement myAddressCityInputField;
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
    private String noUserPostalCode;
    private String noUserHomePhone;
    private String noUserMyAddressTitle;

    //too short singular input data
    private String tooShortUserAddress;

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
        logger.info("Valid user address title (no user address): " + userMyAddressTitle);

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
        logger.info("Valid user address title (no user city): " + userMyAddressTitle);

        System.out.println("\n");
    }

    public void invalidUserAddressDataNoUserPostalCodeGetter(){

        userAddress = TestDataGenerator.generateRandomAddress(6);
        userCity = TestDataGenerator.getRandomCity();
        noUserPostalCode = "";
        userHomePhone = TestDataGenerator.generatePhoneNumber(7);
        userMyAddressTitle = TestDataGenerator.getRandomMyAddressTitle();

        System.out.println("Generated invalid user address data (no user postal code): ");

        logger.info("Valid user address (no user postal code): " + userAddress);
        logger.info("Valid user city (no user postal code): " + userCity);
        logger.info("No user postcode: " + noUserPostalCode);
        logger.info("Valid user home phone (no user postal code): " + userHomePhone);
        logger.info("Valid user address title (no user postal code): " + userMyAddressTitle);

        System.out.println("\n");
    }

    public void invalidUserAddressDataNoUserHomePhoneGetter(){

        userAddress = TestDataGenerator.generateRandomAddress(6);
        userCity = TestDataGenerator.getRandomCity();
        userPostalCode = TestDataGenerator.getRandomPostalCode();
        noUserHomePhone = "";
        userMyAddressTitle = TestDataGenerator.getRandomMyAddressTitle();

        System.out.println("Generated invalid user address data (no user home phone): ");

        logger.info("Valid user address (no user home phone): " + userAddress);
        logger.info("Valid user city (no user home phone): " + userCity);
        logger.info("Valid user postcode (no user home phone): " + userPostalCode);
        logger.info("No user home phone: " + noUserHomePhone);
        logger.info("Valid user address title (no user home phone): " + userMyAddressTitle);

        System.out.println("\n");
    }

    public void invalidUserAddressDataNoUserAddressTitleGetter(){

        userAddress = TestDataGenerator.generateRandomAddress(6);
        userCity = TestDataGenerator.getRandomCity();
        userPostalCode = TestDataGenerator.getRandomPostalCode();
        userHomePhone = TestDataGenerator.generatePhoneNumber(7);
        noUserMyAddressTitle = "";

        System.out.println("Generated invalid user address data (no user address title): ");

        logger.info("Valid user address (no user address title): " + userAddress);
        logger.info("Valid user city (no user address title): " + userCity);
        logger.info("Valid user postcode (no user address title): " + userPostalCode);
        logger.info("Valid user home phone (no user address title): " + userHomePhone);
        logger.info("No user address title: " + noUserMyAddressTitle);

        System.out.println("\n");
    }

    //too short singular input

    public void invalidUserAddressDataTooShortUserAddressGetter(){

        tooShortUserAddress = "3.St";
        userCity = TestDataGenerator.getRandomCity();
        userPostalCode = TestDataGenerator.getRandomPostalCode();
        userHomePhone = TestDataGenerator.generatePhoneNumber(7);
        userMyAddressTitle = TestDataGenerator.getRandomMyAddressTitle();

        System.out.println("Generated invalid user address data (too short user address): ");

        logger.info("Too short user address: " + tooShortUserAddress);
        logger.info("Valid user city (too short user address): " + userCity);
        logger.info("Valid user postcode (too short user address): " + userPostalCode);
        logger.info("Valid user home phone (too short user address): " + userHomePhone);
        logger.info("Valid user address title (too short user address): " + userMyAddressTitle);

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
        myAddressAliasInputField.sendKeys(userMyAddressTitle);
    }

    //invalid user address data input methods
    //no singular input

    public void inputNoUserAddressIntoAddressInputField(){myAddress1InputField.sendKeys(noUserAddress);}
    public void inputNoUserCityIntoCityInputField(){myAddressCityInputField.sendKeys(noUserCity);}
    public void inputNoUserPostalCodeIntoPostalCodeInputField(){myAddressPostalCodeInputField.sendKeys(noUserPostalCode);}
    public void inputNoUserHomePhoneIntoHomePhoneInputField(){myAddressHomePhoneInputField.sendKeys(noUserHomePhone);}
    public void inputNoUserAddressTitleIntoAddressAliasInputField(){
        myAddressAliasInputField.clear();
        myAddressAliasInputField.sendKeys(noUserMyAddressTitle);
    }

    //too short singular input

    public void inputTooShortUserAddressIntoAddressInputField(){myAddress1InputField.sendKeys(tooShortUserAddress);}


    //invalid singular input error getter
    public String getInvalidSingularInputErrorMessage(){return myAddressInfoSingularInputErrorMessage.getText();}


}
