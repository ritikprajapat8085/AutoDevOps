package VehicleInsurance_POM_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class C03_EnterProductData
{
	 WebDriver driver ;
     
	 C03_EnterProductData(WebDriver driver)
     {
   	  this.driver = driver ;
     }
	 
	    public void StartDate(String date)
     	{
	    	  driver.findElement(By.id("startdate")).sendKeys(date);
     	} 
	    public void InsuranceSum(String sum)
     	{
	    	  new Select(driver.findElement(By.id("insurancesum"))).selectByValue(sum);
     	} 
	    public void MeritRating(String rating)
     	{
	        new Select(driver.findElement(By.id("meritrating"))).selectByValue(rating);
     	}  
	    public void DamageInsurance(String damage)
     	{
	    	  new Select(driver.findElement(By.id("damageinsurance"))).selectByValue(damage);
     	} 
	    public void OptionalProductAuto()
     	{
	        driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();
	      
     	} 
	    public void OptionalProductTruck()
     	{
	        driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span")).click();
	      
     	} 
	    
	    public void OptionalProductMotor()
     	{
	        driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span")).click();
	      
     	} 
	    public void CourtesyCar(String court)
     	{
	     
	    	 new Select(driver.findElement(By.id("courtesycar"))).selectByValue(court);
     	} 
	    
	    public void NextButton()
	   	{
	   		driver.findElement(By.id("nextselectpriceoption")).click();
	   	}
	    
		public void NextButton1()
	   	{
	   		driver.findElement(By.id("nextsendquote")).click();
	   	}
	    
	    

	    
}
