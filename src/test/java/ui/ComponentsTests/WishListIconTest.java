package ui.ComponentsTests;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class WishListIconTest extends BaseTest {

    @Test
    @Tag("wish-list")
    @DisplayName("MVP-180: Can navigate to login page after clicking the wish-list icon")
    public void canNavigateToLoginPageClickingTheWishListIcon() {
    app.homePage().gotoHomePage();
    Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    app.homePage().clickWishListIcon();
    Assertions.assertEquals("Customer Login", app.homePage().getPageTitle()); }

    @Test
    @Tag("wish-list")
    @DisplayName("MVP-180: Can navigate to wish-list page after clicking the wish-list icon")
    public void canNavigateToWishListPageClickingTheWishListIcon() {
    app.loginPage().login();
    Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    app.homePage().clickWishListIcon();
    Assertions.assertEquals("My Wish List", app.homePage().getPageTitle()); }
}
