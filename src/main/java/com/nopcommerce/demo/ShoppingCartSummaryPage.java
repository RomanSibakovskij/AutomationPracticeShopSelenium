package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;

import java.time.Duration;
import java.util.*;

public class ShoppingCartSummaryPage extends BasePage {

    //shopping cart summary page
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement shoppingCartPageBreadcrumb;
    @FindBy(xpath = "//div[@id='center_column']/h1")
    private WebElement shoppingCartPageTitle;
    @FindBy(xpath = "//div[@id='center_column']//span[@class='heading-counter']")
    private WebElement shoppingCartProductCount;
    //product table list element
    private List<WebElement> shoppingCartStepImageElements = driver.findElements(By.xpath("//ul[@id='order_step']/li"));
    private List<WebElement> shoppingCartProductImageLinkElements = driver.findElements(By.xpath("//table[@id='cart_summary']/tbody/tr/td[1]/a"));
    private List<WebElement> shoppingCartProductNameLinkElements = driver.findElements(By.xpath("//table[@id='cart_summary']/tbody/tr/td[2]/p/a"));
    @FindBy(xpath = "//table[@id='cart_summary']/tbody/tr/td[2]/small")
    private List<WebElement> shoppingCartProductDescElements;
    @FindBy(xpath = "//table[@id='cart_summary']/tbody/tr/td[3]/span")
    private List<WebElement> shoppingCartProductAvailabilityTagElements;
    @FindBy(xpath = "//table[@id='cart_summary']/tbody/tr/td[4]")
    private List<WebElement> shoppingCartProductUnitPriceElements;
    @FindBy(xpath = "//table[@id='cart_summary']/tbody/tr/td[5]//a[1]")
    private List<WebElement> shoppingCartProductQtyDecreaseButtonElements;
    @FindBy(xpath = "//table[@id='cart_summary']/tbody/tr/td[5]//input[@class='cart_quantity_input form-control grey']")
    private List<WebElement> shoppingCartProductQtyInputFieldElements;
    @FindBy(xpath = "//table[@id='cart_summary']/tbody/tr/td[5]//a[2]")
    private List<WebElement> shoppingCartProductQTYIncreaseButtonElements;
    private List<WebElement> shoppingCartProductRemoveButtonElements = driver.findElements(By.xpath("//table[@id='cart_summary']/tbody/tr/td[6]//a"));
    @FindBy(xpath = "//table[@id='cart_summary']/tbody/tr/td[7]")
    private List<WebElement> shoppingCartProductTotalPriceElements;
    //summary
    @FindBy(xpath = "//table[@id='cart_summary']/tfoot/tr[1]/td[3]")
    private WebElement shoppingCartSummaryTotalProductPriceElements;
    @FindBy(xpath = "//table[@id='cart_summary']/tfoot/tr[2]/td[3]")
    private WebElement shoppingCartSummaryTotalShippingPriceElements;
    @FindBy(xpath = "//table[@id='cart_summary']/tfoot/tr[3]/td[3]")
    private WebElement shoppingCartSummaryTotalPriceElements;
    //delivery address section
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement shoppingCartDeliveryAddressSubtitle;
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement shoppingCartDeliveryAddressData;
    //shipping address section
    @FindBy(xpath = "//ul[@class='address first_item item box']/li[1]/h3")
    private WebElement shoppingCartShippingAddressSubtitle;
    @FindBy(xpath = "//ul[@class='address first_item item box']/li[1]")
    private WebElement shoppingCartShippingAddressData;
    //buttons
    @FindBy(xpath = "//ul[@class='address last_item alternate_item box']/li[1]/h3")
    private WebElement shoppingCartBackToShoppingButton;
    @FindBy(xpath = "//ul[@class='address last_item alternate_item box']/li[1]")
    private WebElement shoppingCartProceedToCheckoutButton;

    public ShoppingCartSummaryPage(WebDriver driver) {super(driver);}

