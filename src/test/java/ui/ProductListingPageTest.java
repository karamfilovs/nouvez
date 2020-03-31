package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ProductListingPageTest extends BaseTest {



    @Test
    @Tag("plp")
    @DisplayName("MVP-26: Can navigate to Product Listing page")
    public void canNavigateToProductListingPage(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.productListingPage().clickOnProductByName("Bulgari");
        Assertions.assertEquals("Bulgari", app.productListingPage().getPageTitle());
    }
//    @Test
//    @Tag("pdp")
//    @DisplayName("MVP-12: Can filter products by existing category")

//    @Test
//    @Tag("pdp")
//    @DisplayName("MVP-13: Can filter items by price - single range")

//    @Test
//    @Tag("pdp")
//    @DisplayName("MVP-14: Can filter items by price - multi range")

//    @Test
//    @Tag("pdp")
//    @DisplayName("MVP-15: Can remove price filters ")

//    @Test
//    @Tag("pdp")
//    @DisplayName("MVP-17: Can filter items by stone type ")
}
