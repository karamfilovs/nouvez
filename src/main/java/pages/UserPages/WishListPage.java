package pages.UserPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.List;

public class WishListPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(WishListPage.class);

    @FindBy(how = How.CSS, using = "p.toolbar-amount")
    private WebElement amountToolbar;

    @FindBy(how = How.CSS, using = "select#limiter")
    private WebElement limiterDropDown;

    @FindBy(how = How.XPATH, using = "//option[@selected='selected']")
    private WebElement currentLimiterOption;

    @FindAll({@FindBy(how = How.XPATH, using = "//ol[@class='product-items']")})
    private List<WebElement> itemsList;

    @FindBy(how = How.XPATH, using = "//button[@class='action decreaseQty']")
    private WebElement decreaseQuantityButton;

    @FindBy(how = How.XPATH, using = "//input[@class='input-text qty']")
    private WebElement itemQuantityCounter;

    @FindBy(how = How.XPATH, using = "//button[@class='action increaseQty']")
    private WebElement increaseQuantityButton;

    @FindBy(how = How.XPATH, using = "//button[@class='action tocart primary']")
    private WebElement addToCartButton;

    @FindBy(how = How.CSS, using = "a.action.edit")
    private WebElement editButton;

    @FindBy(how = How.CSS, using = "//a[@class='btn-remove action delete']")
    private WebElement removeButton;

    @FindBy(how = How.CSS, using = "a.action.back")
    private WebElement backButton;

    @FindBy(how = How.CSS, using = "button.action.update")
    private WebElement updateWishListButton;

    @FindBy(how = How.CSS, using = "button.action.share")
    private WebElement shareWishListButton;

    @FindBy(how = How.XPATH, using = "//button[@data-role='all-tocart']")
    private WebElement addAllToCartButton;

    @FindBy(how = How.XPATH, using = "a.product-item-photo")
    private WebElement productItem;

    public WishListPage(WebDriver driver) {
        super(driver);
    }

    public void selectQuantityOfShownItems(String optionVisibleTextToSelect) {
        waitForElementVisibility(limiterDropDown);
        Select select = new Select(limiterDropDown);
        select.selectByVisibleText(optionVisibleTextToSelect);
    }

    public String checkLimiterQuantity() {
        LOGGER.info("Getting the quantity displayed at the limiter tool");
        return getText(currentLimiterOption).trim();
    }

    public String checkItemQuantity() {
        LOGGER.info("Getting the quantity of items to be added to cart");
        return getText(itemQuantityCounter) ;
    }

    public void clickItemByName(String name) {
        LOGGER.info("Clicking on:" + name);
        for (WebElement item : itemsList) {
            if (getText(item).contains(name)) {
                click(item);
                break;
            }
        }
    }

    public void increaseItemQuantity() {
        LOGGER.info("Clicking on increase item quantity button");
        hoverOver(increaseQuantityButton);
        click(increaseQuantityButton);
    }

    public void decreaseItemQuantity() {
        LOGGER.info("Clicking on decrease item quantity button");
        click(decreaseQuantityButton);
    }

    public void addToCart() {
        LOGGER.info("Adding item to cart");
        click(addToCartButton);
    }

    public void editItemFromWishlist() {
        LOGGER.info("Editing the item added to wish list");
        click(editButton);
    }

    public void removeItemFromWishList() {
        LOGGER.info("Removing the item added to wish list");
        click(removeButton);
    }

    public void goBackToMyAccount() {
        LOGGER.info("Going back to my account page");
        click(backButton);
    }

    public void updataWishlist() {
        LOGGER.info("Updating wish list");
        click(updateWishListButton);
    }

    public void clickShareWishList() {
        LOGGER.info("Clicking share wish list button");
        click(shareWishListButton);
    }

    public void addAllItemsToCart() {
        LOGGER.info("Adding all items to cart");
        click(addAllToCartButton);
    }

}
