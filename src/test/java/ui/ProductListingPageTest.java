package ui;

import core.BaseTest;
import org.junit.jupiter.api.*;

public class ProductListingPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.components().shopSubCategoryMenu().clickOnShopAll(); }

    @Test
    @Tag("plp")
    @DisplayName("MVP-26: Can navigate to Product Listing page")
    public void canNavigateToProductListingPage(){
        app.productListingPage().clickOnProductByName("Bulgari");
        Assertions.assertEquals("Bulgari", app.productListingPage().getPageTitle()); }

    @Test
    @Tag("pdp")
    @DisplayName("MVP-12: Can filter products by existing category")
    public void canFilterProductsByExistingCategory(){
    app.shopByCategoryPage().clickOnFilterByName("Category");
    app.shopByCategoryPage().filterByCategory("Necklaces");
    Assertions.assertEquals("Necklaces - Shop by Category - Shop", app.categoryPages().necklacesPage().getPageTitle()); }

    @Test
    @Tag("pdp")
    @DisplayName("MVP-13: Can filter items by price - single range")
    public void canFilterProductsByItemPriceSingleRange(){
   app.shopByCategoryPage().clickOnFilterByName("Price");
   app.shopByCategoryPage().filterByPrice("£1,000.00 - £2,000.00");
   Assertions.assertEquals("£1,000.00 - £2,000.00", app.shopByCategoryPage().getFilterValueText()); }

    @Test
    @Tag("pdp")
    @DisplayName("MVP-15: Can remove price filters ")
    public void canRemovePriceFilters(){
        app.shopByCategoryPage().clickOnFilterByName("Price");
        app.shopByCategoryPage().filterByPrice("£1,000.00 - £2,000.00");
        Assertions.assertEquals("£1,000.00 - £2,000.00", app.shopByCategoryPage().getFilterValueText());
        app.shopByCategoryPage().clickRemoverButton();
        app.shopByCategoryPage().clickOnFilterByName("Price");
        app.shopByCategoryPage().filterByPrice("£1,000.00 - £2,000.00");
        Assertions.assertEquals("£1,000.00 - £2,000.00", app.shopByCategoryPage().getFilterValueText());}

    @Test
    @Tag("pdp")
    @DisplayName("MVP-17: Can filter items by stone type ")
    public void canFilterItemsByStoneType(){

    }
}
