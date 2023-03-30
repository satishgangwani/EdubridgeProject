package eduSeleniumCode;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Instantiate the driver		
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

	//Launch the browser
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.amazon.in/"); 
	
	List<WebElement> listOfFrame = driver.findElements(By.tagName("iframe"));
	
	System.out.println(listOfFrame.size());
	
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[height = '250px'][width = '300px']")));
	
	driver.findElement(By.xpath("//a[@target = '_top']/child::img[@alt = 'Laptops']")).click();
	
	//Switch back to the main window 
	//driver.switchTo().defaultContent();
	

	}

}
