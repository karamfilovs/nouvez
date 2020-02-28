package ui;

import core.BaseTest;
import enums.Checked;
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
    public void canChangeCurrency(){
        app.homePage().gotoHomePage();
        app.homePage().clickCurrencyIcon()
                .getPageTitle();
        Assertions.assertEquals("My Account", app.myAccountPage().getPageTitle());
    }

    @Test
    @Tag("positive")
    @Tag("changeCurrency")
    @DisplayName("DD-06: Can login with valid username/password")
    public void canChangeCurrenc111y(){

        app.homePage().gotoHomePage()
                .setCurrency(Currency.EU);
        app.homePage().clickCurrencyIcon()
                .getPageTitle();
        Assertions.assertEquals("My Account", app.myAccountPage().getPageTitle());
    }

}
