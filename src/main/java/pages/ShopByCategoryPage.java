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


    @FindAll({@FindBy(how = How.XPATH, using = "//ol[@id='show_above_products-cat']/li")})
    private List<WebElement> categoryOptionsDropDown;


    @FindAll({@FindBy(how = How.CSS, using = "div.swatch-option.color")})
    private List<WebElement> colorOptionsDropDown;


    @FindAll({@FindBy(how = How.CSS, using = "div.swatch-option.text")})
    private List<WebElement> sizeOptionsDropDown;


    @FindAll({@FindBy(how = How.XPATH, using = " //ol[@id='show_above_products-price']//li  ")})
    private List<WebElement> priceRangesDropDown;


//    @FindAll({
//            @FindBy(how = How.CSS, using = "   ")
//    })
//    private List<WebElement> stoneOptionsDropDown;


    @FindBy(how = How.ID, using = "sorter")
    private WebElement sorter;

    public ShopByCategoryPage(WebDriver driver) {
        super(driver);
    }

    public void goToShopByCategoryPage() {
        LOGGER.info("Navigating to shop by category page");
        navigateTo(PAGE_URL);
    }


    /**
     * Clicks on a category from the Select a Category menu on the Shop by Category page
     */
    public void clickOnCategoryButtonByName(String name) {
        LOGGER.info("Clicking on:" + name);
        for (WebElement category : categoriesButtons) {
            if (getText(category).contains(name)) {
                click(category);
                break;
            }
        }
    }

    /**
     * Clicks on an option from the filter by options on the Shop by Category page
     */
    public void clickOnFilterByName(String name) {
        LOGGER.info("Clicking on:" + name);
        for (WebElement filterName : filterByOptions) {
            if (getText(filterName).contains(name)) {
                click(filterName);
                break;
            }
        }
    }

    /**
     * Selects category from the filter by drop-down menu in the Shop by Category page
     */
    public void selectCategoryFromFiltersDropDown(String name) {
        LOGGER.info("Clicking on:" + name);
        for (WebElement category : categoryOptionsDropDown) {
            if (getText(category).contains(name)) {
                scrollDownToElement(category);
                click(category);
                break;
            }
        }
    }

    /**
     * Selects size from the filter by drop-down menu in the Shop by Category page
     */
    public void selectColorFromFiltersDropDown(String size) {
        LOGGER.info("Clicking on:" + size);
        for (WebElement sizeOption : sizeOptionsDropDown) {
            if (getText(sizeOption).contains(size)) {
                click(sizeOption);
                break;
            }
        }
    }

    /**
     * Selects price range from the filter by drop-down menu in the Shop by Category page
     */
    public void selectPriceRangeFromPriceDropDown(String option) {
        LOGGER.info("Clicking on:" + option);
        for (WebElement priceRange : categoryOptionsDropDown) {
            if (getText(priceRange).contains(option)) {
                click(priceRange);
                break;
            }
        }
    }

    /**
     * Selects stone type from the filter by drop-down menu in the Shop by Category page
     */
//    public void selectStoneFromStoneDropDown(String name) {
//        LOGGER.info("Clicking on:" + name);
//        for (WebElement stone : stoneOptionsDropDown) {
//            if (getText(stone).contains(name)) {
//                click(stone);
//                break;
//            }
//        }
//    }
    public void selectDropDownOptionByVisibleText(WebElement sorter, String optionVisibleTextToSelect) {
        waitForElementVisibility(sorter);
        Select select = new Select(sorter);
        select.selectByVisibleText(optionVisibleTextToSelect);
    }

}
