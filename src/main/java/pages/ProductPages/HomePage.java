package pages.ProductPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);
    private final String PAGE_URL = "";

    @FindBy(how = How.XPATH, using = "//div[@class='message notice']")
    private WebElement searchMessage;

    @FindBy(how = How.CSS, using = "span.base")
    private WebElement relatedSearchTerm;

    @FindBy(how = How.XPATH, using = "//a[@title='Explore']")
    private WebElement exploreButton;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'View Latest Products')]")
    private WebElement viewLatestProductsButton;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Shop Brands')]")
    private WebElement shopBrandsButton;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Shop Our Minimal Collection')]")
    private WebElement shopOurMinimalCollectionButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void gotoHomePage() {
        LOGGER.info("Navigating to Home page");
        navigateTo(PAGE_URL);
    }

    public String getSearchNoticeMessage(){
        return getText(searchMessage);
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
        LOGGER.info("Clicking on shop brands button");
        click(shopBrandsButton);
    }

    public void clickShopOurMinimalCollectionButton() {
        LOGGER.info("Clicking on shop our minimal collection button");
        click(shopOurMinimalCollectionButton);
    }
    public String getRelatedSearchTermText(){
        return getText(relatedSearchTerm);
    }

}



