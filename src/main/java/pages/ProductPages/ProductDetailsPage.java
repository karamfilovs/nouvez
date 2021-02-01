package pages.ProductPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import java.util.List;

public class ProductDetailsPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//button[@class='btn-primary-orange btn-buy']")
    private WebElement addToCartButton;

    @FindBy(how = How.XPATH, using = "//h2[@itemprop='name']")
    private WebElement itemName;

    public ProductDetailsPage(WebDriver driver) { super(driver); }

    public void clickAddToCartButton() {
        LOGGER.info("Clicking Add to cart button");
        scrollDownToElement(addToCartButton);
        click(addToCartButton); }

    public String getItemName(){
        LOGGER.info("Getting the name of the item page we are on");
        return getText(itemName); }

    public void navigateToSpecificProduct(String productURL) { navigateTo(productURL); }
}
