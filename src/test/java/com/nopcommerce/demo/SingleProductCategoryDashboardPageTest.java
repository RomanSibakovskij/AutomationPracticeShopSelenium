package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SingleProductCategoryDashboardPageTest extends TestMethods{

    //Test 007 -> navigate guest to 'Women' product category page test (as a guest)
    @Test
    @DisplayName("Guest Navigation To 'Women' Product Category Page Test")
    @Tag("Test_As_A_Guest")
    void guestNavigateToWomenProductCategoryPageTest(){
        navigateToWomenCategoryProductDashboardPageTest();
    }

    //Test 007a -> navigate registered user to 'Women' product category page test (as a registered user)
    @Test
    @DisplayName("Registered User Navigation To 'Women' Product Category Page Test")
    @Tag("Test_As_A_Registered_User")
    void regUserNavigateToWomenProductCategoryPageTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //return to homepage test
        returnRegisteredUserToHomePage();
        //navigate to 'Women' product category dashboard page test (as a registered user)
        navigateToWomenCategoryProductDashboardPageTest();
    }

    //single category page dashboard product display view tests

    //Test 007b -> product sort by lowest price first test (single category product dashboard page) (as a guest)
    @Test
    @DisplayName("Product Sort By Lowest Price Test (as a guest)")
    @Tag("Product_Sort_By_View_Test")
    @Tag("Test_As_A_Guest")
    void guestProductSortByLowestPriceTest(){
        //navigate to 'Women' category dashboard page test (as a guest)
        navigateToWomenCategoryProductDashboardPageTest();
        //sort product by lowest price first (as a guest)
        sortByLowestPriceFirstViewTest();
    }

    //Test 007c -> product sort by lowest price first test (single category product dashboard page) (as a registered user)
    @Test
    @DisplayName("Product Sort By Lowest Price Test (as a registered user)")
    @Tag("Product_Sort_By_View_Test")
    @Tag("Test_As_A_Registered_User")
    void regUserProductSortByLowestPriceTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //return to homepage test
        returnRegisteredUserToHomePage();
        //navigate to 'Women' product category dashboard page test (as a registered user)
        navigateToWomenCategoryProductDashboardPageTest();
        //sort product by lowest price first (as a registered user)
        sortByLowestPriceFirstViewTest();
    }

    //Test 007d -> product sort by highest price first test (single category product dashboard page) (as a guest)
    @Test
    @DisplayName("Product Sort By Highest Price Test (as a guest)")
    @Tag("Product_Sort_By_View_Test")
    @Tag("Test_As_A_Guest")
    void guestProductSortByHighestPriceTest(){
        //navigate to 'Women' category dashboard page test (as a guest)
        navigateToWomenCategoryProductDashboardPageTest();
        //sort product by highest price first (as a guest)
        sortByHighestPriceFirstViewTest();
    }

    //Test 007e -> product sort by highest price first test (single category product dashboard page) (as a registered user)
    @Test
    @DisplayName("Product Sort By Highest Price Test (as a registered user)")
    @Tag("Product_Sort_By_View_Test")
    @Tag("Test_As_A_Registered_User")
    void regUserProductSortByHighestPriceTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //return to homepage test
        returnRegisteredUserToHomePage();
        //navigate to 'Women' product category dashboard page test (as a registered user)
        navigateToWomenCategoryProductDashboardPageTest();
        //sort product by highest price first (as a registered user)
        sortByHighestPriceFirstViewTest();
    }

    //Test 007f -> product sort by product name (A - Z) test (single category product dashboard page) (as a guest)
    @Test
    @DisplayName("Product Sort By Name (A - Z) Test (as a guest)")
    @Tag("Product_Sort_By_View_Test")
    @Tag("Test_As_A_Guest")
    void guestProductSortByNameAZTest(){
        //navigate to 'Women' category dashboard page test (as a guest)
        navigateToWomenCategoryProductDashboardPageTest();
        //sort product by product name (A - Z) (as a guest)
        sortByNameAZFirstViewTest();
    }

    //add products to compare list tests

    //Test 008 -> add 'Blouse' and 'Printed Chiffon Dress' products to compare list test (as a guest)
    @Test
    @DisplayName("Add 'Blouse' and 'Printed Chiffon Dress' Products To Compare List Test (as a guest)")
    @Tag("Add_Products_To_Compare_List")
    @Tag("Test_As_A_Guest")
    void guestAddProductsToCompareListTest(){
        //navigate to 'Women' category dashboard page test (as a guest)
        navigateToWomenCategoryProductDashboardPageTest();
        //add 'Blouse' and 'Printed Chiffon Dress' products to compare list test (as a guest)
        addBlouseAndPrintedDressToCompareListTest();
    }

    //Test 008a -> add 'Blouse' and 'Printed Chiffon Dress' products to compare list test (as a registered user)
    @Test
    @DisplayName("Add 'Blouse' and 'Printed Chiffon Dress' Products To Compare List Test (as a registered user)")
    @Tag("Add_Products_To_Compare_List")
    @Tag("Test_As_A_Registered_User")
    void regUserAddProductsToCompareListTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //return to homepage test
        returnRegisteredUserToHomePage();
        //navigate to 'Women' category dashboard page test (as a registered user)
        navigateToWomenCategoryProductDashboardPageTest();
        //add 'Blouse' and 'Printed Chiffon Dress' products to compare list test (as a registered user)
        addBlouseAndPrintedDressToCompareListTest();
    }

    //Test 008b -> remove 'Blouse' product from compare list test (as a guest)
    @Test
    @DisplayName("Remove 'Blouse' Product From Compare List Test (as a guest)")
    @Tag("Remove_Product_From_Compare_List")
    @Tag("Test_As_A_Guest")
    void guestRemoveProductFromCompareListTest(){
        //navigate to 'Women' category dashboard page test (as a guest)
        navigateToWomenCategoryProductDashboardPageTest();
        //add 'Blouse' and 'Printed Chiffon Dress' products to compare list test (as a guest)
        addBlouseAndPrintedDressToCompareListTest();
        //remove 'Blouse' product to compare list test (as a guest)
        removeBlouseFromCompareListTest();
    }

    //Test 008c -> remove 'Blouse' product from compare list test (as a registered user)
    @Test
    @DisplayName("Remove 'Blouse' Product From Compare List Test (as a registered user)")
    @Tag("Remove_Product_From_Compare_List")
    @Tag("Test_As_A_Registered_User")
    void regUserRemoveProductFromCompareListTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user address addition test
        validUserAddressAdditionTest();
        //return to homepage test
        returnRegisteredUserToHomePage();
        //navigate to 'Women' category dashboard page test (as a registered user)
        navigateToWomenCategoryProductDashboardPageTest();
        //add 'Blouse' and 'Printed Chiffon Dress' products to compare list test (as a registered user)
        addBlouseAndPrintedDressToCompareListTest();
        //remove 'Blouse' product to compare list test (as a registered user)
        removeBlouseFromCompareListTest();
    }

}
