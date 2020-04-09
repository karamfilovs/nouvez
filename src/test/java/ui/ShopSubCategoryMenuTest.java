package ui;

import core.BaseTest;
import org.junit.jupiter.api.*;

public class ShopSubCategoryMenuTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.components().shopSubCategoryMenu().hoverOverShop();
    }

//    @AfterEach
//    public void afterEach() {
//        app.components().breadCrumbsTrail().clickBreadCrumb("Shop");
//        Assertions.assertEquals("Shop", app.shopPage().getPageTitle());
//        app.components().breadCrumbsTrail().clickBreadCrumb("Home");
//        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
//    }


    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to shop by category page via the shop sub-category menu")
    public void canNavigateToShopByCategoryPageViaSubMenuAndBackToHomeViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickOnShopByCategory();
        Assertions.assertEquals("Shop by Category - Shop", app.shopByCategoryPage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to shop by price page via the shop sub-category menu")
    public void canNavigateToShopByPricePageViaSubMenuAndBackToHomeViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickOnShopByPrice();
        Assertions.assertEquals("Shop by Price - Shop", app.categoryPages().shopByPricePage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to shop designer page via the shop sub-category menu")
    public void canNavigateToShopDesignerPageViaSubMenuAndBackToHomeViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickOnShopDesigner();
        Assertions.assertEquals("Marketplace Seller List", app.categoryPages().shopDesignerPage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to necklaces category via the shop sub-category menu")
    public void canNavigateToNecklacesPageViaSubMenuAndBackToHomeViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickOnCategoryButtonByName("Necklaces");
        Assertions.assertEquals("Necklaces - Shop by Category - Shop", app.categoryPages().necklacesPage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to earrings category via the shop sub-category menu")
    public void canNavigateToEarringsPageViaSubMenuAndBackToHomeViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickOnCategoryButtonByName("Earrings");
        Assertions.assertEquals("Earrings - Shop by Category - Shop", app.categoryPages().earringsPage().getPageTitle()); }

    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to rings category via the shop sub-category menu")
    public void canNavigateToRingsPageViaSubMenuAndBackToHomeViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickOnCategoryButtonByName("Rings");
        Assertions.assertEquals("Rings - Shop by Category - Shop", app.categoryPages().ringsPage().getPageTitle());
    }
    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to bracelets category via the shop sub-category menu")
    public void canNavigateToBraceletsPageViaSubMenuAndBackToHomeViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickOnCategoryButtonByName("Bracelets");
        Assertions.assertEquals("Bracelets - Shop by Category - Shop", app.categoryPages().braceletsPage().getPageTitle());
    }
    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to accessories category via the shop sub-category menu")
    public void canNavigateToAccessoriesPageViaSubMenuAndBackToHomeViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickOnCategoryButtonByName("Accessories");
        Assertions.assertEquals("Accessories - Shop by Category - Shop", app.categoryPages().accessoriesPage().getPageTitle());
    }
    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to wedding rings category via the shop sub-category menu")
    public void canNavigateToWeddingRingsPageViaSubMenuAndBackToHomeViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickOnCategoryButtonByName("Wedding Rings");
        Assertions.assertEquals("Wedding Rings - Shop by Category - Shop", app.categoryPages().weddingRingsPage().getPageTitle());
    }
    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to engagement rings category via the shop sub-category menu")
    public void canNavigateToEngagementRingsPageViaSubMenuAndBackToHomeViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickOnCategoryButtonByName("Engagement Rings");
        Assertions.assertEquals("Engagement Rings - Shop by Category - Shop", app.categoryPages().engagementRingsPage().getPageTitle());
    }
    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to bridal jewellery category via the shop sub-category menu")
    public void canNavigateToBridalJewelleryPageViaSubMenuAndBackToHomeViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickOnCategoryButtonByName("Bridal Jewellery");
        Assertions.assertEquals("Bridal Jewellery - Shop by Category - Shop", app.categoryPages().bridalJewelleryPage().getPageTitle());
    }
    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to men category via the shop sub-category menu")
    public void canNavigateToMenPageViaSubMenuAndBackToHomeViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickOnCategoryButtonByName("Men");
        Assertions.assertEquals("Men - Shop by Category - Shop", app.categoryPages().menPage().getPageTitle());
    }
    @Test
    @Tag("shopSubCategory")
    @DisplayName("MVP-240: Can navigate to woman category via the shop sub-category menu")
    public void canNavigateToWomanPageViaSubMenuAndBackToHomeViaBreadCrumbs() {
        app.components().shopSubCategoryMenu().clickOnCategoryButtonByName("Woman");
        Assertions.assertEquals("Woman - Shop by Category - Shop", app.categoryPages().womanPage().getPageTitle());
    }
}