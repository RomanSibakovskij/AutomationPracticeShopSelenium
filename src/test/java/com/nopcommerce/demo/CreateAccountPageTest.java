package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class CreateAccountPageTest extends TestMethods{

    //valid user account creation tests

    //Test 002 -> valid user account creation test (male)
    @Test
    @DisplayName("Valid Male User Account Creation Test")
    @Tag("Valid_User_Account_Creation")
    @Tag("Male")
    void validUserAccountMaleCreationTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
    }

}
