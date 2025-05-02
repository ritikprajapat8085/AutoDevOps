package VehicleInsurance_POM_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class C01_EnterVehicleData
{
	WebDriver  driver;
	  Select s;
	
	C01_EnterVehicleData(WebDriver driver)
	   {
		     this.driver =driver ;
		    // PageFactory.initElements(driver, this);// call this method to create element
	   }
	
	//-----------------This is for Automobile Sector-----------
	public void make(String make)
	{
		   WebElement make1 = driver.findElement(By.id("make"));	 
		   Select s = new Select(make1);
		   s.selectByVisibleText(make);   
		
	//	 new Select( driver.findElement(By.id("make"))).selectByValue(make);
	}
	public void EnginePerformance (String ep)
	{
		 driver.findElement(By.id("engineperformance")).sendKeys(ep);	 
	}   
	public void DateofManufacture(String dom)
	{
		  driver.findElement(By.id("dateofmanufacture")).sendKeys(dom);
	}
	public void NumberofSeats(String  seat)
	{
		 new Select( driver.findElement(By.id("numberofseats"))).selectByValue(seat);
	}
	public void MotorCycleSeats(String  seat)
	{
		 new Select( driver.findElement(By.id("numberofseatsmotorcycle"))).selectByValue(seat);
	}
	
	public void FuelType(String fuel)
	{
		   new Select(driver.findElement(By.id("fuel"))).selectByVisibleText(fuel);          
	}
	public void ListPrice(String price)
	{
	     driver.findElement(By.id("listprice")).sendKeys(price);
	}
	
	public void LicensePlateNumber(String platenumber)
	{
	    driver.findElement(By.id("licenseplatenumber")).sendKeys(platenumber);  
	}
	
	public void AnnualMileage(String mileage)
	{
		 driver.findElement(By.id("annualmileage")).sendKeys(mileage);
	}
	
	public void NextButton()
	{
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}
	
	//--------------This is for truck sector extra controls ------------
	
	
	public void Payload(String payload)
	{
		 driver.findElement(By.id("payload")).sendKeys(payload);
	}
	
	public void TotalWeight(String totalweight)
	{
		 driver.findElement(By.id("totalweight")).sendKeys(totalweight);
	}
	
	
	
	//--------------This is for motorcycle  sector extra controls ------------
	
	public void Model(String model)
	{
		   new Select(driver.findElement(By.id("model"))).selectByVisibleText(model);       
	}
	
	public void CylinderCapacity(String cc)
	{
		 driver.findElement(By.id("cylindercapacity")).sendKeys(cc);
	}
	
	
	
	//--------------This is for camper  sector extra controls ------------
	
	public void RightHandDrive()
	{
	    driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[1]/span")).click();
	          
	}

	

}
