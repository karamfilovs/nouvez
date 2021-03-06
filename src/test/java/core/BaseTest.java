package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;
import java.time.LocalTime;

@ExtendWith(CustomParameterResolver.class)
public class BaseTest {
    protected  App app;

    @BeforeAll
    public static void beforeAll() {
        //Configures browsers
        if(isChrome())
        WebDriverManager.chromedriver().setup();
        if(isFirefox())
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    public void setup() {
        System.out.println("*******************************************************");
        // Start browser
        app = new App();
        app.startBrowser(System.getProperty("browser"));
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

        app.quit();

    }

    private boolean shouldBeCaptured(){
        return System.getProperty("take.screenshots.enabled").equalsIgnoreCase("true");
    }

    private static boolean isChrome(){
        return System.getProperty("browser").equalsIgnoreCase("chrome");
    }

    private static boolean isFirefox(){
        return System.getProperty("browser").equalsIgnoreCase("firefox");
    }

}
