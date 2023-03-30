package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidCredentialsTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Instantiate the driver		
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

	//Launch the browser
	WebDriver driver = new ChromeDriver();

	//launch application
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

	LoginPageOR obj = new LoginPageOR(driver);
	
	obj.typeUserName("satishgangwani19");
	obj.typePassword("Sati123$");
	obj.submitButton();


	}

}
