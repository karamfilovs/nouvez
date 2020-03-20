package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResetPasswordPage extends BasePage{
    private static final Logger LOGGER = LoggerFactory.getLogger(ResetPasswordPage.class);
    private final String PAGE_URL = "/customer/account/forgotpassword/";


    @FindBy(how = How.CSS, using = "span.base")
    private WebElement pageHeader;

    @FindBy(how = How.ID, using = "email_address")
    private WebElement emailField;

    @FindBy(how = How.CSS, using = "button.action.submit")
    private WebElement resetPasswordButton;

    @FindBy(how = How.CSS, using = "a.action.back")
    private WebElement goBackButton;

    @FindBy(how = How.ID, using = "email_address-error")
    private WebElement requiredEmailMessage;


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
        return getText(requiredEmailMessage);
    }

    public void enterEmail(String email){
        LOGGER.info("Typing reset email:" + email);
        typeText(emailField, email);
    }

    public void clickResetPasswordButton(){
        LOGGER.info("Clicking on reset password button");
        click(resetPasswordButton);
    }
    public void clickGoBackButton(){
        LOGGER.info("Clicking on go back button");
        click(goBackButton);
    }

}
