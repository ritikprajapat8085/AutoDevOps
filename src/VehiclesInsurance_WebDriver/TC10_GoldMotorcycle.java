package VehiclesInsurance_WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC10_GoldMotorcycle 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
    	  driver.manage().window().maximize();
      	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      	  driver.get("https://sampleapp.tricentis.com/101/index.php");
     
      	 //3.Part: ----------- locate Motorcycle Section------------------- 	  
      	  
      	  driver.findElement(By.id("nav_motorcycle")).click();	
      	  
//Module-A :-----------------------------Enter Vehicle Data-------------------------------------
      
        // 1: locate make control 
          WebElement make = driver.findElement(By.id("make"));	  
       	  Select s = new Select(make);
          s.selectByVisibleText("BMW");     
          
          // 2: Locate model
          new Select( driver.findElement(By.id("model"))).selectByValue("Motorcycle");
          
          // 3: Cylinder Performace 
          driver.findElement(By.id("cylindercapacity")).sendKeys("1000");	 
           
          // 4: engine  Performace 
          driver.findElement(By.id("engineperformance")).sendKeys("1000");	 
          
          // 5: Locate Date of manufacture
          driver.findElement(By.id("dateofmanufacture")).sendKeys("10/05/2024");	 
          
         // 6: Locate number of seats
          new Select( driver.findElement(By.id("numberofseatsmotorcycle"))).selectByValue("1");
          
       
          // 7: Locate list price
          driver.findElement(By.id("listprice")).sendKeys("20000");
          
          // 8: locate annual mileage
          driver.findElement(By.id("annualmileage")).sendKeys("10000");
           
          // 9 . locate :next  and click  on it 
           driver.findElement(By.id("nextenterinsurantdata")).click();
           
           
 //Module-B :-------------------------------Enter Insurance Data--------------------------------------
           
           // 1: locate first name 
           driver.findElement(By.id("firstname")).sendKeys("Ritik");
           
           
           // 2: locate  Last name
           driver.findElement(By.id("lastname")).sendKeys("Prajapati");
           
           // 3: Locate Date of  birth
           driver.findElement(By.id("birthdate")).sendKeys("10/14/2002");	 
           
           //4. Locate gender 
           driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")).click();
          
           //5. Locate  country
           new Select(driver.findElement(By.id("country"))).selectByVisibleText("India");
           
           // 6.Locate Zip Code 
           driver.findElement(By.id("zipcode")).sendKeys("454001");	 
           
           //7. Locate  country
           driver.findElement(By.id("city")).sendKeys("Dhar");
           
           //8. Locate  occupation
           new Select(driver.findElement(By.id("occupation"))).selectByVisibleText("Employee");
           
           //9. Locate hobby
           driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")).click(); 
           
           // NOTE: WEBSITE & UPLOAD PICTURE CONTROL ARE OPTIONAL
           
           //10.Locate next button & click on it 
          driver.findElement(By.id("nextenterproductdata")).click();
          
          
//Module-C :-------------------------------Enter Product  Data--------------------------------------   
          
                //1. Find the Start date control
              driver.findElement(By.id("startdate")).sendKeys("06/20/2025");
          
              //2. Find insurance sum$
              new Select(driver.findElement(By.id("insurancesum"))).selectByValue("5000000");
          
          
          
             // 3. Find damage insurance 
             new Select(driver.findElement(By.id("damageinsurance"))).selectByValue("Partial Coverage");
          
             // 4.  find optional product & click   
             driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span")).click();
        
             //5.Locate next button & click on it 
            driver.findElement(By.id("nextselectpriceoption")).click();
            
 
            
//Module-D :-------------------------------Select Price option: Silver Plan Selection --------------------------------------   
                                
         String  ExpPrice = "754.00", ExpClaim  = "Submit", ExpDis="2",ExpCover="Limited";
         String  ActPrice  ,ActClaim ,ActDis,ActCover ;
            
         
         ActPrice =  driver.findElement(By.id("selectgold_price")).getText();
         ActClaim =  driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[3]")).getText();
         ActDis =    driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[3]")).getText();
         ActCover =  driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[3]")).getText();
         
         
         System.out.println("Checking  for Motorcycle Insurance :----TC10_Gold Values----") ;
         
         if( ActPrice.equals(ExpPrice)) { System.out.println("Price matching---- TC Passed"); }
             else { System.out.println("Price not matching---TC Failed"); }
         
         if( ActClaim.equals(ExpClaim)) { System.out.println("Claim matching----TC Passed"); }
            else { System.out.println("Claim not matching---TC Failed"); }
         
         if( ActDis.equals(ExpDis)) { System.out.println("Discout  matching----TC Passed"); }
            else { System.out.println("Discount not matching---TC Failed"); }
         
         if( ActCover.equals(ExpCover)) { System.out.println("Cover matching----TC Passed"); }
           else { System.out.println("Cover not matching---TC Failed"); }
         
         
         driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")).click();
         
       //.Locate next button & click on it 
         driver.findElement(By.id("nextsendquote")).click();
         
         
//Module:E :-------------------------------Send Quote--------------------------------------           
         
       //1. Find  E-mail id control 
         driver.findElement(By.id("email")).sendKeys("ritikprajapat8085@gmail.com");	 
         
       //2. Find phone  control 
         driver.findElement(By.id("phone")).sendKeys("8085160805");	 
         
       //3. Find  username control 
         driver.findElement(By.id("username")).sendKeys("ritikprajapat");	 
         
       //4. Find  password control 
         driver.findElement(By.id("password")).sendKeys("Ritik@0786");
         
       //5. Find  confirm password control 
         driver.findElement(By.id("confirmpassword")).sendKeys("Ritik@0786");	 
         
         //6.Locate send button & click on it to send email 
         driver.findElement(By.id("sendemail")).click();  // email has been sent 
         
         
         
         // To print the confirmation message 
         String text =driver.findElement(By.xpath("/html/body/div[4]/h2")).getText();
         System.out.println(" Sending email message :"+text);
         
         // to click on ok of message 
         driver.findElement(By.className("confirm")).click(); 
         
         
         // locate the  Main page and click on it 
         driver.findElement(By.xpath("//*[@id=\"backmain\"]/span/i")).click();
         
         System.out.println();
         System.out.println("---Motorcycle : TC10_Gold Has completed--- ");

	}
} 
