package eduSeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplictWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");
		
		WebDriver driver;
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.yahoo.com");
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("satishgangwani19");
		
		driver.findElement(By.name("passwd")).sendKeys("Sati1234$");
		
		driver.findElement(By.className("signinbtn")).click();
		
		//driver.findElement(By.linkText("Skip,Go to Inbox")).click();
		
		
		
		
		
		
	}

}
