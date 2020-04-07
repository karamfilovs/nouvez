package CategoryPages;

import components.MainMenu;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CategoryPages extends BasePage {

    private NecklacesPage necklacesPage;

    public CategoryPages(WebDriver driver) {
        super(driver);
    }

    public NecklacesPage necklacesPage() {
        if (necklacesPage == null) {
            return new NecklacesPage(driver);
        } else {
            return necklacesPage;
        }
    }


}
