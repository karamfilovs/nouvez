package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);
    private final String PAGE_URL = "/login";

    @FindBy(how = How.NAME, using = "brugernavn")
    private WebElement usernameField;

    @FindBy(how = How.NAME, using = "adgangskode")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "btn-login")
    private WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-danger']")
    private WebElement badLoginErrorMessage;

    @FindBy(how = How.XPATH, using = "//div[@class='feedback text-danger']")
    private WebElement requiredPasswordMessage;

    @FindBy(how = How.XPATH, using = "//div[@class='feedback text-danger']")
    private WebElement requiredUsernameMessage;

    @FindBy(how = How.XPATH, using = "//a[@href='/testing/reset-password']")
    private WebElement resetPasswordLink;

    @FindBy(how = How.XPATH, using = "//a[@href='/testing/register']")
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

    public void clickLoginButton() {
        LOGGER.info("Clicking Login button");
        click(loginButton);
    }

    public void enterUsername(String username) {
        LOGGER.info("Entering username:" + username);
        typeText(usernameField, username);
    }

    public void ClickResetPasswordLink(){
        LOGGER.info("Clicking on reset password link");
        click(resetPasswordLink);
    }

    public void clickRegistrationLink(){
        LOGGER.info("Clicking on registration form link");
        click(registrationLink);
    }

    public String getBadLoginErrorMessage() {
        return getText(badLoginErrorMessage);
    }

    public String getPasswordRequiredMessageText() {
        return getText(requiredPasswordMessage);
    }

    public String getUsernameRequiredMessage(){
        return getText(requiredUsernameMessage);
    }

    public String getLoginButton(){
        return getText(loginButton);
    }

    public void login() {
        gotoLoginPage();
        enterUsername(System.getProperty("login.username"));
        enterPassword(System.getProperty("login.password"));
        clickLoginButton();
    }
}