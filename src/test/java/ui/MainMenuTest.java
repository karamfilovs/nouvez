package ui;

import core.BaseTest;
import org.junit.jupiter.api.*;

public class MainMenuTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle()); }

    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to diary page from main menu and return to home page using Once logo")
    public void canNavigateToDiaryPageAndBackToHomeUsingLogo(){
        app.components().mainMenu().clickDiary();
        Assertions.assertEquals("Once | Once", app.shopPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle()); }

    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to experience page from main menu and return to home page using Once logo")
    public void canNavigateToExperiencePageAndBackToHomeUsingLogo(){
        app.components().mainMenu().clickExperience();
        Assertions.assertEquals("Experience", app.shopPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle()); }

    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to about page from main menu and return to home page using Once logo")
    public void canNavigateToAboutPageAndBackToHomeUsingLogo(){
        app.components().mainMenu().clickAbout();
        Assertions.assertEquals("About", app.shopPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle()); }

    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to contact page from main menu and return to home page using breadcrumbs trail")
    public void canNavigateToContactPageAndBackToHomeClickingOnTheLogo(){
        app.components().mainMenu().clickContact();
        Assertions.assertEquals("Contact", app.shopPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle()); }


}
