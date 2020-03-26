package pages;

import enums.MyAccountNavMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class MyAccountPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyAccountPage.class);
    private static final String PAGE_URL = "/customer/account";

    @FindAll({@FindBy(how = How.XPATH, using = "//li[@class='nav item']//a")})
    private List<WebElement> navigationMenuLinks;


    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void gotoPage() {
        LOGGER.info("Navigating to My Account page");
        navigateTo(PAGE_URL);
    }

    public void navigateToMenu(MyAccountNavMenu menu) {
        LOGGER.info("Clicking on:" + menu.getMenu());
        for(WebElement menuLink : navigationMenuLinks){
            if (getText(menuLink).contains(menu.getMenu())){
                click(menuLink);
                break;
            }
        }
    }

}
