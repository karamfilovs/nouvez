package pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyAccountPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyAccountPage.class);
    private static final String PAGE_URL = "/customer/account";


    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void gotoPage() {
        LOGGER.info("Navigating to My Account page");
        navigateTo(PAGE_URL);
    }




}