    //shopping cart product data getters
    //list elements
    public List<String> getShoppingCartProductName() {
        List<String> productNames = new ArrayList<>();
        for (WebElement element : shoppingCartProductNameLinkElements) {
            productNames.add(element.getText());
        }
        return productNames;
    }
    public List<String> getShoppingCartProductDescription() {
        List<String> productDescriptions = new ArrayList<>();
        for (WebElement element : shoppingCartProductDescElements) {
            productDescriptions.add(element.getText());
        }
        return productDescriptions;
    }
    public List<String> getShoppingCartProductAvailabilityTag() {
        List<String> productTags = new ArrayList<>();
        for (WebElement element : shoppingCartProductAvailabilityTagElements) {
            productTags.add(element.getText());
        }
        return productTags;
    }
    public List<String> getShoppingCartProductUnitPrice() {
        List<String> productUnitPrices = new ArrayList<>();
        for (WebElement element : shoppingCartProductUnitPriceElements) {
            productUnitPrices.add(element.getText());
        }
        return productUnitPrices;
    }
    public List<String> getShoppingCartProductQuantity() {
        List<String> productQuantities = new ArrayList<>();
        for (WebElement element : shoppingCartProductNameLinkElements) {
            productQuantities.add(element.getDomAttribute("value"));
        }
        return productQuantities;
    }
    public List<String> getShoppingCartProductTotalPrice() {
        List<String> productTotalPrices = new ArrayList<>();
        for (WebElement element : shoppingCartProductTotalPriceElements) {
            productTotalPrices.add(element.getText());
        }
        return productTotalPrices;
    }
    //single elements
    public String getShoppingCartSummaryTotalProductPrice() {return shoppingCartSummaryTotalProductPriceElements.getText();}
    public String getShoppingCartSummaryTotalShippingPrice() {return shoppingCartSummaryTotalShippingPriceElements.getText();}
    public String getShoppingCartSummaryTotalPrice() {return shoppingCartSummaryTotalPriceElements.getText();}
    public String getDeliveryAddressData() {return shoppingCartDeliveryAddressData.getText();}
    public String getShippingAddressData() {return shoppingCartShippingAddressData.getText();}

    //shopping page text element getters
    public String getShoppingCartPageTitle() {return shoppingCartPageTitle.getText();}
    public String getShoppingCartProductCount() {return shoppingCartProductCount.getText();}
    public String getShoppingCartDeliveryAddressSubtitle() {return shoppingCartDeliveryAddressSubtitle.getText();}
    public String getShoppingCartShippingAddressSubtitle() {return shoppingCartShippingAddressSubtitle.getText();}

    //shopping cart summary page web assert methods
    public boolean isShoppingCartPageBreadcrumbDisplayed() {return shoppingCartPageBreadcrumb.isDisplayed();}
    public boolean isShoppingCartPageTitleDisplayed() {return shoppingCartPageTitle.isDisplayed();}
    public boolean isShoppingCartProductCountDisplayed() {return shoppingCartProductCount.isDisplayed();}
    public boolean isShoppingCartSummaryTotalProductPriceDisplayed() {return shoppingCartSummaryTotalProductPriceElements.isDisplayed();}
    public boolean isShoppingCartSummaryTotalShippingPriceDisplayed() {return shoppingCartSummaryTotalShippingPriceElements.isDisplayed();}
    public boolean isShoppingCartSummaryTotalPriceDisplayed() {return shoppingCartSummaryTotalPriceElements.isDisplayed();}
    public boolean isShoppingCartDeliveryAddressSubtitleDisplayed() {return shoppingCartDeliveryAddressSubtitle.isDisplayed();}
    public boolean isShoppingCartDeliveryAddressDataDisplayed() {return shoppingCartDeliveryAddressData.isDisplayed();}
    public boolean isShoppingCartShippingAddressSubtitleDisplayed() {return shoppingCartShippingAddressSubtitle.isDisplayed();}
    public boolean isShoppingCartShippingAddressDataDisplayed() {return shoppingCartShippingAddressData.isDisplayed();}
    public boolean isShoppingCartBackToShoppingButtonDisplayed() {return shoppingCartBackToShoppingButton.isDisplayed();}
    public boolean isShoppingCartProceedToCheckoutButtonDisplayed() {return shoppingCartProceedToCheckoutButton.isDisplayed();}
    //list elements
    public boolean isShoppingCartStepImageDisplayed() {
        return shoppingCartStepImageElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartProductImageLinkDisplayed() {
        return shoppingCartProductImageLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartProductNameLinkDisplayed() {
        return shoppingCartProductNameLinkElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartProductDescriptionDisplayed() {
        return shoppingCartProductDescElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartProductAvailabilityTagDisplayed() {
        return shoppingCartProductAvailabilityTagElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartProductUnitPriceDisplayed() {
        return shoppingCartProductUnitPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartProductQtyDecreaseButtonDisplayed() {
        return shoppingCartProductQtyDecreaseButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartProductQtyInputFieldDisplayed() {
        return shoppingCartProductQtyInputFieldElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartProductQtyIncreaseButtonDisplayed() {
        return shoppingCartProductQTYIncreaseButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartProductRemoveButtonDisplayed() {
        return shoppingCartProductRemoveButtonElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
    public boolean isShoppingCartProductTotalPriceDisplayed() {
        return shoppingCartProductTotalPriceElements.stream()
                .allMatch(WebElement::isDisplayed);
    }
}
