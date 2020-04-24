package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MyOrdersPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyOrdersPage.class);
    private static final String PAGE_URL = "/sales/order/history/";

    @FindAll({@FindBy(how = How.XPATH, using = "//span[text()='Reorder']")})
    private List<WebElement> reorderLinks;

    @FindAll({@FindBy(how = How.XPATH, using = "//span[text()='View Order']")})
    private List<WebElement> viewOrderLinks;

    @FindBy(how = How.CSS, using = "div.block-title")
    private WebElement orderInfo;

    @FindBy(how = How.CSS, using = "a.action.back")
    private WebElement backButton;

    public MyOrdersPage(WebDriver driver) {super(driver);}

    public void gotoMyOrdersPage(){
        LOGGER.info("Navigate to My Orders directly");
        navigateTo(PAGE_URL);
    }
    public String getOrderInfo(){
        LOGGER.info("Getting order info");
        return getText(orderInfo);
    }

    public void clickBackButton(){
        LOGGER.info("Clicking back to my orders button");
        click(backButton);
    }

    public void reorderFirst() {
        LOGGER.info("Clicking on first reorder option");
        for(WebElement reorder : reorderLinks){
            click(reorder);
            break;
        }
    }

    public void viewFirstOrder() {
        LOGGER.info("Clicking on first view order option");
        for(WebElement viewOrder : viewOrderLinks){
            click(viewOrder);
            break;
        }
    }
}
