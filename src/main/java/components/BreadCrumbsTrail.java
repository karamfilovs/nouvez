package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;

import java.util.List;

public class BreadCrumbsTrail extends BasePage {

    @FindAll({@FindBy(how = How.CSS, using = " a.icon-breadcrumb")})
    private List<WebElement> breadCrumbOptions;

    public BreadCrumbsTrail(WebDriver driver) {
        super(driver);
    }

    public void clickBreadCrumb(String option) {
        LOGGER.info("Clicking on:" + option);
        for (WebElement breadCrumbOption : breadCrumbOptions) {
            if (getText(breadCrumbOption).contains(option)) {
                click(breadCrumbOption);
                break;
            }
        }
    }

}

