package ui;

import core.BaseTest;
import org.junit.jupiter.api.*;

public class ProductListingPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.loginPage().login();
    }

    @Test
    @Tag("positive")
    @Tag("plp")
    @DisplayName("DD-X: Can navigate to Product Listing page")
    public void canNavigateToProductListingPage(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.productListingPage().clickOnProductByName("Bulgari");
        Assertions.assertEquals("Bulgari", app.myAccountPage().getPageTitle());
    }

}
