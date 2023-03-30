package eduTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle1 {

	
	@Test
	public void verifyRediffTitle()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//launch application
		driver.get("https://www.rediff.com/");
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("Verification of Rediff title is done");
		
		
		
	}
}
