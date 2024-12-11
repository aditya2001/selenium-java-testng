
import dataprovider.DataProviderLogin;
import drivermanager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;
import java.util.Hashtable;

public class LoginPageTest extends BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private LoginPage loginPage;
//    LoginPage loginPage = new LoginPage();
//    HomePage homePage;

//    public LoginPageTest(){
//        super();
//    }

//    @BeforeMethod
//    @Parameters("browser")
//    public void setUp(String browser) throws Exception {
//        initialization(browser);
//        loginPage = new LoginPage();
//    }

//    @Test(priority=1)
//    public void loginPageTitleTest(){
//        String title = loginPage.validateLoginPageTitle();
//        Assert.assertEquals(title, "Swag Labs");
//    }

    @Test(priority=1)
    public void loginTestFirst(){
        driver = DriverManager.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginPage = new LoginPage(driver, wait);

        loginPage.loginToSite("testName", "secret_sauce");
    }

//    @Test(priority=2)
//    public void crmLogoImageTest(){
//        boolean flag = loginPage.validateCRMImage();
//        Assert.assertTrue(flag);
//    }

    @Test(priority=2)
    public void loginTestSecond() throws InterruptedException {
        driver = DriverManager.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginPage = new LoginPage(driver, wait);

        loginPage.loginToSite("testName", "secret_sauce");
    }


//    @Test(dataProvider = "data_provider_login", dataProviderClass = DataProviderLogin.class)
//    public void loginTestThird(Hashtable<String, String> data) throws InterruptedException {
//        driver = DriverManager.getDriver();
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        loginPage = new LoginPage(driver, wait);
//
//        loginPage.loginToSite(data.get("testName"), data.get("secret_sauce"));
//    }



//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }

}
