package ui.UserPagesTests;

import core.BaseTest;
import org.junit.jupiter.api.*;
import utils.DataGenerator;

import javax.xml.crypto.Data;

public class CheckoutPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.productDetailsPage().navigateToSpecificProduct("/catalogue-1/meubels/kav-s565j03/2-zitsbank-safira-lichtgrijs-160-cm/");
        Assertions.assertEquals("2-zitsbank Safira lichtgrijs 160 cm", app.productDetailsPage().getItemName());
        app.components().symphonyProfiler().closeSymphonyProfilerToolbar();
        app.components().cookieContainer().clickAcceptCookiesButton();
    }


    @Test
    @Tag("checkout")
    @DisplayName("MVP-8: Can checkout as guest")
    public void canCheckoutAsGuest()  {
        String email = DataGenerator.generateRandomString(8 ) + "@" + "pragmatic-qa.com";
        String text = DataGenerator.generateRandomString(6);
        String phone = DataGenerator.generateRandomNumber(10);
        String CVC = DataGenerator.generateRandomNumber(3);
        app.productDetailsPage().clickAddToCartButton();
        app.components().miniCart().clickCheckOut();
        Assertions.assertEquals("Winkelmandje", app.shoppingBasketPage().getHeaderText());
        app.shoppingBasketPage().clickCheckoutButton();
        Assertions.assertEquals("Persoonlijke informatie", app.checkoutPage().getHeaderText());
        app.checkoutPage().fillInShippingDetailsAndClickNext(email, text, text, text, text, text, phone );
        Assertions.assertEquals("Payment Method", app.checkoutPage2().getTextOfCurSection());
        app.checkoutPage2().fillInPaymentDetails("4000 008260000000","522",CVC, text);
        Assertions.assertEquals("Thank you for you order", app.successPage().getSuccessMessageText()); }


//    @Test
//    @Tag("checkout")
//    @DisplayName("MVP-61: Can place an order when logged in")
//        public void canPlaceAnOrderLoggedIn(){
//        app.loginPage().login();
//        Assertions.assertEquals("My Account", app.myAccountPage().getPageTitle());
//        app.productListingPage().gotoProductListingsPage();
//        Assertions.assertEquals("Shop", app.productListingPage().getPageTitle());
//        app.productListingPage().clickFirstProduct();
//        app.productDetailsPage().clickAddToCartButton();
//        app.components().miniCart().clickCheckOut();
//        Assertions.assertEquals("Checkout", app.checkoutPage().getPageTitle());
//        app.checkoutPage().selectShippingMethod("Fedex");
//        app.checkoutPage().clickNextButton();
//        Assertions.assertEquals("Payment Method", app.checkoutPage2().getTextOfCurSection());
//        app.checkoutPage2().fillInPaymentDetails("4000 008260000000","522","522","55221");
//
//    }


}
