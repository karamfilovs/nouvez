package ui;

import ch.qos.logback.core.net.AbstractSSLSocketAppender;
import core.BaseTest;
import org.junit.jupiter.api.*;

public class SendInvitationsPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        app.loginPage().gotoLoginPage();
        Assertions.assertEquals("Customer Login", app.loginPage().getPageTitle());
        app.loginPage().login();
    }



    @Test
    @Tag("invitations")
    @DisplayName("MVP-84: Can send invitation to single e-mail address")
    public void sendInvitationToSingleEmail(){
    app.myAccountNavigation().clickMyInvitations();
    Assertions.assertEquals("My Invitations", app.myInvitationsPage().getPageTitle());
    app.myInvitationsPage().clickSendButton();
    Assertions.assertEquals("Send Invitations", app.sendInvitationsPage().getPageTitle());
    app.sendInvitationsPage().enterEmail("yavor@pragmatic-qa.com");
    app.sendInvitationsPage().enterMessage("Welcome to ONCE");
    app.sendInvitationsPage().clickSendButton();
    Assertions.assertEquals("We did not send 1 invitation(s) addressed to current customers.", app.sendInvitationsPage().getNotification());

    }


//    @Test
//    @Tag("invitations")
//    @DisplayName("MVP-186: Can send invitation to multiple e-mail addresses")

//    @Test
//    @Tag("invitations")
//    @DisplayName("MVP-85: Cant send invitation to invalid emails")

//    @Test
//    @Tag("invitations")
//    @DisplayName("MVP-85: Cant send invitation to invalid emails")

//    @Test
//    @Tag("invitations")
//    @DisplayName("MVP-187: Cant exceed the maximum allowed length of the string in invitation message field")


}
