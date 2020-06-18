package pages.ProductPages;

import com.fasterxml.jackson.core.PrettyPrinter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ShopByCategoryPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShopPage.class);
    private final String PAGE_URL = "/shop/shop-by-category.html";

    @FindAll({@FindBy(how = How.XPATH, using = "//div[@class='subcategories']/ul/li")})
    private List<WebElement> categoriesButtons;

    @FindAll({@FindBy(how = How.XPATH, using = "//strong[@class='product name product-item-name']")})
    private List<WebElement> products;

    @FindBy(how = How.XPATH, using = "//ol[@class='products list items product-items']")
    private  WebElement  productRange;

    @FindAll({@FindBy(how = How.CSS, using = "div.filter-options-item")})
    private List<WebElement> filterByOptions;

    @FindAll({@FindBy(how = How.XPATH, using = "//ol[@id='show_above_products-metal']/li/a")})
    private List<WebElement> filterByMetalDropDownOptions;

    @FindAll({@FindBy(how = How.XPATH, using = "//ol[@id='show_above_products-gemstone']/li/a")})
    private List<WebElement> filterByGemsDropDownOptions;

    @FindAll({@FindBy(how = How.XPATH, using = "//ol[@id='show_above_products-price']/li/a")})
    private List<WebElement> filterByPriceDropDownOptions;

    @FindAll({@FindBy(how = How.CSS, using = "//ol[@id='show_above_products-diamond_filter_colour']/li/a")})
    private List<WebElement> filterByDiamondDropDownOptions;

    @FindAll({@FindBy(how = How.CSS, using = "//ol[@id='show_above_products-designer_name']/li/a")})
    private List<WebElement> filterByDesignerDropDownOptions;


    @FindBy(how = How.ID, using = "toolbar-amount")
    private WebElement amountToolbar;

    @FindBy(how = How.CSS, using = "a.action.remove")
    private WebElement remover;

    @FindBy(how = How.CSS, using = "span.filter-value")
    private WebElement filterValue;

    public ShopByCategoryPage(WebDriver driver) { super(driver);}

    public void goToShopByCategoryPage() {
        LOGGER.info("Navigating to shop by category page");
        navigateTo(PAGE_URL); }

    /**
     * Clicks on a category from the Select a Category menu
     */
    public void clickOnCategoryButtonByName(String name) {
        clickWebElementByText(name,categoriesButtons); }

    /**
     * Clicks on product by name
     * @param name
     */
    public void clickOnProductByName(String name){
        scrollDownToElement(productRange);
        clickWebElementByText(name, products );}

    public String getFilterValueText(){
        LOGGER.info("Getting filter value text");
        return getText(filterValue); }

    public void clickRemoverButton(){
        LOGGER.info("Clicking the remove filter button");
        click(remover); }

    /**
     * Clicks on an option from the filters
     */
    public List<String> storeFilterByMetalValues(String filterBy) {
        LOGGER.info("Clicks on " + filterBy + " filter");
        List<String> metalOptionsList = new ArrayList<>();
        clickWebElementByText(filterBy, filterByOptions);
        for( WebElement metalOptions : filterByMetalDropDownOptions){
            metalOptionsList.add(metalOptions.getText());}
    return metalOptionsList;}

//    От тук нататък идеята ми е да си направя параметъризиран тест, чиито сорс да е metalOptionsList



}
