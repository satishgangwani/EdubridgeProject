package eduSeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instantiate the driver		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//launch application
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		String textValue = driver.findElement(By.className("f22")).getText();
		
		System.out.println(textValue);

	}

}
