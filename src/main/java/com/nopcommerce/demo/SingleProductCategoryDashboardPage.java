package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class SingleProductCategoryDashboardPage extends BasePage {

    //single product category dashboard page web elements
    //aside section elements
    @FindBy(xpath = "//h2[@class='title_block']")
    private WebElement productDashboardAsideCatOneTitle;
    @FindBy(xpath = "//div[@id='layered_block_left']/p[@class='title_block']")
    private WebElement productDashboardAsideCatTwoTitle;
    @FindBy(xpath = "//form[@id='layered_form']//div[@class='layered_filter'][1]//span[@class='layered_subtitle']")
    private WebElement productDashboardAsideCatTwoSubCatOneTitle;
    @FindBy(xpath = "//form[@id='layered_form']//div[@class='layered_filter'][2]//span[@class='layered_subtitle']")
    private WebElement productDashboardAsideCatTwoSubCatTwoTitle;
    @FindBy(xpath = "//form[@id='layered_form']//div[@class='layered_filter'][3]//span[@class='layered_subtitle']")
    private WebElement productDashboardAsideCatTwoSubCatThreeTitle;
    @FindBy(xpath = "//form[@id='layered_form']//div[@class='layered_filter'][4]//span[@class='layered_subtitle']")
    private WebElement productDashboardAsideCatTwoSubCatFourTitle;
    @FindBy(xpath = "//form[@id='layered_form']//div[@class='layered_filter'][5]//span[@class='layered_subtitle']")
    private WebElement productDashboardAsideCatTwoSubCatFiveTitle;
    @FindBy(xpath = "//form[@id='layered_form']//div[@class='layered_filter'][6]//span[@class='layered_subtitle']")
    private WebElement productDashboardAsideCatTwoSubCatSixTitle;
    @FindBy(xpath = "//form[@id='layered_form']//div[@class='layered_filter'][7]//span[@class='layered_subtitle']")
    private WebElement productDashboardAsideCatTwoSubCatSevenTitle;
    @FindBy(xpath = "//form[@id='layered_form']//div[@class='layered_filter'][8]//span[@class='layered_subtitle']")
    private WebElement productDashboardAsideCatTwoSubCatEightTitle;
    @FindBy(xpath = "//ul[@id='ul_layered_price_0']/span")
    private WebElement productDashboardAsidePriceRangeSubtext;
    @FindBy(xpath = "//ul[@id='ul_layered_price_0']//a[1]")
    private WebElement productDashboardAsidePriceRangeSliderDown;
    @FindBy(xpath = "//ul[@id='ul_layered_price_0']//a[2]")
    private WebElement productDashboardAsidePriceRangeSliderUp;
    @FindBy(xpath = "//section[@id='informations_block_left_1']/p")
    private WebElement productDashboardAsideCatThreeTitle;
    @FindBy(xpath = "//div[@id='special_block_right']/p")
    private WebElement productDashboardAsideCatFourTitle;
    @FindBy(xpath = "//div[@id='stores_block_left']/p")
    private WebElement productDashboardAsideCatFiveTitle;
    @FindBy(xpath = "//div[@id='special_block_right']//ul/li/a")
    private WebElement productDashboardAsideCatFiveProductImgLink;
    @FindBy(xpath = "//div[@id='special_block_right']//ul/li//h5/a")
    private WebElement productDashboardAsideCatFiveProductNameLink;
    @FindBy(xpath = "//div[@id='special_block_right']//ul/li//p")
    private WebElement productDashboardAsideCatFiveProductDesc;
    @FindBy(xpath = "//div[@id='special_block_right']//ul/li//div[@class='price-box']")
    private WebElement productDashboardAsideCatFiveProductPriceBox;
    @FindBy(xpath = "//div[@id='special_block_right']//a[@class='btn btn-default button button-small']")
    private WebElement productDashboardAsideCatFiveButtonLink;
    @FindBy(xpath = "//div[@id='stores_block_left']/p")
    private WebElement productDashboardAsideCatSixTitle;
    @FindBy(xpath = "//div[@id='stores_block_left']//p[@class='store_image']/a")
    private WebElement productDashboardAsideCatSixImgLink;
    @FindBy(xpath = "//div[@id='stores_block_left']//a[@class='btn btn-default button button-small']")
    private WebElement productDashboardAsideCatSixButtonLink;
    @FindBy(xpath = "//div[@id='viewed-products_block_left']/p")
    private WebElement productDashboardAsideCatSevenTitle;
    //aside section list elements
    private List<WebElement> productDashboardAsideCatOneSubcategoryLinkElements = driver.findElements(By.xpath("//div[@id='categories_block_left']/div[@class='block_content']/ul/li/a"));
    private List<WebElement> productDashboardAsideSubcategoryCheckboxElements = driver.findElements(By.xpath("//form[@id='layered_form']//input[@type='checkbox']"));
    private List<WebElement> productDashboardAsideInfoSubcategoryLinkElements = driver.findElements(By.xpath("//section[@id='informations_block_left_1']//ul/li/a"));
    private List<WebElement> productDashboardAsideCatSevenProductImgLinkElements = driver.findElements(By.xpath("//div[@id='viewed-products_block_left']//ul/li//a[@class='products-block-image']"));
    private List<WebElement> productDashboardAsideCatSevenProductNameLinkElements = driver.findElements(By.xpath("//div[@id='viewed-products_block_left']//ul/li//h5/a"));
    @FindBy(xpath = "//div[@id='viewed-products_block_left']//ul/li//p")
    private List<WebElement> productDashboardAsideCatSevenProductDescElements;

    //main section elements
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement productDashboardBreadcrumb;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='content_scene_cat_bg']")
    private WebElement productDashboardCategoryImage;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='content_scene_cat_bg']//span")
    private WebElement productDashboardCategoryImgTitle;
    @FindBy(xpath = "//div[@id='center_column']//div[@class='content_scene_cat_bg']//div[@class='rte']")
    private WebElement productDashboardCategoryImgDesc;
    @FindBy(xpath = "//div[@id='center_column']//h1/span[1]")
    private WebElement productDashboardTitle;
    @FindBy(xpath = "//div[@id='center_column']//h1/span[2]")
    private WebElement productDashboardCountText;
    @FindBy(xpath = "//div[@id='center_column']//label")
    private WebElement productDashboardSortBySubtext;
    @FindBy(xpath = "//div[@id='center_column']//select")
    private WebElement productDashboardSortByDropdownMenu;
    @FindBy(xpath = "//ul[@class='display hidden-xs']/li[1]")
    private WebElement productDashboardViewSubtext;
    @FindBy(xpath = "//ul[@class='display hidden-xs']/li[2]/a")
    private WebElement productDashboardGridViewButton;
    @FindBy(xpath = "//ul[@class='display hidden-xs']/li[3]/a")
    private WebElement productDashboardListViewButton;
    @FindBy(xpath = "(//div[@id='center_column']//div[@class='product-count'])[1]")
    private WebElement productDashboardShowingItemsText;
    @FindBy(xpath = "//div[@id='center_column']//button[@class='btn btn-default button button-medium bt_compare bt_compare']")
    private WebElement productDashboardCompareButtonBox;
    //product list elements
    private List<WebElement> productImageLinkElements = driver.findElements(By.xpath("//div[@id='center_column']//img"));
    private List<WebElement> productNameLinkElements = driver.findElements(By.xpath("//ul[@class='product_list grid row']/li//h5/a"));
    private List<WebElement> productNameElements = driver.findElements(By.xpath("//div[@id='center_column']/ul/li/div[@class='product-container']//h5"));
    private List<WebElement> productViewHoverButtonElements = driver.findElements(By.xpath("//ul[@class='product_list grid row']/li//a[@class='quick-view-mobile']"));
    @FindBy(xpath = "//ul[@class='product_list grid row']/li//span[@class='price product-price']")
    private List<WebElement> productUnitPriceElements;
    @FindBy(xpath = "//ul[@class='product_list grid row']/li//span[@class='button ajax_add_to_cart_button btn btn-default disabled']")
    private List<WebElement> productAddToCartDisabledButtonElements;
    private List<WebElement> productMoreButtonElements = driver.findElements(By.xpath("//ul[@class='product_list grid row']/li//a[@class='button lnk_view btn btn-default']"));
    private List<WebElement> productColorButtonElements = driver.findElements(By.xpath("//ul[@class='product_list grid row']/li//ul/li/a"));
    private List<WebElement> productAddToCompareLinkElements = driver.findElements(By.xpath("//a[@class='add_to_compare']"));
    @FindBy(xpath = "//span[@class='availability']")
    private List<WebElement> productDashboardAvailabilityBoxText;

    public SingleProductCategoryDashboardPage(WebDriver driver) {super(driver);}

    //hover above product image method
    public void hoverAboveProductImageLink(int index) {
        Actions actions = new Actions(driver);
        actions.moveToElement(productImageLinkElements.get(index)).perform();
    }

    //click 'Add to Compare' link method
    public void clickAddToCompareLink(int index) {
        Actions actions = new Actions(driver);
        actions.moveToElement(productAddToCompareLinkElements.get(index)).click().perform();
    }

    //click 'Compare' button box method
    public void clickCompareButtonBox() {
        Actions actions = new Actions(driver);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", productDashboardCompareButtonBox);
        actions.moveToElement(productDashboardCompareButtonBox).click().perform();
    }

    //single product category dashboard page text element getters (main page content)
    public String getProductDashboardCategoryImgTitle() {return productDashboardCategoryImgTitle.getText();}
    public String getProductDashboardCategoryImgDesc() {return productDashboardCategoryImgDesc.getText();}
    public String getProductDashboardTitle() {return productDashboardTitle.getText();}
    public String getProductDashboardCountText() {return productDashboardCountText.getText();}
    public String getProductDashboardSortBySubtext() {return productDashboardSortBySubtext.getText();}
    public String getProductDashboardViewSubtext() {return productDashboardViewSubtext.getText();}
    public String getProductDashboardShowingItemsText() {return productDashboardShowingItemsText.getText();}
    //single product category dashboard page text element getters (aside page content)
    public String getProductDashboardAsideCatOneTitle() {return productDashboardAsideCatOneTitle.getText();}
    public String getProductDashboardAsideCatTwoTitle() {return productDashboardAsideCatTwoTitle.getText();}
    public String getProductDashboardAsideCatTwoSubCatOneTitle() {return productDashboardAsideCatTwoSubCatOneTitle.getText();}
    public String getProductDashboardAsideCatTwoSubCatTwoTitle() {return productDashboardAsideCatTwoSubCatTwoTitle.getText();}
    public String getProductDashboardAsideCatTwoSubCatThreeTitle() {return productDashboardAsideCatTwoSubCatThreeTitle.getText();}
    public String getProductDashboardAsideCatTwoSubCatFourTitle() {return productDashboardAsideCatTwoSubCatFourTitle.getText();}
    public String getProductDashboardAsideCatTwoSubCatFiveTitle() {return productDashboardAsideCatTwoSubCatFiveTitle.getText();}
    public String getProductDashboardAsideCatTwoSubCatSixTitle() {return productDashboardAsideCatTwoSubCatSixTitle.getText();}
    public String getProductDashboardAsideCatTwoSubCatSevenTitle() {return productDashboardAsideCatTwoSubCatSevenTitle.getText();}
    public String getProductDashboardAsideCatTwoSubCatEightTitle() {return productDashboardAsideCatTwoSubCatEightTitle.getText();}
    public String getProductDashboardAsidePriceRangeSubtext() {return productDashboardAsidePriceRangeSubtext.getText();}
    public String getProductDashboardAsideCatThreeTitle() {return productDashboardAsideCatThreeTitle.getText();}
    public String getProductDashboardAsideCatFourTitle() {return productDashboardAsideCatFourTitle.getText();}
    public String getProductDashboardAsideCatFiveTitle() {return productDashboardAsideCatFiveTitle.getText();}
    public String getProductDashboardAsideCatSixTitle() {return productDashboardAsideCatSixTitle.getText();}
    public String getProductDashboardAsideCatSevenTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(1300));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatSevenTitle));
        return productDashboardAsideCatSevenTitle.getText();
    }

    //single product category dashboard page product data element getters (main page content)
    public List<String> getProductName() {
        List<String> productNames = new ArrayList<>();
        for (WebElement element : productNameElements) {
            productNames.add(element.getText());
        }
        System.out.println("Number of elements found: " + productNameElements.size());
        return productNames;
    }
    public List<String> getProductUnitPrice() {
        List<String> productUnitPrices = new ArrayList<>();
        for (WebElement element : productUnitPriceElements) {
            String price = element.getText().trim();
            if (!price.isEmpty()) {
                productUnitPrices.add(price);
            }
        }
        return productUnitPrices;
    }
    public List<String> getProductDashboardAvailabilityBoxText() {
        List<String> productAvailabilities = new ArrayList<>();
        for (WebElement element : productDashboardAvailabilityBoxText) {
            productAvailabilities.add(element.getText());
        }
        return productAvailabilities;
    }

    //single product category dashboard page product data element getters (aside page content)
    public List<String> getAsideProductName() {
        List<String> asideProductNames = new ArrayList<>();
        for (WebElement element : productDashboardAsideCatSevenProductNameLinkElements) {
            asideProductNames.add(element.getText());
        }
        return asideProductNames;
    }

    //single product category dashboard page web element assert methods
    //aside
    public boolean isProductDashboardAsideCatOneTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatOneTitle));
        return productDashboardAsideCatOneTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatTwoTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatTwoTitle));
        return productDashboardAsideCatTwoTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatThreeTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatThreeTitle));
        return productDashboardAsideCatThreeTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatFourTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatFourTitle));
        return productDashboardAsideCatFourTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatFiveTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatFiveTitle));
        return productDashboardAsideCatFiveTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatSixTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatSixTitle));
        return productDashboardAsideCatSixTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatSevenTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatSevenTitle));
        return productDashboardAsideCatSevenTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatTwoSubCatOneTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatTwoSubCatOneTitle));
        return productDashboardAsideCatTwoSubCatOneTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatTwoSubCatTwoTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatTwoSubCatTwoTitle));
        return productDashboardAsideCatTwoSubCatTwoTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatTwoSubCatThreeTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatTwoSubCatThreeTitle));
        return productDashboardAsideCatTwoSubCatThreeTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatTwoSubCatFourTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatTwoSubCatFourTitle));
        return productDashboardAsideCatTwoSubCatFourTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatTwoSubCatFiveTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatTwoSubCatFiveTitle));
        return productDashboardAsideCatTwoSubCatFiveTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatTwoSubCatSixTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatTwoSubCatSixTitle));
        return productDashboardAsideCatTwoSubCatSixTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatTwoSubCatSevenTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatTwoSubCatSevenTitle));
        return productDashboardAsideCatTwoSubCatSevenTitle.isDisplayed();
    }
    public boolean isProductDashboardAsideCatTwoSubCatEightTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatTwoSubCatEightTitle));
        return productDashboardAsideCatTwoSubCatEightTitle.isDisplayed();
    }
    public boolean isProductDashboardAsidePriceRangeSubtextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsidePriceRangeSubtext));
        return productDashboardAsidePriceRangeSubtext.isDisplayed();
    }
    public boolean isProductDashboardAsidePriceRangeSliderDownDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsidePriceRangeSliderDown));
        return productDashboardAsidePriceRangeSliderDown.isDisplayed();
    }
    public boolean isProductDashboardAsidePriceRangeSliderUpDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsidePriceRangeSliderUp));
        return productDashboardAsidePriceRangeSliderUp.isDisplayed();
    }
    public boolean isProductDashboardAsideCatFiveProductImgLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatFiveProductImgLink));
        return productDashboardAsideCatFiveProductImgLink.isDisplayed();
    }
    public boolean isProductDashboardAsideCatFiveProductNameLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatFiveProductNameLink));
        return productDashboardAsideCatFiveProductNameLink.isDisplayed();
    }
    public boolean isProductDashboardAsideCatFiveProductDescDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatFiveProductDesc));
        return productDashboardAsideCatFiveProductDesc.isDisplayed();
    }
    public boolean isProductDashboardAsideCatFiveProductPriceBoxDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatFiveProductPriceBox));
        return productDashboardAsideCatFiveProductPriceBox.isDisplayed();
    }
    public boolean isProductDashboardAsideCatFiveButtonLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatFiveButtonLink));
        return productDashboardAsideCatFiveButtonLink.isDisplayed();
    }
    public boolean isProductDashboardAsideCatSixImgLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatSixImgLink));
        return productDashboardAsideCatSixImgLink.isDisplayed();
    }
    public boolean isProductDashboardAsideCatSixButtonLinkDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardAsideCatSixButtonLink));
        return productDashboardAsideCatSixButtonLink.isDisplayed();
    }
    //main section
    public boolean isProductDashboardBreadcrumbDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardBreadcrumb));
        return productDashboardBreadcrumb.isDisplayed();
    }
    public boolean isProductDashboardCategoryImageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardCategoryImage));
        return productDashboardCategoryImage.isDisplayed();
    }
    public boolean isProductDashboardCategoryImgTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardCategoryImgTitle));
        return productDashboardCategoryImgTitle.isDisplayed();
    }
    public boolean isProductDashboardCategoryImgDescDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardCategoryImgDesc));
        return productDashboardCategoryImgDesc.isDisplayed();
    }
    public boolean isProductDashboardTitleDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardTitle));
        return productDashboardTitle.isDisplayed();
    }
    public boolean isProductDashboardCountTextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardCountText));
        return productDashboardCountText.isDisplayed();
    }
    public boolean isProductDashboardSortBySubtextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardSortBySubtext));
        return productDashboardSortBySubtext.isDisplayed();
    }
    public boolean isProductDashboardSortByDropdownMenuDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(800));
        wait.until(ExpectedConditions.visibilityOf(productDashboardSortByDropdownMenu));
        return productDashboardSortByDropdownMenu.isDisplayed();
    }
    public boolean isProductDashboardViewSubtextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardViewSubtext));
        return productDashboardViewSubtext.isDisplayed();
    }
    public boolean isProductDashboardGridViewDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardGridViewButton));
        return productDashboardGridViewButton.isDisplayed();
    }
    public boolean isProductDashboardListViewDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardListViewButton));
        return productDashboardListViewButton.isDisplayed();
    }
    public boolean isProductDashboardShowingItemsTextDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardShowingItemsText));
        return productDashboardShowingItemsText.isDisplayed();
    }
    public boolean isProductDashboardCompareButtonBoxDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOf(productDashboardCompareButtonBox));
        return productDashboardCompareButtonBox.isDisplayed();
    }
    //aside and main list elements

    public boolean isProductDashboardAsideCatOneSubcategoryLinkDisplayed() {
        return productDashboardAsideCatOneSubcategoryLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductDashboardAsideCatOneSubcategoryCheckboxDisplayed() {
        return productDashboardAsideSubcategoryCheckboxElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductDashboardAsideInfoSubcategoryLinkDisplayed() {
        return productDashboardAsideInfoSubcategoryLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductDashboardAsideCatSevenProductImgLinkDisplayed() {
        return productDashboardAsideCatSevenProductImgLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductDashboardAsideCatSevenProductNameLinkDisplayed() {
        return productDashboardAsideCatSevenProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductDashboardAsideCatSevenProductDescDisplayed() {
        return productDashboardAsideCatSevenProductDescElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    //main
    public boolean isProductDashboardProductImgLinkDisplayed() {
        return productImageLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductDashboardProductNameLinkDisplayed() {
        return productNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductDashboardProductUnitPriceDisplayed() {
        return productUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductDashboardAddToCartDisabledButtonDisplayed() {
        return productAddToCartDisabledButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductDashboardMoreButtonDisplayed() {
        return productMoreButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductDashboardColorButtonDisplayed() {
        return productColorButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductDashboardAddToCompareLinkDisplayed() {
        return productAddToCompareLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }

    public boolean isProductDashboardAvailabilityBoxDisplayed() {
        return productDashboardAvailabilityBoxText.stream()
                .allMatch(WebElement::isDisplayed);
    }

}
