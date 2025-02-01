package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods {

    //Test 001 -> valid user navigation to 'Create Account' page test
    @Test
    @DisplayName("Valid User Navigation To Create Account Page Test")
    @Tag("Valid_User_Navigation_To_Create_Account_Page")
    void navigateUserToCreateAccountPageTest(){
        validNavigateToCreateAccountPageTest();
    }

    // no singular input

    //Test 001a -> invalid user navigation to 'Create Account' page test - no user email
    @Test
    @DisplayName("Invalid User Navigation To Create Account Page Test - No Email")
    @Tag("Invalid_User_Navigation_To_Create_Account_Page")
    @Tag("No_Singular_Input")
    void navigateUserToCreateAccountPageNoEmailTest(){
        invalidNavigateToCreateAccountPageNoEmailTest();
    }

    //too short singular input

    //Test 001b -> invalid user navigation to 'Create Account' page test - too short user email (user navigation to 'Create Account' page doesn't get aborted - test has failed)
    @Test
    @DisplayName("Invalid User Navigation To Create Account Page Test - Too Short Email")
    @Tag("Invalid_User_Navigation_To_Create_Account_Page")
    @Tag("Too_Short_Singular_Input")
    void navigateUserToCreateAccountPageTooShortEmailTest(){
        invalidNavigateToCreateAccountPageTooShortEmailTest();
    }

    //too long singular input

    //Test 001c -> invalid user navigation to 'Create Account' page test - too long user email (user navigation to 'Create Account' page doesn't get aborted - test has failed)
    @Test
    @DisplayName("Invalid User Navigation To Create Account Page Test - Too Long Email")
    @Tag("Invalid_User_Navigation_To_Create_Account_Page")
    @Tag("Too_Long_Singular_Input")
    void navigateUserToCreateAccountPageTooLongEmailTest(){
        invalidNavigateToCreateAccountPageTooLongEmailTest();
    }


}
