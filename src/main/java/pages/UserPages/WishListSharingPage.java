package pages.UserPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class WishListSharingPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(WishListPage.class);

    @FindBy(how = How.ID, using = "email_address")
    private WebElement emailAddressesArea;

    @FindBy(how = How.CSS, using = "button.action.submit.primary")
    private WebElement shareWishListButton;

    @FindBy(how = How.CSS, using = "a.action.back")
    private WebElement backButton;

    @FindBy(how = How.ID, using = "message")
    private WebElement messageArea;

    @FindBy(how = How.ID, using = "email_address-error")
    private WebElement emailErrorMessage;

    @FindBy(how = How.CSS, using = "div.message-success")
    private WebElement successMessage;

    public WishListSharingPage(WebDriver driver) {
        super(driver);
    }

    public void clickBackButton() {
        LOGGER.info("Clicking Back button");
        click(backButton);
    }

    public void clickShareWishListButton() {
        LOGGER.info("Clicking Share Wish List button");
        click(shareWishListButton);
    }

    public void enterEmails(String emails) {
        LOGGER.info("Entering emails:" + emails);
        typeText(emailAddressesArea, emails);
    }

    private String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }

    public void enterMessage(String message) {
        LOGGER.info("Entering message:" + message);
        typeText(messageArea, message);
    }

    public String getSuccessMessage() {
        return getText(successMessage);
    }

    public String getEmailAddressError() {
        return getText(emailErrorMessage);
    }
}
