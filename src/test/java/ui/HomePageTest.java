package ui;

import core.BaseTest;
import enums.Currency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    @Test
    @Tag("positive")
    @Tag("homepage")
    @DisplayName("MVP-06: Can login with valid username/password")
    public void canChangeCurrency() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.homePage().changeCurrency(Currency.EU);
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
    }

    @Test
    @Tag("positive")
    @Tag("homepage")
    @DisplayName("DD-06: Can switch to different currency")
    public void canSwitchToDifferentCurrency() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.homePage().changeCurrency(Currency.EU);
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
    }

    @Test
    @Tag("positive")
    @Tag("homepage")
    @DisplayName("MVP-X: Can search for existing product")
    public void canSearchForExistingProduct() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.homePage().searchProduct("Bulgari");
        Assertions.assertEquals("Search results for: 'Bulgari'", app.myAccountPage().getPageTitle());
    }


}
