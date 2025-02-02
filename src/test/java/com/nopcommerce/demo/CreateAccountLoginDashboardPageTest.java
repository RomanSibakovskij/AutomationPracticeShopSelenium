package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CreateAccountLoginDashboardPageTest extends TestMethods{

    //valid user login tests

    //Test 003 -> valid user login test
    @Test
    @DisplayName("Valid User Account Login Test")
    @Tag("Valid_User_Login")
    @Tag("Male")
    void validUserAccountLoginTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user login test
        validUserLoginTest(createAccountPage);
    }

    //Test 003a -> valid user login test (female)
    @Test
    @DisplayName("Valid Female User Account Login Test")
    @Tag("Valid_User_Login")
    @Tag("Female")
    void validFemaleUserAccountLoginTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid female user account creation test
        validFemaleUserAccountCreationTest(createAccountPage);
        //valid user login test
        validUserLoginTest(createAccountPage);
    }

    //invalid user login tests

    //no singular input

    //Test 003b -> invalid user login test - no login email address
    @Test
    @DisplayName("Invalid User Account Login Test - No Login Email")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidUserAccountLoginNoEmailTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user login test - no login email address
        invalidUserLoginNoEmailTest(createAccountPage);
    }

}
