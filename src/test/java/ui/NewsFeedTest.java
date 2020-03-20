package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.DataGenerator;

public class NewsFeedTest extends BaseTest {

    @Test
    @Tag("positive")
    @Tag("news-feed")
    @DisplayName("MVP-X: Can subscribe to news feed with new email")
    public void canSubscribeToNewsFeed() {
        String email = DataGenerator.generateRandomString(8) + "@" + "qaground.com";
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.newsFeedPage().subscribeToNewsFeed(email);
    }


    @Test
    @Tag("positive")
    @Tag("news-feed")
    @DisplayName("MVP-X: Cant subscribe to news feed with used email")
    public void cantSubscribeToNewsFeedWithAlreadyUsedEmail() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.newsFeedPage().subscribeToNewsFeed("alex@pragmatic.bg");
        Assertions.assertEquals("text", app.newsFeedPage().getNewsFeedError());
    }


    @Test
    @Tag("negative")
    @Tag("news-feed")
    @DisplayName("MVP-X: Cant subscribe to news feed with invalid email")
    public void cantSubscribeToNewsFeedWithInvalidEmail() {
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.homePage().getPageTitle());
        app.newsFeedPage().subscribeToNewsFeed("alex@pragmatic");
        Assertions.assertEquals("Please enter a valid email address (Ex: johndoe@domain.com).", app.newsFeedPage().getNewsFeedError());
    }
}
