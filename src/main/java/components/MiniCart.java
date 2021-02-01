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


    @FindBy(how = How.XPATH, using = "//span[@class='icon icon-arrow-head-left icon-sm']")
    private WebElement closeMiniBasketButton;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Winkelmandje')]")
    private WebElement miniCartTitle;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-light cart-item-remove-button']")
    private WebElement removeItemButton;

    @FindBy(how = How.XPATH, using = "//select[@name='quantity']")
    private WebElement quantityDropDown;

    @FindBy(how = How.ID, using = "addPromotionOffcanvasCartInput")
    private WebElement voucherCodeField;

    @FindBy(how = How.ID, using = "addPromotionOffcanvasCart")
    private WebElement addVoucherButton;

    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-block begin-checkout-btn btn-primary']")
    private WebElement checkoutButton;

    @FindBy(how = How.XPATH, using = "//div[@class='cart-item-price']")
    private WebElement totalPrice;


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
     * Method that clicks the checkout button in the mini cart
     */
    public void clickCheckOut() {
        LOGGER.info("Clicking checkout button in the mini cart");
        click(checkoutButton);
    }

    public void selectItemQuantity(String quantity){
        LOGGER.info("Selects item quantity from the drop down");
       selectDropDownOptionByVisibleText(quantityDropDown, quantity); }


}
