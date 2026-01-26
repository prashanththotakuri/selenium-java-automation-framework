package tests;

import base.DriverFactory;
import base.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

import java.time.Duration;

public class BaseTest {

    @BeforeMethod
    public void setUp() {

        String browser = ConfigReader.get("browser");
        boolean headless = Boolean.parseBoolean(ConfigReader.get("headless"));

        WebDriver driver = DriverFactory.createDriver(browser, headless);
        DriverManager.setDriver(driver);

        DriverManager.getDriver()
                .manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(
                        Integer.parseInt(ConfigReader.get("implicitWait"))
                ));

        DriverManager.getDriver().get(ConfigReader.get("baseUrl"));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
        }

        DriverManager.unload();
    }
}
