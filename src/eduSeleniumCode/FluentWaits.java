package eduSeleniumCode;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;



public class FluentWaits {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");
		
		WebDriver driver;
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("satishgangwani19");
		
		driver.findElement(By.name("passwd")).sendKeys("Sati1234$");
		
		//Fluent wait is similar to webdriver wait / explicit wait with more flexibility in polling and ignoring exceptions 
		//Fluent wait declaration
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		
		//usage of Fluent wait
		WebElement singInButton = wait.until(new Function<WebDriver, WebElement>(){
		public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.className("signinbtn"));
			}
		});
		
		singInButton.click();
		
		
		
	}


}
