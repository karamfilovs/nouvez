package ui.UserPagesTests;

import core.BaseTest;
import enums.Country;
import enums.MyAccountNavMenu;
import org.junit.jupiter.api.*;
import utils.DataGenerator;

import javax.xml.crypto.Data;

public class AddressBookPageTest extends BaseTest {
    String text = DataGenerator.generateRandomString(10);
    String zip = DataGenerator.generateRandomString(5);
    String phoneNumber = DataGenerator.generateRandomNumber(10);

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
        app.addressBookPage().clickChangeDefaultBillingAddressButton();
        Assertions.assertEquals("Edit Address",app.addressBookPage().getPageTitle());
        app.editAddressPage().enterNewAddress(text,text,zip, Country.UNITED_KINGDOM,phoneNumber);
        Assertions.assertEquals("You saved the address.", app.addressBookPage().getTheTextOfTheMessageAlert());}

    @Test
    @Tag("address-book")
    @DisplayName("MVP-71: Can add multiple addresses to an account")
    public void canChangeTheDefaultShippingAddress() {
        app.addressBookPage().clickChangeDefaultShippingAddressButton();
        Assertions.assertEquals("Edit Address",app.addressBookPage().getPageTitle());
        app.editAddressPage().enterNewAddress(text,text,zip, Country.UNITED_KINGDOM,phoneNumber);
        Assertions.assertEquals("You saved the address.", app.addressBookPage().getTheTextOfTheMessageAlert()); }

    @Test
    @Tag("address-book")
    @DisplayName("MVP-71: Can add new address")
    public void addNewAddress() {
        app.addressBookPage().clickAddNewAddressButton();
        Assertions.assertEquals("Add New Address",app.addressBookPage().getPageTitle());
        app.editAddressPage().enterNewAddress(text,text,zip, Country.UNITED_KINGDOM, phoneNumber);
        Assertions.assertEquals("You saved the address.", app.addressBookPage().getTheTextOfTheMessageAlert()); }

    @Test
    @Tag("address-book")
    @DisplayName("MVP-72: Can delete the first address in the address book")
    public void deleteFirstAddress() {
        app.addressBookPage().deleteFirstAddress();
        Assertions.assertEquals("You deleted the address.", app.addressBookPage().getTheTextOfTheMessageAlert()); }
}
