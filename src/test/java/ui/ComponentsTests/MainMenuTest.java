package ui.ComponentsTests;

import core.BaseTest;
import org.junit.jupiter.api.*;

public class MainMenuTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle()); }

    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to concierge page from main menu and return to home page using Once logo")
    public void canNavigateToConciergePageAndBackToHomeUsingLogo(){
        app.components().mainMenu().clickConcierge();
        Assertions.assertEquals("Concierge", app.shopByCategoryPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle()); }

    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to diary page from main menu and return to home page using Once logo")
    public void canNavigateToDiaryPageAndBackToHomeUsingLogo(){
        app.components().mainMenu().clickDiary();
        Assertions.assertEquals("Diary", app.shopByCategoryPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle()); }


    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to contact page from main menu and return to home page using breadcrumbs trail")
    public void canNavigateToContactPageAndBackToHomeClickingOnTheLogo(){
        app.components().mainMenu().clickContact();
        Assertions.assertEquals("Contact", app.shopByCategoryPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle()); }


}
