package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

public class SymphonyProfiler extends BasePage {

    @FindBy (how = How.XPATH, using = "//a[@class='hide-button']")
    private WebElement hideSymphonyToolbarButton;


    public SymphonyProfiler(WebDriver driver) { super(driver); }

    public void closeSymphonyProfilerToolbar(){
        LOGGER.info("Clicking close Symphony Profiler toolbar button");
        click(hideSymphonyToolbarButton);
    }
}
