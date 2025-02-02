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

    //Test 005b -> valid user email update test
    @Test
    @DisplayName("Valid User Email Update Test")
    @Tag("Valid_User_Information_Update")
    void validUserEmailUpdateTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user email address update test
        validUserAccountEmailUpdateTest(createAccountPage);
    }

    //Test 005c -> valid user password update test
    @Test
    @DisplayName("Valid User Password Update Test")
    @Tag("Valid_User_Information_Update")
    void validUserPasswordUpdateTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user password address update test
        validUserAccountPasswordUpdateTest(createAccountPage);
    }

    //invalid 'My Account' user information update tests

    //no singular input

    //Test 005d -> invalid user first name update test - no first name
    @Test
    @DisplayName("Invalid User First Name Update Test - No First Name")
    @Tag("Invalid_User_Information_Update")
    @Tag("No_Singular_Input")
    void invalidUserNoFirstNameUpdateTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user first name update test - no first name
        invalidUserAccountNoFirstNameUpdateTest(createAccountPage);
    }

    //Test 005e -> invalid user last name update test - no last name
    @Test
    @DisplayName("Invalid User Last Name Update Test - No Last Name")
    @Tag("Invalid_User_Information_Update")
    @Tag("No_Singular_Input")
    void invalidUserNoLastNameUpdateTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user last name update test - no last name
        invalidUserAccountNoLastNameUpdateTest(createAccountPage);
    }

    //Test 005f -> invalid user email update test - no email address
    @Test
    @DisplayName("Invalid User Email Update Test - No Email")
    @Tag("Invalid_User_Information_Update")
    @Tag("No_Singular_Input")
    void invalidUserNoEmailUpdateTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user email address update test - no email address
        invalidUserAccountNoEmailUpdateTest(createAccountPage);
    }

    //Test 005g -> invalid user password update test - no new password confirmation
    @Test
    @DisplayName("Invalid User Password Update Test - No Confirm New Password")
    @Tag("Invalid_User_Information_Update")
    @Tag("No_Singular_Input")
    void invalidUserNoConfirmNewPasswordUpdateTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user password address update test - no new password confirmation
        invalidUserAccountNoConfirmPasswordUpdateTest(createAccountPage);
    }

    //too short singular input

    //Test 005h -> invalid user first name update test - too short first name (1 char) (user information update doesn't get aborted - test has failed)
    @Test
    @DisplayName("Invalid User First Name Update Test - Too Short First Name")
    @Tag("Invalid_User_Information_Update")
    @Tag("Too_Short_Singular_Input")
    void invalidUserTooShortFirstNameUpdateTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user first name update test - too short first name (1 char)
        invalidUserAccountTooShortFirstNameUpdateTest(createAccountPage);
    }

}
