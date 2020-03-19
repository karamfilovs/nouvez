package ui;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {


    @Test
    @Tag("negative")
    @DisplayName("MVP-X: Can search for existing product")
    public void canSearchForExistingProduct(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.homePage().searchProduct("Bulgari");
        Assertions.assertEquals("Search results for: 'Bulgari'", app.myAccountPage().getPageTitle());
    }

    @Test
    @Tag("negative")
    @DisplayName("MVP-X: Can search for non-existing product")
    public void canSearchForNonExistingProduct(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.homePage().searchProduct("Alex");
        Assertions.assertEquals("Search results for: 'Bulgari'", app.myAccountPage().getPageTitle());
    }

}
