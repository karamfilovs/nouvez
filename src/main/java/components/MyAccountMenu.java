package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class MyAccountMenu extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyAccountMenu.class);

    @FindBy(how = How.XPATH, using = "//a[text()='My Account']")
    private WebElement myAccountLink;

    @FindBy(how = How.CSS, using = "li.link.wishlist")
    private WebElement myWishListLink;

    @FindBy(how = How.CSS, using = ".icon.icon-account")
    private WebElement myAccountDropDown;

    @FindBy(how = How.XPATH, using = "//a[text()='Create an Account']")
    private WebElement createAccountLink;

    @FindBy(how = How.XPATH, using = "//li[@class='authorization-link']")
    private WebElement signInAndOutLink;

    @FindBy(how = How.CSS, using = "a#invitation-send-link")
    private WebElement sendInvitationsLink;


    public MyAccountMenu(WebDriver driver) {
        super(driver);
    }

    /**
     * Clicks on My Account link
     */
    public void clickOnMyAccount() {
        LOGGER.info("Clicking on My Account link from main menu");
        click(myAccountLink);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on My Wish List link
     */
    public void clickOnMyWishList() {
        LOGGER.info("Clicking on My Wish List link from main menu");
        click(myWishListLink);
        waitForFullPageOrJsAjaxToLoad();
    }
    /**
     * Clicks on My account drop-down
     */
    public void clickMyAccountDropDown() {
        LOGGER.info("Clicking on My Account drop-down");
        click(myAccountDropDown);
    }
    /**
     * Clicks on Create an account link
     */
    public void clickCreateAnAccount() {
        LOGGER.info("Clicking on Create an Account link");
        click(createAccountLink);
    }

    public void signInAndOut() {
        LOGGER.info("Clicking on Sign in and Sign Out links from my account drop-down");
        click(signInAndOutLink);
    }

}
