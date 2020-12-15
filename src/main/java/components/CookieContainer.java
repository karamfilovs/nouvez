package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class CookieContainer extends BasePage {

    @FindBy (how = How.CSS, using = "button.btn.btn-secondary ")
    private WebElement rejectCookiesButton;

    public CookieContainer(WebDriver driver) { super(driver); }

    public void clickRejectCookiesButton(){
        LOGGER.info("Clicks reject cookies button");
        click(rejectCookiesButton);
    }
}
