package CRMUtility;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

public class ScreenShot {
/*
        public WebDriver driver;
        public ScreenShot(WebDriver driver)
        {
            this.driver =driver ;
        }
        public   void getScreenshot() throws IOException
        {
            TakesScreenshot ts = (TakesScreenshot) driver ;
            File src = ts.getScreenshotAs(OutputType.FILE);
            File des =new File("C:\\Users\\Admin\\DevOps\\src\\test\\ScreenShots\\OHM.png");
            FileHandler.copy(src,des);
 */


    public static void getScreenshot(WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\Admin\\DevOps\\src\\test\\ScreenShots\\OHM.png");
        FileHandler.copy(src, des);

    }

}