package ui;

import core.BaseTest;
import org.junit.jupiter.api.*;


public class WishListPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().login();
    }

    @Test
    @Tag("wish-list")
    @DisplayName("MVP-180: Can change the quantity of displayed items in the wish list")
    public void changeDisplayedItems() {
        app.myAccountNavigation().clickMyWishList();
        Assertions.assertEquals("My Wish List", app.wishListPage().getPageTitle());
        app.wishListPage().selectQuantityOfShownItems("20");
        Assertions.assertEquals("20", app.wishListPage().checkLimiterQuantity());
    }
    @Test
    @Tag("wish-list")
    @DisplayName("MVP-181: Can navigate to customer login page clicking on the wish list icon")
    public void canGoToWishListViaWishListIcon() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.homePage().clickWishListIcon();
        Assertions.assertEquals("Customer Login", app.myAccountPage().getPageTitle());
        app.loginPage().enterUsername("alex@pragmatic.bg");
        app.loginPage().enterPassword("Test2019$");
        app.loginPage().clickLoginButton();
        Assertions.assertEquals("My Wish List", app.wishListPage().getPageTitle());
    }
    @Test
    @Tag("wish-list")
    @DisplayName("MVP-56: Can share wish-list - single email recipient")
    public void canShareMyWishListWithSingleEmailRecipient(){

    }

    @Test
    @Tag("wish-list")
    @DisplayName("MVP-57: Can share wish-list - multiple email recipient")
    public void canShareMyWishListWithMultipleEmailRecipients(){

    }

//    @Test
//    @Tag("wish-list")
//    @DisplayName("MVP-57: Can share wish-list - multiple email recipient")

//    @Test
//    @Tag("wish-list")
//    @DisplayName("MVP-184: Can add an item from wish-list to cart")

//    @Test
//    @Tag("wish-list")
//    @DisplayName("MVP-60: Can add all items from wish-list to cart")

//    @Test
//    @Tag("wish-list")
//    @DisplayName("MVP-58: Cant share wish-list with message exceeding 255 symbols")

//    @Test
//    @Tag("wish-list")
//    @DisplayName("MVP-59: Cant share wish-list to an invalid email")

}
