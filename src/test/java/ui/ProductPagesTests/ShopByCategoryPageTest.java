package ui.ProductPagesTests;

import core.BaseTest;
import enums.Category;
import enums.Filters.*;
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

    @ParameterizedTest(name = "MVP-13: Can filter products by metal=> {0}")
    @EnumSource(value = Metal.class)
    @Tag("plp")
    @DisplayName("MVP-13: Can filter products by metal")
    public void canFilterProductsByMetal(Metal metal) {
        app.shopByCategoryPage().selectMetalFilterByName("Metal", metal.getMetal());
        Assertions.assertEquals(metal.getMetal(),app.shopByCategoryPage().getFilterValueText());
        Assertions.assertEquals("False",app.shopByCategoryPage().checkIfAmountToolbarValueIsZero()); }


    @ParameterizedTest(name ="MVP-237: Can filter products by gems => {0}")
    @EnumSource(value = Gems.class)
    @Tag("plp")
    @DisplayName("MVP-237: Can filter products by gems")
    public void canFilterProductsByGems(Gems gems) {
        app.shopByCategoryPage().selectGemsFilterByName("Gems", gems.getGems());
        Assertions.assertEquals(gems.getGems(),app.shopByCategoryPage().getFilterValueText());
        Assertions.assertEquals("False",app.shopByCategoryPage().checkIfAmountToolbarValueIsZero()); }

    @ParameterizedTest(name ="MVP-238: Can filter products on Shop by products page by price range => {0}")
    @EnumSource(value = Price.class)
    @Tag("plp")
    @DisplayName("MVP-238: Can filter products on Shop by products page by price range")
    public void canFilterProductsByPrice(Price price) {
        app.shopByCategoryPage().selectPriceFilterByRange("Price", price.getPrice());
        Assertions.assertEquals(price.getPrice(),app.shopByCategoryPage().getFilterValueText());
        Assertions.assertEquals("False",app.shopByCategoryPage().checkIfAmountToolbarValueIsZero()); }


    @ParameterizedTest(name ="MVP-239: Can filter products on Shop by products page by diamonds type=> {0}")
    @EnumSource(value = Diamonds.class)
    @Tag("plp")
    @DisplayName("MVP-239: Can filter products on Shop by products page by diamonds type")
    public void canFilterProductsByDiamonds(Diamonds diamonds) {
        app.shopByCategoryPage().selectDiamondsFilterByName("Diamonds", diamonds.getDiamonds());
        Assertions.assertEquals(diamonds.getDiamonds(),app.shopByCategoryPage().getFilterValueText());
        Assertions.assertEquals("False",app.shopByCategoryPage().checkIfAmountToolbarValueIsZero()); }

    @ParameterizedTest(name ="MVP-239: Can filter products on Shop by products page by designer type=> {0}")
    @EnumSource(value = Designer.class)
    @Tag("plp")
    @DisplayName("MVP-239: Can filter products on Shop by products page by designer")
    public void canFilterProductsByDesigner(Designer designer) {
        app.shopByCategoryPage().selectDesignerFilterByName("Designer", designer.getDesigner());
        Assertions.assertEquals(designer.getDesigner(),app.shopByCategoryPage().getFilterValueText());
        Assertions.assertEquals("False",app.shopByCategoryPage().checkIfAmountToolbarValueIsZero()); }


}

