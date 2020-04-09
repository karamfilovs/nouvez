package CategoryPages;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ShopDesignerPage extends BasePage {

    private final String PAGE_URL = "shop/marketplace/seller/sellerlist";


    public ShopDesignerPage(WebDriver driver) {
        super(driver);
    }
}
