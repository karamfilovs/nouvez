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
        app.myAccountPage().navigateToMenu(MyAccountNavMenu.ADDRESS_BOOK);
        Assertions.assertEquals("Address Book", app.addressBookPage().getPageTitle());
    }

    @AfterEach
    public void afterEach(){
        app.myAccountPage().navigateToMenu(MyAccountNavMenu.SIGN_OUT);
    }

    @Test
    @Tag("address-book")
    @DisplayName("MVP-71: Can add multiple addresses to an account")
    public void canChangeTheDefaultBillingAddress() {
        app.addressBookPage().clickAddNewAddressButton();
        app.addNewAddressPage().addNewUKAddress();
        app.addNewAddressPage().setDefaultBillingAddressCheckbox();
        app.addNewAddressPage().clickSaveAddressButton();
        Assertions.assertEquals("Yavor Todd\n" +"98 Southern Way\n" +"NORTH ORMSBY, LN11 3YU\n" +
                "United Kingdom\n" +"T: 07944828102",app.addressBookPage().getDefaultBillingAddressText()); }
}
