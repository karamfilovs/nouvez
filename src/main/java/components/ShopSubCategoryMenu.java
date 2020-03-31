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

    @FindBy(how = How.XPATH, using = "//span[text()='Necklaces']")
    private WebElement necklaces;

    @FindBy(how = How.XPATH, using = "//span[text()='Earrings']")
    private WebElement earrings;

    @FindBy(how = How.XPATH, using = "//span[text()='Rings']")
    private WebElement rings;

    @FindBy(how = How.XPATH, using = "//span[text()='Braceletes']")
    private WebElement braceletes;

    @FindBy(how = How.XPATH, using = "//span[text()='Accessories']")
    private WebElement accessories;

    @FindBy(how = How.XPATH, using = "//span[text()='Wedding Rings']")
    private WebElement weddingRings;

    @FindBy(how = How.XPATH, using = "//span[text()='Engagement Rings']")
    private WebElement engagementRings;

    @FindBy(how = How.XPATH, using = "//span[text()='Bridal Jewellery']")
    private WebElement bridalJewellery;

    @FindBy(how = How.XPATH, using = "//span[text()='Men']")
    private WebElement men;

    @FindBy(how = How.XPATH, using = "//span[text()='Woman']")
    private WebElement woman;

    @FindBy(how = How.XPATH, using = "//span[text()='Bracelets']")
    private WebElement bracelets;

    @FindBy(how = How.XPATH, using = "//span[text()='Shop by Price']")
    private WebElement shopByPrice;

    @FindBy(how = How.XPATH, using = "//span[text()='By £500']")
    private WebElement by500;

    @FindBy(how = How.XPATH, using = "//span[text()='By £1000']")
    private WebElement by1000;

    @FindBy(how = How.XPATH, using = "//span[text()='By £2000']")
    private WebElement by2000;

    @FindBy(how = How.XPATH, using = "//span[text()='By £5000']")
    private WebElement by5000;

    @FindBy(how = How.XPATH, using = "//span[text()='Shop Designer']")
    private WebElement shopDesigner;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//li[@class='level2 category-item first ui-menu-item']")
    })
    private List<WebElement> designers;


    public ShopSubCategoryMenu(WebDriver driver) {
        super(driver);
    }


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
     * Clicks on Necklaces sub category link from main menu
     */
    public void clickOnNecklaces() {
        LOGGER.info("Clicking on Necklaces sub category link from main menu");
        hoverOver(shop);
        click(necklaces);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Earrings sub category link
     */
    public void clickOnEarrings() {
        LOGGER.info("Clicking on Earrings sub category link from main menu");
        hoverOver(shop);
        click(earrings);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Rings sub category link
     */
    public void clickOnRings() {
        LOGGER.info("Clicking on Rings sub category link from main menu");
        hoverOver(shop);
        click(rings);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Rings sub category link
     */
    public void clickOnBraceletes() {
        LOGGER.info("Clicking on Braceletes sub category link from main menu");
        hoverOver(shop);
        click(braceletes);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Accessories sub category link
     */
    public void clickOnAccessories() {
        LOGGER.info("Clicking on Accessories sub category link from main menu");
        hoverOver(shop);
        click(accessories);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Wedding Rings sub category link
     */
    public void clickOnWeddingRings() {
        LOGGER.info("Clicking on Wedding Rings sub category link from main menu");
        hoverOver(shop);
        click(weddingRings);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Engagement Rings sub category link
     */
    public void clickOnEngagementRings() {
        LOGGER.info("Clicking on Engagement Rings sub category link from main menu");
        hoverOver(shop);
        click(engagementRings);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Bridal Jewellery sub category link
     */
    public void clickOnBridalJewellery() {
        LOGGER.info("Clicking on Bridal Jewellery sub category link from main menu");
        hoverOver(shop);
        click(bridalJewellery);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Men sub category link
     */
    public void clickOnMen() {
        LOGGER.info("Clicking on Men sub category link from main menu");
        hoverOver(shop);
        click(men);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Woman sub category link
     */
    public void clickOnWoman() {
        LOGGER.info("Clicking on Woman sub category link from main menu");
        hoverOver(shop);
        click(woman);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Bracelets sub category link
     */
    public void clickOnBracelets() {
        LOGGER.info("Clicking on Bracelets sub category link from main menu");
        hoverOver(shop);
        click(bracelets);
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
     * Clicks on By 500 sub category link
     */
    public void clickOnBy500() {
        LOGGER.info("Clicking on By 500 sub category link from main menu");
        hoverOver(shop);
        click(by500);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on By 1000 sub category link
     */
    public void clickOnBy1000() {
        LOGGER.info("Clicking on By 1000 sub category link from main menu");
        hoverOver(shop);
        click(by1000);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on By 2000 sub category link
     */
    public void clickOnBy2000() {
        LOGGER.info("Clicking on By 2000 sub category link from main menu");
        hoverOver(shop);
        click(by2000);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on By 5000 sub category link
     */
    public void clickOnBy5000() {
        LOGGER.info("Clicking on By 5000 sub category link from main menu");
        hoverOver(shop);
        click(by5000);
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
    /**
     * Clicks on designer from the Shop designer sub category section
     */
    public void clickOnDesignerByName(String name) {
        LOGGER.info("Clicking on:" + name);
        for(WebElement designer : designers){
            if (getText(designer).contains(name)){
                click(designer);
                break;
            }
        }
    }

}
