package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class SingleProductCategoryDashboardPageTest extends TestMethods{

    //Test 007-> navigate guest to 'Women' product category page test
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
        //navigate to 'Women' product category page test
        navigateToWomenCategoryProductDashboardPageTest();
    }


}
