package pages.UserPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class NewsFeedPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(NewsFeedPage.class);

    @FindBy(how = How.ID, using = "newsletter")
    private WebElement newsFeedEmailField;

    @FindBy(how = How.CSS, using = "div.message-success")
    private WebElement successMessage;

    @FindBy(how = How.CSS, using = "div.message-error.error.message")
    private WebElement newsFeedError;

    @FindBy(how = How.ID, using = "newsletter-error")
    private WebElement emailValidationError;

    @FindBy(how = How.XPATH, using = "//span[text()='Subscribe']")
    private WebElement subscribeButton;

    @FindBy(how = How.XPATH, using = "//div[@class='newsletter-container']")
    private WebElement newsFeedContainer;

    public NewsFeedPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        LOGGER.info("Entering news feed email:" + email);
        scrollDownToElement(newsFeedContainer);
        typeText(newsFeedEmailField, email);}

    private void clickSubscribeButton() {
        LOGGER.info("Clicking Subscribe button");
        click(subscribeButton); }

    public void subscribeToNewsFeed(String email) {
        enterEmail(email);
        clickSubscribeButton(); }

    public String subscribeButtonIsVisible() {
        if (isDisplayed(subscribeButton)){
        return "true" ;}
        else return "false";}

    public String getNewsFeedError() {
        return getText(newsFeedError); }

    public String getEmailValidationError() {
        return getText(emailValidationError);
    }
    public String getSuccessMessage() {
        return getText(successMessage);
    }
}
