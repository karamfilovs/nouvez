package CategoryPages;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ShopByPricePage extends BasePage {

    private final String PAGE_URL = "shop/shop-by-category/shop-by-price.html";


    public ShopByPricePage(WebDriver driver) {
        super(driver);
    }
}
