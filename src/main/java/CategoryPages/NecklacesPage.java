package CategoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import java.util.List;

public class NecklacesPage extends BasePage {

    private final String PAGE_URL = "shop/shop-by-category/necklaces.html";
    @FindAll(@FindBy(how = How.XPATH, using = "//ol[@id='show_above_products-price']/li"))
    private List<WebElement> priceBandOptions;

    public NecklacesPage(WebDriver driver) {
        super(driver);
    }

    public void selectPriceBand(String option) {
        LOGGER.info("Selecting price band" + option);
        for (WebElement priceBandOption : priceBandOptions)
            if (getText(priceBandOption).contains(option)) {
                click(priceBandOption);
                break;
            }
    }
}
