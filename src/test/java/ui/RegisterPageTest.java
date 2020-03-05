package ui;

import core.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RegisterPageTest extends BaseTest {

    @Test
    @Tag("positive")
    @Tag("register")
    @DisplayName("DD-01: Can navigate to Sign-up page")
    public void canNavigateToRegisterPage(){
        app.loginPage().gotoLoginPage();
        app.loginPage().clickRegistrationLink();
    }
}
