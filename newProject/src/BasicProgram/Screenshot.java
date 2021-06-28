package BasicProgram;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Priyanka Jadhav\\Software testing\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		java.io.File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("F:\\Priyanka Jadhav\\Software testing\\Selenium\\abc.jpeg"));
		}
      public static String timestamp(){
    	  String timestamp = new SimpleDateFormat("yyyy_mm_dd__hh__mm__ss").format(new Date());
    	  return timestamp;
      }
      
      
      
}
