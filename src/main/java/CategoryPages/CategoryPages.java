package CategoryPages;

import BackboneNavigationPages.AboutPage;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CategoryPages extends BasePage {

    private AboutPage aboutPage;



    public CategoryPages(WebDriver driver) {
        super(driver);
    }

    public AboutPage aboutPage() {
        if (aboutPage() == null) {
            return new AboutPage(driver);
        } else {
            return aboutPage();
        }
    }


}
