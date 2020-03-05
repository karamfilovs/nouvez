package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MyAccountPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyAccountPage.class);
    private static final String PAGE_URL = "/customer/account";

    @FindBy(how = How.CSS, using = ".icon.icon-account")
    private WebElement myAccountIcon;


    @FindBy(how = How.CSS, using = ".authorization-link > a:nth-child(1)")
    private WebElement signOutLink;



    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void gotoPage() {
        LOGGER.info("Navigating to My Account page");
        navigateTo(PAGE_URL);
    }

    public String myAccountIcon () {
        return getText(myAccountIcon);
    }

    /**
     * clicks logout button
     */
    public void logout() {
        click(signOutLink);
    }


}
