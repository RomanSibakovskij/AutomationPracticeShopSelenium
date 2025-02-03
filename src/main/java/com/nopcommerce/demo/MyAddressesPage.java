package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.util.*;
import java.time.Duration;

public class MyAddressesPage extends BasePage{

    //my addresses page web elements
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement myAddressesBreadcrumb;
    @FindBy(xpath = "//div[@id='center_column']/h1")
    private WebElement myAddressesPageTitle;
    @FindBy(xpath = "//div[@class='addresses']/p[1]")
    private WebElement myAddressesPageSubtitle;
    @FindBy(xpath = "//div[@id='center_column']/p")
    private WebElement myAddressesPageDescriptionOne;
    @FindBy(xpath = "//div[@class='addresses']/p[2]")
    private WebElement myAddressesPageDescriptionTwo;
    @FindBy(xpath = "//div[@class='clearfix main-page-indent']/a")
    private WebElement myAddressesAddANewAddressButton;
    @FindBy(xpath = "//ul[@class='footer_links clearfix']/li[1]/a")
    private WebElement myAddressesBackToAccountButton;
    @FindBy(xpath = "//ul[@class='footer_links clearfix']/li[2]/a")
    private WebElement myAddressesHomeButton;
    //my address box (can exist as a list if there are multiple addresses)
    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-6 address']/ul/li[1]")
    private List<WebElement> addressTitleElements;
    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-6 address']/ul/li[2]")
    private List<WebElement> addressUserNameElements;
    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-6 address']/ul/li[4]")
    private List<WebElement> addressElements;
    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-6 address']/ul/li[5]")
    private List<WebElement> addressStateElements;
    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-6 address']/ul/li[6]")
    private List<WebElement> addressCountryElements;
    @FindBy(xpath = "//div[@class='col-xs-12 col-sm-6 address']/ul/li[7]")
    private List<WebElement> addressPhoneNumberElements;

    private List<WebElement> addressUpdateButtonElements = driver.findElements(By.xpath("//div[@class='col-xs-12 col-sm-6 address']/ul/li[9]/a[1]"));
    private List<WebElement> addressDeleteButtonElements = driver.findElements(By.xpath("//div[@class='col-xs-12 col-sm-6 address']/ul/li[9]/a[2]"));

    public MyAddressesPage(WebDriver driver) {super(driver);}

    //my addresses user address data getters
    public List<String> getAddressTitle() {
        List<String> addressTitles = new ArrayList<>();
        for (WebElement element : addressTitleElements) {
            addressTitles.add(element.getText());
        }
        return addressTitles;
    }

    public List<String> getAddressUserName() {
        List<String> addressUserNames = new ArrayList<>();
        for (WebElement element : addressUserNameElements) {
            addressUserNames.add(element.getText());
        }
        return addressUserNames;
    }

    public List<String> getAddressElements() {
        List<String> addresses = new ArrayList<>();
        for (WebElement element : addressElements) {
            addresses.add(element.getText());
        }
        return addresses;
    }

    public List<String> getAddressState() {
        List<String> addressStates = new ArrayList<>();
        for (WebElement element : addressStateElements) {
            addressStates.add(element.getText());
        }
        return addressStates;
    }

    public List<String> getAddressCountry() {
        List<String> addressCountries = new ArrayList<>();
        for (WebElement element : addressCountryElements) {
            addressCountries.add(element.getText());
        }
        return addressCountries;
    }

    public List<String> getAddressPhoneNumber() {
        List<String> addressPhones = new ArrayList<>();
        for (WebElement element : addressPhoneNumberElements) {
            addressPhones.add(element.getText());
        }
        return addressPhones;
    }

    //my addresses page text data getters
    public String getMyAddressesPageTitle() {return myAddressesPageTitle.getText();}
    public String getMyAddressesPageSubtitle() {return myAddressesPageSubtitle.getText();}
    public String getMyAddressesPageDescriptionOne() {return myAddressesPageDescriptionOne.getText();}
    public String getMyAddressesPageDescriptionTwo() {return myAddressesPageDescriptionTwo.getText();}

    //click 'Add a new address' button method
    public void clickAddANewAddressButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(myAddressesAddANewAddressButton).click().perform();
    }

    //my addresses page web elements
    public boolean isMyAddressesBreadcrumbDisplayed() {return myAddressesBreadcrumb.isDisplayed();}
    public boolean isMyAddressesPageTitleDisplayed() {return myAddressesPageTitle.isDisplayed();}
    public boolean isMyAddressesPageSubtitleDisplayed() {return myAddressesPageSubtitle.isDisplayed();}
    public boolean isMyAddressesPageDescriptionOneDisplayed() {return myAddressesPageDescriptionOne.isDisplayed();}
    public boolean isMyAddressesPageDescriptionTwoDisplayed() {return myAddressesPageDescriptionTwo.isDisplayed();}
    public boolean isMyAddressesAddANewAddressButtonDisplayed() {return myAddressesAddANewAddressButton.isDisplayed();}
    public boolean isMyAddressesBackToAccountButtonDisplayed() {return myAddressesBackToAccountButton.isDisplayed();}
    public boolean isMyAddressesHomeButtonDisplayed() {return myAddressesHomeButton.isDisplayed();}
    //list elements
    public boolean isAddressTitleDisplayed() {
        return addressTitleElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressUserNameDisplayed() {
        return addressUserNameElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressElementDisplayed() {
        return addressElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressStateDisplayed() {
        return addressStateElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressCountryDisplayed() {
        return addressCountryElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressPhoneNumberDisplayed() {
        return addressPhoneNumberElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressUpdateButtonDisplayed() {
        return addressUpdateButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isAddressDeleteButtonDisplayed() {
        return addressDeleteButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
