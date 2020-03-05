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


    public MainMenu(WebDriver driver) {
        super(driver);
    }

    /**
     * Clicks on Shop category link
     */
    public void clickOnShop() {
        LOGGER.info("Clicking on Shop link from main menu");
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



}
