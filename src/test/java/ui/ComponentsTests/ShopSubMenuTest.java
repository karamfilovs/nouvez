package ui.ComponentsTests;

import core.BaseTest;
import enums.Emails;
import enums.PriceRanges;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ShopSubMenuTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle()); }

    @AfterEach
    public void afterEach(TestInfo testInfo) {
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.shopByCategoryPage().getPageTitle());}

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to shop by category page via the shop sub menu")
    public void canNavigateToShopByCategoryPage() {
        app.components().shopSubCategoryMenu().clickOnShopAll();
        Assertions.assertEquals("Shop", app.shopByCategoryPage().getPageTitle()); }

    @Test
    @Tag("SkipCleanup")
    @DisplayName("MVP-240: Can navigate to designer page via the shop sub menu")
    public void canNavigateToDesignerPage() {
        app.components().shopSubCategoryMenu().clickOnExploreDesigner();
        Assertions.assertEquals("Marketplace Seller List", app.homePage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to necklaces page via the shop sub-category menu")
    public void canNavigateToNecklacesPageAndBackHomeViaLogo() {
        app.components().shopSubCategoryMenu().clickNecklaces();
        Assertions.assertEquals("Necklaces", app.homePage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to earrings page via the shop sub-category menu")
    public void canNavigateToEarringsPageAndBackHomeViaLogo() {
        app.components().shopSubCategoryMenu().clickEarrings();
        Assertions.assertEquals("Earrings", app.homePage().getPageTitle()); }


    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to rings page via the shop sub-category menu")
    public void canNavigateToRingsPageAndBackHomeViaLogo() {
        app.components().shopSubCategoryMenu().clickRings();
        Assertions.assertEquals("Rings", app.homePage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to bracelets page via the shop sub-category menu")
    public void canNavigateToBraceletsPageAndBackHomeViaLogo() {
        app.components().shopSubCategoryMenu().clickBracelets();
        Assertions.assertEquals("Bracelets", app.homePage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to accessories category via the shop sub-category menu")
    public void canNavigateToAccessoriesPageAndBackHomeViaLogo() {
        app.components().shopSubCategoryMenu().clickAccessories();
        Assertions.assertEquals("Accessories", app.homePage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to One of a kind page via the shop sub-category menu")
    public void canNavigateToOneOfAKindPageAndBackHomeViaLogo() {
        app.components().shopSubCategoryMenu().clickOneOfAKind();
        Assertions.assertEquals("One of a Kind", app.homePage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to Gifting page via the shop sub-category menu")
    public void canNavigateToGiftingPageAndBackHomeViaLogo() {
        app.components().shopSubCategoryMenu().clickGifting();
        Assertions.assertEquals("Gifting", app.homePage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to Below 2000  price range pages via the shop sub-category menu")
    public void canNavigateToPriceRangePagesBelow2000() {
        app.components().shopSubCategoryMenu().clickBelow2000();
        Assertions.assertEquals("Below £1,000.00", app.shopByCategoryPage().getFilterValueText()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to 2000 to 5000  price range pages via the shop sub-category menu")
    public void canNavigateToPriceRangePages2000to5000() {
        app.components().shopSubCategoryMenu().clickFrom2000To5000();
        Assertions.assertEquals("£2,000.00 - £3,000.00", app.shopByCategoryPage().getFilterValueText()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to 5000 to 10000  price range pages via the shop sub-category menu")
    public void canNavigateToPriceRangePages5000to10000() {
        app.components().shopSubCategoryMenu().clickFrom5000To10000();
        Assertions.assertEquals("£5,000.00 - £6,000.00", app.shopByCategoryPage().getFilterValueText()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to above 10000 price range pages via the shop sub-category menu")
    public void canNavigateToPriceRangePagesAbove10000() {
        app.components().shopSubCategoryMenu().clickAbove10000();
        Assertions.assertEquals("£10,000.00 and above", app.shopByCategoryPage().getFilterValueText()); }

// @Test
//    @Tag("shopSubCategory")
//    @DisplayName("MVP-240: Can navigate to above 10000 price range pages via the shop sub-category menu")
//    public void canNavigateToDesignerPages() {
//        app.components().shopSubCategoryMenu().clickDesignerByName("Antonini");
//        Assertions.assertEquals("Antonini", app.shopByCategoryPage().getPageTitle());}



}