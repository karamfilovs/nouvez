package components;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Components extends BasePage {
    private MainMenu mainMenu;
    private MyAccountMenu myAccountMenu;
    private ShopSubMenu shopSubCategoryMenu;
    private MiniCart miniCart;
    private BreadCrumbsTrail breadCrumbsTrail;


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

    public ShopSubMenu shopSubCategoryMenu() {
        if (shopSubCategoryMenu == null) {
            return new ShopSubMenu(driver);
        } else {
            return shopSubCategoryMenu;
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

    public BreadCrumbsTrail breadCrumbsTrail() {
        if (breadCrumbsTrail== null) {
            return new BreadCrumbsTrail(driver);
        } else {
            return breadCrumbsTrail;
        }
    }
}
