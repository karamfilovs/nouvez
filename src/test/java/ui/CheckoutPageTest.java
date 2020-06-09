package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.DataGenerator;

import javax.xml.crypto.Data;

public class CheckoutPageTest extends BaseTest {

    @Test
    @Tag("checkout")
    @DisplayName("MVP-8: Can checkout as guest")
    public void canCheckoutAsGuest()  {
        String email = DataGenerator.generateRandomString(8 ) + "@" + "pragmatic-qa.com";
        String firstName = DataGenerator.generateRandomString(6);
        String lastName = DataGenerator.generateRandomString(8);
        String streetAddress = DataGenerator.generateRandomString(25);
        String city = DataGenerator.generateRandomString(8);
        String zip = DataGenerator.generateRandomString(5 );
        String phone = DataGenerator.generateRandomNumber(10);
        String CVC = DataGenerator.generateRandomNumber(3);
        app.productListingPage().gotoProductListingsPage();
        Assertions.assertEquals("Shop", app.productListingPage().getPageTitle());
        app.productListingPage().clickProductByName("Maison Auclert");
        Assertions.assertEquals("Maison Auclert", app.productDetailsPage().getDesignerNameText());
        app.productDetailsPage().clickAddToCartButton();
        app.components().miniCart().clickCheckOut();
        Assertions.assertEquals("Checkout", app.checkoutPage().getPageTitle());
        app.checkoutPage().fillInShippingDetailsAndClickNext(email, firstName, lastName, streetAddress, city, zip, phone );
        Assertions.assertEquals("Payment Method", app.checkoutPage2().getTextOfCurSection());
        app.checkoutPage2().fillInPaymentDetails("40000008260000000","522",CVC, zip);
        Assertions.assertEquals("Thank you for you order", app.successPage().getSuccessMessageText()); } 



    //@Test
    //@Tag("checkout")
    //@DisplayName("MVP-61: Can place order with Credit Card")


}
