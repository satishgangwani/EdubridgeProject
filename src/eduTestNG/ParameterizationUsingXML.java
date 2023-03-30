package eduTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationUsingXML {

		WebDriver driver;
		
		@BeforeClass
		@Parameters({"browser","url"})
		void setUp(String browser, String app)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");		
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);	
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");		
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new FirefoxDriver(options);	
			}
			
			driver.get(app);		
		}
		
		@Test
		void checkBoxTest()
		{
			boolean checkBoxStatus = driver.findElement(By.id("remember")).isDisplayed();
			Assert.assertTrue(checkBoxStatus);
		}
		
		@Test
		void homePageTitle()
		{
			String title = driver.getTitle();
			String expectedTitle = "Rediffmail";
			Assert.assertEquals(title, expectedTitle);
		}

		@AfterClass
		void tearDown()
		{
			driver.close();
		}
		
}
