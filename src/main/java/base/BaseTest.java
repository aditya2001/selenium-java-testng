package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import drivermanager.DriverManager;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;



public class BaseTest {

    @Parameters({"browser"})
    @BeforeMethod
    public void beforeTest(String browser) throws Exception {
        DriverManager.initializeDriver(browser);
        WebDriver driver = DriverManager.getDriver();
        driver.get("https://www.saucedemo.com/");
    }

//    @AfterMethod(alwaysRun = true)
//    public void quit() {
//        if (DriverManager.getDriver() != null) {
//            DriverManager.getDriver().quit();
//        }
//    }
}