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

    @FindBy(how = How.XPATH, using = "//span[text()='Necklaces']")
    private WebElement necklacesButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Earrings']")
    private WebElement earringsButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Rings']")
    private WebElement ringsButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Bracelets']")
    private WebElement braceletsButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Accessories ']")
    private WebElement accessoriesButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Wedding Rings']")
    private WebElement weddingRingsButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Engagement Rings']")
    private WebElement engagementRingsButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Bridal Jewellery ']")
    private WebElement bridalJewelleryButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Men']")
    private WebElement menButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Woman']")
    private WebElement womanButton;

    @FindBy(how = How.XPATH, using = "//span[text()='By £500']")
    private WebElement by500Button;

    @FindBy(how = How.XPATH, using = "//span[text()='By £1000']")
    private WebElement by1000Button;

    @FindBy(how = How.XPATH, using = "//span[text()='By £2000']")
    private WebElement by2000Button;

    @FindBy(how = How.XPATH, using = "//span[text()='By £3000']")
    private WebElement by3000Button;

//    @FindAll({@FindBy(how = How.XPATH, using = "//ul[@class='level1 submenu ui-menu ui-widget ui-widget-content ui-corner-all expanded']/li/a")})
//    private List<WebElement> shopDropDownOptions;

    public ShopSubCategoryMenu(WebDriver driver) {super(driver);}


    /**
     * Clicks on Shop by category link
     */
    public void clickOnShopByCategory() {
        LOGGER.info("Clicking on Shop by category link from main menu");
        hoverOver(shop);
        click(shopByCategory); }

    /**
     * Clicks on Shop by price sub category link
     */
    public void clickOnShopByPrice() {
        LOGGER.info("Clicking on Shop by price sub category link from main menu");
        hoverOver(shop);
        click(shopByPrice); }

    /**
     * Clicks on Shop designer sub category link
     */
    public void clickOnShopDesigner() {
        LOGGER.info("Clicking on Shop designer sub category link from main menu");
        hoverOver(shop);
        click(shopDesigner);
        waitForFullPageOrJsAjaxToLoad();}

    public void hoverOverShop(){
        LOGGER.info("Hovering over shop button from the main menu");
        hoverOver(shop);}
    /**
     * Clicks on a category from the Select a Category menu
     */
//    public void clickOnCategoryButtonByName(String name) {
//        hoverOverShop();
//        clickWebElementByText(name,shopDropDownOptions); }

        public void clickNecklaces(){
        hoverOverShop();
        click(necklacesButton);}

        public void clickEarrings(){
        hoverOverShop();
        click(earringsButton);}

        public void clickRings(){
        hoverOverShop();
        click(ringsButton);}

        public void clickBracelets(){
        hoverOverShop();
        click(braceletsButton);}

        public void clickAccessories(){
        hoverOverShop();
        click(accessoriesButton);}

        public void clickWeddingRings(){
        hoverOverShop();
        click(weddingRingsButton);}

        public void clickEngagementRings(){
        hoverOverShop();
        click(engagementRingsButton);}

        public void clickBridalJewellery(){
        hoverOverShop();
        click(bridalJewelleryButton);}

        public void clickMen(){
        hoverOverShop();
        click(menButton);}

        public void clickWoman(){
        hoverOverShop();
        click(womanButton);}

        public void clickBy500(){
        hoverOverShop();
        click(by500Button);}

        public void clickBy1000(){
        hoverOverShop();
        click(by1000Button);}

        public void clickBy2000(){
        hoverOverShop();
        click(by2000Button);}

        public void clickBy3000(){
        hoverOverShop();
        click(by3000Button);}
}
