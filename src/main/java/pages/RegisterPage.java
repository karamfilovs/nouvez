package pages;

import enums.Checked;
import enums.Emails;
import enums.MyAccountNavMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegisterPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterPage.class);
    private final String PAGE_URL = "/customer/account/login/";

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
    private WebElement newsletterCheckbox;

    @FindBy(how = How.ID, using = "captcha_user_login")
    private WebElement captchaField;

    @FindBy(how = How.ID, using = "password-confirmation-error")
    private WebElement passwordMissMatchError;

    @FindBy(how = How.ID, using = "password-error")
    private WebElement weakPasswordError;

    @FindBy(how = How.XPATH, using = "//button[@class='action submit primary']")
    private WebElement createAccountButton;

    @FindBy(how = How.CSS, using = "div.message-error.error.message")
    private WebElement topErrorMessage;

    @FindBy(how = How.XPATH, using = "//div[@class='box box-newsletter']//div/p")
    private WebElement newsletterSubscriptionText;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void gotoPage(){
        LOGGER.info("Navigating to Customer Login page");
        navigateTo(PAGE_URL); }

    public void enterFirstName(String firstName){
        LOGGER.info("Entering first name:" + firstName);
        typeText(firstNameField, firstName); }

    public void enterLastName(String lastName){
        LOGGER.info("Entering last name:" + lastName);
        typeText(lastNameField, lastName); }

    public void enterEmail(String email){
        LOGGER.info("Entering email: " + email);
        typeText(emailField, email); }


    public void enterPassword(String password){
        LOGGER.info("Entering password: " + password);
        typeText(passwordField, password); }

    public void enterConfirmPassword(String password){
        LOGGER.info("Entering confirm password: " + password);
        typeText(confirmPasswordField, password); }

    public void clickCreateAnAccountButton(){
        LOGGER.info("Clicking Create an Account button");
        click(createAccountButton); }

        public void checkNewsletterCheckbox(){
        LOGGER.info("Clicking the newsletter checkbox");
        click(newsletterCheckbox); }

        public String getNewsletterText(){
        LOGGER.info("Getting the text of the newsletter textbox");
        return getText(newsletterSubscriptionText); }

    public String topErrorMessage(){
        return getText(topErrorMessage);
    }

    public String passwordMissMatchErrorMessage(){ return getText(passwordMissMatchError); }

    public String weakPasswordError(){ return getText(weakPasswordError); }

}
