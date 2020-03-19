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

    @FindBy(how = How.CSS, using = "a.action.delete")
    private WebElement removeItemButton;

    @FindBy(how = How.CSS, using = "a.action.viewcart")
    private WebElement viewBagButton;

    @FindBy(how = How.ID, using = "top-cart-btn-checkout")
    private WebElement checkoutButton;


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
    public void checkOut() {
        LOGGER.info("Clicking checkout button in the mini cart");
        click(checkoutButton);
    }
}
