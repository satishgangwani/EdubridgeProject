package eduSeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		//Instantiate the driver		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_1\\Chrome driver\\chromedriver.exe");

		//Launch the browser
		WebDriver driver = new ChromeDriver();

		//launch application
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement checkbox = driver.findElement(By.className("nomargin"));
		
		boolean flag = checkbox.isSelected();
		
		Thread.sleep(2000);
		
		System.out.println(flag);
		
		if(flag == false)
		{
			checkbox.click();
		}

		
		
	}

}
