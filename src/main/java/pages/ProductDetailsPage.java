package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetailsPage extends BasePage {

    @FindBy(how = How.ID, using = "product-addtocart-button")
    private WebElement addToCartButton;

    @FindBy(how = How.XPATH, using = "//span[@class='price']")
    private WebElement productPrice;


    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCartButton(){
        LOGGER.info("Clicking Add to cart button");
        click(addToCartButton);
    }

    public String getProductPrice(){
        return getText(productPrice);
    }
}
