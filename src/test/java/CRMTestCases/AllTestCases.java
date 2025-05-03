package CRMTestCases;

import CRMUtility.ScreenShot;
import CRMWebPage.HomePage;
import CRMWebPage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class AllTestCases
{
    WebDriver driver ;
    public LoginPage lp;
    public HomePage hp;
    public ScreenShot screenshot;
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
    public void validatelogin() throws InterruptedException, IOException
    {
       ScreenShot.getScreenshot(driver);// at login page
        String url =lp.dologin("Admin","admin123");
       ScreenShot.getScreenshot(driver);
       // screenshot.getScreenshot();// after login home page
        Assert.assertTrue(url.contains("dashboard"),"TC failed,login fail");
        System.out.println("TC pass: loggin success");
    }

    @Test(priority = 1)
    public void clickInfo() throws IOException
    {
         hp.personalinfo();
      //  screenshot.getScreenshot();
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
