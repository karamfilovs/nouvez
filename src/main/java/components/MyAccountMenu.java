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
    private WebElement myAccount;

    @FindBy(how = How.XPATH, using = "//li[@class='link wishlist']")
    private WebElement myWishlist;

    @FindBy(how = How.XPATH, using = "//li[@class='authorization-link']")
    private WebElement signOutLink;

    @FindBy(how = How.CSS, using = ".icon.icon-account")
    private WebElement myAccountIcon;


    private WebElement create;
    public MyAccountMenu(WebDriver driver) {
        super(driver);
    }

    /**
     * Clicks on My Account category link
     */
    public void clickOnMyAccount() {
        LOGGER.info("Clicking on My Account link from main menu");
        click(myAccount);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on My Wish List category link
     */
    public void clickOnMyWishList() {
        LOGGER.info("Clicking on My Wish List link from main menu");
        click(myWishlist);
        waitForFullPageOrJsAjaxToLoad();
    }

    public void clickMyAccountIcon () {
        LOGGER.info("Clicking on My Account icon");
        click(myAccountIcon);
    }

    private void clickSignOutLink () {
        LOGGER.info("Clicking on Sign out link");
        click(signOutLink);
    }

    /**
     * clicks logout button
     */
    public void signOut() {
        clickMyAccountIcon();
        clickSignOutLink();
    }

}
