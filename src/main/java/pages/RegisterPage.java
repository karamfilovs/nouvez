package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegisterPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterPage.class);
    private final String PAGE_URL = "/customer/account/create/";

    @FindBy(how = How.ID, using = "firstname")
    private WebElement firstNameField;

    @FindBy(how = How.ID, using = "lastname")
    private WebElement lastNameField;

    @FindBy(how = How.ID, using = "email_address")
    private WebElement emailField;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "password-confirmation")
    private WebElement confirmPasswordField;

    @FindBy(how = How.ID, using = "is_subscribed")
    private WebElement signUpForNewsCheckbox;

    @FindBy(how = How.ID, using = "captcha_user_login")
    private WebElement captchaField;

    @FindBy(how = How.XPATH, using = "//button[@class='action submit primary']")
    private WebElement createAccountButton;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void gotoPage(){
        LOGGER.info("Navigating to Register page");
        navigateTo(PAGE_URL);
    }


}
