package pages.UserPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class MyAccountNavigation extends BasePage {

    @FindBy(how = How.CSS, using = "nav.account-nav")
    private WebElement becomeSeller;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account-nav\"]/ul/li[1]/av")
    private WebElement myAccount;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account-nav\"]/ul/li[2]/a")
    private WebElement myOrders;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account-nav\"]/ul/li[3]/a")
    private WebElement orderBySKU;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account-nav\"]/ul/li[4]/a")
    private WebElement myWishList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account-nav\"]/ul/li[6]/a")
    private WebElement addressBook;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account-nav\"]/ul/li[7]/a")
    private WebElement accountInformation;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account-nav\"]/ul/li[8]/a")
    private WebElement giftCard;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account-nav\"]/ul/li[10]/a")
    private WebElement rewardPoints;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account-nav\"]/ul/li[11]/a")
    private WebElement giftRegistry;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account-nav\"]/ul/li[12]/a")
    private WebElement myProductReviews;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account-nav\"]/ul/li[13]/a")
    private WebElement newsletterSubscriptions;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account-nav\"]/ul/li[14]/a")
    private WebElement myInvitations;


    public MyAccountNavigation(WebDriver driver) {
        super(driver);
    }


    public void clickBecomeSeller() {
        LOGGER.info("Clicking become seller button from the navigation in my account");
        click(becomeSeller);
    }

    public void clickMyAccount() {
        LOGGER.info("Clicking my account button from the navigation in my account");
        click(myAccount);
    }

    public void clickMyOrders() {
        LOGGER.info("Clicking my orders button from the navigation in my account");
        click(myOrders);
    }

    public void clickOrderBySku() {
        LOGGER.info("Clicking order by SKU button from the navigation in my account");
        click(orderBySKU);
    }

    public void clickMyWishList() {
        LOGGER.info("Clicking my wish list button from the navigation in my account");
        click(myWishList);
    }

    public void clickAddressBook() {
        LOGGER.info("Clicking address book button from the navigation in my account");
        click(addressBook);
    }

    public void clickAccountInformation() {
        LOGGER.info("Clicking account information button from the navigation in my account");
        click(accountInformation);
    }

    public void clickGiftCard() {
        LOGGER.info("Clicking gift card button from the navigation in my account");
        click(giftCard);
    }

    public void clickRewardPoints() {
        LOGGER.info("Clicking reward points button from the navigation in my account");
        click(rewardPoints);
    }

    public void clickGiftRegistry() {
        LOGGER.info("Clicking gift registry button from the navigation in my account");
        click(giftRegistry);
    }

    public void clickMyProductReviews() {
        LOGGER.info("Clicking my product reviews button from the navigation in my account");
        click(myProductReviews);
    }

    public void clickNewsletterSubscriptions() {
        LOGGER.info("Clicking newsletter subscriptions button from the navigation in my account");
        click(newsletterSubscriptions);
    }

    public void clickMyInvitations() {
        LOGGER.info("Clicking my invitations button from the navigation in my account");
        click(myInvitations);
    }


}
