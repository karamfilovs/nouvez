package components;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Components extends BasePage {
    private MainMenu mainMenu;
    private ShopSubMenu shopSubCategoryMenu;
    private MiniCart miniCart;
    private MyAccountNavigation myAccountNavigation;
    private MyAccountDropDown myAccountDropDown;
    private CookieContainer cookieContainer;
    private SymphonyProfiler symphonyProfiler;



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

    public MyAccountNavigation myAccountNavigation(){
        if(myAccountNavigation == null){
            return new MyAccountNavigation(driver);}
        else{ return myAccountNavigation;}}

    public MyAccountDropDown myAccountDropdown(){
        if(myAccountDropDown == null){
            return new MyAccountDropDown(driver);}
        else{return myAccountDropDown;} }

    public CookieContainer cookieContainer(){
        if(cookieContainer == null){
            return new CookieContainer(driver);}
        else {return cookieContainer;} }

    public SymphonyProfiler symphonyProfiler(){
        if(symphonyProfiler == null) {
            return new SymphonyProfiler(driver);}
        else{return symphonyProfiler; } }
    }



