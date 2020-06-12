package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProductDetailsPage extends BasePage {

    @FindBy(how = How.ID, using = "product-addtocart-button")
    private WebElement addToCartButton;

    @FindBy(how = How.XPATH, using = "//h1")
    private WebElement header;

    @FindBy(how = How.XPATH, using = "//span[@class='price']")
    private WebElement productPrice;

    @FindBy(how = How.XPATH, using = "//span[@class='product-designer']")
    private WebElement designerName;

    @FindBy(how = How.XPATH, using = "//a[@role='button']")
    private WebElement addToWishListLink;

    @FindBy(how = How.XPATH, using = "//div[@data-network='sharethis']")
    private WebElement shareLink;

    @FindBy(how = How.ID, using = "custom-product-whishlist-popup")
    private WebElement wishListPopUpp;

    @FindAll({@FindBy(how = How.XPATH, using = "//div[@class='st-btn']")})
    private List<WebElement> shareToOptions;


    public ProductDetailsPage(WebDriver driver) { super(driver); }

    public void clickAddToCartButton() {
        LOGGER.info("Clicking Add to cart button");
        click(addToCartButton); }


    public String getDesignerNameText(){
        LOGGER.info("Getting the text of the designer field");
        return getText(designerName); }

    public void clickAddToWishList() {
        LOGGER.info("Clicking Add to Wish-list");
        click(addToWishListLink); }

    public void clickShareLink() {
        click(shareLink); }

    public void shareAnItemByText(String shareTo){
        LOGGER.info("Clicking Share link and then clicking "+ shareTo+" on Share this");
        clickShareLink();
        switchToActiveElement();
        for(WebElement shareToOption : shareToOptions){
            if (getText(shareToOption).contains(shareTo)) {
                click(shareToOption);
                break; } } }

    public String getTextOfWishListPopUp() {
        LOGGER.info("Getting the text of the pop up that appears after clicking the wish-list icon ");
        return getText(wishListPopUpp); }

    public String getProductPrice() {
        return getText(productPrice); }

    public void navigateToSpecificProduct(String productURL) { navigateTo(productURL); }
}
