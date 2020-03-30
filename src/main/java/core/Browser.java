package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class Browser {
    protected WebDriver driver;

    public WebDriver createChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("ignore-certificate-errors");
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        driver = new ChromeDriver(options);
        defaultSetup();
        return driver;
    }


    protected boolean isHeadless() {
        return System.getProperty("headless").equals("on");
    }

    private void defaultSetup() {
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }


    public WebDriver createFirefox() {
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(isHeadless());
        driver = new FirefoxDriver(options);
        defaultSetup();
        return driver;
    }

}
