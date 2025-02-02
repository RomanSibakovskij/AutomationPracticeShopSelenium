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

    //Test 003c -> invalid user login test - no login password
    @Test
    @DisplayName("Invalid User Account Login Test - No Login Password")
    @Tag("Invalid_User_Login")
    @Tag("No_Singular_Input")
    void invalidUserAccountLoginNoPasswordTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user login test - no login password
        invalidUserLoginNoPasswordTest(createAccountPage);
    }

    //invalid singular input

    //Test 003d -> invalid user login test - invalid login email address
    @Test
    @DisplayName("Invalid User Account Login Test - Invalid Login Email")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccountLoginInvalidEmailTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user login test - invalid login email address
        invalidUserLoginInvalidEmailTest(createAccountPage);
    }

    //Test 003e -> invalid user login test - invalid login password
    @Test
    @DisplayName("Invalid User Account Login Test - Invalid Login Password")
    @Tag("Invalid_User_Login")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccountLoginInvalidPasswordTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user login test - invalid login password
        invalidUserLoginInvalidPasswordTest(createAccountPage);
    }

    //valid user logout tests

    //Test 004 -> valid user logout test
    @Test
    @DisplayName("Valid User Account Logout Test")
    @Tag("Valid_User_Logout")
    @Tag("Male")
    void validUserAccountLogoutTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user logout test
        validUserLogOutTest(createAccountPage);
    }

    //Test 004a -> valid user logout test (female)
    @Test
    @DisplayName("Valid Female User Account Logout Test")
    @Tag("Valid_User_Logout")
    @Tag("Female")
    void validFemaleUserAccountLogoutTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid female user account creation test
        validFemaleUserAccountCreationTest(createAccountPage);
        //valid user logout test
        validUserLogOutTest(createAccountPage);
    }

}
