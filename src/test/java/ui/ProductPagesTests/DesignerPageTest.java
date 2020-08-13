package ui.ProductPagesTests;

import core.BaseTest;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class DesignerPageTest extends BaseTest {

    @BeforeEach
    public void beforeEach() {
        app.designerPage().goToDesignersPage();
        Assertions.assertEquals("Marketplace Seller List", app.designerPage().getPageTitle());
    }


//    @ParameterizedTest(name = )
//    public void canNavigateToEachDesignerPage () {
//        app.designerPage().canOpenFirstDesignerPage();
//        }
//        }
}