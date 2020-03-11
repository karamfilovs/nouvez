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
        options.setHeadless(isHeadless());
        driver = new ChromeDriver(options);
        defaultSetup();
        return driver;
    }




    protected boolean isHeadless() {
        return System.getProperty("headless").equals("on");
    }

    private void defaultSetup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }



    public WebDriver createFirefox() {
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(isHeadless());
        driver =  new FirefoxDriver(options);
        defaultSetup();
        return driver;
    }

}
