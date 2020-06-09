package pages;

import enums.Checked;
import enums.Currency;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    private static int WAIT_TIME = 10;

    public static final Logger LOGGER = LoggerFactory.getLogger(BasePage.class);

    protected final String BASE_URL = System.getProperty("url");

    @FindBy(how = How.NAME, using = "title")
    private WebElement pageTitle;

    @FindBy(how = How.XPATH, using = "//div[@class='logo']")
    private WebElement companyLogo;

    @FindBy(how = How.CSS, using = "span.icon.icon-search")
    private WebElement searchIcon;

    @FindBy(how = How.XPATH, using = "//button[@title='Search']")
    private WebElement searchButton;

    @FindBy(how = How.CSS, using = "input#search.input-text")
    private WebElement searchField;

    @FindBy(how = How.CSS, using = "span.icon.icon-heart")
    private WebElement wishListIcon;

    @FindBy(how = How.CSS, using = ".icon.icon-account")
    private WebElement myAccountIcon;

    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    protected void typeText(WebElement element, String text) {
        waitForElementVisibility(element);
        element.clear();
        element.sendKeys(text);
    }

    /**
     * Navigates to specific url appended to base url
     *
     * @param url page url extension after the base url
     */
    protected void navigateTo(String url) {
        driver.navigate().to(BASE_URL + url);
    }

    protected void click(WebElement element) {
        waitForElementVisibility(element);
        element.click();
    }

    protected void clickWithActionsBuilder(WebElement element) {
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickBrowserBack() {
        driver.navigate().back();
    }

    public void clickBrowserForward() {
        driver.navigate().forward();
    }

    public boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    protected void switchToActiveElement() {
        driver.switchTo().activeElement();
    }

    public void refreshBrowser() {
        driver.navigate().refresh();
    }


    /**
     * Method used for checking a checkbox or radio button
     *
     * @param checkboxToCheck the element you want to be checked
     * @param isChecked       enums.Checked.YES or enums.Checked.NO depending on if you want it checked or no
     */
    protected void checkCheckbox(WebElement checkboxToCheck, Checked isChecked) {
        if (!checkboxToCheck.isSelected() && isChecked == Checked.YES) {
            checkboxToCheck.click();
        } else if (checkboxToCheck.isSelected() && isChecked == Checked.NO) {
            checkboxToCheck.click();
        }
    }

    /**
     * Method used for selecting a radio button within multiple radio buttons based on the
     * visible text
     *
     * @param allRadioButtons           a list of all available radio buttons from which you would like to select
     * @param optionVisibleTextToSelect the option that you want to be selected from the multiple radio buttons
     */
    public void selectRadioButton(List<WebElement> allRadioButtons, String optionVisibleTextToSelect) {
        for (WebElement curRadioButton : allRadioButtons) {
            if (curRadioButton.getText().toLowerCase().contains(optionVisibleTextToSelect.toLowerCase())) {
                curRadioButton.click();
                return;
            }
        }

        throw new RuntimeException("Was unable to find a radio button with the specified text: " + optionVisibleTextToSelect);
    }

    /**
     * Waits for a specified element to be visible to work with it for a specified time frame
     *
     * @param elementToBeVisible
     * @return
     */
    protected WebElement waitForElementVisibility(WebElement elementToBeVisible) {
        waitForFullPageOrJsAjaxToLoad();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
        WebElement foundElementAfterWait = wait.until(ExpectedConditions.visibilityOf(elementToBeVisible));
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        return foundElementAfterWait;

    }

    /**
     * Waits for a specified element to be clickable to work with it for a specified time frame
     * *
     *
     * @param elementToBeVisible
     * @return
     */
    protected WebElement waitForElementToBeClickable(WebElement elementToBeVisible) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME);
        WebElement foundElementAfterWait = wait.until(ExpectedConditions.elementToBeClickable(elementToBeVisible));
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        return foundElementAfterWait;
    }

    /**
     * Gets the text of a specified Web Element
     *
     * @param elementToGetText the element you want to get the text of
     * @return the containing text of the specified element
     */
    protected String getText(WebElement elementToGetText) {
        waitForElementVisibility(elementToGetText);
        return elementToGetText.getText();
    }

    /**
     * @param elementToGetText
     * @param attribute
     * @return
     */
    protected String getTextFromAttribute(WebElement elementToGetText, String attribute) {

        return elementToGetText.getAttribute(attribute);
    }


    /**
     * Selects an option from a dropdown based on the visible text
     *
     * @param dropDown                  the drop down WebElement
     * @param optionVisibleTextToSelect the option in the dropdown you would like to see selected
     */
    public void selectDropDownOptionByVisibleText(WebElement dropDown, String optionVisibleTextToSelect) {
        waitForElementVisibility(dropDown);
        Select select = new Select(dropDown);
        select.selectByVisibleText(optionVisibleTextToSelect);
    }

    /**
     * gets an option from a dropdown based on the visible text
     *
     * @param dropDown the drop down WebElement
     * @return returns selected value as string
     */
    public String getDropDownOption(WebElement dropDown) {
        waitForElementVisibility(dropDown);
        Select select = new Select(dropDown);
        return getText(select.getFirstSelectedOption());
    }


    public boolean waitForFullPageOrJsAjaxToLoad() {

        WebDriverWait wait = new WebDriverWait(driver, 30);

        // wait for jQuery to load
        ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return ((Long) ((JavascriptExecutor) driver).executeScript("return jQuery.active") == 0);
                } catch (Exception e) {
                    // no jQuery present
                    return true;
                }
            }
        };

        // wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState")
                        .toString().equals("complete");
            }
        };

        return wait.until(jQueryLoad) && wait.until(jsLoad);
    }



    /**
     * Scrolling down to element
     *
     * @param element target element
     */
    protected void scrollDownToElement(WebElement element) {
        LOGGER.info("Scrolling down");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    /**
     * Getting title of a page to assert we landed on the correct page before testing it.
     *
     * @return
     */
    public String getPageTitle() {
        return getTextFromAttribute(pageTitle, "content");
    }


    public void changeCurrency(Currency currency) {
        if (currency == Currency.EU) {

        }

    }

    /**
     * Method that clicks on the logo from any page to bring you back to home page.
     */
    public void clickCompanyLogo() {
        LOGGER.info("Clicking on logo image");
        click(companyLogo);
    }

    public void clickMyAccountIcon() {
        LOGGER.info("Clicking on My Account link from main menu");
        click(myAccountIcon);
        waitForFullPageOrJsAjaxToLoad();
    }


    public void searchProduct(String productName) {
        LOGGER.info("Searching for product: " + productName);
        click(searchIcon);
        typeText(searchField, productName);
        click(searchButton);
    }


    public void hoverOver(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void clickWishListIcon() {
        LOGGER.info("Clicking wish list icon from components bar");
        click(wishListIcon);
    }

    protected void clickWebElementByText(String text, List<WebElement> listToGetFrom){
        LOGGER.info("Clicking element with text :" + text);
        for (WebElement curElement : listToGetFrom) {
            if (getText(curElement).contains(text)) {
                click(curElement);
                break; } } }

}
