package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorDemo {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","F:\\Priyanka Jadhav\\Software testing\\Selenium\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
  //locators id
	WebElement FirstName = driver.findElement(By.id("firstName"));
	WebElement LastName = driver.findElement(By.id("lastName"));
	
  //locators basic xpath
        //syntax = //tagname[@attribute='value']	
	WebElement UserEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
	WebElement female = driver.findElement(By.id("gender-radio-2"));
	//WebElement male = driver.findElement(By.id("gender-radio-1"));
	WebElement UserMobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
	WebElement Subjects = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
	//WebElement selectEnglish = driver.findElement(By.className("css-12jo7m5"));
	
	WebElement Sports = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
	WebElement Reading = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
	WebElement Music = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
	WebElement currentAddress = driver.findElement(By.xpath("\\textarea[@class='form-control']"));
	
	FirstName.sendKeys("Priyanka");
	LastName.sendKeys("Deshmukh");
	UserEmail.sendKeys("priyanka.kj731@gmail.com");
	female.click();
	UserMobile.sendKeys("9011370202");
	Subjects.sendKeys("en");
	//selectEnglish.click();
	Sports.click();
	Reading.click();
	currentAddress.sendKeys("Beed");
	
	
	
	}

}
