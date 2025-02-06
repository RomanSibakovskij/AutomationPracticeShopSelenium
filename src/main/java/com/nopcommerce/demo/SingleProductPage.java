package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class SingleProductPage extends BasePage{

    //single product page web elements
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement singleProductPageBreadcrumb;
    @FindBy(xpath = "//div[@id='image-block']//img")
    private WebElement singleProductPageMainProductImage;
    @FindBy(xpath = "//div[@id='image-block']//span[@id='view_full_size']")
    private WebElement singleProductPageViewLargerImageButton;
    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']/h1")
    private WebElement singleProductPageProductTitle;
    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']/p[1]/label")
    private WebElement singleProductPageProductReferenceSubtext;
    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']/p[1]/span")
    private WebElement singleProductPageProductReference;
    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']/p[2]/label")
    private WebElement singleProductPageProductConditionSubtext;
    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']/p[2]/span")
    private WebElement singleProductPageProductCondition;
    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']//div[@id='short_description_content']")
    private WebElement singleProductPageProductShortDescription;
    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']//span[@id='availability_value']")
    private WebElement singleProductPageProductAvailabilityBox;
    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']//p[@class='socialsharing_product list-inline no-print']/button[1]")
    private WebElement singleProductPageProductShareTweetLink;
    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']//p[@class='socialsharing_product list-inline no-print']/button[2]")
    private WebElement singleProductPageProductShareFacebookLink;
    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']//p[@class='socialsharing_product list-inline no-print']/button[3]")
    private WebElement singleProductPageProductShareGoogleLink;
    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']//p[@class='socialsharing_product list-inline no-print']/button[4]")
    private WebElement singleProductPageProductSharePinterestLink;
    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']//ul[@id='usefull_link_block']/li[1]/a")
    private WebElement singleProductPageProductSendFriendEmailLink;
    @FindBy(xpath = "//div[@class='pb-center-column col-xs-12 col-sm-4']//ul[@id='usefull_link_block']/li[2]/a")
    private WebElement singleProductPageProductPrintLink;
    @FindBy(xpath = "//div[@class='box-info-product']//span[@id='our_price_display']")
    private WebElement singleProductPageProductUnitPrice;
    @FindBy(xpath = "//div[@class='box-info-product']//select")
    private WebElement singleProductPageProductSizeDropdownMenu;
    @FindBy(xpath = "//div[@id='product_payment_logos']//img")
    private WebElement singleProductPagePaymentIcon;
    @FindBy(xpath = "//section[@class='page-product-box'][1]/h3")
    private WebElement singleProductPageDataSheetSectionTitle;
    @FindBy(xpath = "//table//tr[1]/td[2]")
    private WebElement singleProductPageProductComposition;
    @FindBy(xpath = "//table//tr[2]/td[2]")
    private WebElement singleProductPageProductStyles;
    @FindBy(xpath = "//table//tr[3]/td[2]")
    private WebElement singleProductPageProductProperties;
    @FindBy(xpath = "//section[@class='page-product-box'][2]/h3")
    private WebElement singleProductPageMoreInfoSectionTitle;
    @FindBy(xpath = "//section[@class='page-product-box'][2]//p")
    private WebElement singleProductPageProductDetailedDescription;
    //list elements
    private List<WebElement> colorButtonElements = driver.findElements(By.xpath("//ul[@id='color_to_pick_list']/li"));
    @FindBy(xpath = "//ul[@id='thumbs_list_frame']/li//img")
    private List<WebElement> productImageElements;


    public SingleProductPage(WebDriver driver) {super(driver);}

    //single product page data getters
    public String getProductReference(){return singleProductPageProductReference.getText();}
    public String getProductCondition(){return singleProductPageProductCondition.getText();}
    public String getProductShortDescription(){return singleProductPageProductShortDescription.getText();}
    public String getProductAvailabilityBoxText(){return singleProductPageProductAvailabilityBox.getText();}
    public String getProductUnitPrice(){return singleProductPageProductUnitPrice.getText();}
    public String getProductComposition(){return singleProductPageProductComposition.getText();}
    public String getProductStyles(){return singleProductPageProductStyles.getText();}
    public String getProductDescription(){return singleProductPageProductDetailedDescription.getText();}

    //single product page text element getters
    public String getSingleProductPageTitle() {return singleProductPageProductTitle.getText();}
    public String getProductReferenceSubtext() {return singleProductPageProductReferenceSubtext.getText();}
    public String getProductConditionSubtext() {return singleProductPageProductConditionSubtext.getText();}
    public String getDataSheetSectionTitle() {return singleProductPageDataSheetSectionTitle.getText();}
    public String getMoreInformationSectionTitle() {return singleProductPageMoreInfoSectionTitle.getText();}

    //single product page web element assert methods
    public boolean isSingleProductPageBreadcrumbDisplayed() {return singleProductPageBreadcrumb.isDisplayed();}
    public boolean isSingleProductPageMainProductImageDisplayed() {return singleProductPageMainProductImage.isDisplayed();}
    public boolean isSingleProductPageViewLargerImageButtonDisplayed() {return singleProductPageViewLargerImageButton.isDisplayed();}
    public boolean isSingleProductPageProductTitleDisplayed() {return singleProductPageProductTitle.isDisplayed();}
    public boolean isSingleProductPageProductReferenceSubtextDisplayed() {return singleProductPageProductReferenceSubtext.isDisplayed();}
    public boolean isSingleProductPageProductReferenceDisplayed() {return singleProductPageProductReference.isDisplayed();}
    public boolean isSingleProductPageProductConditionSubtextDisplayed() {return singleProductPageProductConditionSubtext.isDisplayed();}
    public boolean isSingleProductPageProductConditionDisplayed() {return singleProductPageProductCondition.isDisplayed();}
    public boolean isSingleProductPageProductShortDescriptionDisplayed() {return singleProductPageProductShortDescription.isDisplayed();}
    public boolean isSingleProductPageProductAvailabilityBoxDisplayed() {return singleProductPageProductAvailabilityBox.isDisplayed();}
    public boolean isSingleProductPageProductShareTweetLinkDisplayed() {return singleProductPageProductShareTweetLink.isDisplayed();}
    public boolean isSingleProductPageProductShareFacebookLinkDisplayed() {return singleProductPageProductShareFacebookLink.isDisplayed();}
    public boolean isSingleProductPageProductShareGoogleLinkDisplayed() {return singleProductPageProductShareGoogleLink.isDisplayed();}
    public boolean isSingleProductPageProductSharePinterestLinkDisplayed() {return singleProductPageProductSharePinterestLink.isDisplayed();}
    public boolean isSingleProductPageProductSendFriendEmailLinkDisplayed() {return singleProductPageProductSendFriendEmailLink.isDisplayed();}
    public boolean isSingleProductPageProductPrintLinkDisplayed() {return singleProductPageProductPrintLink.isDisplayed();}
    public boolean isSingleProductPageProductUnitPriceDisplayed() {return singleProductPageProductUnitPrice.isDisplayed();}
    public boolean isSingleProductPagePaymentIconDisplayed() {return singleProductPagePaymentIcon.isDisplayed();}
    public boolean isSingleProductPageDataSheetSectionTitleDisplayed() {return singleProductPageDataSheetSectionTitle.isDisplayed();}
    public boolean isSingleProductPageProductCompositionDisplayed() {return singleProductPageProductComposition.isDisplayed();}
    public boolean isSingleProductPageProductStylesDisplayed() {return singleProductPageProductStyles.isDisplayed();}
    public boolean isSingleProductPageProductPropertiesDisplayed() {return singleProductPageProductProperties.isDisplayed();}
    public boolean isSingleProductPageMoreInfoSectionTitleDisplayed() {return singleProductPageMoreInfoSectionTitle.isDisplayed();}
    public boolean isSingleProductPageProductDetailedDescriptionDisplayed() {return singleProductPageProductDetailedDescription.isDisplayed();}
    //list elements
    public boolean isProductColorButtonDisplayed() {
        return colorButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductViewImageDisplayed() {
        return productImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }


}
