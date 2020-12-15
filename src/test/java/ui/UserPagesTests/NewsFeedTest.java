package ui.UserPagesTests;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.DataGenerator;

public class NewsFeedTest extends BaseTest {

    @Test
    @Tag("news-feed")
    @DisplayName("MVP-21: Can subscribe to news feed with new email")
    public void canSubscribeToNewsFeed() {
        String email = DataGenerator.generateRandomString(8) + "@" + "qaground.com";
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.newsFeedPage().subscribeToNewsFeed(email);
        Assertions.assertEquals("Thank you for your subscription.", app.newsFeedPage().getSuccessMessage());
    }



    @Test
    @Tag("news-feed")
    @DisplayName("MVP-24: Cant subscribe to news feed with used email")
    public void cantSubscribeToNewsFeedWithAlreadyUsedEmail() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.newsFeedPage().subscribeToNewsFeed("alex@pragmatic.bg");
        Assertions.assertEquals("This email address is already subscribed.", app.newsFeedPage().getNewsFeedError());
    }


    @Test
    @Tag("news-feed")
    @DisplayName("MVP-23: Cant subscribe to news feed with invalid email")
    public void cantSubscribeToNewsFeedWithInvalidEmail() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.newsFeedPage().subscribeToNewsFeed("alex@pragmatic");
        Assertions.assertEquals("Please enter a valid email address (Ex: johndoe@domain.com).", app.newsFeedPage().getEmailValidationError());
    }

    @Test
    @Tag("news-feed")
    @DisplayName("MVP-22: Cant subscribe to news feed with blank email")
    public void cantSubscribeToNewsFeedWithBlankEmail(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.newsFeedPage().enterEmail( "  ");
        Assertions.assertEquals("false", app.newsFeedPage().subscribeButtonIsVisible()); }

}
