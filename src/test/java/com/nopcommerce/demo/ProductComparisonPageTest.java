package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class ProductComparisonPageTest extends TestMethods{

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
