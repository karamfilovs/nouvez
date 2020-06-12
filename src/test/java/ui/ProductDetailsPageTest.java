package ui;

import core.BaseTest;
import org.junit.jupiter.api.*;

public class ProductDetailsPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.loginPage().login();
        app.components().mainMenu().hoverOnShop();
        app.components().shopSubCategoryMenu().clickOnShopAll();
        Assertions.assertEquals("Shop", app.homePage().getPageTitle());
    }

    @Test
    @Tag("pdp")
    @DisplayName("MVP-9: Can navigate to PDP page")
    public void canNavigateToPDPPage() {
        app.shopByCategoryPage().clickOnProductByName("Pippa Small");
        Assertions.assertEquals("Pippa Small", app.productDetailsPage().getDesignerNameText()); }

    @Test
    @Tag("pdp")
    @DisplayName("MVP-20: Can add product to wish-list")
    public void canAddProductToWishList(){
        app.shopByCategoryPage().clickOnProductByName("Pippa Small");
        Assertions.assertEquals("Pippa Small", app.productDetailsPage().getDesignerNameText());
        app.productDetailsPage().clickAddToWishList();
        Assertions.assertEquals("Pippa Small has been Added to wishlist", app.productDetailsPage().getTextOfWishListPopUp()); }


}
