package ui;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DashboardPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.loginPage().login();
    }

    @Test
    @Tag("positive")
    @Tag("dashboard")
    @DisplayName("DD-X: Can navigate to dashboard page")
    public void canNavigateToDashboardPage(){
        app.dashboardPage().gotoPage();

    }

}
