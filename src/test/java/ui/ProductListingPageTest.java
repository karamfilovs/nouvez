package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ProductListingPageTest extends BaseTest {



    @Test
    @Tag("plp")
    @DisplayName("DD-X: Can navigate to Product Listing page")
    public void canNavigateToProductListingPage(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.productListingPage().clickOnProductByName("Bulgari");
        Assertions.assertEquals("Bulgari", app.productListingPage().getPageTitle());
    }

}
