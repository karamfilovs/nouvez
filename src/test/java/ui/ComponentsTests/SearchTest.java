package ui.ComponentsTests;

import core.BaseTest;
import org.junit.jupiter.api.*;

public class SearchTest extends BaseTest {

    @BeforeEach
    public void beforeEach(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle()); }

    @Test
    @Tag("search")
    @DisplayName("MVP-6: Can search for existing designer full match")
    public void canSearchForDesigner(){
        app.homePage().searchProduct("Pippa Small");
        Assertions.assertEquals("Search results for: 'Pippa Small'", app.myAccountPage().getPageTitle());
        Assertions.assertEquals("False", app.homePage().checkIfAmountToolbarValueIsZero()); }

    @Test
    @Tag("search")
    @DisplayName("MVP-241: Can search for non-existing designer")
    public void canSearchForNonExistingDesigner(){
        app.homePage().searchProduct("Alex");
        Assertions.assertEquals("Search results for: 'Alex'", app.homePage().getPageTitle());
        Assertions.assertEquals("Your search returned no results.\n" +
                "Did you mean\n" + "alon\n" + "also", app.homePage().getSearchNoticeMessage()); }

    @Test
    @Tag("search")
    @DisplayName("MVP-6: Can search for existing product exact match")
    public void canSearchForProduct(){
        app.homePage().searchProduct("bracelet");
        Assertions.assertEquals("Search results for: 'bracelet'", app.homePage().getPageTitle());
        Assertions.assertEquals("False", app.homePage().checkIfAmountToolbarValueIsZero());}

    @Test
    @Tag("search")
    @DisplayName("MVP-162: Can search for existing product partial match")
    public void canSearchForProductByPartialMatch(){
        app.homePage().searchProduct("rin");
        Assertions.assertEquals("Search results for: 'rin'", app.homePage().getRelatedSearchTermText());
        Assertions.assertEquals("False", app.homePage().checkIfAmountToolbarValueIsZero());}

    @Test
    @Tag("search")
    @DisplayName("MVP-242: Can search for non-existing produc")
    public void canSearchForNonExistingProduct(){
        app.homePage().searchProduct("coat");
        Assertions.assertEquals("Search results for: 'coat'", app.homePage().getPageTitle());
        Assertions.assertEquals("Your search returned no results.\n" +
                "Did you mean\n" + "come\n" + "creat", app.homePage().getSearchNoticeMessage()); }

}
