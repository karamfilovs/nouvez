package CategoryPages;

import components.MainMenu;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CategoryPages extends BasePage {

    private NecklacesPage necklacesPage;
    private EarringsPage earringsPage;
    private RingsPage ringsPage;
    private BraceletsPage braceletsPage;
    private AccessoriesPage accessoriesPage;
    private WeddingRingsPage weddingRingsPage;
    private EngagementRingsPage engagementRingsPage;
    private BridalJewelleryPage bridalJewelleryPage;
    private MenPage menPage;
    private WomanPage womanPage;
    private ShopByPricePage shopByPricePage;



    public CategoryPages(WebDriver driver) {
        super(driver);
    }

    public NecklacesPage necklacesPage() {
        if (necklacesPage == null) {
            return new NecklacesPage(driver);
        } else {
            return necklacesPage;
        }
    }
    public EarringsPage earringsPage() {
        if (earringsPage == null) {
            return new EarringsPage(driver);
        } else {
            return earringsPage;
        }
    }
    public RingsPage ringsPage() {
        if (ringsPage == null) {
            return new RingsPage(driver);
        } else {
            return ringsPage;
        }
    }
    public BraceletsPage braceletsPage() {
        if (braceletsPage == null) {
            return new BraceletsPage(driver);
        } else {
            return braceletsPage;
        }
    }
    public AccessoriesPage accessoriesPage() {
        if (accessoriesPage() == null) {
            return new AccessoriesPage(driver);
        } else {
            return accessoriesPage();
        }
    }
    public WeddingRingsPage weddingRingsPage() {
        if (weddingRingsPage() == null) {
            return new WeddingRingsPage(driver);
        } else {
            return weddingRingsPage();
        }
    }
    public EngagementRingsPage engagementRingsPage() {
        if (engagementRingsPage() == null) {
            return new EngagementRingsPage(driver);
        } else {
            return engagementRingsPage();
        }
    }
    public BridalJewelleryPage bridalJewelleryPage() {
        if (bridalJewelleryPage() == null) {
            return new BridalJewelleryPage(driver);
        } else {
            return bridalJewelleryPage();
        }
    }
    public MenPage menPage() {
        if (menPage() == null) {
            return new MenPage(driver);
        } else {
            return menPage();
        }
    }
    public WomanPage womanPage() {
        if (womanPage() == null) {
            return new WomanPage(driver);
        } else {
            return womanPage();
        }
    }
    public ShopByPricePage shopByPricePage() {
        if (shopByPricePage() == null) {
            return new ShopByPricePage(driver);
        } else {
            return shopByPricePage();
        }
    }
    public ShopDesignerPage shopDesignerPage() {
        if (shopDesignerPage() == null) {
            return new ShopDesignerPage(driver);
        } else {
            return shopDesignerPage();
        }
    }


}
