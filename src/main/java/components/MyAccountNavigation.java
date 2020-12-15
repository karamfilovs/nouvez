package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class MyAccountNavigation extends BasePage {

    @FindBy(how = How.CSS, using = "nav.account-nav")
    private WebElement becomeSellerLink;

    @FindBy(how = How.XPATH, using = "//a[text()='Manage Print PDF Header Info']")
    private WebElement managePrintHeaderLink;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'My Order History')]")
    private WebElement myOrderHistoryLink;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Shipping Setting')]")
    private WebElement shippingSettingsLink;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Connect To Stripe')]")
    private WebElement connectToStripeLink;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'My Orders')]")
    private WebElement myOrdersLink;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Account Information')]")
    private WebElement accountInformationLink;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Address Book')]")
    private WebElement addressBookLink;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'My Wish List')]")
    private WebElement myWishListLink;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Newsletter Subscriptions')]")
    private WebElement newsLetterSubscriptionsLink;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign out')]")
    private WebElement signOutLink;

    public MyAccountNavigation(WebDriver driver) { super(driver); }

    public void clickBecomeSellerLink() {
        LOGGER.info("Clicking the become seller link on my account navigation panel ");
        click(becomeSellerLink);}

    public void clickManagePrintHeaderLink() {
            LOGGER.info("Clicking the manage print header link on my account navigation panel ");
            click(managePrintHeaderLink); }

    public void clickMyOrderHistoryLink() {
            LOGGER.info("Clicking my order history link on my account navigation panel ");
            click(myOrderHistoryLink); }

    public void clickShippingSettingsLink() {
            LOGGER.info("Clicking shipping setting link on my account navigation panel ");
            click(shippingSettingsLink); }

    public void clickConnectToStripeLink() {
            LOGGER.info("Clicking connect to Stripe link on my account navigation panel ");
            click(connectToStripeLink); }

    public void clickMyOrdersLink() {
            LOGGER.info("Clicking my orders link on my account navigation panel ");
            click(myOrdersLink); }

    public void clickAccountInformationLink() {
            LOGGER.info("Clicking account information link on my account navigation panel ");
            click(accountInformationLink); }

    public void clickAddressBookLink() {
            LOGGER.info("Clicking address book link on my account navigation panel ");
            click(addressBookLink); }

    public void clickMyWishListLink() {
            LOGGER.info("Clicking my wish list link on my account navigation panel ");
            click(myWishListLink); }

    public void clickNewsletterSubscriptionLink() {
            LOGGER.info("Clicking newsletter subscription link on my account navigation panel ");
            click(newsLetterSubscriptionsLink); }

    public void clickSignOutLink() {
            LOGGER.info("Clicking sign out link on my account navigation panel ");
            click(signOutLink); }

    }








