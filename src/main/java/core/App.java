package core;

import CategoryPages.CategoryPages;
import components.Components;
import components.MyAccountNavigation;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.ProductPages.*;
import pages.UserPages.*;

import java.io.File;
import java.time.LocalTime;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    private Browser browser = new Browser();
    private WebDriver driver;

    //pages
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private ResetPasswordPage resetPasswordPage;
    private RegisterPage registerPage;
    private HomePage homePage;
    private Components components;
    private ProductDetailsPage productDetailsPage;
    private ProductListingPage productListingPage;
    private CheckoutPage checkoutPage;
    private CheckoutPage2 checkoutPage2;
    private NewsFeedPage newsFeedPage;
    private WishListPage wishListPage;
    private MyOrdersPage myOrdersPage;
    private AddressBookPage addressBookPage;
    private MyAccountNavigation myAccountNavigation;
    private MyInvitationsPage myInvitationsPage;
    private WishListSharingPage wishListSharingPage;
    private ShopByCategoryPage shopByCategoryPage;
    private CategoryPages categoryPages;
    private DesignerPage designerPage;
    private AddNewAddressPage addNewAddressPage;
    private SuccessPage successPage;
    private CreateNewAccountPage createNewAccountPage;
    private EditAddressPage editAddressPage;
    private ShoppingBasketPage shoppingBasketPage;


    //lazy instantiating methods
    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver); }
        return loginPage; }

    public Components components() {
        if (components == null) {
            components = new Components(driver); }
        return components; }

    public MyAccountPage myAccountPage() {
        if (myAccountPage == null) {
            myAccountPage = new MyAccountPage(driver); }
        return myAccountPage; }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage(driver); }
        return homePage; }


    public ResetPasswordPage resetPasswordPage() {
        if (resetPasswordPage == null) {
            resetPasswordPage = new ResetPasswordPage(driver); }
        return resetPasswordPage; }

    public RegisterPage registerPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage(driver); }
        return registerPage; }

    public ProductDetailsPage productDetailsPage() {
        if (productDetailsPage == null) {
            productDetailsPage = new ProductDetailsPage(driver); }
        return productDetailsPage; }

    public ProductListingPage productListingPage() {
        if (productListingPage == null) {
            productListingPage = new ProductListingPage(driver); }
        return productListingPage; }

    public CheckoutPage checkoutPage() {
        if (checkoutPage == null) {
            checkoutPage = new CheckoutPage(driver); }
        return checkoutPage; }

    public CheckoutPage2 checkoutPage2() {
        if (checkoutPage2 == null) {
            checkoutPage2 = new CheckoutPage2(driver); }
        return checkoutPage2; }

    public NewsFeedPage newsFeedPage() {
        if (newsFeedPage == null) {
            newsFeedPage = new NewsFeedPage(driver); }
        return newsFeedPage; }


    public WishListPage wishListPage() {
        if (wishListPage == null) {
            wishListPage = new WishListPage(driver); }
        return wishListPage; }

    public WishListSharingPage wishListSharingPage() {
        if (wishListSharingPage == null) {
            wishListSharingPage = new WishListSharingPage(driver); }
        return wishListSharingPage; }


    public MyOrdersPage myOrdersPage() {
        if (myOrdersPage == null) {
            myOrdersPage = new MyOrdersPage(driver); }
        return myOrdersPage; }

    public AddressBookPage addressBookPage() {
        if (addressBookPage == null) {
            addressBookPage = new AddressBookPage(driver); }
        return addressBookPage; }

    public MyAccountNavigation myAccountNavigation() {
        if (myAccountNavigation == null) {
            myAccountNavigation = new MyAccountNavigation(driver); }
        return myAccountNavigation; }


    public MyInvitationsPage myInvitationsPage() {
        if (myInvitationsPage == null) {
            myInvitationsPage = new MyInvitationsPage(driver); }
        return myInvitationsPage; }

    public ShopByCategoryPage shopByCategoryPage() {
        if (shopByCategoryPage == null) {
            shopByCategoryPage = new ShopByCategoryPage(driver); }
        return shopByCategoryPage; }

    public CategoryPages categoryPages() {
        if (categoryPages == null) {
            categoryPages = new CategoryPages(driver); }
        return categoryPages; }

    public DesignerPage designerPage() {
        if (designerPage == null) {
            designerPage = new DesignerPage(driver); }
        return designerPage; }

         public AddNewAddressPage addNewAddressPage() {
        if (addNewAddressPage == null) {
            addNewAddressPage = new AddNewAddressPage(driver); }
        return addNewAddressPage; }

        public SuccessPage successPage() {
        if (successPage == null) {
            successPage = new SuccessPage(driver); }
        return successPage; }

        public CreateNewAccountPage createNewAccountPage() {
        if (createNewAccountPage == null) {
            createNewAccountPage = new CreateNewAccountPage(driver); }
        return createNewAccountPage; }

        public EditAddressPage editAddressPage() {
        if (editAddressPage == null) {
            editAddressPage = new EditAddressPage(driver); }
        return editAddressPage; }

        public ShoppingBasketPage shoppingBasketPage() {
        if (shoppingBasketPage == null) {
            shoppingBasketPage = new ShoppingBasketPage(driver); }
        return shoppingBasketPage; }


    /**
     * Takes screenshot of the current screen
     *
     * @param className Name of the class from which it was invoked
     * @param method    Test method name
     * @param timestamp Current time stamp
     */
    public void takeScreenshot(String className, String method, LocalTime timestamp) {
        if (driver instanceof TakesScreenshot) {
            TakesScreenshot screenshotTakingDriver = (TakesScreenshot) driver;
            try {
                File localScreenshots = new File(new File("target"), "screenshots");
                if (!localScreenshots.exists() || !localScreenshots.isDirectory()) {
                    localScreenshots.mkdirs();
                }
                File screenshot = new File(localScreenshots, className + "_" + method + "_" + timestamp.getHour() + "." + timestamp.getMinute() + "." + timestamp.getSecond() + ".png");
                FileUtils.copyFile(screenshotTakingDriver.getScreenshotAs(OutputType.FILE), screenshot);
                LOGGER.info("Screenshot for class={} method={} saved in: {}", className, method, screenshot.getAbsolutePath());
            } catch (Exception e1) {
                LOGGER.error("Unable to take screenshot", e1);
            }
        } else {
            LOGGER.info("Driver '{}' can't take screenshots so skipping it.", driver.getClass());
        }
    }

    public void startBrowser(String browserType) {
        LOGGER.info("Starting browser: " + browserType.toUpperCase());
        if (browserType.equalsIgnoreCase("chrome")) {
            //Create chrome browser
            driver = browser.createChrome();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            //Create firefox
            driver = browser.createFirefox();

        } else {
            //Throw exception
            throw new RuntimeException("Not supported browser. Please check environment variables");
        }

    }

    public void quit() {
        driver.close();
        driver.quit();
    }

    public void clearBrowserState() {
        driver.manage().deleteAllCookies();
        driver.navigate().to(System.getProperty("url"));
        driver.manage().deleteAllCookies();
    }
}
