package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class MyAccountInformationPageTest extends TestMethods{

    //valid 'My Account' user information update tests

    //Test 005 -> valid user first name update test
    @Test
    @DisplayName("Valid User First Name Update Test")
    @Tag("Valid_User_Information_Update")
    void validUserFirstNameUpdateTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user first name update test
        validUserAccountFirstNameUpdateTest(createAccountPage);
    }

    //Test 005a -> valid user last name update test
    @Test
    @DisplayName("Valid User Last Name Update Test")
    @Tag("Valid_User_Information_Update")
    void validUserLastNameUpdateTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user last name update test
        validUserAccountLastNameUpdateTest(createAccountPage);
    }

}
