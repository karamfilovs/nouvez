package pages.UserPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class CartPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(CartPage.class);
    private final String PAGE_URL = "/checkout/cart/";

    @FindBy(how = How.XPATH, using = "//a[@class='action continue']")
    private WebElement continueShoppingButton;

    @FindBy(how = How.ID, using = "qty")
    private WebElement selectQTYDropDown;

    @FindBy(how = How.CSS, using = "a.use-ajax.action")
    private WebElement moveToWishListButton;

    @FindBy(how = How.CSS, using = "a.action.action-delete")
    private WebElement removeButton;

    @FindBy(how = How.ID, using = "coupon_code")
    private WebElement couponCodeField;

    @FindBy(how = How.CSS, using = "button.action.apply")
    private WebElement applyCouponButton;

    @FindBy(how = How.XPATH, using = "//button[@title='Proceed to Checkout']")
    private WebElement checkoutButton;

    @FindBy(how = How.XPATH, using = "//span[@data-th='Subtotal']")
    private WebElement productTotal;

    @FindBy(how = How.CSS, using = "span.cart-price")
    private WebElement productPrice;

    @FindBy(how = How.XPATH, using = "//div[@class='message-error error message']")
    private WebElement errorMessage;


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void gotoCartPage() {
        LOGGER.info("Navigating to Basket page");
        navigateTo(PAGE_URL); }

    public void clickContinueShoppingButton() {
        LOGGER.info("Click continue shopping button");
        continueShoppingButton.click(); }

    public CartPage selectQuantity(String quantity) {
        LOGGER.info("Setting the quantity to "+ quantity);
        super.selectDropDownOptionByVisibleText(selectQTYDropDown, quantity);
        return this; }

    public void clickMoveToWishlistButton() {
        LOGGER.info("Click move to wishlist button");
        moveToWishListButton.click(); }

    public void clickRemoveButton() {
        LOGGER.info("Click remove button");
        removeButton.click(); }

    public void enterCouponCode(String couponCode) {
        LOGGER.info("Entering coupon code:" + couponCode);
        typeText(couponCodeField, couponCode); }

    public void clickApplyCouponButton() {
        LOGGER.info("Click apply coupon button");
        applyCouponButton.click(); }

    public void clickCheckoutButton() {
        LOGGER.info("Click checkout button");
        checkoutButton.click(); }

    public String getProductTotalPrice() {
        LOGGER.info("Getting product total price");
        return getText(productTotal).substring(1).replace(",","") .replace(".","");}

    public String getProductPrice() {
        LOGGER.info("Getting product price");
        return getText(productPrice).substring(1).replace(",","").replace(".",""); }

    public String getSelectedQuantity() {
        LOGGER.info("Getting the number of selected quantity");
        return getDropDownOption(selectQTYDropDown).trim(); }

    public String getErrorMessageText() {
        LOGGER.info("Getting the text of the error message");
        return getDropDownOption(errorMessage); }

    public Integer calculateTotalPrice() {
        LOGGER.info("Calculating the total cart price");
        int itemQuantity = Integer.parseInt(getSelectedQuantity());
        int price = Integer.parseInt(getProductPrice());
        int total = itemQuantity * price;
        return total; }
}
