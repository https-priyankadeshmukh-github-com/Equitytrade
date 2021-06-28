package BasicProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {
public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","F:\\Priyanka Jadhav\\Software testing\\Selenium\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
			
 //locator css selector using id(#)
	WebElement FirstName = driver.findElement(By.cssSelector("input#firstName"));
	WebElement LastName = driver.findElement(By.cssSelector("#lastName"));
    FirstName.sendKeys("Priyanka");
	LastName.sendKeys("Deshmukh");
	
//locator css selector using attribute(tagname[attribute='value'])
	WebElement userEmail = driver.findElement(By.cssSelector("input[id='userEmail']"));
	userEmail.sendKeys("priyanka.kj731@gmail.com");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement female = driver.findElement(By.cssSelector("input[value='Female']"));
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();", female);
	
//locators css selector tagname.classname[attribute='value']
	WebElement userMobile = driver.findElement(By.cssSelector("input.mr-sm-2.form-control[placeholder='Mobile Number']"));
	userMobile.sendKeys("9011370202");
	
//locator css selector using classname(.)	
	WebElement CurrentAddress = driver.findElement(By.cssSelector("textarea.form-control"));
	CurrentAddress.sendKeys("Beed");
		
//locator css selector using parent child	
	
	
	
	}

}
