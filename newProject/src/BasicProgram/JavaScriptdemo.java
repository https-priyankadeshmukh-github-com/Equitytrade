package BasicProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Priyanka Jadhav\\Software testing\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Java Script Executor call into script
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//use the method executescript
		WebElement username = null;
		username = (WebElement) js.executeScript("return document.getElementById('email');", username);
		
		js.executeScript("document.getElementById('email').style.borderColor = 'Red'");
		js.executeScript("document.getElementById('pass').value='priyanka.kj731@gmail.com'");
		
		username.sendKeys("priyanka.kj731@gmail.com");
		
		WebElement password = null;
		password = (WebElement) js.executeScript("return document.getElementById('pass')", password);
		
		//against sendkeys use method
		js.executeScript("document.getElementById('pass').value='123456'");
		
		//getting attribute
		String className = (String) js.executeScript("return document.getElementById('pass').getAttribute('data-testid');");
		System.out.println(className);
	
		//sending custom alert message
		js.executeScript("alert('hello world');");
		Thread.sleep(2000);
		
		//handle the alert
		driver.switchTo().alert().accept();
	    //password.sendKeys("123456");
		
		//click
		WebElement loginBtn = driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		js.executeScript("arguments[0].click();", loginBtn);
	    
		//refresh the browser
		js.executeScript("history.go(0)");
		
		//final String script  = 	"return arguments[0].getAttribute('innerHTML')";
		WebElement messanger = driver.findElement(By.xpath("//a[@href='https://messenger.com/']"));
		String value = (String) js.executeScript("return document.documentElement.innerText", messanger);
		System.out.println(value);	
		
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		System.out.println(driver.getTitle());
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);
		System.out.println(driver.getCurrentUrl());
	
		//scroll  
		       //1
	        // js.executeScript("window.scrollBy(0,150)");
		      // OR  2
	    	WebElement element = driver.findElement(By.xpath("//span[contains(text(),' Facebook © 2021')]"));
	       // js.executeScript("arguments[0].scrollIntoView(true);", element);
		      //OR  3
		    Actions action = new Actions(driver);
		    action.moveToElement(element).perform();
		
	}

}
