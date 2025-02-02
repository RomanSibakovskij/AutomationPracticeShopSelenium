package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class GeneralPage extends BasePage {

    //general page web elements
    //header
    @FindBy(xpath = "//div[@class='banner']//a")
    private WebElement headerBannerLink;
    @FindBy(xpath = "//div[@class='nav']//span[@class='shop-phone']")
    private WebElement headerShopPhone;
    @FindBy(xpath = "//div[@class='nav']//a[@class='login']")
    private WebElement loginNavLink;
    @FindBy(xpath = "//div[@class='nav']//a[@class='logout']")
    private WebElement logOutNavLink;
    @FindBy(xpath = "//div[@class='nav']//a[@title='Contact us']")
    private WebElement contactUsNavLink;
    @FindBy(xpath = "//div[@id='header_logo']/a")
    private WebElement headerLogoLink;
    @FindBy(xpath = "//div[@id='search_block_top']//input[@id='search_query_top']")
    private WebElement headerSearchBarInputField;
    @FindBy(xpath = "//div[@id='search_block_top']//button")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@class='shopping_cart']/a")
    private WebElement shoppingCartLinkButton;
    //header lower nav bar
    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li[1]/a")
    private WebElement womenNavLink;
    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li[3]/a")
    private WebElement tShirtsNavLink;
    @FindBy(xpath = "//div[@id='block_top_menu']/ul/li[4]/a")
    private WebElement blogNavLink;
    //footer
    @FindBy(xpath = "//div[@id='newsletter_block_left']/h4")
    private WebElement footerNewsletterSectionTitle;
    @FindBy(xpath = "//div[@id='newsletter_block_left']//input[@id='newsletter-input']")
    private WebElement footerNewsletterInputField;
    @FindBy(xpath = "//div[@id='newsletter_block_left']//input[@id='newsletter-input']")
    private WebElement footerNewsletterSubmitButton;
    @FindBy(xpath = "//section[@id='social_block']//h4")
    private WebElement footerFollowUsSectionTitle;
    @FindBy(xpath = "//section[@id='social_block']/ul/li[1]")
    private WebElement footerFollowUsFacebookLogoLink;
    @FindBy(xpath = "//section[@id='social_block']/ul/li[2]")
    private WebElement footerFollowUsXLogoLink;
    @FindBy(xpath = "//section[@id='social_block']/ul/li[3]")
    private WebElement footerFollowUsRSSLogoLink;
    @FindBy(xpath = "//section[@class='blockcategories_footer footer-block col-xs-12 col-sm-2']/h4")
    private WebElement footerCategoriesSectionTitle;
    @FindBy(xpath = "//section[@class='blockcategories_footer footer-block col-xs-12 col-sm-2']//ul[@class='tree dynamized']/li/a")
    private WebElement footerWomenLink;
    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-2']/h4")
    private WebElement footerInformationSectionTitle;
    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-2']/ul/li[1]/a")
    private WebElement footerInformationStoresLink;
    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-2']/ul/li[2]/a")
    private WebElement footerInformationTermsOfUseLink;
    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-2']/ul/li[3]/a")
    private WebElement footerInformationAboutUsLink;
    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-4']/h4")
    private WebElement footerMyAccountSectionTitle;
    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-4']//ul[@class='bullet']/li[1]/a")
    private WebElement footerOrdersLink;
    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-4']//ul[@class='bullet']/li[2]/a")
    private WebElement footerCreditSlipsLink;
    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-4']//ul[@class='bullet']/li[3]/a")
    private WebElement footerAddressesLink;
    @FindBy(xpath = "//section[@class='footer-block col-xs-12 col-sm-4']//ul[@class='bullet']/li[4]/a")
    private WebElement footerMyPersonalInfoLink;
    @FindBy(xpath = "//section[@id='block_contact_infos']//h4")
    private WebElement footerStoreInformationSectionTitle;
    @FindBy(xpath = "//section[@id='block_contact_infos']//ul/li[1]")
    private WebElement footerStoreAddress;
    @FindBy(xpath = "//section[@id='block_contact_infos']//ul/li[2]")
    private WebElement footerCallStorePhoneText;
    @FindBy(xpath = "//section[@id='block_contact_infos']//ul/li[3]")
    private WebElement footerEmailText;
    @FindBy(xpath = "//section[@id='block_contact_infos']//ul/li[3]//a")
    private WebElement footerEmailLink;
    @FindBy(xpath = "//section[@class='bottom-footer col-xs-12']//a")
    private WebElement footerCopyrightTextLink;

    public GeneralPage(WebDriver driver) {super(driver);}

    //click 'Sign In' nav link method
    public void clickSignInNavLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(loginNavLink).click().perform();
    }

    //click 'Logout' nav link method
    public void clickLogOutNavLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(logOutNavLink).click().perform();
    }

    //footer information section title getter
    public String getFooterInfoSectionTitle(){return footerInformationSectionTitle.getText();}
    //footer categories section title getter
    public String getFooterCategoriesSectionTitle(){return footerCategoriesSectionTitle.getText();}
    //footer my account section title getter
    public String getFooterMyAccountSectionTitle(){return footerMyAccountSectionTitle.getText();}
    //footer follow us section title getter
    public String getFooterFollowUsSectionTitle(){return footerFollowUsSectionTitle.getText();}
    //footer newsletter section title getter
    public String getFooterNewsletterSectionTitle(){return footerNewsletterSectionTitle.getText();}
    //footer store information section title getter
    public String getStoreInfoSectionTitle(){return footerStoreInformationSectionTitle.getText();}
    //footer store information address getter
    public String getStoreInfoAddress(){return footerStoreAddress.getText();}
    //footer store information phone text getter
    public String getStoreInfoPhoneText(){return footerCallStorePhoneText.getText();}
    //footer email link text getter
    public String getFooterEmailLink(){return footerEmailLink.getText();}
    //footer copyright text getter
    public String getFooterCopyrightTextLink(){return footerCopyrightTextLink.getText();}

    //general page web element assert methods (elements all pages share)
    //header elements
    public boolean isHeaderBannerLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(headerBannerLink));
        return headerBannerLink.isDisplayed();
    }
    public boolean isHeaderShopPhoneDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(headerShopPhone));
        return headerShopPhone.isDisplayed();
    }
    public boolean isHeaderContactUsNavLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(contactUsNavLink));
        return contactUsNavLink.isDisplayed();
    }
    public boolean isHeaderLogoLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(headerLogoLink));
        return headerLogoLink.isDisplayed();
    }
    public boolean isHeaderSearchBarInputFieldDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(headerSearchBarInputField));
        return headerSearchBarInputField.isDisplayed();
    }
    public boolean isSearchButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(searchButton));
        return searchButton.isDisplayed();
    }
    public boolean isShoppingCartLinkButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(shoppingCartLinkButton));
        return shoppingCartLinkButton.isDisplayed();
    }
    public boolean isWomenNavLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(womenNavLink));
        return womenNavLink.isDisplayed();
    }
    public boolean isTShirtsNavLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(tShirtsNavLink));
        return tShirtsNavLink.isDisplayed();
    }
    public boolean isBlogNavLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(blogNavLink));
        return blogNavLink.isDisplayed();
    }
    //footer elements
    public boolean isFooterNewsletterSubmitButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerNewsletterSubmitButton));
        return footerNewsletterSubmitButton.isDisplayed();
    }
    public boolean isFooterInfoStoresLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerInformationStoresLink));
        return footerInformationStoresLink.isDisplayed();
    }
    public boolean isFooterInfoTermsOfUseLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerInformationTermsOfUseLink));
        return footerInformationTermsOfUseLink.isDisplayed();
    }
    public boolean isFooterInfoAboutUsLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerInformationAboutUsLink));
        return footerInformationAboutUsLink.isDisplayed();
    }
    public boolean isFooterCategoriesSectionTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerCategoriesSectionTitle));
        return footerCategoriesSectionTitle.isDisplayed();
    }
    public boolean isFooterWomenLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerWomenLink));
        return footerWomenLink.isDisplayed();
    }
    public boolean isFooterMyAccountSectionTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerMyAccountSectionTitle));
        return footerMyAccountSectionTitle.isDisplayed();
    }
    public boolean isFooterOrdersLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerOrdersLink));
        return footerOrdersLink.isDisplayed();
    }
    public boolean isFooterCreditSlipsLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerCreditSlipsLink));
        return footerCreditSlipsLink.isDisplayed();
    }
    public boolean isFooterMyAccountAddressesLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerAddressesLink));
        return footerAddressesLink.isDisplayed();
    }
    public boolean isFooterMyPersonalInfoLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerMyPersonalInfoLink));
        return footerMyPersonalInfoLink.isDisplayed();
    }
    public boolean isFooterStoreInfoSectionTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerStoreInformationSectionTitle));
        return footerStoreInformationSectionTitle.isDisplayed();
    }
    public boolean isFooterCallStorePhoneTextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerCallStorePhoneText));
        return footerCallStorePhoneText.isDisplayed();
    }
    public boolean isFooterFollowUsSectionTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerFollowUsSectionTitle));
        return footerFollowUsSectionTitle.isDisplayed();
    }
    public boolean isFooterFollowUsFacebookLogoLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerFollowUsFacebookLogoLink));
        return footerFollowUsFacebookLogoLink.isDisplayed();
    }
    public boolean isFooterFollowUsXLogoLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerFollowUsXLogoLink));
        return footerFollowUsXLogoLink.isDisplayed();
    }
    public boolean isFooterFollowUsRSSLogoLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerFollowUsRSSLogoLink));
        return footerFollowUsRSSLogoLink.isDisplayed();
    }
    public boolean isFooterNewsletterSectionTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerNewsletterSectionTitle));
        return footerNewsletterSectionTitle.isDisplayed();
    }
    public boolean isFooterNewsletterInputFieldDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerNewsletterInputField));
        return footerNewsletterInputField.isDisplayed();
    }
    public boolean isFooterStoreInformationTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerStoreInformationSectionTitle));
        return footerStoreInformationSectionTitle.isDisplayed();
    }
    public boolean isFooterStoreAddressDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerStoreAddress));
        return footerStoreAddress.isDisplayed();
    }
    public boolean isFooterEmailTextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerEmailText));
        return footerEmailText.isDisplayed();
    }
    public boolean isFooterEmailLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerEmailLink));
        return footerEmailLink.isDisplayed();
    }
    public boolean isFooterCopyrightTextLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(footerCopyrightTextLink));
        return footerCopyrightTextLink.isDisplayed();
    }

}
