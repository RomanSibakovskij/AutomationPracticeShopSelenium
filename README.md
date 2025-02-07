# AutomationPracticeShopSelenium

Simple Selenium test suite on user account registration/login/logout, account information update, user address addition/update/removal, single category product display view, product addition to compare list, basic product addition to cart functionality(checkout couldn't be tested since products fail to be added to cart). The test suite captures screenshots at the end of test case run (for logging purposes).
Important note: during automated run available products fail to be added to cart (severe failure) while during manual testing no such problem occurs. Further testing is postponed until the issue has been fixed.

#Tech Requirements:

 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE

## Test Case List (further tests will be added once product addition to cart will be fixed)

// valid user navigation to 'Create Account' page test

1.	//Test 001 -> valid user navigation to 'Create Account' page test

// no singular input

1.	//Test 001a -> invalid user navigation to 'Create Account' page test - no user email

//too short singular input

1.	//Test 001b -> invalid user navigation to 'Create Account' page test - too short user email

//too long singular input

1.	//Test 001c -> invalid user navigation to 'Create Account' page test - too long user email

//invalid singular input format

1.	//Test 001d -> invalid user navigation to 'Create Account' page test - invalid user email format

//existing singular input

1.	//Test 001e -> invalid user navigation to 'Create Account' page test - existing user email (used in manual testing beforehand)

//valid user account creation tests

1.	//Test 002 -> valid user account creation test (male)
2.	//Test 002a -> valid user account creation test (female)

//no singular input tests

1.	//Test 002b -> invalid user account creation test - no first name
2.	//Test 002c -> invalid user account creation test - no last name
3.	//Test 002d -> invalid user account creation test - no email address
4.	//Test 002e -> invalid user account creation test - no password

//too short singular input tests

1.	//Test 002f -> invalid user account creation test - too short first name (1 char)
2.	//Test 002g -> invalid user account creation test - too short last name (1 char)
3.	//Test 002h -> invalid user account creation test - too short email address (1 char - name, domain)
4.	//Test 002i -> invalid user account creation test - too short password (4 chars)

//too long singular input tests

1.	//Test 002j -> invalid user account creation test - too long first name (33 chars)
2.	//Test 002k -> invalid user account creation test - too long last name (33 chars)
3.	//Test 002l -> invalid user account creation test - too long email address (100 chars)
4.	//Test 002m -> invalid user account creation test - too long password (33 chars)

//invalid singular input format tests

1.	//Test 002n -> invalid user account creation test - invalid first name format (special symbols only)
2.	//Test 002o -> invalid user account creation test - invalid last name format (special symbols only)
3.	//Test 002p -> invalid user account creation test - invalid email address format (missing '@')
4.	//Test 002q -> invalid user account creation test - existing email address (used in manual testing beforehand)

//valid user login tests

1.	//Test 003 -> valid user login test
2.	//Test 003a -> valid user login test (female)

//invalid user login tests

//no singular input

1.	//Test 003b -> invalid user login test - no login email address
2.	//Test 003c -> invalid user login test - no login password

//invalid singular input

1.	//Test 003d -> invalid user login test - invalid login email address
2.	//Test 003e -> invalid user login test - invalid login password

//valid user logout tests

1.	//Test 004 -> valid user logout test
2.	//Test 004a -> valid user logout test (female)

//valid 'My Account' user information update tests

1.	//Test 005 -> valid user first name update test
2.	//Test 005a -> valid user last name update test
3.	//Test 005b -> valid user email update test
4.	//Test 005c -> valid user password update test

//invalid 'My Account' user information update tests

//no singular input

1.	//Test 005d -> invalid user first name update test - no first name
2.	//Test 005e -> invalid user last name update test - no last name
3.	//Test 005f -> invalid user email update test - no email address
4.	//Test 005g -> invalid user password update test - no new password confirmation

//too short singular input

1.	//Test 005h -> invalid user first name update test - too short first name (1 char)
2.	//Test 005i -> invalid user last name update test - too short last name (1 char)
3.	//Test 005j -> invalid user email update test - too short email (1 char - name,domain)
4.	//Test 005k -> invalid user last name update test - too short new password / confirm password (4 chars)

//too long singular input

1.	//Test 005l -> invalid user first name update test - too long first name (33 chars)
2.	//Test 005m -> invalid user last name update test - too long last name (33 chars)
3.	//Test 005n -> invalid user email update test - too long email (100 chars)
4.	//Test 005o -> invalid user last name update test - too long new password / confirm password (33 chars)

//invalid singular input (by format)

1.	//Test 005p -> invalid user first name update test - invalid first name format (special symbols only)
2.	//Test 005q -> invalid user last name update test - invalid last name format (special symbols only)
3.	//Test 005r -> invalid user email update test - invalid email format (missing '@')
4.	//Test 005s -> invalid user email update test - existing email (used beforehand in manual testing)

//valid user account addition tests

1.	//Test 006 -> valid user address addition test
2.	//Test 006a -> valid user two addresses addition test
3.	//Test 006b -> valid user address addition and update test
4.	//Test 006c -> valid user address addition and removal test

//invalid user address addition tests

//no singular input

1.	//Test 006d -> invalid user address addition test - no user address
2.	//Test 006e -> invalid user address addition test - no user city
3.	//Test 006f -> invalid user address addition test - no user state
4.	//Test 006g -> invalid user address addition test - no user postal code
5.	//Test 006h -> invalid user address addition test - no user home phone
6.	//Test 006i -> invalid user address addition test - no user address title

//too short singular input

1.	//Test 006j -> invalid user address addition test - too short user address (4 chars)
2.	//Test 006k -> invalid user address addition test - too short user city (1 char)
3.	//Test 006l -> invalid user address addition test - too short user postal code (4 digits)
4.	//Test 006m -> invalid user address addition test - too short user home phone (3 digits)

//too long singular input

1.	//Test 006n -> invalid user address addition test - too long user address (100 chars)
2.	//Test 006o -> invalid user address addition test - too long user city (100 chars)
3.	//Test 006p -> invalid user address addition test - too long user postal code (6 digits)
4.	//Test 006q -> invalid user address addition test - too long user home phone (33 digits)
5.	//Test 006r -> invalid user address addition test - too long user mobile phone (33 digits) (additional test)
6.	//Test 006s -> invalid user address addition test - too long user address title (33 chars)

//invalid singular input (by format)

1.	//Test 006t -> invalid user address addition test - invalid user address format (special symbols only)
2.	//Test 006u -> invalid user address addition test - invalid user city format (special symbols only)
3.	//Test 006v -> invalid user address addition test - invalid user postal code format (special symbols only)
4.	//Test 006w -> invalid user address addition test - invalid user home phone format (special symbols only)
5.	//Test 006x -> invalid user address addition test - invalid user address title format (special symbols only)

//valid user navigation to 'Women' category page tests

1.	//Test 007 -> navigate guest to 'Women' product category page test (as a guest)
2.	//Test 007a -> navigate registered user to 'Women' product category page test (as a registered user)


//single category page dashboard product display view tests

1.	//Test 007b -> product sort by lowest price first test (single category product dashboard page) (as a guest)
2.	//Test 007c -> product sort by lowest price first test (single category product dashboard page) (as a registered user)
3.	//Test 007d -> product sort by highest price first test (single category product dashboard page) (as a guest)
4.	//Test 007e -> product sort by highest price first test (single category product dashboard page) (as a registered user)
5.	//Test 007f -> product sort by product name (A - Z) test (single category product dashboard page) (as a guest)
6.	/Test 007g -> product sort by product name (A - Z) first test (single category product dashboard page) (as a registered user)
7.	//Test 007h -> product sort by product name (Z - A) test (single category product dashboard page) (as a guest)
8.	//Test 007i -> product sort by product name (Z - A) first test (single category product dashboard page) (as a registered user)
9.	//Test 007j -> product sort by 'In Stock' option test (single category product dashboard page) (as a guest)
10.	//Test 007k -> product sort by 'In Stock' option test (single category product dashboard page) (as a registered user)
11.	//Test 007l -> product sort by 'Lowest Reference' option test (single category product dashboard page) (as a guest)
12.	//Test 007m -> product sort by 'Lowest Reference' option test (single category product dashboard page) (as a registered user)
13.	//Test 007n -> product sort by 'Highest Reference' option test (single category product dashboard page) (as a guest)
14.	//Test 007o -> product sort by 'Highest Reference' option test (single category product dashboard page) (as a registered user)

//add single 'Blouse' to cart tests (products don't get added sometimes to shopping cart, therefore further tests are postponed until the issue gets fixed)

1.	//Test 007p -> add single 'Blouse' to cart test (single category product dashboard page) (as a guest)
2.	//Test 007q -> add single 'Blouse' to cart test (single category product dashboard page) (as a registered user)


//add products to compare list tests

1.	//Test 008 -> add 'Blouse' and 'Printed Chiffon Dress' products to compare list test (as a guest)
2.	//Test 008a -> add 'Blouse' and 'Printed Chiffon Dress' products to compare list test (as a registered user)
3.	//Test 008b -> remove 'Blouse' product from compare list test (as a guest)
4.	//Test 008c -> remove 'Blouse' product from compare list test (as a registered user)

//add product from comparison page to shopping cart page tests (products don't get added sometimes to shopping cart, therefore further tests are postponed until the issue gets fixed)

1.	//Test 008d -> add 'Blouse' product from compare list to shopping cart test (as a guest)
2.	//Test 008e -> add 'Blouse' product from compare list to shopping cart test (as a registered user)
