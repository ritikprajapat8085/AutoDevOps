package CRMTestCases;

import CRMWebPage.HomePage;
import CRMWebPage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;


public class BaseClass
{

    public WebDriver driver;
    public LoginPage lp;
    public HomePage hp;
    @BeforeTest
    public void setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
           lp = new LoginPage(driver);
           hp = new HomePage(driver);

    }


}

