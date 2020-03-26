package ui;

import core.BaseTest;
import enums.MyAccountNavMenu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MyOrdersPageTest extends BaseTest {

    @Test
    @Tag("positive")
    @Tag("my-orders")
    @DisplayName("MVP-X: Can reorder already placed order")
    public void canReorderAlreadyPlacedOrder() {
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().login();
        app.myAccountPage().navigateToMenu(MyAccountNavMenu.MY_ORDERS);
        Assertions.assertEquals("My Orders", app.myOrdersPage().getPageTitle());
        app.myOrdersPage().reorderFirst();
        Assertions.assertEquals("Shopping Cart", app.checkoutPage().getPageTitle());
        app.basketPage().clickCheckoutButton();
    }
}
