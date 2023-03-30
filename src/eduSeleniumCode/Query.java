package eduSeleniumCode;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Query {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Instantiate the driver		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		driver.get("https://selenium-apps.doselect.in/simple-popup");
		driver.findElement(By.xpath("//a[@class='cd-popup-trigger']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class = 'cd-popup-close img-replace']")).click();
		
	}

}
