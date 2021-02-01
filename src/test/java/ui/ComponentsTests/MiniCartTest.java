package ui.ComponentsTests;

import core.BaseTest;
import io.github.artsok.RepeatedIfExceptionsTest;
import org.junit.jupiter.api.*;

public class MiniCartTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.productListingPage().gotoProductListingsPage();
        Assertions.assertEquals("Shop", app.productListingPage().getPageTitle());
        app.productListingPage().clickFirstProduct();
        app.productDetailsPage().clickAddToCartButton();
        Assertions.assertEquals("Your Cart", app.components().miniCart().getMiniCartTitle());
    }

//    @RepeatedIfExceptionsTest(repeats = 1)
//    @Tag("mini-cart")
//    @DisplayName("MVP-48: Can add an item to cart and remove it from mini cart")
//    public void canAddAndRemoveItemFromMiniCart() {
//        app.components().miniCart().removeItem();
//        app.components().miniCart().checkOK();
//        app.components().miniCart().closeMiniCart();
//        Assertions.assertEquals("0", app.components().miniCart().getCounterNumber()); }
//
//    @Test
//    @Tag("mini-cart")
//    @DisplayName("MVP-182:Can navigate to shopping cart page from mini cart")
//    public void canAddProductToCartGoToCheckoutPageAndContinueShopping() {
//        app.components().miniCart().viewBag();
//        Assertions.assertEquals("Shopping Cart", app.cartPage().getPageTitle());
//        app.cartPage().clickContinueShoppingButton();
//        Assertions.assertEquals("Home Page", app.homePage().getPageTitle()); }
//
//    @Test
//    @Tag("mini-cart")
//    @DisplayName("MVP-183: Can navigate to checkout page from mini-cart")
//    public void canNavigateToCheckoutPageFromMiniCart(){
//        app.components().miniCart().clickCheckOut();
//        Assertions.assertEquals("Checkout", app.checkoutPage().getPageTitle()); }

}