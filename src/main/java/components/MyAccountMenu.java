package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class MyAccountMenu extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainMenu.class);

    @FindBy(how = How.XPATH, using = "//a[text()='My Account']")
    private WebElement myAccount;

    @FindBy(how = How.XPATH, using = "//li[@class='link wishlist']")
    private WebElement myWishlist;


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
}
