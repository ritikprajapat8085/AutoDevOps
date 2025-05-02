package VehicleInsurance_POM_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class C02_EnterInsurant_Data 
{
      WebDriver driver ;
      
      C02_EnterInsurant_Data(WebDriver driver)
      {
    	  this.driver = driver ;
      }
      
      
       public void FirstName(String fn)
     	{
    	   driver.findElement(By.id("firstname")).sendKeys(fn);
     	}  
       
       
       public void LastName(String ln)
    	{
    	   driver.findElement(By.id("lastname")).sendKeys(ln);
    	}  
       
       public void DateofBirth(String dob)
    	{
    	   driver.findElement(By.id("birthdate")).sendKeys(dob);
    	}  
       
       public void Gender()
    	{
    	   driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();
    	}  
       
       public void CountryName(String country)
    	{
           new Select(driver.findElement(By.id("country"))).selectByVisibleText(country);
           
    	}  
       public void ZipCode(String code)
    	{
    	   driver.findElement(By.id("zipcode")).sendKeys(code);	 
           
    	}  
       public void CityName(String city)
   	{
    	   driver.findElement(By.id("city")).sendKeys(city);
          
   	}  
       public void Occcupation(String work)
   	{
    	   new Select(driver.findElement(By.id("occupation"))).selectByVisibleText(work);
          
   	}  
       
       public void Hobby()
      	{
           driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click();
      	}  
          
   	public void NextButton()
   	{
   		driver.findElement(By.id("nextenterproductdata")).click();
   	}
       
}
