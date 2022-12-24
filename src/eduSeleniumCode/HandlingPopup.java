package eduSeleniumCode;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Instantiate the driver		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//launch application
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.cssSelector("input[name ^= name]")).sendKeys("12345");
		
		driver.findElement(By.id("Register")).click();
		
		Alert popup = driver.switchTo().alert();
		
		String errmsg = popup.getText();
		
		System.out.println(errmsg);
		
		Thread.sleep(2000);
		
		popup.accept();
		
		
	}

}
