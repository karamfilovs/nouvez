package enums;

public enum MyAccountNavMenu {
    MY_ORDERS("My Orders"),
    ADDRESS_BOOK("Address Book"),
    MY_WISH_LIST("My Wish List");

     MyAccountNavMenu(String menu){
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }

    private String menu;

}
