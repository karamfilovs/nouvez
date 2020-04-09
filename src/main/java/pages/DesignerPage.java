package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DesignerPage extends BasePage {

    @FindBy(how = How.ID, using = "sellersearch")
    private WebElement sellerSearchBar;

    @FindAll({@FindBy(how = How.CSS, using = "div.special-link")})
    private List<WebElement> viewProfileButtons;

    @FindAll({@FindBy( how = How.XPATH, using = "//div[@class='azfilter']/a")})
    private List<WebElement> azFilter;


    public DesignerPage(WebDriver driver){super(driver);}

    public void searchDesigner(String designerName) {
        LOGGER.info("Searching for designer: " + designerName);
        typeText(sellerSearchBar, designerName);
        sellerSearchBar.sendKeys(Keys.ENTER);
    }

    public void clickOnLetterFilter(String letter) {
        clickWebElementByText(letter,azFilter); }

        public void canOpenFirstDesignerPage(){
        LOGGER.info("Clicking on first view profile button");
            for(WebElement viewProfileButton : viewProfileButtons){
                click(viewProfileButton);
                break; } }

}

