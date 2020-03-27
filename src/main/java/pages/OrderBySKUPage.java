package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderBySKUPage extends BasePage {

    @FindBy(how = How.ID, using = "id-items0sku")
    private WebElement skuField;

    @FindBy(how = How.ID, using = "id-items0qty")
    private WebElement quantityField;

    @FindBy(how = How.CSS, using = "button.action.add")
    private WebElement addRowButton;

    @FindBy(how = How.CSS, using = "button.action.tocartd")
    private WebElement addToCartButton;

    @FindBy(how = How.CSS, using = "customer_sku_csv")
    private WebElement chooseFileButton;

    @FindBy(how = How.CSS, using = "button.action.reset")
    private WebElement resetButton;

    @FindBy(how = How.CSS, using = "button.action.remove")
    private WebElement removeRowButton;

    public OrderBySKUPage(WebDriver driver) {
        super(driver);
    }

    public void addItemBySku(String sku, String Qty) {
        LOGGER.info("Ordering products by sku: " + sku + " adding quantity " +Qty);
        typeText(skuField, sku);
        typeText(quantityField,Qty);
        click(addToCartButton);
    }

}
