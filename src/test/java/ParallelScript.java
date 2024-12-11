


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelScript {
    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setup(String browser) throws Exception{
        System.out.println("Browser Name is :" + browser);
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }
        else{
            throw new Exception("Browser is not correct");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testParameterWithXML() throws InterruptedException{

        driver.get("http://demo.guru99.com/V4/");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.name("uid"));
        userName.sendKeys("guru99");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("guru99");
        System.out.println("Test completed Successfully");
    }
    @AfterTest
    public void browserQuit() {
        driver.quit();

    }
}
