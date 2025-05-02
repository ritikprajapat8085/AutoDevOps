
// Encapsulation:  private data+ public method
// inilialize thedriver
// data member(locator)
// method(functionality to test)
package CRMWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
    private WebDriver driver ;  // instance variable
    public  HomePage(WebDriver driver)  // local variables // this is base class driver calling it
    {
        this.driver =driver ;  // this driver(base class)  we are initializing to this class
    }

    By perinfo= By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
   /*
    By addbtn= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    By fn =By.name("firstName");
    By mn =By.name("middleName");
    By ln =By.name("lastName");
    By createlogin =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span");
    By username =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");
    By password =By.xpath("(//input[@type='password'])[1]");
    By confirmpassword =By.xpath("(//input[@type='password'])[2]");
    By clicksave =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");

*/

    public void personalinfo()
    {
      driver.findElement(perinfo).click();
    }


    public  String getappurl() {
        return driver.getCurrentUrl();
    }

 /*
    public  String getapptitle() {
        return driver.getTitle();
    }
*/

/*
    public void clickAddButton()
    {
        driver.findElement(addbtn).click();
    }

    public void addEmployee(String fn1, String mn1, String ln1, String uname1, String pwd1)
    {

        driver.findElement(fn).sendKeys(fn1);
        driver.findElement(mn).sendKeys(mn1);
        driver.findElement(ln).sendKeys(ln1);
        driver.findElement(createlogin).click();
        driver.findElement(username).sendKeys(uname1);
        driver.findElement(password).sendKeys(pwd1);
        driver.findElement(confirmpassword).sendKeys(pwd1);
        driver.findElement( clicksave).click();
    }

*/

}
