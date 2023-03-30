package eduSeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instantiate the driver		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//launch application
		driver.get("https://www.google.com/");
		
		String height = driver.findElement(By.className("lnXdpd")).getAttribute("height");
		System.out.println(height);
	}

}
