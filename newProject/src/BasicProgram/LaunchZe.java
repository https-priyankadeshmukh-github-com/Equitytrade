package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchZe {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","F:\\Priyanka Jadhav\\Software testing\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://kite.zerodha.com/");
driver.manage().window().maximize();

WebElement KiteLogo = driver.findElement(By.xpath("//*[@id='container']/header/a/img"));
Boolean Logo = KiteLogo.isDisplayed();

String KiteHeading = driver.findElement(By.xpath("//*[@id='container']/div/div/div/form/div[1]/h2")).getText();
System.out.println(KiteHeading);
System.out.println(Logo);

WebElement username = driver.findElement(By.xpath("//*[@id='userid']"));
username.sendKeys("XA0634");

WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
password.sendKeys("1234567");

WebElement loginBtn = driver.findElement(By.xpath("//*[@id='container']/div/div/div/form/div[4]/button"));
loginBtn.click();

WebElement ForgotPasslink = driver.findElement(By.xpath("//*[@id='container']/div/div/div/form/p/a"));
ForgotPasslink.click();
//to see website
System.out.println(driver.getCurrentUrl());
}
}
