package com.nopcommerce.demo;

import com.nopcommerce.demo.invalidscenarios.CreateAccountInvalidScenariosPage;
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

    //Test 002a -> valid user account creation test (female)
    @Test
    @DisplayName("Valid Female User Account Creation Test")
    @Tag("Valid_User_Account_Creation")
    @Tag("Female")
    void validUserAccountFemaleCreationTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid female user account creation test
        validFemaleUserAccountCreationTest(createAccountPage);
    }

    //no singular input tests

    //Test 002b -> invalid user account creation test - no first name
    @Test
    @DisplayName("Invalid Male User Account Creation Test - No First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidUserAccountCreationNoFirstNameTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - no first name
        invalidUserAccountNoFirstNameCreationTest(createAccountInvalidScenariosPage);
    }

    //Test 002c -> invalid user account creation test - no last name
    @Test
    @DisplayName("Invalid Male User Account Creation Test - No Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidUserAccountCreationNoLastNameTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - no last name
        invalidUserAccountNoLastNameCreationTest(createAccountInvalidScenariosPage);
    }

    //Test 002d -> invalid user account creation test - no email address
    @Test
    @DisplayName("Invalid Male User Account Creation Test - No Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidUserAccountCreationNoEmailTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - no email address
        invalidUserAccountNoEmailCreationTest(createAccountInvalidScenariosPage);
    }

}
