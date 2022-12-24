package eduTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@DataProvider
	public Object[][] getLoginData()
	{
		String arr[][] = new String[3][2];
		
		arr[0][0] = "satishgangwani19";
		arr[0][1] = "Sati1234$";
			
		arr[1][0] = "satishgangwani19";
		arr[1][1] = "Sati1234";
		
		arr[2][0] = "satishskjb";
		arr[2][1] = "Sati1234$";
		
		return arr;
	}
	
	
	@Test(dataProvider = "getLoginData")
	public void verifyLogin(String username, String password)
	{
		
		//Instantiate the driver		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//launch application
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.className("signinbtn")).click();
		
		driver.close();
		
	}

}
