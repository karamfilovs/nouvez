package enums;

public enum MyAccountNavMenu {
    MY_ORDERS("My Orders"),
    ACCOUNT_INFORMATION("Account Information"),
    ADDRESS_BOOK("Address Book"),
    MY_WISH_LIST("My Wish List"),
    NEWSLETTER_SUBSCRIPTIONS("Newsletter Subscriptions"),
    MY_INVITATIONS("My Invitations"),
    SIGN_OUT("Sign out");



     MyAccountNavMenu(String menu){
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }

    private String menu;

}
