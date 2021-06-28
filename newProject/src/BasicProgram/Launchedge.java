package BasicProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launchedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","F:\\Priyanka Jadhav\\Software testing\\Selenium\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.get("http:\\www.google.com");


	}

}
