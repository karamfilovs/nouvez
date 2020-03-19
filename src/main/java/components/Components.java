package components;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Components extends BasePage {
    private MainMenu mainMenu;
    private MyAccountMenu myAccountMenu;
    private SubCategoryMenu subCategoryMenu;
    private MiniCart miniCart;

    public Components(WebDriver driver) {
        super(driver);
    }

    public MainMenu mainMenu() {
        if (mainMenu == null) {
            return new MainMenu(driver);
        } else {
            return mainMenu;
        }
    }

    public SubCategoryMenu subCategoryMenu() {
        if (subCategoryMenu == null) {
            return new SubCategoryMenu(driver);
        } else {
            return subCategoryMenu;
        }
    }

    public MyAccountMenu myAccountMenu() {
        if (myAccountMenu == null) {
            return new MyAccountMenu(driver);
        } else {
            return myAccountMenu;
        }
    }

    public MiniCart miniCart() {
        if (miniCart == null) {
            return new MiniCart(driver);
        } else {
            return miniCart;
        }
    }
}
