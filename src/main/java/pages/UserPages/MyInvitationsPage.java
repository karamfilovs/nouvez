package pages.UserPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class MyInvitationsPage extends BasePage {

    @FindBy(how = How.CSS, using = "a.action.back")
    private WebElement backButton;

    @FindBy(how = How.CSS, using = "a.action.send")
    private WebElement sendButton;

    public void clickBackButton(){
        LOGGER.info("Clicking back button");
        click(backButton);
    }
    public MyInvitationsPage(WebDriver driver) {
        super(driver);
    }
    public void clickSendButton(){
        LOGGER.info("Clicking send invitations button");
        click(sendButton);
    }
}
