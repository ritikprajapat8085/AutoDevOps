package CRMTestCases;

import CRMWebPage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTC extends BaseClass
{

 //   HomePage hp = new HomePage();  // i have declare it in baseclass



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
         Assert.assertTrue(acturl.contains("PersonalDetails"),"TestCase Fail: URL not matched");
         System.out.println("TestCase pass: URL matched");

     }
/*
    @Test(priority = 3)
    public void verifytitle()
    {
         String acttitle=  hp.getapptitle();
        Assert.assertTrue(acttitle.contains("HRM"),"TestCase Fail: Title not matched");
        System.out.println("TestCase pass: Title matched");
    }

*/

/*
    @Test(priority = 4)
    public void veriflinkstatus()
    {
        String actlinkstatus =homePage.getlinkstatus();
        Assert.assertTrue(actlinkstatus.contains("courses"),"TestCase Fail: linkstatus not matched");
        System.out.println("TestCase pass: linkstatus matched");

    }

*/
}


