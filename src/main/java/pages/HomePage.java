package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);
    private final String PAGE_URL = "/";


    @FindBy(how = How.CSS, using = "#switcher-currency-trigger-nav > span:nth-child(1)")
    private WebElement currencyIcon;

    @FindBy(how = How.CSS, using = ".icon-search")
    private WebElement searchIcon;

    @FindBy(how = How.CSS, using = ".icon.icon-account")
    private WebElement myAccountIcon;

    @FindBy(how = How.CSS, using = "ul.header > li:nth-child(1) > a:nth-child(1)")
    private WebElement myAccountButton;

    @FindBy(how = How.CSS, using = "li.link > a:nth-child(1)")
    private WebElement myWishListButton;

    @FindBy(how = How.CSS, using = "ul.header > li:nth-child(4) > a:nth-child(1)")
    private WebElement createAccountButton;

    @FindBy(how = How.CSS, using = ".icon-heart")
    private WebElement wishListButton;

    @FindBy(how = How.CSS, using = ".icon-cart")
    private WebElement cartIcon;

    @FindBy(how = How.ID, using = "newsletter")
    private WebElement newsletterField;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void gotoHomePage() {
        LOGGER.info("Navigating to Home page");
        navigateTo(PAGE_URL);
    }
    public void clickCurrencyIcon() {
        LOGGER.info("Clicking Login button");
        click(currencyIcon);
    }
    public String getPageTitle() {
        return getText(pageTitle);
    }
}
