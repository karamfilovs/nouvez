package ui.ProductPagesTests;

import core.BaseTest;
import org.junit.jupiter.api.*;

public class ProductListingPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.components().shopSubCategoryMenu().clickOnShopAll(); }



    @Test
    @Tag("pdp")
    @DisplayName("MVP-17: Can filter items by stone type ")
    public void canFilterItemsByStoneType(){

    }
}
