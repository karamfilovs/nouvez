package pages.UserPages;

import enums.AccountType;
import enums.Checked;
import enums.Country;
import enums.Salutation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.List;

public class LoginPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);
    private final String PAGE_URL = "nl/account/login";

    @FindBy(how = How.ID, using = "accountType")
    WebElement accountTypesDropDown;

    @FindBy(how = How.ID, using = "personalSalutation")
    WebElement salutationTypesDropDown;

    @FindBy (how = How.ID, using = "personalFirstName")
    private WebElement firstNameField;

    @FindBy (how = How.ID, using = "personalLastName")
    private WebElement lastNameField;

    @FindBy (how = How.ID, using = "personalMail")
    private WebElement emailField;

    @FindBy (how = How.ID, using = "personalPassword")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "billingAddressAddressCountry")
    WebElement countryDropDown;

    @FindBy (how = How.ID, using = "billingAddressAutocompleteAddress")
    private WebElement addressField;

    @FindBy (how = How.XPATH, using = "//span[@class='postcodenl-autocomplete-item-label']")
    private WebElement addressAlert;

    @FindBy (how = How.ID, using = "billingAddressAddressPhoneNumber")
    private WebElement phoneNumberField;

    @FindBy (how = How.ID, using = "wk-term-check")
    private WebElement termsAndConditionsCheckbox;

    @FindBy (how = How.CSS, using = "button.btn-primary")
    private WebElement submitButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void gotoLoginPage() {
        LOGGER.info("Navigating to Login page");
        navigateTo(PAGE_URL); }

    public void selectAccountType(String accountType) {
        LOGGER.info("Selects account type");
        waitForElementVisibility(accountTypesDropDown);
        Select select = new Select(accountTypesDropDown);
        select.selectByVisibleText(accountType);}

    public void selectSalutation(String salutationType){
        LOGGER.info("Selects salutation " + salutationType);
        waitForElementVisibility(salutationTypesDropDown);
        Select select = new Select(salutationTypesDropDown);
        select.selectByVisibleText(salutationType);}

    public void fillInFirstName(String firstName){
        LOGGER.info("Filling in the first name field with " + firstName);
        typeText(firstNameField,firstName); }

    public void fillInLastName(String lastName){
        LOGGER.info("Filling in the last name field with " + lastName);
        typeText(lastNameField,lastName); }

    public void fillInEmail(String email){
        LOGGER.info("Filling in the e-mail field with " + email);
        typeText(emailField,email); }

    public void fillInPassword(String password){
        LOGGER.info("Filling in the password field with " + password);
        typeText(passwordField , password); }

    public void selectYourCountry(String country){
        LOGGER.info("Selects country :" + country);
        waitForElementVisibility(countryDropDown);
        Select select = new Select(countryDropDown);
        select.selectByVisibleText(country);}

    public void fillInAddress(String address){
        LOGGER.info("Filling in the address field with " + address);
        waitForElementVisibility(addressField);
        typeText(addressField,address);
        click(addressAlert);}

    public void fillInPhoneNumber(String phoneNumber){
        LOGGER.info("Filling in the phone number field with " + phoneNumber);
        typeText(phoneNumberField,phoneNumber); }

    public void checkTermsAndConditionsCheckbox() {
        LOGGER.info("Checks the checkbox to accept terms and conditions");
        waitForFullPageOrJsAjaxToLoad();
        waitForElementVisibility(termsAndConditionsCheckbox);
        checkCheckbox(termsAndConditionsCheckbox,Checked.NO);}

    public void clickSubmitButton()  {
        LOGGER.info("CLicks submit/verder button ");
        scrollDownToElement(submitButton);
        waitForElementToBeClickable(submitButton);
        clickWithActionsBuilder(submitButton);
    }
}