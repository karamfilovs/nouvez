package ui;

import core.BaseTest;
import org.junit.jupiter.api.*;

public class BrandsPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.loginPage().login();
    }

    @Test
    @Tag("positive")
    @Tag("brands")
    @DisplayName("DD-X: Can navigate to brands page")
    public void canNavigateToBrandsPage(){
        app.myAccountPage().gotoPage();

    }

}
