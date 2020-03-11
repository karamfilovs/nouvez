package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;
import java.time.LocalTime;

@ExtendWith(CustomParameterResolver.class)
public class BaseTest {
    protected static App app;

    @BeforeAll
    public static void beforeAll() {
        //Configures browsers
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        app = new App();
        app.startBrowser(System.getProperty("browser"));
    }

    @BeforeEach
    public void setup() {
        app.deleteCookies();
        System.out.println("*******************************************************");
    }

    @AfterEach
    public void tearDown(ExtensionContext context) {
        if (shouldBeCaptured()) {
            Method testMethod = context.getRequiredTestMethod();
            boolean isFailed = context.getExecutionException().isPresent();
            if (isFailed) {
                app.takeScreenshot(testMethod.getDeclaringClass().getSimpleName(), testMethod.getName(), LocalTime.now());
            }
        }
    }

    @AfterAll
    public static void afterAll(ExtensionContext context) {
        app.quit();
    }

    private boolean shouldBeCaptured(){
        return System.getProperty("take.screenshots.enabled").equalsIgnoreCase("true");
    }
}
