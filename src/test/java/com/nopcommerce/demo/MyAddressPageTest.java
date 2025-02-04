package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class MyAddressPageTest extends TestMethods{

    //valid user account addition tests

    //Test 006 -> valid user address addition test
    @Test
    @DisplayName("Valid User Address Addition Test")
    @Tag("Valid_User_Address_Addition")
    void validAddUserAddressTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user address addition test
        validUserAddressAdditionTest();
    }

    //Test 006a -> valid user two addresses addition test
    @Test
    @DisplayName("Valid User Two Addresses Addition Test")
    @Tag("Valid_User_Address_Addition")
    @Tag("Two_Addresses_Addition")
    void validAddTwoUserAddressesTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid two user addresses addition test
        validTwoUserAddressesAdditionTest();
    }

    //Test 006b -> valid user address addition and update test
    @Test
    @DisplayName("Valid User Address Addition And Update Test")
    @Tag("Valid_User_Address_Addition")
    @Tag("Address_Addition_And_Update")
    void validAddUserAddressAndUpdateTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user address addition and update test
        validUserAddressAdditionAndUpdateTest();
    }

    //Test 006c -> valid user address addition and removal test
    @Test
    @DisplayName("Valid User Address Addition And Removal Test")
    @Tag("Valid_User_Address_Addition")
    @Tag("Address_Addition_And_Removal")
    void validAddUserAddressAndRemovalTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //valid user address addition and removal test
        validUserAddressAdditionAndRemovalTest();
    }

    //invalid user address addition tests

    //no singular input

    //Test 006d -> invalid user address addition test - no user address
    @Test
    @DisplayName("Invalid User Address Addition Test - No User Address")
    @Tag("Invalid_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidAddUserAddressNoAddressTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - no user address
        invalidUserAddressAdditionNoUserAddressTest();
    }

    //Test 006e -> invalid user address addition test - no user city
    @Test
    @DisplayName("Invalid User Address Addition Test - No User City")
    @Tag("Invalid_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidAddUserAddressNoCityTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - no user city
        invalidUserAddressAdditionNoUserCityTest();
    }

}
