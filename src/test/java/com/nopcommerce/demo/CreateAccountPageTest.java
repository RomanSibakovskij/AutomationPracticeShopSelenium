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

    //Test 002e -> invalid user account creation test - no password
    @Test
    @DisplayName("Invalid Male User Account Creation Test - No Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("No_Singular_Input")
    void invalidUserAccountCreationNoPasswordTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - no password
        invalidUserAccountNoPasswordCreationTest(createAccountInvalidScenariosPage);
    }

    //too short singular input tests

    //Test 002f -> invalid user account creation test - too short first name (1 char)
    @Test
    @DisplayName("Invalid Male User Account Creation Test - Too Short First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountCreationTooShortFirstNameTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - too short first name (1 char)
        invalidUserAccountTooShortFirstNameCreationTest(createAccountInvalidScenariosPage);
    }

    //Test 002g -> invalid user account creation test - too short last name (1 char)
    @Test
    @DisplayName("Invalid Male User Account Creation Test - Too Short Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountCreationTooShortLastNameTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - too short last name (1 char)
        invalidUserAccountTooShortLastNameCreationTest(createAccountInvalidScenariosPage);
    }

    //Test 002h -> invalid user account creation test - too short password (4 chars)
    @Test
    @DisplayName("Invalid Male User Account Creation Test - Too Short Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Short_Singular_Input")
    void invalidUserAccountCreationTooShortPasswordTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - too short password (4 chars)
        invalidUserAccountTooShortPasswordCreationTest(createAccountInvalidScenariosPage);
    }

    //too long singular input tests

    //Test 002i -> invalid user account creation test - too long first name (33 chars)
    @Test
    @DisplayName("Invalid Male User Account Creation Test - Too Long First Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountCreationTooLongFirstNameTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - too long first name (33 chars)
        invalidUserAccountTooLongFirstNameCreationTest(createAccountInvalidScenariosPage);
    }

    //Test 002j -> invalid user account creation test - too long last name (33 chars)
    @Test
    @DisplayName("Invalid Male User Account Creation Test - Too Long Last Name")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountCreationTooLongLastNameTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - too long last name (33 chars)
        invalidUserAccountTooLongLastNameCreationTest(createAccountInvalidScenariosPage);
    }

    //Test 002k -> invalid user account creation test - too long email address (100 chars) (user account creation wasn't aborted - test has failed)
    @Test
    @DisplayName("Invalid Male User Account Creation Test - Too Long Email")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountCreationTooLongEmailTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - too long email address (100 chars)
        invalidUserAccountTooLongEmailCreationTest(createAccountInvalidScenariosPage);
    }

    //Test 002l -> invalid user account creation test - too long password (33 chars)
    @Test
    @DisplayName("Invalid Male User Account Creation Test - Too Long Password")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Too_Long_Singular_Input")
    void invalidUserAccountCreationTooLongPasswordTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - too long password (33 chars)
        invalidUserAccountTooLongPasswordCreationTest(createAccountInvalidScenariosPage);
    }

    //invalid singular input format tests

    //Test 002m -> invalid user account creation test - invalid first name format (special symbols only)
    @Test
    @DisplayName("Invalid Male User Account Creation Test - Invalid First Name Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccountCreationInvalidFirstNameTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - invalid first name format (special symbols only)
        invalidUserAccountInvalidFirstNameFormatCreationTest(createAccountInvalidScenariosPage);
    }

    //Test 002n -> invalid user account creation test - invalid last name format (special symbols only)
    @Test
    @DisplayName("Invalid Male User Account Creation Test - Invalid Last Name Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccountCreationInvalidLastNameFormatTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - invalid last name format (special symbols only)
        invalidUserAccountInvalidLastNameFormatCreationTest(createAccountInvalidScenariosPage);
    }

    //Test 002o -> invalid user account creation test - invalid email address format (missing '@') (user account creation wasn't aborted - test has failed)
    @Test
    @DisplayName("Invalid Male User Account Creation Test - Invalid Email Format")
    @Tag("Invalid_User_Account_Creation")
    @Tag("Invalid_Singular_Input")
    void invalidUserAccountCreationInvalidEmailFormatTest(){
        CreateAccountInvalidScenariosPage createAccountInvalidScenariosPage = new CreateAccountInvalidScenariosPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //invalid user account creation test - invalid email address format (missing '@')
        invalidUserAccountInvalidEmailFormatCreationTest(createAccountInvalidScenariosPage);
    }

}
