package pages.UserPages;

import enums.Country;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class EditAddressPage extends BasePage {

    @FindBy(how = How.ID, using = "street_1")
    private WebElement streetAddressField;

    @FindBy(how = How.ID, using = "street_2")
    private WebElement streetAddress2Field;

    @FindBy(how = How.ID, using = "city")
    private WebElement cityField;

    @FindBy(how = How.ID, using = "zip")
    private WebElement zipField;

    @FindBy(how = How.ID, using = "country")
    private WebElement countryDropDown;

    @FindBy(how = How.ID, using = "primary_shipping")
    private WebElement defaultShippingTickBox;

    @FindBy(how = How.CSS, using = "button.action.submit")
    private WebElement saveAddressButton;

    @FindBy(how = How.ID, using = "telephone")
    private WebElement phoneNumberField;

    public EditAddressPage (WebDriver driver){super(driver);}

    public void enterStreetAddressLine1(String streetAddressLine1) {
        LOGGER.info("Entering 1st line of street address:" + streetAddressLine1);
        typeText(streetAddressField, streetAddressLine1); }

    public void enterCity(String city) {
        LOGGER.info("Entering city name:" + city);
        typeText(cityField, city); }

    public void enterZip(String zip) {
        LOGGER.info("Entering post code:" + zip);
        typeText(zipField, zip); }

    public void enterPhoneNumber(String phoneNumber) {
        LOGGER.info("Entering post code:" + phoneNumber);
        typeText(phoneNumberField, phoneNumber); }

    public EditAddressPage selectCountry(Country country) {
        super.selectDropDownOptionByVisibleText(countryDropDown, country.getCountry());
        return this; }

    public void saveTheAddress() {
        LOGGER.info("Clicking the save address button");
        click(saveAddressButton); }

    public void enterNewAddress(String streetAddressLine1, String city, String zip, Country country, String phoneNumber ){
        enterStreetAddressLine1(streetAddressLine1);
        enterCity(city);
        enterZip(zip);
        selectCountry(Country.BELGIUM);
        enterPhoneNumber(phoneNumber);
        saveTheAddress();}
}
