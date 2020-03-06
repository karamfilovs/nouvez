package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProductListingPage extends BasePage {

    @FindBy(how = How.ID, using = "product-addtocart-button")
    private WebElement addToCartButton;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//a[@class='product-item-link']")
    })
    private List<WebElement> products;

    public ProductListingPage(WebDriver driver) {
        super(driver);
    }


    public void clickOnProductByName(String name) {
        products.forEach(product -> {
            if (getText(product).contains(name)) ;
            click(product);
        });
    }
}
