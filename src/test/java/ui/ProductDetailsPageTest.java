package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ProductDetailsPageTest extends BaseTest {

    @Test
    @Tag("positive")
    @Tag("register")
    @DisplayName("DD-01: Can navigate to PDP page")
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
}
