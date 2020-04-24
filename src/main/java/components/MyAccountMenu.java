package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class MyAccountMenu extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyAccountMenu.class);

    @FindBy(how = How.CSS, using = ".icon.icon-account")
    private WebElement myAccountButton;


    public MyAccountMenu(WebDriver driver) {
        super(driver);
    }

    /**
     * Clicks on My Account button
     */
    public void clickOnMyAccountButton() {
        LOGGER.info("Clicking on My Account link from main menu");
        click(myAccountButton);
        waitForFullPageOrJsAjaxToLoad();
    }


}
