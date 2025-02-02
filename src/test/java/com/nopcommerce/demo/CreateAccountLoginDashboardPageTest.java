package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CreateAccountLoginDashboardPageTest extends TestMethods{

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

}
