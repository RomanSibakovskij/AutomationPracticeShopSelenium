package com.nopcommerce.demo;

import com.nopcommerce.demo.utilities.TestMethods;
import org.junit.jupiter.api.*;

public class HomePageTest extends TestMethods {

    //Test 001 -> valid user navigation to 'Create Account' page test
    @Test
    @DisplayName("Valid User Navigation To Create Account Page Test")
    @Tag("Valid_User_Navigation_To_Create_Account_Page")
    void navigateUserToCreateAccountPageTest(){
        validNavigateToCreateAccountPageTest();
    }
    

}
