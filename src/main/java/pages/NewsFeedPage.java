package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewsFeedPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(NewsFeedPage.class);

    @FindBy(how = How.ID, using = "newsletter")
    private WebElement newsFeedEmailField;

    @FindBy(how = How.ID, using = "newsletter-error")
    private WebElement newsFeedError;

    @FindBy(how = How.XPATH, using = "//button[@class='action subscribe primary']")
    private WebElement subscribeButton;

    @FindBy(how = How.XPATH, using = "//div[@class='newsletter-container']")
    private WebElement newsFeedContainer;

    public NewsFeedPage(WebDriver driver) {
        super(driver);
    }

    private void enterEmail(String email){
        scrollDownToElement(newsFeedContainer);
        LOGGER.info("Entering news feed email:" + email);
        typeText(newsFeedEmailField, email);
    }

    private void clickSubscribeButton(){
        LOGGER.info("Clicking Subscribe button");
        waitForElementToBeClickable(subscribeButton);
        click(subscribeButton);
    }

    public void subscribeToNewsFeed(String email){
        enterEmail(email);
        clickSubscribeButton();
    }

    public String getNewsFeedError(){
        return getText(newsFeedEmailField);
    }
}
