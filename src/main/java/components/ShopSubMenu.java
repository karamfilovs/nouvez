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

    @FindBy(how = How.XPATH, using = "//a[text()='Explore All']")
    private WebElement exploreAll;

    @FindBy(how = How.XPATH, using = "//span[text()='Shop All']")
    private WebElement shopAll;

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

    @FindBy(how = How.XPATH, using = "//span[text()='One of a Kind']")
    private WebElement oneOfAKindButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Below £2,000']")
    private WebElement below2000Button;

    @FindBy(how = How.XPATH, using = "//span[text()='£2,000 to £5,000']")
    private WebElement from2000to5000Button;

    @FindBy(how = How.XPATH, using = "//span[text()='£5,000 to £10,000']")
    private WebElement from5000to10000Button;

    @FindBy(how = How.XPATH, using = "//span[text()='Above £10,000']")
    private WebElement above10000;

//    @FindAll({@FindBy(how = How.XPATH, using = "//ul[@class='level1 submenu ui-menu ui-widget ui-widget-content ui-corner-all expanded submenu-reverse']/li/a")})
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
        click(exploreAll);
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

        public void clickOneOfAKind(){
        hoverOverShop();
        LOGGER.info("Clicking one of a kind button from the shop sub menu");
        click(oneOfAKindButton);}


        public void clickBelow2000(){
        hoverOverShop();
        LOGGER.info("Clicking below 2000 button from the shop sub menu");
        click(below2000Button);}

        public void clickFrom2000To5000(){
        hoverOverShop();
        LOGGER.info("Clicking from 2000 to 5000 button from the shop sub menu");
        click(from2000to5000Button);}

        public void clickFrom5000To10000(){
        hoverOverShop();
        LOGGER.info("Clicking from 5000 to 10000 button from the shop sub menu");
        click(from5000to10000Button);}

        public void clickAbove10000(){
        hoverOverShop();
        LOGGER.info("Clicking above 10000 button from the shop sub menu");
        click(above10000);}
}
