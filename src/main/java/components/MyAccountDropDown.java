package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class MyAccountDropDown extends BasePage {

    @FindBy(how = How.XPATH, using = "//img[@class='logged-drop']")
    private WebElement myAccountDropDown;

    @FindBy(how = How.XPATH, using = "//a[@title='Aanmelden']")
    private WebElement loginButton;

    public MyAccountDropDown(WebDriver driver) { super(driver); }

    public void clickMyAccountDropDown(){
        LOGGER.info("Clicks my account drop down");
        click(myAccountDropDown); }

    public void clickLoginButton(){
        LOGGER.info("Clicks login button ");
        clickMyAccountDropDown();
        click(loginButton); }
}
