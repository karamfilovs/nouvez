package pages;

import enums.Country;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.DataGenerator;

import java.util.List;

public class CheckoutPage extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(CheckoutPage.class);
    private final String PAGE_URL = "checkout/#shipping";

    @FindBy(how = How.ID, using = "customer-email")
    private WebElement emailField;

    @FindBy(how = How.NAME, using = "firstname")
    private WebElement firstNameField;

    @FindBy(how = How.NAME, using = "lastname")
    private WebElement lastNameField;

    @FindBy(how = How.NAME, using = "company")
    private WebElement companyField;

    @FindBy(how = How.NAME, using = "street[0]")
    private WebElement addressFieldLine1;

    @FindBy(how = How.NAME, using = "street[1]")
    private WebElement addressFieldLine2;

    @FindBy(how = How.NAME, using = "city")
    private WebElement cityField;

    @FindBy(how = How.NAME, using = "region")
    private WebElement stateField;

    @FindBy(how = How.NAME, using = "postcode")
    private WebElement postCodeField;

    @FindBy(how = How.NAME, using = "country_id")
    private WebElement countryDropDown;

    @FindBy(how = How.NAME, using = "telephone")
    private WebElement phoneNumberField;

    @FindAll({@FindBy(how = How.CSS, using = "input.radio")})
    private List<WebElement> shippingMethodRadioButtons;

    @FindBy(how = How.CSS, using = ".button.action")
    private WebElement nextButton;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void gotoCheckoutPage() {
        LOGGER.info("Navigating to Checkout page");
        navigateTo(PAGE_URL); }

    public void enterEmailAddress(String email) {
        LOGGER.info("Entering email address:" + email);
        typeText(emailField, email); }

    public void enterFirstName(String firstName) {
        LOGGER.info("Entering first name:" + firstName);
        typeText(firstNameField, firstName); }

    public void enterLastName(String lastName) {
        LOGGER.info("Entering last name:" + lastName);
        typeText(lastNameField, lastName); }

    public void enterCompanyName(String companyName) {
        LOGGER.info("Entering company name:" + companyName);
        typeText(companyField, companyName); }

    public void enterStreetAddressLine1(String streetAddressLine1) {
        LOGGER.info("Entering 1st line of street address:" + streetAddressLine1);
        typeText(addressFieldLine1, streetAddressLine1); }

    public void enterStreetAddressLine2(String streetAddressLine2) {
        LOGGER.info("Entering 2nd line of street address:" + streetAddressLine2);
        typeText(addressFieldLine2, streetAddressLine2); }

    public void enterCity(String city) {
        LOGGER.info("Entering city name:" + city);
        typeText(cityField, city); }

    public void enterState(String state) {
        LOGGER.info("Entering state name:" + state);
        typeText(stateField, state); }

    public void enterZip(String zip) {
        LOGGER.info("Entering post code:" + zip);
        typeText(postCodeField, zip); }

    public CheckoutPage selectCountry(Country country) {
        super.selectDropDownOptionByVisibleText(countryDropDown, country.getCountry());
        return this; }

    public void enterPhoneNumber(String phoneNumber) {
        LOGGER.info("Entering phone number:" + phoneNumber);
        typeText(phoneNumberField, phoneNumber); }

    public void selectShippingMethod(String optionVisibleTextToSelect) {
        for (WebElement shippingMethodRadioButton : shippingMethodRadioButtons) {
            if (shippingMethodRadioButton.getText().toLowerCase().contains(optionVisibleTextToSelect.toLowerCase())) {
                shippingMethodRadioButton.click();
                return; } } }

    public void clickNextButton() {
        LOGGER.info("Clicking next button");
        click(nextButton); }

    public void fillInShippingDetailsAndClickNext(String email, String firstName, String lastName, String street, String city, String zipCode, String phone){
        LOGGER.info("Filling in all required fields on Checkout page");
        enterEmailAddress(email);
        enterFirstName(firstName);
        enterLastName(lastName);
        enterStreetAddressLine1(street);
        enterCity(city);
        enterZip(zipCode);
        selectCountry(Country.UNITED_KINGDOM);
        enterPhoneNumber(phone);
        selectShippingMethod("Fedex");
        clickNextButton();

    }
}
