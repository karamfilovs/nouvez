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
    private DashboardPage dashboardPage;
    private ResetPasswordPage resetPasswordPage;
    private RegisterPage registerPage;
    private HomePage homePage;
    private Components components;
    private ProductDetailsPage productDetailsPage;
    private ProductListingPage productListingPage;


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

    public DashboardPage dashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage(driver);
        }
        return dashboardPage;
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
        driver.quit();
    }

    public void deleteCookies(){
        driver.manage().deleteAllCookies();
    }
}
