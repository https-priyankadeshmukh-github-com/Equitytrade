package BasicProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","F:\\Priyanka Jadhav\\Software testing\\Selenium\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
	driver.get("http:\\kite.zerodha.com");
	driver.manage().window().maximize();
	
	  //locator id
	WebElement username = driver.findElement(By.id("userid"));
	WebElement password = driver.findElement(By.id("password"));
	
	//locator classname
	WebElement LoginBTN = driver.findElement(By.className("button-orange"));
	username.sendKeys("XA0634");
	password.sendKeys("123456");
	LoginBTN.click();
	
	driver.get("http://www.facebook.com/");
	WebElement userName = driver.findElement(By.id("email"));
	WebElement passWord = driver.findElement(By.id("pass"));
	
	
	  //locator name
	WebElement LoginBtn = driver.findElement(By.name("login"));
	userName.sendKeys("9011370202");
	passWord.sendKeys("12345678");
	LoginBtn.click();
	
  Thread.sleep(3000);
	
	
	}

}
