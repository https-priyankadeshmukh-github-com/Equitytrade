package BasicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboarddemo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","F:\\Priyanka Jadhav\\Software testing\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/automation-practice-form");
driver.manage().window().maximize();

//Call Actions Class
Actions actions = new Actions(driver);
WebElement FirstName = driver.findElement(By.cssSelector("input[id='firstName']"));

//actions class key down and key up methods
actions.keyDown(FirstName, Keys.SHIFT);
actions.sendKeys("Priyanka");
actions.keyUp(Keys.SHIFT);
actions.build().perform();

driver.navigate().to("http://demoqa.com/text-box");
WebElement username = driver.findElement(By.cssSelector("input[id='userName']"));
WebElement email = driver.findElement(By.cssSelector("input[id='userEmail']"));
WebElement CurrentAddress = driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
WebElement PerAddress = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
WebElement SubmitBtn = driver.findElement(By.cssSelector("button[id='submit']"));



actions.keyDown(username, Keys.SHIFT).sendKeys("Priyanka Deshmukh").keyUp(Keys.SHIFT).build().perform();
actions.sendKeys(email, "priyanka.kj731@gmail.com").perform();
actions.sendKeys(CurrentAddress, "BEED Pin 431517").perform();
actions.keyDown(CurrentAddress, Keys.CONTROL).sendKeys("a").build().perform();

actions.keyUp(Keys.CONTROL).perform();
actions.keyDown(CurrentAddress, Keys.CONTROL).sendKeys("c").build().perform();
actions.keyUp(Keys.CONTROL).perform();
actions.sendKeys(Keys.TAB).perform();

actions.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
actions.keyUp(Keys.CONTROL).perform();
actions.sendKeys(Keys.TAB).perform();
actions.click(SubmitBtn).perform();




actions.sendKeys(Keys.TAB);
actions.build().perform();

actions.keyDown(Keys.CONTROL);
actions.sendKeys("v");
actions.keyUp(Keys.CONTROL);
actions.build().perform();
actions.sendKeys(Keys.TAB).perform();

actions.sendKeys(Keys.TAB).perform();
actions.click(SubmitBtn).perform();

driver.navigate().to("https://demoqa.com/buttons");
WebElement DoubleClickBtn = driver.findElement(By.cssSelector("button[id='doubleClickBtn')"));
WebElement RightClickBtn = driver.findElement(By.cssSelector("buttons[id='rightClickBtn']"));
WebElement DynamicClick = driver.findElement(By.xpath("//button[text()='click Me']"));

actions.doubleClick(DoubleClickBtn).perform();
actions.contextClick(RightClickBtn).perform();
actions.click(DynamicClick).perform();

driver.navigate().to("https://demoqa.com/droppable/");

WebElement source = driver.findElement(By.cssSelector("div[id='draggable']"));
WebElement target = driver.findElement(By.cssSelector("div[class='accept-drop-container']>div[id='droppable']"));

actions.dragAndDrop(source, target).build().perform();

driver.navigate().to("http;//www.demoqa.com/tool-tips/");

WebElement textbox = driver.findElement(By.cssSelector("class='btn btn-success')"));

WebElement Countrary = driver.findElement(By.xpath("//a[contains(text(),'Countrary)]"));

actions.moveToElement(textbox).perform();

WebElement tooltip = driver.findElement(By.cssSelector(".tooltip-inner"));

String tooltiptext = tooltip.getText();

System.out.println(tooltiptext);
Thread.sleep(1000);
actions.moveToElement(Countrary).perform();
Thread.sleep(1000);
WebElement tooltip1 = driver.findElement(By.xpath("//div[@id='countraryTexToolTip]//div[@class='"));

String tooltiptext1 = tooltip1.getText();

System.out.println(tooltiptext1);

driver.navigate().to("https://demoqa.com/text-box");



	}

}
