package eduSeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Instantiate the driver		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//launch application
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement radioButton = driver.findElement(By.cssSelector("input[value = 'f']"));
		
		Thread.sleep(3000);
		
		boolean flag = radioButton.isSelected();
		
		System.out.println(flag);
		
		if(flag == false)
		{
			radioButton.click();
		}
		
	}

}
