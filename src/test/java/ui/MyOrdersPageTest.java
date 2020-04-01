package ui;

import core.BaseTest;
import enums.MyAccountNavMenu;
import org.junit.jupiter.api.*;

public class MyOrdersPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().login();
    }

    @AfterEach
    public void afterEach(){
        app.components().myAccountMenu().signOut();
    }

    @Test
    @Tag("my-orders")
    @DisplayName("MVP-64: Can reorder already placed order")
    public void canReorderAlreadyPlacedOrder() {
        app.myAccountPage().navigateToMenu(MyAccountNavMenu.MY_ORDERS);
        Assertions.assertEquals("My Orders", app.myOrdersPage().getPageTitle());
        app.myOrdersPage().reorderFirst();
        Assertions.assertEquals("Shopping Cart", app.checkoutPage().getPageTitle());
        app.basketPage().clickCheckoutButton();
    }

//    @Test
//    @Tag("my-orders")
//    @DisplayName("MVP-62: Can view order details and go back to my orders page ")
//    public void canReorderAlreadyPlacedOrder() {
//        app.myAccountPage().navigateToMenu(MyAccountNavMenu.MY_ORDERS);
//        Assertions.assertEquals("My Orders", app.myOrdersPage().getPageTitle());
//        app.myOrdersPage().reorderFirst();
//        Assertions.assertEquals("Shopping Cart", app.checkoutPage().getPageTitle());
//        app.basketPage().clickCheckoutButton();
//    }


}
