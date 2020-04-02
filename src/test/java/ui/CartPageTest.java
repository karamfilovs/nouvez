package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CartPageTest extends BaseTest {

    @Test
    @Tag("Cart")
    @DisplayName("MVP-41: Can update product quantity at the cart page")
    public void  canUpdateProductQuantityAtTheCartPage(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.productDetailsPage().navigateToSpecificProduct("/58254811.html");
        app.productDetailsPage().clickAddToCartButton();
        app.components().miniCart().viewBag();
        app.cartPage().selectQuantity("3");
        Assertions.assertEquals("£2,940.00",app.cartPage().getProductTotalPrice());


    }

    @Test
    @Tag("Cart")
    @DisplayName("MVP-42: Cant increase product quantity in the cart above the predefined limits")
    public void cantIncreaseProductQuantityInTheCartAboveThePredefinedLimits(){

    }

//    @Test
//    @Tag("Cart")
//    @DisplayName("MVP-65: Can apply gift card ")

//    @Test
//    @Tag("Cart")
//    @DisplayName("MVP-66: Can move product from the shopping cart to wish-list")

//    @Test
//    @Tag("Cart")
//    @DisplayName("MVP-49: Can remove all products from the shopping cart")
}
