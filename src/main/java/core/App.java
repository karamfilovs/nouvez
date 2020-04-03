package core;

import components.Components;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.*;

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
    private CartPage cartPage;
    private NewsFeedPage newsFeedPage;
    private ShopPage shopPage;
    private WishListPage wishListPage;
    private MyOrdersPage myOrdersPage;
    private AddressBookPage addressBookPage;
    private MyAccountNavigation myAccountNavigation;
    private OrderBySKUPage orderBySKUPage;
    private SendInvitationsPage sendInvitationsPage;
    private MyInvitationsPage myInvitationsPage;
    private WishListSharingPage wishListSharingPage;

    //lazy instantiating methods
    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public Components components() {
        if (components == null) {
            components = new Components(driver);
        }
        return components;
    }

    public MyAccountPage myAccountPage() {
        if (myAccountPage == null) {
            myAccountPage = new MyAccountPage(driver);
        }
        return myAccountPage;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }


    public ResetPasswordPage resetPasswordPage() {
        if (resetPasswordPage == null) {
            resetPasswordPage = new ResetPasswordPage(driver);
        }
        return resetPasswordPage;
    }

    public RegisterPage registerPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage(driver);
        }
        return registerPage;
    }

    public ProductDetailsPage productDetailsPage() {
        if (productDetailsPage == null) {
            productDetailsPage = new ProductDetailsPage(driver);
        }
        return productDetailsPage;
    }

    public ProductListingPage productListingPage() {
        if (productListingPage == null) {
            productListingPage = new ProductListingPage(driver);
        }
        return productListingPage;
    }

    public CheckoutPage checkoutPage() {
        if (checkoutPage == null) {
            checkoutPage = new CheckoutPage(driver);
        }
        return checkoutPage;
    }

    public CartPage cartPage() {
        if (cartPage == null) {
            cartPage = new CartPage(driver);
        }
        return cartPage;
    }

    public NewsFeedPage newsFeedPage() {
        if (newsFeedPage == null) {
            newsFeedPage = new NewsFeedPage(driver);
        }
        return newsFeedPage;
    }

    public ShopPage shopPage() {
        if (shopPage == null) {
            shopPage = new ShopPage(driver);
        }
        return shopPage;
    }

    public WishListPage wishListPage() {
        if (wishListPage == null) {
            wishListPage = new WishListPage(driver);
        }
        return wishListPage;
    }


    public WishListSharingPage wishListSharingPage() {
        if (wishListSharingPage == null) {
            wishListSharingPage = new WishListSharingPage(driver);
        }
        return wishListSharingPage;
    }


    public MyOrdersPage myOrdersPage() {
        if (myOrdersPage == null) {
            myOrdersPage = new MyOrdersPage(driver);
        }
        return myOrdersPage;
    }

    public AddressBookPage addressBookPage() {
        if (addressBookPage == null) {
            addressBookPage = new AddressBookPage(driver);
        }
        return addressBookPage;
    }


    public MyAccountNavigation myAccountNavigation() {
        if (myAccountNavigation == null) {
            myAccountNavigation = new MyAccountNavigation(driver);
        }
        return myAccountNavigation;
    }
    public OrderBySKUPage orderBySKUPage() {
        if (orderBySKUPage == null) {
            orderBySKUPage = new OrderBySKUPage(driver);
        }
        return orderBySKUPage;
    }
    public SendInvitationsPage sendInvitationsPage() {
        if (sendInvitationsPage == null) {
            sendInvitationsPage = new SendInvitationsPage(driver);
        }
        return sendInvitationsPage;
    }

    public MyInvitationsPage myInvitationsPage() {
        if (myInvitationsPage == null) {
            myInvitationsPage = new MyInvitationsPage(driver);
        }
        return myInvitationsPage;
    }


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
