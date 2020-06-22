package ui.ProductPagesTests;

import core.BaseTest;
import org.junit.jupiter.api.*;

public class ProductDetailsPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.loginPage().login();
        Assertions.assertEquals("My Account", app.myAccountPage().getPageTitle());
        app.components().mainMenu().hoverOnShop();
        app.components().shopSubCategoryMenu().clickOnShopAll();
        Assertions.assertEquals("Shop", app.homePage().getPageTitle()); }

    @Test
    @Tag("pdp")
    @DisplayName("MVP-9: Can navigate to PDP page")
    public void canNavigateToPDPPage() {
        app.shopByCategoryPage().clickOnProductByName("Pasquale Bruni");
        Assertions.assertEquals("Pasquale Bruni", app.productDetailsPage().getDesignerNameText()); }

    @Test
    @Tag("pdp")
    @DisplayName("MVP-20: Can add product to wish-list")
    public void canAddProductToWishList(){
        app.shopByCategoryPage().clickOnProductByName("Pasquale Bruni");
        Assertions.assertEquals("Pasquale Bruni", app.productDetailsPage().getDesignerNameText());
        app.productDetailsPage().clickAddToWishList();
        Assertions.assertEquals("Pasquale Bruni has been Added to wishlist", app.productDetailsPage().getTextOfWishListPopUp()); }

    @Test
    @Tag("pdp")
    @DisplayName("MVP-47: Can share product from pdp")
    public void canShareProductFromPDP(){
        app.shopByCategoryPage().clickOnProductByName("Pasquale Brun");
        Assertions.assertEquals("Pasquale Bruni", app.productDetailsPage().getDesignerNameText());
        app.productDetailsPage().clickShareLink();
        Assertions.assertEquals("true", app.productDetailsPage().shareThisIsVisible()); }

        @AfterEach
        public void afterEach(){
            app.myAccountNavigation().clickMyWishListLink();
            Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
            app.loginPage().login();
            Assertions.assertEquals("My Account", app.myAccountPage().getPageTitle());
            app.components().mainMenu().hoverOnShop();
            app.components().shopSubCategoryMenu().clickOnShopAll();
            Assertions.assertEquals("Shop", app.homePage().getPageTitle()); }
}
