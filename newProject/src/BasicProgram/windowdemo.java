package BasicProgram;


import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Priyanka Jadhav\\Software testing\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//String MainWindow = driver.getWindowHandle();
		
		WebElement Clickhere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		
		Clickhere.click();
		
		
	
	}

}


