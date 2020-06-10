package pages;

import enums.Checked;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CheckoutPage2 extends BasePage {

    @FindBy(how = How.XPATH, using = "//span[text()='Stripe']")
    private WebElement stripePayment;

    @FindBy(how = How.XPATH, using = "//input[@id='billing-address-same-as-shipping-mpstripe']")
    private WebElement billingAddressTickBox;

    @FindBy(how = How.ID, using = "agreement_mpstripe_1")
    private WebElement termsAndConditionsTickBox;

    @FindBy(how = How.CSS, using = "button.action.action-show")
    private WebElement termsAndConditionsButton;

    @FindBy(how = How.ID_OR_NAME, using = "cardnumber")
    private WebElement cardNumberField;

    @FindBy(how = How.ID_OR_NAME, using = "exp-date")
    private WebElement expDateField;

    @FindBy(how = How.ID_OR_NAME, using = "cvc")
    private WebElement cvcField;

    @FindBy(how = How.CSS, using = "button.action.primary.checkout")
    private WebElement placeOrderButton;

    @FindBy(how = How.ID, using = "discount-code")
    private WebElement discountCodeField;

    @FindBy(how = How.CSS, using = "button.action.action-apply")
    private WebElement applyButton;

    @FindBy(how = How.CSS, using = "li.opc-progress-bar-item._complete")
    private WebElement shippingTab;

    @FindBy(how = How.XPATH, using = "//div[text()='Payment Method']")
    private WebElement paymentMethodSection;

    @FindBy(how = How.ID_OR_NAME, using = "postal")
    private WebElement postalCode;

    @FindAll({@FindBy(how = How.ID, using = "checkoutSteps")})
    private List <WebElement> checkoutSteps;

    public CheckoutPage2(WebDriver driver) { super(driver); }

    public void selectStripe(){
        LOGGER.info("Selecting Stripe payment method");
            click(stripePayment); }

    protected void clickBillingAddressTickBox(WebElement billingAddressTickBox, Checked isChecked) {
        LOGGER.info("Clicking the billing address and shipping addresses are the same tick-box");
        if (!billingAddressTickBox.isSelected() && isChecked == Checked.YES) {
            billingAddressTickBox.click();
        } else if (billingAddressTickBox.isSelected() && isChecked == Checked.NO) {
            billingAddressTickBox.click(); } }

     public void clickTermsAndConditionsTickBox(){
        LOGGER.info("Clicking the terms and conditions tick-box");
        click(termsAndConditionsTickBox); }

    public void enterCardDetails(String cardNumber) {
        LOGGER.info("Entering card number: " + cardNumber);
    typeText(cardNumberField, cardNumber); }

    public void enterExpirationDate(String expirationDate) {
        LOGGER.info("Entering card expiration date: " + expirationDate);
        typeText(expDateField, expirationDate); }

    public void enterCVC(String CVC) {
        LOGGER.info("Entering card CVC: " + CVC);
        typeText(cvcField, CVC); }

    public void clickPlaceOrderButton(){
        LOGGER.info("Clicking place order button");
        click(placeOrderButton); }

    public void enterDiscountCode(String discountCode) {
        LOGGER.info("Entering discount code: " + discountCode);
        typeText(discountCodeField, discountCode); }

    public void clickApplyButton(){
        LOGGER.info("Clicking apply discount button");
        click(applyButton); }

     public void applyDiscountCode(String discountCode){
        enterCardDetails(discountCode);
        clickApplyButton();}

    public void clickTermsAndConditionsButton(){
        LOGGER.info("Clicking the terms and conditions button");
        click(termsAndConditionsButton); }

    public void clickShippingTabToGoBack(){
        LOGGER.info("Clicking the shipping tab to go back to previous page");
        click(shippingTab); }

    public String getTextOfCurSection(){
        LOGGER.info("Getting the text of the current section");
        return getText(paymentMethodSection); }

        public void fillInPostalCode(String postalCodeText){
        LOGGER.info("Filling in the postal code of the card");
        typeText(postalCode, postalCodeText);}

    public void fillInPaymentDetails(String cardNumber, String expirationDate, String CVC, String postalCodeText){
        selectStripe();
        clickBillingAddressTickBox(billingAddressTickBox,Checked.YES);
        clickTermsAndConditionsTickBox();
        driver.switchTo().frame("__privateStripeFrame5");
        enterCardDetails(cardNumber);
        enterExpirationDate(expirationDate);
        enterCVC(CVC);
        fillInPostalCode(postalCodeText);
        driver.switchTo().parentFrame();
        clickPlaceOrderButton();
        waitForFullPageOrJsAjaxToLoad();}

}