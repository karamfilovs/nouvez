package ui.ProductPagesTests;

import core.BaseTest;
import enums.Category;
import enums.Emails;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ShopByCategoryPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        app.shopByCategoryPage().goToShopByCategoryPage();
        Assertions.assertEquals("Shop", app.shopByCategoryPage().getPageTitle()); }


    @ParameterizedTest(name = "MVP-236: Can choose categories from category menu on shop by category page and return to home page via company logo => {0}")
    @EnumSource(value = Category.class)
    @Tag("plp")
    @DisplayName("MVP-236: Can choose categories from category menu on shop by category page and return to home page via company logo")
    public void chooseCategoryFromMenu(Category category) {
        app.shopByCategoryPage().clickOnCategoryButtonByName(category.getCategory());
        Assertions.assertEquals(category.getCategory(), app.categoryPages().necklacesPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());}

    @Test
    @Tag("plp")
    @DisplayName("MVP-13: Can filter products by metal")
    public void canFilterProductsByMetal() {
        app.shopByCategoryPage().goToShopByCategoryPage();
        Assertions.assertEquals("Shop", app.shopByCategoryPage().getPageTitle());
        app.shopByCategoryPage().storeFilterByMetalValues("Metal"); }


    @Test
    @Tag("plp")
    @DisplayName("MVP-237: Can filter products by gems")
    public void canFilterProductsByGems() { };

    @Test
    @Tag("plp")
    @DisplayName("MVP-238: Can filter products on Shop by products page by price")
    public void canFilterProductsByPrice() {
    };

    @Test
    @Tag("plp")
    @DisplayName("MVP-239: Can filter products on Shop by products page by diamonds type")
    public void canFilterProductsByDiamonds() {
    };

    @Test
    @Tag("plp")
    @DisplayName("MVP-239: Can filter products on Shop by products page by designer")
    public void canFilterProductsByDesigner() {
    };


}

