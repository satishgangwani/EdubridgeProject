package eduSeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Instantiate the driver		
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

	//Launch the browser
	WebDriver driver;
	
	ChromeOptions options = new ChromeOptions();
	
	options.addArguments("--remote-allow-origins=*");

	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/droppable");
	
	WebElement from = driver.findElement(By.id("draggable"));
	WebElement to = driver.findElement(By.id("droppable"));
	Actions action = new Actions(driver);
	Action dragAndDrop = action.clickAndHold(from).moveToElement(to).build();
	dragAndDrop.perform(); 
	
	}

}
