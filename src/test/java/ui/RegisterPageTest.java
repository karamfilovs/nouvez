package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RegisterPageTest extends BaseTest {

    @Test
    @Tag("register")
    @DisplayName("MVP-X: Can navigate to Create New Customer page")
    public void canNavigateToCreateNewCustomerPage(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.components().myAccountMenu().clickCreateAnAccount();
        Assertions.assertEquals("Create New Customer Account", app.myAccountPage().getPageTitle());
    }

    @Test
    @Tag("register")
    @DisplayName("MVP-X: Cant register with already used email address")
    public void cantRegisterWithInvalidCaptcha(){
        app.registerPage().gotoPage();
        Assertions.assertEquals("Create New Customer Account", app.myAccountPage().getPageTitle());
        app.registerPage().enterFirstName("Alex");
        app.registerPage().enterLastName("Karamfilov");
        app.registerPage().enterEmail("aleksandar.karamfilov@pragmatic.bg");
        app.registerPage().enterPassword("Test22222");
        app.registerPage().enterConfirmPassword("Test22222");
        app.registerPage().clickCreateAnAccountButton();
        Assertions.assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", app.registerPage().topErrorMessage());
    }


    @Test
    @Tag("register")
    @DisplayName("MVP-X: Cant register with password miss match")
    public void cantRegisterWithPasswordMissMatch(){
        app.registerPage().gotoPage();
        Assertions.assertEquals("Create New Customer Account", app.myAccountPage().getPageTitle());
        app.registerPage().enterFirstName("Alex");
        app.registerPage().enterLastName("Karamfilov");
        app.registerPage().enterEmail("aleksandar.karamfilov@pragmatic.bg");
        app.registerPage().enterPassword("Test22222");
        app.registerPage().enterConfirmPassword("Test1111");
        app.registerPage().clickCreateAnAccountButton();
        Assertions.assertEquals("Please enter the same value again.", app.registerPage().passwordMissMatchErrorMessage());
    }
//    @Test
//    @Tag("register")
//    @DisplayName("MVP-2: Cant register new user")

//    @Test
//    @Tag("register")
//    @DisplayName("MVP-3: Can register user with duplicate email")

//    @Test
//    @Tag("register")
//    @DisplayName("MVP-4: Cant register user with invalid email")

//    @Test
//    @Tag("register")
//    @DisplayName("MVP-51: Can register new sellers account")

//    @Test
//    @Tag("register")
//    @DisplayName("MVP-52: Cant register new account with weak password (less than 8 symbols)")

}
