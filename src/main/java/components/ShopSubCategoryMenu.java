package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.List;


public class ShopSubCategoryMenu extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShopSubCategoryMenu.class);

    @FindBy(how = How.ID, using = "ui-id-3")
    private WebElement shop;

    @FindBy(how = How.XPATH, using = "//span[text()='Shop by Category']")
    private WebElement shopByCategory;

    @FindBy(how = How.XPATH, using = "//span[text()='Shop by Price']")
    private WebElement shopByPrice;

    @FindBy(how = How.XPATH, using = "//span[text()='Shop Designer']")
    private WebElement shopDesigner;

    @FindAll({@FindBy(how = How.XPATH, using = "//ul[@class='level1 submenu ui-menu ui-widget ui-widget-content ui-corner-all expanded']/li/a")})
    private List<WebElement> shopDropDownOptions;

    public ShopSubCategoryMenu(WebDriver driver) {super(driver);}


    /**
     * Clicks on Shop by category link
     */
    public void clickOnShopByCategory() {
        LOGGER.info("Clicking on Shop by category link from main menu");
        hoverOver(shop);
        click(shopByCategory);
        waitForFullPageOrJsAjaxToLoad();
    }


    /**
     * Clicks on Shop by price sub category link
     */
    public void clickOnShopByPrice() {
        LOGGER.info("Clicking on Shop by price sub category link from main menu");
        hoverOver(shop);
        click(shopByPrice);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Shop designer sub category link
     */
    public void clickOnShopDesigner() {
        LOGGER.info("Clicking on Shop designer sub category link from main menu");
        hoverOver(shop);
        click(shopDesigner);
        waitForFullPageOrJsAjaxToLoad();
    }

    public void hoverOverShop(){
        LOGGER.info("Hovering over shop button from the main menu");
        hoverOver(shop);
    }
    /**
     * Clicks on a category from the Select a Category menu
     */
    public void clickOnCategoryButtonByName(String name) {
        clickWebElementByText(name,shopDropDownOptions); }
}
