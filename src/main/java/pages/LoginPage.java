package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);
    private final String PAGE_URL = "/customer/account/login/";

    @FindBy(how = How.NAME, using = "login[username]")
    private WebElement usernameField;

    @FindBy(how = How.XPATH, using = "//a[@href='/testing/reset-password']")
    private WebElement resetPasswordLink;

    @FindBy(how = How.NAME, using = "login[password]")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "send2")
    private WebElement loginButton;

    @FindBy(how = How.ID, using = "email-error")
    private WebElement badLoginErrorMessage;

    @FindBy(how = How.ID, using = "pass-error")
    private WebElement requiredPasswordMessage;

    @FindBy(how = How.ID, using = "email-error")
    private WebElement requiredUsernameMessage;

    @FindBy(how = How.CSS, using = "div.message-error.error.message")
    private WebElement invalidLoginCombinationMessage;

    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "My Account")
    private WebElement registrationLink;


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void gotoLoginPage() {
        LOGGER.info("Navigating to Login page");
        navigateTo(PAGE_URL);
    }

    public void enterPassword(String password) {
        LOGGER.info("Entering password:" + password);
        typeText(passwordField, password);
    }

    public void clickResetPasswordLink() {
        LOGGER.info("Clicking on reset password link");
        click(resetPasswordLink);
    }

    public void clickLoginButton() {
        LOGGER.info("Clicking Login button");
        click(loginButton);
    }

    public void enterUsername(String username) {
        LOGGER.info("Entering username:" + username);
        typeText(usernameField, username);
    }

    public void clickRegistrationLink() {
        LOGGER.info("Clicking on registration form link");
        click(registrationLink);
    }

    public String getBadEmailErrorMessage() {
        return getText(badLoginErrorMessage);
    }

    public String getInvalidCombinationErrorMessage() {
        return getText(invalidLoginCombinationMessage);
    }


    public String getPasswordRequiredMessageText() {
        return getText(requiredPasswordMessage);
    }

    public String getUsernameRequiredMessage() {
        return getText(requiredUsernameMessage);
    }

    public String getLoginButton() {
        return getText(loginButton);
    }

    public void login() {
        gotoLoginPage();
        enterUsername(System.getProperty("login.username"));
        enterPassword(System.getProperty("login.password"));
        clickLoginButton();
    }
}