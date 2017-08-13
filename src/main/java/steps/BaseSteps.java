package steps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BaseSteps {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void beforeMethod() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get(System.getProperty("app.url"));
    }

    @After
    public void afterMethod() {
        driver.quit();
    }

    public static WebDriver getWebDriver(){
        return ThucydidesWebDriverSupport.getDriver();
    }
}