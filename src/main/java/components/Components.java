package components;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Components extends BasePage {
    private MainMenu mainMenu;
    private ShopSubMenu shopSubCategoryMenu;
    private MiniCart miniCart;


    public Components(WebDriver driver) {
        super(driver);
    }

    public MainMenu mainMenu() {
        if (mainMenu == null) {
            return new MainMenu(driver);
        } else {
            return mainMenu; } }

    public ShopSubMenu shopSubCategoryMenu() {
        if (shopSubCategoryMenu == null) {
            return new ShopSubMenu(driver);
        } else {
            return shopSubCategoryMenu; } }

    public MiniCart miniCart() {
        if (miniCart == null) {
            return new MiniCart(driver);
        } else {
            return miniCart; } }

}
