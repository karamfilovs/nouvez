package ui;

import core.BaseTest;
import org.junit.jupiter.api.*;

public class ShopByCategoryPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        app.shopByCategoryPage().goToShopByCategoryPage();
        Assertions.assertEquals("Shop - Shop", app.shopByCategoryPage().getPageTitle());
    }

    @Test
    @Tag("plp")
    @DisplayName("MVP-236: Can choose categories from category menu on shop by category page and return to home page via company logo")
    public void chooseCategoryFromMenu() {
        app.shopByCategoryPage().clickOnCategoryButtonByName("Necklaces");
        Assertions.assertEquals("Necklaces - Shop by Category - Shop", app.categoryPages().necklacesPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }

    @Test
    @Tag("plp")
    @DisplayName("MVP-12: Can filter products by existing category ")
    public void canFilterProductsByCategory() {
        app.shopByCategoryPage().clickOnFilterByName("Category");
        app.shopByCategoryPage().filterByCategory("Necklaces");
        Assertions.assertEquals("Necklaces - Shop by Category - Shop", app.shopByCategoryPage().getPageTitle());

//    @Test
//    @Tag("plp")
//    @DisplayName("MVP-13: Can filter products by price range - single range")
//    public void canFilterProductsByPriceRange() {
//        app.shopByCategoryPage().clickOnFilterByName("Price");
//        app.shopByCategoryPage().filterByPrice("£1,000.00 - £2,000.00");
//        Assertions.assertEquals("£1,000.00 - £2,000.00", app.shopByCategoryPage().getFilterValueText());
//        app.shopByCategoryPage().clickRemoverButton();}

//    @Test
//    @Tag("plp")
//    @DisplayName("MVP-237: Can filter products by color")
//    public void canFilterProductsByColor() {
//        app.shopByCategoryPage().clickOnFilterByName("Color");
//        app.shopByCategoryPage().filterByColor("Black");
//        try{Thread.sleep(5000);}catch(Exception e){};
//        Assertions.assertEquals("Black", app.shopByCategoryPage().getFilterValueText() );
//        app.shopByCategoryPage().clickRemoverButton();
//    }

//    @Test
//    @Tag("plp")
//    @DisplayName("MVP-238: Can filter products on Shop by products page by size")
//    public void canFilterProductsBySize() {
//        app.shopByCategoryPage().clickOnFilterByName("Size");
//        app.shopByCategoryPage().filterBySize("55 cm");
//        Assertions.assertEquals("55 cm", app.shopByCategoryPage().getFilterValueText());
//        app.shopByCategoryPage().clickRemoverButton();
    }

    @Test
    @Tag("plp")
    @DisplayName("MVP-239: Can filter products on Shop by products page by stone type")
    public void canFilterProductsByStone() {
        app.shopByCategoryPage().clickOnFilterByName("Stone");
        app.shopByCategoryPage().filterByStone("Diamond");
        Assertions.assertEquals("Diamond", app.shopByCategoryPage().getFilterValueText());
        app.shopByCategoryPage().clickRemoverButton();
    }

}

