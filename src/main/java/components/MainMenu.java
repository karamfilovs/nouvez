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

    @FindBy(how = How.XPATH, using = "//span[text()='Diary']")
    private WebElement diary;

    @FindBy(how = How.XPATH, using = "//span[text()='Experience']")
    private WebElement experience;

    @FindBy(how = How.XPATH, using = "//span[text()='About']")
    private WebElement about;

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
     * Clicks on diary link
     */
    public void clickDiary() {
        LOGGER.info("Clicking on diary link from main menu");
        click(diary);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on experience link
     */
    public void clickExperience() {
        LOGGER.info("HClicking on experience link from main menu");
        click(experience);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on about link
     */
    public void clickAbout() {
        LOGGER.info("Clicking on About link from main menu");
        click(about);
        waitForFullPageOrJsAjaxToLoad();
    }

    /**
     * Clicks on contact link
     */
    public void clickContact() {
        LOGGER.info("Clicking on contact link from main menu");
        click(contact);
        waitForFullPageOrJsAjaxToLoad();
    }

}
