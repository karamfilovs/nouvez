package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MainMenuTest extends BaseTest {
    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to shop page from main menu and return to home page using breadcrumbs trail")
    public void canNavigateToShopPageAndBackToHomeUsingBreadCrumbs(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.components().mainMenu().clickOnShop();
        Assertions.assertEquals("Shop", app.shopPage().getPageTitle());
        app.components().breadCrumbsTrail().clickBreadCrumb("Home");
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }

    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to create page from main menu and return to home page using breadcrumbs trail")
    public void canNavigateToCreatePageAndBackToHomeUsingBreadCrumbs(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.components().mainMenu().clickOnCreate();
        Assertions.assertEquals("Create", app.shopPage().getPageTitle());
        app.components().breadCrumbsTrail().clickBreadCrumb("Home");
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }
    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to inspire page from main menu and return to home page using breadcrumbs trail")
    public void canNavigateToInspirePageAndBackToHomeUsingBreadCrumbs(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.components().mainMenu().clickOnInspire();
        Assertions.assertEquals("Inspire", app.shopPage().getPageTitle());
        app.components().breadCrumbsTrail().clickBreadCrumb("Home");
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }

    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to about page from main menu and return to home page using breadcrumbs trail")
    public void canNavigateToAboutPageAndBackToHomeUsingBreadCrumbs(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.components().mainMenu().clickOnAbout();
        Assertions.assertEquals("About", app.shopPage().getPageTitle());
        app.components().breadCrumbsTrail().clickBreadCrumb("Home");
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }

    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to services page from main menu and return to home page using breadcrumbs trail")
    public void canNavigateToServicesPageAndBackToHomeUsingBreadCrumbs(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.components().mainMenu().clickOnServices();
        Assertions.assertEquals("Services", app.shopPage().getPageTitle());
        app.components().breadCrumbsTrail().clickBreadCrumb("Home");
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }
    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to contact page from main menu and return to home page using breadcrumbs trail")
    public void canNavigateToContactPageAndBackToHomeClickinOnTheLogo(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.components().mainMenu().clickOnContact();
        Assertions.assertEquals("Contact", app.shopPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }


}
