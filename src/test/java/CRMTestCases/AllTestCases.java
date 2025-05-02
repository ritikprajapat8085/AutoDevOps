package CRMTestCases;

import CRMWebPage.HomePage;
import CRMWebPage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AllTestCases
{
    WebDriver driver ;
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


    @Test
    public void validatelogin() throws InterruptedException
    {
        String url =lp.dologin("Admin","admin123");
        Assert.assertTrue(url.contains("dashboard"),"TC failed,login fail");
        System.out.println("TC pass: loggin success");
    }

    @Test(priority = 1)
    public void clickInfo()
    {
        hp.personalinfo();
    }

    @Test(priority = 2)
    public void verifyurl()
    {
        String acturl =hp.getappurl();
        // Assert.assertEquals(acturl,expurl));
        Assert.assertTrue(acturl.contains("viewEmployeeList"),"TestCase Fail: URL not matched");
        System.out.println("TestCase pass: URL matched");

    }




    @AfterTest
    public void aftertest()
    {
        // driver.close();
    }




}
