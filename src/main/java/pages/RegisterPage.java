package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegisterPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterPage.class);
    private final String PAGE_URL = "/register";

    @FindBy(how = How.ID, using = "btn-login")
    private WebElement createAccountButton;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void gotoPage(){
        LOGGER.info("Navigating to Register page");
        navigateTo(PAGE_URL);
    }

    public String getCreateAccountButton() {
        return getText(createAccountButton);
    }

}
