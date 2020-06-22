package ui.UserPagesTests;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.DataGenerator;

public class CartPageTest extends BaseTest {

    @Test
    @Tag("Cart")
    @DisplayName("MVP-41: Can update product quantity at the cart page")
    public void canUpdateProductQuantityAtTheCartPage() {
        app.productListingPage().gotoProductListingsPage();
        Assertions.assertEquals("Shop", app.productListingPage().getPageTitle());
        app.productListingPage().clickFirstProduct();
        app.productDetailsPage().clickAddToCartButton();
        app.components().miniCart().viewBag();
        app.cartPage().selectQuantity("3");
        Assertions.assertEquals(app.cartPage().calculateTotalPrice().toString(), app.cartPage().getProductTotalPrice());
    }

    @Test
    @Tag("Cart")
    @DisplayName("MVP-42: Cant increase product quantity in the cart above the predefined limits")
    public void cantIncreaseProductQuantityInTheCartAboveThePredefinedLimits() {
        app.productListingPage().gotoProductListingsPage();
        Assertions.assertEquals("Shop", app.productListingPage().getPageTitle());
        app.productListingPage().clickFirstProduct();
        app.productDetailsPage().clickAddToCartButton();
        app.components().miniCart().viewBag();
        app.cartPage().selectQuantity("10");
        Assertions.assertEquals("1", app.cartPage().getSelectedQuantity());
    }


//    @Test
//    @Tag("Cart")
//    @DisplayName("MVP-65: Can apply gift card ")

    @Test
    @Tag("Cart")
    @DisplayName("MVP-66: Can move product from the shopping cart to wish-list")
    public void canMoveProductFromCartToWishList() {
        app.loginPage().login();
        Assertions.assertEquals("My Account", app.myAccountPage().getPageTitle());
        app.productListingPage().gotoProductListingsPage();
        Assertions.assertEquals("Shop", app.productListingPage().getPageTitle());
        app.productListingPage().clickFirstProduct();
        app.productDetailsPage().clickAddToCartButton();
        app.components().miniCart().viewBag();
        Assertions.assertEquals("Shopping Cart", app.cartPage().getPageTitle());
        app.cartPage().clickMoveToWishlistButton();
        Assertions.assertEquals("You have no items in your shopping cart.\n" +
                "Click here to continue shopping.", app.cartPage().getEmptyCartMessageText()); }
}


