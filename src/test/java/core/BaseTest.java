package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;
import java.time.LocalTime;

@ExtendWith(CustomParameterResolver.class)
public class BaseTest {
    protected App app;

    @BeforeAll
    public static void beforeAll() {
        //Configures browsers
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    public void setup() {
        app = new App();
        app.startBrowser(System.getProperty("browser"));
        bypassStoreFrontAuthentication();
    }

    @AfterEach
    public void tearDown(ExtensionContext extensionContext) {
        if (System.getProperty("take.screenshots.enabled").equalsIgnoreCase("true")) {
            Method testMethod = extensionContext.getRequiredTestMethod();
            Boolean testFailed = extensionContext.getExecutionException().isPresent();
            if (testFailed) {
                app.takeScreenshot(testMethod.getDeclaringClass().getSimpleName(), testMethod.getName(), LocalTime.now());
            }
        }
        app.quit();
    }

    public static void bypassStoreFrontAuthentication(){
        String baseURL = System.getProperty("url");
        RestAssured.baseURI = baseURL;
        RestAssured.authentication = RestAssured.preemptive().basic("brmdev", "lMW5&*2hLw2S");
        Response  response = RestAssured.given().log().all().when().get(baseURL);
        response.prettyPrint();
        System.out.println("Status code:" + response.getStatusCode());
    }
}
