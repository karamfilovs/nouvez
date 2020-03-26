package pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddressBookPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyOrdersPage.class);
    private static final String PAGE_URL = "/customer/address/";

    public AddressBookPage(WebDriver driver) {
        super(driver);
    }

    public void gotoPage(){
        LOGGER.info("Navigate Address Book directly");
        navigateTo(PAGE_URL);
    }
}
