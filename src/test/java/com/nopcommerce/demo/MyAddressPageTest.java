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

    //Test 006f -> invalid user address addition test - no user state
    @Test
    @DisplayName("Invalid User Address Addition Test - No User State")
    @Tag("Invalid_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidAddUserAddressNoStateTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - no user state
        invalidUserAddressAdditionNoUserStateTest();
    }

    //Test 006g -> invalid user address addition test - no user postal code
    @Test
    @DisplayName("Invalid User Address Addition Test - No User Postal Code")
    @Tag("Invalid_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidAddUserAddressNoPostCodeTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - no user post code
        invalidUserAddressAdditionNoUserPostCodeTest();
    }

    //Test 006h -> invalid user address addition test - no user home phone
    @Test
    @DisplayName("Invalid User Address Addition Test - No User Home Phone")
    @Tag("Invalid_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidAddUserAddressNoHomePhoneTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - no user home phone
        invalidUserAddressAdditionNoUserHomePhoneTest();
    }

    //Test 006i -> invalid user address addition test - no user address title
    @Test
    @DisplayName("Invalid User Address Addition Test - No User Address Title")
    @Tag("Invalid_User_Address_Addition")
    @Tag("No_Singular_Input")
    void invalidAddUserAddressNoAddressTitleTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - no user address title
        invalidUserAddressAdditionNoUserAddressTitleTest();
    }

    //too short singular input

    //Test 006j -> invalid user address addition test - too short user address (4 chars) (user address addition hasn't been aborted - test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Short User Address")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidAddUserAddressTooShortAddressTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - too short user address (4 chars)
        invalidUserAddressAdditionTooShortUserAddressTest();
    }

    //Test 006k -> invalid user address addition test - too short user city (1 char) (user address addition hasn't been aborted - test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Short User City")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidAddUserAddressTooShortCityTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - too short user city (1 char)
        invalidUserAddressAdditionTooShortUserCityTest();
    }

    //Test 006l -> invalid user address addition test - too short user postal code (4 digits)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Short User Postal Code")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidAddUserAddressTooShortPostCodeTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - too short user post code (4 digits)
        invalidUserAddressAdditionTooShortUserPostCodeTest();
    }

    //Test 006m -> invalid user address addition test - too short user home phone (3 digits) (user address addition hasn't been aborted - test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Short User Home Phone")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Short_Singular_Input")
    void invalidAddUserAddressTooShortHomePhoneTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - too short user home phone (3 digits)
        invalidUserAddressAdditionTooShortUserHomePhoneTest();
    }

    //too long singular input

    //Test 006n -> invalid user address addition test - too long user address (100 chars) (user address addition hasn't been aborted - test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long User Address")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidAddUserAddressTooLongAddressTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - too long user address (100 chars)
        invalidUserAddressAdditionTooLongUserAddressTest();
    }

    //Test 006o -> invalid user address addition test - too long user city (100 chars) (user address addition hasn't been aborted - test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long User City")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidAddUserAddressTooLongCityTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - too long user city (100 chars)
        invalidUserAddressAdditionTooLongUserCityTest();
    }

    //Test 006p -> invalid user address addition test - too long user postal code (6 digits)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long User Postal Code")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidAddUserAddressTooLongPostCodeTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - too long user post code (6 digits)
        invalidUserAddressAdditionTooLongUserPostCodeTest();
    }

    //Test 006q -> invalid user address addition test - too long user home phone (33 digits)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long User Home Phone")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidAddUserAddressTooLongHomePhoneTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - too long user home phone (33 digits)
        invalidUserAddressAdditionTooLongUserHomePhoneTest();
    }

    //Test 006r -> invalid user address addition test - too long user mobile phone (33 digits) (additional test)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long User Mobile Phone")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidAddUserAddressTooLongMobilePhoneTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - too long user mobile phone (33 digits)
        invalidUserAddressAdditionTooLongUserMobilePhoneTest();
    }

    //Test 006s -> invalid user address addition test - too long user address title (33 chars)
    @Test
    @DisplayName("Invalid User Address Addition Test - Too Long User Address Title")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Too_Long_Singular_Input")
    void invalidAddUserAddressTooLongAddressTitleTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - too long user address title (33 chars)
        invalidUserAddressAdditionTooLongUserAddressTitleTest();
    }

    //invalid singular input (by format)

    //Test 006t -> invalid user address addition test - invalid user address format (special symbols only)
    @Test
    @DisplayName("Invalid User Address Addition Test - Invalid User Address Format")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAddUserAddressInvalidAddressFormatTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - invalid user address format (special symbols only)
        invalidUserAddressAdditionInvalidUserAddressFormatTest();
    }

    //Test 006u -> invalid user address addition test - invalid user city format (special symbols only)
    @Test
    @DisplayName("Invalid User Address Addition Test - Invalid User City Format")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAddUserAddressInvalidCityFormatTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - invalid user city format (special symbols only)
        invalidUserAddressAdditionInvalidUserCityFormatTest();
    }

    //Test 006v -> invalid user address addition test - invalid user postal code format (special symbols only)
    @Test
    @DisplayName("Invalid User Address Addition Test - Invalid User Postal Code Format")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAddUserAddressInvalidPostCodeFormatTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - invalid user post code format (special symbols only)
        invalidUserAddressAdditionInvalidUserPostCodeFormatTest();
    }

    //Test 006w -> invalid user address addition test - invalid user home phone format (special symbols only)
    @Test
    @DisplayName("Invalid User Address Addition Test - Invalid User Home Phone Format")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAddUserAddressInvalidHomePhoneFormatTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - invalid user home phone format (special symbols only)
        invalidUserAddressAdditionInvalidUserHomePhoneFormatTest();
    }

    //Test 006x -> invalid user address addition test - invalid user address title format (special symbols only) (user address addition doesn't get aborted - test has failed)
    @Test
    @DisplayName("Invalid User Address Addition Test - Invalid User Address Title Format")
    @Tag("Invalid_User_Address_Addition")
    @Tag("Invalid_Singular_Input_Format")
    void invalidAddUserAddressInvalidAddressTitleFormatTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //valid user navigation to 'Create Account' page test
        validNavigateToCreateAccountPageTest();
        //valid male user account creation test
        validMaleUserAccountCreationTest(createAccountPage);
        //invalid user address addition test - invalid user address title format (special symbols only)
        invalidUserAddressAdditionInvalidUserAddressTitleFormatTest();
    }

}
