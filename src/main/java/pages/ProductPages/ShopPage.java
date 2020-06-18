package pages.ProductPages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ShopPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShopPage.class);
    private final String PAGE_URL = "/shop.html";

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    public ShopPage gotoShopPage() {
        LOGGER.info("Navigating to Shop page");
        navigateTo(PAGE_URL);

        return this;
    }

}
