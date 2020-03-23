package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class MainMenu extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainMenu.class);

    @FindBy(how = How.XPATH, using = "//span[text()='Shop']")
    private WebElement shop;

    @FindBy(how = How.XPATH, using = "//span[text()='Create']")
    private WebElement create;

    @FindBy(how = How.XPATH, using = "//span[text()='Inspire']")
    private WebElement inspire;

    @FindBy(how = How.XPATH, using = "//span[text()='About']")
    private WebElement about;

    @FindBy(how = How.XPATH, using = "//span[text()='Services']")
    private WebElement services;

    @FindBy(how = How.XPATH, using = "//span[text()='Contact']")
    private WebElement contact;


    public MainMenu(WebDriver driver) {
        super(driver);
    }

    /**
     * Hovers over Shop category link
     */
    public void hoverOnShop() {
        LOGGER.info("Hovering over Shop link from main menu");
        hoverOver(shop);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Hovers over Create category link
     */
    public void hoverOnCreate() {
        LOGGER.info("Hovering over Create link from main menu");
        hoverOver(create);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Hovers over Inspire category link
     */
    public void hoverOnInspire() {
        LOGGER.info("Hovering over Inspire link from main menu");
        hoverOver(inspire);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Hovers over About category link
     */
    public void hoverOnAbout() {
        LOGGER.info("Hovering over About link from main menu");
        hoverOver(about);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Hovers over Services category link
     */
    public void hoverOnServices() {
        LOGGER.info("Hovering over Services link from main menu");
        hoverOver(services);
        waitForFullPageOrJsAjaxToLoad();
    }
    /**
     * Hovers over Contact category link
     */
    public void hoverOnContact() {
        LOGGER.info("Hovering over Contact link from main menu");
        hoverOver(contact);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Shop link
     */
    public void clickOnShop() {
        LOGGER.info("Clicking on Shop page link main menu");
        click(shop);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Create link
     */
    public void clickOnCreate() {
        LOGGER.info("Clicking on Create page link main menu");
        click(create);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on Inspire link
     */
    public void clickOnInspire() {
        LOGGER.info("Clicking on Inspire page link main menu");
        click(inspire);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on About link
     */
    public void clickOnAbout() {
        LOGGER.info("Clicking on About page link main menu");
        click(about);
        waitForFullPageOrJsAjaxToLoad();
    }
    /**
     * Clicks on Services link
     */
    public void clickOnServices() {
        LOGGER.info("Clicking on Services page link main menu");
        click(services);
        waitForFullPageOrJsAjaxToLoad();
    }
    /**
     * Clicks on Contact link
     */
    public void clickOnContact() {
        LOGGER.info("Clicking on Contact page link main menu");
        click(contact);
        waitForFullPageOrJsAjaxToLoad();
    }
}
