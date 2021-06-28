package BasicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","F:\\Priyanka Jadhav\\Software testing\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/browser-windows");
driver.manage().window().maximize();






	}

}
