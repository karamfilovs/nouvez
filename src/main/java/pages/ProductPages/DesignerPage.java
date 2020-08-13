package pages.ProductPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.util.List;

public class DesignerPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);
    private final String PAGE_URL = "/marketplace/seller/sellerlist";

    @FindBy(how = How.ID, using = "sellersearch")
    private WebElement sellerSearchBar;

    @FindBy(how = How.ID, using = "shop_reset")
    private WebElement resetSearch;

    @FindAll({@FindBy(how = How.XPATH, using = "//*[contains(@title,'View')]")})
    private List<WebElement> viewProfileButtons;

    @FindAll({@FindBy(how = How.XPATH, using = "//*[contains(@id,'filter')]")})
    private List<WebElement> filterByValues;


    public DesignerPage(WebDriver driver){super(driver);}

    public void goToDesignersPage() {
        LOGGER.info("Navigating to Designers page");
        navigateTo(PAGE_URL); }

    public void searchDesigner(String designerName) {
        LOGGER.info("Searching for designer: " + designerName);
        typeText(sellerSearchBar, designerName);
        sellerSearchBar.sendKeys(Keys.ENTER); }

    public void clickOnLetterFilter(String filterByValue) {
        clickWebElementByText(filterByValue,filterByValues); }

    public void canOpenFirstDesignerPage(){
        LOGGER.info("Clicking on first view profile button");
            for(WebElement viewProfileButton : viewProfileButtons){
                click(viewProfileButton);
                break; } }

    public void clickDesignerByName(String designerName){
        LOGGER.info("Clicking on " + designerName + " link");
        for(WebElement designerLink : viewProfileButtons){
            if(getText(designerLink).contains(designerName))
            click(designerLink);
        break;} }
}

