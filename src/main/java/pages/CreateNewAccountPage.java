package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateNewAccountPage extends BasePage {

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordField;

    @FindBy(how = How.ID, using = "password-confirmation")
    private WebElement confirmPasswordField;

    @FindBy(how = How.ID, using = "is_subscribed")
    private WebElement newsletterCheckBox;

    @FindBy(how = How.CSS, using = "button.action.primary.submit")
    private WebElement createAnAccountButton;

    public CreateNewAccountPage(WebDriver driver) {super(driver);}

    public void typePassword(String password){
        LOGGER.info("Typing password");
        typeText(passwordField,password);}

    public void confirmPassword(String password){
        LOGGER.info("Typing password confirmation");
        typeText(confirmPasswordField,password); }

     public void subscribeForNewsletter(){
        LOGGER.info("Subscribing for newsletter");
        click(newsletterCheckBox);}

     public void clickCreateAccountButton(){
        LOGGER.info("Clicking create an account button ");
        click(createAnAccountButton); }

    public void fillInPasswordsAndCreate(String password){
        LOGGER.info("Filling in necessary info - password and confirm password");
        typePassword(password);
        confirmPassword(password);
        clickCreateAccountButton();
    }
}
