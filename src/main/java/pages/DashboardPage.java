package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DashboardPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(DashboardPage.class);
    private static final String PAGE_URL = "/";

    @FindBy(how = How.XPATH, using = "//img[@class='img-responsive']")
    private WebElement image;


    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Navigates to current page
     */
    public void gotoPage() {
        LOGGER.info("Navigate to:" + BASE_URL + PAGE_URL);
        navigateTo(PAGE_URL);
    }


}
