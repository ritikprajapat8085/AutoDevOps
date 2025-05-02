package VehicleInsurance_POM_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C04_SelectPriceOption 
{	
 WebDriver driver ;
 String  ActPrice  ,ActClaim ,ActDis,ActCover ;
     
   C04_SelectPriceOption (WebDriver driver)
     {
   	  this.driver = driver ;
     }
   
   
   
   public void PriceOptionSelection(String ExpPrice,String ExpClaim,String ExpDis,String ExpCover,String type)
   {
	       String  ActPrice  ,ActClaim ,ActDis,ActCover ;
       switch(type)
       {
         case "Silver":
	      ActPrice =  driver.findElement(By.id("selectsilver_price")).getText();
	      if( ActPrice.equals(ExpPrice)) { System.out.println("Price matching---- TC Passed"); }
	      else { System.out.println("Price not matching---TC Failed"); }
	      driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")).click();
	      System.out.println("Silver price selection completed");
	      break;
	      
           case "Gold":
   	      ActPrice =    driver.findElement(By.id("selectgold_price")).getText();
   	      
   	      if( ActPrice.equals(ExpPrice))
   	      { System.out.println("Price matching---- TC Passed"); 
   	      }
   	      else 
   	      { System.out.println("Price not matching---TC Failed");
   	      }
   	      driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")).click();
   	      System.out.println("Gold price selection completed");
   	      break;
   	      
   	   
         case "Platinum":
        	 ActPrice =     driver.findElement(By.id("selectplatinum_price")).getText();
   	      if( ActPrice.equals(ExpPrice)) { System.out.println("Price matching---- TC Passed"); }
   	      else { System.out.println("Price not matching---TC Failed"); }
   	        driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")).click();
   	     System.out.println("Platinum price selection completed");
   	      break;
   	      
   	      

         case "Ultimate":
          ActPrice =  driver.findElement(By.id("selectultimate_price")).getText();
   	      if( ActPrice.equals(ExpPrice)) 
   	      { System.out.println("Price matching---- TC Passed"); 
   	      }
   
   	      else
   	      { System.out.println("Price not matching---TC Failed");
   	      }
   	      driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")).click();
   	       System.out.println("Ultimate price selection completed");
   	      break;
       }
   	      
     }  
	          
	   
       public void NextButton1() 
       {
       driver.findElement(By.id("nextsendquote")).click();
       }
       
   }
	
   /*
    public  void SilverOption()
    {
          String  ExpPrice = "262.00", ExpClaim  = "No", ExpDis="No",ExpCover="No";
         String  ActPrice  ,ActClaim ,ActDis,ActCover ;
            
    	ActPrice =     driver.findElement(By.id("selectsilver_price")).getText();
    	ActClaim	=  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[2]/td[2]")).getText();
    	ActDis=        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[3]/td[2]")).getText();
    	ActCover  =    driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[2]")).getText();
    	              
  
    
          if( ActPrice.equals(ExpPrice)) { System.out.println("Price matching---- TC Passed"); }
             else { System.out.println("Price not matching---TC Failed"); }
         
         if( ActClaim.equals(ExpClaim)) { System.out.println("Claim matching----TC Passed"); }
            else { System.out.println("Claim not matching---TC Failed"); }
         
         if( ActDis.equals(ExpDis)) { System.out.println("Discout  matching----TC Passed"); }
            else { System.out.println("Discount not matching---TC Failed"); }
         
         if( ActCover.equals(ExpCover)) { System.out.println("Cover matching----TC Passed"); }
           else { System.out.println("Cover not matching---TC Failed"); }
         
          driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")).click();
    	  driver.findElement(By.id("nextsendquote")).click();
    
    }
    
    
    
    public  void GoldOption()
    {
    	ActPrice =     driver.findElement(By.id("selectgold_price")).getText();
    	ActClaim	=  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[2]/td[3]")).getText();
    	ActDis=        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[3]/td[3]")).getText();
    	ActCover  =    driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[3]")).getText();
                       driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/spann")).click();
    	               driver.findElement(By.id("nextsendquote")).click();
    }
    
   
    public  void PlatinumOption()
    {
    	ActPrice =     driver.findElement(By.id("selectplatinum_price")).getText();
    	ActClaim	=  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[2]/td[4]")).getText();
    	ActDis=        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[3]/td[4]")).getText();
    	ActCover  =    driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[4]")).getText();
                   	   driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/spann")).click();
    	               driver.findElement(By.id("nextsendquote")).click();
    }
    
    
    public  void UltimateOption()
    {
    	ActPrice =     driver.findElement(By.id("selectultimate_price")).getText();
    	ActClaim	=  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[2]/td[5]")).getText();
    	ActDis=        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[3]/td[5]")).getText();
    	ActCover  =    driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[5]")).getText();
    	               driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/spann")).click();
    	               driver.findElement(By.id("nextsendquote")).click();
    }
    
  */
   
   
    /*
       -------------------Silver Price Selection----------------
    public void PriceperYear()
    {
        ActPrice = driver.findElement(By.id("selectsilver_price")).getText();
    }
    
    public void OnlineClaim()
    {
    	ActClaim	= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[2]/td[2]")).getText();
    }
    
    public void ClaimsDiscoun()
    {
    	ActDis= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[3]/td[2]")).getText();
    }
    
    public void WorldwideCover()
    {
    	ActCover  = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[2]")).getText();
    }
    public void SelectOption()
    {
    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span")).click();
    }
    
    public void NextButton() 
    {
    driver.findElement(By.id("nextsendquote")).click();
    }
    
    */
    
    

