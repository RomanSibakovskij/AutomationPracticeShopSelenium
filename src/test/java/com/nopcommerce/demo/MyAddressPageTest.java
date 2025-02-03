package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class MyAddressPageTest extends TestMethods{

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

}
