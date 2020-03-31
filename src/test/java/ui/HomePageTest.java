package ui;

import core.BaseTest;
import enums.Currency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    @Test
    @Tag("homepage")
    @DisplayName("MVP-07: Can change currency")
    public void canChangeCurrency() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.homePage().changeCurrency(Currency.EU);
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
    }

//    @Test
//    @Tag("homepage")
//    @DisplayName("MVP-163: Can navigate between home page and explore page")

//    @Test
//    @Tag("homepage")
//    @DisplayName("MVP-164: Can navigate between home page and new in page ")

//    @Test
//    @Tag("homepage")
//    @DisplayName("MVP-165: Can navigate between home page and brands page ")




//    @Test
//    @Tag("homepage")
//    @DisplayName("MVP-166: Can navigate between home page and the style edit page ")

//    @Test
//    @Tag("homepage")
//    @DisplayName("MVP-169: Can navigate between home page and the personal stories page ")

//    @Test
//    @Tag("homepage")
//    @DisplayName("MVP-168: Can navigate between home page and the minimal collection page ")

//    @Test
//    @Tag("homepage")
//    @DisplayName("MVP-169: Can navigate between home page and the personal stories page ")


}
