package ui.ComponentsTests;

import core.BaseTest;
import org.junit.jupiter.api.*;

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
        Assertions.assertEquals("Shop - Shop", app.shopByCategoryPage().getPageTitle()); }

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
        Assertions.assertEquals("Necklaces - Shop - Shop", app.homePage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to earrings page via the shop sub-category menu")
    public void canNavigateToEarringsPageAndBackHomeViaLogo() {
        app.components().shopSubCategoryMenu().clickEarrings();
        Assertions.assertEquals("Earrings - Shop - Shop", app.homePage().getPageTitle()); }


    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to rings page via the shop sub-category menu")
    public void canNavigateToRingsPageAndBackHomeViaLogo() {
        app.components().shopSubCategoryMenu().clickRings();
        Assertions.assertEquals("Rings - Shop - Shop", app.homePage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to bracelets page via the shop sub-category menu")
    public void canNavigateToBraceletsPageAndBakcHomeViaLogo() {
        app.components().shopSubCategoryMenu().clickBracelets();
        Assertions.assertEquals("Bracelets - Shop - Shop", app.homePage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to accessories category via the shop sub-category menu")
    public void canNavigateToAccessoriesPageAndBackHomeViaLogo() {
        app.components().shopSubCategoryMenu().clickAccessories();
        Assertions.assertEquals("Accessories - Shop - Shop", app.homePage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to One of a kind page via the shop sub-category menu")
    public void canNavigateToOneOfAKindPageAndBackHomeViaLogo() {
        app.components().shopSubCategoryMenu().clickOneOfAKind();
        Assertions.assertEquals("One of a Kind - Shop - Shop", app.homePage().getPageTitle()); }


}