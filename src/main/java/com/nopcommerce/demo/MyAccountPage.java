package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class MyAccountPage extends BasePage {

    //my account page web elements
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement myAccountBreadcrumb;
    @FindBy(xpath = "//div[@id='center_column']/h1")
    private WebElement myAccountPageTitle;
    @FindBy(xpath = "//p[@class='alert alert-success']")
    private WebElement myAccountSuccessMessage;
    @FindBy(xpath = "//p[@class='info-account']")
    private WebElement myAccountSubTitle;
    //button link elements
    @FindBy(xpath = "//ul[@class='myaccount-link-list']/li[1]/a")
    private WebElement myAccountButtonLink;
    @FindBy(xpath = "//ul[@class='myaccount-link-list']/li[2]/a")
    private WebElement orderHistoryButtonLink;
    @FindBy(xpath = "//ul[@class='myaccount-link-list']/li[3]/a")
    private WebElement creditSlipsButtonLink;
    @FindBy(xpath = "//ul[@class='myaccount-link-list']/li[4]/a")
    private WebElement myAddressesButtonLink;
    @FindBy(xpath = "//ul[@class='myaccount-link-list']/li[5]/a")
    private WebElement myPersonalInfoButtonLink;
    @FindBy(xpath = "//ul[@class='footer_links clearfix']/li/a")
    private WebElement homeButtonLink;

    public MyAccountPage(WebDriver driver) {super(driver);}

    //my account page web element text getters
    public String getMyAccountPageTitle() {return myAccountPageTitle.getText();}
    public String getMyAccountSubtitle() {return myAccountSubTitle.getText();}
    public String getMyAccountSuccessMessageText(){return myAccountSuccessMessage.getText();}


    //my account page web element assert methods
    public boolean isMyAccountBreadcrumbDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountBreadcrumb));
        return myAccountBreadcrumb.isDisplayed();
    }
    public boolean isMyAccountPageTitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountPageTitle));
        return myAccountPageTitle.isDisplayed();
    }
    public boolean isMyAccountSubtitleDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountSubTitle));
        return myAccountSubTitle.isDisplayed();
    }
    public boolean isMyAccountButtonLinkDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAccountButtonLink));
        return myAccountButtonLink.isDisplayed();
    }
    public boolean isOrderHistoryButtonLinkDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(orderHistoryButtonLink));
        return orderHistoryButtonLink.isDisplayed();
    }
    public boolean isCreditSlipsButtonLinkDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(creditSlipsButtonLink));
        return creditSlipsButtonLink.isDisplayed();
    }
    public boolean isMyAddressesButtonLinkDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myAddressesButtonLink));
        return myAddressesButtonLink.isDisplayed();
    }
    public boolean isMyPersonalInfoButtonLinkDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(myPersonalInfoButtonLink));
        return myPersonalInfoButtonLink.isDisplayed();
    }
    public boolean isHomeButtonLinkDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(homeButtonLink));
        return homeButtonLink.isDisplayed();
    }

}
