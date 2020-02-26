package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrandsPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(BrandsPage.class);
    private static final String PAGE_URL = "/brands";

    @FindBy(how = How.XPATH, using = "//ol[@class='breadcrumb ng-star-inserted']")
    private WebElement breadcrumb;

    @FindBy(how = How.CSS, using = "span.user_name")
    private WebElement userSection;


    public BrandsPage(WebDriver driver) {
        super(driver);
    }

    public void gotoPage() {
        LOGGER.info("Navigating to Brands page");
        navigateTo(PAGE_URL);
    }

    public String getBreadcrumbText() {
        return getText(breadcrumb);
    }

    public String getUserSectionText() {
        return getText(userSection);
    }

}
