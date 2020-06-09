package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SuccessPage extends BasePage {

    @FindBy(how = How.CSS, using = "div.page-title")
    private WebElement successMessage;

    @FindBy(how = How.XPATH, using = "//span[text()='Create an Account']")
    private WebElement createAccountButton;

    @FindBy(how = How.XPATH, using = "//span[text()='Continue Shopping']")
    private WebElement continueShoppingButton;

    public SuccessPage(WebDriver driver) { super(driver); }

    public String getSuccessMessageText(){
        LOGGER.info("Getting the text of the success message for verification purposes");
       return getText(successMessage);}

    public void clickContinueShoppingButton(){
        LOGGER.info("Clicking the continue shopping button ");
        click(continueShoppingButton);}

    public void clickCreateAnAccountButton(){
        LOGGER.info("Clicking the create an account button ");
        click(createAccountButton);}
}
