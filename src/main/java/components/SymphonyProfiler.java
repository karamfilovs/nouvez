package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class SymphonyProfiler extends BasePage {

    @FindBy (how = How.ID, using = "sfToolbarHideButton-618210")
    private WebElement hideSymphonyToolbarButton;


    public SymphonyProfiler(WebDriver driver) { super(driver); }

    public void clickHideSymphonyToolbarButton(){
        LOGGER.info("Clicking close Symphony Profiler toolbar button");
        click(hideSymphonyToolbarButton);
    }
}
