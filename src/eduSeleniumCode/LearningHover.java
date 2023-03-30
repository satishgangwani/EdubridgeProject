package eduSeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class LearningHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//Instantiate the driver		
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

	//Launch the browser
	WebDriver driver;
	
	ChromeOptions options = new ChromeOptions();
	
	options.addArguments("--remote-allow-origins=*");

	driver = new ChromeDriver(options);

	//launch application
	driver.get("https://www.amazon.in/");
	
	WebElement accountList = driver.findElement(By.cssSelector("span[class='nav-line-2 ']"));
	
	System.out.println("Element Located");
	
	Actions obj = new Actions(driver);
	
	Thread.sleep(2000);
	
	obj.moveToElement(accountList).build().perform();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Start here.")).click();
	
	
	
	
		
	}

}
