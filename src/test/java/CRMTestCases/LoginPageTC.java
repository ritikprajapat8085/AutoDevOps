package CRMTestCases;

import CRMWebPage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTC extends  BaseClass
{
    @Test
    public void validatelogin() throws InterruptedException {
        String url =lp.dologin("Admin","admin123");
        Assert.assertTrue(url.contains("dashboard"),"TC failed,login fail");
        System.out.println("TC pass: loggin success");
    }
}
