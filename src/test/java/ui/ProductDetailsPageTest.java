package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ProductDetailsPageTest extends BaseTest {

    @Test
    @Tag("pdp")
    @DisplayName("MVP-9: Can navigate to PDP page")
    public void canNavigateToPDPPage() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.components().mainMenu().hoverOnShop();
        app.components().subCategoryMenu().clickOnEarrings();
        Assertions.assertEquals("Earrings - Shop by Category - Shop", app.components().subCategoryMenu().getPageTitle());
        app.productListingPage().clickOnProductByName("Bulgari");
        Assertions.assertEquals("Bulgari", app.components().subCategoryMenu().getPageTitle());
        app.productDetailsPage().hoverOnAddToCartButton();
        app.productDetailsPage().clickAddToCartButton();
    }

//    @Test
//    @Tag("pdp")
//    @DisplayName("MVP-20: Can add product to wish-list")

//    @Test
//    @Tag("pdp")
//    @DisplayName("MVP-47: Can share product from pdp")

//    @Test
//    @Tag("pdp")
//    @DisplayName("MVP-46: Can increase product quantity by clicking Add to Cart button multiple times")
}
