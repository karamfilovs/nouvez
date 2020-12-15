package pages.UserPages;

import enums.MyAccountNavMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.List;


public class MyAccountPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyAccountPage.class);
    private static final String PAGE_URL = "/account";

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindAll({@FindBy(how = How.XPATH, using = "//li[@class='nav item']//a")})
    private List<WebElement> navigationMenuLinks;

    @FindBy(how = How.XPATH, using = "//div[@class='account-welcome']/h1")
    private WebElement welcomeMessage;


    public String confirmTheWelcomeMessage(){
        LOGGER.info("Gets the text of the welcome message");
        return getText(welcomeMessage);}


    public void navigateToMenu(MyAccountNavMenu menu) {
        LOGGER.info("Clicking on:" + menu.getMenu());
        for(WebElement menuLink : navigationMenuLinks){
            if (getText(menuLink).contains(menu.getMenu())){
                click(menuLink);
                break; } } }

}
