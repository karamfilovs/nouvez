package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ShopByCategoryPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShopPage.class);
    private final String PAGE_URL = "/shop/shop-by-category.html";

    @FindAll({@FindBy(how = How.XPATH, using = "//div[@class='subcategories']/ul/li")})
    private List<WebElement> categoriesButtons;

    @FindAll({@FindBy(how = How.CSS, using = "div.filter-options-item")})
    private List<WebElement> filterByOptions;

    @FindAll({@FindBy(how = How.XPATH, using = "//ol[@id='show_above_products-cat']/li/a")})
    private List<WebElement> categoryOptionsDropDown;

    @FindAll({@FindBy(how = How.XPATH, using = " //ol[@id='show_above_products-price']//li/a")})
    private List<WebElement> priceRangeOptionsDropDown;

    @FindAll({@FindBy(how = How.XPATH, using = "//a[@class='swatch-option-link-layered mana-selected']/div")})
    private List<WebElement> colorOptionsDropDown;

    @FindAll({@FindBy(how = How.CSS, using = "div.swatch-option.text")})
    private List<WebElement> sizeOptionsDropDown;

    @FindAll({@FindBy(how = How.XPATH, using = "//ol[@id='show_above_products-stone']/li/a")})
    private List<WebElement> stoneOptionsDropDown;

    @FindBy(how = How.ID, using = "sorter")
    private WebElement sorter;

    @FindBy(how = How.CSS, using = "a.action.remove")
    private WebElement remover;

    @FindBy(how = How.CSS, using = "span.filter-value")
    private WebElement filterValue;

    public ShopByCategoryPage(WebDriver driver) { super(driver);}

    public void goToShopByCategoryPage() {
        LOGGER.info("Navigating to shop by category page");
        navigateTo(PAGE_URL);
    }

    /**
     * Clicks on a category from the Select a Category menu
     */
    public void clickOnCategoryButtonByName(String name) {
        clickWebElementByText(name,categoriesButtons); }

    /**
     * Clicks on an option from the filters
     */
    public void clickOnFilterByName(String name) {
        clickWebElementByText(name, filterByOptions); }


    /**
     * Selects category from the filter by drop-down menu in the Shop by Category page
     */
    public void filterByCategory(String name) {
        clickWebElementByText(name,categoryOptionsDropDown);}

    /**
     * Selects price range from the filter by drop-down menu in the Shop by Category page
     */
    public void filterByPrice(String option) {
        clickWebElementByText(option, priceRangeOptionsDropDown);}

        /**
     * Selects color from the filter by drop-down menu in the Shop by Category page
     */
    public void filterByColor(String name) {
        clickWebElementByText(name,colorOptionsDropDown);}

    /**
     * Selects size from the filter by drop-down menu in the Shop by Category page
     */
    public void filterBySize(String size) {
        clickWebElementByText(size,sizeOptionsDropDown);}


    /**
     * Selects stone type from the filter by drop-down menu in the Shop by Category page
     */
    public void filterByStone(String name) {
        clickWebElementByText(name, stoneOptionsDropDown);
    }

    public String getFilterValueText(){
        LOGGER.info("Getting filter value text");
        return getText(filterValue);
    }

    public void clickRemoverButton(){
        LOGGER.info("Clicking the remove filter button");
        click(remover);
    }
    /**
     *
     * @param sorter
     * @param optionVisibleTextToSelect the option in the dropdown you would like to see selected
     */
    public void setSorter(WebElement sorter, String optionVisibleTextToSelect) {
        waitForElementVisibility(sorter);
        Select select = new Select(sorter);
        select.selectByVisibleText(optionVisibleTextToSelect);
    }

}
