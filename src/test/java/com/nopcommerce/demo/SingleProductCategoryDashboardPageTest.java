package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SingleProductCategoryDashboardPageTest extends TestMethods{

    //Test 007 -> navigate guest to 'Women' product category page test
    @Test
    @DisplayName("Guest Navigation To 'Women' Product Category Page Test")
    @Tag("Test_As_A_Guest")
    void guestNavigateToWomenProductCategoryPageTest(){
        navigateToWomenCategoryProductDashboardPageTest();
    }

    //Test 007a -> navigate registered user to 'Women' product category page test
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
        //navigate to 'Women' product category dashboard page test
        navigateToWomenCategoryProductDashboardPageTest();
    }

    //add products to compare list tests

    //Test 008 -> add 'Blouse' and 'Printed Chiffon Dress' products to compare list test
    @Test
    @DisplayName("Add 'Blouse' and 'Printed Chiffon Dress' Products To Compare List Test (as a guest)")
    @Tag("Add_Products_To_Compare_List")
    @Tag("Test_As_A_Guest")
    void guestAddProductsToCompareListTest(){
        //navigate to 'Women' category dashboard page test
        navigateToWomenCategoryProductDashboardPageTest();
        //add 'Blouse' and 'Printed Chiffon Dress' products to compare list test
        addBlouseAndPrintedDressToCompareListTest();
    }

    //Test 008a -> navigate registered user to 'Women' product category page test
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
        //navigate to 'Women' category dashboard page test
        navigateToWomenCategoryProductDashboardPageTest();
        //add 'Blouse' and 'Printed Chiffon Dress' products to compare list test
        addBlouseAndPrintedDressToCompareListTest();
    }

}
