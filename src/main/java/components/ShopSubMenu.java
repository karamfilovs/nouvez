package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class ShopSubMenu extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShopSubMenu.class);

    @FindBy(how = How.ID, using = "ui-id-3")
    private WebElement shop;

    @FindBy(how = How.XPATH, using = "//span[text()='Shop All']")
    private WebElement shopAll;

    @FindBy(how = How.XPATH, using = "//a[text()='Explore Designer A-Z']")
    private WebElement exploreDesigner;

    @FindBy(how = How.XPATH, using = "//span[text()='Necklaces']")
    private WebElement necklacesButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Earrings']")
    private WebElement earringsButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Rings']")
    private WebElement ringsButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Bracelets']")
    private WebElement braceletsButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Accessories']")
    private WebElement accessoriesButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Wedding Rings']")
    private WebElement weddingRingsButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Engagement Rings']")
    private WebElement engagementRingsButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Bridal Jewellery ']")
    private WebElement bridalJewelleryButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Men']")
    private WebElement menButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Women']")
    private WebElement womenButton;

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

    public ShopSubMenu(WebDriver driver) {super(driver);}


    /**
     * Clicks on Shop by category link
     */
    public void clickOnShopAll() {
        LOGGER.info("Clicking on Shop all link from main menu");
        hoverOver(shop);
        click(shopAll); }

    /**
     * Clicks on Shop designer sub category link
     */
    public void clickOnExploreDesigner() {
        LOGGER.info("Clicking on explore designer shop sub menu link from main menu");
        hoverOver(shop);
        click(exploreDesigner);
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
        LOGGER.info("Clicking necklaces button from the shop sub menu");
        click(necklacesButton);}

        public void clickEarrings(){
        hoverOverShop();
        LOGGER.info("Clicking earrings button from the shop sub menu");
        click(earringsButton);}

        public void clickRings(){
        hoverOverShop();
        LOGGER.info("Clicking rings button from the shop sub menu");
        click(ringsButton);}

        public void clickBracelets(){
        hoverOverShop();
        LOGGER.info("Clicking bracelets button from the shop sub menu");
        click(braceletsButton);}

        public void clickAccessories(){
        hoverOverShop();
        LOGGER.info("Clicking accessories button from the shop sub menu");
        click(accessoriesButton);}

        public void clickWeddingRings(){
        hoverOverShop();
        LOGGER.info("Clicking wedding rings button from the shop sub menu");
        click(weddingRingsButton);}

        public void clickEngagementRings(){
        hoverOverShop();
        LOGGER.info("Clicking engagement rings button from the shop sub menu");
        click(engagementRingsButton);}

        public void clickBridalJewellery(){
        hoverOverShop();
        LOGGER.info("Clicking bridal jewelry button from the shop sub menu");
        click(bridalJewelleryButton);}

        public void clickMen(){
        hoverOverShop();
        LOGGER.info("Clicking men button from the shop sub menu");
        click(menButton);}

        public void clickWomen(){
        hoverOverShop();
        LOGGER.info("Clicking women button from the shop sub menu");
        click(womenButton);}

        public void clickBy500(){
        hoverOverShop();
        LOGGER.info("Clicking by 500 button from the shop sub menu");
        click(by500Button);}

        public void clickBy1000(){
        hoverOverShop();
        LOGGER.info("Clicking by 1000 button from the shop sub menu");
        click(by1000Button);}

        public void clickBy2000(){
        hoverOverShop();
        LOGGER.info("Clicking by 2000 button from the shop sub menu");
        click(by2000Button);}

        public void clickBy3000(){
        hoverOverShop();
        LOGGER.info("Clicking by 3000 button from the shop sub menu");
        click(by3000Button);}
}
