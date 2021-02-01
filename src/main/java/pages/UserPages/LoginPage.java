package pages.UserPages;

import enums.Checked;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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

    @FindAll(@FindBy (how = How.XPATH, using = "//span[@class='postcodenl-autocomplete-item-label']"))
    private List<WebElement> addressAlerts;

    @FindBy (how = How.ID, using = "billingAddressAddressPhoneNumber")
    private WebElement phoneNumberField;

    @FindBy (how = How.NAME, using = "gdprPolicy")
    private WebElement termsAndConditionsCheckbox;

    @FindBy (how = How.CSS, using = "button.btn-primary")
    private WebElement submitButton;

    @FindBy (how = How.XPATH, using = "//span[@class='form-tab-heading']")
    private WebElement headerNote;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void gotoLoginPage() {
        LOGGER.info("Navigating to Login page");
        navigateTo(PAGE_URL); }

    public void selectAccountType(String accountType) {
        LOGGER.info("Selects account type");
        selectDropDownOptionByVisibleText(accountTypesDropDown, accountType);
    }

    public void selectSalutation(String salutationType){
            LOGGER.info("Selects salutation " + salutationType);
            selectDropDownOptionByVisibleText(salutationTypesDropDown, salutationType);
        }

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
        selectDropDownOptionByVisibleText(countryDropDown, country);
    }
    public void clickAddressAlert(){
        LOGGER.info("Clicking on first address offered");
            for(WebElement address : addressAlerts){
                click(address);
                break; } }


    public void fillInAddress(String address){
        LOGGER.info("Filling in the address field with " + address);
        scrollPageDown();
        scrollPageDown();
        click(addressField);
        typeText(addressField,address);
        clickAddressAlert();

//
    }

    public void fillInPhoneNumber(String phoneNumber){
        LOGGER.info("Filling in the phone number field with " + phoneNumber);
        typeText(phoneNumberField,phoneNumber);
        click(phoneNumberField);
    }

    public void checkTermsAndConditionsCheckbox() {
        LOGGER.info("Checks the checkbox to accept terms and conditions");
        checkCheckbox(termsAndConditionsCheckbox,Checked.YES);}

    public void clickSubmitButton()  {
        LOGGER.info("Clicks submit/verder button ");
        click(submitButton);
    }

    public void scrollPageDown(){
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
        System.out.println("Scroll down perfomed"); }

    public String getHeaderNote(){
        LOGGER.info("Getting the header note");
        return getText(headerNote); }
}