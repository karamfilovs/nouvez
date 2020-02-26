package core;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.*;

import java.io.File;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    private WebDriver driver;


    //pages
    private LoginPage loginPage;
    private BrandsPage brandsPage;
    private DashboardPage dashboardPage;
    private ResetPasswordPage resetPasswordPage;
    private RegisterPage registerPage;


    //lazy instantiating methods
    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
            return loginPage;
        } else {
            return loginPage;
        }
    }

    public BrandsPage brandsPage() {
        if (brandsPage == null) {
            brandsPage = new BrandsPage(driver);
            return brandsPage;
        } else {
            return brandsPage;
        }
    }

    public DashboardPage dashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage(driver);
            return dashboardPage;
        } else {
            return dashboardPage;
        }
    }

    public ResetPasswordPage resetPasswordPage() {
        if (resetPasswordPage == null) {
            resetPasswordPage = new ResetPasswordPage(driver);
            return resetPasswordPage;
        } else {
            return resetPasswordPage;
        }
    }

    public RegisterPage registerPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage(driver);
            return registerPage;
        } else {
            return registerPage;
        }
    }


    public void startBrowser(String browser) {
        if (SystemUtils.IS_OS_LINUX) {
            if (browser.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.setHeadless(isHeadless());
                options.addArguments("--window-size=1920,1080");
                driver = new ChromeDriver(options);
            } else if (browser.equalsIgnoreCase("firefox")) {
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("-width=1920");
                options.addArguments("-height=1080");
                options.setHeadless(isHeadless());
                driver = new FirefoxDriver(options);
            } else {
                throw new RuntimeException("Not supported browser");
            }
        } else {
            if (browser.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.setHeadless(isHeadless());
                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase("firefox")) {
                FirefoxOptions options = new FirefoxOptions();
                options.setHeadless(isHeadless());
                driver = new FirefoxDriver(options);
                driver.manage().window().maximize();
            } else {
                throw new RuntimeException("Not supported browser");
            }


            LOGGER.info("******************************************************************");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();
        }
    }

    private boolean isHeadless() {
        if(System.getProperty("headless").equals("on")){
            LOGGER.info("Starting headless browser execution");
            return true;
        } else {
            return false;
        }
    }

    public void quit() {
        driver.quit();
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
}
