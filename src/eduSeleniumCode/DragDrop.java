package eduSeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Instantiate the driver		
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

	//Launch the browser
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.amazon.in/");
		
		
		WebElement element = driver.findElement(By.cssSelector("span[class='nav-line-2 ']")); 
		Actions action = new Actions(driver); 
		action.moveToElement(element).build().perform(); 
		driver.findElement(By.linkText("Start here.")).click();
	}

}
