package BasicProgram;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nakariwindoedemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\Priyanka Jadhav\\Software testing\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String MainWindow = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> i1 = s1.iterator();
		
  while(i1.hasNext())   {
	  String ChildWindow = (String) i1.next();
	  if(!MainWindow.equalsIgnoreCase(ChildWindow))  {
		driver.switchTo().window(ChildWindow);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
		driver.close();
		 }
  }
	  driver.switchTo().window(MainWindow);
	 driver.close();
 
	}

}
