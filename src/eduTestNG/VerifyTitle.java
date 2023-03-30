package eduTestNG;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	@BeforeTest
	public void initialization()
	{
		System.out.println("Initialization in progress");
	}
	
	@AfterTest
	public void closingAll()
	{
		System.out.println("Everything is closed");
	}
	
	@Test
	public void verifyGoogleTitle()
	{
		//Instantiate the driver		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//launch application
		driver.get("https://www.google.com");
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Google";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("Verification of google title is done");
		
	}
	
	
	
	

}
