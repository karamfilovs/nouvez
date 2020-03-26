package ui;

import core.BaseTest;
import org.junit.Before;
import org.junit.jupiter.api.*;


public class WishListPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().login();
    }

    @Test
    @Tag("positive")
    @Tag("wish-list")
    @DisplayName("MVP-156: Can change the quantity of displayed items in the wish list")
    public void changeDisplayedItems() {
        app.myAccountNavigation().clickMyWishList();
        Assertions.assertEquals("My Wish List", app.wishListPage().getPageTitle());
        app.wishListPage().selectQuantityOfShownItems("20");
        Assertions.assertEquals("20", app.wishListPage().checkLimiterQuantity());
    }
    
}
