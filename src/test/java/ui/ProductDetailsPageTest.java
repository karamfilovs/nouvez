package ui;

import core.BaseTest;
import enums.Currency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ProductDetailsPageTest extends BaseTest {

    @Test
    @Tag("positive")
    @Tag("register")
    @DisplayName("DD-01: Can navigate to PDP page")
    public void canNavigateToPDPPage(){
        app.homePage().gotoHomePage();
        app.components().mainMenu().clickOnShop();
        app.components().subCategoryMenu().clickOnEarrings();
        app.productListingPage().clickOnProductByName("Bulgari");
        app.productDetailsPage().changeCurrency(Currency.EU);
        Assertions.assertTrue(app.productDetailsPage().getProductPrice().contains("€"), "Product price is not with the correct currency");
    }
}
