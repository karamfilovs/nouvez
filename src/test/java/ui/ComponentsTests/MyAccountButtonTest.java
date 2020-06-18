package ui.ComponentsTests;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MyAccountButtonTest extends BaseTest {

    @Test
    @Tag("my-account-menu")
    @DisplayName("MVP-154: Can access customer login page clicking my account button from the drop down menu of my account component")
    public void goToCustomerLoginViaMyAccountLink(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.homePage().clickMyAccountIcon();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());

    }

}
