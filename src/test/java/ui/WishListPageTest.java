package ui;

import core.BaseTest;
import enums.MyAccountNavMenu;
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
        app.homePage().clickWishListIcon();
        Assertions.assertEquals("My Wish List", app.myAccountPage().getPageTitle());
        app.myAccountPage().navigateToMenu(MyAccountNavMenu.SIGN_OUT);
        app.homePage().clickWishListIcon();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());

    }

    @Test
    @Tag("wish-list")
    @DisplayName("MVP-56: Can share wish-list - single email recipient")
    public void canShareMyWishListWithSingleEmailRecipients() {
        app.homePage().clickWishListIcon();
        Assertions.assertEquals("My Wish List", app.myAccountPage().getPageTitle());
        app.wishListPage().clickShareWishList();
        Assertions.assertEquals("Wish List Sharing", app.wishListSharingPage().getPageTitle());
        app.wishListSharingPage().clickBackButton();
        Assertions.assertEquals("My Wish List", app.myAccountPage().getPageTitle());
        app.wishListPage().clickShareWishList();
        Assertions.assertEquals("Wish List Sharing", app.wishListSharingPage().getPageTitle());
        app.wishListSharingPage().enterEmails("alex@pragmatic.bg");
        app.wishListSharingPage().enterMessage("Hey Alex");
        app.wishListSharingPage().clickShareWishListButton();
        Assertions.assertEquals("Your wish list has been shared.", app.wishListSharingPage().getSuccessMessage());
    }

    @Test
    @Tag("wish-list")
    @DisplayName("MVP-57: Can share wish-list - multiple email recipient")
    public void canShareWishListMultipleEmailRecipients() {
        app.homePage().clickWishListIcon();
        Assertions.assertEquals("My Wish List", app.myAccountPage().getPageTitle());
        app.wishListPage().clickShareWishList();
        Assertions.assertEquals("Wish List Sharing", app.wishListSharingPage().getPageTitle());
        app.wishListSharingPage().clickBackButton();
        Assertions.assertEquals("My Wish List", app.myAccountPage().getPageTitle());
        app.wishListPage().clickShareWishList();
        Assertions.assertEquals("Wish List Sharing", app.wishListSharingPage().getPageTitle());
        app.wishListSharingPage().enterEmails("alex@pragmatic.bg,yavor@pragmatic.bg");
        app.wishListSharingPage().enterMessage("Hey People");
        app.wishListSharingPage().clickShareWishListButton();
        Assertions.assertEquals("Your wish list has been shared.", app.wishListSharingPage().getSuccessMessage());
    }

    @Test
    @Tag("wish-list")
    @DisplayName("MVP-184: Can add an item from wish-list to cart")
    public void canAddAnItemFromWishListToCart() {
        app.homePage().clickWishListIcon();
        Assertions.assertEquals("My Wish List", app.myAccountPage().getPageTitle());
        app.wishListPage().addToCart();
    }

    @Test
    @Tag("wish-list")
    @DisplayName("MVP-60: Can add all items from wish-list to cart")
    public void canAddAllItemsFromWishListToCart() {
        app.homePage().clickWishListIcon();
        Assertions.assertEquals("My Wish List", app.myAccountPage().getPageTitle());
        app.wishListPage().addAllItemsToCart();
    }

    @Test
    @Tag("wish-list")
    @DisplayName("MVP-59: Cant share wish-list to an invalid email")
    public void cantShareWithListToAnInvalidEmail() {
        app.homePage().clickWishListIcon();
        Assertions.assertEquals("My Wish List", app.myAccountPage().getPageTitle());
        app.wishListPage().clickShareWishList();
        Assertions.assertEquals("Wish List Sharing", app.wishListSharingPage().getPageTitle());
        app.wishListSharingPage().enterEmails("alex@pragmatic");
        app.wishListSharingPage().enterMessage("Hey Alex");
        app.wishListSharingPage().clickShareWishListButton();
        Assertions.assertEquals("Please enter valid email addresses, separated by commas. For example, johndoe@domain.com, johnsmith@domain.com.", app.wishListSharingPage().getEmailAddressError());
    }


}
