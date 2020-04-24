package ui;

import core.BaseTest;
import org.junit.jupiter.api.*;

public class ProductDetailsPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.components().mainMenu().hoverOnShop();
        app.components().shopSubCategoryMenu().clickOnShopAll();
        Assertions.assertEquals("Shop by Category - Shop", app.homePage().getPageTitle());
    }

    @Test
    @Tag("pdp")
    @DisplayName("MVP-9: Can navigate to PDP page")
    public void canNavigateToPDPPage() {
        app.shopByCategoryPage().clickOnProductByName("Gucci");
        Assertions.assertEquals("Gucci", app.components().shopSubCategoryMenu().getPageTitle());
    }

    @Test
    @Tag("pdp")
    @DisplayName("MVP-20: Can add product to wish-list")
    public void canAddProductToWishList(){
        
    }

    @Test
    @Tag("pdp")
    @DisplayName("MVP-47: Can share product from pdp")
    public void canShareProductFromPDP(){

    }

    @Test
    @Tag("pdp")
    @DisplayName("MVP-46: Can increase product quantity by clicking Add to Cart button multiple times")
    public void canIncreaseProductQuantityByClickingAddToCartMultipleTimes(){

    }
}
