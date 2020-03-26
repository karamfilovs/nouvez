package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MyAccountMenuTest extends BaseTest {

    @Test
    @Tag("my-account-menu")
    @DisplayName("MVP-154: Can access customer login page clicking my account button from the drop down menu of my account component")
    public void goToCustomerLoginViaMyAccountLink(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.components().myAccountMenu().clickMyAccountDropDown();
        app.components().myAccountMenu().clickOnMyAccount();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());

    }

    @Test
    @Tag("my-account-menu")
    @DisplayName("MVP-154: Can access customer login page clicking my wish list button from the drop down menu of my account component")
    public void goToCustomerLoginViaMyWishListLink(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.components().myAccountMenu().clickMyAccountDropDown();
        app.components().myAccountMenu().clickOnMyWishList();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());

    }

    @Test
    @Tag("my-account-menu")
    @DisplayName("MVP-154: Can access customer login page clicking sign in button from the drop down menu of my account component")
    public void goToCustomerLoginViaSignInLink(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.components().myAccountMenu().clickMyAccountDropDown();
        app.components().myAccountMenu().signIn();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());

    }
    @Test
    @Tag("my-account-menu")
    @DisplayName("MVP-154: Can access create new customer account page clicking create an account button from the drop down menu of my account component")
    public void goToCreateNewCustomerAccountViaCreateAnAccountLink(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.components().myAccountMenu().clickMyAccountDropDown();
        app.components().myAccountMenu().clickCreateAnAccount();
        Assertions.assertEquals("Create New Customer Account", app.loginPage().getPageTitle());

    }
}
