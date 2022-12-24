package eduSeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenCloseBroser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Instantiate the driver		
System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

//Launch the browser
WebDriver driver = new ChromeDriver();

//launch application
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

driver.findElement(By.xpath("//input[@type= 'text']")).sendKeys("satishgangwani19");



/*
driver.findElement(By.id("login1")).sendKeys("satishgangwani19");

driver.findElement(By.name("passwd")).sendKeys("Sati1234$");

driver.findElement(By.className("signinbtn")).click();

driver.findElement(By.tagName("input")).sendKeys("sdfsd");
*/

		
	}

}
