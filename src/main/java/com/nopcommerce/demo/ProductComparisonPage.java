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

}
