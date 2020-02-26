package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ResetPasswordPageTest extends BaseTest {

    @Test
    @Tag("positive")
    @Tag("reset-password")
    @DisplayName("DD-01: Can reset password with valid email")
    public void canResetPasswordWithValidEmail() {
        app.loginPage().gotoLoginPage();
        app.loginPage().ClickResetPasswordLink();
        app.resetPasswordPage().enterEmail("alex@pragmatic.bg");
        app.resetPasswordPage().clickResetPasswordButton();
        Assertions.assertEquals("Login", app.loginPage().getLoginButton());
    }

    @Test
    @Tag("negative")
    @DisplayName("DD-02: Cant reset password with blank email")
    public void cantResetPasswordWithBlankEmail(){
        app.loginPage().gotoLoginPage();
        app.loginPage().ClickResetPasswordLink();
        app.resetPasswordPage().clickResetPasswordButton();
        Assertions.assertEquals("Email is required.", app.resetPasswordPage().getRequiredEmailMessage() );
    }

    @Test
    @Tag("negative")
    @DisplayName("DD-03: Cant reset password with incorrect email")
    public void cantResetPasswordWithIncorrectEmail(){
        app.loginPage().gotoLoginPage();
        app.loginPage().ClickResetPasswordLink();
        app.resetPasswordPage().enterEmail("thomasmail");
        app.resetPasswordPage().clickResetPasswordButton();
        Assertions.assertEquals("The email format is invalid", app.resetPasswordPage().getIncorrectEmailMessage() );
    }

    @Test
    @Tag("negative")
    @DisplayName("DD-04: Cant reset password with valid upper case email")
    public void cantResetPasswordWithValidUppercaseEmail(){
        app.loginPage().gotoLoginPage();
        app.loginPage().ClickResetPasswordLink();
        app.resetPasswordPage().enterEmail("alex@pragmtic.bg");
        app.resetPasswordPage().clickResetPasswordButton();
        Assertions.assertEquals("Reset your password", app.resetPasswordPage().getHeaderText());
    }


}


