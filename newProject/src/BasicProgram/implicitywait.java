package BasicProgram;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitywait {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","F:\\Priyanka Jadhav\\Software testing\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
//implicit wait
driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
  
//Explicit wait  
WebDriverWait wait = new WebDriverWait(driver, 10);
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8830158607");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12334555");
driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
Thread.sleep(5000);

wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='lastname']"))).click();
driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Deshmukh");

	}

}
