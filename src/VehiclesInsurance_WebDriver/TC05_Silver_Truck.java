package VehiclesInsurance_WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC05_Silver_Truck {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
    	  driver.manage().window().maximize();
      	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      	  driver.get("https://sampleapp.tricentis.com/101/index.php");
     
      	 //2.Part: ----------- locate Truck Section------------------- 	  
      	  
      	  driver.findElement(By.id("nav_truck")).click();	
      	  
//Module-A :-----------------------------Enter Vehicle Data-------------------------------------
      
        // 1: locate make control 
          WebElement make = driver.findElement(By.id("make"));	  
       	  Select s = new Select(make);
          s.selectByVisibleText("Ford");           // select Audi using select class 
          
          // 2: Locate Engine Performace 
          driver.findElement(By.id("engineperformance")).sendKeys("800");	 
          
          // 3: Locate Date of manufacture
          driver.findElement(By.id("dateofmanufacture")).sendKeys("10/05/2024");	 
          
         // 4: Locate number of seats
          new Select( driver.findElement(By.id("numberofseats"))).selectByValue("2");
          
         // 5: Locate fuel type
          new Select(driver.findElement(By.id("fuel"))).selectByVisibleText("Diesel");
          
          // 6: Locate Payload(kg)
          driver.findElement(By.id("payload")).sendKeys("500");	 
          
          // 7: Locate  total weight(kg)
          driver.findElement(By.id("totalweight")).sendKeys("5000");	 
        
          // 8: Locate list price
          driver.findElement(By.id("listprice")).sendKeys("20000");
          
          // 8 : locate liences plat number
          driver.findElement(By.id("licenseplatenumber")).sendKeys("MP09HH6439");
          
          
          // 8: locate annual mileage
          driver.findElement(By.id("annualmileage")).sendKeys("700");
           
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
             new Select(driver.findElement(By.id("damageinsurance"))).selectByValue("Full Coverage");
          
             // 4.  find optional product & click   
             driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]/span")).click();
        
             //5.Locate next button & click on it 
            driver.findElement(By.id("nextselectpriceoption")).click();
            
 
            
//Module-D :-------------------------------Select Price option: Silver Plan Selection --------------------------------------   
                                
         String  ExpPrice = "263.00", ExpClaim  = "No", ExpDis="No",ExpCover="No";
         String  ActPrice  ,ActClaim ,ActDis,ActCover ;
            
         
         ActPrice =  driver.findElement(By.id("selectsilver_price")).getText();
         ActClaim =  driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[2]")).getText();
         ActDis =    driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[2]")).getText();
         ActCover =  driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[2]")).getText();
         
         
         System.out.println("Checking  for Truck Insurance :----TC05_Silver Values----") ;
         
         if( ActPrice.equals(ExpPrice)) { System.out.println("Price matching---- TC Passed"); }
             else { System.out.println("Price not matching---TC Failed"); }
         
         if( ActClaim.equals(ExpClaim)) { System.out.println("Claim matching----TC Passed"); }
            else { System.out.println("Claim not matching---TC Failed"); }
         
         if( ActDis.equals(ExpDis)) { System.out.println("Discout  matching----TC Passed"); }
            else { System.out.println("Discount not matching---TC Failed"); }
         
         if( ActCover.equals(ExpCover)) { System.out.println("Cover matching----TC Passed"); }
           else { System.out.println("Cover not matching---TC Failed"); }
         
         
         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span")).click();
         
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
         System.out.println("---Truck : TC01_Silver  Has completed--- ");

	}

}
