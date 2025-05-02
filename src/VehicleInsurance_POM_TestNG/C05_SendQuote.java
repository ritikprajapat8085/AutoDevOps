package VehicleInsurance_POM_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C05_SendQuote 
{
	WebDriver driver ;
	
    	C05_SendQuote  (WebDriver driver)
       {
   	     this.driver = driver ;
       }
	public void Email(String email)
	{
	    driver.findElement(By.id("email")).sendKeys( email);	
	}
	public void Phone(String phone)
	{
		 driver.findElement(By.id("phone")).sendKeys(phone);	 
	}
	public void Username(String username)
	{
		 driver.findElement(By.id("username")).sendKeys(username);	 
         
	}
	public void Password(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	public void ConfirmPassword(String confirmpassword)
	{
		driver.findElement(By.id("confirmpassword")).sendKeys( confirmpassword);	 
	}
	public void SendEmail() throws InterruptedException
	{
		  driver.findElement(By.id("sendemail")).click(); 
		  Thread.sleep(3000);
	}
	public void EmailText()
	{
		 String text =driver.findElement(By.xpath("/html/body/div[4]/h2")).getText();
         System.out.println(" Sending email message :"+text);
       
	}
	public void EmailOk()
	{
		 driver.findElement(By.className("confirm")).click(); 
	}
	
	public void  Mainpage() 
	{
	 driver.findElement(By.xpath("//*[@id=\"backmain\"]/span/i")).click();
	 System.out.println();
	 System.out.println("---------Automobile TC has completed with all slecectp price option--------------- ");
	}
	
	
}
