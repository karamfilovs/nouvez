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

    @FindBy(how = How.XPATH, using = "//li[@class='link wishlist']")
    private WebElement myWishlistLink;

    @FindBy(how = How.CSS, using = ".icon.icon-account")
    private WebElement myAccountIcon;

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
     * Clicks on My Account category link
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
        click(myWishlistLink);
        waitForFullPageOrJsAjaxToLoad();
    }
    /**
     * Clicks on My account icon
     */
    public void clickMyAccountIcon() {
        LOGGER.info("Clicking on My Account icon");
        click(myAccountIcon);
    }
    /**
     * Clicks on Create an account link
     */
    public void clickCreateAnAccount() {
        LOGGER.info("Clicking on Create an Account link");
        click(createAccountLink);
    }
    /**
     * Clicks on Sign out link
     */
    private void clickSignOut() {
        LOGGER.info("Clicking on Sign out link");
        click(signInAndOutLink);
    }
    /**
     * Clicks on Sign in link
     */
    private void clickSignIn() {
        LOGGER.info("Clicking on Sign out link");
        click(signInAndOutLink);
    }
    /**
     * Logs out
     */
    public void signInAndOut() {
        clickMyAccountIcon();
        clickSignOut();
    }
    /**
     * Logs in
     */
    public void signIn() {
        clickMyAccountIcon();
        clickSignIn();
    }
}
