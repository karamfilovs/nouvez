package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MainMenuTest extends BaseTest {

    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to diary page from main menu and return to home page using Once logo")
    public void canNavigateToDiaryPageAndBackToHomeUsingLogo(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.components().mainMenu().clickDiary();
        Assertions.assertEquals("Diary", app.shopPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }



    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to experience page from main menu and return to home page using Once logo")
    public void canNavigateToExperiencePageAndBackToHomeUsingLogo(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.components().mainMenu().clickExperience();
        Assertions.assertEquals("Experience", app.shopPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }

    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to about page from main menu and return to home page using Once logo")
    public void canNavigateToAboutPageAndBackToHomeUsingLogo(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.components().mainMenu().clickAbout();
        Assertions.assertEquals("About us", app.shopPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }

    @Test
    @Tag("main-menu")
    @DisplayName("MVP-152: Can navigate to contact page from main menu and return to home page using breadcrumbs trail")
    public void canNavigateToContactPageAndBackToHomeClickingOnTheLogo(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.loginPage().getPageTitle());
        app.components().mainMenu().clickContact();
        Assertions.assertEquals("Contact", app.shopPage().getPageTitle());
        app.components().clickCompanyLogo();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
    }


}
