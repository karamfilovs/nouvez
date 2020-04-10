package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {

    @Test
    @Tag("login")
    @DisplayName("MVP-29: Can login with valid username/password")
    public void canLoginWithValidCredentials(){
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().enterUsername("alex@pragmatic.bg");
        app.loginPage().enterPassword("Test2019$");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("My Account", app.myAccountPage().getPageTitle());
        app.components().myAccountMenu().signOut();
    }

    @Test
    @Tag("login")
    @DisplayName("MVP-28: Can login with valid username/password and sign out")
    public void canLoginWithValidCredentialsAndLogout(){
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().enterUsername("alex@pragmatic.bg");
        app.loginPage().enterPassword("Test2019$");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("My Account", app.myAccountPage().getPageTitle());
        app.components().myAccountMenu().signOut();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());

    }

    @Test
    @Tag("login")
    @DisplayName("MVP-31: Cant login with invalid username")
    public void cantLoginWithInvalidUsername(){
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().enterUsername("alex@pragmatic");
        app.loginPage().enterPassword("Test2019$");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("Please enter a valid email address (Ex: johndoe@domain.com).", app.loginPage().getBadEmailErrorMessage());
    }

    @Test
    @Tag("login")
    @DisplayName("MVP-30: Cant login with blank username field")
    public void cantLoginWithBlankUsername(){
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().enterPassword("pass1234");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("This is a required field.", app.loginPage().getUsernameRequiredMessage());
    }

    @Test
    @Tag("login")
    @DisplayName("MVP-171: Cant login with blank password")
    public void cantLoginWithBlankPassword(){
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().enterUsername("alex@pragmatic.bg");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("This is a required field.", app.loginPage().getPasswordRequiredMessageText());
    }

    @Test
    @Tag("login")
    @DisplayName("MVP-31: Cant login with invalid password")
    public void cantLoginWithInvalidPassword(){
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().enterUsername("alex@pragmatic.bg");
        app.loginPage().enterPassword("test");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.", app.loginPage().getInvalidCombinationErrorMessage());
    }


    @Test
    @Tag("login")
    @DisplayName("MVP-132: Can navigate to Login page from Home page")
    public void canNavigateToLoginPageFromHomePage(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.components().myAccountMenu().clickOnMyAccount();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }
    @Test
    @Tag("login")
    @DisplayName("MVP-80: Can login with valid email (upper case)")
    public void canLoginWithValidUpperCaseEmail(){
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().enterUsername("alex@pragmatic.bg".toUpperCase());
        app.loginPage().enterPassword("Test2019$");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("My Account", app.myAccountPage().getPageTitle());
    }

}
