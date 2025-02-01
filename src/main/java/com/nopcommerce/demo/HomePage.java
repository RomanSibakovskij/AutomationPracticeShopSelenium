package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class HomePage extends BasePage{

    //homepage web elements
    //main
    @FindBy(xpath = "//div[@id='columns']//div[@id='homepage-slider']")
    private WebElement homePageCarousel;
    @FindBy(xpath = "//div[@id='columns']//div[@class='bx-controls-direction']/a[1]")
    private WebElement homePageCarouselButtonOne;
    @FindBy(xpath = "//div[@id='columns']//div[@class='bx-controls-direction']/a[2]")
    private WebElement homePageCarouselButtonTwo;
    @FindBy(xpath = "//div[@id='columns']//div[@id='htmlcontent_top']/ul/li[1]/a")
    private WebElement homePageQuarterPercentSaleImgLink;
    @FindBy(xpath = "//div[@id='columns']//div[@id='htmlcontent_top']/ul/li[2]/a")
    private WebElement homePageFortyFivePercentSaleImgLink;
    //products section
    @FindBy(xpath = "//div[@id='center_column']//ul[@id='home-page-tabs']/li[1]/a")
    private WebElement popularSectionButtonLink;
    @FindBy(xpath = "//div[@id='center_column']//ul[@id='home-page-tabs']/li[2]/a")
    private WebElement bestSellersSectionButtonLink;
    @FindBy(xpath = "//div[@id='htmlcontent_home']//ul/li[1]/a")
    private WebElement topTrendsCategoryImgLink;
    @FindBy(xpath = "//div[@id='htmlcontent_home']//ul/li[2]/a")
    private WebElement menCoatsJacketsImgLink;
    @FindBy(xpath = "//div[@id='htmlcontent_home']//ul/li[3]/a")
    private WebElement womenCoatsJacketsImgLink;
    @FindBy(xpath = "//div[@id='htmlcontent_home']//ul/li[4]/a")
    private WebElement sunglassesImgLink;
    @FindBy(xpath = "//div[@id='htmlcontent_home']//ul/li[5]/a")
    private WebElement handbagsImgLink;
    //best seller product list elements
    @FindBy(xpath = "//ul[@id='blockbestsellers']/li[1]//img")
    private List<WebElement> bestsellerProductImageElements;
    private List<WebElement> bestsellerProductViewButtonElements = driver.findElements(By.xpath("//ul[@id='blockbestsellers']/li//a[@class='quick-view-mobile']"));
    private List<WebElement> bestsellerProductNameLinkElements = driver.findElements(By.xpath("//ul[@id='blockbestsellers']/li//h5/a"));
    @FindBy(xpath = "//ul[@id='blockbestsellers']/li//div[@class='right-block']//span[@class='price product-price']")
    private List<WebElement> bestsellerProductUnitPriceElements;
    private List<WebElement> bestsellerProductAddToCartButtonElements = driver.findElements(By.xpath("ul[@id='blockbestsellers']/li/div[@class='product-container']//div[@class='button-container']/span"));;
    private List<WebElement> bestsellerProductMoreButtonElements = driver.findElements(By.xpath("//ul[@id='blockbestsellers']/li/div[@class='product-container']//a[@title='View']"));
    //information section
    @FindBy(xpath = "//div[@id='facebook_block']/h4")
    private WebElement followUsSectionTitle;
    @FindBy(xpath = "//div[@id='facebook_block']//div[@class='facebook-fanbox']")
    private WebElement faceBookFanBox;
    //cms info blocks section
    @FindBy(xpath = "//div[@id='cmsinfo_block']//ul/li[1]/em")
    private WebElement shippingIcon;
    @FindBy(xpath = "//div[@id='cmsinfo_block']//ul/li[1]//h3")
    private WebElement shippingSectionTitle;
    @FindBy(xpath = "//div[@id='cmsinfo_block']//ul/li[1]//p")
    private WebElement shippingSectionText;
    @FindBy(xpath = "//div[@id='cmsinfo_block']//ul/li[1]/em")
    private WebElement phoneIcon;
    @FindBy(xpath = "//div[@id='cmsinfo_block']//ul/li[2]//h3")
    private WebElement phoneSectionTitle;
    @FindBy(xpath = "//div[@id='cmsinfo_block']//ul/li[2]//p")
    private WebElement phoneSectionText;
    @FindBy(xpath = "//div[@id='cmsinfo_block']//ul/li[3]/em")
    private WebElement creditCardIcon;
    @FindBy(xpath = "//div[@id='cmsinfo_block']//ul/li[3]//h3")
    private WebElement creditCardSectionTitle;
    @FindBy(xpath = "//div[@id='cmsinfo_block']//ul/li[3]//p")
    private WebElement creditCardText;
    @FindBy(xpath = "//div[@id='cmsinfo_block']/div[@class='col-xs-6'][2]/h3")
    private WebElement customBlockSectionTitle;
    @FindBy(xpath = "//div[@id='cmsinfo_block']/div[@class='col-xs-6'][2]//strong")
    private WebElement customBlockSectionSubtitle;
    @FindBy(xpath = "//div[@id='cmsinfo_block']/div[@class='col-xs-6'][2]/p[2]")
    private WebElement customBlockText;

    public HomePage(WebDriver driver) {super(driver);}

    public void clickBestsellersSectionButtonLink() {
        Actions actions = new Actions(driver);
        actions.moveToElement(bestSellersSectionButtonLink).click().perform();
    }

    //home page follow us section title getter
    public String getFollowUsSectionTitle() {return followUsSectionTitle.getText();}
    //home page shipping section title getter
    public String getShippingSectionTitle() {return shippingSectionTitle.getText();}
    //home page shipping section text getter
    public String getShippingSectionText() {return shippingSectionText.getText();}
    //home page phone section title getter
    public String getPhoneSectionTitle() {return phoneSectionTitle.getText();}
    //home page phone section text getter
    public String getPhoneSectionText() {return phoneSectionText.getText();}
    //home page credit card section title getter
    public String getCreditCardSectionTitle() {return creditCardSectionTitle.getText();}
    //home page credit card section text getter
    public String getCreditCardSectionText() {return creditCardText.getText();}
    //home page custom block section title getter
    public String getCustomBlockSectionTitle() {return customBlockSectionTitle.getText();}
    //home page custom block section subtitle getter
    public String getCustomBlockSubtitleText() {return customBlockSectionSubtitle.getText();}
    //home page custom block section text getter
    public String getCustomBlockText() {return customBlockText.getText();}

    //homepage product data getters (as a list)
    //bestseller product names
    public List<String> getBestsellerProductNames() {
        List<String> bestsellerProductName = new ArrayList<>();
        for (WebElement element : bestsellerProductNameLinkElements) {
            bestsellerProductName.add(element.getText());
        }
        return bestsellerProductName;
    }
    //bestseller product unit prices
    public List<String> getBestsellerProductUnitPrices() {
        List<String> bestsellerProductUnitPrice = new ArrayList<>();
        for (WebElement element : bestsellerProductUnitPriceElements) {
            bestsellerProductUnitPrice.add(element.getText());
        }
        return bestsellerProductUnitPrice;
    }

    //homepage web element assert methods
    public boolean isHomePageCarouselDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(homePageCarousel));
        return homePageCarousel.isDisplayed();
    }
    public boolean isHomePageCarouselButtonOneDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(homePageCarouselButtonOne));
        return homePageCarouselButtonOne.isDisplayed();
    }
    public boolean isHomePageCarouselButtonTwoDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(homePageCarouselButtonTwo));
        return homePageCarouselButtonTwo.isDisplayed();
    }
    public boolean isHomePageQuarterPercentSaleImgLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(homePageQuarterPercentSaleImgLink));
        return homePageQuarterPercentSaleImgLink.isDisplayed();
    }
    public boolean isHomePageFortyFivePercentSaleImgLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(homePageFortyFivePercentSaleImgLink));
        return homePageFortyFivePercentSaleImgLink.isDisplayed();
    }
    public boolean isPopularSectionButtonLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(popularSectionButtonLink));
        return popularSectionButtonLink.isDisplayed();
    }
    public boolean isBestsellersSectionButtonLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(bestSellersSectionButtonLink));
        return bestSellersSectionButtonLink.isDisplayed();
    }
    public boolean isTopTrendsCategoryImageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(topTrendsCategoryImgLink));
        return topTrendsCategoryImgLink.isDisplayed();
    }
    public boolean isMenCoatsJacketsImgLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(menCoatsJacketsImgLink));
        return menCoatsJacketsImgLink.isDisplayed();
    }
    public boolean isWomenCoatsJacketsImgLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(womenCoatsJacketsImgLink));
        return womenCoatsJacketsImgLink.isDisplayed();
    }
    public boolean isSunglassesImageLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(sunglassesImgLink));
        return sunglassesImgLink.isDisplayed();
    }
    public boolean isHandbagsImageLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(handbagsImgLink));
        return handbagsImgLink.isDisplayed();
    }
    //bestseller products list elements
    public boolean isBestsellerProductImgDisplayed() {
        for (WebElement element : bestsellerProductImageElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isBestsellerProductNameLinkDisplayed() {
        for (WebElement element : bestsellerProductNameLinkElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isBestsellerProductViewButtonDisplayed() {
        for (WebElement element : bestsellerProductViewButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isBestsellerProductUnitPriceDisplayed() {
        for (WebElement element : bestsellerProductUnitPriceElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isBestsellerProductAddToCartButtonDisplayed() {
        for (WebElement element : bestsellerProductAddToCartButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isBestsellerProductMoreButtonDisplayed() {
        for (WebElement element : bestsellerProductMoreButtonElements) {
            if (!element.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    //information section
    public boolean isFollowUsSectionTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(followUsSectionTitle));
        return followUsSectionTitle.isDisplayed();
    }
    public boolean isFacebookFanBoxDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(faceBookFanBox));
        return faceBookFanBox.isDisplayed();
    }
    public boolean isShippingIconDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(shippingIcon));
        return shippingIcon.isDisplayed();
    }
    public boolean isShippingSectionTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(shippingSectionTitle));
        return shippingSectionTitle.isDisplayed();
    }
    public boolean isShippingSectionTextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(shippingSectionText));
        return shippingSectionText.isDisplayed();
    }
    public boolean isPhoneIconDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(phoneIcon));
        return phoneIcon.isDisplayed();
    }
    public boolean isPhoneSectionTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(phoneSectionTitle));
        return phoneSectionTitle.isDisplayed();
    }
    public boolean isPhoneSectionTextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(phoneSectionText));
        return phoneSectionText.isDisplayed();
    }
    public boolean isCreditCardIconDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(creditCardIcon));
        return creditCardIcon.isDisplayed();
    }
    public boolean isCreditCardSectionTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(creditCardSectionTitle));
        return creditCardSectionTitle.isDisplayed();
    }
    public boolean isCreditCardSectionTextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(creditCardText));
        return creditCardText.isDisplayed();
    }
    public boolean isCustomBlockSectionTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(creditCardIcon));
        return creditCardIcon.isDisplayed();
    }
    public boolean isCustomBlockSectionSubtitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(creditCardSectionTitle));
        return creditCardSectionTitle.isDisplayed();
    }
    public boolean isCustomBlockSectionTextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(550));
        wait.until(ExpectedConditions.visibilityOf(creditCardText));
        return creditCardText.isDisplayed();
    }

}
