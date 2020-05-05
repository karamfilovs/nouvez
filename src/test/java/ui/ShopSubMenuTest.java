package ui;

import core.BaseTest;
import org.junit.jupiter.api.*;

public class ShopSubMenuTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
    }

    @AfterEach
    public void afterEach(TestInfo testInfo) {
        if (testInfo.getTags().contains("SkipCleanup")) {
            return;
        }
        app.components().breadCrumbsTrail().clickBreadCrumb("Shop by Category");
        Assertions.assertEquals("Shop by Category - Shop", app.shopByCategoryPage().getPageTitle());
    }


    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to shop by category page via the shop sub menu")
    public void canNavigateToShopByCategoryPage() {
        app.components().shopSubCategoryMenu().clickOnShopAll();
        Assertions.assertEquals("Shop by Category - Shop", app.shopByCategoryPage().getPageTitle());
    }

    @Test
    @Tag("SkipCleanup")
    @DisplayName("MVP-240: Can navigate to shop designer page via the shop sub menu")
    public void canNavigateToShopDesignerPage() {
        app.components().shopSubCategoryMenu().clickOnExploreDesigner();
        Assertions.assertEquals("Marketplace Seller List", app.homePage().getPageTitle());
    }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to necklaces category via the shop sub-category menu")
    public void canNavigateToNecklacesPageViaSubMenuAndBackToShopByCategoryViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickNecklaces();
        Assertions.assertEquals("Necklaces - Shop by Category - Shop", app.homePage().getPageTitle());
    }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to earrings category via the shop sub-category menu")
    public void canNavigateToEarringsPageViaSubMenuAndBackToShopByCategoryViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickEarrings();
        Assertions.assertEquals("Earrings - Shop by Category - Shop", app.homePage().getPageTitle());
    }


    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to rings category via the shop sub-category menu")
    public void canNavigateToRingsPageViaSubMenuAndBackToShopByCategoryViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickRings();
        Assertions.assertEquals("Rings - Shop by Category - Shop", app.homePage().getPageTitle());
    }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to bracelets category via the shop sub-category menu")
    public void canNavigateToBraceletsPageViaSubMenuAndBackToShopByCategoryViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickBracelets();
        Assertions.assertEquals("Bracelets - Shop by Category - Shop", app.homePage().getPageTitle());
    }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to accessories category via the shop sub-category menu")
    public void canNavigateToAccessoriesPageViaSubMenuAndBackToShopByCategoryViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickAccessories();
        Assertions.assertEquals("Accessories - Shop by Category - Shop", app.homePage().getPageTitle());
    }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to wedding rings category via the shop sub-category menu")
    public void canNavigateToWeddingRingsPageViaSubMenuAndBackToShopByCategoryViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickWeddingRings();
        Assertions.assertEquals("Wedding Rings - Shop by Category - Shop", app.homePage().getPageTitle());
    }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to engagement rings category via the shop sub-category menu")
    public void canNavigateToEngagementRingsPageViaSubMenuAndBackToShopByCategoryViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickEngagementRings();
        Assertions.assertEquals("Engagement Rings - Shop by Category - Shop", app.homePage().getPageTitle());
    }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to bridal jewellery category via the shop sub-category menu")
    public void canNavigateToBridalJewelleryPageViaSubMenuAndBackToShopByCategoryViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickBridalJewellery();
        Assertions.assertEquals("Bridal Jewellery  - Shop by Category - Shop", app.homePage().getPageTitle());
    }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to men category via the shop sub-category menu")
    public void canNavigateToMenPageViaSubMenuAndBackToShopByCategoryViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickMen();
        Assertions.assertEquals("Men - Shop by Category - Shop", app.homePage().getPageTitle());
    }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to woman category via the shop sub-category menu")
    public void canNavigateToWomenPageViaSubMenuAndBackToShopByCategoryViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickWomen();
        Assertions.assertEquals("Women - Shop by Category - Shop", app.homePage().getPageTitle());


    }
}