package VehicleInsurance_POM_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class T01AllTestCases
{
	WebDriver driver;
	 C01_EnterVehicleData vehicledata;
	 C02_EnterInsurant_Data insurancedata;
	 C03_EnterProductData  productdata;
	 C04_SelectPriceOption priceoption;
	 C05_SendQuote  sendquote;

	/* 
//1:  ----------------For Automobile Sector--------------------------	
  @Test (dataProvider="Automobileselectoptiondata")
   public void AutomobileTC(String ExpPrice,String ExpClaim,String ExpDis,String ExpCover,String type) throws InterruptedException
  {
	 
  	     driver.findElement(By.id("nav_automobile")).click();	
    	 vehicledata.make("BMW");
    	 vehicledata.EnginePerformance("1000");
    	 vehicledata.DateofManufacture("10/05/2024");
	     vehicledata.NumberofSeats("4");
	     vehicledata.FuelType("Diesel");
	     vehicledata.ListPrice("40000");
	     vehicledata.LicensePlateNumber("MP09CQ5246");
	     vehicledata.AnnualMileage("1000");
	     vehicledata.NextButton();
	  //--------------------------------------------------
	     insurancedata.FirstName("Ritik");
	     insurancedata.LastName("Prajapati");
	     insurancedata.DateofBirth("10/14/2002");
	     insurancedata.Gender();
	     insurancedata.CountryName("India");
	     insurancedata.ZipCode("454001");
	     insurancedata.CityName("Dhar");
	     insurancedata.Occcupation("Employee");
	     insurancedata.Hobby();
	     insurancedata.NextButton();
	//-----------------------------------------------
	     productdata.StartDate("06/20/2025");
	     productdata.InsuranceSum("5000000");
	     productdata.MeritRating("Super Bonus");
	     productdata.DamageInsurance("Partial Coverage");
	     productdata.OptionalProductAuto();
	     productdata.CourtesyCar("No");
	     productdata.NextButton();
	//-------------------------------------------------------------------------     
	     priceoption.PriceOptionSelection(ExpPrice, ExpClaim, ExpDis, ExpCover,type)  ; 
	     priceoption.NextButton1();
   //------------------------------------------------------------------------------
	
	     sendquote.Email("ritikprajapat8085@gmail.com");
	     sendquote.Phone("8085160805");
	     sendquote.Username("ritikprajapat");
	     sendquote.Password("Ritik@0786");
	     sendquote.ConfirmPassword("Ritik@0786");
	     sendquote.SendEmail();
	     sendquote.EmailText();
	     sendquote.EmailOk();
	     sendquote.Mainpage() ;
	     
//--------------------------------------------------------------------------------------------------     
  } 
  
@DataProvider
public Object[][] Automobileselectoptiondata()
{
	  return new Object[][]
	  {
		  {"224.00","No","No","No","Silver"},
		  {"661.00","Submit","2","Limited","Gold"},
		  {"1,298.00","Submit","5","Limited","Platinum"},
		  {"2,472.00","Submit","10","Unlimited","Ultimate"},
	  };
}


 */
	 
//2.  ----------------For Truck Sector--------------------------	
 
  /*
  @Test (dataProvider="Truckselectoptiondata")
    public void TruckTC(String ExpPrice,String ExpClaim,String ExpDis,String ExpCover,String type) throws InterruptedException
      {
	  
	     driver.findElement(By.id("nav_truck")).click();	
    	 vehicledata.make("Volvo");
    	 vehicledata.EnginePerformance("1000");
    	 vehicledata.DateofManufacture("10/05/2024");
	     vehicledata.NumberofSeats("2");
	     vehicledata.FuelType("Diesel");
	     vehicledata.Payload("500");
	     vehicledata.TotalWeight("5000");
	     vehicledata.ListPrice("20000");
	     vehicledata.LicensePlateNumber("MP09CQ5246");
	     vehicledata.AnnualMileage("700");   
	     vehicledata.NextButton();
	     
	//--------------------------------------------
	      insurancedata.FirstName("Ritik");
	     insurancedata.LastName("Prajapati");
	     insurancedata.DateofBirth("10/14/2002");
	     insurancedata.Gender();
	     insurancedata.CountryName("India");
	     insurancedata.ZipCode("454001");
	     insurancedata.CityName("Dhar");
	     insurancedata.Occcupation("Employee");
	     insurancedata.Hobby();
	     insurancedata.NextButton();
  //-----------------------------------------------	    
	
	     productdata.StartDate("06/20/2025");
	     productdata.InsuranceSum("5000000");
	     productdata.DamageInsurance("Partial Coverage");
	     productdata.OptionalProductTruck();
	     productdata.NextButton();
	     
//-------------------------------------------------------------------------     
	     priceoption.PriceOptionSelection(ExpPrice, ExpClaim, ExpDis, ExpCover,type)  ; 
	     priceoption.NextButton1();
   //-------------------------------------------------------------     
	     
	     sendquote.Email("ritikprajapat8085@gmail.com");
	     sendquote.Phone("8085160805");
	     sendquote.Username("ritikprajapat");
	     sendquote.Password("Ritik@0786");
	     sendquote.ConfirmPassword("Ritik@0786");
	     sendquote.SendEmail();
	     sendquote.EmailText();
	     sendquote.EmailOk();
	     sendquote.Mainpage() ;
	     
//----------------------------------------------------
	     	       
  } 
  
  @DataProvider
  public Object[][] Truckselectoptiondata()
  {
  	  return new Object[][]
  	  {
  		  {"249.00","No","No","No","Silver"},
  		  {"773.00","Submit","2","Limited","Gold"},
  		  {"1,439.00","Submit","5","Limited","Platinum"},
  		  {"2,742.00","Submit","10","Unlimited","Ultimate"},
  	  };
  }
 */
	 
//3:  ----------------For Motorcycle Sector--------------------------	
 /*
 @Test (dataProvider="Motorcycleselectoptiondata")
  public void MotorcycleTC(String ExpPrice,String ExpClaim,String ExpDis,String ExpCover,String type) throws InterruptedException
  {
	     driver.findElement(By.id("nav_motorcycle")).click();	
    	 vehicledata.make("BMW");
    	 vehicledata.Model("Motorcycle");
    	 vehicledata.CylinderCapacity("550");
    	 vehicledata.EnginePerformance("700");
    	 vehicledata.DateofManufacture("10/05/2024");
	     vehicledata.MotorCycleSeats("1");
	     vehicledata.ListPrice("40000");
	     vehicledata.AnnualMileage("800");
	     vehicledata.NextButton();
//----------------------------------------------------------------	     
	     insurancedata.FirstName("Ritik");
	     insurancedata.LastName("Prajapati");
	     insurancedata.DateofBirth("10/14/2002");
	     insurancedata.Gender();
	     insurancedata.CountryName("India");
	     insurancedata.ZipCode("454001");
	     insurancedata.CityName("Dhar");
	     insurancedata.Occcupation("Employee");
	     insurancedata.Hobby();
	     insurancedata.NextButton();
  //-------------------------------------------
	     productdata.StartDate("06/20/2025");
	     productdata.InsuranceSum("5000000");
	     productdata.DamageInsurance("Partial Coverage");
	     productdata.OptionalProductMotor();
	     productdata.NextButton();
	//------------------------------------------------------     
	     priceoption.PriceOptionSelection(ExpPrice, ExpClaim, ExpDis, ExpCover,type)  ;   
	     priceoption.NextButton1();
//-------------------------------------------------------------     
	     
	     sendquote.Email("ritikprajapat8085@gmail.com");
	     sendquote.Phone("8085160805");
	     sendquote.Username("ritikprajapat");
	     sendquote.Password("Ritik@0786");
	     sendquote.ConfirmPassword("Ritik@0786");
	     sendquote.SendEmail();
	     sendquote.EmailText();
	     sendquote.EmailOk();
	     sendquote.Mainpage() ;
	     
//----------------------------------------------------
	     	               
  } 
 
 @DataProvider
 public Object[][] Motorcycleselectoptiondata()
 {
 	  return new Object[][]
 	  {
 		  {"262.00","No","No","No","Silver"},
 		  {"772.00","Submit","2","Limited","Gold"},
 		  {"1,516.00","Submit","5","Limited","Platinum"},
 		  {"2,888.00","Submit","10","Unlimited","Ultimate"},
 	  };
 }
   
*/  
//4.---------------------For Camper Sect-----------------------------------------  
 
 
 @Test (dataProvider= "Camperselectoptiondata")
  public void CamperTC(String ExpPrice,String ExpClaim,String ExpDis,String ExpCover,String type) throws InterruptedException 
  {
	     driver.findElement(By.id("nav_camper")).click();	
    	 vehicledata.make("Volvo");
    	 vehicledata.EnginePerformance("800");
    	 vehicledata.DateofManufacture("10/05/2024");
	     vehicledata.NumberofSeats("4");
	     vehicledata.RightHandDrive();
	     vehicledata.FuelType("Diesel");
	     vehicledata.Payload("500");
	     vehicledata.TotalWeight("2000");
	     vehicledata.ListPrice("20000");
	     vehicledata.LicensePlateNumber("MP09CQ5246");
	     vehicledata.AnnualMileage("700");  
	     vehicledata.NextButton();
//---------------------------------------------------------------------------	     
	     insurancedata.FirstName("Ritik");
	     insurancedata.LastName("Prajapati");
	     insurancedata.DateofBirth("10/14/2002");
	     insurancedata.Gender();
	     insurancedata.CountryName("India");
	     insurancedata.ZipCode("454001");
	     insurancedata.CityName("Dhar");
	     insurancedata.Occcupation("Employee");
	     insurancedata.Hobby();
	     insurancedata.NextButton();
  //-------------------------------------------
	     productdata.StartDate("06/20/2025");
	     productdata.InsuranceSum("5000000");
	     productdata.DamageInsurance("Partial Coverage");
	     productdata.OptionalProductMotor();
	     productdata.NextButton();
	//------------------------------------------------------     
	     priceoption.PriceOptionSelection(ExpPrice, ExpClaim, ExpDis, ExpCover,type)  ;   
	     priceoption.NextButton1();
//-------------------------------------------------------------     
	   
	     sendquote.Email("ritikprajapat8085@gmail.com");
	     sendquote.Phone("8085160805");
	     sendquote.Username("ritikprajapat");
	     sendquote.Password("Ritik@0786");
	     sendquote.ConfirmPassword("Ritik@0786");
	     sendquote.SendEmail();
	     sendquote.EmailText();
	     sendquote.EmailOk();
	     sendquote.Mainpage() ;
	    
//----------------------------------------------------    priceoption.PriceOptionSelection(ExpPrice, ExpClaim, ExpDis, ExpCover,type)  ;  
  } 
  
  @DataProvider
  public Object[][] Camperselectoptiondata()
  {
  	  return new Object[][]
  	  {
  		  {"249.00","No","No","No","Silver"},
  		  {"733.00","Submit","2","Limited","Gold"},
  		  {"1,439.00","Submit","5","Limited","Platinum"},
  		  {"2,742.00","Submit","10","Unlimited","Ultimate"},
  	  };
  }
 
 

 //--------------------------------------------------------------------------------
  @BeforeTest
  public void beforetest()
  {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://sampleapp.tricentis.com/101/index.php");
	 
	 vehicledata =    new  C01_EnterVehicleData (driver);
	 insurancedata =  new  C02_EnterInsurant_Data(driver);
	 productdata=     new  C03_EnterProductData(driver);              
	 priceoption=    new   C04_SelectPriceOption(driver);
	 sendquote  =    new   C05_SendQuote(driver);
	 
  }
  
 //--------------------------------------------------------------------
  @AfterTest
  public void aftertest()
  {
	 // driver.close();  
  }
//----------------------------------------------------------------------  
}
