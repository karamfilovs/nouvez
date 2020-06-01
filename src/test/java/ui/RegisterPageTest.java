package ui;

import core.BaseTest;
import enums.Emails;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import utils.DataGenerator;

public class RegisterPageTest extends BaseTest {

    @BeforeEach
       public void beforeEach(){
        app.homePage().gotoHomePage();
        Assertions.assertEquals("Home Page", app.myAccountPage().getPageTitle());
        app.homePage().clickMyAccountIcon();
        Assertions.assertEquals("Customer Login", app.myAccountPage().getPageTitle());}

    @Test
    @Tag("register")
    @DisplayName("MVP-3: Cant register with duplicate email address")
    public void cantRegisterWithDuplicateEmail(){
        app.registerPage().enterFirstName("Alex");
        app.registerPage().enterLastName("Karamfilov");
        app.registerPage().enterEmail("aleksandar.karamfilov@pragmatic.bg");
        app.registerPage().enterPassword("Test22222");
        app.registerPage().enterConfirmPassword("Test22222");
        app.registerPage().clickCreateAnAccountButton();
        Assertions.assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", app.registerPage().topErrorMessage()); }

    @Test
    @Tag("register")
    @DisplayName("MVP-244: Cant register with password miss match")
    public void cantRegisterWithPasswordMissMatch(){
        String email = DataGenerator.generateRandomString(8) + "@" + "pragmatic-qa.com";
        app.registerPage().enterFirstName("Yavor");
        app.registerPage().enterLastName("Todd");
        app.registerPage().enterEmail(email);
        app.registerPage().enterPassword("Test22222");
        app.registerPage().enterConfirmPassword("Test1111");
        app.registerPage().clickCreateAnAccountButton();
        Assertions.assertEquals("Please enter the same value again.", app.registerPage().passwordMissMatchErrorMessage()); }


    @Test
    @Tag("register")
    @DisplayName("MVP-69: Can't register new user with weak password")
       public void cantRegisterWithWeakPassword(){
        String email = DataGenerator.generateRandomString(8) + "@" + "pragmatic-qa.com";
        app.registerPage().enterFirstName("Yavor");
        app.registerPage().enterLastName("Todd");
        app.registerPage().enterEmail(email);
        app.registerPage().enterPassword("Test");
        app.registerPage().enterConfirmPassword("Test");
        app.registerPage().clickCreateAnAccountButton();
        Assertions.assertEquals("Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored.", app.registerPage().weakPasswordError());}

    @Test
    @Tag("register")
    @DisplayName("MVP-4: Cant register user with invalid email")
    public void cantRegisterWithInvalidMail(){
        String email = DataGenerator.generateRandomString(8) + "@" + "pragmatic-qa.com";
        app.registerPage().enterFirstName("Yavor");
        app.registerPage().enterLastName("Todd");
        app.registerPage().enterEmail(email);
        app.registerPage().enterPassword("Test");
        app.registerPage().enterConfirmPassword("Test");
        app.registerPage().clickCreateAnAccountButton();
        Assertions.assertEquals("Minimum length of this field must be equal or greater than 8 symbols. Leading and trailing spaces will be ignored.", app.registerPage().weakPasswordError());}


    @ParameterizedTest(name = "MVP-4: Cant register user with invalid email => {0}")
    @EnumSource(value = Emails.class)
    @Tag("register")
    @DisplayName("MVP-4: Cant register user with invalid email")
    public void cantRegisterWithInvalidMail(Emails emails) {
        app.registerPage().enterFirstName("Yavor");
        app.registerPage().enterLastName("Todd");
        app.registerPage().enterEmail(emails.getEmails());
        app.registerPage().enterPassword("Test");
        app.registerPage().enterConfirmPassword("Test");
        app.registerPage().clickCreateAnAccountButton();
    }


//    @Test
//    @Tag("register")
//    @DisplayName("MVP-51: Can register new sellers account")

//    @Test
//    @Tag("register")
//    @DisplayName("MVP-52: Cant register new account with weak password (less than 8 symbols)")

}
