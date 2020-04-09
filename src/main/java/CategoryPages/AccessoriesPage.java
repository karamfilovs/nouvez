package CategoryPages;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AccessoriesPage extends BasePage {

    private final String PAGE_URL = "shop/shop-by-category/accessories.html";


    public AccessoriesPage(WebDriver driver) {
        super(driver);
    }
}
