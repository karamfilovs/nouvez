package pages.UserPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class AddNewAddressPage extends BasePage {

    @FindBy(how = How.ID, using = "street_1")
    private WebElement streetAddressField;

    @FindBy(how = How.ID, using = "city")
    private WebElement cityField;

    @FindBy(how = How.ID, using = "zip")
    private WebElement zipField;

    @FindBy(how = How.ID, using = "country")
    private WebElement countryDropDown;

    @FindBy(how = How.ID, using = "primary_billing")
    private WebElement defaultBillingAddressCheckbox;

    @FindBy(how = How.ID, using = "primary_shipping")
    private WebElement defaultShippingAddressCheckbox;

    @FindBy(how = How.ID, using = "telephone")
    private WebElement phoneNumberField;

    @FindBy(how = How.CSS, using = "button.action.submit.primary")
    private WebElement saveAddressButton;

    public AddNewAddressPage(WebDriver driver){ super(driver);}

    public void typeStreetAddress(String streetAddress){
        LOGGER.info("Inserting" + streetAddress +  "in the street address field");
        typeText(streetAddressField,streetAddress);}

    public void typeCity(String city){
        LOGGER.info("Inserting" + city +  "in the city field");
        typeText(cityField, city);}

    public void typeZip(String zip){
        LOGGER.info("Inserting" + zip +  "in the zip field");
        typeText(zipField, zip);}

    public void selectCountry(WebElement countryDropDown, String countryToSelect){
        LOGGER.info("Selecting country from the drop-down menu");
            Select select = new Select(countryDropDown);
            select.selectByVisibleText(countryToSelect); }

    public void setDefaultBillingAddressCheckbox(){
        LOGGER.info("Checking the default billing address checkbox");
        click(defaultBillingAddressCheckbox);}

    public void setDefaultShippingAddressCheckbox(){
        LOGGER.info("Checking the default shipping address checkbox");
        click(defaultShippingAddressCheckbox); }

    public void clickSaveAddressButton(){
        LOGGER.info("Clicking the save address button");
        click(saveAddressButton); }

    public void typePhoneNumber(String phoneNumber){
        LOGGER.info("Inserting" + phoneNumber + " in the phone number field");
        typeText(phoneNumberField, phoneNumber);}

    public void addNewUKAddress(){
        typeStreetAddress("98  Southern Way");
        typeCity("NORTH ORMSBY");
        typeZip("LN11 3YU");
        selectCountry(countryDropDown,"United Kingdom");
        typePhoneNumber("07944828102");   }
}
