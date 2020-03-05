package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);
    private final String PAGE_URL = "/";


    @FindBy(how = How.CSS, using = ".pagebuilder-collage-content > div:nth-child(1) > div:nth-child(1) > p:nth-child(3) > a:nth-child(1)")
    private WebElement exploreButton;


    @FindBy(how = How.CSS, using = "#maincontent > div.columns > div.column.main > div.product-slider > div > div.special-link > p > a")
    private WebElement viewLatestProductsButton;

    @FindBy(how = How.CSS, using = "#maincontent > div.columns > div.column.main > div.featured-brands > div > div.special-link > p > a")
    private WebElement shopBrandsButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage gotoHomePage() {
        LOGGER.info("Navigating to Home page");
        navigateTo(PAGE_URL);

        return this;
    }

    public void clickExploreButton() {
        LOGGER.info("Clicking on explore button");
        click(exploreButton);
    }

    public void clickViewLatestProductsButton() {
        LOGGER.info("Clicking on view Latest Products button");
        click(viewLatestProductsButton);
    }

    public void clickShopBrandsButton() {
        LOGGER.info("Clicking on explore button");
        click(shopBrandsButton);
    }

    public void clickCurrencyIcon() {
    }
}



