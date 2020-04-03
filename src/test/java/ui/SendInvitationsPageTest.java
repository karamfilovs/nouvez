package ui;

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
    public void sendInvitationToSingleEmail() {
        app.myAccountNavigation().clickMyInvitations();
        Assertions.assertEquals("My Invitations", app.myInvitationsPage().getPageTitle());
        app.myInvitationsPage().clickSendButton();
        Assertions.assertEquals("Send Invitations", app.sendInvitationsPage().getPageTitle());
        app.sendInvitationsPage().enterEmail("yavor@pragmatic-qa.com");
        app.sendInvitationsPage().enterMessage("Welcome to ONCE");
        app.sendInvitationsPage().clickSendButton();
        Assertions.assertEquals("We did not send 1 invitation(s) addressed to current customers.", app.sendInvitationsPage().getConfirmation());

    }

    @Test
    @Tag("invitations")
    @DisplayName("MVP-186: Can send invitation to multiple e-mail addresses")
    public void sendInvitationsToMultipleEmails() {
        app.myAccountNavigation().clickMyInvitations();
        Assertions.assertEquals("My Invitations", app.myInvitationsPage().getPageTitle());
        app.myInvitationsPage().clickSendButton();
        Assertions.assertEquals("Send Invitations", app.sendInvitationsPage().getPageTitle());
        app.sendInvitationsPage().enterEmail("yavor@pragmatic-qa.com");
        app.sendInvitationsPage().clickAddButton();
        app.sendInvitationsPage().enterEmail2("alex@pragmatic.bg");
        app.sendInvitationsPage().enterMessage("Welcome to ONCE");
        app.sendInvitationsPage().clickSendButton();
        Assertions.assertEquals("We did not send 2 invitation(s) addressed to current customers.", app.sendInvitationsPage().getConfirmation());

    }

    @Test
    @Tag("invitations")
    @DisplayName("MVP-85: Cant send invitation to invalid emails")
    public void cantSendInvitationToInvalidEmail() {
        app.myAccountNavigation().clickMyInvitations();
        Assertions.assertEquals("My Invitations", app.myInvitationsPage().getPageTitle());
        app.myInvitationsPage().clickSendButton();
        Assertions.assertEquals("Send Invitations", app.sendInvitationsPage().getPageTitle());
        app.sendInvitationsPage().enterEmail("yavor@pragmatic-qa");
        app.sendInvitationsPage().enterMessage("Welcome to ONCE");
        app.sendInvitationsPage().clickSendButton();
        Assertions.assertEquals("Please enter a valid email address (Ex: johndoe@domain.com).", app.sendInvitationsPage().getErrorMessageEmail());
    }

    //Currently there is NO error message for sending blank invitation
    @Test
    @Tag("invitations")
    @DisplayName("MVP-235: Cant send blank invitation")
    public void cantSendBlankInvitation() {
        app.myAccountNavigation().clickMyInvitations();
        Assertions.assertEquals("My Invitations", app.myInvitationsPage().getPageTitle());
        app.myInvitationsPage().clickSendButton();
        Assertions.assertEquals("Send Invitations", app.sendInvitationsPage().getPageTitle());
        app.sendInvitationsPage().enterEmail("yavor@pragmatic-qa.com");
        app.sendInvitationsPage().enterMessage(" ");
        app.sendInvitationsPage().clickSendButton();
        Assertions.assertEquals("We did not send 1 invitation(s) addressed to current customers.", app.sendInvitationsPage().getConfirmation());
    }

    //Currently there is NO error message for sending invitations to the same e-mail simultaneously
    @Test
    @Tag("invitations")
    @DisplayName("MVP-85: Cant send invitation to duplicate emails")
    public void cantSendInvitationToDuplicateEmails() {
    app.myAccountNavigation().clickMyInvitations();
    Assertions.assertEquals("My Invitations", app.myInvitationsPage().getPageTitle());
    app.myInvitationsPage().clickSendButton();
    Assertions.assertEquals("Send Invitations", app.sendInvitationsPage().getPageTitle());
    app.sendInvitationsPage().enterEmail("yavor@pragmatic-qa.com");
    app.sendInvitationsPage().clickAddButton();
    app.sendInvitationsPage().enterEmail2("alex@pragmatic.bg");
    app.sendInvitationsPage().enterMessage("Welcome to ONCE ");
    app.sendInvitationsPage().clickSendButton();
    Assertions.assertEquals("We did not send 2 invitation(s) addressed to current customers.\n", app.sendInvitationsPage().getConfirmation());
}

//    @Test
//    @Tag("invitations")
//    @DisplayName("MVP-187: Cant exceed the maximum allowed length of the string in invitation message field")

}

