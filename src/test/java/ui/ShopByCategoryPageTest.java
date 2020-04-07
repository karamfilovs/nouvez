package ui;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import core.BaseTest;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class ShopByCategoryPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        app.shopByCategoryPage().goToShopByCategoryPage();
        Assertions.assertEquals("Shop by Category - Shop", app.shopByCategoryPage().getPageTitle());
    }

    @Test
    @Tag("plp")
    @DisplayName("MVP-236: Can choose categories from category menu on shop by category page and return to home page via breadcrumbs trail")
    public void chooseCategoryFromMenu() {
        app.shopByCategoryPage().clickOnCategoryButtonByName("Necklaces");
        Assertions.assertEquals("Necklaces - Shop by Category - Shop", app.categoryPages().necklacesPage().getPageTitle());
        app.components().breadCrumbsTrail().clickBreadCrumb("Shop by Category");
        Assertions.assertEquals("Shop by Category - Shop", app.shopByCategoryPage().getPageTitle());
        app.components().breadCrumbsTrail().clickBreadCrumb("Home");
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }

    @Test
    @Tag("plp")
    @DisplayName("MVP-12: Can filter products by existing category ")
    public void canFilterProductsByCategory() {
        app.shopByCategoryPage().clickOnFilterByName("Category");
        app.shopByCategoryPage().selectCategoryFromFiltersDropDown("Necklaces");
        try{Thread.sleep(5000);}catch (Exception e){}
        Assertions.assertEquals("Necklaces - Shop by Category - Shop", app.categoryPages().necklacesPage().getPageTitle());
        app.components().breadCrumbsTrail().clickBreadCrumb("Shop by Category");
        Assertions.assertEquals("Shop by Category - Shop", app.shopByCategoryPage().getPageTitle());

    }
}

