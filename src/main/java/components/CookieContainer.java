package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class CookieContainer extends BasePage {

    @FindBy (how = How.XPATH, using = "//button[contains(text(),'Accepteren')]")
    private WebElement acceptCookiesButton;

    public CookieContainer(WebDriver driver) { super(driver); }

    public void clickAcceptCookiesButton(){
        LOGGER.info("Clicks reject cookies button");
        click(acceptCookiesButton);
    }
}
