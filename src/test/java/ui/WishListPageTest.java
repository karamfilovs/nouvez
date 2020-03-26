package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class WishListPageTest extends BaseTest {

    @Test
    @Tag("positive")
    @Tag("wish-list")
    @DisplayName("MVP-156: Can change the quantity of displayed items in the wish list")
    public void changeDisplayedItems() {
        app.homePage().gotoHomePage();
        app.components().myAccountMenu().clickOnMyAccount();
        app.components().myAccountMenu().clickOnMyWishList();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().enterUsername("alex@pragmatic.bg");
        app.loginPage().enterPassword("Test2019$");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("My Wish List", app.wishListPage().getPageTitle());
        app.wishListPage().selectQuantityOfShownItems("20");
        Assertions.assertEquals("20", app.wishListPage().checkLimiterQuantity());


    }
}
