package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MiniCartTest extends BaseTest {

    @Test
    @Tag("positive")
    @Tag("mini-cart")
    @DisplayName("MVP-153: Can add an item to cart and remove it from mini cart")
    public void canAddAndRemoveItemFromMiniCart() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.productListingPage().clickOnProductByName("Gucci");
        Assertions.assertEquals("Gucci", app.productDetailsPage().getPageTitle());
        app.productDetailsPage().clickAddToCartButton();
        Assertions.assertEquals("Your Cart", app.components().miniCart().getMiniCartTitle());
        app.components().miniCart().removeItem();
        app.components().miniCart().checkOK();
        app.components().miniCart().closeMiniCart();
        Assertions.assertEquals("0", app.components().miniCart().getCounterNumber());
    }

    //от тук нататък следва да ги напиша утре
    @Test
    @Tag("positive")
    @Tag("mini-cart")
    @DisplayName("MVP-153: Can go to checkout page from View bag button and then go back to continue shopping")
    public void canAddProductToCartGoToCheckoutPageAndContinueShopping() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.productListingPage().clickOnProductByName("Gucci");
        Assertions.assertEquals("Gucci", app.productDetailsPage().getPageTitle());
        app.productDetailsPage().clickAddToCartButton();
        Assertions.assertEquals("Your Cart", app.components().miniCart().getMiniCartTitle());
        app.components().miniCart().viewBag();
        Assertions.assertEquals("Shopping Cart", app.basketPage().getPageTitle());
        app.basketPage().clickContinueShoppingButton();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }
//    @Test
//    @Tag("positive")
//    @Tag("mini-cart")
//    @DisplayName("MVP-153: Can add an item to cart and remove it from mini cart")
//    public void canAddAndRemoveItemFromMiniCart() {
//        app.homePage().gotoHomePage();
//        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
//        app.productListingPage().clickOnProductByName("Gucci");
//        Assertions.assertEquals("Gucci", app.productDetailsPage().getPageTitle());
//        app.productDetailsPage().clickAddToCartButton();
//        Assertions.assertEquals("Your Cart", app.components().miniCart().getMiniCartTitle());
//        app.components().miniCart().removeItem();
//        app.components().miniCart().checkOK();
//        app.components().miniCart().closeMiniCart();
//        Assertions.assertEquals("0", app.components().miniCart().getCounterNumber());
//    }
}