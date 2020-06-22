package pages.ProductPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import java.util.List;

public class ProductListingPage extends BasePage {
    private final String PAGE_URL = "/shop/shop-by-category.html";

    @FindBy(how = How.ID, using = "product-addtocart-button")
    private WebElement addToCartButton;

    @FindAll({@FindBy(how = How.CSS, using = "a.product-item-link")})
    private List <WebElement> products;

    @FindAll({@FindBy(how = How.XPATH, using = "//strong[@class='product name product-item-name']/a")})
    private List<WebElement> productNames;

    public ProductListingPage(WebDriver driver) {
        super(driver);
    }

    public void gotoProductListingsPage() {
        LOGGER.info("Navigating to product listings page");
        navigateTo(PAGE_URL);
    }

    public void clickProductByName(String productName){
        LOGGER.info("Clicking element with text :" + productName);
        for (WebElement curProduct : productNames) {
            if (getText(curProduct).contains(productName)) {
                click(curProduct);
                break; } } }

    public void clickFirstProduct(){
        LOGGER.info("Clicking on the first product");
        for(WebElement product : products){
            click(product);
        break; }}
    }
