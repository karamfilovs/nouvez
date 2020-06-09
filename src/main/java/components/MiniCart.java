package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class MiniCart extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MiniCart.class);


    @FindBy(how = How.ID, using = "btn-minicart-close")
    private WebElement closeMiniBasketButton;

    @FindBy(how = How.CSS, using = "div.minicart-title")
    private WebElement miniCartTitle;

    @FindBy(how = How.CSS, using = "a.action.delete")
    private WebElement removeItemButton;

    @FindBy(how = How.CSS, using = "a.action.viewcart")
    private WebElement viewBagButton;

    @FindBy(how = How.ID, using = "top-cart-btn-checkout")
    private WebElement checkoutButton;

    @FindBy(how = How.CSS, using = "button.action-primary.action-accept")
    private WebElement ok;

    @FindBy(how = How.CSS, using = "button.action-secondary.action-dismiss")
    private WebElement cancel;

    @FindBy(how = How.CSS, using = "span.counter-number")
    private WebElement counter;

    public MiniCart(WebDriver driver) {
        super(driver);
    }

    /**
     * Method that closes the mini cart
     */
    public void closeMiniCart() {
        LOGGER.info("Closing mini cart");
        click(closeMiniBasketButton);
    }

    /**
     * Method that gets the mini cart title
     *
     * @return
     */
    public String getMiniCartTitle() {
        LOGGER.info("Getting mini cart title");
        return getText(miniCartTitle);
    }

    /**
     * Method that removes items from the mini cart
     */
    public void removeItem() {
        LOGGER.info("Removing item from the mini cart");
        click(removeItemButton);
    }

    /**
     * Method that clicks the view bag button in the mini cart
     */
    public void viewBag() {
        LOGGER.info("Clicking view bag button in the mini cart");
        click(viewBagButton);
    }

    /**
     * Method that clicks the checkout button in the mini cart
     */
    public void clickCheckOut() {
        LOGGER.info("Clicking checkout button in the mini cart");
        click(checkoutButton);
    }

    /**
     * Method that clicks OK button at the confirmation popup
     */
    public void checkOK() {
        LOGGER.info("Clicking OK button in the mini cart confirmation popup");
        click(ok);
    }

    /**
     * Method that clicks Cancel button at the confirmation popup
     */
    public void checkCancel() {
        LOGGER.info("Clicking Cancel button in the mini cart confirmation popup");
        click(cancel);
    }

    /**
     * Method that returns the number of items from the mini cart counter
     *
     * @return
     */
    public String getCounterNumber() {
        LOGGER.info("Getting the number of items in the mini cart");
        return getText(counter);
    }
}
