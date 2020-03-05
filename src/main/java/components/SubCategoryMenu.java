package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SubCategoryMenu extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(SubCategoryMenu.class);

    @FindBy(how = How.XPATH, using = "//span[text()='Earrings']")
    private WebElement earrings;

    public SubCategoryMenu(WebDriver driver) {
        super(driver);
    }

    /**
     * Clicks on Earrings sub category link
     */
    public void clickOnEarrings() {
        LOGGER.info("Clicking on Earrings sub category link from main menu");
        click(earrings);
        waitForFullPageOrJsAjaxToLoad();
    }
}
