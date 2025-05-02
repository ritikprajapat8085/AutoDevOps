package CRMWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    private WebDriver driver ;

    // initialize driver
    public  LoginPage(WebDriver driver)  // this is base class driver calling it
    {
        this.driver =driver ;  // assisn base class driver to this class driver
    }

    By username =By.name("username");
    By password =By.name("password");
    By loginButton =By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

    //   create method to perform the operation of element

    public String dologin(String uname,String pass) throws InterruptedException {
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pass);
       driver.findElement(loginButton).click();
       Thread.sleep(3000);
        return driver.getCurrentUrl();
    }

}
