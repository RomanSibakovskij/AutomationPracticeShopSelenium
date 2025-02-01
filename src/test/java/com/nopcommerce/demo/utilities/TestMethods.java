package com.nopcommerce.demo.utilities;

import com.nopcommerce.demo.*;
import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.*;

public class TestMethods extends BaseTest {

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    //valid user navigation to 'Create Account' page test

    //valid navigate to 'Create Account' page (with valid email) test method
    protected void validNavigateToCreateAccountPageTest(){
        HomePage homePage = new HomePage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //click 'Bestsellers' section button link
        homePage.clickBestsellersSectionButtonLink();
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //home page bestseller products data logger
        logHomePageBestSellerProductData(homePage);
        //capture screenshot of the home page
        captureScreenshot(driver, "Home Page Visual Display");
        //click 'Sign In' nav link
        generalPage.clickSignInNavLink();
        //capture screenshot of the user moving to create account / login dashboard page
        captureScreenshot(driver, "User Navigation to Create Account And Login Dashboard Page");
        //create account/login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account/login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //input valid email into email input field
        createAccountLoginDashboardPage.inputValidEmailIntoEmailInputField();
        //click 'Create an account' button
        createAccountLoginDashboardPage.clickCreateAccountButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Valid User Navigation to Register Page Test Result");
    }

    //no singular input

