package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {

    @Test
    @Tag("positive")
    @Tag("login")
    @DisplayName("DD-01: Can login with valid username/password")
    public void canLoginWithValidCredentials(){
        app.loginPage().gotoLoginPage();
        app.loginPage().enterUsername("alex@pragmatic.bg");
        app.loginPage().enterPassword("Test2020$");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("Alex Karamfilov", app.brandsPage().getUserSectionText());
    }

    @Test
    @Tag("negative")
    @DisplayName("DD-02: Cant login with invalid username")
    public void cantLoginWithInvalidUsername(){
        app.loginPage().gotoLoginPage();
        app.loginPage().enterUsername("thomas");
        app.loginPage().enterPassword("pass1234");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("Incorrect email or password", app.loginPage().getBadLoginErrorMessage());
    }

    @Test
    @Tag("negative")
    @DisplayName("DD-03: Cant login with blank username field")
    public void cantLoginWithBlankUsername(){
        app.loginPage().gotoLoginPage();
        app.loginPage().enterPassword("pass1234");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("Username is required", app.loginPage().getUsernameRequiredMessage());
    }

    @Test
    @Tag("negative")
    @DisplayName("DD-04: Cant login with blank password field")
    public void cantLoginWithBlankPassword(){
        app.loginPage().gotoLoginPage();
        app.loginPage().enterUsername("alex@pragmatic.bg");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("Password is required", app.loginPage().getPasswordRequiredMessageText());
    }

    @Test
    @Tag("negative")
    @DisplayName("DD-05: Cant login with invalid password")
    public void cantLoginWithInvalidPassword(){
        app.loginPage().gotoLoginPage();
        app.loginPage().enterUsername("alex@pragmatic.bg");
        app.loginPage().enterPassword("test");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("Incorrect email or password", app.loginPage().getBadLoginErrorMessage());
    }


}
