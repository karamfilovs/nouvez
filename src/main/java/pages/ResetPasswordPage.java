package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResetPasswordPage extends BasePage{
    private static final Logger LOGGER = LoggerFactory.getLogger(ResetPasswordPage.class);
    private final String PAGE_URL = "/reset-password";

    @FindBy(how = How.XPATH, using = "//h2[@class='ng-star-inserted']")
    private WebElement pageHeader;

    @FindBy(how = How.NAME, using = "email")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "btn-password-reset")
    private WebElement resetPasswordButton;

    @FindBy(how = How.XPATH, using = "//div[@class='feedback text-danger ng-star-inserted']")
    private WebElement requiredEmailMessage;

    @FindBy(how = How.XPATH, using = "//div[@class='feedback text-danger ng-star-inserted']")
    private WebElement incorrectEmailMessage;

    public ResetPasswordPage(WebDriver driver) {
        super(driver);
    }

    public String getHeaderText(){
        return getText(pageHeader);
    }

    public String getRequiredEmailMessage(){
        return getText(requiredEmailMessage);
    }

    public String getIncorrectEmailMessage(){
        return getText(incorrectEmailMessage);
    }

    public void enterEmail(String email){
        LOGGER.info("Typing reset email:" + email);
        typeText(emailField, email);
    }

    public void clickResetPasswordButton(){
        LOGGER.info("Clicking on reset password button");
        click(resetPasswordButton);
    }

}
