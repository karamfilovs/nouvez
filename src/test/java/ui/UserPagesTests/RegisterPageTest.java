package ui.UserPagesTests;

import core.BaseTest;
import enums.AccountType;
import enums.Country;
import enums.Salutation;
import org.junit.jupiter.api.*;
import utils.DataGenerator;

public class RegisterPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        app.loginPage().gotoLoginPage();
       Assertions.assertEquals("Ik ben een nieuwe klant", app.loginPage().getHeaderNote());
        app.components().symphonyProfiler().closeSymphonyProfilerToolbar();
        app.components().cookieContainer().clickAcceptCookiesButton();}

//    @Test
//    @Tag("register")
//    @DisplayName("MVP-3: Cant register with duplicate email address")
//    public void cantRegisterWithDuplicateEmail() {
//        app.registerPage().enterFirstName("Alex");
//        app.registerPage().enterLastName("Karamfilov");
//        app.registerPage().enterEmail("aleksandar.karamfilov@pragmatic.bg");
//        app.registerPage().enterPassword("Test22222");
//        app.registerPage().enterConfirmPassword("Test22222");
//        app.registerPage().clickCreateAnAccountButton();
//        Assertions.assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", app.registerPage().topErrorMessage()); }
//
//    @Test
//    @Tag("register")
//    @DisplayName("MVP-244: Cant register with password miss match")
//    public void cantRegisterWithPasswordMissMatch() {
//        String email = DataGenerator.generateRandomString(8) + "@" + "pragmatic-qa.com";
//        app.registerPage().enterFirstName("Yavor");
//        app.registerPage().enterLastName("Todd");
//        app.registerPage().enterEmail(email);
//        app.registerPage().enterPassword("Test22222");
//        app.registerPage().enterConfirmPassword("Test1111");
//        app.registerPage().clickCreateAnAccountButton();
//        Assertions.assertEquals("Please enter the same value again.", app.registerPage().passwordMissMatchErrorMessage()); }
//
//
//    @Test
//    @Tag("register")
//    @DisplayName("MVP-69: Cant register new user with weak password")
//    public void cantRegisterWithWeakPassword() {
//        String email = DataGenerator.generateRandomString(8) + "@" + "pragmatic-qa.com";
//        app.registerPage().enterFirstName("Yavor");
//        app.registerPage().enterLastName("Todd");
//        app.registerPage().enterEmail(email);
//        app.registerPage().enterPassword("Test");
//        app.registerPage().enterConfirmPassword("Test");
//        app.registerPage().clickCreateAnAccountButton();
//        Assertions.assertEquals("Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored.", app.registerPage().getPasswordError()); }
//
//    @ParameterizedTest(name = "MVP-4: Cant register user with invalid email => {0}")
//    @EnumSource(value = Emails.class)
//    @Tag("register")
//    @DisplayName("MVP-4: Cant register user with invalid email")
//    public void cantRegisterWithInvalidMail(Emails emails) {
//        app.registerPage().enterFirstName("Yavor");
//        app.registerPage().enterLastName("Todd");
//        app.registerPage().enterEmail(emails.getEmails());
//        app.registerPage().enterPassword("Test123");
//        app.registerPage().enterConfirmPassword("Test123");
//        app.registerPage().clickCreateAnAccountButton();
//        Assertions.assertEquals("Please enter a valid email address (Ex: johndoe@domain.com).",app.registerPage().getEmailAddressError());}
//
//    @Test
//    @Tag("register")
//    @DisplayName("MVP-4: MVP-245: Cant register user with blank required field")
//    public void cantRegisterWithBlankRequiredField() {
//        app.registerPage().enterFirstName(" ");
//        app.registerPage().enterLastName(" ");
//        app.registerPage().enterEmail(" ");
//        app.registerPage().enterPassword("  ");
//        app.registerPage().enterConfirmPassword(" ");
//        app.registerPage().clickCreateAnAccountButton();
//        Assertions.assertEquals("This is a required field.", app.registerPage().getFirstNameError());
//        Assertions.assertEquals("This is a required field.",app.registerPage().getLastNameError());
//        Assertions.assertEquals("This is a required field.",app.registerPage().getEmailAddressError());
//        Assertions.assertEquals("This is a required field.", app.registerPage().getPasswordError());
//        Assertions.assertEquals("This is a required field.", app.registerPage().getRepeatPasswordError()); }

    @Test
    @Tag("register")
    @DisplayName("GEN-T1 : Can register new account")
    public void registerAccountSignedUpForNewsletter() {
        String email = DataGenerator.generateRandomString(8) + "@" + "pragmatic-qa.com";
        app.loginPage().selectAccountType(AccountType.PERSONAL.getAccountType());
        app.loginPage().selectSalutation(Salutation.MR.getSalutationType());
        app.loginPage().fillInFirstName("Yavor");
        app.loginPage().fillInLastName("Todd");
        app.loginPage().fillInEmail(email);
        app.loginPage().fillInPassword("Test2020&");
        app.loginPage().selectYourCountry(Country.BELGIUM.getCountry());
        app.loginPage().fillInAddress("9120 Beveren, Zakdam 1");
        app.loginPage().fillInPhoneNumber("12345678910");
        app.loginPage().checkTermsAndConditionsCheckbox();
        app.loginPage().clickSubmitButton();
        Assertions.assertEquals("Klantenaccount", app.myAccountPage().confirmTheWelcomeMessage());}




}
