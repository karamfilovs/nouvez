package pages.UserPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.List;

public class AddressBookPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyOrdersPage.class);
    private static final String PAGE_URL = "/customer/address/";

    @FindBy(how = How.CSS, using = "button.action.primary.add")
    private WebElement addNewAddressButton;

    @FindBy(how = How.XPATH, using = "//div[@class='box box-address-billing']/div/address")
    private WebElement defaultBillingAddressText;

    @FindBy(how = How.XPATH, using = "//div[@class='box box-address-shipping']/div/address")
    private WebElement defaultShippingAddressText;

    @FindBy(how = How.XPATH, using = "//span[text()='Change Billing Address']")
    private WebElement changeBillingAddressButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Change Shipping Address']")
    private WebElement changeShippingAddressButton;

    @FindBy(how = How.XPATH, using = "//div[@class='message-success success message']")
    private WebElement messageAlert;

    @FindBy(how = How.CSS, using = "button.action-primary.action-accept")
    private WebElement okButton;

    @FindAll({@FindBy(how = How.CSS, using = "a.action.edit")})
    private List<WebElement> editAddressButtons;

    @FindAll({@FindBy(how = How.XPATH, using = "//a[@class='action delete']")})
    private List<WebElement> deleteAddressButtons;

    public AddressBookPage(WebDriver driver) {
        super(driver);
    }

    public void gotoPage() {
        LOGGER.info("Navigate Address Book directly");
        navigateTo(PAGE_URL); }

    public void clickAddNewAddressButton() {
        LOGGER.info("Clicking the add new address button");
        click(addNewAddressButton);}

    public void editFirstAddress() {
        LOGGER.info("Clicking on first edit button");
        for (WebElement editAddressButton : editAddressButtons) {
            click(editAddressButton);
            break; } }

    public String getDefaultBillingAddressText() {
        LOGGER.info("Getting the text of the default billing address");
        return getText(defaultBillingAddressText); }

    public String getDefaultShippingAddressText() {
        LOGGER.info("Getting the text of the default shipping address");
        return getText(defaultShippingAddressText); }

    public void clickChangeDefaultBillingAddressButton() {
        LOGGER.info("Clicking the add new address button");
        click(changeBillingAddressButton); }

    public void clickOKButton() {
        LOGGER.info("Clicking the OK button at the confirmation pop-up");
        click(okButton); }

    public void deleteFirstAddress() {
        LOGGER.info("Clicking the first delete address button");
        for(WebElement deleteAddressButton : deleteAddressButtons){
        click(deleteAddressButton);
            break;}
        clickOKButton();
        }

    public void clickChangeDefaultShippingAddressButton() {
        LOGGER.info("Clicking the add new address button");
        click(changeShippingAddressButton); }

    public String getTheTextOfTheMessageAlert() {
        LOGGER.info("Getting the text of the message alert");
        return getText(messageAlert); }
}