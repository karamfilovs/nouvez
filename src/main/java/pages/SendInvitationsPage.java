package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SendInvitationsPage extends BasePage {

    @FindBy(how = How.CSS, using = "a.action.back")
    private WebElement backButton;

    @FindBy(how = How.ID, using = "email_0")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "message")
    private WebElement messageField;

    @FindBy(how = How.CSS, using = "button.action.submit")
    private WebElement sendButton;

    @FindBy(how = How.ID, using = "add-email-button")
    private WebElement addButton;

    @FindBy(how = How.CSS, using = "div.message-notice.notice.message")
    private WebElement notification;


    public SendInvitationsPage(WebDriver driver) {
        super(driver);
    }
    public void enterEmail(String email) {
        LOGGER.info("Entering email:" + email);
        typeText(emailField, email);
    }

    public void enterMessage(String message) {
        LOGGER.info("Entering message:" + message);
        typeText(messageField, message);
    }
    public void clickAddButton(){
        LOGGER.info("Clicking add button");
        click(addButton);
    }
    public void clickBackButton(){
        LOGGER.info("Clicking back button");
        click(backButton);
    }

    public void clickSendButton(){
        LOGGER.info("Clicking send invitations button");
        click(sendButton);
    }
    public String getNotification(){
        LOGGER.info("Getting the text of the notification");
        return getText(notification);
    }


}
