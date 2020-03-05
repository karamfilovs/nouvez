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
    @Tag("changeCurrency")
    @DisplayName("DD-06: Can login with valid username/password")
    public void canChangeCurrency() {
        app.homePage().gotoHomePage();
        app.homePage().changeCurrency(Currency.EU);
        Assertions.assertEquals("My Account", app.myAccountPage().getPageTitle());
    }

    @Test
    @Tag("positive")
    @Tag("changeCurrency")
    @DisplayName("DD-06: Can switch to different currency")
    public void canSwitchToDifferentCurrency() {
        app.homePage().gotoHomePage().changeCurrency(Currency.GBP);
        Assertions.assertEquals("My Account", app.myAccountPage().getPageTitle());
    }

}
