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
    private WebElement productRange;

    @FindAll({@FindBy(how = How.CSS, using = "div.filter-options-item")})
    private List<WebElement> filterByOptions;

    @FindAll({@FindBy(how = How.XPATH, using = "//ol[@id='show_above_products-metal']/li/a")})
    private List<WebElement> filterByMetalDropDownOptions;

    @FindAll({@FindBy(how = How.XPATH, using = "//ol[@id='show_above_products-gemstone']/li/a")})
    private List<WebElement> filterByGemsDropDownOptions;

    @FindAll({@FindBy(how = How.XPATH, using = "//ol[@id='show_above_products-price']/li/a")})
    private List<WebElement> filterByPriceDropDownOptions;

    @FindAll({@FindBy(how = How.XPATH, using = "//ol[@id='show_above_products-diamond_filter_colour']/li/a")})
    private List<WebElement> filterByDiamondDropDownOptions;

    @FindAll({@FindBy(how = How.XPATH, using = "//ol[@id='show_above_products-designer_name']/li/a")})
    private List<WebElement> filterByDesignerDropDownOptions;


    @FindAll({@FindBy(how = How.ID, using = "//span[@class='toolbar-number']")})
    private List<WebElement> numbersToolbar;

    @FindBy(how = How.CSS, using = "a.action.remove")
    private WebElement remover;

    @FindBy(how = How.CSS, using = "span.filter-value")
    private WebElement filterValue;

    public ShopByCategoryPage(WebDriver driver) {
        super(driver);
    }

    public void goToShopByCategoryPage() {
        LOGGER.info("Navigating to shop by category page");
        navigateTo(PAGE_URL);
    }

    /**
     * Clicks on a category from the Select a Category menu
     */
    public void clickOnCategoryButtonByName(String name) {
        clickWebElementByText(name, categoriesButtons);
    }

    /**
     * Clicks on a category from the Select a Category menu
     */
    public void clickOnFilterByName(String name) {
        LOGGER.info("Clicking on " + name + " filter");
        clickWebElementByText(name, filterByOptions);
    }

    /**
     * Clicks on product by name
     *
     * @param name
     */
    public void clickOnProductByName(String name) {
        scrollDownToElement(productRange);
        clickWebElementByText(name, products);
    }

    public String getFilterValueText() {
        LOGGER.info("Getting filter value text");
        return getText(filterValue); }

    public void clickRemoverButton() {
        LOGGER.info("Clicking the remove filter button");
        click(remover); }

    public void selectMetalFilterByName(String filterName, String metalName) {
        LOGGER.info("Selecting "+ metalName + "from metal filter options");
        clickOnFilterByName(filterName);
        clickWebElementByText(metalName, filterByMetalDropDownOptions); }

    public void selectGemsFilterByName(String filterName, String gemName) {
        LOGGER.info("Selecting "+ gemName + "from gems filter options");
        clickOnFilterByName(filterName);
        clickWebElementByText(gemName, filterByGemsDropDownOptions); }

    public void selectPriceFilterByRange(String filterName, String range) {
        LOGGER.info("Selecting "+ range + "from price filter options");
        clickOnFilterByName(filterName);
        clickWebElementByText(range, filterByPriceDropDownOptions); }

    public void selectDiamondsFilterByName(String filterName, String name) {
        LOGGER.info("Selecting "+ name + "from price filter options");
        clickOnFilterByName(filterName);
        clickWebElementByText(name, filterByDiamondDropDownOptions); }

    public void selectDesignerFilterByName(String filterName, String name) {
        LOGGER.info("Selecting "+ name + "from price filter options");
        clickOnFilterByName(filterName);
        clickWebElementByText(name, filterByDesignerDropDownOptions); }

    public String checkIfAmountToolbarValueIsZero() {
        LOGGER.info("Getting the value of the amount of items displayed");
        for(WebElement numberToolbar : numbersToolbar){
        if (Integer.parseInt(getText(numberToolbar)) == 0)
            return "True";}
        return "False"; }

}



