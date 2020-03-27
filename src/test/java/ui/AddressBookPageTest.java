package ui;

import core.BaseTest;
import enums.MyAccountNavMenu;
import org.junit.jupiter.api.*;

public class AddressBookPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().login();
    }

    @AfterEach
    public void afterEach(){
        app.components().myAccountMenu().signOut();
    }

    @Test
    @Tag("address-book")
    @DisplayName("MVP-X: Can navigate to Address Book page")
    public void canNavigateToAddressBookPage() {
        app.myAccountPage().navigateToMenu(MyAccountNavMenu.ADDRESS_BOOK);
        Assertions.assertEquals("Address Book", app.addressBookPage().getPageTitle());
    }
}
