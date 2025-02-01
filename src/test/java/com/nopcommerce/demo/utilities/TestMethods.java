package com.nopcommerce.demo.utilities;

import com.nopcommerce.demo.*;
import org.slf4j.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.*;

public class TestMethods extends BaseTest {

    protected static final Logger logger = LoggerFactory.getLogger(TestMethods.class);

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //general page web element assert test method
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
