package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetailsPage extends BasePage {

    @FindBy(how = How.ID, using = "product-addtocart-button")
    private WebElement addToCartButton;

    @FindBy(how = How.XPATH, using = "//h1")
    private WebElement header;

    @FindBy(how = How.XPATH, using = "//span[@class='price']")
    private WebElement productPrice;

    @FindBy(how = How.XPATH, using = "//span[@class='product-designer']")
    private WebElement designerName;

    //span[text()='Theo Fennell']

    @FindBy(how = How.XPATH, using = "//a[@data-action='add-to-wishlist']")
    private WebElement addToWishListLink;

    @FindBy(how = How.XPATH, using = "//div[@data-network='sharethis']")
    private WebElement shareLink;


    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton() {
        LOGGER.info("Clicking Add to cart button");
        click(addToCartButton); }

    public String getDesignerNameText(){
        LOGGER.info("Getting the text of the designer field");
        return getText(designerName); }

    public void clickAddToWishList() {
        LOGGER.info("Clicking Add to Wishlist");
        click(addToWishListLink); }

    public void clickShareLink() {
        LOGGER.info("Clicking Share link");
        click(shareLink); }

    public String getProductPrice() {
        return getText(productPrice);
    }

    public void navigateToSpecificProduct(String productURL) {
        navigateTo(productURL);
    }
}
