package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ResetPasswordPageTest extends BaseTest {

    @Test
    @Tag("reset-password")
    @DisplayName("MVP-5: Can reset password with valid email")
    public void canResetPasswordWithValidEmail() {
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.myAccountPage().getPageTitle());
        app.loginPage().clickResetPasswordLink();
        app.resetPasswordPage().enterEmail("alex@pragmatic.bg");
        app.resetPasswordPage().clickResetPasswordButton();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        Assertions.assertEquals("If there is an account associated with alex@pragmatic.bg you will receive an email with a link to reset your password.", app.loginPage().getSuccessMessage());
    }

    @Test
    @Tag("reset-password")
    @DisplayName("MVP-158: Cant reset password with blank email")
    public void cantResetPasswordWithBlankEmail() {
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.myAccountPage().getPageTitle());
        app.loginPage().clickResetPasswordLink();
        app.resetPasswordPage().clickResetPasswordButton();
        Assertions.assertEquals("This is a required field.", app.resetPasswordPage().getRequiredEmailMessage());
    }

    @Test
    @Tag("reset-password")
    @DisplayName("MVP-159: Cant reset password with invalid email")
    public void cantResetPasswordWithIncorrectEmail() {
        app.loginPage().gotoLoginPage();
        app.loginPage().clickResetPasswordLink();
        app.resetPasswordPage().enterEmail("thomasmail");
        app.resetPasswordPage().clickResetPasswordButton();
        Assertions.assertEquals("Please enter a valid email address (Ex: johndoe@domain.com).", app.resetPasswordPage().getIncorrectEmailMessage());
    }

    @Test
    @Tag("reset-password")
    @DisplayName("MVP-160: Can reset password with valid upper case email")
    public void cantResetPasswordWithValidUppercaseEmail() {
        app.loginPage().gotoLoginPage();
        app.loginPage().clickResetPasswordLink();
        app.resetPasswordPage().enterEmail("alex@pragmtic.bg".toUpperCase());
        app.resetPasswordPage().clickResetPasswordButton();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
    }

    @Test
    @Tag("reset-password")
    @DisplayName("MVP-161: Can navigate from login page to reset password page and vice-versa")
    public void canNavigateFromLoginPageToResetPasswordPage() {
        app.loginPage().gotoLoginPage();
        app.loginPage().clickResetPasswordLink();
        Assertions.assertEquals("Forgot Your Password?", app.resetPasswordPage().getHeaderText());
        app.resetPasswordPage().clickGoBackButton();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
    }
//    @Test
//    @Tag("reset-password")
//    @DisplayName("MVP-79: Cant reset password with not registered email")

}


