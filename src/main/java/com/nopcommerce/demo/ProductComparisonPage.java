package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class ProductComparisonPage extends BasePage{

    //product comparison page web elements
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement productComparisonPageBreadcrumb;
    @FindBy(xpath = "//div[@id='center_column']/h1")
    private WebElement productComparisonPageTitle;
    @FindBy(xpath = "//table[@id='product_comparison']//td[@class='td_empty compare_extra_information']//p[1]")
    private WebElement productComparisonBoxSubtext;
    @FindBy(xpath = "//table[@id='product_comparison']//td[@class='td_empty compare_extra_information']//p[2]/button[1]")
    private WebElement productComparisonBoxTweetShareLink;
    @FindBy(xpath = "//table[@id='product_comparison']//td[@class='td_empty compare_extra_information']//p[2]/button[2]")
    private WebElement productComparisonBoxFacebookShareLink;
    @FindBy(xpath = "//table[@id='product_comparison']//td[@class='td_empty compare_extra_information']//p[2]/button[3]")
    private WebElement productComparisonBoxGoogleShareLink;
    @FindBy(xpath = "//table[@id='product_comparison']//td[@class='td_empty compare_extra_information']//p[2]/button[4]")
    private WebElement productComparisonBoxPinterestShareLink;
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement productComparisonPageContinueShoppingButton;
    @FindBy(xpath = "//div[@id='layer_cart']//a")
    private WebElement productComparisonPageProductProceedToCartButton;
    //product comparison table list elements
    @FindBy(xpath = "//table[@id='product_comparison']/tbody/tr[1]/td/h5")
    private List<WebElement> productComparedNameElements;
    @FindBy(xpath = "//table[@id='product_comparison']/tbody/tr[1]/td/div[@class='prices-container']/span")
    private List<WebElement> productComparedUnitPriceElements;
    @FindBy(xpath = "//table[@id='product_comparison']/tbody/tr[1]/td/div[@class='prices-container']//span[@class='reduced-price']")
    private List<WebElement> productComparedReducedPriceTextElements;
    @FindBy(xpath = "//table[@id='product_comparison']/tbody/tr[1]/td/div[@class='product_desc']")
    private List<WebElement> productComparedDescriptionElements;
    @FindBy(xpath = "//table[@id='product_comparison']/tbody/tr[2]/td")
    private List<WebElement> productComparedCompositionElements;
    @FindBy(xpath = "//table[@id='product_comparison']/tbody/tr[3]/td")
    private List<WebElement> productComparedStylesElements;
    @FindBy(xpath = "//table[@id='product_comparison']/tbody/tr[4]/td")
    private List<WebElement> productComparedPropertiesElements;

    private List<WebElement> productComparedImageElements = driver.findElements(By.xpath("//table[@id='product_comparison']/tbody/tr[1]/td/div[@class='product-image-block']/a"));
    private List<WebElement> productComparedRemoveButtonElements = driver.findElements(By.xpath("//table[@id='product_comparison']/tbody/tr[1]/td/div[@class='remove']/a"));
    private List<WebElement> productComparedAddToCartButtonElements = driver.findElements(By.xpath("//table[@id='product_comparison']/tbody/tr[1]/td//div[@class='button-container']/a[1]"));
    private List<WebElement> productComparedViewButtonElements = driver.findElements(By.xpath("//table[@id='product_comparison']/tbody/tr[1]/td//div[@class='button-container']/a[2]"));

    public ProductComparisonPage(WebDriver driver) {super(driver);}

    //click 'Remove' product button method
    public void clickRemoveProductButton(int index) {
        Actions actions = new Actions(driver);
        actions.moveToElement(productComparedRemoveButtonElements.get(index)).click().perform();
    }

    //click 'Add to Cart' product button method
    public void clickAddToCartProductButton(int index) {
        Actions actions = new Actions(driver);
        actions.moveToElement(productComparedAddToCartButtonElements.get(index)).click().perform();
    }

    //click 'Proceed to Checkout' button method (simple JS click fails to add product to cart for some reason, Actions don't work here)
    public void clickProceedToCheckoutButton() {
        try {
            //attempt regular Actions click first
            Actions actions = new Actions(driver);
            actions.moveToElement(productComparisonPageProductProceedToCartButton).click().perform();
        } catch (Exception e) {
            //js click if Actions fails
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", productComparisonPageProductProceedToCartButton);
        }
    }

    //product comparison page product data getters (list elements)
    public List<String> getProductComparedName() {
        List<String> productComparedNames = new ArrayList<>();
        for (WebElement element : productComparedNameElements) {
            productComparedNames.add(element.getText());
        }
        return productComparedNames;
    }
    public List<String> getProductComparedUnitPrice() {
        List<String> productComparedUnitPrices = new ArrayList<>();
        for (WebElement element : productComparedUnitPriceElements) {
            productComparedUnitPrices.add(element.getText());
        }
        return productComparedUnitPrices;
    }
    public List<String> getProductComparedDescription() {
        List<String> productComparedDescriptions = new ArrayList<>();
        for (WebElement element : productComparedDescriptionElements) {
            productComparedDescriptions.add(element.getText());
        }
        return productComparedDescriptions;
    }
    public List<String> getProductComparedComposition() {
        List<String> productComparedCompositions = new ArrayList<>();
        for (WebElement element : productComparedCompositionElements) {
            productComparedCompositions.add(element.getText());
        }
        return productComparedCompositions;
    }
    public List<String> getProductComparedStyles() {
        List<String> productComparedStyles = new ArrayList<>();
        for (WebElement element : productComparedStylesElements) {
            productComparedStyles.add(element.getText());
        }
        return productComparedStyles;
    }
    public List<String> getProductComparedProperty() {
        List<String> productComparedProperties = new ArrayList<>();
        for (WebElement element : productComparedPropertiesElements) {
            productComparedProperties.add(element.getText());
        }
        return productComparedProperties;
    }
    //reduced price tags getter
    public List<String> getProductComparedReducedPriceTag() {
        List<String> productComparedReducedPriceTags = new ArrayList<>();
        for (WebElement element : productComparedReducedPriceTextElements) {
            productComparedReducedPriceTags.add(element.getText());
        }
        return productComparedReducedPriceTags;
    }

    //product comparison page text element getters
    public String getProductComparisonPageTitle() {return productComparisonPageTitle.getText();}
    public String getProductComparisonBoxSubtext() {return productComparisonBoxSubtext.getText();}


    //product comparison page web element assert methods
    public boolean isProductComparisonPageBreadcrumbDisplayed() {return productComparisonPageBreadcrumb.isDisplayed();}
    public boolean isProductComparisonPageTitleDisplayed() {return productComparisonPageTitle.isDisplayed();}
    public boolean isProductComparisonBoxSubtextDisplayed() {return productComparisonBoxSubtext.isDisplayed();}
    public boolean isProductComparisonBoxTweetShareLinkDisplayed() {return productComparisonBoxTweetShareLink.isDisplayed();}
    public boolean isProductComparisonBoxFacebookShareLinkDisplayed() {return productComparisonBoxFacebookShareLink.isDisplayed();}
    public boolean isProductComparisonBoxGoogleShareLinkDisplayed() {return productComparisonBoxGoogleShareLink.isDisplayed();}
    public boolean isProductComparisonBoxPinterestShareLinkDisplayed() {return productComparisonBoxPinterestShareLink.isDisplayed();}
    public boolean isProductComparisonContinueShoppingButtonDisplayed() {return productComparisonPageContinueShoppingButton.isDisplayed();}
    //list elements
    public boolean isProductComparedProductNameDisplayed() {
        return productComparedNameElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductComparedProductUnitPriceDisplayed() {
        return productComparedUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductComparedProductReducedPriceTagDisplayed() {
        return productComparedReducedPriceTextElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductComparedProductDescDisplayed() {
        return productComparedDescriptionElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductComparedProductImageDisplayed() {
        return productComparedImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductComparedProductRemoveButtonDisplayed() {
        return productComparedRemoveButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductComparedProductAddToCartButtonDisplayed() {
        return productComparedAddToCartButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductComparedProductViewButtonDisplayed() {
        return productComparedViewButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductComparedProductCompositionDisplayed() {
        return productComparedCompositionElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductComparedProductStylesDisplayed() {
        return productComparedStylesElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isProductComparedProductPropertiesDisplayed() {
        return productComparedPropertiesElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
}
