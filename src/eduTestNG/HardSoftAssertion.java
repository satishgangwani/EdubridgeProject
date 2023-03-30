package eduTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoftAssertion {

	SoftAssert obj = new SoftAssert();
	
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
		
		String expectedTitle = "Googl";
		
		obj.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("Verification of google title is done");
		
		obj.assertAll();
	}
}