    //invalid navigate to 'Create Account' page (no user email) test method
    protected void invalidNavigateToCreateAccountPageNoEmailTest(){
        HomePage homePage = new HomePage(driver);
        GeneralPage generalPage = new GeneralPage(driver);
        CreateAccountLoginDashboardPage createAccountLoginDashboardPage = new CreateAccountLoginDashboardPage(driver);
        //general page web element assert
        isGeneralPageWebElementDisplayed(generalPage);
        //click 'Bestsellers' section button link
        homePage.clickBestsellersSectionButtonLink();
        //general page text element assert
        isGeneralPageTextElementAsExpected(generalPage);
        //home page web element assert
        isHomePageWebElementDisplayed(homePage);
        //home page text element assert
        isHomePageTextElementAsExpected(homePage);
        //home page bestseller products data logger
        logHomePageBestSellerProductData(homePage);
        //capture screenshot of the home page
        captureScreenshot(driver, "Home Page Visual Display");
        //click 'Sign In' nav link
        generalPage.clickSignInNavLink();
        //capture screenshot of the user moving to create account / login dashboard page
        captureScreenshot(driver, "User Navigation to Create Account And Login Dashboard Page");
        //create account/login dashboard page web element assert
        isCreateAccountLoginDashboardPageWebElementDisplayed(createAccountLoginDashboardPage);
        //create account/login dashboard page text element assert
        isCreateAccountLoginDashboardPageTextElementAsExpected(createAccountLoginDashboardPage);
        //don't input email into email input field
        createAccountLoginDashboardPage.inputNoEmailIntoEmailInputField();
        //click 'Create an account' button
        createAccountLoginDashboardPage.clickCreateAccountButton();
        //capture screenshot of the test result
        captureScreenshot(driver, "Invalid User Navigation to Register Page Test Result - No Email");
        //assert the user gets the expected error message
        assertEquals("Invalid email address.", createAccountLoginDashboardPage.getInvalidEmailErrorMessageText(), "The invalid input email error message text doesn't match expectations or it didn't appear.");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page web element assert test method (all pages have them)
    protected void isGeneralPageWebElementDisplayed(GeneralPage generalPage){
        //assert header banner link is displayed
        assertTrue(generalPage.isHeaderBannerLinkDisplayed(), "The header banner link isn't displayed");
        //assert header shop phone is displayed
        assertTrue(generalPage.isHeaderShopPhoneDisplayed(), "The header shop phone isn't displayed");
        //assert header contact us is displayed
        assertTrue(generalPage.isHeaderContactUsNavLinkDisplayed(), "The header contact us navbar link isn't displayed");
        //assert header logo link is displayed
        assertTrue(generalPage.isHeaderLogoLinkDisplayed(), "The header logo link isn't displayed");
        //assert header search bar input field is displayed
        assertTrue(generalPage.isHeaderSearchBarInputFieldDisplayed(), "The header search bar input field isn't displayed");
        //assert search button is displayed
        assertTrue(generalPage.isSearchButtonDisplayed(), "The search button isn't displayed");
        //assert shopping cart link button is displayed
        assertTrue(generalPage.isShoppingCartLinkButtonDisplayed(), "The shopping cart link button isn't displayed");
        //assert women nav link is displayed
        assertTrue(generalPage.isWomenNavLinkDisplayed(), "The women nav link isn't displayed");
        //assert t-shirts nav link is displayed
        assertTrue(generalPage.isTShirtsNavLinkDisplayed(), "The t-shirts nav link isn't displayed");
        //assert blog nav link is displayed
        assertTrue(generalPage.isBlogNavLinkDisplayed(), "The blog nav link isn't displayed");
        //assert footer newsletter submit button is displayed
        assertTrue(generalPage.isFooterNewsletterSubmitButtonDisplayed(), "The footer newsletter submit button isn't displayed");
        //assert footer information stores link is displayed
        assertTrue(generalPage.isFooterInfoStoresLinkDisplayed(), "The footer information stores link isn't displayed");
        //assert footer information terms of use link is displayed
        assertTrue(generalPage.isFooterInfoTermsOfUseLinkDisplayed(), "The footer information terms of use link isn't displayed");
        //assert footer information about us link is displayed
        assertTrue(generalPage.isFooterInfoAboutUsLinkDisplayed(), "The footer information about us link isn't displayed");
        //assert footer categories section title is displayed
        assertTrue(generalPage.isFooterCategoriesSectionTitleDisplayed(), "The footer categories section title isn't displayed");
        //assert footer women link is displayed
        assertTrue(generalPage.isFooterWomenLinkDisplayed(), "The footer women link isn't displayed");
        //assert footer my account section title is displayed
        assertTrue(generalPage.isFooterMyAccountSectionTitleDisplayed(), "The footer my account section title isn't displayed");
        //assert footer orders link is displayed
        assertTrue(generalPage.isFooterOrdersLinkDisplayed(), "The footer orders link isn't displayed");
        //assert footer credit slips link is displayed
        assertTrue(generalPage.isFooterCreditSlipsLinkDisplayed(), "The footer my account credit slips link isn't displayed");
        //assert footer my account addresses link is displayed
        assertTrue(generalPage.isFooterMyAccountAddressesLinkDisplayed(), "The footer my account addresses link isn't displayed");
        //assert footer my personal info link is displayed
        assertTrue(generalPage.isFooterMyPersonalInfoLinkDisplayed(), "The footer my personal info link isn't displayed");
        //assert footer store information section title is displayed
        assertTrue(generalPage.isFooterStoreInfoSectionTitleDisplayed(), "The footer store information section title isn't displayed");
        //assert footer call store phone text is displayed
        assertTrue(generalPage.isFooterCallStorePhoneTextDisplayed(), "The footer call store phone text isn't displayed");
        //assert footer store address is displayed
        assertTrue(generalPage.isFooterStoreAddressDisplayed(), "The footer call address text isn't displayed");
        //assert footer follow us section title is displayed
        assertTrue(generalPage.isFooterFollowUsSectionTitleDisplayed(), "The footer follow us section title isn't displayed");
        //assert footer follow us facebook logo link is displayed
        assertTrue(generalPage.isFooterFollowUsFacebookLogoLinkDisplayed(), "The footer follow us facebook logo link isn't displayed");
        //assert footer follow us X logo link is displayed
        assertTrue(generalPage.isFooterFollowUsXLogoLinkDisplayed(), "The footer follow us X logo link isn't displayed");
        //assert footer follow us RSS logo link is displayed
        assertTrue(generalPage.isFooterFollowUsRSSLogoLinkDisplayed(), "The footer follow us RSS logo link isn't displayed");
        //assert footer newsletter section title is displayed
        assertTrue(generalPage.isFooterNewsletterSectionTitleDisplayed(), "The footer newsletter section title isn't displayed");
        //assert footer newsletter input field is displayed
        assertTrue(generalPage.isFooterNewsletterInputFieldDisplayed(), "The footer newsletter input field isn't displayed");
        //assert footer store information section title is displayed
        assertTrue(generalPage.isFooterStoreInformationTitleDisplayed(), "The footer store information section title isn't displayed");
        //assert footer email text is displayed
        assertTrue(generalPage.isFooterEmailTextDisplayed(), "The footer email text isn't displayed");
        //assert footer email link is displayed
        assertTrue(generalPage.isFooterEmailLinkDisplayed(), "The footer email link isn't displayed");
        //assert footer copyright text link is displayed
        assertTrue(generalPage.isFooterCopyrightTextLinkDisplayed(), "The footer copyright text link isn't displayed");
    }

    //home page web element assert test method
    protected void isHomePageWebElementDisplayed(HomePage homePage){
        //assert home page image carousel is displayed
        assertTrue(homePage.isHomePageCarouselDisplayed(), "The home page image carousel isn't displayed");
        //assert home page image carousel button one is displayed
        assertTrue(homePage.isHomePageCarouselButtonOneDisplayed(), "The home page image carousel button one isn't displayed");
        //assert home page image carousel button two is displayed
        assertTrue(homePage.isHomePageCarouselButtonTwoDisplayed(), "The home page image carousel button two isn't displayed");
        //assert home page quarter percent sale image link is displayed
        assertTrue(homePage.isHomePageQuarterPercentSaleImgLinkDisplayed(), "The home page quarter percent sale image link isn't displayed");
        //assert home page forty-five percent sale image link is displayed
        assertTrue(homePage.isHomePageFortyFivePercentSaleImgLinkDisplayed(), "The home page forty-five percent sale image link isn't displayed");
        //assert home page popular section button link is displayed
        assertTrue(homePage.isPopularSectionButtonLinkDisplayed(), "The home page popular section button link isn't displayed");
        //assert home page bestseller section button link is displayed
        assertTrue(homePage.isBestsellersSectionButtonLinkDisplayed(), "The home page bestseller section button link isn't displayed");
        //assert home page top trends category image is displayed
        assertTrue(homePage.isTopTrendsCategoryImageDisplayed(), "The top trends category image isn't displayed");
        //assert home page men coats & jackets image link is displayed
        assertTrue(homePage.isMenCoatsJacketsImgLinkDisplayed(), "The home page men coats & jackets image link isn't displayed");
        //assert home page women coats & jackets image link is displayed
        assertTrue(homePage.isWomenCoatsJacketsImgLinkDisplayed(), "The home page women coats & jackets image link isn't displayed");
        //assert home page sunglasses image link is displayed
        assertTrue(homePage.isSunglassesImageLinkDisplayed(), "The home page sunglasses image link isn't displayed");
        //assert home page handbags image link is displayed
        assertTrue(homePage.isHandbagsImageLinkDisplayed(), "The home page handbags image link isn't displayed");
        //assert home page bestseller product images are displayed (as a list)
        assertTrue(homePage.isBestsellerProductImgDisplayed(), "The home page bestseller product images aren't displayed");
        //assert home page bestseller product name links are displayed (as a list)
        assertTrue(homePage.isBestsellerProductNameLinkDisplayed(), "The home page bestseller product name links aren't displayed");
        //assert home page bestseller product view button are displayed (as a list)
        //assertTrue(homePage.isBestsellerProductViewButtonDisplayed(), "The home page bestseller product view button aren't displayed");
        //assert home page bestseller product unit prices are displayed (as a list)
        assertTrue(homePage.isBestsellerProductUnitPriceDisplayed(), "The home page bestseller product unit prices aren't displayed");
        //assert home page bestseller product 'add to cart' button are displayed - they're disabled for now (as a list)
        assertTrue(homePage.isBestsellerProductAddToCartButtonDisplayed(), "The home page bestseller product 'add to cart' buttons aren't displayed");
        //assert home page bestseller product more buttons are displayed (as a list) //Selenium can't see it even though it's present in DOM and not obstructed
        //assertTrue(homePage.isBestsellerProductMoreButtonDisplayed(), "The home page bestseller product more buttons aren't displayed");
        //assert home page follow us section title is displayed
        assertTrue(homePage.isFollowUsSectionTitleDisplayed(), "The home page follow us section title isn't displayed");
        //assert home page facebook fan box is displayed
        assertTrue(homePage.isFacebookFanBoxDisplayed(), "The home page facebook fan box isn't displayed");
        //assert home page shipping icon is displayed
        assertTrue(homePage.isShippingIconDisplayed(), "The home page shipping icon isn't displayed");
        //assert home page shipping section title is displayed
        assertTrue(homePage.isShippingSectionTitleDisplayed(), "The home page shipping section isn't displayed");
        //assert home page shipping section text is displayed
        assertTrue(homePage.isShippingSectionTextDisplayed(), "The home page shipping section text isn't displayed");
        //assert home page phone icon is displayed
        assertTrue(homePage.isPhoneIconDisplayed(), "The home page phone icon isn't displayed");
        //assert home page phone section title is displayed
        assertTrue(homePage.isPhoneSectionTitleDisplayed(), "The home page phone section title isn't displayed");
        //assert home page phone section text is displayed
        assertTrue(homePage.isPhoneSectionTextDisplayed(), "The home page phone section text isn't displayed");
        //assert home page phone icon is displayed
        assertTrue(homePage.isCreditCardIconDisplayed(), "The home page credit card icon isn't displayed");
        //assert home page phone section title is displayed
        assertTrue(homePage.isCreditCardSectionTitleDisplayed(), "The home page credit card section title isn't displayed");
        //assert home page phone section text is displayed
        assertTrue(homePage.isCreditCardSectionTextDisplayed(), "The home page credit card section text isn't displayed");
        //assert home page custom block section title is displayed
        assertTrue(homePage.isCustomBlockSectionTitleDisplayed(), "The home page custom block section title isn't displayed");
        //assert home page custom block section subtitle is displayed
        assertTrue(homePage.isCustomBlockSectionSubtitleDisplayed(), "The home page custom block section subtitle isn't displayed");
        //assert home page custom block section text is displayed
        assertTrue(homePage.isCustomBlockSectionTextDisplayed(), "The home page custom block section text isn't displayed");
    }

    //create account/login dashboard page web element assert test method (commented out elements are present in DOM, aren't obstructed, are interactable but Selenium can't find them)
    protected void isCreateAccountLoginDashboardPageWebElementDisplayed(CreateAccountLoginDashboardPage createAccountLoginDashboardPage){
        //assert login dashboard breadcrumb is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginDashboardBreadcrumbDisplayed(), "The login dashboard breadcrumb isn't displayed");
        //assert login dashboard title is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginDashboardTitleDisplayed(), "The login dashboard title isn't displayed");
        //assert create account section title is displayed
        assertTrue(createAccountLoginDashboardPage.isCreateAccountSectionTitleDisplayed(), "The create account section title isn't displayed");
        //assert create account section hint is displayed
        assertTrue(createAccountLoginDashboardPage.isCreateAccountSectionHintDisplayed(), "The create account section hint isn't displayed");
        //assert create account section email subtext is displayed
        assertTrue(createAccountLoginDashboardPage.isCreateAccountSectionEmailSubtextDisplayed(), "The create account section email subtext isn't displayed");
        //assert create account section email input field is displayed
        assertTrue(createAccountLoginDashboardPage.isCreateAccountSectionEmailInputFieldDisplayed(), "The create account section email input field isn't displayed");
        //assert create account button is displayed
        assertTrue(createAccountLoginDashboardPage.isCreateAccountButtonDisplayed(), "The create account button isn't displayed");
        //assert login section title is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginSectionTitleDisplayed(), "The login section title isn't displayed");
        //assert login section email subtext is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginSectionEmailSubtextDisplayed(), "The login section email subtext isn't displayed");
        //assert login section email input field is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginSectionEmailInputFieldDisplayed(), "The login section email input field isn't displayed");
        //assert login section password subtext is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginSectionPasswordSubtextDisplayed(), "The login section password subtext isn't displayed");
        //assert login section password input field is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginSectionPasswordInputFieldDisplayed(), "The login section password input field isn't displayed");
        //assert login section forgot password link is displayed
        assertTrue(createAccountLoginDashboardPage.isLoginSectionForgotPasswordDisplayed(), "The login section forgot password link isn't displayed");
        //assert signin button is displayed
        assertTrue(createAccountLoginDashboardPage.isSignInButtonDisplayed(), "The signin button isn't displayed");
    }

    //create account page web element assert test method
    protected void isCreateAccountPageWebElementDisplayed(CreateAccountPage createAccountPage){
        //assert create account breadcrumb is displayed
        assertTrue(createAccountPage.isCreateAccountBreadcrumbDisplayed(), "The create account page breadcrumb isn't displayed");
        //assert create account page title is displayed
        assertTrue(createAccountPage.isCreateAccountPageTitleDisplayed(), "The create account page title isn't displayed");
        //assert create account page subtitle is displayed
        assertTrue(createAccountPage.isCreateAccountPageSubtitleDisplayed(), "The create account page subtitle isn't displayed");
        //assert create account page title subtitle (social) is displayed
        assertTrue(createAccountPage.isCreateAccountTitleSubtitleDisplayed(), "The create account page title social subtitle isn't displayed");
        //assert create account page 'Mr' radio button is displayed
        //assertTrue(createAccountPage.isCreateAccountMrRadioButtonDisplayed(), "The create account page 'Mr' radio button isn't displayed");
        //assert create account page 'Mrs.' radio button is displayed
        //assertTrue(createAccountPage.isCreateAccountMrsRadioButtonDisplayed(), "The create account page 'Mrs' radio button isn't displayed");
        //assert create account page first name subtitle is displayed
        assertTrue(createAccountPage.isCreateAccountFirstNameSubtitleDisplayed(), "The create account page first name subtitle isn't displayed");
        //assert create account page first name input field is displayed
        assertTrue(createAccountPage.isCreateAccountFirstNameInputFieldDisplayed(), "The create account page first name input field isn't displayed");
        //assert create account page last name subtitle is displayed
        assertTrue(createAccountPage.isCreateAccountLastNameSubtitleDisplayed(), "The create account page last name subtitle isn't displayed");
        //assert create account page last name input field is displayed
        assertTrue(createAccountPage.isCreateAccountLastNameInputFieldDisplayed(), "The create account page last name input field isn't displayed");
        //assert create account page email subtitle is displayed
        assertTrue(createAccountPage.isCreateAccountEmailSubtitleDisplayed(), "The create account page email subtitle isn't displayed");
        //assert create account page email input field is displayed
        assertTrue(createAccountPage.isCreateAccountEmailInputFieldDisplayed(), "The create account page email input field isn't displayed");
        //assert create account page password subtitle is displayed
        assertTrue(createAccountPage.isCreateAccountPasswordSubtitleDisplayed(), "The create account page password name subtitle isn't displayed");
        //assert create account page password input field is displayed
        assertTrue(createAccountPage.isCreateAccountPasswordInputFieldDisplayed(), "The create account page password name input field isn't displayed");
        //assert create account page password input hint is displayed
        assertTrue(createAccountPage.isCreateAccountPasswordHintDisplayed(), "The create account page password input hint isn't displayed");
        //assert create account page date of birth subtitle is displayed
        assertTrue(createAccountPage.isCreateAccountDateOfBirthSubtitleDisplayed(), "The create account page date of birth subtitle isn't displayed");
        //assert create account page day dropdown menu is displayed
        //assertTrue(createAccountPage.isCreateAccountDayDropdownMenuDisplayed(), "The create account page day dropdown menu isn't displayed");
        //assert create account page month dropdown menu is displayed
        //assertTrue(createAccountPage.isCreateAccountMonthDropdownMenuDisplayed(), "The create account page month dropdown menu isn't displayed");
        //assert create account page year dropdown menu is displayed
        //assertTrue(createAccountPage.isCreateAccountYearDropdownMenuDisplayed(), "The create account page year dropdown menu isn't displayed");
        //assert create account page newsletter signup checkbox is displayed
        //assertTrue(createAccountPage.isCreateAccountNewsletterSignupCheckboxDisplayed(), "The create account page newsletter signup checkbox isn't displayed");
        //assert create account page newsletter signup text is displayed
        assertTrue(createAccountPage.isCreateAccountNewsletterSignupTextDisplayed(), "The create account page newsletter signup text isn't displayed");
        //assert create account page register button displayed is displayed
        assertTrue(createAccountPage.isRegisterButtonDisplayed(), "The create account page register button isn't displayed");
        //assert create account page required field text is displayed
        assertTrue(createAccountPage.isRequiredFieldTextDisplayed(), "The create account page required field text isn't displayed");
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page text element assert test method (all pages have them)
    protected void isGeneralPageTextElementAsExpected(GeneralPage generalPage){
        //assert footer information section title is as expected
        assertEquals("Information", generalPage.getFooterInfoSectionTitle(), "The footer information section title doesn't match expectations.");
        //assert footer customer service section title is as expected
        assertEquals("Categories", generalPage.getFooterCategoriesSectionTitle(), "The footer categories section title doesn't match expectations.");
        //assert footer my account section title is as expected
        assertEquals("My account", generalPage.getFooterMyAccountSectionTitle(), "The footer my account section title doesn't match expectations.");
        //assert footer follow us section title is as expected
        assertEquals("Follow us", generalPage.getFooterFollowUsSectionTitle(), "The footer follow us section title doesn't match expectations.");
        //assert footer newsletter section title is as expected
        assertEquals("Newsletter", generalPage.getFooterNewsletterSectionTitle(), "The footer newsletter section title doesn't match expectations.");
        //assert footer store information section title is as expected
        assertEquals("Store Information", generalPage.getStoreInfoSectionTitle(), "The footer store information section title doesn't match expectations.");
        //assert footer store info address is as expected
        assertEquals("My Company, 42 avenue des Champs Elysées 75000 Paris France", generalPage.getStoreInfoAddress(), "The footer store information address doesn't match expectations.");
        //assert footer store information phone text is as expected
        assertEquals("Call us now: 0123-456-789", generalPage.getStoreInfoPhoneText(), "The footer store information phone text doesn't match expectations.");
        //assert footer email link text is as expected
        assertEquals("sales@yourcompany.com", generalPage.getFooterEmailLink(), "The footer email link text text doesn't match expectations.");
        //assert footer copyright text is as expected
        assertEquals("Ecommerce software by PrestaShop™", generalPage.getFooterCopyrightTextLink(), "The footer copyright text doesn't match expectations.");
    }

    //home page text element assert text test method
    protected void isHomePageTextElementAsExpected(HomePage homePage){
        //assert home page follow us section title is as expected
        assertEquals("Follow us on Facebook", homePage.getFollowUsSectionTitle(), "The home page follow us section title doesn't match expectations.");
        //assert home page shipping section title is as expected
        assertEquals("Lorem Ipsum", homePage.getShippingSectionTitle(), "The home page shipping section title doesn't match expectations.");
        //assert home page shipping section text is as expected
        assertEquals("Lorem ipsum dolor sit amet conse ctetur voluptate velit esse cillum dolore eu", homePage.getShippingSectionText(), "The home page shipping section text doesn't match expectations.");
        //assert home page phone section title is as expected
        assertEquals("Dolor Sit Amet", homePage.getPhoneSectionTitle(), "The home page phone section title doesn't match expectations.");
        //assert home page phone section text is as expected
        assertEquals("Lorem ipsum dolor sit amet conse ctetur voluptate velit esse cillum dolore eu", homePage.getPhoneSectionText(), "The home page phone section text doesn't match expectations.");
        //assert home page credit card section title is as expected
        assertEquals("Ctetur Voluptate", homePage.getCreditCardSectionTitle(), "The home page credit card section title doesn't match expectations.");
        //assert home page credit card section text is as expected
        assertEquals("Lorem ipsum dolor sit amet conse ctetur voluptate velit esse cillum dolore eu", homePage.getCreditCardSectionText(), "The home page credit card section text doesn't match expectations.");
        //assert home page custom block section title is as expected
        assertEquals("Custom Block", homePage.getCustomBlockSectionTitle(), "The home page custom block section title doesn't match expectations.");
        //assert home page custom block section subtitle is as expected
        assertEquals("Lorem ipsum dolor sit amet conse ctetu", homePage.getCustomBlockSubtitleText(), "The home page custom block section subtitle doesn't match expectations.");
        //assert home page custom block section text is as expected
        assertEquals("Sit amet conse ctetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit.", homePage.getCustomBlockText(), "The home page custom block text doesn't match expectations.");
    }

    //create account/login dashboard page text element assert test method
    protected void isCreateAccountLoginDashboardPageTextElementAsExpected(CreateAccountLoginDashboardPage createAccountLoginDashboardPage){
        //assert create account login dashboard page title is as expected
        assertEquals("AUTHENTICATION", createAccountLoginDashboardPage.getCreateAccountLoginDashboardTitle(), "The create account login dashboard page title doesn't match expectations.");
        //assert create account section title is as expected
        assertEquals("CREATE AN ACCOUNT", createAccountLoginDashboardPage.getCreateAccountSectionTitle(), "The create account login section title doesn't match expectations.");
        //assert create account section hint is as expected
        assertEquals("Please enter your email address to create an account.", createAccountLoginDashboardPage.getCreateAccountSectionHint(), "The create account section hint doesn't match expectations.");
        //assert create account section email subtext is as expected
        assertEquals("Email address", createAccountLoginDashboardPage.getCreateAccountSectionEmailSubtext(), "The create account section email subtext doesn't match expectations.");
        //assert login section title is as expected
        assertEquals("ALREADY REGISTERED?", createAccountLoginDashboardPage.getLoginSectionTitle(), "The login section title doesn't match expectations.");
        //assert login section email subtext is as expected
        assertEquals("Email address", createAccountLoginDashboardPage.getLoginSectionEmailSubtext(), "The login section email subtext doesn't match expectations.");
        //assert login section password subtext is as expected
        assertEquals("Password", createAccountLoginDashboardPage.getLoginSectionPasswordSubtext(), "The login section password subtext doesn't match expectations.");
    }

    //create account page text element assert test method
    protected void isCreateAccountPageTextElementAsExpected(CreateAccountPage createAccountPage){
        //assert create account page title is as expected
        assertEquals("CREATE AN ACCOUNT", createAccountPage.getCreateAccountPageTitle(), "The create account page title doesn't match expectations.");
        //assert create account page subtitle is as expected
        assertEquals("YOUR PERSONAL INFORMATION", createAccountPage.getCreateAccountPageSubtitle(), "The create account page subtitle doesn't match expectations.");
        //assert create account page title (social) subtitle is as expected
        assertEquals("Title", createAccountPage.getCreateAccountTitleSubtitle(), "The create account page title social subtitle doesn't match expectations.");
        //assert create account page first name subtitle is as expected
        assertEquals("First name *", createAccountPage.getCreateAccountFirstNameSubtitle(), "The create account page first name subtitle doesn't match expectations.");
        //assert create account page last name subtitle is as expected
        assertEquals("Last name *", createAccountPage.getCreateAccountLastNameSubtitle(), "The create account page last name subtitle doesn't match expectations.");
        //assert create account page email subtitle is as expected
        assertEquals("Email *", createAccountPage.getCreateAccountEmailSubtitle(), "The create account page email subtitle doesn't match expectations.");
        //assert create account page password subtitle is as expected
        assertEquals("Password *", createAccountPage.getCreateAccountPasswordSubtitle(), "The create account page password subtitle doesn't match expectations.");
        //assert create account page date of birth subtitle is as expected
        assertEquals("Date of Birth", createAccountPage.getCreateAccountDateOfBirthSubtitle(), "The create account page date of birth subtitle doesn't match expectations.");
        //assert create account page newsletter subtitle is as expected
        assertEquals("Sign up for our newsletter!", createAccountPage.getCreateAccountNewsletterSignupText(), "The create account page newsletter subtitle doesn't match expectations.");
        //assert create account page required field text is as expected
        assertEquals("*Required field", createAccountPage.getRequiredFieldText(), "The create account page required field text doesn't match expectations.");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //home page bestseller product data logger method
    protected void logHomePageBestSellerProductData(HomePage homePage){
        System.out.println("Home page best seller product data: " + "\n");
        logger.info("Best seller product name(s): " + homePage.getBestsellerProductNames() + "\n");
        logger.info("Best seller product unit price(s): " + homePage.getBestsellerProductUnitPrices() + "\n");
        System.out.println("\n");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //test result screenshot method
    public void captureScreenshot(WebDriver driver, String fileName) {
        try {
            Thread.sleep(1500);//apply wait time for the right time to get the screenshot (WebDriverWait doesn't work here)
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File("E:\\IntelliAqua Selenium projects\\AutomationPracticeShopSelenium\\src\\test\\resources\\" + " " +  fileName + ".png");
            Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            logger.info("Screenshot saved at: " + destination.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
